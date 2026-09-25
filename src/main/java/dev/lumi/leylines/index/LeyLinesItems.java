package dev.lumi.leylines.index;

import dev.lumi.leylines.LeyLines;
import dev.lumi.leylines.item.weapon.base.*;
import dev.lumi.leylines.item.weapon.util.ILeyLinesWeaponRarity;
import dev.lumi.leylines.item.weapon.util.ILeyLinesWeaponType;
import dev.lumi.leylines.item.weapon.util.LeyLinesWeaponItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LeyLinesItems {
    protected static final Map<Item, Identifier> ITEMS = new LinkedHashMap();


    public static final List<LeyLinesWeaponItem> WEAPONS = new ArrayList<>();
    //Swords
    //5-Star Sword
    public static final Item ABSOLUTION;
    public static final Item AQUILA_FAVONIA;
    public static final Item ATHAME_ARTIS;
    public static final Item AZURELIGHT;
    public static final Item BEYOND_THE_CHRYSALIS;
    public static final Item EXAIPHANES_BLADE;
    public static final Item FREEDOM_SWORN;
    public static final Item HARAN_GEPPAKU_FUTSU;
    public static final Item KEY_OF_KHAJ_NISUT;
    public static final Item LIGHT_OF_FOLIAR_INCISION;
    public static final Item LIGHTBEARING_MOONSHARD;
    public static final Item MISTSPLITTER_REFORGED;
    public static final Item PEAK_PATROL_SONG;
    public static final Item PRIMORDIAL_JADE_CUTTER;
    public static final Item SKYWARD_BLADE;
    public static final Item SPLENDOR_OF_TRANQUIL_WATERS;
    public static final Item SUMMIT_SHAPER;
    public static final Item URAKU_MISUGIRI;
    public static final Item WHITELAKE_FROSTFEATHER;

    //4-Star Sword
    public static final Item AMENOMA_KAGEUCHI;
    public static final Item BLACKCLIFF_LONGSWORD;
    public static final Item CALAMITY_OF_ESHU;
    public static final Item CINNABAR_SPINDLE;
    public static final Item EMBERWELL;
    public static final Item FAVONIUS_SWORD;
    public static final Item FESTERING_DESIRE;
    public static final Item FINALE_OF_THE_DEEP;
    public static final Item FLEUVE_CENDRE_FERRYMAN;
    public static final Item FLUTE_OF_EZPITZAL;
    public static final Item HERETICS_MOLTEN_BLADE;
    public static final Item IRON_STING;
    public static final Item KAGOTSURUBE_ISSHIN;
    public static final Item LIONS_ROAR;
    public static final Item MOONWEAVERS_DAWN;
    public static final Item NEW_BOUGH;
    public static final Item PROTOTYPE_RANCOUR;
    public static final Item ROYAL_LONGSWORD;
    public static final Item SACRIFICIAL_SWORD;
    public static final Item SAPWOOD_BLADE;
    public static final Item SERENITYS_CALL;
    public static final Item SILVER_LIGHT;
    public static final Item STURDY_BONE;
    public static final Item SWORD_OF_DESCENSION;
    public static final Item SWORD_OF_NARZISSENKREUZ;
    public static final Item THE_ALLEY_FLASH;
    public static final Item THE_BLACK_SWORD;
    public static final Item THE_DOCKHANDS_ASSISTANT;
    public static final Item THE_FLUTE;
    public static final Item TOUKABOU_SHIGURE;
    public static final Item WOLF_FANG;
    public static final Item XIPHOS_MOONLIGHT;

    //3-Star Sword
    public static final Item COOL_STEEL;
    public static final Item DARK_IRON_SWORD;
    public static final Item FILLET_BLADE;
    public static final Item HARBINGER_OF_DAWN;
    public static final Item SKYRIDER_SWORD;
    public static final Item TRAVELERS_HANDY_SWORD;

    //2-Star Sword
    public static final Item SILVER_SWORD;

    //1-Star Sword
    public static final Item DULL_BLADE;


    //Claymores
    //5-Star Claymore
    public static final Item A_TEASPOON_OF_TRANSCENDENCE;
    public static final Item A_THOUSAND_BLAZING_SUNS;
    public static final Item BEACON_OF_THE_REED_SEA;
    public static final Item FANG_OF_THE_MOUNTAIN_KING;
    public static final Item GEST_OF_THE_MIGHTY_WOLF;
    public static final Item REDHORN_STONETHRESHER;
    public static final Item SKYWARD_PRIDE;
    public static final Item SONG_OF_BROKEN_PINES;
    public static final Item THE_UNFORGED;
    public static final Item VERDICT;
    public static final Item WOLFS_GRAVESTONE;

    //4-Star Claymore
    public static final Item ULTIMATE_OVERLORDS_MEGA_MAGIC_SWORD;
    public static final Item AKUOUMARU;
    public static final Item BLACKCLIFF_SLASHER;
    public static final Item BLADE_OF_ATONEMENT;
    public static final Item EARTH_SHAKER;
    public static final Item FAVONIUS_GREATSWORD;
    public static final Item FLAME_FORGED_INSIGHT;
    public static final Item FOREST_REGALIA;
    public static final Item FORGED_BY_THE_GOLDEN_MELODY;
    public static final Item FRUITFUL_HOOK;
    public static final Item KATSURAGIKIRI_NAGAMASA;
    public static final Item LITHIC_BLADE;
    public static final Item LUXURIOUS_SEA_lORD;
    public static final Item MAILED_FLOWER;
    public static final Item MAKHAIRA_AQUAMARINE;
    public static final Item MASTER_KEY;
    public static final Item PORTABLE_POWER_SAW;
    public static final Item PROTOTYPE_ARCHAIC;
    public static final Item RAINSLASHER;
    public static final Item ROYAL_GREATSWORD;
    public static final Item SACRIFICIAL_GREATSWORD;
    public static final Item SERPENT_SPINE;
    public static final Item SNOW_TOMBED_STARSILVER;
    public static final Item TALKING_STICK;
    public static final Item THE_BELL;
    public static final Item TIDAL_SHADOW;
    public static final Item WHITEBLIND;

    //3-Star Claymore
    public static final Item BLOODTAINTED_GREATSWORD;
    public static final Item DEBATE_CLUB;
    public static final Item FERROUS_SHADOW;
    public static final Item SKYRIDER_GREATSWORD;
    public static final Item WHITE_IRON_GREATSWORD;

    //2-Star Claymore
    public static final Item OLD_MERCS_PAL;

    //1-Star Claymore
    public static final Item WASTER_GREATSWORD;


    //Polearms
    //5-Star Polearm
    public static final Item BLOODSOAKED_RUINS;
    public static final Item CALAMITY_QUELLER;
    public static final Item CRIMSON_MOONS_SEMBLANCE;
    public static final Item DISASTER_AND_REMORSE;
    public static final Item ENGULFING_LIGHTNING;
    public static final Item FRACTURED_HALO;
    public static final Item LUMIDOUCE_ELEGY;
    public static final Item PRIMORDIAL_JADE_WINGED_SPEAR;
    public static final Item SKYWARD_SPINE;
    public static final Item STAFF_OF_HOMA;
    public static final Item STAFF_OF_THE_SCARLET_SANDS;
    public static final Item SYMPHONIST_OF_SCENTS;
    public static final Item VORTEX_VANQUISHER;

    //4-Star Polearm
    public static final Item THE_CATCH;
    public static final Item BALLAD_OF_THE_FJORDS;
    public static final Item BLACKCLIFF_POLE;
    public static final Item CRESCENT_PIKE;
    public static final Item DEATHMATCH;
    public static final Item DIALOGUES_OF_THE_DESERT_SAGES;
    public static final Item DRAGONS_BANE;
    public static final Item DRAGONSPINE_SPEAR;
    public static final Item FAVONIUS_LANCE;
    public static final Item FOOTPRINT_OF_THE_RAINBOW;
    public static final Item FROSTBREATH;
    public static final Item KITAIN_CROSS_SPEAR;
    public static final Item LITHIC_SPEAR;
    public static final Item MISSIVE_WINDSPEAR;
    public static final Item MOONPIERCER;
    public static final Item MOUNTAIN_BRACING_BOLT;
    public static final Item PROSPECTORS_DRILL;
    public static final Item PROSPECTORS_SHOVEL;
    public static final Item PROTOTYPE_STARGLITTER;
    public static final Item RIGHTFUL_REWARD;
    public static final Item ROYAL_SPEAR;
    public static final Item SACRIFICERS_STAFF;
    public static final Item SONG_OF_THE_VIGIL;
    public static final Item TAMAYURATEI_NO_OHANASHI;
    public static final Item WAVEBREAKERS_FIN;

    //3-Star Polearm
    public static final Item BLACK_TASSEL;
    public static final Item HALBERD;
    public static final Item WHITE_TASSEL;

    //2-Star Polearm
    public static final Item IRON_POINT;

    //1-Star Polearm
    public static final Item BEGINNERS_PROTECTOR;


    //Catalysts
    //5-Star Catalyst
    public static final Item A_THOUSAND_FLOATING_DREAMS;
    public static final Item ANGELOS_HEPTADES;
    public static final Item CASHFLOW_SUPERVISION;
    public static final Item CRANES_ECHOING_CALL;
    public static final Item EVERLASTING_MOONGLOW;
    public static final Item HYMN_OF_THE_MAELSTROM;
    public static final Item JADEFALLS_SPLENDOR;
    public static final Item KAGURAS_VERITY;
    public static final Item LOST_PRAYER_TO_THE_SACRED_WINDS;
    public static final Item MEMORY_OF_DUST;
    public static final Item NIGHTWEAVERS_LOOKING_GLASS;
    public static final Item NOCTURNES_CURTAIN_CALL;
    public static final Item RELIQUARY_OF_TRUTH;
    public static final Item SKYWARD_ATLAS;
    public static final Item STARCALLERS_WATCH;
    public static final Item SUNNY_MORNING_SLEEP_IN;
    public static final Item SURFS_UP;
    public static final Item TOME_OF_THE_ETERNAL_FLOW;
    public static final Item TULAYTULLAHS_REMEMBRANCE;
    public static final Item VIVID_NOTIONS;

    //4-Star Catalyst
    public static final Item ASH_GRAVEN_DRINKING_HORN;
    public static final Item BALLAD_OF_THE_BOUNDLESS_BLUE;
    public static final Item BLACKCLIFF_AGATE;
    public static final Item BLACKMARROW_LANTERN;
    public static final Item CLASH_OF_KINGS;
    public static final Item DAWNING_FROST;
    public static final Item DODOCO_TALES;
    public static final Item ECHOES_OF_THE_HEART;
    public static final Item ETHERLIGHT_SPINDLELUTE;
    public static final Item EYE_OF_PERCEPTION;
    public static final Item FAVONIUS_CODEX;
    public static final Item FLOWING_PURITY;
    public static final Item FROSTBEARER;
    public static final Item FRUIT_OF_FULFILLMENT;
    public static final Item HAKUSHIN_RING;
    public static final Item MAPPA_MARE;
    public static final Item OATHSWORN_EYE;
    public static final Item PROTOTYPE_AMBER;
    public static final Item RING_OF_YAXCHE;
    public static final Item ROYAL_GRIMOIRE;
    public static final Item SACRIFICIAL_FRAGMENTS;
    public static final Item SACRIFICIAL_JADE;
    public static final Item SOLAR_PEARL;
    public static final Item THE_WIDSITH;
    public static final Item WANDERING_EVENSTAR;
    public static final Item WAVERIDING_WHIRL;
    public static final Item WINE_AND_SONG;
    public static final Item WINTERS_HEAVY_HEART;

    //3-Star Catalyst
    public static final Item EMERALD_ORB;
    public static final Item MAGIC_GUIDE;
    public static final Item OTHERWORLDLY_STORY;
    public static final Item THRILLING_TALES_OF_DRAGON_SLAYERS;
    public static final Item TWIN_NEPHRITE;

    //2-Star Catalyst
    public static final Item POCKET_GRIMOIRE;

    //1-Star Catalyst
    public static final Item APPRENTICES_NOTES;


    //Bows
    //5-Star Bow
    public static final Item AMOS_BOW;
    public static final Item AQUA_SIMULACRA;
    public static final Item ASTRAL_VULTURES_CRIMSON_PLUMAGE;
    public static final Item ELEGY_FOR_THE_END;
    public static final Item GOLDEN_FROSTBOUND_OATH;
    public static final Item HUNTERS_PATH;
    public static final Item POLAR_STAR;
    public static final Item SILVERSHOWER_HEARTSTRINGS;
    public static final Item SKYWARD_HARP;
    public static final Item THE_DAYBREAK_CHRONICLES;
    public static final Item THE_FIRST_GREAT_MAGIC;
    public static final Item THUNDERING_PULSE;

    //4-Star Bow
    public static final Item ALLEY_HUNTER;
    public static final Item BLACKCLIFF_WARBOW;
    public static final Item BREEZEBORNE_REFRAIN;
    public static final Item CHAIN_BREAKER;
    public static final Item CLOUDFORGED;
    public static final Item COMPOUND_BOW;
    public static final Item COVENANT_OF_FROST_AND_SNOW;
    public static final Item END_OF_THE_LINE;
    public static final Item FADING_TWILIGHT;
    public static final Item FAVONIUS_WARBOW;
    public static final Item FLOWER_WREATHED_FEATHERS;
    public static final Item HAMAYUMI;
    public static final Item IBIS_PIERCER;
    public static final Item JADE_VISTA;
    public static final Item KINGS_SQUIRE;
    public static final Item MITTERNACHTS_WALTZ;
    public static final Item MOUUNS_MOON;
    public static final Item PREDATOR;
    public static final Item PROTOTYPE_CRESCENT;
    public static final Item RAINBOW_SERPENTS_RAIN_BOW;
    public static final Item RANGE_GAUGE;
    public static final Item ROYAL_BOW;
    public static final Item RUST;
    public static final Item SACRIFICIAL_BOW;
    public static final Item SCION_OF_THE_BLAZING_SUN;
    public static final Item SEQUENCE_OF_SOLITUDE;
    public static final Item SNARE_HOOK;
    public static final Item SONG_OF_STILLNESS;
    public static final Item THE_STRINGLESS;
    public static final Item THE_VIRIDESCENT_HUNT;
    public static final Item WINDBLUME_ODE;

    //3-Star Bow
    public static final Item MESSENGER;
    public static final Item RAVEN_BOW;
    public static final Item RECURVE_BOW;
    public static final Item SHARPSHOOTERS_OATH;
    public static final Item SLINGSHOT;

    //2-Star Bow
    public static final Item SEASONED_HUNTERS_BOW;

    //1-Star Bow
    public static final Item HUNTERS_BOW;

    public static void init() {
        ITEMS.forEach((item, id) -> {
            Registry.register(Registries.ITEM, id, item);
        });
    }

    protected static <T extends Item> T register(String name, T item) {
        ITEMS.put(item, LeyLines.id(name));

        if (item instanceof LeyLinesWeaponItem weapon) {
            WEAPONS.add(weapon);
        }
        return item;
    }

    public LeyLinesItems() {
    }

    static {
        //Weapons
        //Swords
        //5-Star Sword
        ABSOLUTION = register((String) "absolution", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 48, "CRIT DMG", "9.6%", "Deathly Pact", "CRIT DMG increased by 20%. Increasing the value of a Bond of Life increases the DMG the equipping character deals by 16% for 6s. Max 3 stacks.", new Item.Settings().rarity(Rarity.COMMON))));

        AQUILA_FAVONIA = register((String) "aquila_favonia", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 48, "Physical DMG Bonus", "9%", "Falcon's Defiance", "ATK is increased by 20%. Triggers on taking DMG: the soul of the Falcon of the West awakens, holding the banner of the resistance aloft, regenerating HP equal to 100% of ATK and dealing 200% of ATK as DMG to surrounding opponents. This effect can only occur once every 15s.", new Item.Settings().rarity(Rarity.COMMON))));

        ATHAME_ARTIS = register((String) "athame_artis", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 46, "CRIT Rate", "7.2%", "Day King's Splendor Solis", "CRIT DMG from Elemental Bursts is increased by 16%. When an Elemental Burst hits an opponent, gain the Blade of the Daylight Hours effect: ATK is increased by 20%. Nearby active party members other than the equipping character have their ATK increased by 16% for 3s.\n" + "Additionally, when the party possesses Hexerei: Secret Rite effects, the effects of Blade of the Daylight Hours are increased by an additional 75%. This effect can be triggered even if the equipping character is off-field.", new Item.Settings().rarity(Rarity.COMMON))));

        AZURELIGHT = register((String) "azurelight", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 48, "CRIT Rate", "4.8%", "Whitehill's Bestowal", "Within 12s after an Elemental Skill is used, ATK is increased by 24%. During this time, when the equipping character has 0 Energy, ATK will be further increased by 24%, and CRIT DMG will be increased by 40%.", new Item.Settings().rarity(Rarity.COMMON))));

        BEYOND_THE_CHRYSALIS = register((String) "beyond_the_chrysalis", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 48, "CRIT DMG", "9.6%", "Dance of Wings Unbound", "Each time the equipping character uses their Elemental Skill or Elemental Burst, they gain one of the following three effects in sequence:\n" + "\n" + "    Winds of Devotion: Increases the character's CRIT DMG by 56% for 10s.\n" + "    Winds of Defiance: Increases Stellar Swirl Reaction DMG dealt by the equipping character by 36% for 10s.\n" + "    Winds of Plenty: Regenerates 5 Elemental Energy for the equipping character. Up to 5 Elemental Energy can be regenerated in this way every 4s.\n" + "\n" + "The aforementioned effects are removed and the sequence is reset when the equipping character leaves the field.", new Item.Settings().rarity(Rarity.COMMON))));

        EXAIPHANES_BLADE = register((String) "exaiphanes_blade", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 46, "CRIT Rate", "7.2%", "Traveler's Path", "When the Traveler equips this, their ATK will increase by 16% for 8s after they hit an opponent. At the same time, they will also regenerate 3 Elemental Energy. This effect can trigger once every 5s. This can be triggered even when the character is not on the field.", new Item.Settings().rarity(Rarity.COMMON))));

        FREEDOM_SWORN = register((String) "freedom_sworn", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 46, "Elemental Mastery", "43", "Revolutionary Chorale", "A part of the \"Millennial Movement\" that wanders amidst the winds.\n" + "Increases DMG by 10%.\n" + "When the character wielding this weapon triggers Elemental Reactions, they gain a Sigil of Rebellion. This effect can be triggered once every 0.5s and can be triggered even if said character is not on the field.\n" + "When you possess 2 Sigils of Rebellion, all of them will be consumed and all nearby party members will obtain \"Millennial Movement: Song of Resistance\" for 12s.\n" + "\"Millennial Movement: Song of Resistance\" increases Normal, Charged, and Plunging Attack DMG by 16% and increases ATK by 20%. Once this effect is triggered, you will not gain Sigils of Rebellion for 20s.\n" + "Of the many effects of the \"Millennial Movement,\" buffs of the same type will not stack.", new Item.Settings().rarity(Rarity.COMMON))));

        HARAN_GEPPAKU_FUTSU = register((String) "haran_geppaku_futsu", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 46, "CRIT Rate", "7.2%", "Honed Flow", "Obtain 12% All Elemental DMG Bonus. When other nearby party members use Elemental Skills, the character equipping this weapon will gain 1 Wavespike stack. Max 2 stacks. This effect can be triggered once every 0.3s. When the character equipping this weapon uses an Elemental Skill, all stacks of Wavespike will be consumed to gain Rippling Upheaval: each stack of Wavespike consumed will increase Normal Attack DMG by 20% for 8s.", new Item.Settings().rarity(Rarity.COMMON))));

        KEY_OF_KHAJ_NISUT = register((String) "key_of_khaj_nisut", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 44, "HP", "14.4%", "Sunken Song of the Sands", "HP increased by 20%. When an Elemental Skill hits opponents, you gain the Grand Hymn effect for 20s. This effect increases the equipping character's Elemental Mastery by 0.12% of their Max HP. This effect can trigger once every 0.3s. Max 3 stacks. When this effect gains 3 stacks, or when the third stack's duration is refreshed, the Elemental Mastery of all nearby party members will be increased by 0.2% of the equipping character's max HP for 20s.", new Item.Settings().rarity(Rarity.COMMON))));

        LIGHT_OF_FOLIAR_INCISION = register((String) "light_of_foliar_incision", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 44, "CRIT DMG", "19.2%", "Whitemoon Bristle", "CRIT Rate is increased by 4%. After Normal Attacks deal Elemental DMG, the Foliar Incision effect will be obtained, increasing DMG dealt by Normal Attacks and Elemental Skills by 120% of Elemental Mastery. This effect will disappear after 28 DMG instances or 12s. You can obtain Foliar Incision once every 12s.", new Item.Settings().rarity(Rarity.COMMON))));

        LIGHTBEARING_MOONSHARD = register((String) "lightbearing_moonshard", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 44, "CRIT DMG", "19.2%", "Legacy of Lang-Gan", "Increases DEF by 20%. DMG inflicted by Lunar-Crystallize reactions increases by 64% for 5s after the equipping character uses an Elemental Skill.", new Item.Settings().rarity(Rarity.COMMON))));

        MISTSPLITTER_REFORGED = register((String) "mistsplitter_reforged", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 48, "CRIT DMG", "9.6%", "Mistsplitter's Edge", "Gain a 12% Elemental DMG Bonus for all elements and receive the might of the Mistsplitter's Emblem. At stack levels 1/2/3, Mistsplitter's Emblem provides a 8/16/28% Elemental DMG Bonus for the character's Elemental Type. The character will obtain 1 stack of Mistsplitter's Emblem in each of the following scenarios: Normal Attack deals Elemental DMG (stack lasts 5s), casting Elemental Burst (stack lasts 10s); Energy is less than 100% (stack disappears when Energy is full). Each stack's duration is calculated independently.", new Item.Settings().rarity(Rarity.COMMON))));

        PEAK_PATROL_SONG = register((String) "peak_patrol_song", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 44, "DEF", "18%", "Halcyon Years Unending", "Gain \"Ode to Flowers\" after Normal or Plunging Attacks hit an opponent: DEF increases by 8% and gain a 10% All Elemental DMG Bonus for 6s. Max 2 stacks. Can trigger once per 0.1s. When this effect reaches 2 stacks or the 2nd stack's duration is refreshed, increase all nearby party members' All Elemental DMG Bonus by 8% for every 1,000 DEF the equipping character has, up to a maximum of 25.6%, for 15s.", new Item.Settings().rarity(Rarity.COMMON))));

        PRIMORDIAL_JADE_CUTTER = register((String) "primordial_jade_cutter", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 44, "CRIT Rate", "9.6%", "Protector's Virtue", "HP increased by 20%. Additionally, provides an ATK Bonus based on 1.2% of the wielder's Max HP.", new Item.Settings().rarity(Rarity.COMMON))));

        SKYWARD_BLADE = register((String) "skyward_blade", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 46, "Energy Recharge", "12%", "Sky-Piercing Fang", "CRIT Rate increased by 4%. Gains Skypiercing Might upon using an Elemental Burst: Increases Movement SPD by 10%, increases ATK SPD by 10%, and Normal and Charged hits deal additional DMG equal to 20% of ATK. Skypiercing Might lasts for 12s.", new Item.Settings().rarity(Rarity.COMMON))));

        SPLENDOR_OF_TRANQUIL_WATERS = register((String) "splendor_of_tranquil_waters", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 44, "CRIT DMG", "19.2%", "Dawn and Dusk by the Lake", "When the equipping character's current HP increases or decreases, Elemental Skill DMG dealt will be increased by 8% for 6s. Max 3 stacks. This effect can be triggered once every 0.2s. When other party members' current HP increases or decreases, the equipping character's Max HP will be increased by 14% for 6s. Max 2 stacks. This effect can be triggered once every 0.2s. The aforementioned effects can be triggered even if the wielder is off-field.", new Item.Settings().rarity(Rarity.COMMON))));

        SUMMIT_SHAPER = register((String) "summit_shaper", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 46, "ATK", "10.8%", "Golden Majesty", "Increases Shield Strength by 20%. Scoring hits on opponents increases ATK by 4% for 8s. Max 5 stacks. Can only occur once every 0.3s. While protected by a shield, this ATK increase effect is increased by 100%.", new Item.Settings().rarity(Rarity.COMMON))));

        URAKU_MISUGIRI = register((String) "uraku_misugiri", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 44, "CRIT DMG", "19.2%", "Brocade Bloom, Shrine Sword", "Normal Attack DMG is increased by 16% and Elemental Skill DMG is increased by 24%. After a nearby active character deals Geo DMG, the aforementioned effects increase by 100% for 15s. Additionally, the wielder's DEF is increased by 20%.", new Item.Settings().rarity(Rarity.COMMON))));

        WHITELAKE_FROSTFEATHER = register((String) "whitelake_frostfeather", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 48, "CRIT Rate", "4.8%", "Snow Swan's Finale", "When the equipping character hits an opponent with their Elemental Skill, they gain \"Lake-Hued Lament\": ATK increases by 8% for 8s. This effect can trigger once every 0.1s. Max 3 stacks, and each stack's duration is independent.\n" + "At 3 stacks, the CRIT DMG of any Stellar Glimmer reaction DMG caused by the equipping character is increased by 50%, and triggering Stellar Glimmer reactions or Stellar Glimmer reaction DMG will also restore 4 Elemental Energy to the character. This Energy recovery effect can trigger once every 3.5s.\n" + "This effect can be triggered even when the equipping character is off-field.", new Item.Settings().rarity(Rarity.COMMON))));


        //4-Star Sword
        AMENOMA_KAGEUCHI = register((String) "amenoma_kageuchi", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 41, "ATK", "12%", "Iwakura Succession", "After casting an Elemental Skill, gain 1 Succession Seed. This effect can be triggered once every 5s. The Succession Seed lasts for 30s. Up to 3 Succession Seeds may exist simultaneously. After using an Elemental Burst, all Succession Seeds are consumed and after 2s, the character regenerates 6 Energy for each seed consumed.", new Item.Settings().rarity(Rarity.COMMON))));

        BLACKCLIFF_LONGSWORD = register((String) "blackcliff_longsword", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "CRIT DMG", "8%", "Press the Advantage", "After defeating an opponent, ATK is increased by 12% for 30s. This effect has a maximum of 3 stacks, and the duration of each stack is independent of the others.", new Item.Settings().rarity(Rarity.COMMON))));

        CALAMITY_OF_ESHU = register((String) "calamity_of_eshu", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "ATK", "6%", "Diffusing Boundary", "While characters are protected by a Shield, DMG dealt by Normal and Charged Attacks is increased by 20%, and Normal and Charged Attack CRIT Rate is increased by 8%.", new Item.Settings().rarity(Rarity.COMMON))));

        CINNABAR_SPINDLE = register((String) "cinnabar_spindle", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 41, "DEF", "15%", "Spotless Heart", "Elemental Skill DMG is increased by 40% of DEF. The effect will be triggered no more than once every 1.5s and will be cleared 0.1s after the Elemental Skill deals DMG.", new Item.Settings().rarity(Rarity.COMMON))));

        EMBERWELL = register((String) "emberwell", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "Elemental Mastery", "36", "Starfire Upon the Snowplains", "Triggering an Elemental Reaction increases the equipping character's ATK by 16% for 12s. Triggering a Stellar Glimmer reaction increases their Stellar Glimmer reaction DMG dealt by 16% for 12s. The aforementioned effects can trigger even when the character is not on the field.", new Item.Settings().rarity(Rarity.COMMON))));

        FAVONIUS_SWORD = register((String) "favonius_sword", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 41, "Energy Recharge", "13.3%", "Windfall", "CRIT hits have a 60% chance to generate a small amount of Elemental Particles, which will regenerate 6 Energy for the character. Can only occur once every 12s.", new Item.Settings().rarity(Rarity.COMMON))));

        FESTERING_DESIRE = register((String) "festering_desire", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "Energy Recharge", "10.0%", "Undying Admiration", "Increases Elemental Skill DMG by 16% and Elemental Skill CRIT Rate by 6%.", new Item.Settings().rarity(Rarity.COMMON))));

        FINALE_OF_THE_DEEP = register((String) "finale_of_the_deep", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "ATK", "6%", "An End Sublime", "When using an Elemental Skill, ATK will be increased by 12% for 15s, and a Bond of Life worth 25% of Max HP will be granted. This effect can be triggered once every 10s. When the Bond of Life is cleared, a maximum of 150 ATK will be gained based on 2.4% of the total amount of the Life Bond cleared, lasting for 15s.", new Item.Settings().rarity(Rarity.COMMON))));

        FLEUVE_CENDRE_FERRYMAN = register((String) "fleuve_cendre_ferryman", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "Energy Recharge", "10.0%", "Ironbone", "Increases Elemental Skill CRIT Rate by 8%. Additionally, increases Energy Recharge by 16% for 5s after using an Elemental Skill.", new Item.Settings().rarity(Rarity.COMMON))));

        FLUTE_OF_EZPITZAL = register((String) "flute_of_ezpitzal", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 41, "DEF", "15%", "Smoke-and-Mirror Mystery", "Using an Elemental Skill increases DEF by 16% for 15s.", new Item.Settings().rarity(Rarity.COMMON))));

        HERETICS_MOLTEN_BLADE = register((String) "heretics_molten_blade", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "CRIT Rate", "6%", "Lone Light's Blessing", "After the equipping character uses their Elemental Skill, they gain \"Gleam of First Light.\" While active, Gleam of First Light tracks their distance traveled. Each second, the equipping character gains an ATK Bonus ranging from 18% to 36% based on the distance traveled during the previous second. Gleam of First Light lasts 14s, can be triggered once every 14s, and is removed when the equipping character leaves the field.", new Item.Settings().rarity(Rarity.COMMON))));

        IRON_STING = register((String) "iron_sting", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "Elemental Mastery", "36", "Infusion Stinger", "Dealing Elemental DMG increases all DMG by 6% for 6s. Max 2 stacks. Can only occur once every 1s.", new Item.Settings().rarity(Rarity.COMMON))));

        KAGOTSURUBE_ISSHIN = register((String) "kagotsurube_isshin", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "ATK", "9%", "Isshin Art Clarity", "When a Normal, Charged, or Plunging Attack hits an opponent, it will whip up a Hewing Gale, dealing AoE DMG equal to 180% of ATK and increasing ATK by 15% for 8s. This effect can be triggered once every 8s.", new Item.Settings().rarity(Rarity.COMMON))));

        LIONS_ROAR = register((String) "lions_roar", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "ATK", "9%", "Bane of Fire and Thunder", "Increases DMG against enemies affected by Pyro or Electro by 20%.", new Item.Settings().rarity(Rarity.COMMON))));

        MOONWEAVERS_DAWN = register((String) "moonweavers_dawn", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "ATK", "6%", "Secret Silver's Testament", "Increases Elemental Burst DMG by 20%. When the equipping character's Energy Capacity does not exceed 60/40, their Elemental Burst DMG is increased by an additional 16/28%.", new Item.Settings().rarity(Rarity.COMMON))));

        NEW_BOUGH = register((String) "new_bough", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "CRIT DMG", "12%", "Wildgrowth", "When the equipping character hits the opponent with an attack within 12s after using the Elemental Skill, they gain the \"Verdant\" effect:\n" + "\n" + "    Increases ATK by 4% and their Elemental Mastery by 20.\n" + "    This effect lasts 6s and can trigger once every second. Max 3 stacks.\n" + "\n" + "This effect can be triggered even when the equipping character is off-field.\n" + "Radiance: Stellar Glimmer: The effect of 'Verdant\" is changed to: Increases ATK by 6% as well as Stellar Glimmer Reaction DMG dealt by the equipping character by 8%.", new Item.Settings().rarity(Rarity.COMMON))));

        PROTOTYPE_RANCOUR = register((String) "prototype_rancour", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "Physical DMG Bonus", "7.5%", "Smashed Stone", "On hit, Normal or Charged Attacks increase ATK and DEF by 4% for 6s. Max 4 stacks. This effect can only occur once every 0.3s.", new Item.Settings().rarity(Rarity.COMMON))));

        ROYAL_LONGSWORD = register((String) "royal_longsword", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "ATK", "9%", "Focus", "Upon dealing damage to an opponent, increases CRIT Rate by 8%. Max 5 stacks. A CRIT hit removes all existing stacks.", new Item.Settings().rarity(Rarity.COMMON))));

        SACRIFICIAL_SWORD = register((String) "sacrificial_sword", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 41, "Energy Recharge", "13.3%", "Composed", "After dealing damage to an opponent with an Elemental Skill, the skill has a 40% chance to end its own CD. Can only occur once every 30s.", new Item.Settings().rarity(Rarity.COMMON))));

        SAPWOOD_BLADE = register((String) "sapwood_blade", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "Energy Recharge", "6.7%", "Forest Sanctuary", "After triggering Burning, Quicken, Aggravate, Spread, Bloom, Lunar-Bloom, Hyperbloom, or Burgeon, a Leaf of Consciousness will be created around the character for a maximum of 10s. When picked up, the Leaf will grant the character 60 Elemental Mastery for 12s. Only 1 Leaf can be generated this way every 20s. This effect can still be triggered if the character is not on the field. The Leaf of Consciousness' effect cannot stack.", new Item.Settings().rarity(Rarity.COMMON))));

        SERENITYS_CALL = register((String) "serenitys_call", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 41, "Energy Recharge", "13.3%", "Solemn Silence", "Upon causing an Elemental Reaction, increases Max HP by 16% for 12s. Moonsign: Ascendant Gleam: Max HP from this effect is further increased by 16%. This effect can be triggered even if the equipping character is off-field.", new Item.Settings().rarity(Rarity.COMMON))));

        SILVER_LIGHT = register((String) "silver_light", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "ATK", "9%", "Radiance on the Water", "Increases Elemental Mastery by 52 for 12s after Elemental Skill use. Max 2 stacks, and each stack's duration is independent of the others.", new Item.Settings().rarity(Rarity.COMMON))));

        STURDY_BONE = register((String) "sturdy_bone", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "ATK", "6%", "Trapper's Pride", "Sprint or Alternate Sprint Stamina Consumption decreased by 15%. Additionally, after using Sprint or Alternate Sprint, Normal Attack DMG is increased by 16% of ATK. This effect expires after triggering 18 times or 7s.", new Item.Settings().rarity(Rarity.COMMON))));

        SWORD_OF_DESCENSION = register((String) "sword_of_descension", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 39, "ATK", "7.7%", "Descension", "Effective only on the following platform:\n" + "\"PlayStation™Network\"\n" + "Hitting enemies with Normal or Charged Attacks grants a 50% chance to deal 200% ATK as DMG in a small AoE. This effect can only occur once every 10s. Additionally, if the Traveler equips the Sword of Descension, their ATK is increased by 66.", new Item.Settings().rarity(Rarity.COMMON))));

        SWORD_OF_NARZISSENKREUZ = register((String) "sword_of_narzissenkreuz", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "ATK", "9%", "Hero's Blade", "When the equipping character does not have an Arkhe: When Normal Attacks, Charged Attacks, or Plunging Attacks strike, a Pneuma or Ousia energy blast will be unleashed, dealing 160% of ATK as DMG. This effect can be triggered once every 12s. The energy blast type is determined by the current type of the Sword of Narzissenkreuz.", new Item.Settings().rarity(Rarity.COMMON))));

        THE_ALLEY_FLASH = register((String) "the_alley_flash", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 45, "Elemental Mastery", "12", "Itinerant Hero", "Increases DMG dealt by the character equipping this weapon by 12%. Taking DMG disables this effect for 5s.", new Item.Settings().rarity(Rarity.COMMON))));

        THE_BLACK_SWORD = register((String) "the_black_sword", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "CRIT Rate", "6%", "Justice", "Increases DMG dealt by Normal and Charged Attacks by 20%.\n" + "Additionally, regenerates 60% of ATK as HP when Normal and Charged Attacks score a CRIT Hit. This effect can occur once every 5s.", new Item.Settings().rarity(Rarity.COMMON))));

        THE_DOCKHANDS_ASSISTANT = register((String) "the_dockhands_assistant", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "HP", "9%", "Sea Shanty", "When the wielder is healed or heals others, they will gain a Stoic's Symbol that lasts 30s, up to a maximum of 3 Symbols. When using their Elemental Skill or Burst, all Symbols will be consumed and the Roused effect will be granted for 10s. For each Symbol consumed, gain 40 Elemental Mastery, and 2s after the effect occurs, 2 Energy per Symbol consumed will be restored for said character. The Roused effect can be triggered once every 15s, and Symbols can be gained even when the character is not on the field.", new Item.Settings().rarity(Rarity.COMMON))));

        THE_FLUTE = register((String) "the_flute", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "ATK", "9%", "Chord", "Normal or Charged Attacks grant a Harmonic on hits. Gaining 5 Harmonics triggers the power of music and deals 100% ATK DMG to surrounding enemies. Harmonics last up to 30s, and a maximum of 1 can be gained every 0.5s.", new Item.Settings().rarity(Rarity.COMMON))));

        TOUKABOU_SHIGURE = register((String) "toukabou_shigure", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "Elemental Mastery", "36", "Kaidan: Rainfall Earthbinder", "After an attack hits opponents, it will inflict an instance of Cursed Parasol upon one of them for 10s. This effect can be triggered once every 15s. If this opponent is defeated during Cursed Parasol's duration, Cursed Parasol's CD will be refreshed immediately. The character wielding this weapon will deal 16% more DMG to the opponent affected by Cursed Parasol.", new Item.Settings().rarity(Rarity.COMMON))));

        WOLF_FANG = register((String) "wolf_fang", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "CRIT Rate", "6%", "Northwind Wolf", "DMG dealt by Elemental Skill and Elemental Burst is increased by 16%. When an Elemental Skill hits an opponent, its CRIT Rate will be increased by 2%. When an Elemental Burst hits an opponent, its CRIT Rate will be increased by 2%. Both of these effects last 10s separately, have 4 max stacks, and can be triggered once every 0.1s.", new Item.Settings().rarity(Rarity.COMMON))));

        XIPHOS_MOONLIGHT = register((String) "xiphos_moonlight", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "Elemental Mastery", "36", "Jinni's Whisper", "The following effect will trigger every 10s: The equipping character will gain 0.036% Energy Recharge for each point of Elemental Mastery they possess for 12s, with nearby party members gaining 30% of this buff for the same duration. Multiple instances of this weapon can allow this buff to stack. This effect will still trigger even if the character is not on the field.", new Item.Settings().rarity(Rarity.COMMON))));


        //3-Star Sword
        COOL_STEEL = register((String) "cool_steel", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.THREE_STAR, 39, "ATK", "7.7%", "Bane of Water and Ice", "Increases DMG against opponents affected by Hydro or Cryo by 12%.", new Item.Settings().rarity(Rarity.COMMON))));

        DARK_IRON_SWORD = register((String) "dark_iron_sword", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.THREE_STAR, 39, "Elemental Mastery", "31", "Overloaded", "Upon causing an Overloaded, Superconduct, Stellar-Conduct, Electro-Charged, Quicken, Aggravate, Hyperbloom, Lunar-Charged, or Electro-infused Swirl reaction, ATK is increased by 20% for 12s.", new Item.Settings().rarity(Rarity.COMMON))));

        FILLET_BLADE = register((String) "fillet_blade", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.THREE_STAR, 39, "ATK", "7.7%", "Gash", "On hit, has 50% chance to deal 240% ATK DMG to a single enemy. Can only occur once every 15s.", new Item.Settings().rarity(Rarity.COMMON))));

        HARBINGER_OF_DAWN = register((String) "harbinger_of_dawn", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.THREE_STAR, 39, "CRIT DMG", "10.2%", "Vigorous", "When HP is above 90%, increases CRIT Rate by 14%.", new Item.Settings().rarity(Rarity.COMMON))));

        SKYRIDER_SWORD = register((String) "skyrider_sword", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.THREE_STAR, 38, "Energy Recharge", "11.3%", "Determination", "Using an Elemental Burst grants a 12% increase in ATK and Movement SPD for 15s.", new Item.Settings().rarity(Rarity.COMMON))));

        TRAVELERS_HANDY_SWORD = register((String) "travelers_handy_sword", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.THREE_STAR, 40, "DEF", "6.4%", "Journey", "Each Elemental Orb or Particle collected restores 1% HP.", new Item.Settings().rarity(Rarity.COMMON))));


        //2-Star Sword
        SILVER_SWORD = register((String) "silver_sword", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.TWO_STAR, 33, "", "", "", "", new Item.Settings().rarity(Rarity.COMMON))));


        //1-Star Sword
        DULL_BLADE = register((String) "dull_blade", (Item)
                (new SwordWeaponItem(ILeyLinesWeaponRarity.ONE_STAR, 23, "", "", "", "", new Item.Settings().rarity(Rarity.COMMON))));



        //Claymores
        //5-Star Claymore
        A_TEASPOON_OF_TRANSCENDENCE = register((String) "a_teaspoon_of_transcendence", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 48, "CRIT DMG", "9.6%", "White Fairy's Queening", "ATK increased by 28%.\n" + "Additionally, each time the equipping character hits an opponent with their Charged Attack, they attain \"Surmount\" for a short time: their Stellar-Conduct and Stellar Swirl DMG is increased by 16% for 5s. This effect can stack once every 0.2s, max 3 stacks.", new Item.Settings().rarity(Rarity.COMMON))));

        A_THOUSAND_BLAZING_SUNS = register((String) "a_thousand_blazing_suns", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 49, "CRIT Rate", "2.4%", "Sunset Reignites the Dawn", "Gain the \"Scorching Brilliance\" effect when using an Elemental Skill or Burst: CRIT DMG increased by 20% and ATK increased by 28% for 6s. This effect can trigger once every 10s.\n" + "While a \"Scorching Brilliance\" instance is active, its duration is increased by 2s after Normal or Charged attacks deal Elemental DMG. This effect can trigger once every second, and the max duration increase is 6s.\n" + "Additionally, when the equipping character is in the Nightsoul's Blessing state, \"Scorching Brilliance\" effects are increased by 75%, and its duration will not count down when the equipping character is off—field.", new Item.Settings().rarity(Rarity.COMMON))));

        BEACON_OF_THE_REED_SEA = register((String) "beacon_of_the_reed_sea", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 46, "CRIT Rate", "7.2%", "Desert Watch", "After the character's Elemental Skill hits an opponent, their ATK will be increased by 20% for 8s. After the character takes DMG, their ATK will be increased by 20% for 8s. The 2 aforementioned effects can be triggered even when the character is not on the field. Additionally, when not protected by a shield, the character's Max HP will be increased by 32%.", new Item.Settings().rarity(Rarity.COMMON))));

        FANG_OF_THE_MOUNTAIN_KING = register((String) "fang_of_the_mountain_king", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 49, "CRIT Rate", "2.4%", "Turquoise Hunt", "Gain 1 stack of Canopy's Favor after hitting an opponent with an Elemental Skill. This can be triggered once every 0.5s. After a nearby party member triggers a Burning or Burgeon reaction, the equipping character will gain 3 stacks. This effect can be triggered once every 2s and can be triggered even when the triggering party member is off-field. Canopy's Favor: Elemental Skill and Burst DMG is increased by 10% for 6s. Max 6 stacks. Each stack is counted independently.", new Item.Settings().rarity(Rarity.COMMON))));

        GEST_OF_THE_MIGHTY_WOLF = register((String) "gest_of_the_mighty_wolf", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 46, "CRIT Rate", "7.2%", "Indomitable Chivalry", "Increase ATK SPD by 10%. Every time the equipping character's Normal Attack(s) hit opponent(s), when they cast their Elemental Skill, or when they begin their Charged Attack(s), gain 1/2/2 stacks of Four Winds' Hymn respectively: DMG dealt is increased by 7.5%, for 4s. Max 4 stacks. This effect can be triggered once every 0.01s.\n" + "Additionally, when the team has the \"Hexerei: Secret Rite\" effect, each stack of Four Winds' Hymn will increase the CRIT DMG of the equipping character by 7.5%.", new Item.Settings().rarity(Rarity.COMMON))));

        REDHORN_STONETHRESHER = register((String) "redhorn_stonethresher", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 44, "CRIT DMG", "19.2%", "Gokadaiou Otogibanashi", "DEF is increased by 28%. Normal and Charged Attack DMG is increased by 40% of DEF.", new Item.Settings().rarity(Rarity.COMMON))));

        SKYWARD_PRIDE = register((String) "skyward_pride", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 48, "Energy Recharge", "8%", "Sky-ripping Dragon Spine", "Increases all DMG by 8%. After using an Elemental Burst, a vacuum blade that does 80% of ATK as DMG to opponents along its path will be created when Normal or Charged Attacks hit. Lasts for 20s or 8 vacuum blades.", new Item.Settings().rarity(Rarity.COMMON))));

        SONG_OF_BROKEN_PINES = register((String) "song_of_broken_pines", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 49, "Physical DMG Bonus", "4.5%", "Rebel's Banner-Hymn", "A part of the \"Millennial Movement\" that wanders amidst the winds.\n" + "Increases ATK by 16%, and when Normal or Charged Attacks hit opponents, the character gains a Sigil of Whispers. This effect can be triggered once every 0.3s.\n" + "When you possess four Sigils of Whispers, all of them will be consumed and all nearby party members will obtain the \"Millennial Movement: Banner-Hymn\" effect for 12s.\n" + "\"Millennial Movement: Banner-Hymn\" increases Normal ATK SPD by 12% and increases ATK by 20%. Once this effect is triggered, you will not gain Sigils of Whispers for 20s.\n" + "Of the many effects of the \"Millennial Movement\", buffs of the same type will not stack.", new Item.Settings().rarity(Rarity.COMMON))));

        THE_UNFORGED = register((String) "the_unforged", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 46, "ATK", "10.8%", "Golden Majesty", "Increases Shield Strength by 20%. Scoring hits on opponents increases ATK by 4% for 8s. Max 5 stacks. Can only occur once every 0.3s. While protected by a shield, this ATK increase effect is increased by 100%.", new Item.Settings().rarity(Rarity.COMMON))));

        VERDICT = register((String) "verdict", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 48, "CRIT Rate", "4.8%", "Many Oaths of Dawn and Dusk", "Increases ATK by 20%. When characters in your party obtain Elemental Shards from Crystallize or trigger Lunar-Crystallize reactions, the equipping character will gain 1 Seal, increasing Elemental Skill DMG by 18%. The Seal lasts for 15s, and the equipped may have up to 2 Seals at once. All of the equipper's Seals will disappear 0.2s after their Elemental Skill deals DMG. Up to 1 Seal may be obtained every second through the Lunar-Crystallize reaction.", new Item.Settings().rarity(Rarity.COMMON))));

        WOLFS_GRAVESTONE = register((String) "wolfs_gravestone", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 46, "ATK", "10.8%", "Wolfish Tracker", "Increases ATK by 20%. On hit, attacks against opponents with less than 30% HP increase all party members' ATK by 40% for 12s. Can only occur once every 30s.", new Item.Settings().rarity(Rarity.COMMON))));


        //4-Star Claymore
        ULTIMATE_OVERLORDS_MEGA_MAGIC_SWORD = register((String) "ultimate_overlords_mega_magic_sword", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "Energy Recharge", "6.7%", "Melussistance!", "ATK increased by 12%. That's not all! The support from all Melusines you've helped in Merusea Village fills you with strength! Based on the number of them you've helped, your ATK is increased by up to an additional 12%.", new Item.Settings().rarity(Rarity.COMMON))));

        AKUOUMARU = register((String) "akuoumaru", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "ATK", "9%", "Watatsumi Wavewalker", "For every point of the entire party's combined maximum Energy capacity, the Elemental Burst DMG of the character equipping this weapon is increased by 0.12%. A maximum of 40% increased Elemental Burst DMG can be achieved this way.", new Item.Settings().rarity(Rarity.COMMON))));

        BLACKCLIFF_SLASHER = register((String) "blackcliff_slasher", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "CRIT DMG", "12%", "Press the Advantage", "After defeating an opponent, ATK is increased by 12% for 30s. This effect has a maximum of 3 stacks, and the duration of each stack is independent of the others.", new Item.Settings().rarity(Rarity.COMMON))));

        BLADE_OF_ATONEMENT = register((String) "blade_of_atonement", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "ATK", "6%", "Repentance and Redemption", "Triggering an Elemental Reaction increases the equipping character's Elemental Mastery by 64 for 12s, while triggering a Stellar Glimmer reaction increases their ATK by 16% for 12s. The aforementioned effects can trigger even when the character is not on the field.", new Item.Settings().rarity(Rarity.COMMON))));

        EARTH_SHAKER = register((String) "earth_shaker", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "ATK", "6%", "Oath of Qhapaq Nan", "After a party member triggers a Pyro-related reaction, the equipping character's Elemental Skill DMG is increased by 16% for 8s. This effect can be triggered even when the triggering party member is not on the field.", new Item.Settings().rarity(Rarity.COMMON))));

        FAVONIUS_GREATSWORD = register((String) "favonius_greatsword", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 41, "Energy Recharge", "13.3%", "Windfall", "CRIT hits have a 60% chance to generate a small amount of Elemental Particles, which will regenerate 6 Energy for the character. Can only occur once every 12s.", new Item.Settings().rarity(Rarity.COMMON))));

        FLAME_FORGED_INSIGHT = register((String) "flame_forged_insight", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "Elemental Mastery", "36", "Mind in Bloom", "When Electro-Charged, Lunar-Charged, Bloom, Lunar-Bloom, Crystallize or Lunar-Crystallize is triggered, restore 12 Elemental Energy and increase Elemental Mastery by 60 for 15 seconds. This effect can be triggered once every 15s and can be triggered even when the equipping character is off-field.", new Item.Settings().rarity(Rarity.COMMON))));

        FOREST_REGALIA = register((String) "forest_regalia", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "Energy Recharge", "6.7%", "Forest Sanctuary", "After triggering Burning, Quicken, Aggravate, Spread, Bloom, Lunar-Bloom, Hyperbloom, or Burgeon, a Leaf of Consciousness will be created around the character for a maximum of 10s. When picked up, the Leaf will grant the character 60 Elemental Mastery for 12s. Only 1 Leaf can be generated this way every 20s. This effect can still be triggered if the character is not on the field. The Leaf of Consciousness' effect cannot stack.", new Item.Settings().rarity(Rarity.COMMON))));

        FORGED_BY_THE_GOLDEN_MELODY = register((String) "forged_by_the_golden_melody", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "CRIT Rate", "6%", "Day and Night in Counterpoint", "Every 10s, the equipping character plays a \"Harmonic Movement\" of the corresponding type for a boost in the following order: +18% ATK > +120 Elemental Mastery > +28% Stellar Glimmer reaction DMG. Each instance of Harmonic Movement lasts 10s. This effect can trigger even when the equipping character is not on the field.\n" + "Triggering a Stellar Glimmer reaction will also grant an additional 12-second instance of \"Harmonic Movement: Contrapuntal\" with the same effects as the Harmonic Movement active when Stellar Glimmer is triggered. This effect stacks with the original Harmonic Movement effect, and can trigger once every 12s.", new Item.Settings().rarity(Rarity.COMMON))));

        FRUITFUL_HOOK = register((String) "fruitful_hook", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "ATK", "6%", "The Weight of Falling Branches", "Increase Plunging Attack CRIT Rate by 16%; After a Plunging Attack hits an opponent, Normal, Charged, and Plunging Attack DMG increased by 16% for 10s.", new Item.Settings().rarity(Rarity.COMMON))));

        KATSURAGIKIRI_NAGAMASA = register((String) "katsuragikiri_nagamasa", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "Energy Recharge", "10.0%", "Samurai Conduct", "Increases Elemental Skill DMG by 6%. After Elemental Skill hits an opponent, the character loses 3 Energy but regenerates 3 Energy every 2s for the next 6s. This effect can occur once every 10s. Can be triggered even when the character is not on the field.", new Item.Settings().rarity(Rarity.COMMON))));

        LITHIC_BLADE = register((String) "lithic_blade", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "ATK", "9%", "Lithic Axiom: Unity", "For every character in the party who hails from Liyue, the character who equips this weapon gains 7% ATK increase and 3% CRIT Rate increase. This effect stacks up to 4 times.", new Item.Settings().rarity(Rarity.COMMON))));

        LUXURIOUS_SEA_lORD = register((String) "luxurious_sea_lord", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 41, "ATK", "12%", "Oceanic Victory", "Increases Elemental Burst DMG by 12%. When Elemental Burst hits opponents, there is a 100% chance of summoning a huge onrush of tuna that deals 100% ATK as AoE DMG. This effect can occur once every 15s.", new Item.Settings().rarity(Rarity.COMMON))));

        MAILED_FLOWER = register((String) "mailed_flower", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "Elemental Mastery", "24", "Whispers of Wind and Flower", "Within 8s after the character's Elemental Skill hits an opponent or the character triggers an Elemental Reaction, their ATK and Elemental Mastery will be increased by 12% and 48 respectively.", new Item.Settings().rarity(Rarity.COMMON))));

        MAKHAIRA_AQUAMARINE = register((String) "makhaira_aquamarine", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "Elemental Mastery", "36", "Desert Pavilion", "The following effect will trigger every 10s: The equipping character will gain 24% of their Elemental Mastery as bonus ATK for 12s, with nearby party members gaining 30% of this buff for the same duration. Multiple instances of this weapon can allow this buff to stack. This effect will still trigger even if the character is not on the field.", new Item.Settings().rarity(Rarity.COMMON))));

        MASTER_KEY = register((String) "master_key", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 41, "Energy Recharge", "13.3%", "Fall Into Place", "Upon causing an Elemental Reaction, increases Elemental Mastery by 60 for 12s. Moonsign: Ascendant Gleam: Elemental Mastery from this effect is further increased by 60. This effect can be triggered even if the equipping character is off-field.", new Item.Settings().rarity(Rarity.COMMON))));

        PORTABLE_POWER_SAW = register((String) "portable_power_saw", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 41, "HP", "12%", "Sea Shanty", "When the wielder is healed or heals others, they will gain a Stoic's Symbol that lasts 30s, up to a maximum of 3 Symbols. When using their Elemental Skill or Burst, all Symbols will be consumed and the Roused effect will be granted for 10s. For each Symbol consumed, gain 40 Elemental Mastery, and 2s after the effect occurs, 2 Energy per Symbol consumed will be restored for said character. The Roused effect can be triggered once every 15s, and Symbols can be gained even when the character is not on the field.", new Item.Settings().rarity(Rarity.COMMON))));

        PROTOTYPE_ARCHAIC = register((String) "prototype_archaic", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "ATK", "6%", "Crush", "On hit, Normal or Charged Attacks have a 50% chance to deal an additional 240% ATK DMG to opponents within a small AoE. Can only occur once every 15s.", new Item.Settings().rarity(Rarity.COMMON))));

        RAINSLASHER = register((String) "rainslasher", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "Elemental Mastery", "36", "Bane of Storm and Tide", "Increases DMG against opponents affected by Hydro or Electro by 20%.", new Item.Settings().rarity(Rarity.COMMON))));

        ROYAL_GREATSWORD = register((String) "royal_greatsword", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "ATK", "6%", "Focus", "Upon dealing damage to an opponent, increases CRIT Rate by 8%. Max 5 stacks. A CRIT hit removes all existing stacks.", new Item.Settings().rarity(Rarity.COMMON))));

        SACRIFICIAL_GREATSWORD = register((String) "sacrificial_greatsword", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "Energy Recharge", "6.7%", "Composed", "After dealing damage to an opponent with an Elemental Skill, the skill has a 40% chance to end its own CD. Can only occur once every 30s.", new Item.Settings().rarity(Rarity.COMMON))));

        SERPENT_SPINE = register((String) "serpent_spine", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "CRIT Rate", "6%", "Wavesplitter", "Every 4s a character is on the field, they will deal 6% more DMG and take 3% more DMG. This effect has a maximum of 5 stacks and will not be reset if the character leaves the field, but will be reduced by 1 stack when the character takes DMG.", new Item.Settings().rarity(Rarity.COMMON))));

        SNOW_TOMBED_STARSILVER = register((String) "snow_tombed_starsilver", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "Physical DMG Bonus", "7.5%", "Frost Burial", "Hitting an opponent with Normal and Charged Attacks has a 60% chance of forming and dropping an Everfrost Icicle above them, dealing AoE DMG equal to 80% of ATK. Opponents affected by Cryo are instead dealt DMG equal to 200% of ATK. Can only occur once every 10s.", new Item.Settings().rarity(Rarity.COMMON))));

        TALKING_STICK = register((String) "talking_stick", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "CRIT Rate", "4%", "\"The Silver Tongue\"", "ATK will be increased by 16% for 15s after being affected by Pyro. This effect can be triggered once every 12s. All Elemental DMG Bonus will be increased by 12% for 15s after being affected by Hydro, Cryo, Electro, or Dendro. This effect can be triggered once every 12s.", new Item.Settings().rarity(Rarity.COMMON))));

        THE_BELL = register((String) "the_bell", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "HP", "9%", "Rebellious Guardian", "Taking DMG generates a shield which absorbs DMG up to 20% of max HP. This shield lasts for 10s or until broken, and can only be triggered once every 45s. While protected by a shield, the character gains 12% increased DMG.", new Item.Settings().rarity(Rarity.COMMON))));

        TIDAL_SHADOW = register((String) "tidal_shadow", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "ATK", "9%", "White Cruising Wave", "After the wielder is healed, ATK will be increased by 24% for 8s. This can be triggered even when the character is not on the field.", new Item.Settings().rarity(Rarity.COMMON))));

        WHITEBLIND = register((String) "whiteblind", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "DEF", "11.3%", "Infusion Blade", "On hit, Normal or Charged Attacks increase ATK and DEF by 6% for 6s. Max 4 stacks (24% total). Can only occur once every 0.5s.", new Item.Settings().rarity(Rarity.COMMON))));


        //3-Star Claymore
        BLOODTAINTED_GREATSWORD = register((String) "bloodtainted_greatsword", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.THREE_STAR, 38, "Elemental Mastery", "41", "Bane of Fire and Thunder", "Increases DMG against opponents affected by Pyro or Electro by 12%.", new Item.Settings().rarity(Rarity.COMMON))));

        DEBATE_CLUB = register((String) "debate_club", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.THREE_STAR, 39, "ATK", "7.7%", "Blunt Conclusion", "After using an Elemental Skill, Normal or Charged Attacks, on hit, deal an additional 60% ATK DMG in a small area. Effect lasts 15s. DMG can only occur once every 3s.", new Item.Settings().rarity(Rarity.COMMON))));

        FERROUS_SHADOW = register((String) "ferrous_shadow", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.THREE_STAR, 39, "HP", "7.7%", "Unbending", "When HP falls below 70%, increases Charged Attack DMG by 30%, and Charged Attacks become much harder to interrupt.", new Item.Settings().rarity(Rarity.COMMON))));

        SKYRIDER_GREATSWORD = register((String) "skyrider_greatsword", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.THREE_STAR, 39, "Physical DMG Bonus", "9.6%", "Courage", "On hit, Normal or Charged Attacks increase ATK by 6% for 6s. Max 4 stacks. Can only occur once every 0.5s.", new Item.Settings().rarity(Rarity.COMMON))));

        WHITE_IRON_GREATSWORD = register((String) "white_iron_greatsword", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.THREE_STAR, 39, "DEF", "9.6%", "Cull the Weak", "Defeating an opponent restores 8% HP.", new Item.Settings().rarity(Rarity.COMMON))));


        //2-Star Claymore
        OLD_MERCS_PAL = register((String) "old_mercs_pal", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.TWO_STAR, 33, "", "", "", "", new Item.Settings().rarity(Rarity.COMMON))));


        //1-Star Claymore
        WASTER_GREATSWORD = register((String) "waster_greatsword", (Item)
                (new ClaymoreWeaponItem(ILeyLinesWeaponRarity.ONE_STAR, 23, "", "", "", "", new Item.Settings().rarity(Rarity.COMMON))));



        //Polearms
        //5-Star Polearm
        BLOODSOAKED_RUINS = register((String) "bloodsoaked_ruins", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 48, "CRIT Rate", "4.8%", "Mournful Tribute", "For 3.5s after using an Elemental Burst, the equipping character's Lunar-Charged DMG dealt to opponents is increased by 36%. Additionally, after triggering a Lunar-Charged reaction, the equipping character will gain Requiem of Ruin: CRIT DMG is increased by 28% for 6s. They will also regain 12 Elemental Energy. Elemental Energy can be restored this way once every 14s.", new Item.Settings().rarity(Rarity.COMMON))));

        CALAMITY_QUELLER = register((String) "calamity_queller", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 49, "ATK", "3.6%", "Extinguishing Precept", "Gain 12% All Elemental DMG Bonus. Obtain Consummation for 20s after using an Elemental Skill, causing ATK to increase by 3.2% per second. This ATK increase has a maximum of 6 stacks. When the character equipped with this weapon is not on the field, Consummation's ATK increase is doubled.", new Item.Settings().rarity(Rarity.COMMON))));

        CRIMSON_MOONS_SEMBLANCE = register((String) "crimson_moons_semblance", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 48, "CRIT Rate", "4.8%", "Ashen Sun's Shadow", "Grants a Bond of Life equal to 25% of Max HP when a Charged Attack hits an opponent. This effect can be triggered up to once every 14s. In addition, when the equipping character has a Bond of Life, they gain a 12% DMG Bonus; if the value of the Bond of Life is greater than or equal to 30% of Max HP, then gain an additional 24% DMG.", new Item.Settings().rarity(Rarity.COMMON))));

        DISASTER_AND_REMORSE = register((String) "disaster_and_remorse", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 48, "CRIT Rate", "4.8%", "Dolorous Stroke", "- After the equipping character uses an Elemental Skill, they gain \"Path of Conflict\" for 17s, as well as \"Unforgivable\" and \"Irreparable\" for 3s each. This effect can trigger once every 18s.    - Unforgivable: Increases the equipping character's Normal Attack and Charged Attack DMG by 40%.    - Irreparable: Increases the equipping character's Elemental Skill and Elemental Burst DMG by 40%.    - While Path of Conflict is in effect, when the equipping character hits an opponent with a Normal Attack or Charged Attack, Irreparable's duration will be increased by 1s. When the equipping character hits an opponent with their Elemental Skill or Elemental Burst, Unforgivable's duration will be increased by 1s. Each of the above effects can be triggered once every 0.1s. When Path of Conflict ends or the equipping character leaves the field, both Unforgivable and Irreparable will be removed.    - Hexerei: Secret Rite: The above DMG boosts are increased by 75%.", new Item.Settings().rarity(Rarity.COMMON))));

        ENGULFING_LIGHTNING = register((String) "engulfing_lightning", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 46, "Energy Recharge", "12%", "Timeless Dream: Eternal Stove", "ATK increased by 28% of Energy Recharge over the base 100%. You can gain a maximum bonus of 80% ATK. Gain 30% Energy Recharge for 12s after using an Elemental Burst.", new Item.Settings().rarity(Rarity.COMMON))));

        FRACTURED_HALO = register((String) "fractured_halo", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 46, "CRIT DMG", "14.4%", "Purifying Crown", "After an Elemental Skill or Elemental Burst is used, ATK is increased by 24% for 20s. If the equipping character creates a Shield while this effect is active, they will gain the Electrifying Edict effect for 20s: All nearby party members deal 40% more Lunar-Charged DMG.", new Item.Settings().rarity(Rarity.COMMON))));

        LUMIDOUCE_ELEGY = register((String) "lumidouce_elegy", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 46, "CRIT Rate", "7.2%", "Bright Dawn Overture", "ATK increased by 15%. After the equipping character triggers Burning on an opponent or deals Dendro DMG to Burning opponents, the DMG dealt is increased by 18%. This effect lasts for 8s, max 2 stacks. When 2 stacks are reached or when the duration is refreshed at 2 stacks, restore 12 Energy. Energy can be restored this way once every 12s. The 2 aforementioned effects can be triggered even when the character is off-field.", new Item.Settings().rarity(Rarity.COMMON))));

        PRIMORDIAL_JADE_WINGED_SPEAR = register((String) "primordial_jade_winged_spear", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 48, "CRIT Rate", "4.8%", "Eagle Spear of Justice", "On hit, increases ATK by 3.2% for 6s. Max 7 stacks. This effect can only occur once every 0.3s. While in possession of the maximum possible stacks, DMG dealt is increased by 12%.", new Item.Settings().rarity(Rarity.COMMON))));

        SKYWARD_SPINE = register((String) "skyward_spine", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 48, "Energy Recharge", "8%", "Black Wing", "Increases CRIT Rate by 8% and increases Normal ATK SPD by 12%. Additionally, Normal and Charged Attacks hits on opponents have a 50% chance to trigger a vacuum blade that deals 40% of ATK as DMG in a small AoE. This effect can occur no more than once every 2s.", new Item.Settings().rarity(Rarity.COMMON))));

        STAFF_OF_HOMA = register((String) "staff_of_homa", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 46, "CRIT DMG", "14.4%", "Reckless Cinnabar", "HP increased by 20%. Additionally, provides an ATK Bonus based on 0.8% of the wielder's Max HP. When the wielder's HP is less than 50%, this ATK bonus is increased by an additional 1% of Max HP.", new Item.Settings().rarity(Rarity.COMMON))));

        STAFF_OF_THE_SCARLET_SANDS = register((String) "staff_of_the_scarlet_sands", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 44, "CRIT Rate", "9.6%", "Heat Haze at Horizon's End", "The equipping character gains 52% of their Elemental Mastery as bonus ATK. When an Elemental Skill hits opponents, the Dream of the Scarlet Sands effect will be gained for 10s: The equipping character will gain 28% of their Elemental Mastery as bonus ATK. Max 3 stacks.", new Item.Settings().rarity(Rarity.COMMON))));

        SYMPHONIST_OF_SCENTS = register((String) "symphonist_of_scents", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 46, "CRIT DMG", "14.4%", "Seasoned Symphony", "ATK is increased by 12%. When the equipping character is off-field, ATK is increased by an additional 12%. After initiating healing, the equipping character and the character(s) they have healed will obtain the \"Sweet Echoes\" effect, increasing their ATK by 32% for 3s. This effect can be triggered even if the equipping character is off-field.", new Item.Settings().rarity(Rarity.COMMON))));

        VORTEX_VANQUISHER = register((String) "vortex_vanquisher", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 46, "ATK", "10.8%", "Golden Majesty", "Increases Shield Strength by 20%. Scoring hits on opponents increases ATK by 4% for 8s. Max 5 stacks. Can only occur once every 0.3s. While protected by a shield, this ATK increase effect is increased by 100%.", new Item.Settings().rarity(Rarity.COMMON))));


        //4-Star Polearm
        THE_CATCH = register((String) "the_catch", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "Energy Recharge", "10.0%", "Shanty", "Increases Elemental Burst DMG by 16% and Elemental Burst CRIT Rate by 6%.", new Item.Settings().rarity(Rarity.COMMON))));

        BALLAD_OF_THE_FJORDS = register((String) "ballad_of_the_fjords", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "CRIT Rate", "6%", "Tales of the Tundra", "When there are at least 3 different Elemental Types in your party, Elemental Mastery will be increased by 120.", new Item.Settings().rarity(Rarity.COMMON))));

        BLACKCLIFF_POLE = register((String) "blackcliff_pole", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "CRIT DMG", "12%", "Press the Advantage", "After defeating an opponent, ATK is increased by 12% for 30s. This effect has a maximum of 3 stacks, and the duration of each stack is independent of the others.", new Item.Settings().rarity(Rarity.COMMON))));

        CRESCENT_PIKE = register((String) "crescent_pike", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "Physical DMG Bonus", "7.5%", "Infusion Needle", "After picking up an Elemental Orb/Particle, Normal and Charged Attacks deal an additional 20% ATK as DMG for 5s.", new Item.Settings().rarity(Rarity.COMMON))));

        DEATHMATCH = register((String) "deathmatch", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 41, "CRIT Rate", "8%", "Gladiator", "If there are at least 2 opponents nearby, ATK is increased by 16% and DEF is increased by 16%. If there are fewer than 2 opponents nearby, ATK is increased by 24%.", new Item.Settings().rarity(Rarity.COMMON))));

        DIALOGUES_OF_THE_DESERT_SAGES = register((String) "dialogues_of_the_desert_sages", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "HP", "9%", "Principle of Equilibrium", "When the wielder performs healing, restore 8 Energy. This effect can be triggered once every 10s and can occur even when the character is not on the field.", new Item.Settings().rarity(Rarity.COMMON))));

        DRAGONS_BANE = register((String) "dragons_bane", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 41, "Elemental Mastery", "48", "Bane of Flame and Water", "Increases DMG against opponents affected by Hydro or Pyro by 20%.", new Item.Settings().rarity(Rarity.COMMON))));

        DRAGONSPINE_SPEAR = register((String) "dragonspine_spear", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 41, "Physical DMG Bonus", "15%", "Frost Burial", "Hitting an opponent with Normal and Charged Attacks has a 60% chance of forming and dropping an Everfrost Icicle above them, dealing 80% AoE ATK DMG. Opponents affected by Cryo are dealt 200% ATK DMG instead by the icicle. Can only occur once every 10s.", new Item.Settings().rarity(Rarity.COMMON))));

        FAVONIUS_LANCE = register((String) "favonius_lance", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "Energy Recharge", "6.7%", "Windfall", "CRIT Hits have a 60% chance to generate a small amount of Elemental Particles, which will regenerate 6 Energy for the character. Can only occur once every 12s.", new Item.Settings().rarity(Rarity.COMMON))));

        FOOTPRINT_OF_THE_RAINBOW = register((String) "footprint_of_the_rainbow", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "DEF", "11.3%", "Pact of Flowing Springs", "Using an Elemental Skill increases DEF by 16% for 15s.", new Item.Settings().rarity(Rarity.COMMON))));

        FROSTBREATH = register((String) "frostbreath", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "Energy Recharge", "10.0%", "A Cast Real Far", "Triggering a Cryo or Hydro-related elemental reaction increases the equipping character's ATK by 20% for the next 15s, as well as regenerates 6 Elemental Energy for other members of their party. This effect can trigger once every 16s.", new Item.Settings().rarity(Rarity.COMMON))));

        KITAIN_CROSS_SPEAR = register((String) "kitain_cross_spear", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "Elemental Mastery", "24", "Samurai Conduct", "Increases Elemental Skill DMG by 6%. After Elemental Skill hits an opponent, the character loses 3 Energy but regenerates 3 Energy every 2s for the next 6s. This effect can occur once every 10s. Can be triggered even when the character is not on the field.", new Item.Settings().rarity(Rarity.COMMON))));

        LITHIC_SPEAR = register((String) "lithic_spear", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "ATK", "6%", "Lithic Axiom: Unity", "For every character in the party who hails from Liyue, the character who equips this weapon gains 7% ATK increase and a 3% CRIT Rate increase. This effect stacks up to 4 times.", new Item.Settings().rarity(Rarity.COMMON))));

        MISSIVE_WINDSPEAR = register((String) "missive_windspear", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "ATK", "9%", "The Wind Unattained", "Within 10s after an Elemental Reaction is triggered, ATK is increased by 12% and Elemental Mastery is increased by 48.", new Item.Settings().rarity(Rarity.COMMON))));

        MOONPIERCER = register((String) "moonpiercer", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "Elemental Mastery", "24", "Stillwood Moonshadow", "After triggering Burning, Quicken, Aggravate, Spread, Bloom, Lunar-Bloom, Hyperbloom, or Burgeon, a Leaf of Revival will be created around the character for a maximum of 10s. When picked up, the Leaf will grant the character 16% ATK for 12s. Only 1 Leaf can be generated this way every 20s. This effect can still be triggered if the character is not on the field.", new Item.Settings().rarity(Rarity.COMMON))));

        MOUNTAIN_BRACING_BOLT = register((String) "mountain_bracing_bolt", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "Energy Recharge", "6.7%", "Hope Beyond the Peaks", "Decreases Climbing Stamina Consumption by 15% and increases Elemental Skill DMG by 12%. Also, after other nearby party members use Elemental Skills, the equipping character's Elemental Skill DMG will also increase by 12% for 8s.", new Item.Settings().rarity(Rarity.COMMON))));

        PROSPECTORS_DRILL = register((String) "prospectors_drill", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "ATK", "6%", "Masons' Ditty", "When the wielder is healed or heals others, they will gain a Unity's Symbol that lasts 30s, up to a maximum of 3 Symbols. When using their Elemental Skill or Burst, all Symbols will be consumed and the Struggle effect will be granted for 10s. For each Symbol consumed, gain 3% ATK and 7% All Elemental DMG Bonus. The Struggle effect can be triggered once every 15s, and Symbols can be gained even when the character is not on the field.", new Item.Settings().rarity(Rarity.COMMON))));

        PROSPECTORS_SHOVEL = register((String) "prospectors_shovel", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "ATK", "9%", "Swift and Sure", "Electro-Charged DMG is increased by 48%, and Lunar-Charged DMG is increased by 12%. Moonsign: Ascendant Gleam: Lunar-Charged DMG is increased by an additional 12%.", new Item.Settings().rarity(Rarity.COMMON))));

        PROTOTYPE_STARGLITTER = register((String) "prototype_starglitter", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "Energy Recharge", "10.0%", "Magic Affinity", "After using an Elemental Skill, increases Normal and Charged Attack DMG by 8% for 12s. Max 2 stacks.", new Item.Settings().rarity(Rarity.COMMON))));

        RIGHTFUL_REWARD = register((String) "rightful_reward", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "HP", "6%", "Tip of the Spear", "When the wielder is healed, restore 8 Energy. This effect can be triggered once every 10s, and can occur even when the character is not on the field.", new Item.Settings().rarity(Rarity.COMMON))));

        ROYAL_SPEAR = register((String) "royal_spear", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "ATK", "6%", "Focus", "Upon dealing damage to an opponent, increases CRIT Rate by 8%. Max 5 stacks. A CRIT hit removes all existing stacks.", new Item.Settings().rarity(Rarity.COMMON))));

        SACRIFICERS_STAFF = register((String) "sacrificers_staff", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 45, "CRIT Rate", "2.0%", "Untainted Desire", "For 6s after an Elemental Skill hits an opponent, ATK is increased by 8% and Energy Recharge is increased by 6%. Max 3 stacks. This effect can be triggered even when the equipping character is off-field.", new Item.Settings().rarity(Rarity.COMMON))));

        SONG_OF_THE_VIGIL = register((String) "song_of_the_vigil", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "Elemental Mastery", "24", "Cadence of Days Gone By", "Triggering an Elemental Reaction regenerates 4 Elemental Energy for the equipping character. This effect can trigger once every 9s. On the other hand, triggering a Stellar Glimmer reaction increases their ATK by 20% for 12s. The aforementioned effects can trigger even when the character is not on the field.", new Item.Settings().rarity(Rarity.COMMON))));

        TAMAYURATEI_NO_OHANASHI = register((String) "tamayuratei_no_ohanashi", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "Energy Recharge", "6.7%", "Busybody's Running Light", "Increase ATK by 20% and Movement SPD by 10% for 10s when using an Elemental Skill.", new Item.Settings().rarity(Rarity.COMMON))));

        WAVEBREAKERS_FIN = register((String) "wavebreakers_fin", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 45, "ATK", "3%", "Watatsumi Wavewalker", "For every point of the entire party's combined maximum Energy capacity, the Elemental Burst DMG of the character equipping this weapon is increased by 0.12%. A maximum of 40% increased Elemental Burst DMG can be achieved this way.", new Item.Settings().rarity(Rarity.COMMON))));


        //3-Star Polearm
        BLACK_TASSEL = register((String) "black_tassel", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.THREE_STAR, 38, "HP", "10.2%", "Bane of the Soft", "Increases DMG against slimes by 40%.", new Item.Settings().rarity(Rarity.COMMON))));

        HALBERD = register((String) "halberd", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.THREE_STAR, 40, "ATK", "5.1%", "Heavy", "Normal Attacks deal an additional 160% DMG. Can only occur once every 10s.", new Item.Settings().rarity(Rarity.COMMON))));

        WHITE_TASSEL = register((String) "white_tassel", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.THREE_STAR, 39, "CRIT Rate", "5.1%", "Sharp", "Increases Normal Attack DMG by 24%.", new Item.Settings().rarity(Rarity.COMMON))));


        //2-Star Polearm
        IRON_POINT = register((String) "iron_point", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.TWO_STAR, 33, "", "", "", "", new Item.Settings().rarity(Rarity.COMMON))));


        //1-Star Polearm
        BEGINNERS_PROTECTOR = register((String) "beginners_protector", (Item)
                (new PolearmWeaponItem(ILeyLinesWeaponRarity.ONE_STAR, 23, "", "", "", "", new Item.Settings().rarity(Rarity.COMMON))));


        //Catalysts
        //5-Star Catalyst
        A_THOUSAND_FLOATING_DREAMS = register((String) "a_thousand_floating_dreams", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 44, "Elemental Mastery", "58", "A Thousand Nights' Dawnsong", "Party members other than the equipping character will provide the equipping character with buffs based on whether their Elemental Type is the same as the latter or not. If their Elemental Types are the same, increase Elemental Mastery by 32. If not, increase the equipping character's DMG Bonus from their Elemental Type by 10%. Each of the aforementioned effects can have up to 3 stacks. Additionally, all nearby party members other than the equipping character will have their Elemental Mastery increased by 40. Multiple such effects from multiple such weapons can stack.", new Item.Settings().rarity(Rarity.COMMON))));

        ANGELOS_HEPTADES = register((String) "angelos_heptades", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 49, "ATK", "3.6%", "Crown of the Final Scion", "- ATK is increased by 12%. After the equipping character creates a Shield, they gain \"Pathfinder's Light\" for 20s: Increases your active party member's DMG by 10% for every 1,000 ATK the equipping character has, up to a maximum of 26%. Additionally, when the equipping character creates a Shield, they will also gain \"Guide's Contentment\": Restores 14 Elemental Energy to the equipping character. The aforementioned effect can trigger once every 14s, and can also be triggered when any type of chest is opened outside of combat. The equipping character may trigger this effect even when they are an off-field.    - Hexerei: Secret Rite: When your own Hexerei character is off-field in the party, they will also gain 50% of the DMG increase from Pathfinder's Light.", new Item.Settings().rarity(Rarity.COMMON))));

        CASHFLOW_SUPERVISION = register((String) "cashflow_supervision", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 48, "CRIT Rate", "4.8%", "Golden Blood-Tide", "ATK is increased by 16%. When current HP increases or decreases, Normal Attack DMG is increased by 16%, Charged Attack DMG is increased by 14%, and Stellar-Conduct DMG is increased by 14% for 4s. Max 3 stacks. This effect can be triggered once every 0.3s. When the wielder has 3 stacks, ATK SPD will be increased by 8%.", new Item.Settings().rarity(Rarity.COMMON))));

        CRANES_ECHOING_CALL = register((String) "cranes_echoing_call", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 49, "ATK", "3.6%", "Cloudfall Axiom", "After the equipping character hits an opponent with a Plunging Attack, all nearby party members' Plunging Attacks will deal 28% increased DMG for 20s. When nearby party members hit opponents with Plunging Attacks, they will restore 2.5 Energy to the equipping character. Energy can be restored this way every 0.7s. This energy regain effect can be triggered even if the equipping character is not on the field.", new Item.Settings().rarity(Rarity.COMMON))));

        EVERLASTING_MOONGLOW = register((String) "everlasting_moonglow", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 46, "HP", "10.8%", "Byakuya Kougetsu", "Healing Bonus increased by 10%, Normal Attack DMG is increased by 1% of the Max HP of the character equipping this weapon. For 12s after using an Elemental Burst, Normal Attacks that hit opponents will restore 0.6 Energy. Energy can be restored this way once every 0.1s.", new Item.Settings().rarity(Rarity.COMMON))));

        HYMN_OF_THE_MAELSTROM = register((String) "hymn_of_the_maelstrom", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 44, "HP", "14.4%", "Rondo of Slumber", "Increases Healing Bonus by 4%\n" + "When performing healing, the equipping character gains the \"Vatsamonga's Vatic Vintage\" effect:\n" + "\n" + "    Increases Max HP by 4%.\n" + "    Increases your currently active party member's ATK by 0.4% for every 1,000 Max HP the equipping character has over 40,000. A maximum of 8% ATK can be gained in this way.\n" + "    This effect lasts 10s, max 3 stacks.\n" + "\n" + "When a party member triggers a Frozen or Stellar Swirl reaction, the aforementioned Max HP and ATK boosts will be increased by 75% for the next 5s.\n" + "This effect can triggered even when the equipping character is off-field.", new Item.Settings().rarity(Rarity.COMMON))));

        JADEFALLS_SPLENDOR = register((String) "jadefalls_splendor", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 46, "HP", "10.8%", "Primordial Jade Regalia", "For 3s after using an Elemental Burst or creating a shield, the equipping character can gain the Primordial Jade Regalia effect: Restore 4.5 Energy every 2.5s, and gain 0.3% Elemental DMG Bonus for their corresponding Elemental Type for every 1,000 Max HP they possess, up to 12%. Primordial Jade Regalia will still take effect even if the equipping character is not on the field.", new Item.Settings().rarity(Rarity.COMMON))));

        KAGURAS_VERITY = register((String) "kaguras_verity", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 46, "CRIT DMG", "14.4%", "Kagura Dance of the Sacred Sakura", "Using an Elemental Skill grants the Kagura Dance effect, increasing the wielding character's Elemental Skill DMG by 12% as well as their Stellar-Conduct DMG by 12% for 24s. Max 3 stacks. This character will gain a 12% All Elemental DMG Bonus when they possess 3 stacks.", new Item.Settings().rarity(Rarity.COMMON))));

        LOST_PRAYER_TO_THE_SACRED_WINDS = register((String) "lost_prayer_to_the_sacred_winds", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 46, "CRIT Rate", "7.2%", "Boundless Blessing", "Increases Movement SPD by 10%. When in battle, gain an 8% Elemental DMG Bonus every 4s. Max 4 stacks. Lasts until the character falls or leaves combat.", new Item.Settings().rarity(Rarity.COMMON))));

        MEMORY_OF_DUST = register((String) "memory_of_dust", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 46, "ATK", "10.8%", "Golden Majesty", "Increases Shield Strength by 20%. Scoring hits on opponents increases ATK by 4% for 8s. Max 5 stacks. Can only occur once every 0.3s. While protected by a shield, this ATK increase effect is increased by 100%", new Item.Settings().rarity(Rarity.COMMON))));

        NIGHTWEAVERS_LOOKING_GLASS = register((String) "nightweavers_looking_glass", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 44, "Elemental Mastery", "58", "Millennial Hymn", "When the equipping character's Elemental Skill deals Hydro or Dendro DMG, they will gain Prayer of the Far North: Elemental Mastery is increased by 60 for 4.5s. When nearby party members trigger Lunar-Bloom reactions, the equipping character gains New Moon Verse: Elemental Mastery is increased by 60 for 10s. When both Prayer of the Far North and New Moon Verse are in effect, all nearby party members' Bloom DMG is increased by 120%, their Hyperbloom and Burgeon DMG is increased by 80%, and their Lunar-Bloom DMG is increased by 40%. This effect cannot stack. The aforementioned effects can be triggered even if the equipping character is off-field.", new Item.Settings().rarity(Rarity.COMMON))));

        NOCTURNES_CURTAIN_CALL = register((String) "nocturnes_curtain_call", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 44, "CRIT DMG", "19.2%", "Ballad of the Crossroads", "Max HP increases by 10%. When triggering Lunar reactions or inflicting Lunar Reaction DMG on opponents, the equipping character will recover 14 Energy, and receive the Bountiful Sea's Sacred Wine effect for 12s: Max HP increases by an additional 14%, CRIT DMG from Lunar Reaction DMG increases by 60%. The Energy recovery effect can be triggered at most once every 18s, and can be triggered even when the equipping character is off-field.", new Item.Settings().rarity(Rarity.COMMON))));

        RELIQUARY_OF_TRUTH = register((String) "reliquary_of_truth", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 44, "CRIT DMG", "19.2%", "Essence of Falsity", "CRIT Rate is increased by 8%. When the equipping character unleashes an Elemental Skill, they gain the Secret of Lies effect: Elemental Mastery is increased by 80 for 12s. When the equipping character deals Lunar-Bloom DMG to an opponent, they gain the Moon of Truth effect: CRIT DMG is increased by 24% for 4s. When both the Secret of Lies and Moon of Truth effects are active at the same time, the results of both effects will be increased by 50%.", new Item.Settings().rarity(Rarity.COMMON))));

        SKYWARD_ATLAS = register((String) "skyward_atlas", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 48, "ATK", "7.2%", "Wandering Clouds", "Increases Elemental DMG Bonus by 12%. Normal Attack hits have a 50% chance to earn the favor of the clouds, which actively seek out nearby opponents to attack for 15s, dealing 160% ATK DMG. Can only occur once every 30s.", new Item.Settings().rarity(Rarity.COMMON))));

        STARCALLERS_WATCH = register((String) "starcallers_watch", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 44, "Elemental Mastery", "58", "Offering Unto Wind and Sun", "Increases Elemental Mastery by 100. Gain the \"Mirror of Night\" effect within 15s after the equipping character creates a shield: The current active party member deals 28% increased DMG to nearby opponents. You can gain the \"Mirror of Night\" effect once every 14s.", new Item.Settings().rarity(Rarity.COMMON))));

        SUNNY_MORNING_SLEEP_IN = register((String) "sunny_morning_sleep_in", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 44, "Elemental Mastery", "58", "Bathhouses, Hawks, and Narukami", "Elemental Mastery increases by 120 for 6s after triggering Swirl. Elemental Mastery increases by 96 for 9s after the wielder's Elemental Skill hits an opponent. Elemental Mastery increases by 32 for 30s after the wielder's Elemental Burst hits an opponent.", new Item.Settings().rarity(Rarity.COMMON))));

        SURFS_UP = register((String) "surfs_up", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 44, "CRIT DMG", "19.2%", "Aqua Remembrance", "Max HP increased by 20%. Once every 15s, for the 14s after using an Elemental Skill: Gain 4 Scorching Summer stacks. Each stack increases Normal Attack DMG by 12%. For the duration of the effect, every 1.5s, lose 1 stack after a Normal Attack hits an opponent; once every 1.5s, gain 1 stack after triggering a Vaporize reaction on an opponent. Max 4 Scorching Summer stacks.", new Item.Settings().rarity(Rarity.COMMON))));

        TOME_OF_THE_ETERNAL_FLOW = register((String) "tome_of_the_eternal_flow", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 44, "CRIT DMG", "19.2%", "Aeon Wave", "HP is increased by 16%. When current HP increases or decreases, Charged Attack DMG will be increased by 14% for 4s. Max 3 stacks, can be triggered once every 0.3s. When you have 3 stacks or refresh a third stack's duration, 8 Energy will be restored. This Energy restoration effect can be triggered once every 12s.", new Item.Settings().rarity(Rarity.COMMON))));

        TULAYTULLAHS_REMEMBRANCE = register((String) "tulaytullahs_remembrance", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 48, "CRIT DMG", "9.6%", "Bygone Azure Teardrop", "Normal Attack SPD is increased by 10%. After the wielder unleashes an Elemental Skill, Normal Attack DMG will increase by 4.8% every second for 14s. After this character hits an opponent with a Normal Attack during this duration, Normal Attack DMG will be increased by 9.6%. This increase can be triggered once every 0.3s. The maximum Normal Attack DMG increase per single duration of the overall effect is 48%. The effect will be removed when the wielder leaves the field, and using the Elemental Skill again will reset all DMG buffs.", new Item.Settings().rarity(Rarity.COMMON))));

        VIVID_NOTIONS = register((String) "vivid_notions", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 48, "CRIT DMG", "9.6%", "Falling Rainbow's Wish", "ATK is increased by 28%. When you use a Plunging Attack, you will gain the \"Dawn's First Hue\" effect: Plunging Attack CRIT DMG is increased by 28%. When you use an Elemental Skill or Burst, you will gain the \"Twilight's Splendor\" effect: Plunging Attack CRIT DMG is increased by 40%. The two effects above each last for 15s, and will be canceled 0.1s after the ground impact hits a target.", new Item.Settings().rarity(Rarity.COMMON))));


        //4-Star Catalyst
        ASH_GRAVEN_DRINKING_HORN = register((String) "ash_graven_drinking_horn", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "HP", "9%", "Tupac's Grip", "When an attack hits an opponent, deal AoE DMG equal to 40% of Max HP at the target location. This effect can be triggered once every 15s.", new Item.Settings().rarity(Rarity.COMMON))));

        BALLAD_OF_THE_BOUNDLESS_BLUE = register((String) "ballad_of_the_boundless_blue", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "Energy Recharge", "6.7%", "Azure Skies", "Within 6s after Normal or Charged Attacks hit an opponent, Normal Attack DMG will be increased by 8% and Charged Attack DMG will be increased by 6%. Max 3 stacks. This effect can be triggered once every 0.3s.", new Item.Settings().rarity(Rarity.COMMON))));

        BLACKCLIFF_AGATE = register((String) "blackcliff_agate", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "CRIT DMG", "12%", "Press the Advantage", "After defeating an opponent, ATK is increased by 12% for 30s. This effect has a maximum of 3 stacks, and the duration of each stack is independent of the others.", new Item.Settings().rarity(Rarity.COMMON))));

        BLACKMARROW_LANTERN = register((String) "blackmarrow_lantern", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 41, "Elemental Mastery", "48", "Token of Covenant", "Bloom DMG is increased by 48%, and Lunar-Bloom DMG is increased by 12%. Moonsign: Ascendant Gleam: Lunar-Bloom DMG is increased by an additional 12%.", new Item.Settings().rarity(Rarity.COMMON))));

        CLASH_OF_KINGS = register((String) "clash_of_kings", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "CRIT Rate", "6%", "Without Heed for Day nor Night", "Using an Elemental Skill grants the equipping character \"Laws of the Board,\" which increases their ATK by 20% and their Elemental Mastery by 100. This effect lasts 6s and can trigger once every 12s. Does not stack. The duration of this effect will also be extended by 6s if the equipping character hits an opponent with a Charged Attack while it is active. The effect can be extended for max 6s in this way.", new Item.Settings().rarity(Rarity.COMMON))));

        DAWNING_FROST = register((String) "dawning_frost", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "CRIT DMG", "12%", "Nocturnal Dreams", "For 10s after a Charged Attack hits an opponent, Elemental Mastery is increased by 72. For 10s after an Elemental Skill hits an opponent. Elemental Mastery is increased by 48.", new Item.Settings().rarity(Rarity.COMMON))));

        DODOCO_TALES = register((String) "dodoco_tales", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 41, "ATK", "12%", "Dodoventure!", "Normal Attack hits on opponents increase Charged Attack DMG by 16% for 6s. Charged Attack hits on opponents increase ATK by 8% for 6s.", new Item.Settings().rarity(Rarity.COMMON))));

        ECHOES_OF_THE_HEART = register((String) "echoes_of_the_heart", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "ATK", "6%", "Echo of a Vow", "Triggering an Elemental Reaction increases the equipping character's Elemental Mastery by 60 for 12s, while triggering a Stellar Glimmer reaction increases their Stellar Glimmer reaction DMG dealt by 16% for 12s. The aforementioned effects can trigger even when the character is not on the field.", new Item.Settings().rarity(Rarity.COMMON))));

        ETHERLIGHT_SPINDLELUTE = register((String) "etherlight_spindlelute", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "Energy Recharge", "10.0%", "Last Singer", "For 20s after using an Elemental Skill, the equipping character's Elemental Mastery is increased by 100.", new Item.Settings().rarity(Rarity.COMMON))));

        EYE_OF_PERCEPTION = register((String) "eye_of_perception", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 41, "ATK", "12%", "Echo", "Normal and Charged Attacks have a 50% chance to fire a Bolt of Perception, dealing 240% ATK as DMG. This bolt can bounce between opponents a maximum of 4 times. This effect can occur once every 12s.", new Item.Settings().rarity(Rarity.COMMON))));

        FAVONIUS_CODEX = register((String) "favonius_codex", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "Energy Recharge", "10.0%", "Windfall", "CRIT hits have a 60% chance to generate a small amount of Elemental Particles, which will regenerate 6 Energy for the character. Can only occur once every 12s.", new Item.Settings().rarity(Rarity.COMMON))));

        FLOWING_PURITY = register((String) "flowing_purity", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "ATK", "6%", "Unfinished Masterpiece", "When using an Elemental Skill, All Elemental DMG Bonus will be increased by 8% for 15s, and a Bond of Life worth 24% of Max HP will be granted. This effect can be triggered once every 10s. When the Bond of Life is cleared, every 1,000 HP cleared in the process will provide 2% All Elemental DMG Bonus, up to a maximum of 12%. This effect lasts 15s.", new Item.Settings().rarity(Rarity.COMMON))));

        FROSTBEARER = register((String) "frostbearer", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "ATK", "9%", "Frost Burial", "Hitting an opponent with Normal and Charged Attacks has a 60% chance of forming and dropping an Everfrost Icicle above them, dealing 80% AoE ATK DMG. Opponents affected by Cryo are dealt 200% ATK DMG instead by the icicle. Can only occur once every 10s.", new Item.Settings().rarity(Rarity.COMMON))));

        FRUIT_OF_FULFILLMENT = register((String) "fruit_of_fulfillment", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "Energy Recharge", "10.0%", "Full Circle", "Obtain the \"Wax and Wane\" effect after an Elemental Reaction is triggered, gaining 24 Elemental Mastery while losing 5% ATK. For every 0.3s, 1 stack of Wax and Wane can be gained. Max 5 stacks. For every 6s that go by without an Elemental Reaction being triggered, 1 stack will be lost. This effect can be triggered even when the character is off-field.", new Item.Settings().rarity(Rarity.COMMON))));

        HAKUSHIN_RING = register((String) "hakushin_ring", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "Energy Recharge", "6.7%", "Sakura Saiguu", "After the character equipped with this weapon triggers an Electro elemental reaction, nearby party members of an Elemental Type involved in the elemental reaction receive a 10% Elemental DMG Bonus for their element, lasting 6s. Elemental Bonuses gained in this way cannot be stacked.", new Item.Settings().rarity(Rarity.COMMON))));

        MAPPA_MARE = register((String) "mappa_mare", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "Elemental Mastery", "24", "Infusion Scroll", "Triggering an Elemental reaction grants a 8% Elemental DMG Bonus for 10s. Max 2 stacks.", new Item.Settings().rarity(Rarity.COMMON))));

        OATHSWORN_EYE = register((String) "oathsworn_eye", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "ATK", "6%", "People of the Faltering Light", "Increases Energy Recharge by 24% for 10s after using an Elemental Skill.", new Item.Settings().rarity(Rarity.COMMON))));

        PROTOTYPE_AMBER = register((String) "prototype_amber", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "HP", "9%", "Gilding", "Using an Elemental Burst regenerates 4 Energy every 2s for 6s. All party members will regenerate 4% HP every 2s for this duration.", new Item.Settings().rarity(Rarity.COMMON))));

        RING_OF_YAXCHE = register((String) "ring_of_yaxche", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "HP", "9%", "Echoes of the Plentiful Land", "Using an Elemental Skill grants the Jade-Forged Crown effect: Every 1,000 Max HP will increase the Normal Attack DMG dealt by the equipping character by 0.6% for 10s. Normal Attack DMG can be increased this way by a maximum of 16%.", new Item.Settings().rarity(Rarity.COMMON))));

        ROYAL_GRIMOIRE = register((String) "royal_grimoire", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "ATK", "6%", "Focus", "Upon dealing damage to an opponent, increases CRIT Rate by 8%. Max 5 stacks. A CRIT hit removes all existing stacks.", new Item.Settings().rarity(Rarity.COMMON))));

        SACRIFICIAL_FRAGMENTS = register((String) "sacrificial_fragments", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 41, "Elemental Mastery", "48", "Composed", "After dealing damage to an opponent with an Elemental Skill, the skill has a 40% chance to end its own CD. Can only occur once every 30s.", new Item.Settings().rarity(Rarity.COMMON))));

        SACRIFICIAL_JADE = register((String) "sacrificial_jade", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 41, "CRIT Rate", "8%", "Jade Circulation", "When not on the field for more than 5s, Max HP will be increased by 32% and Elemental Mastery will be increased by 40. These effects will be canceled after the wielder has been on the field for 10s.", new Item.Settings().rarity(Rarity.COMMON))));

        SOLAR_PEARL = register((String) "solar_pearl", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "CRIT Rate", "6%", "Solar Shine", "Normal Attack hits increase Elemental Skill and Elemental Burst DMG by 20% for 6s. Likewise, Elemental Skill or Elemental Burst hits increase Normal Attack DMG by 20% for 6s.", new Item.Settings().rarity(Rarity.COMMON))));

        THE_WIDSITH = register((String) "the_widsith", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "CRIT DMG", "12%", "Debut", "When a character takes the field, they will gain a random theme song for 10s. This can only occur once every 30s. Recitative: ATK is increased by 60%. Aria: Increases all Elemental DMG by 48%. Interlude: Elemental Mastery is increased by 240.", new Item.Settings().rarity(Rarity.COMMON))));

        WANDERING_EVENSTAR = register((String) "wandering_evenstar", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "Elemental Mastery", "36", "Wildling Nightstar", "The following effect will trigger every 10s: The equipping character will gain 24% of their Elemental Mastery as bonus ATK for 12s, with nearby party members gaining 30% of this buff for the same duration. Multiple instances of this weapon can allow this buff to stack. This effect will still trigger even if the character is not on the field.", new Item.Settings().rarity(Rarity.COMMON))));

        WAVERIDING_WHIRL = register((String) "waveriding_whirl", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 41, "Energy Recharge", "13.3%", "Fangs Flying To and Fro", "Decreases Swimming Stamina consumption by 15%. In addition, for 10s after using an Elemental Skill, Max HP is increased by 20%. For every Hydro Elemental character in the party, Max HP is increased by another 12%, and the maximum increase that can be achieved in this way is 24%. Can be triggered once every 15s.", new Item.Settings().rarity(Rarity.COMMON))));

        WINE_AND_SONG = register((String) "wine_and_song", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "Energy Recharge", "6.7%", "Ever-Changing", "Hitting an opponent with a Normal Attack decreases the Stamina consumption of Sprint or Alternate Sprint by 14% for 5s. Additionally, using a Sprint or Alternate Sprint ability increases ATK by 20% for 5s.", new Item.Settings().rarity(Rarity.COMMON))));

        WINTERS_HEAVY_HEART = register((String) "winters_heavy_heart", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "CRIT DMG", "12%", "Secrets of Frost", "The equipping character gains \"Silver-Tinged Pact\":\n" + "\n" + "    The equipping character's Elemental Mastery is increased by 24 for every Cryo character present in the party.\n" + "    For every Electro character present in the party, the equipping character's ATK is increased by 4.8%.\n" + "    The equipping character can gain the above buffs for 4 characters max.\n" + "\n" + "Radiance: Stellar Glimmer: The effect of Silver—Tinged Blood Pact is changed to: For every Cryo or Electro character present in the party, the equipping character gains a 20-point Elemental Mastery boost and deals 6% increased Stellar Glimmer Reaction DMG.", new Item.Settings().rarity(Rarity.COMMON))));


        //3-Star Catalyst
        EMERALD_ORB = register((String) "emerald_orb", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.THREE_STAR, 40, "Elemental Mastery", "20", "Rapids", "Upon causing a Vaporize, Electro-Charged, Frozen, Bloom, Lunar-Charged, Lunar-Bloom, or a Hydro-infused Swirl reaction, ATK is increased by 20% for 12s.", new Item.Settings().rarity(Rarity.COMMON))));

        MAGIC_GUIDE = register((String) "magic_guide", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.THREE_STAR, 38, "Elemental Mastery", "41", "Bane of Storm and Tide", "Increases DMG against opponents affected by Hydro or Electro by 12%.", new Item.Settings().rarity(Rarity.COMMON))));

        OTHERWORLDLY_STORY = register((String) "otherworldly_story", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.THREE_STAR, 39, "Energy Recharge", "8.5%", "Energy Shower", "Each Elemental Orb or Particle collected restores 1% HP.", new Item.Settings().rarity(Rarity.COMMON))));

        THRILLING_TALES_OF_DRAGON_SLAYERS = register((String) "thrilling_tales_of_dragon_slayers", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.THREE_STAR, 39, "HP", "7.7%", "Heritage", "When switching characters, the new character taking the field has their ATK increased by 24% for 10s. This effect can only occur once every 20s.", new Item.Settings().rarity(Rarity.COMMON))));

        TWIN_NEPHRITE = register((String) "twin_nephrite", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.THREE_STAR, 40, "CRIT Rate", "3.4%", "Guerilla Tactics", "Defeating an opponent increases Movement SPD and ATK by 12% for 15s.", new Item.Settings().rarity(Rarity.COMMON))));


        //2-Star Catalyst
        POCKET_GRIMOIRE = register((String) "pocket_grimoire", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.TWO_STAR, 33, "", "", "", "", new Item.Settings().rarity(Rarity.COMMON))));


        //1-Star Catalyst
        APPRENTICES_NOTES = register((String) "apprentices_notes", (Item)
                (new CatalystWeaponItem(ILeyLinesWeaponRarity.ONE_STAR, 23, "", "", "", "", new Item.Settings().rarity(Rarity.COMMON))));


        //Bows
        //5-Star Bow
        AMOS_BOW = register((String) "amos_bow", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 46, "ATK", "10.8%", "Strong-Willed", "Increases Normal Attack and Charged Attack DMG by 12%. After a Normal or Charged Attack is fired, DMG dealt increases by a further 8% every 0.1 seconds the arrow is in the air for up to 5 times.", new Item.Settings().rarity(Rarity.COMMON))));

        AQUA_SIMULACRA = register((String) "aqua_simulacra", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 44, "CRIT DMG", "19.2%", "The Cleansing Form", "HP is increased by 16%. When there are opponents nearby, the DMG dealt by the wielder of this weapon is increased by 20%. This will take effect whether the character is on-field or not.", new Item.Settings().rarity(Rarity.COMMON))));

        ASTRAL_VULTURES_CRIMSON_PLUMAGE = register((String) "astral_vultures_crimson_plumage", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 46, "CRIT DMG", "14.4%", "The Moonring Sighted", "For 12s after triggering a Swirl reaction, ATK increases by 24%. In addition, when 1/2 or more characters in the party are of a different Elemental Type from the equipping character, the DMG dealt by the equipping character's Charged Attacks is increased by 20/48% and Elemental Burst DMG dealt is increased by 10/24%.", new Item.Settings().rarity(Rarity.COMMON))));

        ELEGY_FOR_THE_END = register((String) "elegy_for_the_end", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 46, "Energy Recharge", "12%", "The Parting Refrain", "A part of the \"Millennial Movement\" that wanders amidst the winds. Increases Elemental Mastery by 60. When the Elemental Skills or Elemental Bursts of the character wielding this weapon hit opponents, that character gains a Sigil of Remembrance. This effect can be triggered once every 0.2s and can be triggered even if said character is not on the field. When you possess 4 Sigils of Remembrance, all of them will be consumed and all nearby party members will obtain the \"Millennial Movement: Farewell Song\" effect for 12s. \"Millennial Movement: Farewell Song\" increases Elemental Mastery by 100 and increases ATK by 20%. Once this effect is triggered, you will not gain Sigils of Remembrance for 20s. Of the many effects of the \"Millennial Movement,\" buffs of the same type will not stack.", new Item.Settings().rarity(Rarity.COMMON))));

        GOLDEN_FROSTBOUND_OATH = register((String) "golden_frostbound_oath", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 44, "CRIT DMG", "19.2%", "Dawn's Salutation Returned", "- Increases DEF by 16%. When the equipping character's Elemental Skill or Lunar-Crystallize attack(s) hits enemies, gain the Frost Fae's Favor effect for 6s: Geo DMG inflicted by the equipping character increases by 40%, Lunar-Crystallize Reaction DMG increases by 40%.    - While this effect is active, if there are Moondrifts near the equipping character, all other nearby party members Will gain the Frost Fae's Mischief effect: Geo DMG dealt increases by 20% and Lunar-Crystallize Reaction DMG increases by 20%. This effect can be triggered even when the equipping character is off-field.", new Item.Settings().rarity(Rarity.COMMON))));

        HUNTERS_PATH = register((String) "hunters_path", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 44, "CRIT Rate", "9.6%", "At the End of the Beast-Paths", "Gain 12% All Elemental DMG Bonus. Obtain the Tireless Hunt effect after hitting an opponent with a Charged Attack. This effect increases Charged Attack DMG by 160% of Elemental Mastery. This effect will be removed after 12 Charged Attacks or 10s. Only 1 instance of Tireless Hunt can be gained every 12s.", new Item.Settings().rarity(Rarity.COMMON))));

        POLAR_STAR = register((String) "polar_star", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 46, "CRIT Rate", "7.2%", "Daylight's Augury", "Elemental Skill and Elemental Burst DMG increased by 12%. After a Normal Attack, Charged Attack, Elemental Skill or Elemental Burst hits an opponent, 1 stack of Ashen Nightstar will be gained for 12s. When 1/2/3/4 stacks of Ashen Nightstar are present, ATK is increased by 10/20/30/48%. The stack of Ashen Nightstar created by the Normal Attack, Charged Attack, Elemental Skill or Elemental Burst will be counted independently of the others.", new Item.Settings().rarity(Rarity.COMMON))));

        SILVERSHOWER_HEARTSTRINGS = register((String) "silvershower_heartstrings", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 44, "HP", "14.4%", "Dryas's Nocturne", "The equipping character can gain the Remedy effect. When they possess 1/2/3 Remedy stacks, Max HP will increase by 12/24/40. 1 stack may be gained when the following conditions are met: 1 stack for 25s when using an Elemental Skill; 1 stack for 25s when the value of a Bond of Life value increases; 1 stack for 20s for performing healing. Stacks can still be triggered when the equipping character is not on the field. Each stack's duration is counted independently. In addition, when 3 stacks are active, Elemental Burst CRIT Rate will be increased by 28. This effect will be canceled 4s after falling under 3 stacks.", new Item.Settings().rarity(Rarity.COMMON))));

        SKYWARD_HARP = register((String) "skyward_harp", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 48, "CRIT Rate", "4.8%", "Echoing Ballad", "Increases CRIT DMG by 20%. Hits have a 60% chance to inflict a small AoE attack, dealing 125% Physical ATK DMG. Can only occur once every 4s.", new Item.Settings().rarity(Rarity.COMMON))));

        THE_DAYBREAK_CHRONICLES = register((String) "the_daybreak_chronicles", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 48, "CRIT DMG", "9.6%", "Dawning Song of Daybreak", "- The equipping character gains Stirring Dawn Breeze: 3s after leaving combat, Normal Attack, Elemental Skill, and Elemental Burst DMG is increased by 60%. While in combat, this DMG Bonus will decrease by 10% per second until it reaches 0%. When the equipping character's Normal Attacks, Elemental Skills, or Elemental Bursts hit an opponent, the DMG Bonus for the corresponding DMG type is increased by 10% until it reaches 60%. This effect can be triggered once every 0.1s for each of the attack types mentioned above. This effect can be triggered even if the equipping character is off-field.    - Additionally, when the party possesses Hexerei: Secret Rite effects, when the equipping character's Normal Attacks, Elemental Skills, or Elemental Bursts hit an opponent, the DMG Bonus for all these DMG types is increased by 20% instead.", new Item.Settings().rarity(Rarity.COMMON))));

        THE_FIRST_GREAT_MAGIC = register((String) "the_first_great_magic", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 46, "CRIT DMG", "14.4%", "Parsifal the Great", "DMG dealt by Charged Attacks increased by 16%. For every party member with the same Elemental Type as the wielder (including the wielder themselves), gain 1 Gimmick stack. For every party member with a different Elemental Type from the wielder, gain 1 Theatrics stack. When the wielder has 1/2/3 or more Gimmick stacks, ATK will be increased by 16/32/48%. When the wielder has 1/2/3 or more Theatrics stacks, Movement SPD will be increased by 4/7/10%.", new Item.Settings().rarity(Rarity.COMMON))));

        THUNDERING_PULSE = register((String) "thundering_pulse", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FIVE_STAR, 46, "CRIT DMG", "14.4%", "Rule By Thunder", "Increases ATK by 20% and grants the might of the Thunder Emblem. At stack levels 1/2/3, the Thunder Emblem increases Normal Attack DMG by 12/24/40%. The character will obtain 1 stack of Thunder Emblem in each of the following scenarios: Normal Attack deals DMG (stack lasts 5s), casting Elemental Skill (stack lasts 10s); Energy is less than 100% (stack disappears when Energy is full). Each stack's duration is calculated independently.", new Item.Settings().rarity(Rarity.COMMON))));


        //4-Star Bow
        ALLEY_HUNTER = register((String) "alley_hunter", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "ATK", "6%", "Oppidan Ambush", "While the character equipped with this weapon is in the party but not on the field, their DMG increases by 2% every second up to a max of 20%. When the character is on the field for more than 4s, the aforementioned DMG buff decreases by 4% per second until it reaches 0%.", new Item.Settings().rarity(Rarity.COMMON))));

        BLACKCLIFF_WARBOW = register((String) "blackcliff_warbow", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "CRIT DMG", "8%", "Press the Advantage", "After defeating an opponent, ATK is increased by 12% for 30s. This effect has a maximum of 3 stacks, and the duration of each stack is independent of the others.", new Item.Settings().rarity(Rarity.COMMON))));

        BREEZEBORNE_REFRAIN = register((String) "breezeborne_refrain", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "CRIT Rate", "6%", "Viper's Ballad", "Increases Energy Recharge by 20%.\n" + "When the equipping character hits the opponent with their Elemental Skill or Elemental Burst, they gain a stack of \"Hymn of the Pure.\" This effect can trigger once every 0.03s, max 3 stacks.\n" + "At 3 stacks, all instances of \"Hymn of the Pure\" are cleared to give the equipping character \"Thus Lied the Viper\" instead. This grants nearby party characters a 24% Stellar Glimmer Reaction DMG boost for 12s, during which no stacks of \"Hymn of the Pure\" can be obtained.\n" + "This effect can be triggered even when the equipping character is off-field.", new Item.Settings().rarity(Rarity.COMMON))));

        CHAIN_BREAKER = register((String) "chain_breaker", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "ATK", "6%", "Flower—Feather Song", "For every party member from Natlan or who has a different Elemental Type from the equipping character, the equipping character gains 4.8% increased ATK. When there are no less than 3 of the aforementioned characters, the equipping character gains 24 Elemental Mastery.", new Item.Settings().rarity(Rarity.COMMON))));

        CLOUDFORGED = register((String) "cloudforged", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "Elemental Mastery", "36", "Crag-Chiseled Forge", "After Elemental Energy is decreased, the equipping character's Elemental Mastery will increase by 40 for 18s. Max 2 stacks.", new Item.Settings().rarity(Rarity.COMMON))));

        COMPOUND_BOW = register((String) "compound_bow", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 41, "Physical DMG Bonus", "15%", "Infusion Arrow", "Normal Attack and Charged Attack hits increase ATK by 4% and Normal ATK SPD by 1.2% for 6s. Max 4 stacks. Can only occur once every 0.3s.", new Item.Settings().rarity(Rarity.COMMON))));

        COVENANT_OF_FROST_AND_SNOW = register((String) "covenant_of_frost_and_snow", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "DEF", "11.3%", "The Law's Equilibrium", "For 12s after the equipping character uses an Elemental Skill, their Elemental Mastery is increased by 120.", new Item.Settings().rarity(Rarity.COMMON))));

        END_OF_THE_LINE = register((String) "end_of_the_line", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "Energy Recharge", "10.0%", "Net Snapper", "Triggers the Flowrider effect after using an Elemental Skill, dealing 80% ATK as AoE DMG upon hitting an opponent with an attack. Flowrider will be removed after 15s or after causing 3 instances of AoE DMG. Only 1 instance of AoE DMG can be caused every 2s in this way. Flowrider can be triggered once every 12s.", new Item.Settings().rarity(Rarity.COMMON))));

        FADING_TWILIGHT = register((String) "fading_twilight", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "Energy Recharge", "6.7%", "Radiance of the Deeps", "Has three states, Evengleam, Afterglow, and Dawnblaze, which increase DMG dealt by 6/10/14 respectively. When attacks hit opponents, this weapon will switch to the next state. This weapon can change states once every 7s. The character equipping this weapon can still trigger the state switch while not on the field.", new Item.Settings().rarity(Rarity.COMMON))));

        FAVONIUS_WARBOW = register((String) "favonius_warbow", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 41, "Energy Recharge", "13.3%", "Windfall", "CRIT hits have a 60% chance to generate a small amount of Elemental Particles, which will regenerate 6 Energy for the character. Can only occur once every 12s.", new Item.Settings().rarity(Rarity.COMMON))));

        FLOWER_WREATHED_FEATHERS = register((String) "flower_wreathed_feathers", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "ATK", "9%", "Inflorescence Unattainable", "Decreases Gliding Stamina consumption by 15%. When using Aimed Shots, the DMG dealt by Charged Attacks increases by 6% every 0.5s. This effect can stack up to 6 times and will be removed 10s after leaving Aiming Mode.", new Item.Settings().rarity(Rarity.COMMON))));

        HAMAYUMI = register((String) "hamayumi", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 41, "ATK", "12%", "Full Draw", "Increases Normal Attack DMG by 16% and Charged Attack DMG by 12%. When the equipping character's Energy reaches 100%, this effect is increased by 100%.", new Item.Settings().rarity(Rarity.COMMON))));

        IBIS_PIERCER = register((String) "ibis_piercer", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "ATK", "6%", "Secret Wisdom's Favor", "The character's Elemental Mastery will increase by 40 within 6s after Charged Attacks hit opponents. Max 2 stacks. This effect can be triggered once every 0.5s.", new Item.Settings().rarity(Rarity.COMMON))));

        JADE_VISTA = register((String) "jade_vista", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "CRIT Rate", "6%", "A Candle Woven From the Night", "For every party member other than the equipping character:\n" + "\n" + "    Who is of the same Elemental Type as the equipper: The equipping character's Elemental Mastery is increased by 64;\n" + "    Who is not of the same Elemental Type as the equipper: The equipping character's ATK increases by 12%. The two effects described above can stack up to 3 times in total, with Elemental Mastery buffs applied first.", new Item.Settings().rarity(Rarity.COMMON))));

        KINGS_SQUIRE = register((String) "kings_squire", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 41, "ATK", "12%", "Labyrinth Lord's Instruction", "Obtain the Teachings of the Forest effect when unleashing Elemental Skills and Elemental Burst, increasing Elemental Mastery by 60 for 12s. This effect will be removed when switching characters. When the Teachings of the Forest effect ends or is removed, it will deal 100% of ATK as DMG to 1 nearby opponent. The Teachings of the Forest effect can be triggered once every 20s.", new Item.Settings().rarity(Rarity.COMMON))));

        MITTERNACHTS_WALTZ = register((String) "mitternachts_waltz", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "Physical DMG Bonus", "11.3%", "Evernight Duet", "Normal Attack hits on opponents increase Elemental Skill DMG by 20% for 5s. Elemental Skill hits on opponents increase Normal Attack DMG by 20% for 5s.", new Item.Settings().rarity(Rarity.COMMON))));

        MOUUNS_MOON = register((String) "mouuns_moon", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "ATK", "6%", "Watatsumi Wavewalker", "For every point of the entire party's combined maximum Energy capacity, the Elemental Burst DMG of the character equipping this weapon is increased by 0.12%. A maximum of 40% increased Elemental Burst DMG can be achieved this way.", new Item.Settings().rarity(Rarity.COMMON))));

        PREDATOR = register((String) "predator", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "ATK", "9%", "", "", new Item.Settings().rarity(Rarity.COMMON))));

        PROTOTYPE_CRESCENT = register((String) "prototype_crescent", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "ATK", "9%", "Unreturning", "Charged Attack hits on weak points increase Movement SPD by 10% and ATK by 36% for 10s.", new Item.Settings().rarity(Rarity.COMMON))));

        RAINBOW_SERPENTS_RAIN_BOW = register((String) "rainbow_serpents_rain_bow", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "Energy Recharge", "10.0%", "Astral Whispers Beyond the Sacred Throne", "ATK is increased by 28% for 8s after the equipping character's attacks hit an opponent while the equipping character is off-field.", new Item.Settings().rarity(Rarity.COMMON))));

        RANGE_GAUGE = register((String) "range_gauge", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "ATK", "6%", "Masons' Ditty", "When the wielder is healed or heals others, they will gain a Unity's Symbol that lasts 30s, up to a maximum of 3 Symbols. When using their Elemental Skill or Burst, all Symbols will be consumed and the Struggle effect will be granted for 10s. For each Symbol consumed, gain 3% ATK and 7% All Elemental DMG Bonus. The Struggle effect can be triggered once every 15s, and Symbols can be gained even when the character is not on the field.", new Item.Settings().rarity(Rarity.COMMON))));

        ROYAL_BOW = register((String) "royal_bow", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "ATK", "9%", "Focus", "Upon dealing damage to an opponent, increases CRIT Rate by 8%. Max 5 stacks. A CRIT hit removes all existing stacks.", new Item.Settings().rarity(Rarity.COMMON))));

        RUST = register((String) "rust", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "ATK", "9%", "Rapid Firing", "Increases Normal Attack DMG by 40% but decreases Charged Attack DMG by 10%.", new Item.Settings().rarity(Rarity.COMMON))));

        SACRIFICIAL_BOW = register((String) "sacrificial_bow", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "Energy Recharge", "6.7%", "Composed", "After dealing damage to an opponent with an Elemental Skill, the skill has a 40% chance to end its own CD. Can only occur once every 30s.", new Item.Settings().rarity(Rarity.COMMON))));

        SCION_OF_THE_BLAZING_SUN = register((String) "scion_of_the_blazing_sun", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 44, "CRIT Rate", "4%", "The Way of Sunfire", "After a Charged Attack hits an opponent, a Sunfire Arrow will descend upon the opponent hit, dealing 60% ATK as DMG, and applying the Heartsearer effect to the opponent damaged by said Arrow for 10s. Opponents affected by Heartsearer take 28% more Charged Attack DMG from the wielder. A Sunfire Arrow can be triggered once every 10s.", new Item.Settings().rarity(Rarity.COMMON))));

        SEQUENCE_OF_SOLITUDE = register((String) "sequence_of_solitude", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "HP", "9%", "Silent Trigger", "When an attack hits an opponent, deal AoE DMG equal to 40% of Max HP at the target location. This effect can be triggered once every 15s.", new Item.Settings().rarity(Rarity.COMMON))));

        SNARE_HOOK = register((String) "snare_hook", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 41, "Energy Recharge", "13.3%", "Phantom Flash", "Upon causing an Elemental Reaction, increases Elemental Mastery by 60 for 12s. Moonsign: Ascendant Gleam: Elemental Mastery from this effect is further increased by 60. This effect can be triggered even if the equipping character is off-field.", new Item.Settings().rarity(Rarity.COMMON))));

        SONG_OF_STILLNESS = register((String) "song_of_stillness", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "ATK", "9%", "Benthic Pulse", "After the wielder is healed, they will deal 16% more DMG for 8s. This can be triggered even when the character is not on the field.", new Item.Settings().rarity(Rarity.COMMON))));

        THE_STRINGLESS = register((String) "the_stringless", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "Elemental Mastery", "36", "Arrowless Song", "Increases Elemental Skill and Elemental Burst DMG by 24%.", new Item.Settings().rarity(Rarity.COMMON))));

        THE_VIRIDESCENT_HUNT = register((String) "the_viridescent_hunt", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "CRIT Rate", "6%", "Verdant Wind", "Upon hit, Normal and Aimed Shot Attacks have a 50% chance to generate a Cyclone, which will continuously attract surrounding opponents, dealing 40% of ATK as DMG to these opponents every 0.5s for 4s. This effect can only occur once every 14s.", new Item.Settings().rarity(Rarity.COMMON))));

        WINDBLUME_ODE = register((String) "windblume_ode", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.FOUR_STAR, 42, "Elemental Mastery", "36", "Windblume Wish", "After using an Elemental Skill, receive a boon from the ancient wish of the Windblume, increasing ATK by 16% for 6s.", new Item.Settings().rarity(Rarity.COMMON))));


        //3-Star Bow
        MESSENGER = register((String) "messenger", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.THREE_STAR, 40, "CRIT DMG", "6.8%", "Archer's Message", "Charged Attack hits on weak spots deal an additional 100% ATK DMG as CRIT DMG. Can only occur once every 10s.", new Item.Settings().rarity(Rarity.COMMON))));

        RAVEN_BOW = register((String) "raven_bow", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.THREE_STAR, 40, "Elemental Mastery", "20", "Bane of Flame and Water", "Increases DMG against opponents affected by Hydro or Pyro by 12%.", new Item.Settings().rarity(Rarity.COMMON))));

        RECURVE_BOW = register((String) "recurve_bow", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.THREE_STAR, 38, "HP", "10.2%", "Cull the Weak", "Defeating an opponent restores 8% HP.", new Item.Settings().rarity(Rarity.COMMON))));

        SHARPSHOOTERS_OATH = register((String) "sharpshooters_oath", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.THREE_STAR, 39, "CRIT DMG", "10.2%", "Precise", "Increases DMG against weak spots by 24%.", new Item.Settings().rarity(Rarity.COMMON))));

        SLINGSHOT = register((String) "slingshot", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.THREE_STAR, 38, "CRIT Rate", "6.8%", "Slingshot", "If a Normal or Charged Attack hits a target within 0.3s of being fired, increases DMG by 36%. Otherwise, decreases DMG by 10%.", new Item.Settings().rarity(Rarity.COMMON))));


        //2-Star Bow
        SEASONED_HUNTERS_BOW = register((String) "seasoned_hunters_bow", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.TWO_STAR, 33, "", "", "", "", new Item.Settings().rarity(Rarity.COMMON))));


        //1-Star Bow
        HUNTERS_BOW = register((String) "hunters_bow", (Item)
                (new BowWeaponItem(ILeyLinesWeaponRarity.ONE_STAR, 23, "", "", "", "", new Item.Settings().rarity(Rarity.COMMON))));
    }
}
