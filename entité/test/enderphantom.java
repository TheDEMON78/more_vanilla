// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class enderphantom extends EntityModel<Entity> {
	private final ModelRenderer bb_main;

	public enderphantom() {
		texWidth = 64;
		texHeight = 64;

		bb_main = new ModelRenderer(this);
		bb_main.setPos(0.0F, 24.0F, 0.0F);
		bb_main.texOffs(23, 12).addBox(-8.5F, -7.0F, -8.0F, 6.0F, 2.0F, 9.0F, 0.0F, true);
		bb_main.texOffs(0, 8).addBox(-2.5F, -7.0F, -8.0F, 5.0F, 3.0F, 9.0F, 0.0F, false);
		bb_main.texOffs(0, 0).addBox(-3.5F, -5.75F, -13.0F, 7.0F, 3.0F, 5.0F, 0.0F, false);
		bb_main.texOffs(23, 12).addBox(2.5F, -7.0F, -8.0F, 6.0F, 2.0F, 9.0F, 0.0F, false);
		bb_main.texOffs(16, 24).addBox(8.5F, -7.0F, -8.0F, 13.0F, 1.0F, 9.0F, 0.0F, false);
		bb_main.texOffs(16, 24).addBox(-21.5F, -7.0F, -8.0F, 13.0F, 1.0F, 9.0F, 0.0F, true);
		bb_main.texOffs(3, 20).addBox(-1.5F, -7.0F, 1.0F, 3.0F, 2.0F, 6.0F, 0.0F, false);
		bb_main.texOffs(4, 29).addBox(-0.5F, -6.5F, 7.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}