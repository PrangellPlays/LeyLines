package dev.lumi.leylines.datagen;

import com.google.gson.JsonObject;
import dev.lumi.leylines.LeyLines;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.data.DataOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.DataWriter;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class LeylinesCharacterProvider implements DataProvider {
    private final FabricDataOutput output;

    public LeylinesCharacterProvider(FabricDataOutput output) {
        this.output = output;
    }

    @Override public CompletableFuture<?> run(DataWriter writer) {
        List<CompletableFuture<?>> futures = new ArrayList<>();
        //Weapons
        String SWORD = "weapon_type.leylines.sword";
        String CLAYMORE = "weapon_type.leylines.claymore";
        String POLEARM = "weapon_type.leylines.polearm";
        String CATALYST = "weapon_type.leylines.catalyst";
        String BOW = "weapon_type.leylines.bow";

        //Elements
        String ANEMO = "element.leylines.anemo";
        String GEO = "element.leylines.geo";
        String ELECTRO = "element.leylines.electro";
        String DENDRO = "element.leylines.dendro";
        String HYDRO = "element.leylines.hydro";
        String PYRO = "element.leylines.pyro";
        String CRYO = "element.leylines.cryo";
        String ADAPTIVE = "element.leylines.adaptive";

        //Region
        String MONDSTADT = "region.leylines.mondstadt";
        String LIYUE = "region.leylines.liyue";
        String INAZUMA = "region.leylines.inazuma";
        String SUMERU = "region.leylines.sumeru";
        String FONTAINE = "region.leylines.fontaine";
        String NATLAN = "region.leylines.natlan";
        String NOD_KRAI = "region.leylines.nod_krai";
        String SNEZHNAYA = "region.leylines.snezhnaya";
        String KHAENRIAH = "region.leylines.khaenriah";
        String NONE = "region.leylines.none";

        //Model Type
        String TALL_MALE = "model_type.leylines.tall_male";
        String MEDIUM_MALE = "model_type.leylines.medium_male";
        String TALL_FEMALE = "model_type.leylines.tall_female";
        String MEDIUM_FEMALE = "model_type.leylines.medium_female";
        String SHORT_FEMALE = "model_type.leylines.short_female";

        addCharacter(futures, writer,
                LeyLines.id("aino"),
                "slim",
                LeyLines.id("aino_fluffy_puffy_whiz_kid_workwear"),
                4,
                LeyLines.id(HYDRO),
                LeyLines.id(CLAYMORE),
                LeyLines.id(NOD_KRAI),
                LeyLines.id(SHORT_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("albedo"),
                "slim",
                LeyLines.id("albedo_newmoon_starlight"),
                5,
                LeyLines.id(GEO),
                LeyLines.id(SWORD),
                LeyLines.id(MONDSTADT),
                LeyLines.id(MEDIUM_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("alhaitham"),
                "slim",
                LeyLines.id("alhaitham_the_rational"),
                5,
                LeyLines.id(DENDRO),
                LeyLines.id(SWORD),
                LeyLines.id(SUMERU),
                LeyLines.id(TALL_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("aloy"),
                "slim",
                LeyLines.id("aloy_machine_hunter"),
                5,
                LeyLines.id(CRYO),
                LeyLines.id(BOW),
                LeyLines.id(NONE),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("alyosha"),
                "slim",
                LeyLines.id("alyosha_frost_cloaked_ambusher"),
                4,
                LeyLines.id(ELECTRO),
                LeyLines.id(POLEARM),
                LeyLines.id(SNEZHNAYA),
                LeyLines.id(MEDIUM_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("amber"),
                "slim",
                LeyLines.id("amber_5_star_outrider"),
                4,
                LeyLines.id(PYRO),
                LeyLines.id(BOW),
                LeyLines.id(MONDSTADT),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("arataki_itto"),
                "slim",
                LeyLines.id("arataki_itto_eccentric_oni"),
                5,
                LeyLines.id(GEO),
                LeyLines.id(CLAYMORE),
                LeyLines.id(INAZUMA),
                LeyLines.id(TALL_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("arlecchino"),
                "slim",
                LeyLines.id("arlecchino_moonglare"),
                5,
                LeyLines.id(PYRO),
                LeyLines.id(POLEARM),
                LeyLines.id(SNEZHNAYA),
                LeyLines.id(TALL_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("baizhu"),
                "slim",
                LeyLines.id("baizhu_the_applications_of_medicine"),
                5,
                LeyLines.id(DENDRO),
                LeyLines.id(CATALYST),
                LeyLines.id(LIYUE),
                LeyLines.id(TALL_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("barbara"),
                "slim",
                LeyLines.id("barbara_innocent_longing"),
                4,
                LeyLines.id(HYDRO),
                LeyLines.id(CATALYST),
                LeyLines.id(MONDSTADT),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("beidou"),
                "slim",
                LeyLines.id("beidou_rolling_waves"),
                4,
                LeyLines.id(ELECTRO),
                LeyLines.id(CLAYMORE),
                LeyLines.id(LIYUE),
                LeyLines.id(TALL_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("bennett"),
                "slim",
                LeyLines.id("bennett_fortunes_favor"),
                4,
                LeyLines.id(PYRO),
                LeyLines.id(SWORD),
                LeyLines.id(MONDSTADT),
                LeyLines.id(MEDIUM_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("candace"),
                "slim",
                LeyLines.id("candace_desert_and_night"),
                4,
                LeyLines.id(HYDRO),
                LeyLines.id(POLEARM),
                LeyLines.id(SUMERU),
                LeyLines.id(TALL_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("charlotte"),
                "slim",
                LeyLines.id("charlotte_all_is_overt_through_my_lens"),
                4,
                LeyLines.id(CRYO),
                LeyLines.id(CATALYST),
                LeyLines.id(FONTAINE),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("chasca"),
                "slim",
                LeyLines.id("chasca_tlalocans_night_phantom"),
                5,
                LeyLines.id(ANEMO),
                LeyLines.id(BOW),
                LeyLines.id(NATLAN),
                LeyLines.id(TALL_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("chevreuse"),
                "slim",
                LeyLines.id("chevreuse_guardians_gun"),
                4,
                LeyLines.id(PYRO),
                LeyLines.id(POLEARM),
                LeyLines.id(FONTAINE),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("chiori"),
                "slim",
                LeyLines.id("chiori_plucked_yamabuki_splendor"),
                5,
                LeyLines.id(GEO),
                LeyLines.id(SWORD),
                LeyLines.id(INAZUMA),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("chongyun"),
                "slim",
                LeyLines.id("chongyun_pure_spirit"),
                4,
                LeyLines.id(CRYO),
                LeyLines.id(CLAYMORE),
                LeyLines.id(LIYUE),
                LeyLines.id(MEDIUM_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("citlali"),
                "slim",
                LeyLines.id("citlali_dawnseer"),
                5,
                LeyLines.id(CRYO),
                LeyLines.id(CATALYST),
                LeyLines.id(NATLAN),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("clorinde"),
                "slim",
                LeyLines.id("clorinde_sword_of_honor"),
                5,
                LeyLines.id(ELECTRO),
                LeyLines.id(SWORD),
                LeyLines.id(FONTAINE),
                LeyLines.id(TALL_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("collei"),
                "slim",
                LeyLines.id("collei_a_new_leaf"),
                4,
                LeyLines.id(DENDRO),
                LeyLines.id(BOW),
                LeyLines.id(SUMERU),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("columbina"),
                "slim",
                LeyLines.id("columbina_moonweave_gossamer"),
                5,
                LeyLines.id(HYDRO),
                LeyLines.id(CATALYST),
                LeyLines.id(NOD_KRAI),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("cyno"),
                "slim",
                LeyLines.id("cyno_heart_of_the_scales"),
                5,
                LeyLines.id(ELECTRO),
                LeyLines.id(POLEARM),
                LeyLines.id(SUMERU),
                LeyLines.id(MEDIUM_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("dahlia"),
                "slim",
                LeyLines.id("dahlia_pristine_prayers"),
                4,
                LeyLines.id(HYDRO),
                LeyLines.id(SWORD),
                LeyLines.id(MONDSTADT),
                LeyLines.id(MEDIUM_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("dehya"),
                "slim",
                LeyLines.id("dehya_the_lioness_and_the_blazing_sun"),
                5,
                LeyLines.id(PYRO),
                LeyLines.id(CLAYMORE),
                LeyLines.id(SUMERU),
                LeyLines.id(TALL_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("diluc"),
                "slim",
                LeyLines.id("diluc_darknight_blaze"),
                5,
                LeyLines.id(PYRO),
                LeyLines.id(CLAYMORE),
                LeyLines.id(MONDSTADT),
                LeyLines.id(TALL_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("diona"),
                "slim",
                LeyLines.id("diona_sugary_brew"),
                4,
                LeyLines.id(CRYO),
                LeyLines.id(BOW),
                LeyLines.id(MONDSTADT),
                LeyLines.id(SHORT_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("dori"),
                "slim",
                LeyLines.id("dori_i_love_mora"),
                4,
                LeyLines.id(ELECTRO),
                LeyLines.id(CLAYMORE),
                LeyLines.id(SUMERU),
                LeyLines.id(SHORT_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("durin"),
                "slim",
                LeyLines.id("durin_a_gift_from_the_stars"),
                5,
                LeyLines.id(PYRO),
                LeyLines.id(SWORD),
                LeyLines.id(MONDSTADT),
                LeyLines.id(MEDIUM_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("emilie"),
                "slim",
                LeyLines.id("emilie_ambrosial_verdance"),
                5,
                LeyLines.id(DENDRO),
                LeyLines.id(POLEARM),
                LeyLines.id(FONTAINE),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("escoffier"),
                "slim",
                LeyLines.id("escoffier_sorbet_honey_pie"),
                5,
                LeyLines.id(CRYO),
                LeyLines.id(POLEARM),
                LeyLines.id(FONTAINE),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("eula"),
                "slim",
                LeyLines.id("eula_wavecrest_waltz"),
                5,
                LeyLines.id(CRYO),
                LeyLines.id(CLAYMORE),
                LeyLines.id(MONDSTADT),
                LeyLines.id(TALL_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("faruzan"),
                "slim",
                LeyLines.id("faruzan_pristine_elegance"),
                4,
                LeyLines.id(ANEMO),
                LeyLines.id(BOW),
                LeyLines.id(SUMERU),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("fischl"),
                "slim",
                LeyLines.id("fischl_dunkelnacht_sakrament"),
                4,
                LeyLines.id(ELECTRO),
                LeyLines.id(BOW),
                LeyLines.id(MONDSTADT),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("flins"),
                "slim",
                LeyLines.id("flins_nocturne"),
                5,
                LeyLines.id(ELECTRO),
                LeyLines.id(POLEARM),
                LeyLines.id(NOD_KRAI),
                LeyLines.id(TALL_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("freminet"),
                "slim",
                LeyLines.id("freminet_icy_skin"),
                4,
                LeyLines.id(CRYO),
                LeyLines.id(CLAYMORE),
                LeyLines.id(FONTAINE),
                LeyLines.id(MEDIUM_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("furina"),
                "slim",
                LeyLines.id("furina_coronated_prima_donna"),
                5,
                LeyLines.id(HYDRO),
                LeyLines.id(SWORD),
                LeyLines.id(FONTAINE),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("gaming"),
                "slim",
                LeyLines.id("gaming_ranging_rainbow"),
                4,
                LeyLines.id(PYRO),
                LeyLines.id(CLAYMORE),
                LeyLines.id(LIYUE),
                LeyLines.id(MEDIUM_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("ganyu"),
                "slim",
                LeyLines.id("ganyu_frostdew_trail"),
                5,
                LeyLines.id(CRYO),
                LeyLines.id(BOW),
                LeyLines.id(LIYUE),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("gorou"),
                "slim",
                LeyLines.id("gorou_panoply_of_a_hundred_hunts"),
                4,
                LeyLines.id(GEO),
                LeyLines.id(BOW),
                LeyLines.id(INAZUMA),
                LeyLines.id(MEDIUM_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("hu_tao"),
                "slim",
                LeyLines.id("hu_tao_plum_blossom_bouquet"),
                5,
                LeyLines.id(PYRO),
                LeyLines.id(POLEARM),
                LeyLines.id(LIYUE),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("iansan"),
                "slim",
                LeyLines.id("iansan_warriors_bonegarb"),
                4,
                LeyLines.id(ELECTRO),
                LeyLines.id(POLEARM),
                LeyLines.id(NATLAN),
                LeyLines.id(SHORT_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("ifa"),
                "slim",
                LeyLines.id("ifa_whistledart_wings"),
                4,
                LeyLines.id(ANEMO),
                LeyLines.id(CATALYST),
                LeyLines.id(NATLAN),
                LeyLines.id(TALL_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("illuga"),
                "slim",
                LeyLines.id("illuga_steadfast_resolve"),
                4,
                LeyLines.id(GEO),
                LeyLines.id(POLEARM),
                LeyLines.id(NOD_KRAI),
                LeyLines.id(MEDIUM_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("ineffa"),
                "slim",
                LeyLines.id("ineffa_mechanical_dreams"),
                5,
                LeyLines.id(ELECTRO),
                LeyLines.id(POLEARM),
                LeyLines.id(NOD_KRAI),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("jahoda"),
                "slim",
                LeyLines.id("jahoda_novas_whisper"),
                4,
                LeyLines.id(ANEMO),
                LeyLines.id(BOW),
                LeyLines.id(NOD_KRAI),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("jean"),
                "slim",
                LeyLines.id("jean_favonian_devotion"),
                5,
                LeyLines.id(ANEMO),
                LeyLines.id(SWORD),
                LeyLines.id(MONDSTADT),
                LeyLines.id(TALL_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("kachina"),
                "slim",
                LeyLines.id("kachina_tawny_peaks_spired_rock"),
                4,
                LeyLines.id(GEO),
                LeyLines.id(POLEARM),
                LeyLines.id(NATLAN),
                LeyLines.id(SHORT_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("kaedehara_kazuha"),
                "slim",
                LeyLines.id("kaedehara_kazuha_falling_leaves"),
                5,
                LeyLines.id(ANEMO),
                LeyLines.id(SWORD),
                LeyLines.id(INAZUMA),
                LeyLines.id(MEDIUM_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("kaeya"),
                "slim",
                LeyLines.id("kaeya_icy_featherflight"),
                4,
                LeyLines.id(CRYO),
                LeyLines.id(SWORD),
                LeyLines.id(MONDSTADT),
                LeyLines.id(TALL_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("kamisato_ayaka"),
                "slim",
                LeyLines.id("kamisato_ayaka_flawless_radiance"),
                5,
                LeyLines.id(CRYO),
                LeyLines.id(SWORD),
                LeyLines.id(INAZUMA),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("kamisato_ayato"),
                "slim",
                LeyLines.id("kamisato_ayato_silk_splendor"),
                5,
                LeyLines.id(HYDRO),
                LeyLines.id(SWORD),
                LeyLines.id(INAZUMA),
                LeyLines.id(TALL_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("kaveh"),
                "slim",
                LeyLines.id("kaveh_gold_pinions_in_flames_bathed"),
                4,
                LeyLines.id(DENDRO),
                LeyLines.id(CLAYMORE),
                LeyLines.id(SUMERU),
                LeyLines.id(TALL_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("keqing"),
                "slim",
                LeyLines.id("keqing_piercing_thunderbolt"),
                5,
                LeyLines.id(ELECTRO),
                LeyLines.id(SWORD),
                LeyLines.id(LIYUE),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("kinich"),
                "slim",
                LeyLines.id("kinich_eight_bit_artistry"),
                5,
                LeyLines.id(DENDRO),
                LeyLines.id(CLAYMORE),
                LeyLines.id(NATLAN),
                LeyLines.id(MEDIUM_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("kirara"),
                "slim",
                LeyLines.id("kirara_whirling_bloom"),
                4,
                LeyLines.id(DENDRO),
                LeyLines.id(SWORD),
                LeyLines.id(INAZUMA),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("klee"),
                "slim",
                LeyLines.id("klee_shooting_spark"),
                5,
                LeyLines.id(PYRO),
                LeyLines.id(CATALYST),
                LeyLines.id(MONDSTADT),
                LeyLines.id(SHORT_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("kujou_sara"),
                "slim",
                LeyLines.id("kujou_sara_solemn_purity"),
                4,
                LeyLines.id(ELECTRO),
                LeyLines.id(BOW),
                LeyLines.id(INAZUMA),
                LeyLines.id(TALL_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("kuki_shinobu"),
                "slim",
                LeyLines.id("kuki_shinobu_aratakis_demonic_deputy"),
                4,
                LeyLines.id(ELECTRO),
                LeyLines.id(SWORD),
                LeyLines.id(INAZUMA),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("lan_yan"),
                "slim",
                LeyLines.id("lan_yan_argent_chimes"),
                4,
                LeyLines.id(ANEMO),
                LeyLines.id(CATALYST),
                LeyLines.id(LIYUE),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("lauma"),
                "slim",
                LeyLines.id("lauma_verdant_moon"),
                5,
                LeyLines.id(DENDRO),
                LeyLines.id(CATALYST),
                LeyLines.id(NOD_KRAI),
                LeyLines.id(TALL_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("layla"),
                "slim",
                LeyLines.id("layla_dreaming_star"),
                4,
                LeyLines.id(CRYO),
                LeyLines.id(SWORD),
                LeyLines.id(SUMERU),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("linnea"),
                "slim",
                LeyLines.id("linnea_lone_feathers_omen"),
                5,
                LeyLines.id(GEO),
                LeyLines.id(BOW),
                LeyLines.id(NOD_KRAI),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("lisa"),
                "slim",
                LeyLines.id("lisa_purple_rose"),
                4,
                LeyLines.id(ELECTRO),
                LeyLines.id(CATALYST),
                LeyLines.id(MONDSTADT),
                LeyLines.id(TALL_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("lohen"),
                "slim",
                LeyLines.id("lohen_frost_forged_edge"),
                5,
                LeyLines.id(CRYO),
                LeyLines.id(POLEARM),
                LeyLines.id(MONDSTADT),
                LeyLines.id(MEDIUM_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("lynette"),
                "slim",
                LeyLines.id("lynette_phantomeow"),
                4,
                LeyLines.id(ANEMO),
                LeyLines.id(SWORD),
                LeyLines.id(FONTAINE),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("lyney"),
                "slim",
                LeyLines.id("lyney_fantasticat"),
                5,
                LeyLines.id(PYRO),
                LeyLines.id(BOW),
                LeyLines.id(FONTAINE),
                LeyLines.id(MEDIUM_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("mavuika"),
                "slim",
                LeyLines.id("mavuika_undying_sun"),
                5,
                LeyLines.id(PYRO),
                LeyLines.id(CLAYMORE),
                LeyLines.id(NATLAN),
                LeyLines.id(TALL_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("mika"),
                "slim",
                LeyLines.id("mika_soaring_beacon"),
                4,
                LeyLines.id(CRYO),
                LeyLines.id(POLEARM),
                LeyLines.id(MONDSTADT),
                LeyLines.id(MEDIUM_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("mona"),
                "slim",
                LeyLines.id("mona_flowing_fate"),
                5,
                LeyLines.id(HYDRO),
                LeyLines.id(CATALYST),
                LeyLines.id(MONDSTADT),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("mualani"),
                "slim",
                LeyLines.id("mualani_flying_fish_heat_waves_and_moon_scallop"),
                5,
                LeyLines.id(HYDRO),
                LeyLines.id(CATALYST),
                LeyLines.id(NATLAN),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("nahida"),
                "slim",
                LeyLines.id("nahida_for_all_knowledge_a_verse"),
                5,
                LeyLines.id(DENDRO),
                LeyLines.id(CATALYST),
                LeyLines.id(SUMERU),
                LeyLines.id(SHORT_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("navia"),
                "slim",
                LeyLines.id("navia_yellow_velvet_salon"),
                5,
                LeyLines.id(GEO),
                LeyLines.id(CLAYMORE),
                LeyLines.id(FONTAINE),
                LeyLines.id(TALL_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("nefer"),
                "slim",
                LeyLines.id("nefer_emerald_cipher"),
                5,
                LeyLines.id(DENDRO),
                LeyLines.id(CATALYST),
                LeyLines.id(NOD_KRAI),
                LeyLines.id(TALL_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("neuvillette"),
                "slim",
                LeyLines.id("neuvillette_clear_adjudication"),
                5,
                LeyLines.id(HYDRO),
                LeyLines.id(CATALYST),
                LeyLines.id(FONTAINE),
                LeyLines.id(TALL_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("nicole"),
                "slim",
                LeyLines.id("nicole_mimetic_interpretation"),
                5,
                LeyLines.id(PYRO),
                LeyLines.id(CATALYST),
                LeyLines.id(NONE),
                LeyLines.id(TALL_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("nilou"),
                "slim",
                LeyLines.id("nilou_neither_flower_nor_mist"),
                5,
                LeyLines.id(HYDRO),
                LeyLines.id(SWORD),
                LeyLines.id(SUMERU),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("ningguang"),
                "slim",
                LeyLines.id("ningguang_gold_lead_and_pearly_jade"),
                4,
                LeyLines.id(GEO),
                LeyLines.id(CATALYST),
                LeyLines.id(LIYUE),
                LeyLines.id(TALL_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("noelle"),
                "slim",
                LeyLines.id("noelle_armored_rose"),
                4,
                LeyLines.id(GEO),
                LeyLines.id(CLAYMORE),
                LeyLines.id(MONDSTADT),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("odette"),
                "slim",
                LeyLines.id("odette_snow_swans_dance"),
                5,
                LeyLines.id(CRYO),
                LeyLines.id(SWORD),
                LeyLines.id(SNEZHNAYA),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("ororon"),
                "slim",
                LeyLines.id("ororon_batwing_iris"),
                4,
                LeyLines.id(ELECTRO),
                LeyLines.id(BOW),
                LeyLines.id(NATLAN),
                LeyLines.id(TALL_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("prune"),
                "slim",
                LeyLines.id("prune_witch_hunter_regalia"),
                4,
                LeyLines.id(ANEMO),
                LeyLines.id(CATALYST),
                LeyLines.id(MONDSTADT),
                LeyLines.id(SHORT_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("qiqi"),
                "slim",
                LeyLines.id("qiqi_summerchill_dreams"),
                5,
                LeyLines.id(CRYO),
                LeyLines.id(SWORD),
                LeyLines.id(LIYUE),
                LeyLines.id(SHORT_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("raiden_shogun"),
                "slim",
                LeyLines.id("raiden_shogun_narukamis_law"),
                5,
                LeyLines.id(ELECTRO),
                LeyLines.id(POLEARM),
                LeyLines.id(INAZUMA),
                LeyLines.id(TALL_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("razor"),
                "slim",
                LeyLines.id("razor_wild_sprint"),
                4,
                LeyLines.id(ELECTRO),
                LeyLines.id(CLAYMORE),
                LeyLines.id(MONDSTADT),
                LeyLines.id(MEDIUM_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("rosaria"),
                "slim",
                LeyLines.id("rosaria_executors_thorns"),
                4,
                LeyLines.id(CRYO),
                LeyLines.id(POLEARM),
                LeyLines.id(MONDSTADT),
                LeyLines.id(TALL_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("sandrone"),
                "slim",
                LeyLines.id("sandrone_clockwork_maidens_waltz"),
                5,
                LeyLines.id(CRYO),
                LeyLines.id(CLAYMORE),
                LeyLines.id(SNEZHNAYA),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("sangonomiya_kokomi"),
                "slim",
                LeyLines.id("sangonomiya_kokomi_sparkling_coralbone"),
                5,
                LeyLines.id(HYDRO),
                LeyLines.id(CATALYST),
                LeyLines.id(INAZUMA),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("sayu"),
                "slim",
                LeyLines.id("sayu_mini_mujina"),
                4,
                LeyLines.id(ANEMO),
                LeyLines.id(CLAYMORE),
                LeyLines.id(INAZUMA),
                LeyLines.id(SHORT_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("sethos"),
                "slim",
                LeyLines.id("sethos_golden_sandstrider"),
                4,
                LeyLines.id(ELECTRO),
                LeyLines.id(BOW),
                LeyLines.id(SUMERU),
                LeyLines.id(MEDIUM_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("shenhe"),
                "slim",
                LeyLines.id("shenhe_the_worlds_shackles"),
                5,
                LeyLines.id(CRYO),
                LeyLines.id(POLEARM),
                LeyLines.id(LIYUE),
                LeyLines.id(TALL_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("shikanoin_heizou"),
                "slim",
                LeyLines.id("shikanoin_heizou_spirited_valor"),
                4,
                LeyLines.id(ANEMO),
                LeyLines.id(CATALYST),
                LeyLines.id(INAZUMA),
                LeyLines.id(MEDIUM_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("sigewinne"),
                "slim",
                LeyLines.id("sigewinne_sweetness_of_the_sea"),
                5,
                LeyLines.id(HYDRO),
                LeyLines.id(BOW),
                LeyLines.id(FONTAINE),
                LeyLines.id(SHORT_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("skirk"),
                "slim",
                LeyLines.id("skirk_shattered_star"),
                5,
                LeyLines.id(CRYO),
                LeyLines.id(SWORD),
                LeyLines.id(NONE),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("sucrose"),
                "slim",
                LeyLines.id("sucrose_germinating_wind"),
                4,
                LeyLines.id(ANEMO),
                LeyLines.id(CATALYST),
                LeyLines.id(MONDSTADT),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("tartaglia"),
                "slim",
                LeyLines.id("tartaglia_blades_of_glory"),
                5,
                LeyLines.id(HYDRO),
                LeyLines.id(BOW),
                LeyLines.id(SNEZHNAYA),
                LeyLines.id(TALL_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("thoma"),
                "slim",
                LeyLines.id("thoma_warrior_of_flame"),
                4,
                LeyLines.id(PYRO),
                LeyLines.id(POLEARM),
                LeyLines.id(INAZUMA),
                LeyLines.id(TALL_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("tighnari"),
                "slim",
                LeyLines.id("tighnari_woodland_song"),
                5,
                LeyLines.id(DENDRO),
                LeyLines.id(BOW),
                LeyLines.id(SUMERU),
                LeyLines.id(MEDIUM_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("traveler_female"),
                "slim",
                LeyLines.id("lumine_rising_star"),
                5,
                LeyLines.id(ADAPTIVE),
                LeyLines.id(SWORD),
                LeyLines.id(NONE),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("traveler_male"),
                "slim",
                LeyLines.id("aether_rising_star"),
                5,
                LeyLines.id(ADAPTIVE),
                LeyLines.id(SWORD),
                LeyLines.id(NONE),
                LeyLines.id(MEDIUM_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("varesa"),
                "slim",
                LeyLines.id("varesa_sugar_rush"),
                5,
                LeyLines.id(ELECTRO),
                LeyLines.id(CATALYST),
                LeyLines.id(NATLAN),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("varka"),
                "slim",
                LeyLines.id("varka_oath_to_the_north_wind"),
                5,
                LeyLines.id(ANEMO),
                LeyLines.id(CLAYMORE),
                LeyLines.id(MONDSTADT),
                LeyLines.id(TALL_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("venti"),
                "slim",
                LeyLines.id("venti_breezy_ode"),
                5,
                LeyLines.id(ANEMO),
                LeyLines.id(BOW),
                LeyLines.id(MONDSTADT),
                LeyLines.id(MEDIUM_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("vesna"),
                "slim",
                LeyLines.id("vesna_springs_bond_winters_oath"),
                5,
                LeyLines.id(ANEMO),
                LeyLines.id(SWORD),
                LeyLines.id(SNEZHNAYA),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("vodyanitsa"),
                "slim",
                LeyLines.id("vodyanitsa_surging_resonance"),
                5,
                LeyLines.id(HYDRO),
                LeyLines.id(CATALYST),
                LeyLines.id(SNEZHNAYA),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("wanderer"),
                "slim",
                LeyLines.id("wanderer_a_wrathful_void"),
                5,
                LeyLines.id(ANEMO),
                LeyLines.id(CATALYST),
                LeyLines.id(SUMERU),
                LeyLines.id(MEDIUM_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("wonderland_manekin_female"),
                "slim",
                LeyLines.id("wonderland_manekina"),
                5,
                LeyLines.id(ADAPTIVE),
                LeyLines.id(SWORD),
                LeyLines.id(NONE),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("wonderland_manekin_male"),
                "slim",
                LeyLines.id("wonderland_manekin"),
                5,
                LeyLines.id(ADAPTIVE),
                LeyLines.id(SWORD),
                LeyLines.id(NONE),
                LeyLines.id(MEDIUM_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("wriothesley"),
                "slim",
                LeyLines.id("wriothesley_nights_chilling_howl"),
                5,
                LeyLines.id(CRYO),
                LeyLines.id(CATALYST),
                LeyLines.id(FONTAINE),
                LeyLines.id(TALL_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("xiangling"),
                "slim",
                LeyLines.id("xiangling_red_pepper_and_tumeric"),
                4,
                LeyLines.id(PYRO),
                LeyLines.id(POLEARM),
                LeyLines.id(LIYUE),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("xianyun"),
                "slim",
                LeyLines.id("xianyun_a_guests_august_omen"),
                5,
                LeyLines.id(ANEMO),
                LeyLines.id(CATALYST),
                LeyLines.id(LIYUE),
                LeyLines.id(TALL_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("xiao"),
                "slim",
                LeyLines.id("xiao_endurer_of_eons"),
                5,
                LeyLines.id(ANEMO),
                LeyLines.id(POLEARM),
                LeyLines.id(LIYUE),
                LeyLines.id(MEDIUM_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("xilonen"),
                "slim",
                LeyLines.id("xilonen_gold_draped_gorge"),
                5,
                LeyLines.id(GEO),
                LeyLines.id(SWORD),
                LeyLines.id(NATLAN),
                LeyLines.id(TALL_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("xingqiu"),
                "slim",
                LeyLines.id("xingqiu_azure_silk"),
                4,
                LeyLines.id(HYDRO),
                LeyLines.id(SWORD),
                LeyLines.id(LIYUE),
                LeyLines.id(MEDIUM_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("xinyan"),
                "slim",
                LeyLines.id("xinyan_ardent_soul"),
                4,
                LeyLines.id(PYRO),
                LeyLines.id(CLAYMORE),
                LeyLines.id(LIYUE),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("yae_miko"),
                "slim",
                LeyLines.id("yae_miko_mikos_instruction"),
                5,
                LeyLines.id(ELECTRO),
                LeyLines.id(CATALYST),
                LeyLines.id(INAZUMA),
                LeyLines.id(TALL_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("yanfei"),
                "slim",
                LeyLines.id("yanfei_golden_rule"),
                4,
                LeyLines.id(PYRO),
                LeyLines.id(CATALYST),
                LeyLines.id(LIYUE),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("yaoyao"),
                "slim",
                LeyLines.id("yaoyao_cherubic_osmanthus"),
                4,
                LeyLines.id(DENDRO),
                LeyLines.id(POLEARM),
                LeyLines.id(LIYUE),
                LeyLines.id(SHORT_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("yelan"),
                "slim",
                LeyLines.id("yelan_the_warning_point"),
                5,
                LeyLines.id(HYDRO),
                LeyLines.id(BOW),
                LeyLines.id(LIYUE),
                LeyLines.id(TALL_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("yoimiya"),
                "slim",
                LeyLines.id("yoimiya_goldfish_firecracker"),
                5,
                LeyLines.id(PYRO),
                LeyLines.id(BOW),
                LeyLines.id(INAZUMA),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("yumemizuki_mizuki"),
                "slim",
                LeyLines.id("yumemizuki_mizuki_dawnbreath_dreambelle"),
                5,
                LeyLines.id(ANEMO),
                LeyLines.id(CATALYST),
                LeyLines.id(INAZUMA),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("yun_jin"),
                "slim",
                LeyLines.id("yun_jin_mistcloud_stage"),
                4,
                LeyLines.id(GEO),
                LeyLines.id(POLEARM),
                LeyLines.id(LIYUE),
                LeyLines.id(MEDIUM_FEMALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("zhongli"),
                "slim",
                LeyLines.id("zhongli_hermit_of_mortal_life"),
                5,
                LeyLines.id(GEO),
                LeyLines.id(POLEARM),
                LeyLines.id(LIYUE),
                LeyLines.id(TALL_MALE)
        );
        addCharacter(futures, writer,
                LeyLines.id("zibai"),
                "slim",
                LeyLines.id("zibai_moonlit_courser"),
                5,
                LeyLines.id(GEO),
                LeyLines.id(SWORD),
                LeyLines.id(LIYUE),
                LeyLines.id(TALL_FEMALE)
        );
        return CompletableFuture.allOf(futures.toArray(CompletableFuture[]::new));
    }

    private void addCharacter(List<CompletableFuture<?>> futures, DataWriter writer, Identifier id, String model, Identifier defaultSkin, int starCount, Identifier element, Identifier weapon, Identifier region, Identifier modelType) {
        JsonObject json = new JsonObject();
        json.addProperty("id", id.toString());
        json.addProperty("model", model);
        json.addProperty("default_skin", defaultSkin.toString());

        JsonObject characterData = new JsonObject();
        characterData.addProperty("starCount", starCount);
        characterData.addProperty("element", element.toString());
        characterData.addProperty("weapon", weapon.toString());
        characterData.addProperty("region", region.toString());
        characterData.addProperty("modelType", modelType.toString());

        json.add("character_data", characterData);
        futures.add(DataProvider.writeToPath(writer, json, output.getResolver(DataOutput.OutputType.DATA_PACK, "characters").resolveJson(id)));
    }

    @Override public String getName() {
        return "Character Data";
    }
}
