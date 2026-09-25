package dev.lumi.leylines.client.renderer;

import net.minecraft.block.SkullBlock;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.SkullBlockEntityModel;
import net.minecraft.client.render.block.entity.SkullBlockEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

import java.util.Map;

public class PlayerHeadRenderer {
    private PlayerHeadRenderer() {
    }

    public static void render(DrawContext context, Identifier texture, int x, int y, int size, float scaleMultiplier) {
        MinecraftClient client = MinecraftClient.getInstance();
        Map<SkullBlock.SkullType, SkullBlockEntityModel> models = SkullBlockEntityRenderer.getModels(client.getEntityModelLoader());
        SkullBlockEntityModel model = models.get(SkullBlock.Type.PLAYER);

        if (model == null) {
            return;
        }

        MatrixStack matrices = context.getMatrices();
        VertexConsumerProvider.Immediate consumers = context.getVertexConsumers();
        matrices.push();

        matrices.translate(x + size / 2.0F, y + size, 100.0F);
        float scale = (size / 8.0F) * scaleMultiplier;
        matrices.scale(scale, -scale, scale);

        float yaw = 225.0F;
        RenderLayer layer = RenderLayer.getEntityCutoutNoCull(texture);
        SkullBlockEntityRenderer.renderSkull(null, yaw, 0.0F, matrices, consumers, 15728880, model, layer);
        consumers.draw();
        matrices.pop();
    }
}
