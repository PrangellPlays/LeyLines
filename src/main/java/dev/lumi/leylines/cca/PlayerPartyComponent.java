package dev.lumi.leylines.cca;

import dev.lumi.leylines.LeyLines;
import dev.lumi.leylines.index.LeyLinesComponents;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.NbtList;
import net.minecraft.nbt.NbtString;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import org.ladysnake.cca.api.v3.component.sync.AutoSyncedComponent;
import org.ladysnake.cca.api.v3.component.tick.CommonTickingComponent;

public class PlayerPartyComponent implements CommonTickingComponent, AutoSyncedComponent {
    private final PlayerEntity player;
    private final Identifier[] party = new Identifier[4];
    private int activeSlot = 0;

    private static final int MAX_SWITCH_COOLDOWN_TICKS = 20;
    private int switchCooldownTicks = 0;
    private boolean isCooldown;

    public PlayerPartyComponent(PlayerEntity player) {
        this.player = player;

        for (int i = 0; i < 4; i++) {
            party[i] = LeyLines.id("none");
        }
    }

    @Override
    public void tick() {
        if (switchCooldownTicks > 0) --this.switchCooldownTicks;
        if (switchCooldownTicks == 0) this.isCooldown = false;
    }

    public Identifier getActiveCharacter() {
        return party[activeSlot];
    }

    public void setSlot(int slot, Identifier character) {
        if (slot >= 0 && slot < 4) {
            party[slot] = character;
            LeyLinesComponents.PARTY.sync(player);
        }
    }

    public void setActiveSlot(int slot) {
        if (slot < 0 || slot >= 4) return;
        if (this.activeSlot == slot) return;
        if (this.switchCooldownTicks > 0) return;
        if (party[slot].equals(LeyLines.id("none"))) return;

        this.activeSlot = slot;
        this.switchCooldownTicks = MAX_SWITCH_COOLDOWN_TICKS;
        this.isCooldown = true;
        LeyLinesComponents.PARTY.sync(player);
    }

    public int getActiveSlot() {
        return activeSlot;
    }

    public Identifier[] getParty() {
        return party;
    }

    public boolean canSwitchCharacter() {
        return !this.isCooldown;
    }

    public int getSwitchCooldown() {
        return this.switchCooldownTicks;
    }

    public float getSwitchCooldownSeconds() {
        return this.switchCooldownTicks / 20.0f;
    }

    public static int getCharacterSwitchCooldown() {
        return MAX_SWITCH_COOLDOWN_TICKS;
    }

    @Override
    public void readFromNbt(NbtCompound nbtCompound, RegistryWrapper.WrapperLookup wrapperLookup) {
        activeSlot = nbtCompound.getInt("ActiveSlot");
        NbtList partyList = nbtCompound.getList("Party", NbtElement.STRING_TYPE);
        for (int i = 0; i < 4; i++) {
            if (i < partyList.size()) {
                party[i] = Identifier.of(partyList.getString(i));
            } else {
                party[i] = LeyLines.id("none");
            }
        }

        // safety clamp
        if (activeSlot < 0 || activeSlot > 3) {
            activeSlot = 0;
        }

        switchCooldownTicks = nbtCompound.getInt("SwitchCooldownTicks");
        isCooldown = nbtCompound.getBoolean("IsCooldown");
    }

    @Override
    public void writeToNbt(NbtCompound nbtCompound, RegistryWrapper.WrapperLookup wrapperLookup) {
        nbtCompound.putInt("ActiveSlot", activeSlot);
        NbtList partyList = new NbtList();
        for (int i = 0; i < 4; i++) {
            partyList.add(NbtString.of(party[i].toString()));
        }

        nbtCompound.put("Party", partyList);

        nbtCompound.putInt("SwitchCooldownTicks", switchCooldownTicks);
        nbtCompound.putBoolean("IsCooldown", isCooldown);
    }
}
