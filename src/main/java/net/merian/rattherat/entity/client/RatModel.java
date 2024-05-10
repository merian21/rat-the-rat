package net.merian.rattherat.entity.client;

import net.merian.rattherat.entity.custom.RatEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;

// Made with Blockbench 4.10.0
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class RatModel<T extends RatEntity> extends SinglePartEntityModel<T> {
	private final ModelPart rat;

	public RatModel(ModelPart root) {
		this.rat = root.getChild("rat");

	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData rat = modelPartData.addChild("rat", ModelPartBuilder.create().uv(0, 0).cuboid(-10.4601F, -4.3889F, -0.7992F, 8.0F, 5.0F, 18.0F, new Dilation(0.0F)), ModelTransform.pivot(6.4601F, 21.3889F, -10.2008F));

		ModelPartData head = rat.addChild("head", ModelPartBuilder.create().uv(12, 0).cuboid(1.25F, -4.75F, 2.25F, 2.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(14, 23).cuboid(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 12).cuboid(-3.25F, -4.75F, 2.25F, 2.0F, 3.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 23).cuboid(-1.0F, 0.0F, -5.5F, 2.0F, 2.0F, 3.0F, new Dilation(0.0F))
		.uv(12, 3).cuboid(1.0F, -2.5F, -3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(11, 11).cuboid(-2.0F, -2.5F, -3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-6.4601F, -1.3889F, -3.7992F));

		ModelPartData leg3 = rat.addChild("leg3", ModelPartBuilder.create(), ModelTransform.pivot(-3.4601F, 0.8611F, 16.9508F));

		ModelPartData cube_r1 = leg3.addChild("cube_r1", ModelPartBuilder.create().uv(0, 8).cuboid(-1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-7.25F, 0.0F, 3.25F, -0.1742F, -0.3902F, -0.2716F));

		ModelPartData cube_r2 = leg3.addChild("cube_r2", ModelPartBuilder.create().uv(8, 2).cuboid(-1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-8.0F, 0.25F, 3.0F, 0.0F, -0.9371F, -0.3927F));

		ModelPartData cube_r3 = leg3.addChild("cube_r3", ModelPartBuilder.create().uv(8, 6).cuboid(-1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-6.25F, -0.25F, 3.5F, -0.1742F, -0.0847F, -0.2716F));

		ModelPartData cube_r4 = leg3.addChild("cube_r4", ModelPartBuilder.create().uv(0, 12).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-6.0F, 0.0F, 0.0F, 0.0F, -0.4363F, -0.4363F));

		ModelPartData leg1 = rat.addChild("leg1", ModelPartBuilder.create(), ModelTransform.of(0.0F, 0.0F, 0.0F, -2.0944F, 1.309F, -2.1118F));

		ModelPartData cube_r5 = leg1.addChild("cube_r5", ModelPartBuilder.create().uv(6, 2).cuboid(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.3193F, 0.2132F, 0.5546F, -0.1742F, 0.3902F, 0.2716F));

		ModelPartData cube_r6 = leg1.addChild("cube_r6", ModelPartBuilder.create().uv(6, 6).cuboid(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.8974F, 0.4525F, 0.0919F, 0.0F, 0.9371F, 0.3927F));

		ModelPartData cube_r7 = leg1.addChild("cube_r7", ModelPartBuilder.create().uv(0, 6).cuboid(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-0.5705F, -0.6385F, -1.5989F, 0.0F, 0.4363F, 0.4363F));

		ModelPartData cube_r8 = leg1.addChild("cube_r8", ModelPartBuilder.create().uv(6, 0).cuboid(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-0.6462F, -0.0272F, 0.9525F, -0.1742F, 0.0847F, 0.2716F));

		ModelPartData leg4 = rat.addChild("leg4", ModelPartBuilder.create(), ModelTransform.of(-12.9202F, 0.0F, 0.0F, -2.0944F, -1.309F, 2.1118F));

		ModelPartData cube_r9 = leg4.addChild("cube_r9", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.1261F, 0.0892F, 0.7448F, -0.1742F, -0.3902F, -0.2716F));

		ModelPartData cube_r10 = leg4.addChild("cube_r10", ModelPartBuilder.create().uv(0, 2).cuboid(-1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-0.6239F, 0.3392F, 0.4948F, 0.0F, -0.9371F, -0.3927F));

		ModelPartData cube_r11 = leg4.addChild("cube_r11", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(1.3761F, 0.0892F, -2.5052F, 0.0F, -0.4363F, -0.4363F));

		ModelPartData cube_r12 = leg4.addChild("cube_r12", ModelPartBuilder.create().uv(0, 6).cuboid(-1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(1.1261F, -0.1608F, 0.9948F, -0.1742F, -0.0847F, -0.2716F));

		ModelPartData leg = rat.addChild("leg", ModelPartBuilder.create(), ModelTransform.pivot(-6.4601F, -0.8889F, 26.2008F));

		ModelPartData cube_r13 = leg.addChild("cube_r13", ModelPartBuilder.create().uv(20, 33).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, 1.75F, -9.25F, 0.0F, 0.4363F, 0.4363F));

		ModelPartData toe = leg.addChild("toe", ModelPartBuilder.create(), ModelTransform.pivot(-3.0F, 1.75F, -9.25F));

		ModelPartData cube_r14 = toe.addChild("cube_r14", ModelPartBuilder.create().uv(8, 0).cuboid(0.0F, 0.0F, -1.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(6.25F, -0.25F, 3.5F, -0.1742F, 0.0847F, 0.2716F));

		ModelPartData cube_r15 = toe.addChild("cube_r15", ModelPartBuilder.create().uv(6, 8).cuboid(0.0F, 0.0F, -1.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(7.25F, 0.0F, 3.25F, -0.1742F, 0.3902F, 0.2716F));

		ModelPartData cube_r16 = toe.addChild("cube_r16", ModelPartBuilder.create().uv(8, 8).cuboid(0.0F, 0.0F, -1.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(8.0F, 0.25F, 3.0F, 0.0F, 0.9371F, 0.3927F));

		ModelPartData tail = rat.addChild("tail", ModelPartBuilder.create(), ModelTransform.pivot(-6.4601F, 0.6111F, 8.2008F));

		ModelPartData cube_r17 = tail.addChild("cube_r17", ModelPartBuilder.create().uv(0, 23).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 17.5F, -0.1309F, 0.0F, 0.0F));

		ModelPartData tail_r1 = tail.addChild("tail_r1", ModelPartBuilder.create().uv(29, 24).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -3.0F, 9.0F, -0.1745F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(RatEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		rat.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return rat;
	}
}