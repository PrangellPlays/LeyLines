package dev.lumi.leylines.item.weapon.util;

import dev.lumi.leylines.item.util.tooltip.LeyLinesTooltipItem;
import dev.lumi.leylines.item.util.tooltip.WeaponTooltipData;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class LeyLinesWeaponItem extends Item implements LeyLinesTooltipItem {
    private final ILeyLinesWeaponType weaponType;
    private final ILeyLinesWeaponRarity weaponRarity;

    private final int baseAttack;
    private final String secondaryName;
    private final String secondaryValue;
    private final String passiveName;
    private final String passiveDescription;

    public LeyLinesWeaponItem(ILeyLinesWeaponType weaponType, ILeyLinesWeaponRarity weaponRarity, int attack, String secondary, String secondaryValue, String passive, String passiveDescription, Settings settings) {
        super(settings);

        this.weaponType = weaponType;
        this.weaponRarity = weaponRarity;

        this.baseAttack = attack;
        this.secondaryName = secondary;
        this.secondaryValue = secondaryValue;
        this.passiveName = passive;
        this.passiveDescription = passiveDescription;
    }

    public ILeyLinesWeaponType getWeaponType() {
        return weaponType;
    }

    public ILeyLinesWeaponRarity getWeaponRarity() {
        return weaponRarity;
    }

    public int getStars() {
        return weaponRarity.getStars();
    }

    public int getBaseAttack(){
        return baseAttack;
    }

    public String getSecondaryName(){
        return secondaryName;
    }

    public String getSecondaryValue(){
        return secondaryValue;
    }

    public String getPassiveName(){
        return passiveName;
    }

    public String getPassiveDescription(){
        return passiveDescription;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(weaponRarity.getStarText());
        tooltip.add(weaponType.getDisplayName());
    }

    @Override
    public List<Text> getTooltip(ItemStack stack) {
        WeaponTooltipData data = WeaponTooltipData.of(this);


        return List.of(
                Text.literal(data.name()), data.weaponRarity().getStarText(),
                Text.literal(data.weaponType().getDisplayName().getString()),
                Text.literal("Base ATK " + data.attack()),
                Text.literal(data.secondaryName()),
                Text.literal(data.secondaryValue()),
                Text.literal(data.passiveName()),
                Text.literal(data.passiveDescription())
        );
    }
}
