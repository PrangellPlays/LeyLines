package dev.lumi.leylines.network.payload;

import dev.lumi.leylines.LeyLines;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;

public record PartySwapPayload(int slot) implements CustomPayload {
    public static final Identifier ID = LeyLines.id("party_swap");
    public static final CustomPayload.Id<PartySwapPayload> PAYLOAD_ID = new CustomPayload.Id<>(ID);
    public static final PacketCodec<RegistryByteBuf, PartySwapPayload> CODEC = PacketCodec.of((payload, buf) -> buf.writeInt(payload.slot()), buf -> new PartySwapPayload(buf.readInt()));

    @Override
    public Id<? extends CustomPayload> getId() {
        return PAYLOAD_ID;
    }

    public static void write(PacketByteBuf buf, PartySwapPayload payload) {
        buf.writeInt(payload.slot);
    }

    public static PartySwapPayload read(PacketByteBuf buf) {
        return new PartySwapPayload(buf.readInt());
    }
}
