package dev.lumi.leylines.client;

import dev.lumi.leylines.LeyLines;
import dev.lumi.leylines.index.LeyLinesItemGroups;
import dev.lumi.leylines.index.LeyLinesItems;
import dev.lumi.leylines.item.weapon.util.ILeyLinesWeaponRarity;
import dev.lumi.leylines.item.weapon.util.ILeyLinesWeaponType;
import dev.lumi.leylines.access.CreativeScreenAccessor;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.minecraft.client.gui.Element;
import net.minecraft.client.gui.screen.ingame.CreativeInventoryScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.ClickableWidget;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class LeyLinesCreativeScreen {
    private static final Identifier FILTER_BASE_UNSELECTED = LeyLines.id("textures/gui/filters/filter_base_unselected.png");
    private static final Identifier FILTER_BASE_SELECTED = LeyLines.id("textures/gui/filters/filter_base_selected.png");
    private static final Identifier FILTER_ONE_STAR = LeyLines.id("textures/gui/filters/filter_1_star.png");
    private static final Identifier FILTER_TWO_STAR = LeyLines.id("textures/gui/filters/filter_2_star.png");
    private static final Identifier FILTER_THREE_STAR = LeyLines.id("textures/gui/filters/filter_3_star.png");
    private static final Identifier FILTER_FOUR_STAR = LeyLines.id("textures/gui/filters/filter_4_star.png");
    private static final Identifier FILTER_FIVE_STAR = LeyLines.id("textures/gui/filters/filter_5_star.png");

    private LeyLinesCreativeScreen() {
    }

    public static void init() {
        ScreenEvents.AFTER_INIT.register((client, screen, scaledWidth, scaledHeight) -> {
            if (!(screen instanceof CreativeInventoryScreen creative)) {
                return;
            }

            addFilters(creative);
        });
    }

    private static void addFilters(CreativeInventoryScreen screen) {
        CreativeScreenAccessor access = (CreativeScreenAccessor) screen;
        int left = access.leylines$getGuiLeft();
        int top = access.leylines$getGuiTop();

        List<ClickableWidget> filters = new ArrayList<>();
        addWeaponTypeButtons(screen, left - 30, top - 2, filters);
        addRarityButtons(screen, left - 60, top - 2, filters);

        updateVisibility(screen, filters);
        ScreenEvents.afterRender(screen).register((currentScreen, context, mouseX, mouseY, tickDelta) -> {
            updateVisibility(screen, filters);
        });
    }

    private static void updateVisibility(CreativeInventoryScreen screen, List<ClickableWidget> filters) {
        CreativeScreenAccessor access = (CreativeScreenAccessor) screen;
        boolean visible = access.leylines$getSelectedTab() == LeyLinesItemGroups.LEYLINES_WEAPONS_GROUP;

        for (ClickableWidget widget : filters) {
            widget.visible = visible;
        }

        updateAxiomButtonVisibility(screen, visible);
    }

    private static void addWeaponTypeButtons(CreativeInventoryScreen screen, int x, int y, List<ClickableWidget> filters) {
        int index = 0;

        for (ILeyLinesWeaponType type : ILeyLinesWeaponType.values()) {
            ItemStack icon = getWeaponTypeIcon(type);
            LeyLinesFilterButton button = new LeyLinesFilterButton(x, y + index * 28, false, icon, Identifier.of(""), Text.literal(format(type.name())), FILTER_BASE_UNSELECTED, FILTER_BASE_SELECTED, ignored -> {
                LeyLinesWeaponsTabFilter.toggleType(type);
                LeyLinesWeaponsTabFilter.refresh(screen);
                }, () -> LeyLinesWeaponsTabFilter.isTypeSelected(type));

            screen.addDrawableChild(button);
            filters.add(button);
            index++;
        }
    }

    private static void addRarityButtons(CreativeInventoryScreen screen, int x, int y, List<ClickableWidget> filters) {
        int index = 0;

        for (ILeyLinesWeaponRarity rarity : ILeyLinesWeaponRarity.values()) {
            LeyLinesFilterButton button = new LeyLinesFilterButton(x, y + index * 28, true, ItemStack.EMPTY, getRarityTexture(rarity), Text.literal(getStars(rarity)), FILTER_BASE_UNSELECTED, FILTER_BASE_SELECTED, ignored -> {
                LeyLinesWeaponsTabFilter.toggleRarity(rarity);
                LeyLinesWeaponsTabFilter.refresh(screen);
                }, () -> LeyLinesWeaponsTabFilter.isRaritySelected(rarity));

            screen.addDrawableChild(button);
            filters.add(button);
            index++;
        }
    }

    private static String format(String value) {
        String lower = value.toLowerCase();
        return Character.toUpperCase(lower.charAt(0)) + lower.substring(1);
    }

    private static Identifier getRarityTexture(ILeyLinesWeaponRarity rarity) {
        return switch (rarity.name()) {
            case "ONE_STAR" -> FILTER_ONE_STAR;
            case "TWO_STAR" -> FILTER_TWO_STAR;
            case "THREE_STAR" -> FILTER_THREE_STAR;
            case "FOUR_STAR" -> FILTER_FOUR_STAR;
            case "FIVE_STAR" -> FILTER_FIVE_STAR;
            default -> FILTER_BASE_UNSELECTED;
        };
    }

    private static String getStars(ILeyLinesWeaponRarity rarity) {
        return switch (rarity.name()) {
            case "FIVE_STAR" -> Text.translatable("stars.leylines.five").getString();
            case "FOUR_STAR" -> Text.translatable("stars.leylines.four").getString();
            case "THREE_STAR" -> Text.translatable("stars.leylines.three").getString();
            case "TWO_STAR" -> Text.translatable("stars.leylines.two").getString();
            case "ONE_STAR" -> Text.translatable("stars.leylines.one").getString();
            default -> rarity.name();
        };
    }

    private static ItemStack getWeaponTypeIcon(ILeyLinesWeaponType type) {
        return switch (type.name()) {
            case "SWORD" -> new ItemStack(LeyLinesItems.DULL_BLADE);
            case "CLAYMORE" -> new ItemStack(LeyLinesItems.WASTER_GREATSWORD);
            case "POLEARM" -> new ItemStack(LeyLinesItems.BEGINNERS_PROTECTOR);
            case "CATALYST" -> new ItemStack(LeyLinesItems.APPRENTICES_NOTES);
            case "BOW" -> new ItemStack(LeyLinesItems.HUNTERS_BOW);
            default -> new ItemStack(Items.BARRIER);
        };
    }

    private static void updateAxiomButtonVisibility(CreativeInventoryScreen screen, boolean hide) {
        for (Element element : screen.children()) {
            if (!(element instanceof ClickableWidget widget)) {
                continue;
            }

            if (!(widget.getMessage().getContent() instanceof TranslatableTextContent translatable)) {
                continue;
            }

            String key = translatable.getKey();

            if (key.equals("axiom.color_picker") || key.equals("axiom.gradient_helper")) {
                widget.visible = !hide;
            }
        }
    }
}
