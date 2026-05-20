package dev.lumi.leylines.cca;

import dev.lumi.leylines.init.LeyLinesComponents;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import org.ladysnake.cca.api.v3.component.Component;
import org.ladysnake.cca.api.v3.component.sync.AutoSyncedComponent;
import org.ladysnake.cca.api.v3.component.tick.CommonTickingComponent;

public class PlayerProfileComponent implements AutoSyncedComponent, CommonTickingComponent {
    private final PlayerEntity player;

    private int adventureRank = 0;
    private int adventureEXP = 0;
    private int worldLevel = 0;

    private float maxStamina = 100f;
    private float stamina = 100f;
    private int staminaRegenDelay = 0;
    private static final int MAX_REGEN_DELAY = 40;

    public PlayerProfileComponent(PlayerEntity player) {
        this.player = player;
    }

    @Override
    public void tick() {
        if (staminaRegenDelay > 0) {
            staminaRegenDelay--;
        }

        if (staminaRegenDelay > 0) {
            return;
        }

        if (stamina >= maxStamina) {
            return;
        }

        float regenRate = 0.35f;
        if (player.isOnGround()) {
            regenRate = 0.75f;
        }

        regenStamina(regenRate);
    }

    //Adventure Rank
    public int getAdventureRank() {
        return adventureRank;
    }

    public void setAdventureRank(int adventureRank) {
        this.adventureRank = Math.max(0, adventureRank);
        LeyLinesComponents.PROFILE.sync(player);
    }

    public int getAdventureEXP() {
        return adventureEXP;
    }

    public void addAdventureEXP(int amount) {
        this.adventureEXP += amount;

        while (true) {
            AdventureRankData current = AdventureRankData.byRank(adventureRank);

            if (current.isMaxAdventureRank()) {
                break;
            }

            if (adventureEXP < current.getExpNextLevel()) {
                break;
            }

            adventureEXP -= current.getExpNextLevel();
            adventureRank++;
        }

        LeyLinesComponents.PROFILE.sync(player);
    }

    public void setAdventureEXP(int amount) {
        this.adventureEXP = amount;
        LeyLinesComponents.PROFILE.sync(player);
    }

    public int getRequiredEXPForNextRank() {
        return AdventureRankData.byRank(adventureRank).getExpNextLevel();
    }

    public int getTotalAdventureEXP() {
        AdventureRankData current = AdventureRankData.byRank(adventureRank);
        return current.getCumulativeEXP() + adventureEXP;
    }

    //World Level
    public int getWorldLevel() {
        return worldLevel;
    }

    public void setWorldLevel(int worldLevel) {
        this.worldLevel = Math.max(0, worldLevel);
        LeyLinesComponents.PROFILE.sync(player);
    }

    //Stamina
    public float getStamina() {
        return stamina;
    }

    public void setStamina(float stamina) {
        this.stamina = Math.max(0, Math.min(stamina, maxStamina));
        LeyLinesComponents.PROFILE.sync(player);
    }

    public float getMaxStamina() {
        return maxStamina;
    }

    public void setMaxStamina(float maxStamina) {
        this.maxStamina = Math.max(1, maxStamina);

        if (stamina > this.maxStamina) {
            stamina = this.maxStamina;
        }

        LeyLinesComponents.PROFILE.sync(player);
    }

    public boolean consumeStamina(float amount) {
        staminaRegenDelay = MAX_REGEN_DELAY;
        if (stamina < amount) {
            return false;
        }

        stamina -= amount;
        if (stamina < 0) {
            stamina = 0;
        }

        LeyLinesComponents.PROFILE.sync(player);
        return true;
    }

    public void regenStamina(float amount) {
        stamina += amount;
        if (stamina > maxStamina) {
            stamina = maxStamina;
        }

        LeyLinesComponents.PROFILE.sync(player);
    }

    @Override
    public void readFromNbt(NbtCompound nbtCompound, RegistryWrapper.WrapperLookup wrapperLookup) {
        adventureRank = nbtCompound.getInt("AdventureRank");
        adventureEXP = nbtCompound.getInt("AdventureEXP");
        worldLevel = nbtCompound.getInt("WorldLevel");

        maxStamina = nbtCompound.getInt("MaxStamina");
        stamina = nbtCompound.getInt("Stamina");
    }

