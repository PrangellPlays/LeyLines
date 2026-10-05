package dev.lumi.leylines.cca;

import dev.lumi.leylines.LeyLines;
import dev.lumi.leylines.character.CharacterSkinDefinition;
import dev.lumi.leylines.character.LeyLinesCharacterSkinRegistry;
import dev.lumi.leylines.character.LeylinesCharacterRegistry;
import dev.lumi.leylines.index.LeyLinesComponents;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import org.ladysnake.cca.api.v3.component.Component;
import org.ladysnake.cca.api.v3.component.sync.AutoSyncedComponent;

import java.util.HashMap;
import java.util.Map;

public class PlayerCharacterComponent implements Component, AutoSyncedComponent {
    private final PlayerEntity player;
    private Identifier activeCharacter = LeyLines.id("none");
    private final Map<Identifier, Identifier> equippedSkins = new HashMap<>();

    private final Map<Identifier, CharacterProgress> characterProgress = new HashMap<>();

    public PlayerCharacterComponent(PlayerEntity player) {
        this.player = player;
    }

    public Identifier getActiveCharacter() {
        return activeCharacter;
    }

    public void setActiveCharacter(Identifier activeCharacter) {
        this.activeCharacter = activeCharacter;

        LeyLinesComponents.CHARACTER.sync(player);
    }

    public Identifier getEquippedSkin(Identifier character) {
        return equippedSkins.getOrDefault(character, LeylinesCharacterRegistry.get(character).defaultSkin());
    }

    public void setEquippedSkin(Identifier character, Identifier skin) {
        CharacterSkinDefinition definition = LeyLinesCharacterSkinRegistry.get(skin);
        if (definition == null) {
            return;
        }

        if (!definition.character().equals(character)) {
            return;
        }

        equippedSkins.put(character, skin);
        LeyLinesComponents.CHARACTER.sync(player);
    }

    public boolean hasSkinEquipped(Identifier character, Identifier skin) {
        return getEquippedSkin(character).equals(skin);
    }

    public CharacterProgress getCharacterProgress(Identifier character) {
        return characterProgress.computeIfAbsent(character, id -> new CharacterProgress());
    }

    public LevelData getCharacterLevel(Identifier character) {
        return getCharacterProgress(character).getLevel();
    }

    public int getCharacterLevelNumber(Identifier character) {
        return getCharacterProgress(character).getLevelNumber();
    }

    public int getCharacterEXP(Identifier character) {
        return getCharacterProgress(character).getExperience();
    }

    public int getCharacterEXPToNextLevel(Identifier character) {
        return getCharacterProgress(character).getExperienceToNextLevel();
    }

    public boolean canGainCharacterEXP(Identifier character) {
        return getCharacterProgress(character).canGainEXP();
    }

    public boolean requiresAscension(Identifier character) {
        return getCharacterProgress(character).requiresAscension();
    }

    public boolean isMaxCharacterLevel(Identifier character) {
        return getCharacterProgress(character).isMaxLevel();
    }

    public void addCharacterEXP(Identifier character, int amount) {
        if (amount <= 0) {
            return;
        }

        CharacterProgress progress = getCharacterProgress(character);
        if (!progress.canGainEXP()) {
            return;
        }

        progress.addExperience(amount);
        LeyLinesComponents.CHARACTER.sync(player);
    }

    public void ascendCharacter(Identifier character) {
        CharacterProgress progress = getCharacterProgress(character);
        if (!progress.ascend()) {
            return;
        }

        LeyLinesComponents.CHARACTER.sync(player);
    }

    public void unlockCharacter(Identifier character) {
        if (characterProgress.containsKey(character)) {
            return;
        }

        if (LeylinesCharacterRegistry.get(character) == null) {
            return;
        }

        characterProgress.put(character, new CharacterProgress());
        LeyLinesComponents.CHARACTER.sync(player);
    }

    public boolean ownsCharacter(Identifier character) {
        return characterProgress.containsKey(character);
    }

    @Override
    public void readFromNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        activeCharacter = Identifier.of(tag.getString("ActiveCharacter"));

        equippedSkins.clear();
        NbtCompound skinsTag = tag.getCompound("EquippedSkins");
        for (String key : skinsTag.getKeys()) {
            equippedSkins.put(Identifier.of(key), Identifier.of(skinsTag.getString(key)));
        }

