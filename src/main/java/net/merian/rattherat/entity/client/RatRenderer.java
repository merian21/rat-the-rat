package net.merian.rattherat.entity.client;

import net.merian.rattherat.RatTheRat;
import net.merian.rattherat.entity.custom.RatEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class RatRenderer extends MobEntityRenderer<RatEntity, RatModel<RatEntity>> {
    private static final Identifier TEXTURE = new Identifier(RatTheRat.MOD_ID, "textures/entity/rat.png");

    public RatRenderer(EntityRendererFactory.Context context) {
        super(context, new RatModel<>(context.getPart(ModModelLayers.RAT)), 0.6f);
    }

    @Override
    public Identifier getTexture(RatEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(RatEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        if (mobEntity.isBaby()) {
            matrixStack.scale(0.5f,0.5f,0.5f);
        } else {
            matrixStack.scale(1f,1f,1f);

        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
