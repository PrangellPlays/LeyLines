package dev.lumi.leylines.network.payload;

import dev.lumi.leylines.LeyLines;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;

public record StartGlidingPayload() implements CustomPayload {
    public static final Identifier ID = LeyLines.id("start_gliding");
    public static final Id<StartGlidingPayload> PAYLOAD_ID = new Id<>(ID);
    public static final PacketCodec<RegistryByteBuf, StartGlidingPayload> CODEC = PacketCodec.unit(new StartGlidingPayload());

    @Override
    public Id<? extends CustomPayload> getId() {
        return PAYLOAD_ID;
    }
}
