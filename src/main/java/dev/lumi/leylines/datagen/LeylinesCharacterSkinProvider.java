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

public class LeylinesCharacterSkinProvider implements DataProvider {
    private final FabricDataOutput output;

    public LeylinesCharacterSkinProvider(FabricDataOutput output) {
        this.output = output;
    }

    @Override public CompletableFuture<?> run(DataWriter writer) {
        List<CompletableFuture<?>> futures = new ArrayList<>();

        //Aino
        addCharacterSkin(futures, writer,
                LeyLines.id("aino_fluffy_puffy_whiz_kid_workwear"),
                LeyLines.id("aino"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Albedo
        addCharacterSkin(futures, writer,
                LeyLines.id("albedo_newmoon_starlight"),
                LeyLines.id("albedo"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Alhaitham
        addCharacterSkin(futures, writer,
                LeyLines.id("alhaitham_the_rational"),
                LeyLines.id("alhaitham"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Aloy
        addCharacterSkin(futures, writer,
                LeyLines.id("aloy_machine_hunter"),
                LeyLines.id("aloy"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Alyosha
        addCharacterSkin(futures, writer,
                LeyLines.id("alyosha_frost_cloaked_ambusher"),
                LeyLines.id("alyosha"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Amber
        addCharacterSkin(futures, writer,
                LeyLines.id("amber_5_star_outrider"),
                LeyLines.id("amber"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkin(futures, writer,
                LeyLines.id("amber_100_outrider"),
                LeyLines.id("amber"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Arataki Itto
        addCharacterSkin(futures, writer,
                LeyLines.id("arataki_itto_eccentric_oni"),
                LeyLines.id("arataki_itto"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Arlecchino
        addCharacterSkin(futures, writer,
                LeyLines.id("arlecchino_moonglare"),
                LeyLines.id("arlecchino"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Baizhu
        addCharacterSkin(futures, writer,
                LeyLines.id("baizhu_the_applications_of_medicine"),
                LeyLines.id("baizhu"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Barbara
        addCharacterSkin(futures, writer,
                LeyLines.id("barbara_innocent_longing"),
                LeyLines.id("barbara"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkin(futures, writer,
                LeyLines.id("barbara_summertime_sparkle"),
                LeyLines.id("barbara"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Beidou
        addCharacterSkin(futures, writer,
                LeyLines.id("beidou_rolling_waves"),
                LeyLines.id("beidou"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Bennett
        addCharacterSkin(futures, writer,
                LeyLines.id("bennett_fortunes_favor"),
                LeyLines.id("bennett"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkin(futures, writer,
                LeyLines.id("bennett_adventures_in_blazing_hue"),
                LeyLines.id("bennett"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Candace
        addCharacterSkin(futures, writer,
                LeyLines.id("candace_desert_and_night"),
                LeyLines.id("candace"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Charlotte
        addCharacterSkin(futures, writer,
                LeyLines.id("charlotte_all_is_overt_through_my_lens"),
                LeyLines.id("charlotte"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkin(futures, writer,
                LeyLines.id("charlotte_hurlock_variations"),
                LeyLines.id("charlotte"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Chasca
        addCharacterSkin(futures, writer,
                LeyLines.id("chasca_tlalocans_night_phantom"),
                LeyLines.id("chasca"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Chevreuse
        addCharacterSkin(futures, writer,
                LeyLines.id("chevreuse_guardians_gun"),
                LeyLines.id("chevreuse"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Chiori
        addCharacterSkin(futures, writer,
                LeyLines.id("chiori_plucked_yamabuki_splendor"),
                LeyLines.id("chiori"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Chongyun
        addCharacterSkin(futures, writer,
                LeyLines.id("chongyun_pure_spirit"),
                LeyLines.id("chongyun"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Citlali
        addCharacterSkin(futures, writer,
                LeyLines.id("citlali_dawnseer"),
                LeyLines.id("citlali"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkin(futures, writer,
                LeyLines.id("citlali_whispers_of_stars_and_smoke"),
                LeyLines.id("citlali"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Clorinde
        addCharacterSkin(futures, writer,
                LeyLines.id("clorinde_sword_of_honor"),
                LeyLines.id("clorinde"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Collei
        addCharacterSkin(futures, writer,
                LeyLines.id("collei_a_new_leaf"),
                LeyLines.id("collei"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Columbina
        addCharacterSkin(futures, writer,
                LeyLines.id("columbina_moonweave_gossamer"),
                LeyLines.id("columbina"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Cyno
        addCharacterSkin(futures, writer,
                LeyLines.id("cyno_heart_of_the_scales"),
                LeyLines.id("cyno"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Dahlia
        addCharacterSkin(futures, writer,
                LeyLines.id("dahlia_pristine_prayers"),
                LeyLines.id("dahlia"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Dehya
        addCharacterSkin(futures, writer,
                LeyLines.id("dehya_the_lioness_and_the_blazing_sun"),
                LeyLines.id("dehya"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Diluc
        addCharacterSkin(futures, writer,
                LeyLines.id("diluc_darknight_blaze"),
                LeyLines.id("diluc"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkin(futures, writer,
                LeyLines.id("diluc_red_dead_of_night"),
                LeyLines.id("diluc"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Diona
        addCharacterSkin(futures, writer,
                LeyLines.id("diona_sugary_brew"),
                LeyLines.id("diona"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Dori
        addCharacterSkin(futures, writer,
                LeyLines.id("dori_i_love_mora"),
                LeyLines.id("dori"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Durin
        addCharacterSkin(futures, writer,
                LeyLines.id("durin_a_gift_from_the_stars"),
                LeyLines.id("durin"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkin(futures, writer,
                LeyLines.id("durin_toward_the_distant_horizon"),
                LeyLines.id("durin"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Emilie
        addCharacterSkin(futures, writer,
                LeyLines.id("emilie_ambrosial_verdance"),
                LeyLines.id("emilie"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Escoffier
        addCharacterSkin(futures, writer,
                LeyLines.id("escoffier_sorbet_honey_pie"),
                LeyLines.id("escoffier"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Eula
        addCharacterSkin(futures, writer,
                LeyLines.id("eula_wavecrest_waltz"),
                LeyLines.id("eula"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Faruzan
        addCharacterSkin(futures, writer,
                LeyLines.id("faruzan_pristine_elegance"),
                LeyLines.id("faruzan"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Fischl
        addCharacterSkin(futures, writer,
                LeyLines.id("fischl_dunkelnacht_sakrament"),
                LeyLines.id("fischl"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkin(futures, writer,
                LeyLines.id("fischl_ein_immernachtstraum"),
                LeyLines.id("fischl"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Flins
        addCharacterSkin(futures, writer,
                LeyLines.id("flins_nocturne"),
                LeyLines.id("flins"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Freminet
        addCharacterSkin(futures, writer,
                LeyLines.id("freminet_icy_skin"),
                LeyLines.id("freminet"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Furina
        addCharacterSkin(futures, writer,
                LeyLines.id("furina_coronated_prima_donna"),
                LeyLines.id("furina"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Gaming
        addCharacterSkin(futures, writer,
                LeyLines.id("gaming_ranging_rainbow"),
                LeyLines.id("gaming"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Ganyu
        addCharacterSkin(futures, writer,
                LeyLines.id("ganyu_frostdew_trail"),
                LeyLines.id("ganyu"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkin(futures, writer,
                LeyLines.id("ganyu_twilight_blossom"),
                LeyLines.id("ganyu"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Gorou
        addCharacterSkin(futures, writer,
                LeyLines.id("gorou_panoply_of_a_hundred_hunts"),
                LeyLines.id("gorou"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Hu Tao
        addCharacterSkin(futures, writer,
                LeyLines.id("hu_tao_plum_blossom_bouquet"),
                LeyLines.id("hu_tao"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkin(futures, writer,
                LeyLines.id("hu_tao_cherries_snow_laden"),
                LeyLines.id("hu_tao"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Iansan
        addCharacterSkin(futures, writer,
                LeyLines.id("iansan_warriors_bonegarb"),
                LeyLines.id("iansan"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Ifa
        addCharacterSkin(futures, writer,
                LeyLines.id("ifa_whistledart_wings"),
                LeyLines.id("ifa"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Illuga
        addCharacterSkin(futures, writer,
                LeyLines.id("illuga_steadfast_resolve"),
                LeyLines.id("illuga"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Ineffa
        addCharacterSkin(futures, writer,
                LeyLines.id("ineffa_mechanical_dreams"),
                LeyLines.id("ineffa"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Jahoda
        addCharacterSkin(futures, writer,
                LeyLines.id("jahoda_novas_whisper"),
                LeyLines.id("jahoda"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Jean
        addCharacterSkin(futures, writer,
                LeyLines.id("jean_favonian_devotion"),
                LeyLines.id("jean"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkin(futures, writer,
                LeyLines.id("jean_sea_breeze_dandelion"),
                LeyLines.id("jean"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkin(futures, writer,
                LeyLines.id("jean_gunnhildrs_legacy"),
                LeyLines.id("jean"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Kachina
        addCharacterSkin(futures, writer,
                LeyLines.id("kachina_tawny_peaks_spired_rock"),
                LeyLines.id("kachina"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Kaedehara Kazuha
        addCharacterSkin(futures, writer,
                LeyLines.id("kaedehara_kazuha_falling_leaves"),
                LeyLines.id("kaedehara_kazuha"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Kaeya
        addCharacterSkin(futures, writer,
                LeyLines.id("kaeya_icy_featherflight"),
                LeyLines.id("kaeya"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkin(futures, writer,
                LeyLines.id("kaeya_sailwind_shadow"),
                LeyLines.id("kaeya"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Kamisato Ayaka
        addCharacterSkin(futures, writer,
                LeyLines.id("kamisato_ayaka_flawless_radiance"),
                LeyLines.id("kamisato_ayaka"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkin(futures, writer,
                LeyLines.id("kamisato_ayaka_springbloom_missive"),
                LeyLines.id("kamisato_ayaka"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Kamisato Ayato
        addCharacterSkin(futures, writer,
                LeyLines.id("kamisato_ayato_silk_splendor"),
                LeyLines.id("kamisato_ayato"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Kaveh
        addCharacterSkin(futures, writer,
                LeyLines.id("kaveh_gold_pinions_in_flames_bathed"),
                LeyLines.id("kaveh"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Keqing
        addCharacterSkin(futures, writer,
                LeyLines.id("keqing_piercing_thunderbolt"),
                LeyLines.id("keqing"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkin(futures, writer,
                LeyLines.id("keqing_opulent_splendor"),
                LeyLines.id("keqing"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Kinich
        addCharacterSkin(futures, writer,
                LeyLines.id("kinich_eight_bit_artistry"),
                LeyLines.id("kinich"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Kirara
        addCharacterSkin(futures, writer,
                LeyLines.id("kirara_whirling_bloom"),
                LeyLines.id("kirara"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkin(futures, writer,
                LeyLines.id("kirara_phantom_in_boots"),
                LeyLines.id("kirara"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Klee
        addCharacterSkin(futures, writer,
                LeyLines.id("klee_shooting_spark"),
                LeyLines.id("klee"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkin(futures, writer,
                LeyLines.id("klee_blossoming_starlight"),
                LeyLines.id("klee"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Kujou Sara
        addCharacterSkin(futures, writer,
                LeyLines.id("kujou_sara_solemn_purity"),
                LeyLines.id("kujou_sara"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Kuki Shinobu
        addCharacterSkin(futures, writer,
                LeyLines.id("kuki_shinobu_aratakis_demonic_deputy"),
                LeyLines.id("kuki_shinobu"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Lan Yan
        addCharacterSkin(futures, writer,
                LeyLines.id("lan_yan_argent_chimes"),
                LeyLines.id("lan_yan"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Lauma
        addCharacterSkin(futures, writer,
                LeyLines.id("lauma_verdant_moon"),
                LeyLines.id("lauma"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Layla
        addCharacterSkin(futures, writer,
                LeyLines.id("layla_dreaming_star"),
                LeyLines.id("layla"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Linnea
        addCharacterSkin(futures, writer,
                LeyLines.id("linnea_lone_feathers_omen"),
                LeyLines.id("linnea"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Lisa
        addCharacterSkin(futures, writer,
                LeyLines.id("lisa_purple_rose"),
                LeyLines.id("lisa"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkin(futures, writer,
                LeyLines.id("lisa_a_sobriquet_under_shade"),
                LeyLines.id("lisa"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Lohen
        addCharacterSkin(futures, writer,
                LeyLines.id("lohen_frost_forged_edge"),
                LeyLines.id("lohen"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Lynette
        addCharacterSkin(futures, writer,
                LeyLines.id("lynette_phantomeow"),
                LeyLines.id("lynette"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Lyney
        addCharacterSkin(futures, writer,
                LeyLines.id("lyney_fantasticat"),
                LeyLines.id("lyney"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Mavuika
        addCharacterSkin(futures, writer,
                LeyLines.id("mavuika_undying_sun"),
                LeyLines.id("mavuika"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Mika
        addCharacterSkin(futures, writer,
                LeyLines.id("mika_soaring_beacon"),
                LeyLines.id("mika"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Mona
        addCharacterSkin(futures, writer,
                LeyLines.id("mona_flowing_fate"),
                LeyLines.id("mona"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkin(futures, writer,
                LeyLines.id("mona_pact_of_stars_and_moon"),
                LeyLines.id("mona"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Mualani
        addCharacterSkin(futures, writer,
                LeyLines.id("mualani_flying_fish_heat_waves_and_moon_scallop"),
                LeyLines.id("mualani"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Nahida
        addCharacterSkin(futures, writer,
                LeyLines.id("nahida_for_all_knowledge_a_verse"),
                LeyLines.id("nahida"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Navia
        addCharacterSkin(futures, writer,
                LeyLines.id("navia_yellow_velvet_salon"),
                LeyLines.id("navia"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Nefer
        addCharacterSkin(futures, writer,
                LeyLines.id("nefer_emerald_cipher"),
                LeyLines.id("nefer"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Neuvillette
        addCharacterSkin(futures, writer,
                LeyLines.id("neuvillette_clear_adjudication"),
                LeyLines.id("neuvillette"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkin(futures, writer,
                LeyLines.id("neuvillette_melusent_gift"),
                LeyLines.id("neuvillette"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Nicole
        addCharacterSkin(futures, writer,
                LeyLines.id("nicole_mimetic_interpretation"),
                LeyLines.id("nicole"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Nilou
        addCharacterSkin(futures, writer,
                LeyLines.id("nilou_neither_flower_nor_mist"),
                LeyLines.id("nilou"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkin(futures, writer,
                LeyLines.id("nilou_breeze_of_sabaa"),
                LeyLines.id("nilou"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Ningguang
        addCharacterSkin(futures, writer,
                LeyLines.id("ningguang_gold_lead_and_pearly_jade"),
                LeyLines.id("ningguang"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkin(futures, writer,
                LeyLines.id("ningguang_orchids_evening_gown"),
                LeyLines.id("ningguang"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Noelle
        addCharacterSkin(futures, writer,
                LeyLines.id("noelle_armored_rose"),
                LeyLines.id("noelle"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Odette
        addCharacterSkin(futures, writer,
                LeyLines.id("odette_snow_swans_dance"),
                LeyLines.id("odette"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Ororon
        addCharacterSkin(futures, writer,
                LeyLines.id("ororon_batwing_iris"),
                LeyLines.id("ororon"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Prune
        addCharacterSkin(futures, writer,
                LeyLines.id("prune_witch_hunter_regalia"),
                LeyLines.id("prune"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Qiqi
        addCharacterSkin(futures, writer,
                LeyLines.id("qiqi_summerchill_dreams"),
                LeyLines.id("qiqi"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Raiden Shogun
        addCharacterSkin(futures, writer,
                LeyLines.id("raiden_shogun_narukamis_law"),
                LeyLines.id("raiden_shogun"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Razor
        addCharacterSkin(futures, writer,
                LeyLines.id("razor_wild_sprint"),
                LeyLines.id("razor"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Rosaria
        addCharacterSkin(futures, writer,
                LeyLines.id("rosaria_executors_thorns"),
                LeyLines.id("rosaria"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkin(futures, writer,
                LeyLines.id("rosaria_to_the_churchs_free_spirit"),
                LeyLines.id("rosaria"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Sandrone
        addCharacterSkin(futures, writer,
                LeyLines.id("sandrone_clockwork_maidens_waltz"),
                LeyLines.id("sandrone"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Sangonomiya Kokomi
        addCharacterSkin(futures, writer,
                LeyLines.id("sangonomiya_kokomi_sparkling_coralbone"),
                LeyLines.id("sangonomiya_kokomi"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Sayu
        addCharacterSkin(futures, writer,
                LeyLines.id("sayu_mini_mujina"),
                LeyLines.id("sayu"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Sethos
        addCharacterSkin(futures, writer,
                LeyLines.id("sethos_golden_sandstrider"),
                LeyLines.id("sethos"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Shenhe
        addCharacterSkin(futures, writer,
                LeyLines.id("shenhe_the_worlds_shackles"),
                LeyLines.id("shenhe"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkin(futures, writer,
                LeyLines.id("shenhe_frostflower_dew"),
                LeyLines.id("shenhe"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Shikanoin Heizou
        addCharacterSkin(futures, writer,
                LeyLines.id("shikanoin_heizou_spirited_valor"),
                LeyLines.id("shikanoin_heizou"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Sigewinne
        addCharacterSkin(futures, writer,
                LeyLines.id("sigewinne_sweetness_of_the_sea"),
                LeyLines.id("sigewinne"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Skirk
        addCharacterSkin(futures, writer,
                LeyLines.id("skirk_shattered_star"),
                LeyLines.id("skirk"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Sucrose
        addCharacterSkin(futures, writer,
                LeyLines.id("sucrose_germinating_wind"),
                LeyLines.id("sucrose"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Tartaglia
        addCharacterSkin(futures, writer,
                LeyLines.id("tartaglia_blades_of_glory"),
                LeyLines.id("tartaglia"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Thoma
        addCharacterSkin(futures, writer,
                LeyLines.id("thoma_warrior_of_flame"),
                LeyLines.id("thoma"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Tighnari
        addCharacterSkin(futures, writer,
                LeyLines.id("tighnari_woodland_song"),
                LeyLines.id("tighnari"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Traveler Female
        addCharacterSkinComplex(futures, writer,
                LeyLines.id("lumine_rising_star"),
                LeyLines.id("traveler_female"),
                LeyLines.id("textures/character/traveler/skins/traveler_female/lumine_rising_star.png"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkinComplex(futures, writer,
                LeyLines.id("lumine_as_heaven_and_earth_are_made_anew"),
                LeyLines.id("traveler_female"),
                LeyLines.id("textures/character/traveler/skins/traveler_female/lumine_as_heaven_and_earth_are_made_anew.png"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkinComplex(futures, writer,
                LeyLines.id("lumine_night_hunt_in_snow"),
                LeyLines.id("traveler_female"),
                LeyLines.id("textures/character/traveler/skins/traveler_female/lumine_night_hunt_in_snow.png"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Traveler Male
        addCharacterSkinComplex(futures, writer,
                LeyLines.id("aether_rising_star"),
                LeyLines.id("traveler_male"),
                LeyLines.id("textures/character/traveler/skins/traveler_male/aether_rising_star.png"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkinComplex(futures, writer,
                LeyLines.id("aether_as_heaven_and_earth_are_made_anew"),
                LeyLines.id("traveler_male"),
                LeyLines.id("textures/character/traveler/skins/traveler_male/aether_as_heaven_and_earth_are_made_anew.png"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkinComplex(futures, writer,
                LeyLines.id("aether_night_hunt_in_snow"),
                LeyLines.id("traveler_male"),
                LeyLines.id("textures/character/traveler/skins/traveler_male/aether_night_hunt_in_snow.png"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Varesa
        addCharacterSkin(futures, writer,
                LeyLines.id("varesa_sugar_rush"),
                LeyLines.id("varesa"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Varka
        addCharacterSkin(futures, writer,
                LeyLines.id("varka_oath_to_the_north_wind"),
                LeyLines.id("varka"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Venti
        addCharacterSkin(futures, writer,
                LeyLines.id("venti_breezy_ode"),
                LeyLines.id("venti"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Vesna
        addCharacterSkin(futures, writer,
                LeyLines.id("vesna_springs_bond_winters_oath"),
                LeyLines.id("vesna"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Vodyanitsa
        addCharacterSkin(futures, writer,
                LeyLines.id("vodyanitsa_surging_resonance"),
                LeyLines.id("vodyanitsa"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Wanderer
        addCharacterSkin(futures, writer,
                LeyLines.id("wanderer_a_wrathful_void"),
                LeyLines.id("wanderer"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Wonderland Manekin
        addCharacterSkinComplex(futures, writer,
                LeyLines.id("wonderland_manekin"),
                LeyLines.id("wonderland_manekin_male"),
                LeyLines.id("textures/character/wonderland_manekin/skins/wonderland_manekin_male.png"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Wonderland Manekina
        addCharacterSkinComplex(futures, writer,
                LeyLines.id("wonderland_manekina"),
                LeyLines.id("wonderland_manekin_female"),
                LeyLines.id("textures/character/wonderland_manekin/skins/wonderland_manekin_female.png"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Wriothesley
        addCharacterSkin(futures, writer,
                LeyLines.id("wriothesley_nights_chilling_howl"),
                LeyLines.id("wriothesley"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Xiangling
        addCharacterSkin(futures, writer,
                LeyLines.id("xiangling_red_pepper_and_tumeric"),
                LeyLines.id("xiangling"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkin(futures, writer,
                LeyLines.id("xiangling_new_years_cheer"),
                LeyLines.id("xiangling"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Xianyun
        addCharacterSkin(futures, writer,
                LeyLines.id("xianyun_a_guests_august_omen"),
                LeyLines.id("xianyun"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Xiao
        addCharacterSkin(futures, writer,
                LeyLines.id("xiao_endurer_of_eons"),
                LeyLines.id("xiao"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Xilonen
        addCharacterSkin(futures, writer,
                LeyLines.id("xilonen_gold_draped_gorge"),
                LeyLines.id("xilonen"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Xingqiu
        addCharacterSkin(futures, writer,
                LeyLines.id("xingqiu_azure_silk"),
                LeyLines.id("xingqiu"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkin(futures, writer,
                LeyLines.id("xingqiu_bamboo_rain"),
                LeyLines.id("xingqiu"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Xinyan
        addCharacterSkin(futures, writer,
                LeyLines.id("xinyan_ardent_soul"),
                LeyLines.id("xinyan"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Yae Miko
        addCharacterSkin(futures, writer,
                LeyLines.id("yae_miko_mikos_instruction"),
                LeyLines.id("yae_miko"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Yanfei
        addCharacterSkin(futures, writer,
                LeyLines.id("yanfei_golden_rule"),
                LeyLines.id("yanfei"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Yaoyao
        addCharacterSkin(futures, writer,
                LeyLines.id("yaoyao_cherubic_osmanthus"),
                LeyLines.id("yaoyao"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkin(futures, writer,
                LeyLines.id("yaoyao_rainlit_bamboo_reverie"),
                LeyLines.id("yaoyao"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Yelan
        addCharacterSkin(futures, writer,
                LeyLines.id("yelan_the_warning_point"),
                LeyLines.id("yelan"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );
        addCharacterSkin(futures, writer,
                LeyLines.id("yelan_tranquil_banquet"),
                LeyLines.id("yelan"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Yoimiya
        addCharacterSkin(futures, writer,
                LeyLines.id("yoimiya_goldfish_firecracker"),
                LeyLines.id("yoimiya"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Yumemizuki Mizuki
        addCharacterSkin(futures, writer,
                LeyLines.id("yumemizuki_mizuki_dawnbreath_dreambelle"),
                LeyLines.id("yumemizuki_mizuki"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Yun Jin
        addCharacterSkin(futures, writer,
                LeyLines.id("yun_jin_mistcloud_stage"),
                LeyLines.id("yun_jin"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Zhongli
        addCharacterSkin(futures, writer,
                LeyLines.id("zhongli_hermit_of_mortal_life"),
                LeyLines.id("zhongli"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        //Zibai
        addCharacterSkin(futures, writer,
                LeyLines.id("zibai_moonlit_courser"),
                LeyLines.id("zibai"),
                "slim",
                false,
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id(""),
                LeyLines.id("")
        );

        return CompletableFuture.allOf(futures.toArray(CompletableFuture[]::new));
    }

    private void addCharacterSkin(List<CompletableFuture<?>> futures, DataWriter writer, Identifier id, Identifier character, String model, Boolean useGecko, Identifier geckoTexture, Identifier geckoGlowTexture, Identifier geckoModel, Identifier geckoAnimations) {
        JsonObject json = new JsonObject();
        json.addProperty("id", id.toString());
        json.addProperty("character", character.toString());

        JsonObject vanilla = new JsonObject();
        vanilla.addProperty("texture", vanillaTexture(character, id).toString());
        vanilla.addProperty("model", model);

        JsonObject gecko = new JsonObject();
        gecko.addProperty("useGeckoModel", useGecko);
        gecko.addProperty("texture", geckoTexture.toString());
        gecko.addProperty("glow_texture", geckoGlowTexture.toString());
        gecko.addProperty("model", geckoModel.toString());
        gecko.addProperty("animation", geckoAnimations.toString());

        json.add("vanilla", vanilla);
        json.add("gecko", gecko);
        futures.add(DataProvider.writeToPath(writer, json, output.getResolver(DataOutput.OutputType.DATA_PACK, "skins").resolveJson(id)));
    }

    private void addCharacterSkinComplex(List<CompletableFuture<?>> futures, DataWriter writer, Identifier id, Identifier character, Identifier vanillaTexture, String model, Boolean useGecko, Identifier geckoTexture, Identifier geckoGlowTexture, Identifier geckoModel, Identifier geckoAnimations) {
        JsonObject json = new JsonObject();
        json.addProperty("id", id.toString());
        json.addProperty("character", character.toString());

        JsonObject vanilla = new JsonObject();
        vanilla.addProperty("texture", vanillaTexture.toString());
        vanilla.addProperty("model", model);

        JsonObject gecko = new JsonObject();
        gecko.addProperty("useGeckoModel", useGecko);
        gecko.addProperty("texture", geckoTexture.toString());
        gecko.addProperty("glow_texture", geckoGlowTexture.toString());
        gecko.addProperty("model", geckoModel.toString());
        gecko.addProperty("animation", geckoAnimations.toString());

        json.add("vanilla", vanilla);
        json.add("gecko", gecko);
        futures.add(DataProvider.writeToPath(writer, json, output.getResolver(DataOutput.OutputType.DATA_PACK, "skins").resolveJson(id)));
    }

    private Identifier vanillaTexture(Identifier character, Identifier id) {
        return LeyLines.id("textures/character/" + character.getPath() + "/skins/" + id.getPath() + ".png");
    }

    @Override public String getName() {
        return "Character Skin Data";
    }
}