        characterProgress.clear();
        NbtCompound progressTag = tag.getCompound("CharacterProgress");
        for (String key : progressTag.getKeys()) {
            Identifier character = Identifier.of(key);
            NbtCompound characterTag = progressTag.getCompound(key);
            LevelData level = LevelData.byLevel(characterTag.getInt("Level"));
            int experience = characterTag.getInt("EXP");
            characterProgress.put(character, new CharacterProgress(level, experience));
        }
    }

    @Override
    public void writeToNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        tag.putString("ActiveCharacter", activeCharacter.toString());

        NbtCompound skinsTag = new NbtCompound();
        for (var entry : equippedSkins.entrySet()) {
            skinsTag.putString(entry.getKey().toString(), entry.getValue().toString());
        }

        tag.put("EquippedSkins", skinsTag);

        NbtCompound progressTag = new NbtCompound();
        for (var entry : characterProgress.entrySet()) {
            Identifier character = entry.getKey();
            CharacterProgress progress = entry.getValue();
            NbtCompound characterTag = new NbtCompound();

            characterTag.putInt("Level", progress.getLevelNumber());
            characterTag.putInt("EXP", progress.getExperience());
            progressTag.put(character.toString(), characterTag);
        }

        tag.put("CharacterProgress", progressTag);
    }

    public static class CharacterProgress {

        private LevelData level;
        private int experience;

        public CharacterProgress() {
            this(LevelData.L1, 0);
        }

        public CharacterProgress(LevelData level, int experience) {
            this.level = level;
            this.experience = experience;
        }

        public LevelData getLevel() {
            return level;
        }

        public int getLevelNumber() {
            return level.getCharacterLevel();
        }

        public int getExperience() {
            return experience;
        }

        public int getExperienceToNextLevel() {
            return level.getEXPToNextLevel();
        }

        public boolean canGainEXP() {
            return level.canGainEXP();
        }

        public boolean requiresAscension() {
            return level.requiresAscensionItem();
        }

        public boolean isMaxLevel() {
            return level.isMaxCharacterLevel();
        }

        private void addExperience(int amount) {
            experience += amount;

            while (level.canGainEXP()) {
                int requiredEXP = level.getEXPToNextLevel();

                if (requiredEXP <= 0 || experience < requiredEXP) {
                    break;
                }

                experience -= requiredEXP;
                level = level.next();

                /*
                 * Stop at Level 90.
                 *
                 * The character must use an ascension item
                 * before progressing to Level 95.
                 */
                if (level.requiresAscensionItem()) {
                    experience = 0;
                    break;
                }
            }
        }

        private boolean ascend() {
            if (!level.requiresAscensionItem()) {
                return false;
            }

            if (level.isMaxCharacterLevel()) {
                return false;
            }

            level = level.next();
            experience = 0;

            return true;
        }
    }

    public enum LevelData {
        L1(1),
        L2(2),
        L3(3),
        L4(4),
        L5(5),
        L6(6),
        L7(7),
        L8(8),
        L9(9),
        L10(10),
        L11(11),
        L12(12),
        L13(13),
        L14(14),
        L15(15),
        L16(16),
        L17(17),
        L18(18),
        L19(19),
        L20(20),
        L21(21),
        L22(22),
        L23(23),
        L24(24),
        L25(25),
        L26(26),
        L27(27),
        L28(28),
        L29(29),
        L30(30),
        L31(31),
        L32(32),
        L33(33),
        L34(34),
        L35(35),
        L36(36),
        L37(37),
        L38(38),
        L39(39),
        L40(40),
        L41(41),
        L42(42),
        L43(43),
        L44(44),
        L45(45),
        L46(46),
        L47(47),
        L48(48),
        L49(49),
        L50(50),
        L51(51),
        L52(52),
        L53(53),
        L54(54),
        L55(55),
        L56(56),
        L57(57),
        L58(58),
        L59(59),
        L60(60),
        L61(61),
        L62(62),
        L63(63),
        L64(64),
        L65(65),
        L66(66),
        L67(67),
        L68(68),
        L69(69),
        L70(70),
        L71(71),
        L72(72),
        L73(73),
        L74(74),
        L75(75),
        L76(76),
        L77(77),
        L78(78),
        L79(79),
        L80(80),
        L81(81),
        L82(82),
        L83(83),
        L84(84),
        L85(85),
        L86(86),
        L87(87),
        L88(88),
        L89(89),
        L90(90),
        L95(95),
        L100(100);

        private final int characterLevel;

        LevelData(int characterLevel) {
            this.characterLevel = characterLevel;
        }

        public int getCharacterLevel() {
            return characterLevel;
        }

        public static LevelData byLevel(int characterLevel) {
            for (LevelData data : values()) {
                if (data.characterLevel == characterLevel) {
                    return data;
                }
            }

            return L1;
        }

        public boolean isMaxCharacterLevel() {
            return this == L100;
        }

        public LevelData next() {
            int nextOrdinal = ordinal() + 1;
            if (nextOrdinal >= values().length) {
                return this;
            }

            return values()[nextOrdinal];
        }

        public boolean usesEXP() {
            return characterLevel < 90;
        }

        public boolean requiresAscensionItem() {
            return this == L90 || this == L95;
        }

        public LevelData getNextLevel() {
            return next();
        }

        public EXPData getEXPData() {
            if (!usesEXP()) {
                return null;
            }

            return EXPData.byLevel(characterLevel);
        }

        public boolean canGainEXP() {
            return characterLevel < 90;
        }

        public int getEXPToNextLevel() {
            EXPData data = getEXPData();

            if (data == null) {
                return 0;
            }

            return data.getExpNextLevel();
        }

        public int getTotalEXP() {
            EXPData data = getEXPData();

            if (data == null) {
                return 0;
            }

            return data.getTotalEXP();
        }
    }

    public enum EXPData {
        L1(1, 1000, 0),
        L2(2, 1325, 1000),
        L3(3, 1700, 2325),
        L4(4, 2150, 4025),
        L5(5, 2625, 6175),
        L6(6, 3150, 8800),
        L7(7, 3725, 11950),
        L8(8, 4350, 15675),
        L9(9, 5000, 20025),
        L10(10, 5700, 25025),
        L11(11, 6450, 30725),
        L12(12, 7225, 37175),
        L13(13, 8050, 44400),
        L14(14, 8925, 52450),
        L15(15, 9825, 61375),
        L16(16, 10750, 71200),
        L17(17, 11725, 81950),
        L18(18, 12725, 93675),
        L19(19, 13775, 106400),
        L20(20, 14875, 120175),
        L21(21, 16800, 135050),
        L22(22, 18000, 151850),
        L23(23, 19250, 169850),
        L24(24, 20550, 189100),
        L25(25, 21875, 209650),
        L26(26, 23250, 231525),
        L27(27, 24650, 254775),
        L28(28, 26100, 279425),
        L29(29, 27575, 305525),
        L30(30, 29100, 333100),
        L31(31, 30650, 362200),
        L32(32, 32250, 392850),
        L33(33, 33875, 425100),
        L34(34, 35550, 458975),
        L35(35, 37250, 494525),
        L36(36, 38975, 531775),
        L37(37, 40750, 570750),
        L38(38, 42575, 611500),
        L39(39, 44425, 654075),
        L40(40, 46300, 698500),
        L41(41, 50625, 744800),
        L42(42, 52700, 795425),
        L43(43, 54775, 848125),
        L44(44, 56900, 902900),
        L45(45, 59075, 959800),
        L46(46, 61275, 1018875),
        L47(47, 63525, 1080150),
        L48(48, 65800, 1143675),
        L49(49, 68125, 1209475),
        L50(50, 70475, 1277600),
        L51(51, 76500, 1348075),
        L52(52, 79050, 1424575),
        L53(53, 81650, 1503625),
        L54(54, 84275, 1585275),
        L55(55, 86950, 1669550),
        L56(56, 89650, 1756500),
        L57(57, 92400, 1846150),
        L58(58, 95175, 1938550),
        L59(59, 98000, 2033725),
        L60(60, 100875, 2131725),
        L61(61, 108950, 2232600),
        L62(62, 112050, 2341550),
        L63(63, 115175, 2453600),
        L64(64, 118325, 2568775),
        L65(65, 121525, 2687100),
        L66(66, 124775, 2808625),
        L67(67, 128075, 2933400),
        L68(68, 131400, 3061475),
        L69(69, 134775, 3192875),
        L70(70, 138175, 3327650),
        L71(71, 148700, 3465825),
        L72(72, 152375, 3614525),
        L73(73, 156075, 3766900),
        L74(74, 159825, 3922975),
        L75(75, 163600, 4082800),
        L76(76, 167425, 4246400),
        L77(77, 171300, 4413825),
        L78(78, 175225, 4585125),
        L79(79, 179175, 4760350),
        L80(80, 183175, 4939525),
        L81(81, 216225, 5122700),
        L82(82, 243025, 5338925),
        L83(83, 273100, 5581950),
        L84(84, 306800, 5855050),
        L85(85, 344600, 6161850),
        L86(86, 386950, 6506450),
        L87(87, 434425, 6893400),
        L88(88, 487625, 7327825),
        L89(89, 547200, 7815450),
        L90(90, 0, 8362650);

        private final int characterLevel;
        private final int expNextLevel;
        private final int totalEXP;

        EXPData(int characterLevel, int expNextLevel, int totalEXP) {
            this.characterLevel = characterLevel;
            this.expNextLevel = expNextLevel;
            this.totalEXP = totalEXP;
        }

        public int getCharacterLevel() {
            return characterLevel;
        }

        public int getExpNextLevel() {
            return expNextLevel;
        }

        public int getTotalEXP() {
            return totalEXP;
        }

        public static EXPData byLevel(int characterLevel) {
            for (EXPData data : values()) {
                if (data.characterLevel == characterLevel) {
                    return data;
                }
            }

            return L1;
        }

        public boolean isMaxCharacterLevel() {
            return this == values()[values().length - 1];
        }

        public EXPData next() {
            int nextOrdinal = ordinal() + 1;
            if (nextOrdinal >= values().length) {
                return this;
            }

            return values()[nextOrdinal];
        }
    }
}
