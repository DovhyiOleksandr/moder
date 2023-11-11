// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modellesovik<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "lesovik"), "main");
	private final ModelPart head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modellesovik(ModelPart root) {
		this.head = root.getChild("head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(36, 52)
						.addBox(-4.0F, -4.5F, -4.55F, 8.0F, 4.5F, 0.6F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(54, 0)
						.addBox(-4.0F, -8.0F, -4.55F, 8.0F, 2.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 25)
						.addBox(-4.0F, -6.0F, -4.55F, 1.0F, 2.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(3.0F, -6.0F, -4.55F, 1.0F, 2.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-4.0F, -8.5F, -4.0F, 8.0F, 0.5F, 7.85F, new CubeDeformation(0.0F)).texOffs(24, 24)
						.addBox(4.0F, -8.0F, -4.25F, 0.5F, 8.0F, 8.35F, new CubeDeformation(0.0F)).texOffs(24, 8)
						.addBox(-4.5F, -8.0F, -4.25F, 0.5F, 8.0F, 8.35F, new CubeDeformation(0.0F)).texOffs(41, 23)
						.addBox(-4.0F, -8.0F, 4.0F, 8.0F, 8.0F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 25)
						.addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 53)
						.addBox(0.25F, -5.5F, -2.1F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 41)
						.addBox(-4.25F, -5.5F, -2.1F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 27)
						.addBox(0.25F, -5.5F, -2.5F, 4.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(42, 21)
						.addBox(0.25F, -5.0F, -2.5F, 3.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 5)
						.addBox(0.25F, -4.5F, -2.5F, 3.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(0.25F, -4.0F, -2.5F, 2.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(24, 29)
						.addBox(0.25F, -3.5F, -2.5F, 2.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(34, 10)
						.addBox(0.25F, -3.0F, -2.5F, 1.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(-2.25F, -3.5F, -2.5F, 2.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(34, 8)
						.addBox(-1.75F, -3.0F, -2.5F, 1.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.25F, -5.5F, -2.5F, 0.5F, 3.0F, 1.5F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-2.75F, -4.0F, -2.5F, 2.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-3.25F, -4.5F, -2.5F, 3.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(12, 41)
						.addBox(-4.25F, -5.5F, -2.5F, 4.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(50, 35)
						.addBox(-4.75F, -6.0F, -2.5F, 9.5F, 0.5F, 1.5F, new CubeDeformation(0.0F)).texOffs(42, 32)
						.addBox(-4.75F, -6.0F, 1.0F, 9.5F, 0.5F, 1.5F, new CubeDeformation(0.0F)).texOffs(24, 5)
						.addBox(-4.25F, -5.5F, 1.0F, 8.5F, 0.5F, 1.5F, new CubeDeformation(0.0F)).texOffs(53, 50)
						.addBox(-3.75F, -5.0F, 1.0F, 7.5F, 0.5F, 1.5F, new CubeDeformation(0.0F)).texOffs(54, 5)
						.addBox(-3.25F, -4.5F, 1.0F, 6.5F, 0.5F, 1.5F, new CubeDeformation(0.0F)).texOffs(54, 38)
						.addBox(-2.75F, -4.0F, 1.0F, 5.5F, 0.5F, 1.5F, new CubeDeformation(0.0F)).texOffs(52, 21)
						.addBox(-3.75F, -5.0F, -2.5F, 3.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(-6.25F, -6.5F, -2.0F, 12.5F, 0.5F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 6.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(38, 36)
						.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 62)
						.addBox(-0.5F, 9.75F, -6.75F, 1.0F, 1.25F, 13.5F, new CubeDeformation(0.0F)).texOffs(12, 69)
						.addBox(-0.5F, 11.0F, 4.25F, 1.0F, 1.0F, 6.25F, new CubeDeformation(0.0F)).texOffs(30, 116)
						.addBox(-0.5F, 11.0F, 3.75F, 1.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(29, 119)
						.addBox(-0.5F, 11.0F, -4.25F, 1.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(27, 117)
						.addBox(-0.25F, 11.0F, 0.75F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(7, 120)
						.addBox(-0.25F, 11.0F, -1.25F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(27, 120)
						.addBox(-0.75F, 11.25F, -10.0F, 1.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(30, 119)
						.addBox(-0.75F, 11.25F, -9.0F, 1.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(24, 117)
						.addBox(-0.75F, 11.25F, -8.0F, 1.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(30, 119)
						.addBox(-0.75F, 11.25F, 9.5F, 1.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(25, 120)
						.addBox(-0.25F, 8.25F, 9.1F, 0.5F, 3.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(23, 121)
						.addBox(-0.25F, 8.25F, -9.7F, 0.5F, 3.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(30, 120)
						.addBox(-0.75F, 11.25F, 8.5F, 1.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(27, 117)
						.addBox(-0.75F, 11.25F, 7.5F, 1.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(13, 69)
						.addBox(-0.5F, 11.0F, -10.5F, 1.0F, 1.0F, 6.25F, new CubeDeformation(0.0F)).texOffs(81, 101)
						.addBox(-0.25F, 6.5F, -9.25F, 0.5F, 0.5F, 18.0F, new CubeDeformation(0.0F)).texOffs(29, 74)
						.addBox(-0.5F, 8.5F, 6.25F, 1.0F, 1.25F, 2.5F, new CubeDeformation(0.0F)).texOffs(15, 67)
						.addBox(-0.5F, 6.25F, 8.75F, 1.0F, 2.25F, 1.25F, new CubeDeformation(0.0F)).texOffs(15, 67)
						.addBox(-0.5F, 6.25F, -10.0F, 1.0F, 2.25F, 1.25F, new CubeDeformation(0.0F)).texOffs(40, 77)
						.addBox(-0.5F, 8.5F, -8.75F, 1.0F, 1.25F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(20, 40)
				.addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 2.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 41)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(42, 5)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}