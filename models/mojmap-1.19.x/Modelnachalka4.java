// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelnachalka4<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "nachalka4"), "main");
	private final ModelPart Leftbot;
	private final ModelPart Rightbot;

	public Modelnachalka4(ModelPart root) {
		this.Leftbot = root.getChild("Leftbot");
		this.Rightbot = root.getChild("Rightbot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Leftbot = partdefinition.addOrReplaceChild("Leftbot", CubeListBuilder.create(),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition Rightbot2 = Leftbot.addOrReplaceChild("Rightbot2", CubeListBuilder.create().texOffs(189, 47)
				.addBox(1.825F, 9.0F, -2.2F, 4.25F, 3.0F, 4.4F, new CubeDeformation(0.0F)).texOffs(163, 67)
				.addBox(1.725F, 9.0F, -2.2F, 4.45F, 2.75F, 0.7F, new CubeDeformation(0.0F)).texOffs(190, 65)
				.addBox(4.425F, 8.7F, -2.3F, 1.75F, 1.1F, 4.6F, new CubeDeformation(0.0F)).texOffs(211, 57)
				.addBox(1.725F, 8.7F, -2.3F, 1.75F, 1.1F, 4.6F, new CubeDeformation(0.0F)).texOffs(178, 14)
				.addBox(3.225F, 8.75F, -2.3F, 1.55F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(187, 14)
				.addBox(3.225F, 8.95F, -2.3F, 1.55F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(177, 70)
				.addBox(3.425F, 8.7F, -2.0F, 1.05F, 1.1F, 4.3F, new CubeDeformation(0.0F)).texOffs(203, 18)
				.addBox(1.725F, 10.75F, -4.675F, 4.45F, 1.0F, 2.475F, new CubeDeformation(0.0F)).texOffs(175, 25)
				.addBox(1.725F, 11.75F, -4.775F, 4.45F, 0.25F, 7.075F, new CubeDeformation(0.0F)).texOffs(175, 0)
				.addBox(5.975F, 9.8F, 2.1F, 0.2F, 2.2F, 0.2F, new CubeDeformation(0.0F)).texOffs(175, 0)
				.addBox(1.725F, 9.8F, 2.1F, 0.2F, 2.2F, 0.2F, new CubeDeformation(0.0F)).texOffs(242, 36)
				.addBox(1.725F, 9.85F, -2.975F, 4.45F, 0.9F, 0.775F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.8F, 0.0F, 0.0F));

		PartDefinition RightLeg_r1 = Rightbot2.addOrReplaceChild("RightLeg_r1",
				CubeListBuilder.create().texOffs(197, 79).addBox(-2.225F, -1.25F, -0.925F, 4.45F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.95F, 10.5F, -2.7F, -0.9599F, 0.0F, 0.0F));

		PartDefinition RightLeg_r2 = Rightbot2.addOrReplaceChild("RightLeg_r2",
				CubeListBuilder.create().texOffs(222, 21).addBox(-2.225F, -1.6F, -1.025F, 4.45F, 2.2F, 0.825F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.95F, 10.9F, -1.15F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Rightbot = partdefinition.addOrReplaceChild("Rightbot", CubeListBuilder.create().texOffs(238, 23)
				.addBox(-2.275F, 9.0F, -2.2F, 4.25F, 3.0F, 4.4F, new CubeDeformation(0.0F)).texOffs(204, 65)
				.addBox(-2.375F, 9.0F, -2.2F, 4.45F, 2.75F, 0.7F, new CubeDeformation(0.0F)).texOffs(220, 63)
				.addBox(0.325F, 8.7F, -2.3F, 1.75F, 1.1F, 4.6F, new CubeDeformation(0.0F)).texOffs(174, 55)
				.addBox(-2.375F, 8.7F, -2.3F, 1.75F, 1.1F, 4.6F, new CubeDeformation(0.0F)).texOffs(186, 2)
				.addBox(-0.875F, 8.75F, -2.3F, 1.55F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(193, 8)
				.addBox(-0.875F, 8.95F, -2.3F, 1.55F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(222, 69)
				.addBox(-0.675F, 8.7F, -2.1F, 1.05F, 1.1F, 4.4F, new CubeDeformation(0.0F)).texOffs(223, 31)
				.addBox(-2.375F, 10.75F, -4.675F, 4.45F, 1.0F, 2.475F, new CubeDeformation(0.0F)).texOffs(183, 25)
				.addBox(-2.375F, 11.75F, -4.775F, 4.45F, 0.25F, 7.075F, new CubeDeformation(0.0F)).texOffs(175, 0)
				.addBox(1.875F, 9.8F, 2.1F, 0.2F, 2.2F, 0.2F, new CubeDeformation(0.0F)).texOffs(175, 0)
				.addBox(-2.375F, 9.8F, 2.1F, 0.2F, 2.2F, 0.2F, new CubeDeformation(0.0F)).texOffs(219, 36)
				.addBox(-2.375F, 9.85F, -2.975F, 4.45F, 1.175F, 0.775F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition RightLeg_r3 = Rightbot.addOrReplaceChild("RightLeg_r3",
				CubeListBuilder.create().texOffs(207, 4).addBox(-2.225F, -1.25F, -0.925F, 4.45F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.15F, 10.5F, -2.7F, -0.9599F, 0.0F, 0.0F));

		PartDefinition RightLeg_r4 = Rightbot.addOrReplaceChild("RightLeg_r4",
				CubeListBuilder.create().texOffs(242, 69).addBox(-2.225F, -1.6F, -1.025F, 4.45F, 2.2F, 0.825F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.15F, 10.9F, -1.15F, -0.7854F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Leftbot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Rightbot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Leftbot.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Rightbot.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}