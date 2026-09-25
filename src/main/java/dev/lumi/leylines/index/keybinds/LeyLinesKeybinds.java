package dev.lumi.leylines.index.keybinds;

import dev.lumi.leylines.LeyLines;
import dev.lumi.leylines.item.weapon.util.LeyLinesWeaponItem;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LeyLinesKeybinds {
    protected static final Map<KeyBinding, Identifier> KEY_BINDING = new LinkedHashMap();
    private static final Map<KeyBinding, Integer> KEY_BINDING_ORDER = new HashMap<>();
    private static final Map<String, Integer> CATEGORY_ORDER = new LinkedHashMap<>();
    private static final Map<String, Integer> CATEGORY_NEXT_ORDER = new HashMap<>();
    //Basic Settings
    //Actions
    public static final KeyBinding actions_move_forward;
    public static final KeyBinding actions_move_backward;
    public static final KeyBinding actions_move_left;
    public static final KeyBinding actions_move_right;
    public static final KeyBinding actions_switch_walk_run;
    public static final KeyBinding actions_normal_attack;
    public static final KeyBinding actions_elemental_skill;
    public static final KeyBinding actions_elemental_burst;
    public static final KeyBinding actions_sprint;
    public static final KeyBinding actions_sprint_alt;
    public static final KeyBinding actions_switch_aiming;
    public static final KeyBinding actions_jump;
    public static final KeyBinding actions_drop;
    public static final KeyBinding actions_pickup_interact;
    public static final KeyBinding actions_quickuse_gadget;
    public static final KeyBinding actions_gadget_quickswap;
    public static final KeyBinding actions_interaction_gameplay;
    public static final KeyBinding actions_quest_navigation;
    public static final KeyBinding actions_show_quest_objective;
    public static final KeyBinding actions_abandon_challenge;
    public static final KeyBinding actions_party_slot_1;
    public static final KeyBinding actions_party_slot_2;
    public static final KeyBinding actions_party_slot_3;
    public static final KeyBinding actions_party_slot_4;
    public static final KeyBinding actions_party_slot_5;
    //Switch burst alt + party slot
    public static final KeyBinding actions_open_shortcut_wheel;

    //Menus
    public static final KeyBinding menus_open_inventory;
    public static final KeyBinding menus_open_character_screen;
    public static final KeyBinding menus_open_map;
    public static final KeyBinding menus_open_paimon_menu;
    public static final KeyBinding menus_open_adventurers_handbook;
    public static final KeyBinding menus_open_coop_screen;
    public static final KeyBinding menus_open_wish_screen;
    public static final KeyBinding menus_open_battle_pass_screen;
    public static final KeyBinding menus_open_events_menu;
    public static final KeyBinding menus_open_settings_menu; //Serenitea Pot/The Cat's Tail
    public static final KeyBinding menus_open_popular_miliastra_wonderland_menu;
    public static final KeyBinding menus_open_furnishing_screen;
    public static final KeyBinding menus_open_stellar_reunion;
    public static final KeyBinding menus_open_quest_menu;
    public static final KeyBinding menus_open_notification_details;
    public static final KeyBinding menus_open_chat_screen;
    public static final KeyBinding menus_open_special_environment_information;
    public static final KeyBinding menus_check_tutorial_details;
    public static final KeyBinding menus_elemental_sight; //Hold
    public static final KeyBinding menus_show_cursor;
    public static final KeyBinding menus_open_party_setup_screen;
    public static final KeyBinding menus_open_friends_screen;
    public static final KeyBinding menus_hide_ui;


    //Miliastra Wonderland
    //General Controls
    public static final KeyBinding general_move_forward;
    public static final KeyBinding general_move_backward;
    public static final KeyBinding general_move_left;
    public static final KeyBinding general_move_right;
    public static final KeyBinding general_switch_walk_run;
    public static final KeyBinding general_sprint;
    public static final KeyBinding general_sprint_alt;
    public static final KeyBinding general_jump;
    public static final KeyBinding general_drop;
    public static final KeyBinding general_open_paimon_menu;
    public static final KeyBinding general_open_chat_screen;
    public static final KeyBinding general_show_cursor;
    public static final KeyBinding general_hide_ui;
    public static final KeyBinding general_open_shortcut_wheel;
    public static final KeyBinding general_enable_microphone;
    public static final KeyBinding general_voice_chat_settings;

    //Lobby Controls
    public static final KeyBinding lobby_pickup_interact;
    public static final KeyBinding lobby_interaction_gameplay_mode_1;
    public static final KeyBinding lobby_interaction_gameplay_mode_2;
    public static final KeyBinding lobby_open_expression_screen;
    public static final KeyBinding lobby_view_favorited_wonderlands;
    public static final KeyBinding lobby_open_cosmetic_plans;
    public static final KeyBinding lobby_open_map;
    public static final KeyBinding lobby_open_gameplay_guide;
    public static final KeyBinding lobby_open_lobby_screen;
    public static final KeyBinding lobby_open_odes_screen;
    public static final KeyBinding lobby_open_miliastra_pass_screen;
    public static final KeyBinding lobby_open_my_miliastra_wonderland;
    public static final KeyBinding lobby_open_popular_miliastra_wonderlands;
    public static final KeyBinding lobby_open_stellar_reunion;
    public static final KeyBinding lobby_open_quest_menu;
    public static final KeyBinding lobby_open_notification_menu;
    public static final KeyBinding lobby_open_party_screen;
    public static final KeyBinding lobby_open_friends_screen;
    public static final KeyBinding lobby_matchmaking;
    public static final KeyBinding lobby_open_switch_character_page;
    public static final KeyBinding lobby_quickuse_gadget;

    //Wonderland Controls: Wonderland/General
    public static final KeyBinding wonderland_general_pickup_interact;
    public static final KeyBinding wonderland_general_open_inventory_interface;
    public static final KeyBinding wonderland_general_open_equipment_interface;
    public static final KeyBinding wonderland_general_open_map_interface;
    public static final KeyBinding wonderland_general_open_gift_box_interface;
    public static final KeyBinding wonderland_general_open_deck_selector;
    public static final KeyBinding wonderland_general_open_wonderland_task_interface;

    //Wonderland Controls: Wonderland/Classic Mode
    public static final KeyBinding wonderland_classic_normal_attack;
    public static final KeyBinding wonderland_classic_elemental_skill;
    public static final KeyBinding wonderland_classic_elemental_burst;
    public static final KeyBinding wonderland_classic_character_skill_1;
    public static final KeyBinding wonderland_classic_character_skill_2;
    public static final KeyBinding wonderland_classic_switch_aiming;
    public static final KeyBinding wonderland_classic_interaction_gameplay;
    public static final KeyBinding wonderland_classic_party_slot_1;
    public static final KeyBinding wonderland_classic_party_slot_2;
    public static final KeyBinding wonderland_classic_party_slot_3;
    public static final KeyBinding wonderland_classic_party_slot_4;
    //Switch burst alt + party slot

    //Wonderland Controls: Wonderland/Beyond Mode
    public static final KeyBinding wonderland_beyond_normal_attack;
    public static final KeyBinding wonderland_beyond_character_skill_1;
    public static final KeyBinding wonderland_beyond_character_skill_2;
    public static final KeyBinding wonderland_beyond_character_skill_3;
    public static final KeyBinding wonderland_beyond_character_skill_4;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_1;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_2;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_3;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_4;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_5;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_6;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_7;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_8;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_9;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_10;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_11;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_12;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_13;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_14;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_15;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_16;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_17;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_18;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_19;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_20;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_21;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_22;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_23;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_24;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_25;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_26;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_27;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_28;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_29;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_30;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_31;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_32;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_33;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_34;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_35;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_36;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_37;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_38;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_39;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_40;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_41;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_42;
    public static final KeyBinding wonderland_beyond_craftsperson_keymap_43;

    private static final String CATEGORY_BASIC_ACTIONS = "category.leylines.basic_actions";
    private static final String CATEGORY_BASIC_MENUS = "category.leylines.basic_menus";
    private static final String CATEGORY_MILIASTRA_GENERAL = "category.leylines.miliastra_general";
    private static final String CATEGORY_MILIASTRA_LOBBY = "category.leylines.miliastra_lobby";
    private static final String CATEGORY_MILIASTRA_WONDERLAND_GENERAL = "category.leylines.miliastra_wonderland_general";
    private static final String CATEGORY_MILIASTRA_WONDERLAND_CLASSIC = "category.leylines.miliastra_wonderland_classic";
    private static final String CATEGORY_MILIASTRA_WONDERLAND_BEYOND = "category.leylines.miliastra_wonderland_beyond";

    public static void init() {
        KEY_BINDING.forEach((keybinding, id) -> {
            KeyBindingHelper.registerKeyBinding(keybinding);
        });
    }

    protected static KeyBinding register(String name, InputUtil.Type type, int keyCode, String category) {
        KeyBinding keyBinding = new KeyBinding("key.leylines." + name, type, keyCode, category);
        KEY_BINDING.put(keyBinding, LeyLines.id(name));

        // Category gets its order when first encountered.
        int categoryOrder = CATEGORY_ORDER.computeIfAbsent(category, ignored -> CATEGORY_ORDER.size());

        // Keybind gets an order within its category.
        int keyOrder = CATEGORY_NEXT_ORDER.getOrDefault(category, 0);

        CATEGORY_NEXT_ORDER.put(category, keyOrder + 1);
        KEY_BINDING_ORDER.put(keyBinding, keyOrder);
        return keyBinding;
    }

    public static Integer getCategoryOrder(KeyBinding keyBinding) {
        return CATEGORY_ORDER.get(keyBinding.getCategory());
    }

    public static Integer getKeyBindingOrder(KeyBinding keyBinding) {
        return KEY_BINDING_ORDER.get(keyBinding);
    }

    public LeyLinesKeybinds() {
    }

    static {
        //Basic Settings
        //Actions
        actions_move_forward = register((String) "actions_move_forward", InputUtil.Type.KEYSYM, 87, "category.leylines.basic_actions");
        actions_move_backward = register((String) "actions_move_backward", InputUtil.Type.KEYSYM, 83, "category.leylines.basic_actions");
        actions_move_left = register((String) "actions_move_left", InputUtil.Type.KEYSYM, 65, "category.leylines.basic_actions");
        actions_move_right = register((String) "actions_move_right", InputUtil.Type.KEYSYM, 68, "category.leylines.basic_actions");
        actions_switch_walk_run = register((String) "actions_switch_walk_run", InputUtil.Type.KEYSYM, 341, "category.leylines.basic_actions");
        actions_normal_attack = register((String) "actions_normal_attack", InputUtil.Type.MOUSE, 0, "category.leylines.basic_actions");
        actions_elemental_skill = register((String) "actions_elemental_skill", InputUtil.Type.KEYSYM, 69, "category.leylines.basic_actions");
        actions_elemental_burst = register((String) "actions_elemental_burst", InputUtil.Type.KEYSYM, 81, "category.leylines.basic_actions");
        actions_sprint = register((String) "actions_sprint", InputUtil.Type.KEYSYM, 340, "category.leylines.basic_actions");
        actions_sprint_alt = register((String) "actions_sprint_alt", InputUtil.Type.MOUSE, 1, "category.leylines.basic_actions");
        actions_switch_aiming = register((String) "actions_switch_aiming", InputUtil.Type.KEYSYM, 82, "category.leylines.basic_actions");
        actions_jump = register((String) "actions_jump", InputUtil.Type.KEYSYM, 32, "category.leylines.basic_actions");
        actions_drop = register((String) "actions_drop", InputUtil.Type.KEYSYM, 88, "category.leylines.basic_actions");
        actions_pickup_interact = register((String) "actions_pickup_interact", InputUtil.Type.KEYSYM, 70, "category.leylines.basic_actions");
        actions_quickuse_gadget = register((String) "actions_quickuse_gadget", InputUtil.Type.KEYSYM, 90, "category.leylines.basic_actions");
        actions_gadget_quickswap = register((String) "actions_gadget_quickswap", InputUtil.Type.KEYSYM, 90, "category.leylines.basic_actions"); //Hold
        actions_interaction_gameplay = register((String) "actions_interaction_gameplay", InputUtil.Type.KEYSYM, 84, "category.leylines.basic_actions");
        actions_quest_navigation = register((String) "actions_quest_navigation", InputUtil.Type.KEYSYM, 86, "category.leylines.basic_actions");
        actions_show_quest_objective = register((String) "actions_show_quest_objective", InputUtil.Type.KEYSYM, 86, "category.leylines.basic_actions"); //Hold
        actions_abandon_challenge = register((String) "actions_abandon_challenge", InputUtil.Type.KEYSYM, 80, "category.leylines.basic_actions");
        actions_party_slot_1 = register((String) "actions_party_slot_1", InputUtil.Type.KEYSYM, 49, "category.leylines.basic_actions");
        actions_party_slot_2 = register((String) "actions_party_slot_2", InputUtil.Type.KEYSYM, 50, "category.leylines.basic_actions");
        actions_party_slot_3 = register((String) "actions_party_slot_3", InputUtil.Type.KEYSYM, 51, "category.leylines.basic_actions");
        actions_party_slot_4 = register((String) "actions_party_slot_4", InputUtil.Type.KEYSYM, 52, "category.leylines.basic_actions");
        actions_party_slot_5 = register((String) "actions_party_slot_5", InputUtil.Type.KEYSYM, 53, "category.leylines.basic_actions");
        //Switch burst alt + party slot
        actions_open_shortcut_wheel = register((String) "actions_open_shortcut_wheel", InputUtil.Type.KEYSYM, 258, "category.leylines.basic_actions");

        //Menus
        menus_open_inventory = register((String) "menus_open_inventory", InputUtil.Type.KEYSYM, 66, "category.leylines.basic_menus");
        menus_open_character_screen = register((String) "menus_open_character_screen", InputUtil.Type.KEYSYM, 67, "category.leylines.basic_menus");
        menus_open_map = register((String) "menus_open_map", InputUtil.Type.KEYSYM, 77, "category.leylines.basic_menus");
        menus_open_paimon_menu = register((String) "menus_open_paimon_menu", InputUtil.Type.KEYSYM, 256, "category.leylines.basic_menus");
        menus_open_adventurers_handbook = register((String) "menus_open_adventurers_handbook", InputUtil.Type.KEYSYM, 290, "category.leylines.basic_menus");
        menus_open_coop_screen = register((String) "menus_open_coop_screen", InputUtil.Type.KEYSYM, 291, "category.leylines.basic_menus");
        menus_open_wish_screen = register((String) "menus_open_wish_screen", InputUtil.Type.KEYSYM, 292, "category.leylines.basic_menus");
        menus_open_battle_pass_screen = register((String) "menus_open_battle_pass_screen", InputUtil.Type.KEYSYM, 293, "category.leylines.basic_menus");
        menus_open_events_menu = register((String) "menus_open_events_menu", InputUtil.Type.KEYSYM, 294, "category.leylines.basic_menus");
        menus_open_settings_menu = register((String) "menus_open_settings_menu", InputUtil.Type.KEYSYM, 295, "category.leylines.basic_menus"); //Serenitea Pot/The Cat's Tail
        menus_open_popular_miliastra_wonderland_menu = register((String) "menus_open_popular_miliastra_wonderland_menu", InputUtil.Type.KEYSYM, 295, "category.leylines.basic_menus");
        menus_open_furnishing_screen = register((String) "menus_open_furnishing_screen", InputUtil.Type.KEYSYM, 296, "category.leylines.basic_menus");
        menus_open_stellar_reunion = register((String) "menus_open_stellar_reunion", InputUtil.Type.KEYSYM, 297, "category.leylines.basic_menus");
        menus_open_quest_menu = register((String) "menus_open_quest_menu", InputUtil.Type.KEYSYM, 74, "category.leylines.basic_menus");
        menus_open_notification_details = register((String) "menus_open_notification_details", InputUtil.Type.KEYSYM, 89, "category.leylines.basic_menus");
        menus_open_chat_screen = register((String) "menus_open_chat_screen", InputUtil.Type.KEYSYM, 257, "category.leylines.basic_menus");
        menus_open_special_environment_information = register((String) "menus_open_special_environment_information", InputUtil.Type.KEYSYM, 85, "category.leylines.basic_menus");
        menus_check_tutorial_details = register((String) "menus_check_tutorial_details", InputUtil.Type.KEYSYM, 71, "category.leylines.basic_menus");
        menus_elemental_sight = register((String) "menus_elemental_sight", InputUtil.Type.MOUSE, 2, "category.leylines.basic_menus");
        menus_show_cursor = register((String) "menus_show_cursor", InputUtil.Type.KEYSYM, 342, "category.leylines.basic_menus");
        menus_open_party_setup_screen = register((String) "menus_open_party_setup_screen", InputUtil.Type.KEYSYM, 76, "category.leylines.basic_menus");
        menus_open_friends_screen = register((String) "menus_open_friends_screen", InputUtil.Type.KEYSYM, 79, "category.leylines.basic_menus");
        menus_hide_ui = register((String) "menus_hide_ui", InputUtil.Type.KEYSYM, 92, "category.leylines.basic_menus");

        //Miliastra Wonderland
        //General Controls
        general_move_forward = register((String) "general_move_forward", InputUtil.Type.KEYSYM, 87, "category.leylines.miliastra_general");
        general_move_backward = register((String) "general_move_backward", InputUtil.Type.KEYSYM, 83, "category.leylines.miliastra_general");
        general_move_left = register((String) "general_move_left", InputUtil.Type.KEYSYM, 85, "category.leylines.miliastra_general");
        general_move_right = register((String) "general_move_right", InputUtil.Type.KEYSYM, 68, "category.leylines.miliastra_general");
        general_switch_walk_run = register((String) "general_switch_walk_run", InputUtil.Type.KEYSYM, 341, "category.leylines.miliastra_general");
        general_sprint = register((String) "general_sprint", InputUtil.Type.KEYSYM, 340, "category.leylines.miliastra_general");
        general_sprint_alt = register((String) "general_sprint_alt", InputUtil.Type.MOUSE, 1, "category.leylines.miliastra_general");
        general_jump = register((String) "general_jump", InputUtil.Type.KEYSYM, 32, "category.leylines.miliastra_general");
        general_drop = register((String) "general_drop", InputUtil.Type.KEYSYM, 88, "category.leylines.miliastra_general");
        general_open_paimon_menu = register((String) "general_open_paimon_menu", InputUtil.Type.KEYSYM, 256, "category.leylines.miliastra_general");
        general_open_chat_screen = register((String) "general_open_chat_screen", InputUtil.Type.KEYSYM, 257, "category.leylines.miliastra_general");
        general_show_cursor = register((String) "general_show_cursor", InputUtil.Type.KEYSYM, 342, "category.leylines.miliastra_general");
        general_hide_ui = register((String) "general_hide_ui", InputUtil.Type.KEYSYM, 92, "category.leylines.miliastra_general");
        general_open_shortcut_wheel = register((String) "general_open_shortcut_wheel", InputUtil.Type.KEYSYM, 258, "category.leylines.miliastra_general");
        general_enable_microphone = register((String) "general_enable_microphone", InputUtil.Type.KEYSYM, 78, "category.leylines.miliastra_general");
        general_voice_chat_settings = register((String) "general_voice_chat_settings", InputUtil.Type.KEYSYM, -1, "category.leylines.miliastra_general");

        //Lobby Controls
        lobby_pickup_interact = register((String) "lobby_pickup_interact", InputUtil.Type.KEYSYM, 70, "category.leylines.miliastra_lobby");
        lobby_interaction_gameplay_mode_1 = register((String) "lobby_interaction_gameplay_mode_1", InputUtil.Type.KEYSYM, 69, "category.leylines.miliastra_lobby");
        lobby_interaction_gameplay_mode_2 = register((String) "lobby_interaction_gameplay_mode_2", InputUtil.Type.KEYSYM, 84, "category.leylines.miliastra_lobby");
        lobby_open_expression_screen = register((String) "lobby_open_expression_screen", InputUtil.Type.KEYSYM, 86, "category.leylines.miliastra_lobby");
        lobby_view_favorited_wonderlands = register((String) "lobby_view_favorited_wonderlands", InputUtil.Type.KEYSYM, 66, "category.leylines.miliastra_lobby");
        lobby_open_cosmetic_plans = register((String) "lobby_open_cosmetic_plans", InputUtil.Type.KEYSYM, 67, "category.leylines.miliastra_lobby");
        lobby_open_map = register((String) "lobby_open_map", InputUtil.Type.KEYSYM, 77, "category.leylines.miliastra_lobby");
        lobby_open_gameplay_guide = register((String) "lobby_open_gameplay_guide", InputUtil.Type.KEYSYM, 290, "category.leylines.miliastra_lobby");
        lobby_open_lobby_screen = register((String) "lobby_open_lobby_screen", InputUtil.Type.KEYSYM, 291, "category.leylines.miliastra_lobby");
        lobby_open_odes_screen = register((String) "lobby_open_odes_screen", InputUtil.Type.KEYSYM, 292, "category.leylines.miliastra_lobby");
        lobby_open_miliastra_pass_screen = register((String) "lobby_open_miliastra_pass_screen", InputUtil.Type.KEYSYM, 293, "category.leylines.miliastra_lobby");
        lobby_open_my_miliastra_wonderland = register((String) "lobby_open_my_miliastra_wonderland", InputUtil.Type.KEYSYM, 294, "category.leylines.miliastra_lobby");
        lobby_open_popular_miliastra_wonderlands = register((String) "lobby_open_popular_miliastra_wonderlands", InputUtil.Type.KEYSYM, 295, "category.leylines.miliastra_lobby");
        lobby_open_stellar_reunion = register((String) "lobby_open_stellar_reunion", InputUtil.Type.KEYSYM, 297, "category.leylines.miliastra_lobby");
        lobby_open_quest_menu = register((String) "lobby_open_quest_menu", InputUtil.Type.KEYSYM, 74, "category.leylines.miliastra_lobby");
        lobby_open_notification_menu = register((String) "lobby_open_notification_menu", InputUtil.Type.KEYSYM, 89, "category.leylines.miliastra_lobby");
        lobby_open_party_screen = register((String) "lobby_open_party_screen", InputUtil.Type.KEYSYM, 76, "category.leylines.miliastra_lobby");
        lobby_open_friends_screen = register((String) "lobby_open_friends_screen", InputUtil.Type.KEYSYM, 79, "category.leylines.miliastra_lobby");
        lobby_matchmaking = register((String) "lobby_matchmaking", InputUtil.Type.KEYSYM, 80, "category.leylines.miliastra_lobby");
        lobby_open_switch_character_page = register((String) "lobby_open_switch_character_page", InputUtil.Type.KEYSYM, 73, "category.leylines.miliastra_lobby");
        lobby_quickuse_gadget = register((String) "lobby_quickuse_gadget", InputUtil.Type.KEYSYM, 90, "category.leylines.miliastra_lobby");

        //Wonderland Controls: Wonderland/General
        wonderland_general_pickup_interact = register((String) "wonderland_general_pickup_interact", InputUtil.Type.KEYSYM, 70, "category.leylines.miliastra_wonderland_general");
        wonderland_general_open_inventory_interface = register((String) "wonderland_general_open_inventory_interface", InputUtil.Type.KEYSYM, 66, "category.leylines.miliastra_wonderland_general");
        wonderland_general_open_equipment_interface = register((String) "wonderland_general_open_equipment_interface", InputUtil.Type.KEYSYM, 67, "category.leylines.miliastra_wonderland_general");
        wonderland_general_open_map_interface = register((String) "wonderland_general_open_map_interface", InputUtil.Type.KEYSYM, 77, "category.leylines.miliastra_wonderland_general");
        wonderland_general_open_gift_box_interface = register((String) "wonderland_general_open_gift_box_interface", InputUtil.Type.KEYSYM, 290, "category.leylines.miliastra_wonderland_general");
        wonderland_general_open_deck_selector = register((String) "wonderland_general_open_deck_selector", InputUtil.Type.KEYSYM, 291, "category.leylines.miliastra_wonderland_general");
        wonderland_general_open_wonderland_task_interface = register((String) "wonderland_general_open_wonderland_task_interface", InputUtil.Type.KEYSYM, 292, "category.leylines.miliastra_wonderland_general");

        //Wonderland Controls: Wonderland/Classic Mode
        wonderland_classic_normal_attack = register((String) "wonderland_classic_normal_attack", InputUtil.Type.MOUSE, 0, "category.leylines.miliastra_wonderland_classic");
        wonderland_classic_elemental_skill = register((String) "wonderland_classic_elemental_skill", InputUtil.Type.KEYSYM, 69, "category.leylines.miliastra_wonderland_classic");
        wonderland_classic_elemental_burst = register((String) "wonderland_classic_elemental_burst", InputUtil.Type.KEYSYM, 81, "category.leylines.miliastra_wonderland_classic");
        wonderland_classic_character_skill_1 = register((String) "wonderland_classic_character_skill_1", InputUtil.Type.KEYSYM, 90, "category.leylines.miliastra_wonderland_classic");
        wonderland_classic_character_skill_2 = register((String) "wonderland_classic_character_skill_2", InputUtil.Type.KEYSYM, 71, "category.leylines.miliastra_wonderland_classic");
        wonderland_classic_switch_aiming = register((String) "wonderland_classic_switch_aiming", InputUtil.Type.KEYSYM, 82, "category.leylines.miliastra_wonderland_classic");
        wonderland_classic_interaction_gameplay = register((String) "wonderland_classic_interaction_gameplay", InputUtil.Type.KEYSYM, 84, "category.leylines.miliastra_wonderland_classic");
        wonderland_classic_party_slot_1 = register((String) "wonderland_classic_party_slot_1", InputUtil.Type.KEYSYM, 49, "category.leylines.miliastra_wonderland_classic");
        wonderland_classic_party_slot_2 = register((String) "wonderland_classic_party_slot_2", InputUtil.Type.KEYSYM, 50, "category.leylines.miliastra_wonderland_classic");
        wonderland_classic_party_slot_3 = register((String) "wonderland_classic_party_slot_3", InputUtil.Type.KEYSYM, 51, "category.leylines.miliastra_wonderland_classic");
        wonderland_classic_party_slot_4 = register((String) "wonderland_classic_party_slot_4", InputUtil.Type.KEYSYM, 52, "category.leylines.miliastra_wonderland_classic");
        //Switch burst alt + party slot

        //Wonderland Controls: Wonderland/Beyond Mode
        wonderland_beyond_normal_attack = register((String) "wonderland_beyond_normal_attack", InputUtil.Type.MOUSE, 0, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_character_skill_1 = register((String) "wonderland_beyond_character_skill_1", InputUtil.Type.KEYSYM, 69, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_character_skill_2 = register((String) "wonderland_beyond_character_skill_2", InputUtil.Type.KEYSYM, 81, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_character_skill_3 = register((String) "wonderland_beyond_character_skill_3", InputUtil.Type.KEYSYM, 82, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_character_skill_4 = register((String) "wonderland_beyond_character_skill_4", InputUtil.Type.KEYSYM, 84, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_1 = register((String) "wonderland_beyond_craftsperson_keymap_1", InputUtil.Type.KEYSYM, 49, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_2 = register((String) "wonderland_beyond_craftsperson_keymap_2", InputUtil.Type.KEYSYM, 50, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_3 = register((String) "wonderland_beyond_craftsperson_keymap_3", InputUtil.Type.KEYSYM, 51, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_4 = register((String) "wonderland_beyond_craftsperson_keymap_4", InputUtil.Type.KEYSYM, 52, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_5 = register((String) "wonderland_beyond_craftsperson_keymap_5", InputUtil.Type.KEYSYM, 53, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_6 = register((String) "wonderland_beyond_craftsperson_keymap_6", InputUtil.Type.KEYSYM, 54, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_7 = register((String) "wonderland_beyond_craftsperson_keymap_7", InputUtil.Type.KEYSYM, 55, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_8 = register((String) "wonderland_beyond_craftsperson_keymap_8", InputUtil.Type.KEYSYM, 56, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_9 = register((String) "wonderland_beyond_craftsperson_keymap_9", InputUtil.Type.KEYSYM, 59, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_10 = register((String) "wonderland_beyond_craftsperson_keymap_10", InputUtil.Type.KEYSYM, 48, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_11 = register((String) "wonderland_beyond_craftsperson_keymap_11", InputUtil.Type.KEYSYM, 85, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_12 = register((String) "wonderland_beyond_craftsperson_keymap_12", InputUtil.Type.KEYSYM, 90, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_13 = register((String) "wonderland_beyond_craftsperson_keymap_13", InputUtil.Type.KEYSYM, 89, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_14 = register((String) "wonderland_beyond_craftsperson_keymap_14", InputUtil.Type.KEYSYM, 71, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_15 = register((String) "wonderland_beyond_craftsperson_keymap_15", InputUtil.Type.KEYSYM, 72, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_16 = register((String) "wonderland_beyond_craftsperson_keymap_16", InputUtil.Type.KEYSYM, 73, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_17 = register((String) "wonderland_beyond_craftsperson_keymap_17", InputUtil.Type.KEYSYM, 79, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_18 = register((String) "wonderland_beyond_craftsperson_keymap_18", InputUtil.Type.KEYSYM, 80, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_19 = register((String) "wonderland_beyond_craftsperson_keymap_19", InputUtil.Type.KEYSYM, 74, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_20 = register((String) "wonderland_beyond_craftsperson_keymap_20", InputUtil.Type.KEYSYM, 75, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_21 = register((String) "wonderland_beyond_craftsperson_keymap_21", InputUtil.Type.KEYSYM, 76, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_22 = register((String) "wonderland_beyond_craftsperson_keymap_22", InputUtil.Type.KEYSYM, 86, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_23 = register((String) "wonderland_beyond_craftsperson_keymap_23", InputUtil.Type.KEYSYM, 294, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_24 = register((String) "wonderland_beyond_craftsperson_keymap_24", InputUtil.Type.KEYSYM, 295, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_25 = register((String) "wonderland_beyond_craftsperson_keymap_25", InputUtil.Type.KEYSYM, 296, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_26 = register((String) "wonderland_beyond_craftsperson_keymap_26", InputUtil.Type.KEYSYM, 297, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_27 = register((String) "wonderland_beyond_craftsperson_keymap_27", InputUtil.Type.KEYSYM, 298, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_28 = register((String) "wonderland_beyond_craftsperson_keymap_28", InputUtil.Type.KEYSYM, 299, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_29 = register((String) "wonderland_beyond_craftsperson_keymap_29", InputUtil.Type.KEYSYM, 39, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_30 = register((String) "wonderland_beyond_craftsperson_keymap_30", InputUtil.Type.KEYSYM, 45, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_31 = register((String) "wonderland_beyond_craftsperson_keymap_31", InputUtil.Type.KEYSYM, 61, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_32 = register((String) "wonderland_beyond_craftsperson_keymap_32", InputUtil.Type.KEYSYM, 91, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_33 = register((String) "wonderland_beyond_craftsperson_keymap_33", InputUtil.Type.KEYSYM, 44, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_34 = register((String) "wonderland_beyond_craftsperson_keymap_34", InputUtil.Type.KEYSYM, 46, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_35 = register((String) "wonderland_beyond_craftsperson_keymap_35", InputUtil.Type.KEYSYM, 47, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_36 = register((String) "wonderland_beyond_craftsperson_keymap_36", InputUtil.Type.KEYSYM, 265, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_37 = register((String) "wonderland_beyond_craftsperson_keymap_37", InputUtil.Type.KEYSYM, 264, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_38 = register((String) "wonderland_beyond_craftsperson_keymap_38", InputUtil.Type.KEYSYM, 263, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_39 = register((String) "wonderland_beyond_craftsperson_keymap_39", InputUtil.Type.KEYSYM, 262, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_40 = register((String) "wonderland_beyond_craftsperson_keymap_40", InputUtil.Type.KEYSYM, 345, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_41 = register((String) "wonderland_beyond_craftsperson_keymap_41", InputUtil.Type.KEYSYM, 344, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_42 = register((String) "wonderland_beyond_craftsperson_keymap_42", InputUtil.Type.KEYSYM, 259, "category.leylines.miliastra_wonderland_beyond");
        wonderland_beyond_craftsperson_keymap_43 = register((String) "wonderland_beyond_craftsperson_keymap_43", InputUtil.Type.KEYSYM, 280, "category.leylines.miliastra_wonderland_beyond");
    }
}
