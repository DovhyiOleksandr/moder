// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelы1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "ы1"),
			"main");
	private final ModelPart Head;

	public Modelы1(ModelPart root) {
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 10)
						.addBox(-7.0F, -6.0F, -6.5F, 14.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -6.0F, -2.5F, 14.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(24, 28)
						.addBox(-4.0F, -9.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(58, 33)
						.addBox(-5.0F, -8.5F, -5.0F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 21)
						.addBox(-5.0F, -8.5F, 4.0F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 56)
						.addBox(4.0F, -8.5F, -4.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(48, 33)
						.addBox(-5.0F, -8.5F, -4.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(-1.0F, -7.25F, -5.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 37)
						.addBox(-5.0F, -7.75F, -5.25F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 25)
						.addBox(-5.0F, -7.75F, 4.25F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 31)
						.addBox(-0.5F, -8.25F, -5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 37)
						.addBox(-5.25F, -7.75F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(36, 10)
						.addBox(4.25F, -7.75F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}