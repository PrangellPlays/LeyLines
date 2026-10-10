package dev.lumi.leylines.datagen;

import dev.lumi.leylines.index.LeyLinesItems;
import dev.lumi.leylines.index.keybinds.LeyLinesKeybinds;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class LeyLinesLangProvider extends FabricLanguageProvider {
    public LeyLinesLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, @NotNull TranslationBuilder builder) {
        //Weapon Type
        builder.add("weapon_type.leylines.sword", "Sword");
        builder.add("weapon_type.leylines.claymore", "Claymore");
        builder.add("weapon_type.leylines.polearm", "Polearm");
        builder.add("weapon_type.leylines.catalyst", "Catalyst");
        builder.add("weapon_type.leylines.bow", "Bow");

        //Star Count
        builder.add("stars.leylines.one", "One Star");
        builder.add("stars.leylines.two", "Two Star");
        builder.add("stars.leylines.three", "Three Star");
        builder.add("stars.leylines.four", "Four Star");
        builder.add("stars.leylines.five", "Five Star");

        //Elements
        builder.add("element.leylines.anemo", "Anemo");
        builder.add("element.leylines.geo", "Geo");
        builder.add("element.leylines.electro", "Electro");
        builder.add("element.leylines.dendro", "Dendro");
        builder.add("element.leylines.hydro", "Hydro");
        builder.add("element.leylines.pyro", "Pyro");
        builder.add("element.leylines.cryo", "Cryo");
        builder.add("element.leylines.adaptive", "Adaptive");

        //Region
        builder.add("region.leylines.mondstadt", "Mondstadt");
        builder.add("region.leylines.liyue", "Liyue");
        builder.add("region.leylines.inazuma", "Inazuma");
        builder.add("region.leylines.sumeru", "Sumeru");
        builder.add("region.leylines.fontaine", "Fontaine");
        builder.add("region.leylines.natlan", "Natlan");
        builder.add("region.leylines.nod_krai", "Nod-Krai");
        builder.add("region.leylines.snezhnaya", "Snezhnaya");
        builder.add("region.leylines.khaenriah", "Khaenri'ah");
        builder.add("region.leylines.none", "None");

        //Sub Region - Mondstadt
        builder.add("sub_region.leylines.mondstadt.brightcrown_mountains", "Brightcrown Mountains");
        builder.add("sub_region.leylines.mondstadt.brightcrown_mountains.brightcrown_canyon", "Brightcrown Canyon");
        builder.add("sub_region.leylines.mondstadt.brightcrown_mountains.stormterrors_lair", "Stormterror's Lair");

        builder.add("sub_region.leylines.mondstadt.galesong_hill", "Galesong Hill");
        builder.add("sub_region.leylines.mondstadt.galesong_hill.cape_oath", "Cape Oath");
        builder.add("sub_region.leylines.mondstadt.galesong_hill.dadaupa_gorge", "Dadaupa Gorge");
        builder.add("sub_region.leylines.mondstadt.galesong_hill.falcon_coast", "Falcon Coast");
        builder.add("sub_region.leylines.mondstadt.galesong_hill.musk_reef", "Musk Reef");
        builder.add("sub_region.leylines.mondstadt.galesong_hill.windrise", "Windrise");

        builder.add("sub_region.leylines.mondstadt.starfell_valley", "Starfell Valley");
        builder.add("sub_region.leylines.mondstadt.starfell_valley.cider_lake", "Cider Lake");
        builder.add("sub_region.leylines.mondstadt.starfell_valley.mondstadt", "Mondstadt");
        builder.add("sub_region.leylines.mondstadt.starfell_valley.starfell_lake", "Starfell Lake");
        builder.add("sub_region.leylines.mondstadt.starfell_valley.starsnatch_cliff", "Starsnatch Cliff");
        builder.add("sub_region.leylines.mondstadt.starfell_valley.stormbearer_mountains", "Stormbearer Mountains");
        builder.add("sub_region.leylines.mondstadt.starfell_valley.stormbearer_point", "Stormbearer Point");
        builder.add("sub_region.leylines.mondstadt.starfell_valley.thousand_winds_temple", "Thousand Winds Temple");
        builder.add("sub_region.leylines.mondstadt.starfell_valley.whispering_woods", "Whispering Woods");

        builder.add("sub_region.leylines.mondstadt.windwail_highland", "Windwail Highland");
        builder.add("sub_region.leylines.mondstadt.windwail_highland.dawn_winery", "Dawn Winery");
        builder.add("sub_region.leylines.mondstadt.windwail_highland.springvale", "Springvale");
        builder.add("sub_region.leylines.mondstadt.windwail_highland.wolvendom", "Wolvendom");

        builder.add("sub_region.leylines.mondstadt.dragonspine", "Dragonspine");
        builder.add("sub_region.leylines.mondstadt.dragonspine.entombed_city_ancient_palace", "Entombed City - Ancient Palace");
        builder.add("sub_region.leylines.mondstadt.dragonspine.entombed_city_outskirts", "Entombed City - Outskirts");
        builder.add("sub_region.leylines.mondstadt.dragonspine.skyfrost_nail", "Skyfrost Nail");
        builder.add("sub_region.leylines.mondstadt.dragonspine.snow_covered_path", "Snow-Covered Path");
        builder.add("sub_region.leylines.mondstadt.dragonspine.starglow_cavern", "Starglow Cavern");
        builder.add("sub_region.leylines.mondstadt.dragonspine.wyrmrest_valley", "Wyrmrest Valley");

        builder.add("sub_region.leylines.mondstadt.windrest_peak", "Windrest Peak");
        builder.add("sub_region.leylines.mondstadt.windrest_peak.dornman_port", "Dornman Port");
        builder.add("sub_region.leylines.mondstadt.windrest_peak.millhaven", "Millhaven");
        builder.add("sub_region.leylines.mondstadt.windrest_peak.old_sanatorium_site", "Old Sanatorium Site");

        //Sub Region - Liyue
        builder.add("sub_region.leylines.liyue.bishui_plain", "Bishui Plain");
        builder.add("sub_region.leylines.liyue.bishui_plain.dihua_marsh", "Dihua Marsh");
        builder.add("sub_region.leylines.liyue.bishui_plain.qingce_village", "Qingce Village");
        builder.add("sub_region.leylines.liyue.bishui_plain.sal_terrae", "Sal Terrae");
        builder.add("sub_region.leylines.liyue.bishui_plain.stone_gate", "Stone Gate");
        builder.add("sub_region.leylines.liyue.bishui_plain.wangshu_inn", "Wangshu Inn");
        builder.add("sub_region.leylines.liyue.bishui_plain.wuwang_hill", "Wuwang Hill");

        builder.add("sub_region.leylines.liyue.lisha", "Lisha");
        builder.add("sub_region.leylines.liyue.lisha.dunyu_ruins", "Dunyu Ruins");
        builder.add("sub_region.leylines.liyue.lisha.lingju_pass", "Lingju Pass");
        builder.add("sub_region.leylines.liyue.lisha.qingxu_pool", "Qingxu Pool");

        builder.add("sub_region.leylines.liyue.minlin", "Minlin");
        builder.add("sub_region.leylines.liyue.minlin.cuijue_slope", "Cuijue Slope");
        builder.add("sub_region.leylines.liyue.minlin.huaguang_stone_forest", "Huaguang Stone Forest");
        builder.add("sub_region.leylines.liyue.minlin.jueyun_karst", "Jueyun Karst");
        builder.add("sub_region.leylines.liyue.minlin.mt_aocang", "Mt. Aocang");
        builder.add("sub_region.leylines.liyue.minlin.mt_hulao", "Mt. Hulao");
        builder.add("sub_region.leylines.liyue.minlin.nantianmen", "Nantianmen");
        builder.add("sub_region.leylines.liyue.minlin.qingyun_peak", "Qingyun Peak");
        builder.add("sub_region.leylines.liyue.minlin.tianqiu_valley", "Tianqiu Valley");

        builder.add("sub_region.leylines.liyue.qiongji_estuary", "Qiongji Estuary");
        builder.add("sub_region.leylines.liyue.qiongji_estuary.guili_plains", "Guili Plains");
        builder.add("sub_region.leylines.liyue.qiongji_estuary.luhua_pool", "Luhua Pool");
        builder.add("sub_region.leylines.liyue.qiongji_estuary.mingyun_village", "Mingyun Village");
        builder.add("sub_region.leylines.liyue.qiongji_estuary.yaoguang_shoal", "Yaoguang Shoal");

        builder.add("sub_region.leylines.liyue.sea_of_clouds", "Sea of Clouds");
        builder.add("sub_region.leylines.liyue.sea_of_clouds.guyun_stone_forest", "Guyun Stone Forest");
        builder.add("sub_region.leylines.liyue.sea_of_clouds.liyue_harbor", "Liyue Harbor");
        builder.add("sub_region.leylines.liyue.sea_of_clouds.mt_tianheng", "Mt. Tianheng");

        builder.add("sub_region.leylines.liyue.the_chasm", "The Chasm");
        builder.add("sub_region.leylines.liyue.the_chasm.the_chasm", "The Chasm");
        builder.add("sub_region.leylines.liyue.the_chasm.the_chasm.cinnabar_cliff", "Cinnabar Cliff");
        builder.add("sub_region.leylines.liyue.the_chasm.the_chasm.fuao_vale", "Fuao Vale");
        builder.add("sub_region.leylines.liyue.the_chasm.the_chasm.glaze_peak", "Glaze Peak");
        builder.add("sub_region.leylines.liyue.the_chasm.the_chasm.lumberpick_valley", "Lumberpick Valley");
        builder.add("sub_region.leylines.liyue.the_chasm.the_chasm.the_chasms_maw", "The Chasm's Maw");
        builder.add("sub_region.leylines.liyue.the_chasm.the_chasm.the_surface", "The Surface");
        builder.add("sub_region.leylines.liyue.the_chasm.the_chasm.tiangong_gorge", "Tiangong Gorge");

        builder.add("sub_region.leylines.liyue.the_chasm.the_chasm_underground_mines", "The Chasm: Underground Mines");
        builder.add("sub_region.leylines.liyue.the_chasm.the_chasm_underground_mines.ad_hoc_main_tunnel", "Ad-Hoc Main Tunnel");
        builder.add("sub_region.leylines.liyue.the_chasm.the_chasm_underground_mines.nameless_ruins", "Nameless Ruins");
        builder.add("sub_region.leylines.liyue.the_chasm.the_chasm_underground_mines.stony_halls", "Stony Halls");
        builder.add("sub_region.leylines.liyue.the_chasm.the_chasm_underground_mines.the_chasm_main_mining_area", "The Chasm: Main Mining Area");
        builder.add("sub_region.leylines.liyue.the_chasm.the_chasm_underground_mines.the_glowing_narrows", "The Glowing Narrows");
        builder.add("sub_region.leylines.liyue.the_chasm.the_chasm_underground_mines.the_serpents_cave", "The Serpent's Cave");
        builder.add("sub_region.leylines.liyue.the_chasm.the_chasm_underground_mines.underground_waterway", "Underground Waterway");

        builder.add("sub_region.leylines.liyue.chenyu_vale", "Chenyu Vale");
        builder.add("sub_region.leylines.liyue.chenyu_vale.chenyu_vale_southern_mountain", "Chenyu Vale: Southern Mountain");
        builder.add("sub_region.leylines.liyue.chenyu_vale.chenyu_vale_southern_mountain.adeptuss_repose", "Adeptus's Repose");
        builder.add("sub_region.leylines.liyue.chenyu_vale.chenyu_vale_southern_mountain.chizhang_wall", "Chizhang Wall");
        builder.add("sub_region.leylines.liyue.chenyu_vale.chenyu_vale_southern_mountain.lingshu_courtyard", "Lingshu Courtyard");
        builder.add("sub_region.leylines.liyue.chenyu_vale.chenyu_vale_southern_mountain.mt_xuanlian", "Mt. Xuanlian");
        builder.add("sub_region.leylines.liyue.chenyu_vale.chenyu_vale_southern_mountain.teatree_slope", "Teatree Slope");
        builder.add("sub_region.leylines.liyue.chenyu_vale.chenyu_vale_southern_mountain.yaodie_valley", "Yaodie Valley");

        builder.add("sub_region.leylines.liyue.chenyu_vale.chenyu_vale_upper_vale", "Chenyu Vale: Upper Vale");
        builder.add("sub_region.leylines.liyue.chenyu_vale.chenyu_vale_upper_vale.chenlong_cleft", "Chenlong Cleft");
        builder.add("sub_region.leylines.liyue.chenyu_vale.chenyu_vale_upper_vale.jademouth", "Jademouth");
        builder.add("sub_region.leylines.liyue.chenyu_vale.chenyu_vale_upper_vale.mt_lingmeng", "Mt. Lingmeng");
        builder.add("sub_region.leylines.liyue.chenyu_vale.chenyu_vale_upper_vale.mt_mingyuan", "Mt. Mingyuan");
        builder.add("sub_region.leylines.liyue.chenyu_vale.chenyu_vale_upper_vale.qiaoying_village", "Qiaoying Village");
        builder.add("sub_region.leylines.liyue.chenyu_vale.chenyu_vale_upper_vale.yilong_wharf", "Yilong Wharf");

        builder.add("sub_region.leylines.liyue.chenyu_vale.mt_laixin", "Mt. Laixin");
        builder.add("sub_region.leylines.liyue.chenyu_vale.mt_laixin.carps_rest", "Carp's Rest");
        builder.add("sub_region.leylines.liyue.chenyu_vale.mt_laixin.chiwang_terrace", "Chiwang Terrace");

        //Sub Region - Inazuma
        builder.add("sub_region.leylines.inazuma.kannazuka", "Kannazuka");
        builder.add("sub_region.leylines.inazuma.kannazuka.kujou_encampment", "Kujou Encampment");
        builder.add("sub_region.leylines.inazuma.kannazuka.tatarasuna", "Tatarasuna");

        builder.add("sub_region.leylines.inazuma.narukami_island", "Narukami Island");
        builder.add("sub_region.leylines.inazuma.narukami_island.amakane_island", "Amakane Island");
        builder.add("sub_region.leylines.inazuma.narukami_island.araumi", "Araumi");
        builder.add("sub_region.leylines.inazuma.narukami_island.byakko_plain", "Byakko Plain");
        builder.add("sub_region.leylines.inazuma.narukami_island.chinju_forest", "Chinju Forest");
        builder.add("sub_region.leylines.inazuma.narukami_island.grand_narukami_shrine", "Grand Narukami Shrine");
        builder.add("sub_region.leylines.inazuma.narukami_island.inazuma_city", "Inazuma City");
        builder.add("sub_region.leylines.inazuma.narukami_island.jinren_island", "Jinren Island");
        builder.add("sub_region.leylines.inazuma.narukami_island.kamisato_estate", "Kamisato Estate");
        builder.add("sub_region.leylines.inazuma.narukami_island.konda_village", "Konda Village");
        builder.add("sub_region.leylines.inazuma.narukami_island.mt_yougou", "Mt. Yougou");
        builder.add("sub_region.leylines.inazuma.narukami_island.ritou", "Ritou");

        builder.add("sub_region.leylines.inazuma.yashiori_island", "Yashiori Island");
        builder.add("sub_region.leylines.inazuma.yashiori_island.fort_fujitou", "Fort Fujitou");
        builder.add("sub_region.leylines.inazuma.yashiori_island.fort_mumei", "Fort Mumei");
        builder.add("sub_region.leylines.inazuma.yashiori_island.higi_village", "Higi Village");
        builder.add("sub_region.leylines.inazuma.yashiori_island.jakotsu_mine", "Jakotsu Mine");
        builder.add("sub_region.leylines.inazuma.yashiori_island.musoujin_gorge", "Musoujin Gorge");
        builder.add("sub_region.leylines.inazuma.yashiori_island.nazuchi_beach", "Nazuchi Beach");
        builder.add("sub_region.leylines.inazuma.yashiori_island.serpents_head", "Serpent's Head");

        builder.add("sub_region.leylines.inazuma.seirai_island", "Seirai Island");
        builder.add("sub_region.leylines.inazuma.seirai_island.seiraimaru", "\"Seiraimaru\"");
        builder.add("sub_region.leylines.inazuma.seirai_island.amakumo_peak", "Amakumo Peak");
        builder.add("sub_region.leylines.inazuma.seirai_island.asase_shrine", "Asase Shrine");
        builder.add("sub_region.leylines.inazuma.seirai_island.fort_hiraumi", "Fort Hiraumi");
        builder.add("sub_region.leylines.inazuma.seirai_island.koseki_village", "Koseki Village");

        builder.add("sub_region.leylines.inazuma.watatsumi_island", "Watatsumi Island");
        builder.add("sub_region.leylines.inazuma.watatsumi_island.bourou_village", "Bourou Village");
        builder.add("sub_region.leylines.inazuma.watatsumi_island.mouun_shrine", "Mouun Shrine");
        builder.add("sub_region.leylines.inazuma.watatsumi_island.sangonomiya_shrine", "Sangonomiya Shrine");
        builder.add("sub_region.leylines.inazuma.watatsumi_island.suigetsu_pool", "Suigetsu Pool");

        builder.add("sub_region.leylines.inazuma.tsurumi_island", "Tsurumi Island");
        builder.add("sub_region.leylines.inazuma.tsurumi_island.autake_plains", "Autake Plains");
        builder.add("sub_region.leylines.inazuma.tsurumi_island.chirai_shrine", "Chirai Shrine");
        builder.add("sub_region.leylines.inazuma.tsurumi_island.moshiri_ceremonial_site", "Moshiri Ceremonial Site");
        builder.add("sub_region.leylines.inazuma.tsurumi_island.mt_kanna", "Mt. Kanna");
        builder.add("sub_region.leylines.inazuma.tsurumi_island.oina_beach", "Oina Beach");
        builder.add("sub_region.leylines.inazuma.tsurumi_island.shirikoro_peak", "Shirikoro Peak");
        builder.add("sub_region.leylines.inazuma.tsurumi_island.wakukau_shoal", "Wakukau Shoal");

        builder.add("sub_region.leylines.inazuma.enkanomiya", "Enkanomiya");
        builder.add("sub_region.leylines.inazuma.enkanomiya.dainichi_mikoshi", "Dainichi Mikoshi");
        builder.add("sub_region.leylines.inazuma.enkanomiya.evernight_temple", "Evernight Temple");
        builder.add("sub_region.leylines.inazuma.enkanomiya.kunados_locus", "Kunado's Locus");
        builder.add("sub_region.leylines.inazuma.enkanomiya.the_narrows", "The Narrows");
        builder.add("sub_region.leylines.inazuma.enkanomiya.the_serpents_bowels", "The Serpent's Bowels");
        builder.add("sub_region.leylines.inazuma.enkanomiya.the_serpents_heart", "The Serpent's Heart");
        builder.add("sub_region.leylines.inazuma.enkanomiya.yachimatahikos_locus", "Yachimatahiko's Locus");
        builder.add("sub_region.leylines.inazuma.enkanomiya.yachimatahimes_locus", "Yachimatahime's Locus");

        //Sub Region - Sumeru
        builder.add("sub_region.leylines.sumeru.dharma_forest", "Dharma Forest");
        builder.add("sub_region.leylines.sumeru.dharma_forest.ardravi_valley", "Ardravi Valley");
        builder.add("sub_region.leylines.sumeru.dharma_forest.ardravi_valley.devantaka_mountain", "Devantaka Mountain");
        builder.add("sub_region.leylines.sumeru.dharma_forest.ardravi_valley.port_ormos", "Port Ormos");
        builder.add("sub_region.leylines.sumeru.dharma_forest.ardravi_valley.vimara_village", "Vimara Village");

        builder.add("sub_region.leylines.sumeru.dharma_forest.ashavan_realm", "Ashavan Realm");
        builder.add("sub_region.leylines.sumeru.dharma_forest.ashavan_realm.apam_woods", "Apam Woods");
        builder.add("sub_region.leylines.sumeru.dharma_forest.ashavan_realm.caravan_ribat", "Caravan Ribat");
        builder.add("sub_region.leylines.sumeru.dharma_forest.ashavan_realm.pardis_dhyai", "Pardis Dhyai");
        builder.add("sub_region.leylines.sumeru.dharma_forest.ashavan_realm.ruins_of_dahri", "Ruins of Dahri");
        builder.add("sub_region.leylines.sumeru.dharma_forest.ashavan_realm.yasna_monument", "Yasna Monument");

        builder.add("sub_region.leylines.sumeru.dharma_forest.avidya_forest", "Avidya Forest");
        builder.add("sub_region.leylines.sumeru.dharma_forest.avidya_forest.chinvat_ravine", "Chinvat Ravine");
        builder.add("sub_region.leylines.sumeru.dharma_forest.avidya_forest.gandha_hill", "Gandha Hill");
        builder.add("sub_region.leylines.sumeru.dharma_forest.avidya_forest.gandharva_ville", "Gandharva Ville");
        builder.add("sub_region.leylines.sumeru.dharma_forest.avidya_forest.sumeru_city", "Sumeru City");
        builder.add("sub_region.leylines.sumeru.dharma_forest.avidya_forest.yazadaha_pool", "Yazadaha Pool");

        builder.add("sub_region.leylines.sumeru.dharma_forest.lokapala_jungle", "Lokapala Jungle");
        builder.add("sub_region.leylines.sumeru.dharma_forest.lokapala_jungle.bayda_harbor", "Bayda Harbor");
        builder.add("sub_region.leylines.sumeru.dharma_forest.lokapala_jungle.chatrakam_cave", "Chatrakam Cave");
        builder.add("sub_region.leylines.sumeru.dharma_forest.lokapala_jungle.mawtiyima_forest", "Mawtiyima Forest");
        builder.add("sub_region.leylines.sumeru.dharma_forest.lokapala_jungle.the_palace_of_alcazarzaray", "The Palace of Alcazarzaray");

        builder.add("sub_region.leylines.sumeru.dharma_forest.lost_nursery", "Lost Nursery");
        builder.add("sub_region.leylines.sumeru.dharma_forest.lost_nursery.old_vanarana", "Old Vanarana");

        builder.add("sub_region.leylines.sumeru.dharma_forest.vanarana", "Vanarana");
        builder.add("sub_region.leylines.sumeru.dharma_forest.vanarana.vanarana", "Vanarana");

        builder.add("sub_region.leylines.sumeru.dharma_forest.vissudha_field", "Vissudha Field");
        builder.add("sub_region.leylines.sumeru.dharma_forest.vissudha_field.fane_of_ashvattha", "Fane of Ashvattha");

        builder.add("sub_region.leylines.sumeru.great_red_sand", "Great Red Sand");
        builder.add("sub_region.leylines.sumeru.great_red_sand.hypostyle_desert", "Hypostyle Desert");
        builder.add("sub_region.leylines.sumeru.great_red_sand.hypostyle_desert.khemenu_temple", "Khemenu Temple");
        builder.add("sub_region.leylines.sumeru.great_red_sand.hypostyle_desert.sobek_oasis", "Sobek Oasis");
        builder.add("sub_region.leylines.sumeru.great_red_sand.hypostyle_desert.the_dune_of_carouses", "The Dune of Carouses");
        builder.add("sub_region.leylines.sumeru.great_red_sand.hypostyle_desert.the_dune_of_elusion", "The Dune of Elusion");
        builder.add("sub_region.leylines.sumeru.great_red_sand.hypostyle_desert.the_dune_of_magma", "The Dune of Magma");
        builder.add("sub_region.leylines.sumeru.great_red_sand.hypostyle_desert.the_mausoleum_of_king_deshret", "The Mausoleum of King Deshret");

        builder.add("sub_region.leylines.sumeru.great_red_sand.land_of_lower_setekh", "Land of Lower Setekh");
        builder.add("sub_region.leylines.sumeru.great_red_sand.land_of_lower_setekh.aaru_village", "Aaru Village");
        builder.add("sub_region.leylines.sumeru.great_red_sand.land_of_lower_setekh.abdju_pit", "Abdju Pit");
        builder.add("sub_region.leylines.sumeru.great_red_sand.land_of_lower_setekh.dar_al_shifa", "Dar al-Shifa");
        builder.add("sub_region.leylines.sumeru.great_red_sand.land_of_lower_setekh.khaj_nisut", "Khaj-Nisut");

        builder.add("sub_region.leylines.sumeru.great_red_sand.land_of_upper_setekh", "Land of Upper Setekh");
        builder.add("sub_region.leylines.sumeru.great_red_sand.land_of_upper_setekh.valley_of_dahri", "Valley of Dahri");

        builder.add("sub_region.leylines.sumeru.great_red_sand.desert_of_hadramaveth", "Desert of Hadramaveth");
        builder.add("sub_region.leylines.sumeru.great_red_sand.desert_of_hadramaveth.debris_of_panjvahe", "Debris of Panjvahe");
        builder.add("sub_region.leylines.sumeru.great_red_sand.desert_of_hadramaveth.dunes_of_steel", "Dunes of Steel");
        builder.add("sub_region.leylines.sumeru.great_red_sand.desert_of_hadramaveth.mt_damavand", "Mt. Damavand");
        builder.add("sub_region.leylines.sumeru.great_red_sand.desert_of_hadramaveth.passage_of_ghouls", "Passage of Ghouls");
        builder.add("sub_region.leylines.sumeru.great_red_sand.desert_of_hadramaveth.qusayr_al_inkhida", "Qusayr Al-Inkhida'");
        builder.add("sub_region.leylines.sumeru.great_red_sand.desert_of_hadramaveth.safhe_shatranj", "Safhe Shatranj");
        builder.add("sub_region.leylines.sumeru.great_red_sand.desert_of_hadramaveth.tanit_camps", "Tanit Camps");
        builder.add("sub_region.leylines.sumeru.great_red_sand.desert_of_hadramaveth.the_sands_of_al_azif", "The Sands of Al-Azif");
        builder.add("sub_region.leylines.sumeru.great_red_sand.desert_of_hadramaveth.the_sands_of_three_canals", "The Sands of Three Canals");
        builder.add("sub_region.leylines.sumeru.great_red_sand.desert_of_hadramaveth.wadi_al_majuj", "Wadi Al-Majuj");
        builder.add("sub_region.leylines.sumeru.great_red_sand.desert_of_hadramaveth.wounded_shin_valley", "Wounded Shin Valley");

        builder.add("sub_region.leylines.sumeru.girdle_of_the_sands", "Girdle of the Sands");
        builder.add("sub_region.leylines.sumeru.girdle_of_the_sands.gavireh_lajavard", "Gavireh Lajavard");
        builder.add("sub_region.leylines.sumeru.girdle_of_the_sands.gavireh_lajavard.gate_of_zulqarnain", "Gate of Zulqarnain");
        builder.add("sub_region.leylines.sumeru.girdle_of_the_sands.gavireh_lajavard.temir_mountains", "Temir Mountains");
        builder.add("sub_region.leylines.sumeru.girdle_of_the_sands.gavireh_lajavard.tunigi_hollow", "Tunigi Hollow");

        builder.add("sub_region.leylines.sumeru.girdle_of_the_sands.realm_of_farakhkert", "Realm of Farakhkert");
        builder.add("sub_region.leylines.sumeru.girdle_of_the_sands.realm_of_farakhkert.asipattravana_swamp", "Asipattravana Swamp");
        builder.add("sub_region.leylines.sumeru.girdle_of_the_sands.realm_of_farakhkert.hills_of_barsom", "Hills of Barsom");
        builder.add("sub_region.leylines.sumeru.girdle_of_the_sands.realm_of_farakhkert.samudra_coast", "Samudra Coast");
        builder.add("sub_region.leylines.sumeru.girdle_of_the_sands.realm_of_farakhkert.vourukasha_oasis", "Vourukasha Oasis");

        //Sub Region - Fontaine
        builder.add("sub_region.leylines.fontaine.belleau_region", "Belleau Region");
        builder.add("sub_region.leylines.fontaine.belleau_region.poisson", "Poisson");
        builder.add("sub_region.leylines.fontaine.belleau_region.romaritime_harbor", "Romaritime Harbor");
        builder.add("sub_region.leylines.fontaine.belleau_region.west_slopes_of_mont_automnequi", "West Slopes of Mont Automnequi");

        builder.add("sub_region.leylines.fontaine.beryl_region", "Beryl Region");
        builder.add("sub_region.leylines.fontaine.beryl_region.a_lonely_place", "\"A Lonely Place\"");
        builder.add("sub_region.leylines.fontaine.beryl_region.a_very_bright_place", "\"A Very Bright Place\"");
        builder.add("sub_region.leylines.fontaine.beryl_region.a_very_warm_place", "\"A Very Warm Place\"");
        builder.add("sub_region.leylines.fontaine.beryl_region.elton_trench", "Elton Trench");
        builder.add("sub_region.leylines.fontaine.beryl_region.elynas", "Elynas");
        builder.add("sub_region.leylines.fontaine.beryl_region.merusea_village", "Merusea Village");

        builder.add("sub_region.leylines.fontaine.court_of_fontaine_region", "Court of Fontaine Region");
        builder.add("sub_region.leylines.fontaine.court_of_fontaine_region.annapausis", "Annapausis");
        builder.add("sub_region.leylines.fontaine.court_of_fontaine_region.chemin_de_lespoir", "Chemin de L'Espoir");
        builder.add("sub_region.leylines.fontaine.court_of_fontaine_region.court_of_fontaine", "Court of Fontaine");
        builder.add("sub_region.leylines.fontaine.court_of_fontaine_region.fountain_of_lucine", "Fountain of Lucine");
        builder.add("sub_region.leylines.fontaine.court_of_fontaine_region.institute_of_natural_philosophy", "Institute of Natural Philosophy");
        builder.add("sub_region.leylines.fontaine.court_of_fontaine_region.marcotte_station", "Marcotte Station");
        builder.add("sub_region.leylines.fontaine.court_of_fontaine_region.opera_epiclese", "Opera Epiclese");
        builder.add("sub_region.leylines.fontaine.court_of_fontaine_region.salacia_plain", "Salacia Plain");
        builder.add("sub_region.leylines.fontaine.court_of_fontaine_region.thalatta_submarine_canyon", "Thalatta Submarine Canyon");

        builder.add("sub_region.leylines.fontaine.fontaine_research_institute_of_kinetic_energy_engineering_region", "Fontaine Research Institute of Kinetic Energy Engineering Region");
        builder.add("sub_region.leylines.fontaine.fontaine_research_institute_of_kinetic_energy_engineering_region.central_laboratory_ruins", "Central Laboratory Ruins");
        builder.add("sub_region.leylines.fontaine.fontaine_research_institute_of_kinetic_energy_engineering_region.new_fontaine_research_institute", "New Fontaine Research Institute");

        builder.add("sub_region.leylines.fontaine.liffey_region", "Liffey Region");
        builder.add("sub_region.leylines.fontaine.liffey_region.fortress_of_meropide", "Fortress of Meropide");
        builder.add("sub_region.leylines.fontaine.liffey_region.mont_esus_east", "Mont Esus East");

        builder.add("sub_region.leylines.fontaine.erinnyes_forest", "Erinnyes Forest");
        builder.add("sub_region.leylines.fontaine.erinnyes_forest.foggy_forest_path", "Foggy Forest Path");
        builder.add("sub_region.leylines.fontaine.erinnyes_forest.loch_urania", "Loch Urania");
        builder.add("sub_region.leylines.fontaine.erinnyes_forest.lumidouce_harbor", "Lumidouce Harbor");
        builder.add("sub_region.leylines.fontaine.erinnyes_forest.weeping_willow_of_the_lake", "Weeping Willow of the Lake");

        builder.add("sub_region.leylines.fontaine.morte_region", "Morte Region");
        builder.add("sub_region.leylines.fontaine.morte_region.east_slopes_of_mont_automnequi", "East Slopes of Mont Automnequi");
        builder.add("sub_region.leylines.fontaine.morte_region.fort_charybdis_ruins", "Fort Charybdis Ruins");
        builder.add("sub_region.leylines.fontaine.morte_region.tower_of_ipsissimus", "Tower of Ipsissimus");

        builder.add("sub_region.leylines.fontaine.nostoi_region", "Nostoi Region");
        builder.add("sub_region.leylines.fontaine.nostoi_region.faded_castle", "Faded Castle");
        builder.add("sub_region.leylines.fontaine.nostoi_region.petrichor", "Petrichor");

        builder.add("sub_region.leylines.fontaine.sea_of_bygone_eras", "Sea of Bygone Eras");
        builder.add("sub_region.leylines.fontaine.sea_of_bygone_eras.alta_semita", "Alta Semita");
        builder.add("sub_region.leylines.fontaine.sea_of_bygone_eras.caesareum_palace", "Caesareum Palace");
        builder.add("sub_region.leylines.fontaine.sea_of_bygone_eras.clivus_capitolinus", "Clivus Capitolinus");
        builder.add("sub_region.leylines.fontaine.sea_of_bygone_eras.collegium_phonascorum", "Collegium Phonascorum");
        builder.add("sub_region.leylines.fontaine.sea_of_bygone_eras.hortus_euergetis", "Hortus Euergetis");
        builder.add("sub_region.leylines.fontaine.sea_of_bygone_eras.initium_iani", "Initium Iani");
        builder.add("sub_region.leylines.fontaine.sea_of_bygone_eras.portus_anticus", "Portus Anticus");

        //Sub Region - Natlan
        builder.add("sub_region.leylines.natlan.basin_of_unnumbered_flames", "Basin of Unnumbered Flames");
        builder.add("sub_region.leylines.natlan.basin_of_unnumbered_flames.huitztli_hill", "Huitztli Hill");
        builder.add("sub_region.leylines.natlan.basin_of_unnumbered_flames.stadium_of_the_sacred_flame", "Stadium of the Sacred Flame");

        builder.add("sub_region.leylines.natlan.coatepec_mountain", "Coatepec Mountain");
        builder.add("sub_region.leylines.natlan.coatepec_mountain.scions_of_the_canopy", "\"Scions of the Canopy\"");
        builder.add("sub_region.leylines.natlan.coatepec_mountain.ancestral_temple", "Ancestral Temple");
        builder.add("sub_region.leylines.natlan.coatepec_mountain.firethiefs_secret_isle", "Firethief's Secret Isle");
        builder.add("sub_region.leylines.natlan.coatepec_mountain.teticpac_peak", "Teticpac Peak");

        builder.add("sub_region.leylines.natlan.tequemecan_valley", "Tequemecan Valley");
        builder.add("sub_region.leylines.natlan.tequemecan_valley.children_of_echoes", "\"Children of Echoes\"");
        builder.add("sub_region.leylines.natlan.tequemecan_valley.sulfurous_veins", "Sulfurous Veins");
        builder.add("sub_region.leylines.natlan.tequemecan_valley.tepeacac_rise", "Tepeacac Rise");

        builder.add("sub_region.leylines.natlan.toyac_springs", "Toyac Springs");
        builder.add("sub_region.leylines.natlan.toyac_springs.people_of_the_springs", "\"People of the Springs\"");
        builder.add("sub_region.leylines.natlan.toyac_springs.ameyalco_waters", "Ameyalco Waters");

        builder.add("sub_region.leylines.natlan.ochkanatlan", "Ochkanatlan");
        builder.add("sub_region.leylines.natlan.ochkanatlan.legendary_tonatiuh", "Legendary Tonatiuh");

        builder.add("sub_region.leylines.natlan.quahuacan_cliff", "Quahuacan Cliff");
        builder.add("sub_region.leylines.natlan.quahuacan_cliff.flower_feather_clan", "\"Flower-Feather Clan\"");
        builder.add("sub_region.leylines.natlan.quahuacan_cliff.malinalco_grotto", "Malinalco Grotto");

        builder.add("sub_region.leylines.natlan.tezcatepetonco_range", "Tezcatepetonco Range");
        builder.add("sub_region.leylines.natlan.tezcatepetonco_range.masters_of_the_night_wind", "\"Masters of the Night-Wind\"");
        builder.add("sub_region.leylines.natlan.tezcatepetonco_range.tecoloapan_bay", "Tecoloapan Bay");

        builder.add("sub_region.leylines.natlan.atocpan", "Atocpan");
        builder.add("sub_region.leylines.natlan.atocpan.collective_of_plenty", "\"Collective of Plenty\"");
        builder.add("sub_region.leylines.natlan.atocpan.ancient_mountain_path", "Ancient Mountain Path");
        builder.add("sub_region.leylines.natlan.atocpan.fallingstart_fields", "Fallingstar Fields");
        builder.add("sub_region.leylines.natlan.atocpan.remnants_of_tetenanco", "Remnants of Tetenanco");
        builder.add("sub_region.leylines.natlan.atocpan.skyfire_circlet", "Skyfire Circlet");

        builder.add("sub_region.leylines.natlan.ancient_sacred_mountain", "Ancient Sacred Mountain");
        builder.add("sub_region.leylines.natlan.ancient_sacred_mountain.chamber_of_deliberation", "Chamber of Deliberation");
        builder.add("sub_region.leylines.natlan.ancient_sacred_mountain.esoteric_arrays", "Esoteric Arrays");
        builder.add("sub_region.leylines.natlan.ancient_sacred_mountain.flame_melding_ritual_grounds", "Flame-Melding Ritual Grounds");
        builder.add("sub_region.leylines.natlan.ancient_sacred_mountain.heart_of_force_inversion", "Heart of Force Inversion");
        builder.add("sub_region.leylines.natlan.ancient_sacred_mountain.pseudostar_pedestal", "Pseudostar Pedestal");
        builder.add("sub_region.leylines.natlan.ancient_sacred_mountain.ruined_armament_workshop", "Ruined Armament Workshop");
        builder.add("sub_region.leylines.natlan.ancient_sacred_mountain.sea_of_shifting_sentience", "Sea of Shifting Sentience");
        builder.add("sub_region.leylines.natlan.ancient_sacred_mountain.summoning_hall", "Summoning Hall");

        builder.add("sub_region.leylines.natlan.easybreeze_holiday_resort", "Easybreeze Holiday Resort");
        builder.add("sub_region.leylines.natlan.easybreeze_holiday_resort.brewblossom_stores", "Brewblossom Stores");
        builder.add("sub_region.leylines.natlan.easybreeze_holiday_resort.castle_joquiratto", "Castle Joquiratto");
        builder.add("sub_region.leylines.natlan.easybreeze_holiday_resort.colorfall_cave", "Colorfall Cave");
        builder.add("sub_region.leylines.natlan.easybreeze_holiday_resort.colorfall_cliffs", "Colorfall Cliffs");
        builder.add("sub_region.leylines.natlan.easybreeze_holiday_resort.concealed_land_of_enigmas", "Concealed Land of Enigmas");
        builder.add("sub_region.leylines.natlan.easybreeze_holiday_resort.easybreeze_market", "Easybreeze Market");
        builder.add("sub_region.leylines.natlan.easybreeze_holiday_resort.guiztli_path", "Guiztli Path");
        builder.add("sub_region.leylines.natlan.easybreeze_holiday_resort.guiztli_ridge", "Guiztli Ridge");
        builder.add("sub_region.leylines.natlan.easybreeze_holiday_resort.huha_hill", "Huha Hill");
        builder.add("sub_region.leylines.natlan.easybreeze_holiday_resort.tete_isle", "Tete Isle");
        builder.add("sub_region.leylines.natlan.easybreeze_holiday_resort.villa_guiztli", "Villa Guiztli");
        builder.add("sub_region.leylines.natlan.easybreeze_holiday_resort.wavey_bay", "Wavey Bay");

        builder.add("sub_region.leylines.natlan.night_kingdom", "Night Kingdom");

        //Sub Region - Nod-Krai
        builder.add("sub_region.leylines.nod_krai.hiisi_island", "Hiisi Island");
        builder.add("sub_region.leylines.nod_krai.hiisi_island.frostmoon_enclave", "Frostmoon Enclave");
        builder.add("sub_region.leylines.nod_krai.hiisi_island.light_bathed_Platform", "Light-Bathed Platform");
        builder.add("sub_region.leylines.nod_krai.hiisi_island.silvermoon_hall", "Silvermoon Hall");

        builder.add("sub_region.leylines.nod_krai.lempo_isle", "Lempo Isle");
        builder.add("sub_region.leylines.nod_krai.lempo_isle.barrowmoss_barrens", "Barrowmoss Barrens");
        builder.add("sub_region.leylines.nod_krai.lempo_isle.blue_amber_lake", "Blue Amber Lake");
        builder.add("sub_region.leylines.nod_krai.lempo_isle.clink_clank_krumkake_craftshop", "Clink-Clank Krumkake Craftshop");
        builder.add("sub_region.leylines.nod_krai.lempo_isle.eye_of_kratti", "Eye of Kratti");
        builder.add("sub_region.leylines.nod_krai.lempo_isle.nasha_town", "Nasha Town");
        builder.add("sub_region.leylines.nod_krai.lempo_isle.nothing_passage", "Nothing Passage");
        builder.add("sub_region.leylines.nod_krai.lempo_isle.starsand_shoal", "Starsand Shoal");

        builder.add("sub_region.leylines.nod_krai.paha_isle", "Paha Isle");
        builder.add("sub_region.leylines.nod_krai.paha_isle.final_night_cemetery", "Final Night Cemetery");
        builder.add("sub_region.leylines.nod_krai.paha_isle.kuuvahki_experimental_design_bureau", "Kuuvahki Experimental Design Bureau");

        builder.add("sub_region.leylines.nod_krai.ashveil_peak", "Ashveil Peak");
        builder.add("sub_region.leylines.nod_krai.ashveil_peak.cliffwatch_camp", "Cliffwatch Camp");
        builder.add("sub_region.leylines.nod_krai.ashveil_peak.kipumaki_cliff", "Kipumaki Cliff");
        builder.add("sub_region.leylines.nod_krai.ashveil_peak.special_territory_research_institute", "Special Territory Research Institute");

        builder.add("sub_region.leylines.nod_krai.voidsea_outlook", "Voidsea Outlook");
        builder.add("sub_region.leylines.nod_krai.voidsea_outlook.dreadshade_mire", "Dreadshade Mire");
        builder.add("sub_region.leylines.nod_krai.voidsea_outlook.piramida", "Piramida");

        builder.add("sub_region.leylines.nod_krai.wavechaser_plain", "Wavechaser Plain");
        builder.add("sub_region.leylines.nod_krai.wavechaser_plain.amsvartnir", "Amsvartnir");
        builder.add("sub_region.leylines.nod_krai.wavechaser_plain.favonius_keep", "Favonius Keep");
        builder.add("sub_region.leylines.nod_krai.wavechaser_plain.pillar_of_embla", "Pillar of Embla");
        builder.add("sub_region.leylines.nod_krai.wavechaser_plain.wing_of_keres", "Wing of Keres");

        builder.add("sub_region.leylines.nod_krai.dunanna_pit", "Dunanna Pit");
        builder.add("sub_region.leylines.nod_krai.dunanna_pit.dunanna_forward_station", "Dunanna Forward Station");
        builder.add("sub_region.leylines.nod_krai.dunanna_pit.misty_shoal", "Misty Shoal");

        builder.add("sub_region.leylines.nod_krai.frost_moon", "Frost Moon");
        builder.add("sub_region.leylines.nod_krai.frost_moon.dark_side_of_the_moon", "Dark Side of the Moon");
        builder.add("sub_region.leylines.nod_krai.frost_moon.dark_side_of_the_moon.dark_side_of_the_moon", "Dark Side of the Moon");

        builder.add("sub_region.leylines.nod_krai.frost_moon.lunar_highlands", "Lunar Highlands");
        builder.add("sub_region.leylines.nod_krai.frost_moon.lunar_highlands.archaeolune_storm_research_center", "Archaeolune Storm Research Center");
        builder.add("sub_region.leylines.nod_krai.frost_moon.lunar_highlands.bubble_pool", "Bubble Pool");
        builder.add("sub_region.leylines.nod_krai.frost_moon.lunar_highlands.golden_hall", "Golden Hall");
        builder.add("sub_region.leylines.nod_krai.frost_moon.lunar_highlands.nuur_stone_circle", "Nuur Stone Circle");
        builder.add("sub_region.leylines.nod_krai.frost_moon.lunar_highlands.the_eye_of_ibni_belum", "The Eye of Ibni-Belum");
        builder.add("sub_region.leylines.nod_krai.frost_moon.lunar_highlands.travelers_crater", "Traveler's Crater");
        builder.add("sub_region.leylines.nod_krai.frost_moon.lunar_highlands.ungiens_circle", "Ungien's Circle");

        builder.add("sub_region.leylines.nod_krai.frost_moon.moontide_sea", "Moontide Sea");
        builder.add("sub_region.leylines.nod_krai.frost_moon.moontide_sea.curtain_form_blackbody_containment_lab", "Curtain-Form Blackbody Containment Lab");
        builder.add("sub_region.leylines.nod_krai.frost_moon.moontide_sea.moontide_sea", "Moontide Sea");

        //Sub Region - Snezhnaya
        builder.add("sub_region.leylines.snezhnaya.everfrozen_earth", "Everfrozen Earth");
        builder.add("sub_region.leylines.snezhnaya.everfrozen_earth.central_station", "Central Station");
        builder.add("sub_region.leylines.snezhnaya.everfrozen_earth.druzhna_hq", "Druzhna HQ");
        builder.add("sub_region.leylines.snezhnaya.everfrozen_earth.glupov", "Glupov");
        builder.add("sub_region.leylines.snezhnaya.everfrozen_earth.morepesok", "Morepesok");
        builder.add("sub_region.leylines.snezhnaya.everfrozen_earth.sanctuary_of_grief", "Sanctuary of Grief");
        builder.add("sub_region.leylines.snezhnaya.everfrozen_earth.snezhnograd", "Snezhnograd");
        builder.add("sub_region.leylines.snezhnaya.everfrozen_earth.svetloledovka", "Svetloledovka");
        builder.add("sub_region.leylines.snezhnaya.everfrozen_earth.the_korolevskiy_theater", "The Korolevskiy Theater");
        builder.add("sub_region.leylines.snezhnaya.everfrozen_earth.zapolyarny_palace", "Zapolyarny Palace");

        builder.add("sub_region.leylines.snezhnaya.fellfrost_peak", "Fellfrost Peak");
        builder.add("sub_region.leylines.snezhnaya.fellfrost_peak.house_of_hesperides", "House of Hesperides");
        builder.add("sub_region.leylines.snezhnaya.fellfrost_peak.jack_frost_village", "Jack Frost Village");
        builder.add("sub_region.leylines.snezhnaya.fellfrost_peak.tidesong_cavern", "Tidesong Cavern");

        builder.add("sub_region.leylines.snezhnaya.flamefeather_valley", "Flamefeather Valley");
        builder.add("sub_region.leylines.snezhnaya.flamefeather_valley.okurov", "Okurov");
        builder.add("sub_region.leylines.snezhnaya.flamefeather_valley.teeming_mire", "Teeming Mire");

        builder.add("sub_region.leylines.snezhnaya.volkodlak_tundra", "Volkodlak Tundra");
        builder.add("sub_region.leylines.snezhnaya.volkodlak_tundra.huntsmans_cabin", "Huntsman's Cabin");
        builder.add("sub_region.leylines.snezhnaya.volkodlak_tundra.rankova_zorya", "Rankova Zorya");
        builder.add("sub_region.leylines.snezhnaya.volkodlak_tundra.sretomorozsk", "Sretomorozsk");

        builder.add("sub_region.leylines.snezhnaya.white_birch_snowgrave", "White Birch Snowgrave");
        builder.add("sub_region.leylines.snezhnaya.white_birch_snowgrave.pale_crown_palace", "Pale Crown Palace");
        builder.add("sub_region.leylines.snezhnaya.white_birch_snowgrave.pilgrimage_to_the_sacred_gorge", "Pilgrimage to the Sacred Gorge");

        //Sub Region - Temple of Space
        builder.add("sub_region.leylines.temple_of_space", "Temple of Space");
        builder.add("sub_region.leylines.temple_of_space.apathic_interval", "Apathic Interval");
        builder.add("sub_region.leylines.temple_of_space.cage_of_suchness", "Cage of Suchness");
        builder.add("sub_region.leylines.temple_of_space.desert_pavilion", "Desert Pavilion");
        builder.add("sub_region.leylines.temple_of_space.luyang_academy", "Luyang Academy");
        builder.add("sub_region.leylines.temple_of_space.mahavaipulya_chamber", "Mahavaipulya Chamber");
        builder.add("sub_region.leylines.temple_of_space.path_of_the_forgotten_world", "Path of the Forgotten World");
        builder.add("sub_region.leylines.temple_of_space.pillar_hall_central_zone", "Pillar Hall Central Zone");

        //Model Type
        builder.add("model_type.leylines.tall_male", "Tall Male");
        builder.add("model_type.leylines.medium_male", "Medium Male");
        builder.add("model_type.leylines.tall_female", "Tall Female");
        builder.add("model_type.leylines.medium_female", "Medium Female");
        builder.add("model_type.leylines.short_female", "Short Female");

        //Weapons
        //Swords
        //5-Star Sword
        builder.add(LeyLinesItems.ABSOLUTION.getTranslationKey(), "Absolution");
        builder.add(LeyLinesItems.AQUILA_FAVONIA.getTranslationKey(), "Aquila Favonia");
        builder.add(LeyLinesItems.ATHAME_ARTIS.getTranslationKey(), "Athame Artis");
        builder.add(LeyLinesItems.AZURELIGHT.getTranslationKey(), "Azurelight");
        builder.add(LeyLinesItems.BEYOND_THE_CHRYSALIS.getTranslationKey(), "Beyond the Chrysalisx");
        builder.add(LeyLinesItems.EXAIPHANES_BLADE.getTranslationKey(), "Exaiphanes Blade");
        builder.add(LeyLinesItems.FREEDOM_SWORN.getTranslationKey(), "Freedom-Sworn");
        builder.add(LeyLinesItems.HARAN_GEPPAKU_FUTSU.getTranslationKey(), "Haran Geppaku Futsu");
        builder.add(LeyLinesItems.KEY_OF_KHAJ_NISUT.getTranslationKey(), "Key of Khaj-Nisut");
        builder.add(LeyLinesItems.LIGHT_OF_FOLIAR_INCISION.getTranslationKey(), "Light of Foliar Incision");
        builder.add(LeyLinesItems.LIGHTBEARING_MOONSHARD.getTranslationKey(), "Lightbearing Moonshard");
        builder.add(LeyLinesItems.MISTSPLITTER_REFORGED.getTranslationKey(), "Mistsplitter Reforged");
        builder.add(LeyLinesItems.PEAK_PATROL_SONG.getTranslationKey(), "Peak Patrol Song");
        builder.add(LeyLinesItems.PRIMORDIAL_JADE_CUTTER.getTranslationKey(), "Primordial Jade Cutter");
        builder.add(LeyLinesItems.SKYWARD_BLADE.getTranslationKey(), "Skyward Blade");
        builder.add(LeyLinesItems.SPLENDOR_OF_TRANQUIL_WATERS.getTranslationKey(), "Splendor of Tranquil Waters");
        builder.add(LeyLinesItems.SUMMIT_SHAPER.getTranslationKey(), "Summit Shaper");
        builder.add(LeyLinesItems.URAKU_MISUGIRI.getTranslationKey(), "Uraku Misugiri");
        builder.add(LeyLinesItems.WHITELAKE_FROSTFEATHER.getTranslationKey(), "Whitelake Frostfeather");

        //4-Star Sword
        builder.add(LeyLinesItems.AMENOMA_KAGEUCHI.getTranslationKey(), "Amenoma Kageuchi");
        builder.add(LeyLinesItems.BLACKCLIFF_LONGSWORD.getTranslationKey(), "Blackcliff Longsword");
        builder.add(LeyLinesItems.CALAMITY_OF_ESHU.getTranslationKey(), "Calamity of Eshu");
        builder.add(LeyLinesItems.CINNABAR_SPINDLE.getTranslationKey(), "Cinnabar Spindle");
        builder.add(LeyLinesItems.EMBERWELL.getTranslationKey(), "Emberwell");
        builder.add(LeyLinesItems.FAVONIUS_SWORD.getTranslationKey(), "Favonius Sword");
        builder.add(LeyLinesItems.FESTERING_DESIRE.getTranslationKey(), "Festering Desire");
        builder.add(LeyLinesItems.FINALE_OF_THE_DEEP.getTranslationKey(), "Finale of the Deep");
        builder.add(LeyLinesItems.FLEUVE_CENDRE_FERRYMAN.getTranslationKey(), "Fleuve Cendre Ferryman");
        builder.add(LeyLinesItems.FLUTE_OF_EZPITZAL.getTranslationKey(), "Flute of Ezpitzal");
        builder.add(LeyLinesItems.HERETICS_MOLTEN_BLADE.getTranslationKey(), "Heretic's Molten Blade");
        builder.add(LeyLinesItems.IRON_STING.getTranslationKey(), "Iron Sting");
        builder.add(LeyLinesItems.KAGOTSURUBE_ISSHIN.getTranslationKey(), "Kagotsurube Isshin");
        builder.add(LeyLinesItems.LIONS_ROAR.getTranslationKey(), "Lion's Roar");
        builder.add(LeyLinesItems.MOONWEAVERS_DAWN.getTranslationKey(), "Moonweaver's Dawn");
        builder.add(LeyLinesItems.NEW_BOUGH.getTranslationKey(), "New Bough");
        builder.add(LeyLinesItems.PROTOTYPE_RANCOUR.getTranslationKey(), "Prototype Rancour");
        builder.add(LeyLinesItems.ROYAL_LONGSWORD.getTranslationKey(), "Royal Longsword");
        builder.add(LeyLinesItems.SACRIFICIAL_SWORD.getTranslationKey(), "Sacrificial Sword");
        builder.add(LeyLinesItems.SAPWOOD_BLADE.getTranslationKey(), "Sapwood Blade");
        builder.add(LeyLinesItems.SERENITYS_CALL.getTranslationKey(), "Serenity's Call");
        builder.add(LeyLinesItems.SILVER_LIGHT.getTranslationKey(), "Silver Light");
        builder.add(LeyLinesItems.STURDY_BONE.getTranslationKey(), "Sturdy Bone");
        builder.add(LeyLinesItems.SWORD_OF_DESCENSION.getTranslationKey(), "Sword of Descension");
        builder.add(LeyLinesItems.SWORD_OF_NARZISSENKREUZ.getTranslationKey(), "Sword of Narzissenkreuz");
        builder.add(LeyLinesItems.THE_ALLEY_FLASH.getTranslationKey(), "The Alley Flash");
        builder.add(LeyLinesItems.THE_BLACK_SWORD.getTranslationKey(), "The Black Sword");
        builder.add(LeyLinesItems.THE_DOCKHANDS_ASSISTANT.getTranslationKey(), "The Dockhand's Assistant");
        builder.add(LeyLinesItems.THE_FLUTE.getTranslationKey(), "The Flute");
        builder.add(LeyLinesItems.TOUKABOU_SHIGURE.getTranslationKey(), "Toukabou Shigure");
        builder.add(LeyLinesItems.WOLF_FANG.getTranslationKey(), "Wolf-Fang");
        builder.add(LeyLinesItems.XIPHOS_MOONLIGHT.getTranslationKey(), "Xiphos' Moonlight");

        //3-Star Sword
        builder.add(LeyLinesItems.COOL_STEEL.getTranslationKey(), "Cool Steel");
        builder.add(LeyLinesItems.DARK_IRON_SWORD.getTranslationKey(), "Dark Iron Sword");
        builder.add(LeyLinesItems.FILLET_BLADE.getTranslationKey(), "Fillet Blade");
        builder.add(LeyLinesItems.HARBINGER_OF_DAWN.getTranslationKey(), "Harbinger of Dawn");
        builder.add(LeyLinesItems.SKYRIDER_SWORD.getTranslationKey(), "Skyrider Sword");
        builder.add(LeyLinesItems.TRAVELERS_HANDY_SWORD.getTranslationKey(), "Traveler's Handy Sword");

        //2-Star Sword
        builder.add(LeyLinesItems.SILVER_SWORD.getTranslationKey(), "Silver Sword");

        //1-Star Sword
        builder.add(LeyLinesItems.DULL_BLADE.getTranslationKey(), "Dull Blade");


        //Claymores
        //5-Star Claymore
        builder.add(LeyLinesItems.A_TEASPOON_OF_TRANSCENDENCE.getTranslationKey(), "A Teaspoon of Transcendence");
        builder.add(LeyLinesItems.A_THOUSAND_BLAZING_SUNS.getTranslationKey(), "A Thousand Blazing Suns");
        builder.add(LeyLinesItems.BEACON_OF_THE_REED_SEA.getTranslationKey(), "Beacon of the Reed Sea");
        builder.add(LeyLinesItems.FANG_OF_THE_MOUNTAIN_KING.getTranslationKey(), "Fang of the Mountain King");
        builder.add(LeyLinesItems.GEST_OF_THE_MIGHTY_WOLF.getTranslationKey(), "Gest of the Mighty Wolf");
        builder.add(LeyLinesItems.REDHORN_STONETHRESHER.getTranslationKey(), "Redhorn Stonethresher");
        builder.add(LeyLinesItems.SKYWARD_PRIDE.getTranslationKey(), "Skyward Pride");
        builder.add(LeyLinesItems.SONG_OF_BROKEN_PINES.getTranslationKey(), "Song of Broken Pines");
        builder.add(LeyLinesItems.THE_UNFORGED.getTranslationKey(), "The Unforged");
        builder.add(LeyLinesItems.VERDICT.getTranslationKey(), "Verdict");
        builder.add(LeyLinesItems.WOLFS_GRAVESTONE.getTranslationKey(), "Wolf's Gravestone");

        //4-Star Claymore
        builder.add(LeyLinesItems.ULTIMATE_OVERLORDS_MEGA_MAGIC_SWORD.getTranslationKey(), "\"Ultimate Overlord's Mega Magic Sword\"");
        builder.add(LeyLinesItems.AKUOUMARU.getTranslationKey(), "Akuoumaru");
        builder.add(LeyLinesItems.BLACKCLIFF_SLASHER.getTranslationKey(), "Blackcliff Slasher");
        builder.add(LeyLinesItems.BLADE_OF_ATONEMENT.getTranslationKey(), "Blade of Atonement");
        builder.add(LeyLinesItems.EARTH_SHAKER.getTranslationKey(), "Earth Shaker");
        builder.add(LeyLinesItems.FAVONIUS_GREATSWORD.getTranslationKey(), "Favonius Greatsword");
        builder.add(LeyLinesItems.FLAME_FORGED_INSIGHT.getTranslationKey(), "Flame-Forged Insight");
        builder.add(LeyLinesItems.FOREST_REGALIA.getTranslationKey(), "Forest Regalia");
        builder.add(LeyLinesItems.FORGED_BY_THE_GOLDEN_MELODY.getTranslationKey(), "Forged by the Golden Melody");
        builder.add(LeyLinesItems.FRUITFUL_HOOK.getTranslationKey(), "Fruitful Hook");
        builder.add(LeyLinesItems.KATSURAGIKIRI_NAGAMASA.getTranslationKey(), "Katsuragikiri Nagamasa");
        builder.add(LeyLinesItems.LITHIC_BLADE.getTranslationKey(), "Lithic Blade");
        builder.add(LeyLinesItems.LUXURIOUS_SEA_lORD.getTranslationKey(), "Luxurious Sea-Lord");
        builder.add(LeyLinesItems.MAILED_FLOWER.getTranslationKey(), "Mailed Flower");
        builder.add(LeyLinesItems.MAKHAIRA_AQUAMARINE.getTranslationKey(), "Makhaira Aquamarine");
        builder.add(LeyLinesItems.MASTER_KEY.getTranslationKey(), "Master Key");
        builder.add(LeyLinesItems.PORTABLE_POWER_SAW.getTranslationKey(), "Portable Power Saw");
        builder.add(LeyLinesItems.PROTOTYPE_ARCHAIC.getTranslationKey(), "Prototype Archaic");
        builder.add(LeyLinesItems.RAINSLASHER.getTranslationKey(), "Rainslasher");
        builder.add(LeyLinesItems.ROYAL_GREATSWORD.getTranslationKey(), "Royal Greatsword");
        builder.add(LeyLinesItems.SACRIFICIAL_GREATSWORD.getTranslationKey(), "Sacrificial Greatsword");
        builder.add(LeyLinesItems.SERPENT_SPINE.getTranslationKey(), "Serpent Spine");
        builder.add(LeyLinesItems.SNOW_TOMBED_STARSILVER.getTranslationKey(), "Snow-Tombed Starsilver");
        builder.add(LeyLinesItems.TALKING_STICK.getTranslationKey(), "Talking Stick");
        builder.add(LeyLinesItems.THE_BELL.getTranslationKey(), "The Bell");
        builder.add(LeyLinesItems.TIDAL_SHADOW.getTranslationKey(), "Tidal Shadow");
        builder.add(LeyLinesItems.WHITEBLIND.getTranslationKey(), "Whiteblind");

        //3-Star Claymore
        builder.add(LeyLinesItems.BLOODTAINTED_GREATSWORD.getTranslationKey(), "Bloodtainted Greatsword");
        builder.add(LeyLinesItems.DEBATE_CLUB.getTranslationKey(), "Debate Club");
        builder.add(LeyLinesItems.FERROUS_SHADOW.getTranslationKey(), "Ferrous Shadow");
        builder.add(LeyLinesItems.SKYRIDER_GREATSWORD.getTranslationKey(), "Skyrider Greatsword");
        builder.add(LeyLinesItems.WHITE_IRON_GREATSWORD.getTranslationKey(), "White Iron Greatsword");

        //2-Star Claymore
        builder.add(LeyLinesItems.OLD_MERCS_PAL.getTranslationKey(), "Old Merc's Pal");

        //1-Star Claymore
        builder.add(LeyLinesItems.WASTER_GREATSWORD.getTranslationKey(), "Waster Greatsword");


        //Polearms
        //5-Star Polearm
        builder.add(LeyLinesItems.BLOODSOAKED_RUINS.getTranslationKey(), "Bloodsoaked Ruins");
        builder.add(LeyLinesItems.CALAMITY_QUELLER.getTranslationKey(), "Calamity Queller");
        builder.add(LeyLinesItems.CRIMSON_MOONS_SEMBLANCE.getTranslationKey(), "Crimson Moon's Semblance");
        builder.add(LeyLinesItems.DISASTER_AND_REMORSE.getTranslationKey(), "Disaster and Remorse");
        builder.add(LeyLinesItems.ENGULFING_LIGHTNING.getTranslationKey(), "Engulfing Lightning");
        builder.add(LeyLinesItems.FRACTURED_HALO.getTranslationKey(), "Fractured Halo");
        builder.add(LeyLinesItems.LUMIDOUCE_ELEGY.getTranslationKey(), "Lumidouce Elegy");
        builder.add(LeyLinesItems.PRIMORDIAL_JADE_WINGED_SPEAR.getTranslationKey(), "Primordial Jade Winged-Spear");
        builder.add(LeyLinesItems.SKYWARD_SPINE.getTranslationKey(), "Skyward Spine");
        builder.add(LeyLinesItems.STAFF_OF_HOMA.getTranslationKey(), "Staff of Homa");
        builder.add(LeyLinesItems.STAFF_OF_THE_SCARLET_SANDS.getTranslationKey(), "Staff of the Scarlet Sands");
        builder.add(LeyLinesItems.SYMPHONIST_OF_SCENTS.getTranslationKey(), "Symphonist of Scents");
        builder.add(LeyLinesItems.VORTEX_VANQUISHER.getTranslationKey(), "Vortex Vanquisher");

        //4-Star Polearm
        builder.add(LeyLinesItems.THE_CATCH.getTranslationKey(), "\"The Catch\"");
        builder.add(LeyLinesItems.BALLAD_OF_THE_FJORDS.getTranslationKey(), "Ballad of the Fjords");
        builder.add(LeyLinesItems.BLACKCLIFF_POLE.getTranslationKey(), "Blackcliff Pole");
        builder.add(LeyLinesItems.CRESCENT_PIKE.getTranslationKey(), "Crescent Pike");
        builder.add(LeyLinesItems.DEATHMATCH.getTranslationKey(), "Deathmatch");
        builder.add(LeyLinesItems.DIALOGUES_OF_THE_DESERT_SAGES.getTranslationKey(), "Dialogues of the Desert Sages");
        builder.add(LeyLinesItems.DRAGONS_BANE.getTranslationKey(), "Dragon's Bane");
        builder.add(LeyLinesItems.DRAGONSPINE_SPEAR.getTranslationKey(), "Dragonspine Spear");
        builder.add(LeyLinesItems.FAVONIUS_LANCE.getTranslationKey(), "Favonius Lance");
        builder.add(LeyLinesItems.FOOTPRINT_OF_THE_RAINBOW.getTranslationKey(), "Footprint of the Rainbow");
        builder.add(LeyLinesItems.FROSTBREATH.getTranslationKey(), "Frostbreath");
        builder.add(LeyLinesItems.KITAIN_CROSS_SPEAR.getTranslationKey(), "Kitain Cross Spear");
        builder.add(LeyLinesItems.LITHIC_SPEAR.getTranslationKey(), "Lithic Spear");
        builder.add(LeyLinesItems.MISSIVE_WINDSPEAR.getTranslationKey(), "Missive Windspear");
        builder.add(LeyLinesItems.MOONPIERCER.getTranslationKey(), "Moonpiercer");
        builder.add(LeyLinesItems.MOUNTAIN_BRACING_BOLT.getTranslationKey(), "Mountain-Bracing Bolt");
        builder.add(LeyLinesItems.PROSPECTORS_DRILL.getTranslationKey(), "Prospector's Drill");
        builder.add(LeyLinesItems.PROSPECTORS_SHOVEL.getTranslationKey(), "Prospector's Shovel");
        builder.add(LeyLinesItems.PROTOTYPE_STARGLITTER.getTranslationKey(), "Prototype Starglitter");
        builder.add(LeyLinesItems.RIGHTFUL_REWARD.getTranslationKey(), "Rightful Reward");
        builder.add(LeyLinesItems.ROYAL_SPEAR.getTranslationKey(), "Royal Spear");
        builder.add(LeyLinesItems.SACRIFICERS_STAFF.getTranslationKey(), "Sacrificer's Staff");
        builder.add(LeyLinesItems.SONG_OF_THE_VIGIL.getTranslationKey(), "Song of the Vigil");
        builder.add(LeyLinesItems.TAMAYURATEI_NO_OHANASHI.getTranslationKey(), "Tamayuratei no Ohanashi");
        builder.add(LeyLinesItems.WAVEBREAKERS_FIN.getTranslationKey(), "Wavebreaker's Fin");

        //3-Star Polearm
        builder.add(LeyLinesItems.BLACK_TASSEL.getTranslationKey(), "Black Tassel");
        builder.add(LeyLinesItems.HALBERD.getTranslationKey(), "Halberd");
        builder.add(LeyLinesItems.WHITE_TASSEL.getTranslationKey(), "White Tassel");

        //2-Star Polearm
        builder.add(LeyLinesItems.IRON_POINT.getTranslationKey(), "Iron Point");

        //1-Star Polearm
        builder.add(LeyLinesItems.BEGINNERS_PROTECTOR.getTranslationKey(), "Beginner's Protector");


        //Catalysts
        //5-Star Catalyst
        builder.add(LeyLinesItems.A_THOUSAND_FLOATING_DREAMS.getTranslationKey(), "A Thousand Floating Dreams");
        builder.add(LeyLinesItems.ANGELOS_HEPTADES.getTranslationKey(), "Angelos' Heptades");
        builder.add(LeyLinesItems.CASHFLOW_SUPERVISION.getTranslationKey(), "Cashflow Supervision");
        builder.add(LeyLinesItems.CRANES_ECHOING_CALL.getTranslationKey(), "Crane's Echoing Call");
        builder.add(LeyLinesItems.EVERLASTING_MOONGLOW.getTranslationKey(), "Everlasting Moonglow");
        builder.add(LeyLinesItems.HYMN_OF_THE_MAELSTROM.getTranslationKey(), "Hymn of the Maelstrom");
        builder.add(LeyLinesItems.JADEFALLS_SPLENDOR.getTranslationKey(), "Jadefall's Splendor");
        builder.add(LeyLinesItems.KAGURAS_VERITY.getTranslationKey(), "Kagura's Verity");
        builder.add(LeyLinesItems.LOST_PRAYER_TO_THE_SACRED_WINDS.getTranslationKey(), "Lost Prayer to the Sacred Winds");
        builder.add(LeyLinesItems.MEMORY_OF_DUST.getTranslationKey(), "Memory of Dust");
        builder.add(LeyLinesItems.NIGHTWEAVERS_LOOKING_GLASS.getTranslationKey(), "Nightweaver's Looking Glass");
        builder.add(LeyLinesItems.NOCTURNES_CURTAIN_CALL.getTranslationKey(), "Nocturne's Curtain Call");
        builder.add(LeyLinesItems.RELIQUARY_OF_TRUTH.getTranslationKey(), "Reliquary of Truth");
        builder.add(LeyLinesItems.SKYWARD_ATLAS.getTranslationKey(), "Skyward Atlas");
        builder.add(LeyLinesItems.STARCALLERS_WATCH.getTranslationKey(), "Starcaller's Watch");
        builder.add(LeyLinesItems.SUNNY_MORNING_SLEEP_IN.getTranslationKey(), "Sunny Morning Sleep-In");
        builder.add(LeyLinesItems.SURFS_UP.getTranslationKey(), "Surf's Up");
        builder.add(LeyLinesItems.TOME_OF_THE_ETERNAL_FLOW.getTranslationKey(), "Tome of the Eternal Flow");
        builder.add(LeyLinesItems.TULAYTULLAHS_REMEMBRANCE.getTranslationKey(), "Tulaytullah's Remembrance");
        builder.add(LeyLinesItems.VIVID_NOTIONS.getTranslationKey(), "Vivid Notions");

        //4-Star Catalyst
        builder.add(LeyLinesItems.ASH_GRAVEN_DRINKING_HORN.getTranslationKey(), "Ash-Graven Drinking Horn");
        builder.add(LeyLinesItems.BALLAD_OF_THE_BOUNDLESS_BLUE.getTranslationKey(), "Ballad of the Boundless Blue");
        builder.add(LeyLinesItems.BLACKCLIFF_AGATE.getTranslationKey(), "Blackcliff Agate");
        builder.add(LeyLinesItems.BLACKMARROW_LANTERN.getTranslationKey(), "Blackmarrow Lantern");
        builder.add(LeyLinesItems.CLASH_OF_KINGS.getTranslationKey(), "Clash of Kings");
        builder.add(LeyLinesItems.DAWNING_FROST.getTranslationKey(), "Dawning Frost");
        builder.add(LeyLinesItems.DODOCO_TALES.getTranslationKey(), "Dodoco Tales");
        builder.add(LeyLinesItems.ECHOES_OF_THE_HEART.getTranslationKey(), "Echoes of the Heart");
        builder.add(LeyLinesItems.ETHERLIGHT_SPINDLELUTE.getTranslationKey(), "Etherlight Spindlelute");
        builder.add(LeyLinesItems.EYE_OF_PERCEPTION.getTranslationKey(), "Eye of Perception");
        builder.add(LeyLinesItems.FAVONIUS_CODEX.getTranslationKey(), "Favonius Codex");
        builder.add(LeyLinesItems.FLOWING_PURITY.getTranslationKey(), "Flowing Purity");
        builder.add(LeyLinesItems.FROSTBEARER.getTranslationKey(), "Frostbearer");
        builder.add(LeyLinesItems.FRUIT_OF_FULFILLMENT.getTranslationKey(), "Fruit of Fulfillment");
        builder.add(LeyLinesItems.HAKUSHIN_RING.getTranslationKey(), "Hakushin Ring");
        builder.add(LeyLinesItems.MAPPA_MARE.getTranslationKey(), "Mappa Mare");
        builder.add(LeyLinesItems.OATHSWORN_EYE.getTranslationKey(), "Oathsworn Eye");
        builder.add(LeyLinesItems.PROTOTYPE_AMBER.getTranslationKey(), "Prototype Amber");
        builder.add(LeyLinesItems.RING_OF_YAXCHE.getTranslationKey(), "Ring of Yaxche");
        builder.add(LeyLinesItems.ROYAL_GRIMOIRE.getTranslationKey(), "Royal Grimoire");
        builder.add(LeyLinesItems.SACRIFICIAL_FRAGMENTS.getTranslationKey(), "Sacrificial Fragments");
        builder.add(LeyLinesItems.SACRIFICIAL_JADE.getTranslationKey(), "Sacrificial Jade");
        builder.add(LeyLinesItems.SOLAR_PEARL.getTranslationKey(), "Solar Pearl");
        builder.add(LeyLinesItems.THE_WIDSITH.getTranslationKey(), "The Widsith");
        builder.add(LeyLinesItems.WANDERING_EVENSTAR.getTranslationKey(), "Wandering Evenstar");
        builder.add(LeyLinesItems.WAVERIDING_WHIRL.getTranslationKey(), "Waveriding Whirl");
        builder.add(LeyLinesItems.WINE_AND_SONG.getTranslationKey(), "Wine and Song");
        builder.add(LeyLinesItems.WINTERS_HEAVY_HEART.getTranslationKey(), "Winter's Heavy Heart");

        //3-Star Catalyst
        builder.add(LeyLinesItems.EMERALD_ORB.getTranslationKey(), "Emerald Orb");
        builder.add(LeyLinesItems.MAGIC_GUIDE.getTranslationKey(), "Magic Guide");
        builder.add(LeyLinesItems.OTHERWORLDLY_STORY.getTranslationKey(), "Otherworldly Story");
        builder.add(LeyLinesItems.THRILLING_TALES_OF_DRAGON_SLAYERS.getTranslationKey(), "Thrilling Tales of Dragon Slayers");
        builder.add(LeyLinesItems.TWIN_NEPHRITE.getTranslationKey(), "Twin Nephrite");

        //2-Star Catalyst
        builder.add(LeyLinesItems.POCKET_GRIMOIRE.getTranslationKey(), "Pocket Grimoire");

        //1-Star Catalyst
        builder.add(LeyLinesItems.APPRENTICES_NOTES.getTranslationKey(), "Apprentice's Notes");


        //Bows
        //5-Star Bow
        builder.add(LeyLinesItems.AMOS_BOW.getTranslationKey(), "Amos' Bow");
        builder.add(LeyLinesItems.AQUA_SIMULACRA.getTranslationKey(), "Aqua Simulacra");
        builder.add(LeyLinesItems.ASTRAL_VULTURES_CRIMSON_PLUMAGE.getTranslationKey(), "Astral Vulture's Crimson Plumage");
        builder.add(LeyLinesItems.ELEGY_FOR_THE_END.getTranslationKey(), "Elegy for the End");
        builder.add(LeyLinesItems.GOLDEN_FROSTBOUND_OATH.getTranslationKey(), "Golden Frostbound Oath");
        builder.add(LeyLinesItems.HUNTERS_PATH.getTranslationKey(), "Hunter's Path");
        builder.add(LeyLinesItems.POLAR_STAR.getTranslationKey(), "Polar Star");
        builder.add(LeyLinesItems.SILVERSHOWER_HEARTSTRINGS.getTranslationKey(), "Silvershower Heartstrings");
        builder.add(LeyLinesItems.SKYWARD_HARP.getTranslationKey(), "Skyward Harp");
        builder.add(LeyLinesItems.THE_DAYBREAK_CHRONICLES.getTranslationKey(), "The Daybreak Chronicles");
        builder.add(LeyLinesItems.THE_FIRST_GREAT_MAGIC.getTranslationKey(), "The First Great Magic");
        builder.add(LeyLinesItems.THUNDERING_PULSE.getTranslationKey(), "Thundering Pulse");

        //4-Star Bow
        builder.add(LeyLinesItems.ALLEY_HUNTER.getTranslationKey(), "Alley Hunter");
        builder.add(LeyLinesItems.BLACKCLIFF_WARBOW.getTranslationKey(), "Blackcliff Warbow");
        builder.add(LeyLinesItems.BREEZEBORNE_REFRAIN.getTranslationKey(), "Breezeborne Refrain");
        builder.add(LeyLinesItems.CHAIN_BREAKER.getTranslationKey(), "Chain Breaker");
        builder.add(LeyLinesItems.CLOUDFORGED.getTranslationKey(), "Cloudforged");
        builder.add(LeyLinesItems.COMPOUND_BOW.getTranslationKey(), "Compound Bow");
        builder.add(LeyLinesItems.COVENANT_OF_FROST_AND_SNOW.getTranslationKey(), "Covenant of Frost and Snow");
        builder.add(LeyLinesItems.END_OF_THE_LINE.getTranslationKey(), "End of the Line");
        builder.add(LeyLinesItems.FADING_TWILIGHT.getTranslationKey(), "Fading Twilight");
        builder.add(LeyLinesItems.FAVONIUS_WARBOW.getTranslationKey(), "Favonius Warbow");
        builder.add(LeyLinesItems.FLOWER_WREATHED_FEATHERS.getTranslationKey(), "Flower-Wreathed Feathers");
        builder.add(LeyLinesItems.HAMAYUMI.getTranslationKey(), "Hamayumi");
        builder.add(LeyLinesItems.IBIS_PIERCER.getTranslationKey(), "Ibis Piercer");
        builder.add(LeyLinesItems.JADE_VISTA.getTranslationKey(), "Jade Vista");
        builder.add(LeyLinesItems.KINGS_SQUIRE.getTranslationKey(), "King's Squire");
        builder.add(LeyLinesItems.MITTERNACHTS_WALTZ.getTranslationKey(), "Mitternachts Waltz");
        builder.add(LeyLinesItems.MOUUNS_MOON.getTranslationKey(), "Mouun's Moon");
        builder.add(LeyLinesItems.PREDATOR.getTranslationKey(), "Predator");
        builder.add(LeyLinesItems.PROTOTYPE_CRESCENT.getTranslationKey(), "Prototype Crescent");
        builder.add(LeyLinesItems.RAINBOW_SERPENTS_RAIN_BOW.getTranslationKey(), "Rainbow Serpent's Rain Bow");
        builder.add(LeyLinesItems.RANGE_GAUGE.getTranslationKey(), "Range Gauge");
        builder.add(LeyLinesItems.ROYAL_BOW.getTranslationKey(), "Royal Bow");
        builder.add(LeyLinesItems.RUST.getTranslationKey(), "Rust");
        builder.add(LeyLinesItems.SACRIFICIAL_BOW.getTranslationKey(), "Sacrificial Bow");
        builder.add(LeyLinesItems.SCION_OF_THE_BLAZING_SUN.getTranslationKey(), "Scion of the Blazing Sun");
        builder.add(LeyLinesItems.SEQUENCE_OF_SOLITUDE.getTranslationKey(), "Sequence of Solitude");
        builder.add(LeyLinesItems.SNARE_HOOK.getTranslationKey(), "Snare Hook");
        builder.add(LeyLinesItems.SONG_OF_STILLNESS.getTranslationKey(), "Song of Stillness");
        builder.add(LeyLinesItems.THE_STRINGLESS.getTranslationKey(), "The Stringless");
        builder.add(LeyLinesItems.THE_VIRIDESCENT_HUNT.getTranslationKey(), "The Viridescent Hunt");
        builder.add(LeyLinesItems.WINDBLUME_ODE.getTranslationKey(), "Windblume Ode");

        //3-Star Bow
        builder.add(LeyLinesItems.MESSENGER.getTranslationKey(), "Messenger");
        builder.add(LeyLinesItems.RAVEN_BOW.getTranslationKey(), "Raven Bow");
        builder.add(LeyLinesItems.RECURVE_BOW.getTranslationKey(), "Recurve Bow");
        builder.add(LeyLinesItems.SHARPSHOOTERS_OATH.getTranslationKey(), "Sharpshooter's Oath");
        builder.add(LeyLinesItems.SLINGSHOT.getTranslationKey(), "Slingshot");

        //2-Star Bow
        builder.add(LeyLinesItems.SEASONED_HUNTERS_BOW.getTranslationKey(), "Seasoned Hunter's Bow");

        //1-Star Bow
        builder.add(LeyLinesItems.HUNTERS_BOW.getTranslationKey(), "Hunter's Bow");


        //Items


        //Blocks


        //Item Groups
        builder.add("itemgroup.leylines.leylines_weapon_group", "LeyLines: Weapons");

        //Characters
        builder.add("character.leylines.aino", "Aino");
        builder.add("character.leylines.albedo", "Albedo");
        builder.add("character.leylines.alhaitham", "Alhaitham");
        builder.add("character.leylines.aloy", "Aloy");
        builder.add("character.leylines.alyosha", "Alyosha");
        builder.add("character.leylines.amber", "Amber");
        builder.add("character.leylines.arataki_itto", "Arataki Itto");
        builder.add("character.leylines.arlecchino", "Arlecchino");
        builder.add("character.leylines.baizhu", "Baizhu");
        builder.add("character.leylines.barbara", "Barbara");
        builder.add("character.leylines.beidou", "Beidou");
        builder.add("character.leylines.bennett", "Bennett");
        builder.add("character.leylines.candace", "Candace");
        builder.add("character.leylines.charlotte", "Charlotte");
        builder.add("character.leylines.chasca", "Chasca");
        builder.add("character.leylines.chevreuse", "Chevreuse");
        builder.add("character.leylines.chiori", "Chiori");
        builder.add("character.leylines.chongyun", "Chongyun");
        builder.add("character.leylines.citlali", "Citlali");
        builder.add("character.leylines.clorinde", "Clorinde");
        builder.add("character.leylines.collei", "Collei");
        builder.add("character.leylines.columbina", "Columbina");
        builder.add("character.leylines.cyno", "Cyno");
        builder.add("character.leylines.dahlia", "Dahlia");
        builder.add("character.leylines.dehya", "Dehya");
        builder.add("character.leylines.diluc", "Diluc");
        builder.add("character.leylines.diona", "Diona");
        builder.add("character.leylines.dori", "Dori");
        builder.add("character.leylines.durin", "Durin");
        builder.add("character.leylines.emilie", "Emilie");
        builder.add("character.leylines.escoffier", "Escoffier");
        builder.add("character.leylines.eula", "Eula");
        builder.add("character.leylines.faruzan", "Faruzan");
        builder.add("character.leylines.fischl", "Fischl");
        builder.add("character.leylines.flins", "Flins");
        builder.add("character.leylines.freminet", "Freminet");
        builder.add("character.leylines.furina", "Furina");
        builder.add("character.leylines.gaming", "Gaming");
        builder.add("character.leylines.ganyu", "Ganyu");
        builder.add("character.leylines.gorou", "Gorou");
        builder.add("character.leylines.hu_tao", "Hu Tao");
        builder.add("character.leylines.iansan", "Iansan");
        builder.add("character.leylines.ifa", "Ifa");
        builder.add("character.leylines.illuga", "Illuga");
        builder.add("character.leylines.ineffa", "Ineffa");
        builder.add("character.leylines.jahoda", "Jahoda");
        builder.add("character.leylines.jean", "Jean");
        builder.add("character.leylines.kachina", "Kachina");
        builder.add("character.leylines.kaedehara_kazuha", "Kaedehara Kazuha");
        builder.add("character.leylines.kaeya", "Kaeya");
        builder.add("character.leylines.kamisato_ayaka", "Kamisato Ayaka");
        builder.add("character.leylines.kamisato_ayato", "Kamisato Ayato");
        builder.add("character.leylines.kaveh", "Kaveh");
        builder.add("character.leylines.keqing", "Keqing");
        builder.add("character.leylines.kinich", "Kinich");
        builder.add("character.leylines.kirara", "Kirara");
        builder.add("character.leylines.klee", "Klee");
        builder.add("character.leylines.kujou_sara", "Kujou Sara");
        builder.add("character.leylines.kuki_shinobu", "Kuki Shinobu");
        builder.add("character.leylines.lan_yan", "Lan Yan");
        builder.add("character.leylines.lauma", "Lauma");
        builder.add("character.leylines.layla", "Layla");
        builder.add("character.leylines.linnea", "Linnea");
        builder.add("character.leylines.lisa", "Lisa");
        builder.add("character.leylines.lohen", "Lohen");
        builder.add("character.leylines.lynette", "Lynette");
        builder.add("character.leylines.lyney", "Lyney");
        builder.add("character.leylines.mavuika", "Mavuika");
        builder.add("character.leylines.mika", "Mika");
        builder.add("character.leylines.mona", "Mona");
        builder.add("character.leylines.mualani", "Mualani");
        builder.add("character.leylines.nahida", "Nahida");
        builder.add("character.leylines.navia", "Navia");
        builder.add("character.leylines.nefer", "Nefer");
        builder.add("character.leylines.neuvillette", "Neuvillette");
        builder.add("character.leylines.nicole", "Nicole");
        builder.add("character.leylines.nilou", "Nilou");
        builder.add("character.leylines.ningguang", "Ningguang");
        builder.add("character.leylines.noelle", "Noelle");
        builder.add("character.leylines.odette", "Odette");
        builder.add("character.leylines.ororon", "Ororon");
        builder.add("character.leylines.prune", "Prune");
        builder.add("character.leylines.qiqi", "Qiqi");
        builder.add("character.leylines.raiden_shogun", "Raiden Shogun");
        builder.add("character.leylines.razor", "Razor");
        builder.add("character.leylines.rosaria", "Rosaria");
        builder.add("character.leylines.sandrone", "Sandrone");
        builder.add("character.leylines.sangonomiya_kokomi", "Sangonomiya Kokomi");
        builder.add("character.leylines.sayu", "Sayu");
        builder.add("character.leylines.sethos", "Sethos");
        builder.add("character.leylines.shenhe", "Shenhe");
        builder.add("character.leylines.shikanoin_heizou", "Shikanoin Heizou");
        builder.add("character.leylines.sigewinne", "Sigewinne");
        builder.add("character.leylines.skirk", "Skirk");
        builder.add("character.leylines.sucrose", "Sucrose");
        builder.add("character.leylines.tartaglia", "Tartaglia");
        builder.add("character.leylines.thoma", "Thoma");
        builder.add("character.leylines.tighnari", "Tighnari");
        builder.add("character.leylines.traveler_female", "Lumine");
        builder.add("character.leylines.traveler_male", "Aether");
        builder.add("character.leylines.varesa", "Varesa");
        builder.add("character.leylines.varka", "Varka");
        builder.add("character.leylines.venti", "Venti");
        builder.add("character.leylines.vesna", "Vesna");
        builder.add("character.leylines.vodyanitsa", "Vodyanitsa");
        builder.add("character.leylines.wanderer", "Wanderer");
        builder.add("character.leylines.wonderland_manekin_female", "Manekina");
        builder.add("character.leylines.wonderland_manekin_male", "Manekin");
        builder.add("character.leylines.wriothesley", "Wriothesley");
        builder.add("character.leylines.xiangling", "Xiangling");
        builder.add("character.leylines.xianyun", "Xianyun");
        builder.add("character.leylines.xiao", "Xiao");
        builder.add("character.leylines.xilonen", "Xilonen");
        builder.add("character.leylines.xingqiu", "Xingqiu");
        builder.add("character.leylines.xinyan", "Xinyan");
        builder.add("character.leylines.yae_miko", "Yae Miko");
        builder.add("character.leylines.yanfei", "Yanfei");
        builder.add("character.leylines.yaoyao", "Yaoyao");
        builder.add("character.leylines.yelan", "Yelan");
        builder.add("character.leylines.yoimiya", "Yoimiya");
        builder.add("character.leylines.yumemizuki_mizuki", "Yumemizuki Mizuki");
        builder.add("character.leylines.yun_jin", "Yun Jin");
        builder.add("character.leylines.zhongli", "Zhongli");
        builder.add("character.leylines.zibai", "Zibai");

        //Skins
        builder.add("skin.leylines.aether_rising_star", "Rising Star");
        builder.add("skin.leylines.aether_as_heaven_and_earth_are_Made_anew", "As Heaven and Earth Are Made Anew");
        builder.add("skin.leylines.aether_night_hunt_in_snow", "Night Hunt in Snow");

        builder.add("skin.leylines.aino_fluffy_puffy_whiz_kid_workwear", "Fluffy Puffy Whiz-Kid Workwear");

        builder.add("skin.leylines.albedo_newmoon_starlight", "Newmoon Starlight");

        builder.add("skin.leylines.alhaitham_the_rational", "The Rational");

        builder.add("skin.leylines.aloy_machine_hunter", "Machine Hunter");

        builder.add("skin.leylines.alyosha_frost_cloaked_ambusher", "Frost-Cloaked Ambusher");

        builder.add("skin.leylines.amber_5_star_outrider", "5-Star Outrider");
        builder.add("skin.leylines.amber_100_outrider", "100% Outrider");

        builder.add("skin.leylines.arataki_itto_eccentric_oni", "Eccentric Oni");

        builder.add("skin.leylines.arlecchino_moonglare", "Moonglare");

        builder.add("skin.leylines.baizhu_the_applications_of_medicine", "The Applications of Medicine");

        builder.add("skin.leylines.barbara_innocent_longing", "Innocent Longing");
        builder.add("skin.leylines.barbara_summertime_sparkle", "Summertime Sparkle");

        builder.add("skin.leylines.beidou_rolling_waves", "Rolling Waves");

        builder.add("skin.leylines.bennett_fortunes_favor", "Fortune's Favor");
        builder.add("skin.leylines.bennett_adventures_in_blazing_hue", "Adventures in Blazing Hue");

        builder.add("skin.leylines.candace_desert_and_night", "Desert and Night");

        builder.add("skin.leylines.charlotte_all_is_overt_through_my_lens", "\"All Is Overt Through My Lens\"");
        builder.add("skin.leylines.charlotte_hurlock_variations", "Hurlock Variations");

        builder.add("skin.leylines.chasca_tlalocans_night_phantom", "Tlalocan's Night Phantom");

        builder.add("skin.leylines.chevreuse_guardians_gun", "Guardian's Gun");

        builder.add("skin.leylines.chiori_plucked_yamabuki_splendor", "Plucked Yamabuki Splendor");

        builder.add("skin.leylines.chongyun_pure_spirit", "Pure Spirit");

        builder.add("skin.leylines.citlali_dawnseer", "Dawnseer");
        builder.add("skin.leylines.citlali_whispers_of_stars_and_smoke", "Whispers of Stars and Smoke");

        builder.add("skin.leylines.clorinde_sword_of_honor", "Sword of Honor");

        builder.add("skin.leylines.collei_a_new_leaf", "A New Leaf");

        builder.add("skin.leylines.columbina_moonweave_gossamer", "Moonweave Gossamer");

        builder.add("skin.leylines.cyno_heart_of_the_scales", "Heart of the Scales");

        builder.add("skin.leylines.dahlia_pristine_prayers", "Pristine Prayers");

        builder.add("skin.leylines.dehya_the_lioness_and_the_blazing_sun", "The Lioness and the Blazing Sun");

        builder.add("skin.leylines.diluc_darknight_blaze", "Darknight Blaze");
        builder.add("skin.leylines.diluc_red_dead_of_night", "Red Dead of Night");

        builder.add("skin.leylines.diona_sugary_brew", "Sugary Brew");

        builder.add("skin.leylines.dori_i_love_mora", "I Love Mora");

        builder.add("skin.leylines.durin_a_gift_from_the_stars", "A Gift From the Stars");
        builder.add("skin.leylines.durin_toward_the_distant_horizon", "Toward the Distant Horizon");

        builder.add("skin.leylines.emilie_ambrosial_verdance", "Ambrosial Verdance");

        builder.add("skin.leylines.escoffier_sorbet_honey_pie", "Sorbet Honey Pie");

        builder.add("skin.leylines.eula_wavecrest_waltz", "Wavecrest Waltz");

        builder.add("skin.leylines.faruzan_pristine_elegance", "Pristine Elegance");

        builder.add("skin.leylines.fischl_dunkelnacht_sakrament", "Dunkelnacht Sakrament");
        builder.add("skin.leylines.fischl_ein_immernachtstraum", "Ein Immernachtstraum");

        builder.add("skin.leylines.flins_nocturne", "Nocturne");

        builder.add("skin.leylines.freminet_icy_skin", "Icy Skin");

        builder.add("skin.leylines.furina_coronated_prima_donna", "Coronated Prima Donna");

        builder.add("skin.leylines.gaming_ranging_rainbow", "Ranging Rainbow");

        builder.add("skin.leylines.ganyu_frostdew_trail", "Frostdew Trail");
        builder.add("skin.leylines.ganyu_twilight_blossom", "Twilight Blossom");

        builder.add("skin.leylines.gorou_panoply_of_a_hundred_hunts", "Panoply of a Hundred Hunts");

        builder.add("skin.leylines.hu_tao_plum_blossom_bouquet", "Plum Blossom Bouquet");
        builder.add("skin.leylines.hu_tao_cherries_snow_laden", "Cherries Snow-Laden");

        builder.add("skin.leylines.iansan_warriors_bonegarb", "Warrior's Bonegarb");

        builder.add("skin.leylines.ifa_whistledart_wings", "Whistledart Wings");

        builder.add("skin.leylines.illuga_steadfast_resolve", "Steadfast Resolve");

        builder.add("skin.leylines.ineffa_mechanical_dreams", "Mechanical Dreams");

        builder.add("skin.leylines.jahoda_novas_whisper", "Nova's Whisper");

        builder.add("skin.leylines.jean_favonian_devotion", "Favonian Devotion");
        builder.add("skin.leylines.jean_sea_breeze_dandelion", "Sea Breeze Dandelion");
        builder.add("skin.leylines.jean_gunnhildrs_legacy", "Gunnhildr's Legacy");

        builder.add("skin.leylines.kachina_tawny_peaks_spired_rock", "Tawny Peaks, Spired Rock");

        builder.add("skin.leylines.kaedehara_kazuha_falling_leaves", "Falling Leaves");

        builder.add("skin.leylines.kaeya_icy_featherflight", "Icy Featherflight");
        builder.add("skin.leylines.kaeya_sailwind_shadow", "Sailwind Shadow");

        builder.add("skin.leylines.kamisato_ayaka_flawless_radiance", "Flawless Radiance");
        builder.add("skin.leylines.kamisato_ayaka_springbloom_missive", "Springbloom Missive");

        builder.add("skin.leylines.kamisato_ayato_silk_splendor", "Silk Splendor");

        builder.add("skin.leylines.kaveh_gold_pinions_in_flames_bathed", "Gold Pinions in Flames Bathed");

        builder.add("skin.leylines.keqing_piercing_thunderbolt", "Piercing Thunderbolt");
        builder.add("skin.leylines.keqing_opulent_splendor", "Opulent Splendor");

        builder.add("skin.leylines.kinich_eight_bit_artistry", "Eight-Bit Artistry");

        builder.add("skin.leylines.kirara_whirling_bloom", "Whirling Bloom");
        builder.add("skin.leylines.kirara_phantom_in_boots", "Phantom in Boots");

        builder.add("skin.leylines.klee_shooting_spark", "Shooting Spark");
        builder.add("skin.leylines.klee_blossoming_starlight", "Blossoming Starlight");

        builder.add("skin.leylines.kujou_sara_solemn_purity", "Solemn Purity");

        builder.add("skin.leylines.kuki_shinobu_aratakis_demonic_deputy", "Arataki's Demonic Deputy");

        builder.add("skin.leylines.lan_yan_argent_chimes", "Argent Chimes");

        builder.add("skin.leylines.lauma_verdant_moon", "Verdant Moon");

        builder.add("skin.leylines.layla_dreaming_star", "Dreaming Star");

        builder.add("skin.leylines.linnea_lone_feathers_omen", "Lone Feather's Omen");

        builder.add("skin.leylines.lisa_purple_rose", "Purple Rose");
        builder.add("skin.leylines.lisa_a_sobriquet_under_shade", "A Sobriquet Under Shade");

        builder.add("skin.leylines.lohen_frost_forged_edge", "Frost-Forged Edge");

        builder.add("skin.leylines.lumine_rising_star", "Rising Star");
        builder.add("skin.leylines.lumine_as_heaven_and_earth_are_Made_anew", "As Heaven and Earth Are Made Anew");
        builder.add("skin.leylines.lumine_night_hunt_in_snow", "Night Hunt in Snow");

        builder.add("skin.leylines.lynette_phantomeow", "Phantomeow");

        builder.add("skin.leylines.lyney_fantasticat", "Fantasticat");

        builder.add("skin.leylines.mavuika_undying_sun", "Undying Sun");

        builder.add("skin.leylines.mika_soaring_beacon", "Soaring Beacon");

        builder.add("skin.leylines.mona_flowing_fate", "Flowing Fate");
        builder.add("skin.leylines.mona_pact_of_stars_and_moon", "Pact of Stars and Moon");

        builder.add("skin.leylines.mualani_flying_fish_heat_waves_and_moon_scallop", "Flying Fish, Heat Waves, and Moon Scallop");

        builder.add("skin.leylines.nahida_for_all_knowledge_a_verse", "For All Knowledge, a Verse");

        builder.add("skin.leylines.navia_yellow_velvet_salon", "Yellow Velvet Salon");

        builder.add("skin.leylines.nefer_emerald_cipher", "Emerald Cipher");

        builder.add("skin.leylines.neuvillette_clear_adjudication", "Clear Adjudication");
        builder.add("skin.leylines.neuvillette_melusent_gift", "Melusent Gift");

        builder.add("skin.leylines.nicole_mimetic_interpretation", "Mimetic Interpretation");

        builder.add("skin.leylines.nilou_neither_flower_nor_mist", "Neither Flower Nor Mist");
        builder.add("skin.leylines.nilou_breeze_of_sabaa", "Breeze of Sabaa");

        builder.add("skin.leylines.ningguang_gold_lead_and_pearly_jade", "Gold Leaf and Pearly Jade");
        builder.add("skin.leylines.ningguang_orchids_evening_gown", "Orchid's Evening Gown");

        builder.add("skin.leylines.noelle_armored_rose", "Armored Rose");

        builder.add("skin.leylines.odette_snow_swans_dance", "Snow Swan's Dance");

        builder.add("skin.leylines.ororon_batwing_iris", "Batwing Iris");

        builder.add("skin.leylines.prune_witch_hunter_regalia", "Witch Hunter Regalia");

        builder.add("skin.leylines.qiqi_summerchill_dreams", "Summerchill Dreams");

        builder.add("skin.leylines.raiden_shogun_narukamis_law", "Narukami's Law");

        builder.add("skin.leylines.razor_wild_sprint", "Wild Sprint");

        builder.add("skin.leylines.rosaria_executors_thorns", "Executor's Thorns");
        builder.add("skin.leylines.rosaria_to_the_churchs_free_spirit", "To the Church's Free Spirit");

        builder.add("skin.leylines.sandrone_clockwork_maidens_waltz", "Clockwork Maiden's Waltz");

        builder.add("skin.leylines.sangonomiya_kokomi_sparkling_coralbone", "Sparkling Coralbone");

        builder.add("skin.leylines.sayu_mini_mujina", "Mini Mujina");

        builder.add("skin.leylines.sethos_golden_sandstrider", "Golden Sandstrider");

        builder.add("skin.leylines.shenhe_the_worlds_shackles", "The World's Shackles");
        builder.add("skin.leylines.shenhe_frostflower_dew", "Frostflower Dew");

        builder.add("skin.leylines.shikanoin_heizou_spirited_valor", "Spirited Valor");

        builder.add("skin.leylines.sigewinne_sweetness_of_the_sea", "Sweetness of the Sea");

        builder.add("skin.leylines.skirk_shattered_star", "Shattered Star");

        builder.add("skin.leylines.sucrose_germinating_wind", "Germinating Wind");

        builder.add("skin.leylines.tartaglia_blades_of_glory", "Blades of Glory");

        builder.add("skin.leylines.thoma_warrior_of_flame", "Warrior of Flame");

        builder.add("skin.leylines.tighnari_woodland_song", "Woodland Song");

        builder.add("skin.leylines.varesa_sugar_rush", "Sugar Rush");

        builder.add("skin.leylines.varka_oath_to_the_north_wind", "Oath to the North Wind");

        builder.add("skin.leylines.venti_breezy_ode", "Breezy Ode");

        builder.add("skin.leylines.vesna_springs_bond_winters_oath", "Spring's Bond, Winter's Oath");

        builder.add("skin.leylines.vodyanitsa_surging_resonance", "Surging Resonance");

        builder.add("skin.leylines.wanderer_a_wrathful_void", "A Wrathful Void");

        builder.add("skin.leylines.wonderland_manekin", "Manekin");
        builder.add("skin.leylines.wonderland_manekina", "Manekina");

        builder.add("skin.leylines.wriothesley_nights_chilling_howl", "Night's Chilling Howl");

        builder.add("skin.leylines.xiangling_red_pepper_and_tumeric", "Red Pepper and Turmeric");
        builder.add("skin.leylines.xiangling_new_years_cheer", "New Year's Cheer");

        builder.add("skin.leylines.xianyun_a_guests_august_omen", "A Guest's August Omen");

        builder.add("skin.leylines.xiao_endurer_of_eons", "Endurer of Eons");

        builder.add("skin.leylines.xilonen_gold_draped_gorge", "Gold-Draped Gorge");

        builder.add("skin.leylines.xingqiu_azure_silk", "Azure Silk");
        builder.add("skin.leylines.xingqiu_bamboo_rain", "Bamboo Rain");

        builder.add("skin.leylines.xinyan_ardent_soul", "Ardent Soul");

        builder.add("skin.leylines.yae_miko_mikos_instruction", "Miko's Instruction");

        builder.add("skin.leylines.yanfei_golden_rule", "Golden Rule");

        builder.add("skin.leylines.yaoyao_cherubic_osmanthus", "Cherubic Osmanthus");
        builder.add("skin.leylines.yaoyao_rainlit_bamboo_reverie", "Rainlit Bamboo Reverie");

        builder.add("skin.leylines.yelan_the_warning_point", "The Waning Point");
        builder.add("skin.leylines.yelan_tranquil_banquet", "Tranquil Banquet");

        builder.add("skin.leylines.yoimiya_goldfish_firecracker", "Goldfish Firecracker");

        builder.add("skin.leylines.yumemizuki_mizuki_dawnbreath_dreambelle", "Dawnbreath Dreambelle");

        builder.add("skin.leylines.yun_jin_mistcloud_stage", "Mistcloud Stage");

        builder.add("skin.leylines.zhongli_hermit_of_mortal_life", "Hermit of Mortal Life");

        builder.add("skin.leylines.zibai_moonlit_courser", "Moonlit Courser");


        //NPC Characters
        builder.add("npc.leylines.paimon", "Paimon");

        //Keybinds
        builder.add("category.leylines.basic_actions", "Ley Lines - Basic Settings: Actions");
        builder.add("category.leylines.basic_menus", "Ley Lines - Basic Settings: Menus");
        builder.add("category.leylines.miliastra_general", "Ley Lines - Miliastra Wonderland: General Controls");
        builder.add("category.leylines.miliastra_lobby", "Ley Lines - Miliastra Wonderland: Lobby Controls");
        builder.add("category.leylines.miliastra_wonderland_general", "Ley Lines - Miliastra Wonderland: Wonderland Controls: Wonderland/General:");
        builder.add("category.leylines.miliastra_wonderland_classic", "Ley Lines - Miliastra Wonderland: Wonderland Controls: Wonderland/Classic Mode:");
        builder.add("category.leylines.miliastra_wonderland_beyond", "Ley Lines - Miliastra Wonderland: Wonderland Controls: Wonderland/Beyond Mode:");

        //Basic Settings: Actions
        builder.add(LeyLinesKeybinds.actions_move_forward.getTranslationKey(), "Move Forward");
        builder.add(LeyLinesKeybinds.actions_move_backward.getTranslationKey(), "Move Backward");
        builder.add(LeyLinesKeybinds.actions_move_left.getTranslationKey(), "Move Left");
        builder.add(LeyLinesKeybinds.actions_move_right.getTranslationKey(), "Move Right");
        builder.add(LeyLinesKeybinds.actions_switch_walk_run.getTranslationKey(), "Switch to Walk/Run. Or crouch downward in specific operating mode(s)");
        builder.add(LeyLinesKeybinds.actions_normal_attack.getTranslationKey(), "Normal Attack");
        builder.add(LeyLinesKeybinds.actions_elemental_skill.getTranslationKey(), "Elemental Skill");
        builder.add(LeyLinesKeybinds.actions_elemental_burst.getTranslationKey(), "Elemental Burst");
        builder.add(LeyLinesKeybinds.actions_sprint.getTranslationKey(), "Sprint");
        builder.add(LeyLinesKeybinds.actions_sprint_alt.getTranslationKey(), "Sprint: (ALT)");
        builder.add(LeyLinesKeybinds.actions_switch_aiming.getTranslationKey(), "Switch Aiming Mode");
        builder.add(LeyLinesKeybinds.actions_jump.getTranslationKey(), "Jump, or move upward in specific operating mode(s)");
        builder.add(LeyLinesKeybinds.actions_drop.getTranslationKey(), "Drop (while climbing)");
        builder.add(LeyLinesKeybinds.actions_pickup_interact.getTranslationKey(), "Pick Up/Interact");
        builder.add(LeyLinesKeybinds.actions_quickuse_gadget.getTranslationKey(), "Quick-Use Gadget");
        builder.add(LeyLinesKeybinds.actions_gadget_quickswap.getTranslationKey(), "Gadget Quickswap: (Hold)");
        builder.add(LeyLinesKeybinds.actions_interaction_gameplay.getTranslationKey(), "Interaction in Certain Gameplay Modes");
        builder.add(LeyLinesKeybinds.actions_quest_navigation.getTranslationKey(), "Quest Navigation");
        builder.add(LeyLinesKeybinds.actions_show_quest_objective.getTranslationKey(), "Show objective for this phase of the quest: (Hold)");
        builder.add(LeyLinesKeybinds.actions_abandon_challenge.getTranslationKey(), "Abandon Challenge");
        builder.add(LeyLinesKeybinds.actions_party_slot_1.getTranslationKey(), "Switch to Party Member 1");
        builder.add(LeyLinesKeybinds.actions_party_slot_2.getTranslationKey(), "Switch to Party Member 2");
        builder.add(LeyLinesKeybinds.actions_party_slot_3.getTranslationKey(), "Switch to Party Member 3");
        builder.add(LeyLinesKeybinds.actions_party_slot_4.getTranslationKey(), "Switch to Party Member 4");
        builder.add(LeyLinesKeybinds.actions_party_slot_5.getTranslationKey(), "Switch to Party Member 5");
        //Switch burst alt + party slot
        builder.add(LeyLinesKeybinds.actions_open_shortcut_wheel.getTranslationKey(), "Open Shortcut Wheel");

        //Basic Settings: Menus
        builder.add(LeyLinesKeybinds.menus_open_inventory.getTranslationKey(), "Open Inventory");
        builder.add(LeyLinesKeybinds.menus_open_character_screen.getTranslationKey(), "Open Character Screen");
        builder.add(LeyLinesKeybinds.menus_open_map.getTranslationKey(), "Open Map");
        builder.add(LeyLinesKeybinds.menus_open_paimon_menu.getTranslationKey(), "Open Paimon Menu");
        builder.add(LeyLinesKeybinds.menus_open_adventurers_handbook.getTranslationKey(), "Open Adventurer Handbook Screen");
        builder.add(LeyLinesKeybinds.menus_open_coop_screen.getTranslationKey(), "Open Co-Op Screen");
        builder.add(LeyLinesKeybinds.menus_open_wish_screen.getTranslationKey(), "Open Wish Screen");
        builder.add(LeyLinesKeybinds.menus_open_battle_pass_screen.getTranslationKey(), "Open Battle Pass Screen");
        builder.add(LeyLinesKeybinds.menus_open_events_menu.getTranslationKey(), "Open the Events Menu");
        builder.add(LeyLinesKeybinds.menus_open_settings_menu.getTranslationKey(), "Open the settings menu (within Serenitea Pot/The Cat's Tail)");
        builder.add(LeyLinesKeybinds.menus_open_popular_miliastra_wonderland_menu.getTranslationKey(), "Open the Popular Miliastra Wonderlands page");
        builder.add(LeyLinesKeybinds.menus_open_furnishing_screen.getTranslationKey(), "Open the Furnishing Screen (inside Serenitea Pot)");
        builder.add(LeyLinesKeybinds.menus_open_stellar_reunion.getTranslationKey(), "Open Stellar Reunion (Only active when conditions are met)");
        builder.add(LeyLinesKeybinds.menus_open_quest_menu.getTranslationKey(), "Open Quest Menu");
        builder.add(LeyLinesKeybinds.menus_open_notification_details.getTranslationKey(), "Open Notification Details");
        builder.add(LeyLinesKeybinds.menus_open_chat_screen.getTranslationKey(), "Open Chat Screen");
        builder.add(LeyLinesKeybinds.menus_open_special_environment_information.getTranslationKey(), "Open Special Environment Information");
        builder.add(LeyLinesKeybinds.menus_check_tutorial_details.getTranslationKey(), "Check Tutorial Details");
        builder.add(LeyLinesKeybinds.menus_elemental_sight.getTranslationKey(), "Elemental Sight (Hold)");
        builder.add(LeyLinesKeybinds.menus_show_cursor.getTranslationKey(), "Show Cursor");
        builder.add(LeyLinesKeybinds.menus_open_party_setup_screen.getTranslationKey(), "Open Party Setup Screen");
        builder.add(LeyLinesKeybinds.menus_open_friends_screen.getTranslationKey(), "Open Friends Screen");
        builder.add(LeyLinesKeybinds.menus_hide_ui.getTranslationKey(), "Hide UI");

        //Miliastra Wonderland: General Controls
        builder.add(LeyLinesKeybinds.general_move_forward.getTranslationKey(), "Move Forward");
        builder.add(LeyLinesKeybinds.general_move_backward.getTranslationKey(), "Move Backward");
        builder.add(LeyLinesKeybinds.general_move_left.getTranslationKey(), "Move Left");
        builder.add(LeyLinesKeybinds.general_move_right.getTranslationKey(), "Move Right");
        builder.add(LeyLinesKeybinds.general_switch_walk_run.getTranslationKey(), "Switch to Walk/Run");
        builder.add(LeyLinesKeybinds.general_sprint.getTranslationKey(), "Sprint");
        builder.add(LeyLinesKeybinds.general_sprint_alt.getTranslationKey(), "Sprint: (ALT)");
        builder.add(LeyLinesKeybinds.general_jump.getTranslationKey(), "Jump, or move upward in specific operating mode(s)");
        builder.add(LeyLinesKeybinds.general_drop.getTranslationKey(), "Drop");
        builder.add(LeyLinesKeybinds.general_open_paimon_menu.getTranslationKey(), "Open Paimon Menu");
        builder.add(LeyLinesKeybinds.general_open_chat_screen.getTranslationKey(), "Open Chat Screen");
        builder.add(LeyLinesKeybinds.general_show_cursor.getTranslationKey(), "Show Cursor");
        builder.add(LeyLinesKeybinds.general_hide_ui.getTranslationKey(), "Hide UI");
        builder.add(LeyLinesKeybinds.general_open_shortcut_wheel.getTranslationKey(), "Open Shortcut Wheel");
        builder.add(LeyLinesKeybinds.general_enable_microphone.getTranslationKey(), "Enable Microphone");
        builder.add(LeyLinesKeybinds.general_voice_chat_settings.getTranslationKey(), "Voice Chat Settings");

        //Miliastra Wonderland: Lobby Controls
        builder.add(LeyLinesKeybinds.lobby_pickup_interact.getTranslationKey(), "Pick Up/Interact");
        builder.add(LeyLinesKeybinds.lobby_interaction_gameplay_mode_1.getTranslationKey(), "Interaction in Certain Gameplay Modes - 1");
        builder.add(LeyLinesKeybinds.lobby_interaction_gameplay_mode_2.getTranslationKey(), "Interaction in Certain Gameplay Modes - 2");
        builder.add(LeyLinesKeybinds.lobby_open_expression_screen.getTranslationKey(), "Open Expression Screen");
        builder.add(LeyLinesKeybinds.lobby_view_favorited_wonderlands.getTranslationKey(), "View Favorited Wonderlands");
        builder.add(LeyLinesKeybinds.lobby_open_cosmetic_plans.getTranslationKey(), "Open Cosmetic Plans");
        builder.add(LeyLinesKeybinds.lobby_open_map.getTranslationKey(), "Open Map");
        builder.add(LeyLinesKeybinds.lobby_open_gameplay_guide.getTranslationKey(), "Open Gameplay Guide");
        builder.add(LeyLinesKeybinds.lobby_open_lobby_screen.getTranslationKey(), "Open Lobby Screen");
        builder.add(LeyLinesKeybinds.lobby_open_odes_screen.getTranslationKey(), "Open Odes Screen");
        builder.add(LeyLinesKeybinds.lobby_open_miliastra_pass_screen.getTranslationKey(), "Open Miliastra Pass Screen");
        builder.add(LeyLinesKeybinds.lobby_open_my_miliastra_wonderland.getTranslationKey(), "Open My Miliastra Wonderland");
        builder.add(LeyLinesKeybinds.lobby_open_popular_miliastra_wonderlands.getTranslationKey(), "Open Popular Miliastra Wonderlands");
        builder.add(LeyLinesKeybinds.lobby_open_stellar_reunion.getTranslationKey(), "Open Stellar Reunion (Only active when conditions are met)");
        builder.add(LeyLinesKeybinds.lobby_open_quest_menu.getTranslationKey(), "Open Quest Menu");
        builder.add(LeyLinesKeybinds.lobby_open_notification_menu.getTranslationKey(), "Open Notification Menu");
        builder.add(LeyLinesKeybinds.lobby_open_party_screen.getTranslationKey(), "Open Party Screen");
        builder.add(LeyLinesKeybinds.lobby_open_friends_screen.getTranslationKey(), "Open Friends Screen");
        builder.add(LeyLinesKeybinds.lobby_matchmaking.getTranslationKey(), "Matchmaking/Room");
        builder.add(LeyLinesKeybinds.lobby_open_switch_character_page.getTranslationKey(), "Open Switch Character Page");
        builder.add(LeyLinesKeybinds.lobby_quickuse_gadget.getTranslationKey(), "Quick-Use Gadget");

        //Miliastra Wonderland: Wonderland Controls: Wonderland/General:
        builder.add(LeyLinesKeybinds.wonderland_general_pickup_interact.getTranslationKey(), "Pick Up/Interact");
        builder.add(LeyLinesKeybinds.wonderland_general_open_inventory_interface.getTranslationKey(), "Open inventory interface (only available in stages with this feature)");
        builder.add(LeyLinesKeybinds.wonderland_general_open_equipment_interface.getTranslationKey(), "Open equipment interface (only available in stages with this feature)");
        builder.add(LeyLinesKeybinds.wonderland_general_open_map_interface.getTranslationKey(), "Open map interface");
        builder.add(LeyLinesKeybinds.wonderland_general_open_gift_box_interface.getTranslationKey(), "Open Gift Box Interface");
        builder.add(LeyLinesKeybinds.wonderland_general_open_deck_selector.getTranslationKey(), "Open Deck Selector");
        builder.add(LeyLinesKeybinds.wonderland_general_open_wonderland_task_interface.getTranslationKey(), "Open Wonderland Task Interface");

        //Miliastra Wonderland: Wonderland Controls: Wonderland/Classic Mode:
        builder.add(LeyLinesKeybinds.wonderland_classic_normal_attack.getTranslationKey(), "Normal Attack");
        builder.add(LeyLinesKeybinds.wonderland_classic_elemental_skill.getTranslationKey(), "Elemental Skill");
        builder.add(LeyLinesKeybinds.wonderland_classic_elemental_burst.getTranslationKey(), "Elemental Burst");
        builder.add(LeyLinesKeybinds.wonderland_classic_character_skill_1.getTranslationKey(), "Character Skill 1");
        builder.add(LeyLinesKeybinds.wonderland_classic_character_skill_2.getTranslationKey(), "Character Skill 2");
        builder.add(LeyLinesKeybinds.wonderland_classic_switch_aiming.getTranslationKey(), "Switch to aiming mode");
        builder.add(LeyLinesKeybinds.wonderland_classic_interaction_gameplay.getTranslationKey(), "Interaction in Specified Gameplay Modes");
        builder.add(LeyLinesKeybinds.wonderland_classic_party_slot_1.getTranslationKey(), "Switch to Party Member 1");
        builder.add(LeyLinesKeybinds.wonderland_classic_party_slot_2.getTranslationKey(), "Switch to Party Member 2");
        builder.add(LeyLinesKeybinds.wonderland_classic_party_slot_3.getTranslationKey(), "Switch to Party Member 3");
        builder.add(LeyLinesKeybinds.wonderland_classic_party_slot_4.getTranslationKey(), "Switch to Party Member 4");
        //Switch burst alt + party slot

        //Miliastra Wonderland: Wonderland Controls: Wonderland/Beyond Mode:
        builder.add(LeyLinesKeybinds.wonderland_beyond_normal_attack.getTranslationKey(), "Normal Attack");
        builder.add(LeyLinesKeybinds.wonderland_beyond_character_skill_1.getTranslationKey(), "Character Skill 1");
        builder.add(LeyLinesKeybinds.wonderland_beyond_character_skill_2.getTranslationKey(), "Character Skill 2");
        builder.add(LeyLinesKeybinds.wonderland_beyond_character_skill_3.getTranslationKey(), "Character Skill 3");
        builder.add(LeyLinesKeybinds.wonderland_beyond_character_skill_4.getTranslationKey(), "Character Skill 4");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_1.getTranslationKey(), "Craftsperson Keymap 1");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_2.getTranslationKey(), "Craftsperson Keymap 2");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_3.getTranslationKey(), "Craftsperson Keymap 3");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_4.getTranslationKey(), "Craftsperson Keymap 4");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_5.getTranslationKey(), "Craftsperson Keymap 5");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_6.getTranslationKey(), "Craftsperson Keymap 6");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_7.getTranslationKey(), "Craftsperson Keymap 7");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_8.getTranslationKey(), "Craftsperson Keymap 8");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_9.getTranslationKey(), "Craftsperson Keymap 9");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_10.getTranslationKey(), "Craftsperson Keymap 10");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_11.getTranslationKey(), "Craftsperson Keymap 11");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_12.getTranslationKey(), "Craftsperson Keymap 12");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_13.getTranslationKey(), "Craftsperson Keymap 13");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_14.getTranslationKey(), "Craftsperson Keymap 14");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_15.getTranslationKey(), "Craftsperson Keymap 15");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_16.getTranslationKey(), "Craftsperson Keymap 16");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_17.getTranslationKey(), "Craftsperson Keymap 17");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_18.getTranslationKey(), "Craftsperson Keymap 18");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_19.getTranslationKey(), "Craftsperson Keymap 19");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_20.getTranslationKey(), "Craftsperson Keymap 20");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_21.getTranslationKey(), "Craftsperson Keymap 21");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_22.getTranslationKey(), "Craftsperson Keymap 22");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_23.getTranslationKey(), "Craftsperson Keymap 23");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_24.getTranslationKey(), "Craftsperson Keymap 24");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_25.getTranslationKey(), "Craftsperson Keymap 25");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_26.getTranslationKey(), "Craftsperson Keymap 26");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_27.getTranslationKey(), "Craftsperson Keymap 27");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_28.getTranslationKey(), "Craftsperson Keymap 28");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_29.getTranslationKey(), "Craftsperson Keymap 29");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_30.getTranslationKey(), "Craftsperson Keymap 30");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_31.getTranslationKey(), "Craftsperson Keymap 31");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_32.getTranslationKey(), "Craftsperson Keymap 32");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_33.getTranslationKey(), "Craftsperson Keymap 33");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_34.getTranslationKey(), "Craftsperson Keymap 34");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_35.getTranslationKey(), "Craftsperson Keymap 35");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_36.getTranslationKey(), "Craftsperson Keymap 36");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_37.getTranslationKey(), "Craftsperson Keymap 37");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_38.getTranslationKey(), "Craftsperson Keymap 38");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_39.getTranslationKey(), "Craftsperson Keymap 39");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_40.getTranslationKey(), "Craftsperson Keymap 40");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_41.getTranslationKey(), "Craftsperson Keymap 41");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_42.getTranslationKey(), "Craftsperson Keymap 42");
        builder.add(LeyLinesKeybinds.wonderland_beyond_craftsperson_keymap_43.getTranslationKey(), "Craftsperson Keymap 43");
    }
}
