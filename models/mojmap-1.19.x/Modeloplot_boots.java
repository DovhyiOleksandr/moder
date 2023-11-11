// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeloplot_boots<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "oplot_boots"), "main");
	private final ModelPart Leftboot;
	private final ModelPart Rightboot;

	public Modeloplot_boots(ModelPart root) {
		this.Leftboot = root.getChild("Leftboot");
		this.Rightboot = root.getChild("Rightboot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Leftboot = partdefinition.addOrReplaceChild("Leftboot",
				CubeListBuilder.create().texOffs(111, 0)
						.addBox(-2.25F, 10.6F, -2.1F, 3.9F, 2.4F, 4.1F, new CubeDeformation(0.0F)).texOffs(48, 120)
						.addBox(-2.325F, 12.0F, -3.9F, 4.0F, 1.0F, 5.9F, new CubeDeformation(0.0F)).texOffs(50, 121)
						.addBox(-2.425F, 12.5F, -4.0F, 4.2F, 0.5F, 6.1F, new CubeDeformation(0.0F)).texOffs(66, 120)
						.addBox(-2.325F, 11.4F, 0.7F, 4.1F, 0.5F, 1.425F, new CubeDeformation(0.0F)).texOffs(60, 121)
						.addBox(-2.125F, 11.1F, 2.0F, 3.6F, 1.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(61, 124)
						.addBox(-2.35F, 10.5F, 0.7F, 4.125F, 2.5F, 0.8F, new CubeDeformation(0.0F)),
				PartPose.offset(2.625F, 11.0F, 0.0F));

		PartDefinition Rightboot_r1 = Leftboot.addOrReplaceChild("Rightboot_r1",
				CubeListBuilder.create().texOffs(50, 111).addBox(-1.9F, 11.6511F, 1.0027F, 4.0F, 0.95F, 2.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.425F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Rightboot_r2 = Leftboot.addOrReplaceChild("Rightboot_r2",
				CubeListBuilder.create().texOffs(62, 122)
						.addBox(-2.0F, 9.1672F, -6.9382F, 0.1F, 2.1F, 0.9F, new CubeDeformation(0.0F)).texOffs(6, 120)
						.addBox(2.1F, 9.1672F, -6.9382F, 0.1F, 2.1F, 0.9F, new CubeDeformation(0.0F)).texOffs(68, 127)
						.addBox(-1.9F, 9.1672F, -6.9382F, 4.0F, 0.1F, 0.9F, new CubeDeformation(0.0F)).texOffs(53, 120)
						.addBox(-1.9F, 9.2672F, -7.1382F, 4.0F, 1.925F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.425F, 0.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Rightboot = partdefinition.addOrReplaceChild("Rightboot",
				CubeListBuilder.create().texOffs(112, 0)
						.addBox(-2.25F, 10.6F, -2.1F, 3.9F, 2.4F, 4.1F, new CubeDeformation(0.0F)).texOffs(58, 119)
						.addBox(-2.325F, 12.0F, -3.9F, 4.0F, 1.0F, 5.9F, new CubeDeformation(0.0F)).texOffs(58, 119)
						.addBox(-2.425F, 12.5F, -4.0F, 4.2F, 0.5F, 6.1F, new CubeDeformation(0.0F)).texOffs(58, 124)
						.addBox(-2.325F, 11.4F, 0.7F, 4.1F, 0.5F, 1.425F, new CubeDeformation(0.0F)).texOffs(58, 125)
						.addBox(-2.125F, 11.1F, 2.0F, 3.6F, 1.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(58, 123)
						.addBox(-2.35F, 10.5F, 0.7F, 4.125F, 2.5F, 0.8F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 11.0F, 0.0F));

		PartDefinition Rightboot_r3 = Rightboot.addOrReplaceChild("Rightboot_r3",
				CubeListBuilder.create().texOffs(58, 123).addBox(-2.0F, -0.4F, -1.5061F, 4.0F, 0.95F, 2.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.325F, 12.0938F, -2.2939F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Rightboot_r4 = Rightboot.addOrReplaceChild("Rightboot_r4",
				CubeListBuilder.create().texOffs(58, 123)
						.addBox(-2.1F, -1.4F, -1.05F, 0.1F, 2.1F, 0.9F, new CubeDeformation(0.0F)).texOffs(58, 123)
						.addBox(2.0F, -1.4F, -1.05F, 0.1F, 2.1F, 0.9F, new CubeDeformation(0.0F)).texOffs(55, 118)
						.addBox(-2.0F, -1.4F, -1.05F, 4.0F, 0.1F, 0.9F, new CubeDeformation(0.0F)).texOffs(58, 122)
						.addBox(-2.0F, -1.3F, -1.25F, 4.0F, 1.925F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.325F, 11.9438F, -1.9189F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Rightboot2 = Rightboot.addOrReplaceChild("Rightboot2", CubeListBuilder.create(),
				PartPose.offset(2.0F, 5.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Leftboot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Rightboot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Leftboot.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Rightboot.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}