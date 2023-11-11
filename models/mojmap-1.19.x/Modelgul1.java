// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelgul1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "gul1"), "main");
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;
	private final ModelPart body;
	private final ModelPart head;

	public Modelgul1(ModelPart root) {
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.body = root.getChild("body");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(32, 0)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 32)
						.addBox(-1.625F, 5.0F, -2.25F, 3.375F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 36)
						.addBox(-0.95F, 4.425F, -2.25F, 1.975F, 3.2F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(24, 0)
						.addBox(-1.7F, 5.0F, -2.25F, 3.375F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.025F, 4.425F, -2.25F, 1.975F, 3.2F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 32)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(24, 16)
						.addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 43)
						.addBox(-1.0F, 8.0F, -17.0F, 1.0F, 1.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(54, 57)
						.addBox(-1.0F, 8.0F, 3.0F, 1.0F, 1.0F, 5.2F, new CubeDeformation(0.0F)).texOffs(56, 59)
						.addBox(-1.2F, 7.9F, 3.0F, 1.4F, 1.2F, 3.6F, new CubeDeformation(0.0F)).texOffs(56, 59)
						.addBox(-1.2F, 7.9F, -6.2F, 1.4F, 1.2F, 3.6F, new CubeDeformation(0.0F)).texOffs(58, 61)
						.addBox(-0.5F, 6.8F, -12.8F, 0.2F, 3.4F, 1.4F, new CubeDeformation(0.0F)).texOffs(56, 59)
						.addBox(-2.0F, 5.75F, -16.5F, 3.0F, 5.5F, 3.25F, new CubeDeformation(0.0F)).texOffs(56, 59)
						.addBox(-2.3F, 5.475F, -16.7F, 3.6F, 0.675F, 3.65F, new CubeDeformation(0.0F)).texOffs(56, 59)
						.addBox(-2.3F, 10.875F, -16.7F, 3.6F, 0.675F, 3.65F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 2.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(0, 32)
				.addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 2.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-4.0F, -4.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 62)
						.addBox(-8.075F, -5.05F, 0.6F, 4.075F, 0.8F, 0.8F, new CubeDeformation(0.0F)).texOffs(52, 62)
						.addBox(4.0F, -5.05F, 0.6F, 4.05F, 0.8F, 0.8F, new CubeDeformation(0.0F)).texOffs(52, 62)
						.addBox(4.0F, -5.05F, -1.475F, 4.05F, 0.8F, 0.8F, new CubeDeformation(0.0F)).texOffs(51, 61)
						.addBox(7.225F, -5.05F, -0.75F, 0.825F, 0.8F, 1.4F, new CubeDeformation(0.0F)).texOffs(51, 61)
						.addBox(5.65F, -5.05F, -0.75F, 0.825F, 0.8F, 1.4F, new CubeDeformation(0.0F)).texOffs(51, 61)
						.addBox(4.025F, -5.05F, -0.75F, 0.825F, 0.8F, 1.4F, new CubeDeformation(0.0F)).texOffs(51, 61)
						.addBox(-6.425F, -5.05F, -0.75F, 0.825F, 0.8F, 1.4F, new CubeDeformation(0.0F)).texOffs(51, 61)
						.addBox(-8.05F, -5.05F, -0.75F, 0.825F, 0.8F, 1.4F, new CubeDeformation(0.0F)).texOffs(51, 61)
						.addBox(-4.85F, -5.05F, -0.75F, 0.825F, 0.8F, 1.4F, new CubeDeformation(0.0F)).texOffs(52, 62)
						.addBox(-8.075F, -5.05F, -1.475F, 4.075F, 0.8F, 0.8F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 4.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(50, 60)
						.addBox(-8.1F, -3.25F, -4.25F, 4.075F, 0.8F, 2.9F, new CubeDeformation(0.0F)).texOffs(50, 60)
						.addBox(4.0F, -3.25F, -4.25F, 4.075F, 0.8F, 2.9F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(50, 60)
						.addBox(4.0F, -3.275F, 1.325F, 4.075F, 0.8F, 2.9F, new CubeDeformation(0.0F)).texOffs(50, 60)
						.addBox(-8.1F, -3.275F, 1.325F, 4.075F, 0.8F, 2.9F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(32, 5).addBox(3.275F, -23.4F, -8.0F, 1.525F, 3.5F, 0.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 20.475F, 9.725F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(32, 5).addBox(-4.85F, -23.4F, -8.0F, 1.525F, 3.5F, 0.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 20.475F, 9.725F, 0.0F, 0.0F, 0.3491F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(49, 61).addBox(-4.0F, -1.75F, -4.225F, 7.775F, 8.1F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.075F, 5.9F, -0.0218F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(32, 5).addBox(-4.85F, -23.4F, -8.0F, 1.525F, 3.5F, 0.6F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 20.0F, 5.4F, 0.0F, 0.0F, 0.3491F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(32, 5).addBox(3.275F, -23.4F, -8.0F, 1.525F, 3.5F, 0.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 20.0F, 5.4F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(49, 61).addBox(-3.275F, 0.275F, -2.675F, 3.5F, 1.45F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1173F, 0.0675F, 0.5196F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(49, 61).addBox(-0.2F, 0.275F, -2.675F, 4.175F, 1.45F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.075F, -0.1F, 0.0529F, 0.0305F, -0.5228F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(49, 61)
						.addBox(-3.1F, -1.45F, -2.675F, 6.3F, 1.45F, 1.0F, new CubeDeformation(0.0F)).texOffs(49, 61)
						.addBox(-0.9F, -0.05F, -2.675F, 1.85F, 1.45F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1353F, 0.0F, 0.0F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(49, 61).addBox(-0.2F, 0.275F, -2.675F, 3.5F, 1.45F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1173F, -0.0675F, -0.5196F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(49, 61).addBox(-3.925F, 0.275F, -2.675F, 4.15F, 1.45F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.075F, -0.1F, 0.0529F, -0.0305F, 0.5228F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(49, 61).addBox(-1.0F, 2.825F, -2.675F, 6.95F, 1.45F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.075F, -0.1F, 0.0059F, -0.0608F, 1.4746F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(49, 61).addBox(-5.975F, 2.775F, -2.675F, 6.95F, 1.45F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.075F, -0.1F, 0.0169F, 0.0587F, -1.4834F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(49, 61).addBox(-3.625F, -0.05F, -2.675F, 7.2F, 6.4F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.075F, -0.1F, 0.0611F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(57, 61)
				.addBox(-3.975F, -2.875F, -4.525F, 7.95F, 2.875F, 0.525F, new CubeDeformation(0.0F)).texOffs(57, 61)
				.addBox(-3.975F, -8.05F, -4.525F, 7.95F, 1.375F, 0.525F, new CubeDeformation(0.0F)).texOffs(56, 60)
				.addBox(-4.025F, -8.45F, -4.025F, 8.05F, 0.375F, 1.425F, new CubeDeformation(0.0F)).texOffs(57, 61)
				.addBox(-3.975F, -6.675F, -4.525F, 1.15F, 4.425F, 0.525F, new CubeDeformation(0.0F)).texOffs(57, 61)
				.addBox(-1.775F, -6.675F, -4.525F, 1.15F, 4.425F, 0.525F, new CubeDeformation(0.0F)).texOffs(57, 61)
				.addBox(2.825F, -6.675F, -4.525F, 1.15F, 4.425F, 0.525F, new CubeDeformation(0.0F)).texOffs(57, 61)
				.addBox(4.0F, -8.025F, -3.975F, 0.35F, 8.025F, 0.525F, new CubeDeformation(0.0F)).texOffs(57, 61)
				.addBox(4.0F, -7.7F, -3.45F, 0.35F, 6.725F, 0.525F, new CubeDeformation(0.0F)).texOffs(57, 61)
				.addBox(4.0F, -7.15F, -2.95F, 0.35F, 5.375F, 0.525F, new CubeDeformation(0.0F)).texOffs(57, 61)
				.addBox(-4.35F, -7.15F, -2.95F, 0.35F, 5.375F, 0.525F, new CubeDeformation(0.0F)).texOffs(57, 61)
				.addBox(-4.35F, -7.7F, -3.45F, 0.35F, 6.725F, 0.525F, new CubeDeformation(0.0F)).texOffs(57, 61)
				.addBox(-4.35F, -8.025F, -3.975F, 0.35F, 8.025F, 0.525F, new CubeDeformation(0.0F)).texOffs(57, 61)
				.addBox(0.625F, -6.675F, -4.525F, 1.15F, 4.425F, 0.525F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}