    @Override
    public void writeToNbt(NbtCompound nbtCompound, RegistryWrapper.WrapperLookup wrapperLookup) {
        nbtCompound.putInt("AdventureRank", adventureRank);
        nbtCompound.putInt("AdventureEXP", adventureEXP);
        nbtCompound.putInt("WorldLevel", worldLevel);

        nbtCompound.putFloat("MaxStamina", maxStamina);
        nbtCompound.putFloat("Stamina", stamina);
    }

    public enum AdventureRankData {
        AR0(0, 0, 0),
        AR1(1, 375, 0),
        AR2(2, 500, 375),
        AR3(3, 625, 875),
        AR4(4, 725, 1500),
        AR5(5, 850, 2225),
        AR6(6, 950, 3075),
        AR7(7, 1075, 4025),
        AR8(8, 1175, 5100),
        AR9(9, 1300, 6275),
        AR10(10, 1425, 7575),
        AR11(11, 1525, 9000),
        AR12(12, 1650, 10525),
        AR13(13, 1775, 12175),
        AR14(14, 1875, 13950),
        AR15(15, 2000, 15825),
        AR16(16, 2375, 17825),
        AR17(17, 2500, 20200),
        AR18(18, 2625, 22700),
        AR19(19, 2775, 23325),
        AR20(20, 2825, 28100),
        AR21(21, 3425, 30925),
        AR22(22, 3725, 34350),
        AR23(23, 4000, 38075),
        AR24(24, 4300, 42075),
        AR25(25, 4575, 46375),
        AR26(26, 4875, 50950),
        AR27(27, 5150, 55825),
        AR28(28, 5450, 60975),
        AR29(29, 5725, 66425),
        AR30(30, 6025, 72150),
        AR31(31, 6300, 78175),
        AR32(32, 6600, 84475),
        AR33(33, 6900, 91075),
        AR34(34, 7175, 97975),
        AR35(35, 7475, 105150),
        AR36(36, 7750, 112625),
        AR37(37, 8050, 120375),
        AR38(38, 8325, 128425),
        AR39(39, 8625, 136750),
        AR40(40, 10550, 145375),
        AR41(41, 11525, 155925),
        AR42(42, 12475, 167450),
        AR43(43, 13450, 179925),
        AR44(44, 14400, 193375),
        AR45(45, 15350, 207775),
        AR46(46, 16325, 223125),
        AR47(47, 17275, 239450),
        AR48(48, 18250, 256725),
        AR49(49, 19200, 274975),
        AR50(50, 26400, 294175),
        AR51(51, 28800, 320575),
        AR52(52, 31200, 349375),
        AR53(53, 33600, 380575),
        AR54(54, 36000, 414175),
        AR55(55, 232350, 450175),
        AR56(56, 258950, 682525),
        AR57(57, 285750, 941475),
        AR58(58, 312825, 1227225),
        AR59(59, 340125, 1540050),
        AR60(60, 0, 1880175);

        private final int adventureRank;
        private final int expNextLevel;
        private final int cumulativeEXP;

        AdventureRankData(int adventureRank, int expNextLevel, int cumulativeEXP) {
            this.adventureRank = adventureRank;
            this.expNextLevel = expNextLevel;
            this.cumulativeEXP = cumulativeEXP;
        }

        public int getAdventureRank() {
            return adventureRank;
        }

        public int getExpNextLevel() {
            return expNextLevel;
        }

        public int getCumulativeEXP() {
            return cumulativeEXP;
        }

        public static AdventureRankData byRank(int adventureRank) {
            for (AdventureRankData data : values()) {
                if (data.adventureRank == adventureRank) {
                    return data;
                }
            }

            return AR0;
        }

        public boolean isMaxAdventureRank() {
            return this == values()[values().length - 1];
        }

        public AdventureRankData next() {
            int nextOrdinal = ordinal() + 1;
            if (nextOrdinal >= values().length) {
                return this;
            }

            return values()[nextOrdinal];
        }
    }
}
