// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeloplot_noogi<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "oplot_noogi"), "main");
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modeloplot_noogi(ModelPart root) {
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(110, 17)
						.addBox(-2.4F, 0.0F, -2.2F, 4.6F, 9.6F, 4.3F, new CubeDeformation(0.0F)).texOffs(119, 0)
						.addBox(-2.6F, 1.4F, -2.2F, 0.2F, 0.6F, 4.3F, new CubeDeformation(0.0F)).texOffs(120, 0)
						.addBox(-3.0F, 0.8F, -1.8F, 0.5F, 3.5F, 3.5F, new CubeDeformation(0.0F)).texOffs(120, 1)
						.addBox(-3.1F, 0.7F, -1.9F, 0.1F, 1.6F, 3.7F, new CubeDeformation(0.0F)).texOffs(64, 126)
						.addBox(-3.125F, 1.7F, -0.5F, 0.125F, 0.8F, 0.9F, new CubeDeformation(0.0F)).texOffs(119, 0)
						.addBox(-3.0F, 0.7F, -1.9F, 0.5F, 0.1F, 3.7F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.5F, 0.7F, -1.9F, 0.1F, 0.4F, 3.7F, new CubeDeformation(0.0F)).texOffs(117, 127)
						.addBox(-2.6F, 1.4F, -2.3F, 0.9F, 0.6F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.1F, 2.0F, -2.3F, 0.4F, 1.5F, 0.1F, new CubeDeformation(0.0F)).texOffs(36, 124)
						.addBox(-1.8F, 0.9F, -2.45F, 3.3F, 3.7F, 0.2F, new CubeDeformation(0.0F)).texOffs(121, 124)
						.addBox(-1.8F, 1.0F, -2.55F, 0.3F, 3.5F, 0.1F, new CubeDeformation(0.0F)).texOffs(121, 124)
						.addBox(-0.8F, 1.0F, -2.55F, 0.3F, 3.5F, 0.1F, new CubeDeformation(0.0F)).texOffs(121, 124)
						.addBox(0.2F, 1.0F, -2.55F, 0.3F, 3.5F, 0.1F, new CubeDeformation(0.0F)).texOffs(121, 124)
						.addBox(0.7F, 1.0F, -2.55F, 0.3F, 3.5F, 0.1F, new CubeDeformation(0.0F)).texOffs(121, 124)
						.addBox(-0.3F, 1.0F, -2.55F, 0.3F, 3.5F, 0.1F, new CubeDeformation(0.0F)).texOffs(121, 124)
						.addBox(-1.3F, 1.0F, -2.55F, 0.3F, 3.5F, 0.1F, new CubeDeformation(0.0F)).texOffs(121, 124)
						.addBox(1.2F, 0.9F, -2.55F, 0.3F, 3.7F, 0.1F, new CubeDeformation(0.0F)).texOffs(121, 124)
						.addBox(-1.8F, 4.5F, -2.55F, 3.2F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(121, 124)
						.addBox(-1.8F, 0.9F, -2.55F, 3.2F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(63, 126)
						.addBox(1.4F, 2.0F, -2.3F, 0.4F, 1.5F, 0.1F, new CubeDeformation(0.0F)).texOffs(121, 127)
						.addBox(1.4F, 1.4F, -2.3F, 0.9F, 0.6F, 0.1F, new CubeDeformation(0.0F)).texOffs(57, 127)
						.addBox(-2.4F, 0.7F, -2.3F, 4.6F, 0.7F, 0.1F, new CubeDeformation(0.0F)).texOffs(54, 127)
						.addBox(-2.4F, 4.1F, -2.3F, 4.6F, 0.7F, 0.1F, new CubeDeformation(0.0F)).texOffs(39, 120)
						.addBox(-2.2F, 5.7F, -2.4F, 3.5F, 3.4F, 0.2F, new CubeDeformation(0.0F)).texOffs(126, 125)
						.addBox(-2.0F, 6.0F, -2.45F, 0.4F, 2.6F, 0.25F, new CubeDeformation(0.0F)).texOffs(126, 125)
						.addBox(-1.0F, 6.0F, -2.45F, 0.4F, 2.6F, 0.25F, new CubeDeformation(0.0F)).texOffs(126, 125)
						.addBox(0.0F, 6.0F, -2.45F, 0.4F, 2.6F, 0.25F, new CubeDeformation(0.0F)).texOffs(126, 125)
						.addBox(1.0F, 6.0F, -2.45F, 0.4F, 2.6F, 0.25F, new CubeDeformation(0.0F)).texOffs(122, 122)
						.addBox(-1.45F, 5.7F, -2.5F, 2.675F, 0.1F, 0.3F, new CubeDeformation(0.0F)).texOffs(119, 122)
						.addBox(-1.45F, 5.7F, -2.5F, 2.675F, 0.1F, 0.3F, new CubeDeformation(0.0F)).texOffs(125, 124)
						.addBox(-2.2F, 5.3F, -2.5F, 0.1F, 3.8F, 0.1F, new CubeDeformation(0.0F)).texOffs(125, 124)
						.addBox(-2.1F, 5.3F, -2.5F, 0.625F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(119, 127)
						.addBox(-2.1F, 9.0F, -2.5F, 4.0F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(125, 124)
						.addBox(1.9F, 5.225F, -2.5F, 0.1F, 3.875F, 0.1F, new CubeDeformation(0.0F)).texOffs(125, 124)
						.addBox(1.3F, 5.225F, -2.5F, 0.6F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(56, 123)
						.addBox(-2.3F, 5.1F, -2.3F, 4.4F, 4.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(118, 122)
						.addBox(-2.4F, 5.2F, -2.275F, 4.6F, 0.1F, 0.075F, new CubeDeformation(0.0F)).texOffs(118, 122)
						.addBox(-2.4F, 5.9F, -2.275F, 4.6F, 0.1F, 0.075F, new CubeDeformation(0.0F)).texOffs(118, 122)
						.addBox(-2.4F, 8.3F, -2.275F, 4.6F, 0.1F, 0.075F, new CubeDeformation(0.0F)).texOffs(118, 122)
						.addBox(2.2F, 8.3F, -2.275F, 0.1F, 0.8F, 0.175F, new CubeDeformation(0.0F)).texOffs(118, 122)
						.addBox(2.2F, 5.2F, -2.275F, 0.1F, 0.8F, 0.175F, new CubeDeformation(0.0F)).texOffs(118, 122)
						.addBox(-2.5F, 8.3F, -2.275F, 0.1F, 0.8F, 0.175F, new CubeDeformation(0.0F)).texOffs(118, 122)
						.addBox(-2.5F, 5.2F, -2.275F, 0.1F, 0.8F, 0.175F, new CubeDeformation(0.0F)).texOffs(119, 0)
						.addBox(-2.55F, 5.175F, -2.1F, 0.15F, 0.85F, 4.35F, new CubeDeformation(0.0F)).texOffs(117, 0)
						.addBox(2.15F, 8.275F, -2.1F, 0.15F, 0.85F, 4.35F, new CubeDeformation(0.0F)).texOffs(119, 1)
						.addBox(2.2F, 5.175F, -2.1F, 0.15F, 0.85F, 4.2F, new CubeDeformation(0.0F)).texOffs(111, 0)
						.addBox(-2.55F, 8.275F, -2.1F, 0.15F, 0.85F, 4.35F, new CubeDeformation(0.0F)).texOffs(118, 10)
						.addBox(-2.4F, 5.175F, 2.1F, 4.75F, 0.85F, 0.15F, new CubeDeformation(0.0F)).texOffs(118, 0)
						.addBox(-2.4F, 8.275F, 2.1F, 4.55F, 0.85F, 0.15F, new CubeDeformation(0.0F)).texOffs(59, 125)
						.addBox(-2.0F, 6.025F, 2.1F, 3.75F, 2.25F, 0.15F, new CubeDeformation(0.0F)).texOffs(53, 124)
						.addBox(-1.7F, 6.025F, 2.25F, 3.25F, 2.95F, 0.075F, new CubeDeformation(0.0F)).texOffs(121, 124)
						.addBox(1.45F, 6.025F, 2.325F, 0.1F, 2.95F, 0.1F, new CubeDeformation(0.0F)).texOffs(121, 124)
						.addBox(-1.6F, 8.875F, 2.325F, 3.05F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(122, 127)
						.addBox(-1.5F, 5.675F, 2.325F, 2.85F, 0.5F, 0.05F, new CubeDeformation(0.0F)).texOffs(122, 127)
						.addBox(-1.5F, 6.675F, 2.325F, 2.85F, 0.5F, 0.05F, new CubeDeformation(0.0F)).texOffs(122, 127)
						.addBox(-1.5F, 7.675F, 2.325F, 2.85F, 0.5F, 0.05F, new CubeDeformation(0.0F)).texOffs(121, 124)
						.addBox(-1.7F, 6.025F, 2.325F, 0.1F, 2.95F, 0.1F, new CubeDeformation(0.0F)).texOffs(118, 122)
						.addBox(-2.4F, 9.0F, -2.275F, 4.6F, 0.1F, 0.075F, new CubeDeformation(0.0F)).texOffs(61, 123)
						.addBox(1.3F, 5.225F, -2.4F, 0.7F, 3.875F, 0.2F, new CubeDeformation(0.0F)).texOffs(56, 124)
						.addBox(-2.2F, 5.3F, -2.4F, 0.725F, 0.4F, 0.2F, new CubeDeformation(0.0F)).texOffs(113, 127)
						.addBox(-2.6F, 3.5F, -2.3F, 0.9F, 0.6F, 0.1F, new CubeDeformation(0.0F)).texOffs(115, 0)
						.addBox(-2.6F, 3.5F, -2.2F, 0.2F, 0.6F, 4.3F, new CubeDeformation(0.0F)).texOffs(117, 0)
						.addBox(-2.6F, 3.5F, 2.1F, 4.9F, 0.6F, 0.2F, new CubeDeformation(0.0F)).texOffs(119, 4)
						.addBox(2.2F, 3.5F, -2.2F, 0.1F, 0.6F, 4.3F, new CubeDeformation(0.0F)).texOffs(126, 127)
						.addBox(1.4F, 3.5F, -2.3F, 0.9F, 0.6F, 0.1F, new CubeDeformation(0.0F)).texOffs(119, 0)
						.addBox(2.2F, 1.4F, -2.2F, 0.1F, 0.6F, 4.3F, new CubeDeformation(0.0F)).texOffs(117, 1)
						.addBox(-2.6F, 1.4F, 2.1F, 4.9F, 0.6F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition RightLeg_r1 = RightLeg.addOrReplaceChild("RightLeg_r1",
				CubeListBuilder.create().texOffs(125, 124)
						.addBox(0.225F, 0.175F, -0.2F, 0.1F, 0.425F, 0.3F, new CubeDeformation(0.0F)).texOffs(56, 124)
						.addBox(-0.375F, 0.175F, -0.1F, 0.7F, 0.425F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.85F, 5.25F, -2.3F, 0.0F, 0.0F, -0.3491F));

		PartDefinition RightLeg_r2 = RightLeg.addOrReplaceChild("RightLeg_r2",
				CubeListBuilder.create().texOffs(127, 125)
						.addBox(-0.4F, -0.075F, -0.2F, 0.1F, 0.5F, 0.1F, new CubeDeformation(0.0F)).texOffs(56, 124)
						.addBox(-0.4F, -0.075F, -0.1F, 0.7F, 0.5F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.65F, 5.45F, -2.3F, 0.0F, 0.0F, 0.3491F));

		PartDefinition RightLeg_r3 = RightLeg.addOrReplaceChild("RightLeg_r3",
				CubeListBuilder.create().texOffs(127, 127)
						.addBox(-1.625F, -0.125F, 0.05F, 0.1F, 0.85F, 0.1F, new CubeDeformation(0.0F)).texOffs(121, 124)
						.addBox(1.525F, -0.125F, 0.05F, 0.1F, 0.85F, 0.1F, new CubeDeformation(0.0F)).texOffs(121, 124)
						.addBox(-1.625F, -0.125F, 0.05F, 3.25F, 0.05F, 0.1F, new CubeDeformation(0.0F)).texOffs(46, 127)
						.addBox(-1.625F, -0.125F, -0.15F, 3.25F, 0.75F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.075F, 5.4F, 2.3F, -0.0349F, 0.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(),
				PartPose.offset(2.9F, 12.0F, 0.0F));

		PartDefinition RightLeg2 = LeftLeg.addOrReplaceChild("RightLeg2",
				CubeListBuilder.create().texOffs(110, 16)
						.addBox(2.3F, 0.0F, -2.2F, 4.6F, 9.6F, 4.3F, new CubeDeformation(0.0F)).texOffs(119, 0)
						.addBox(2.1F, 1.4F, -2.2F, 0.2F, 0.6F, 4.3F, new CubeDeformation(0.0F)).texOffs(126, 127)
						.addBox(2.1F, 1.4F, -2.3F, 0.9F, 0.6F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.6F, 2.0F, -2.3F, 0.4F, 1.5F, 0.1F, new CubeDeformation(0.0F)).texOffs(53, 121)
						.addBox(2.9F, 0.9F, -2.45F, 3.3F, 3.7F, 0.2F, new CubeDeformation(0.0F)).texOffs(127, 124)
						.addBox(2.9F, 1.0F, -2.55F, 0.3F, 3.5F, 0.1F, new CubeDeformation(0.0F)).texOffs(127, 124)
						.addBox(3.9F, 1.0F, -2.55F, 0.3F, 3.5F, 0.1F, new CubeDeformation(0.0F)).texOffs(127, 124)
						.addBox(4.9F, 1.0F, -2.55F, 0.3F, 3.5F, 0.1F, new CubeDeformation(0.0F)).texOffs(127, 124)
						.addBox(5.4F, 1.0F, -2.55F, 0.3F, 3.5F, 0.1F, new CubeDeformation(0.0F)).texOffs(127, 124)
						.addBox(4.4F, 1.0F, -2.55F, 0.3F, 3.5F, 0.1F, new CubeDeformation(0.0F)).texOffs(127, 124)
						.addBox(3.4F, 1.0F, -2.55F, 0.3F, 3.5F, 0.1F, new CubeDeformation(0.0F)).texOffs(127, 124)
						.addBox(5.9F, 0.9F, -2.55F, 0.3F, 3.7F, 0.1F, new CubeDeformation(0.0F)).texOffs(121, 128)
						.addBox(2.9F, 4.5F, -2.55F, 3.2F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(121, 128)
						.addBox(2.9F, 0.9F, -2.55F, 3.2F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(58, 118)
						.addBox(6.1F, 2.0F, -2.3F, 0.4F, 1.5F, 0.1F, new CubeDeformation(0.0F)).texOffs(126, 127)
						.addBox(6.1F, 1.4F, -2.3F, 0.9F, 0.6F, 0.1F, new CubeDeformation(0.0F)).texOffs(54, 127)
						.addBox(2.3F, 0.7F, -2.3F, 4.6F, 0.7F, 0.1F, new CubeDeformation(0.0F)).texOffs(54, 109)
						.addBox(2.3F, 4.1F, -2.3F, 4.6F, 0.7F, 0.1F, new CubeDeformation(0.0F)).texOffs(64, 124)
						.addBox(2.5F, 5.7F, -2.4F, 3.5F, 3.4F, 0.2F, new CubeDeformation(0.0F)).texOffs(127, 125)
						.addBox(2.7F, 6.0F, -2.45F, 0.4F, 2.6F, 0.25F, new CubeDeformation(0.0F)).texOffs(127, 125)
						.addBox(3.7F, 6.0F, -2.45F, 0.4F, 2.6F, 0.25F, new CubeDeformation(0.0F)).texOffs(127, 125)
						.addBox(4.7F, 6.0F, -2.45F, 0.4F, 2.6F, 0.25F, new CubeDeformation(0.0F)).texOffs(127, 125)
						.addBox(5.7F, 6.0F, -2.45F, 0.4F, 2.6F, 0.25F, new CubeDeformation(0.0F)).texOffs(122, 128)
						.addBox(3.25F, 5.7F, -2.5F, 2.675F, 0.1F, 0.3F, new CubeDeformation(0.0F)).texOffs(122, 127)
						.addBox(3.25F, 5.7F, -2.5F, 2.675F, 0.1F, 0.3F, new CubeDeformation(0.0F)).texOffs(128, 124)
						.addBox(2.5F, 5.3F, -2.5F, 0.1F, 3.8F, 0.1F, new CubeDeformation(0.0F)).texOffs(127, 128)
						.addBox(2.6F, 5.3F, -2.5F, 0.625F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(120, 128)
						.addBox(2.6F, 9.0F, -2.5F, 4.0F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(128, 124)
						.addBox(6.6F, 5.225F, -2.5F, 0.1F, 3.875F, 0.1F, new CubeDeformation(0.0F)).texOffs(127, 128)
						.addBox(6.0F, 5.225F, -2.5F, 0.6F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(70, 124)
						.addBox(2.4F, 5.1F, -2.3F, 4.4F, 4.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(50, 121)
						.addBox(2.3F, 5.2F, -2.275F, 4.6F, 0.1F, 0.075F, new CubeDeformation(0.0F)).texOffs(50, 121)
						.addBox(2.3F, 5.9F, -2.275F, 4.6F, 0.1F, 0.075F, new CubeDeformation(0.0F)).texOffs(50, 121)
						.addBox(2.3F, 8.3F, -2.275F, 4.6F, 0.1F, 0.075F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.9F, 8.3F, -2.275F, 0.1F, 0.8F, 0.175F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.9F, 5.2F, -2.275F, 0.1F, 0.8F, 0.175F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.2F, 8.3F, -2.275F, 0.1F, 0.8F, 0.175F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.2F, 5.2F, -2.275F, 0.1F, 0.8F, 0.175F, new CubeDeformation(0.0F)).texOffs(119, 0)
						.addBox(2.15F, 5.175F, -2.1F, 0.15F, 0.85F, 4.35F, new CubeDeformation(0.0F)).texOffs(119, 0)
						.addBox(6.85F, 8.275F, -2.1F, 0.15F, 0.85F, 4.35F, new CubeDeformation(0.0F)).texOffs(119, 0)
						.addBox(6.9F, 5.175F, -2.1F, 0.15F, 0.85F, 4.2F, new CubeDeformation(0.0F)).texOffs(119, 0)
						.addBox(2.15F, 8.275F, -2.1F, 0.15F, 0.85F, 4.35F, new CubeDeformation(0.0F)).texOffs(118, 1)
						.addBox(2.3F, 5.175F, 2.1F, 4.75F, 0.85F, 0.15F, new CubeDeformation(0.0F)).texOffs(119, 1)
						.addBox(2.3F, 8.275F, 2.1F, 4.55F, 0.85F, 0.15F, new CubeDeformation(0.0F)).texOffs(59, 122)
						.addBox(2.7F, 6.025F, 2.1F, 3.75F, 2.25F, 0.15F, new CubeDeformation(0.0F)).texOffs(42, 124)
						.addBox(3.0F, 6.025F, 2.25F, 3.25F, 2.95F, 0.075F, new CubeDeformation(0.0F)).texOffs(125, 122)
						.addBox(6.15F, 6.025F, 2.325F, 0.1F, 2.95F, 0.1F, new CubeDeformation(0.0F)).texOffs(119, 125)
						.addBox(3.1F, 8.875F, 2.325F, 3.05F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(119, 124)
						.addBox(3.2F, 5.675F, 2.325F, 2.85F, 0.5F, 0.05F, new CubeDeformation(0.0F)).texOffs(119, 124)
						.addBox(3.2F, 6.675F, 2.325F, 2.85F, 0.5F, 0.05F, new CubeDeformation(0.0F)).texOffs(119, 124)
						.addBox(3.2F, 7.675F, 2.325F, 2.85F, 0.5F, 0.05F, new CubeDeformation(0.0F)).texOffs(125, 122)
						.addBox(3.0F, 6.025F, 2.325F, 0.1F, 2.95F, 0.1F, new CubeDeformation(0.0F)).texOffs(50, 121)
						.addBox(2.3F, 9.0F, -2.275F, 4.6F, 0.1F, 0.075F, new CubeDeformation(0.0F)).texOffs(71, 124)
						.addBox(6.0F, 5.225F, -2.4F, 0.7F, 3.875F, 0.2F, new CubeDeformation(0.0F)).texOffs(59, 124)
						.addBox(2.5F, 5.3F, -2.4F, 0.725F, 0.4F, 0.2F, new CubeDeformation(0.0F)).texOffs(126, 127)
						.addBox(2.1F, 3.5F, -2.3F, 0.9F, 0.6F, 0.1F, new CubeDeformation(0.0F)).texOffs(119, 0)
						.addBox(2.1F, 3.5F, -2.2F, 0.2F, 0.6F, 4.3F, new CubeDeformation(0.0F)).texOffs(118, 1)
						.addBox(2.1F, 3.5F, 2.1F, 4.9F, 0.6F, 0.2F, new CubeDeformation(0.0F)).texOffs(119, 0)
						.addBox(6.9F, 3.5F, -2.2F, 0.1F, 0.6F, 4.3F, new CubeDeformation(0.0F)).texOffs(126, 127)
						.addBox(6.1F, 3.5F, -2.3F, 0.9F, 0.6F, 0.1F, new CubeDeformation(0.0F)).texOffs(119, 0)
						.addBox(6.9F, 1.4F, -2.2F, 0.1F, 0.6F, 4.3F, new CubeDeformation(0.0F)).texOffs(118, 1)
						.addBox(2.1F, 1.4F, 2.1F, 4.9F, 0.6F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.8F, 0.0F, 0.0F));

		PartDefinition RightLeg_r4 = RightLeg2.addOrReplaceChild("RightLeg_r4",
				CubeListBuilder.create().texOffs(127, 127)
						.addBox(0.225F, 0.175F, -0.2F, 0.1F, 0.425F, 0.3F, new CubeDeformation(0.0F)).texOffs(56, 122)
						.addBox(-0.375F, 0.175F, -0.1F, 0.7F, 0.425F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.85F, 5.25F, -2.3F, 0.0F, 0.0F, -0.3491F));

		PartDefinition RightLeg_r5 = RightLeg2.addOrReplaceChild("RightLeg_r5",
				CubeListBuilder.create().texOffs(128, 127)
						.addBox(-0.4F, -0.075F, -0.2F, 0.1F, 0.5F, 0.1F, new CubeDeformation(0.0F)).texOffs(62, 119)
						.addBox(-0.4F, -0.075F, -0.1F, 0.7F, 0.5F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.35F, 5.45F, -2.3F, 0.0F, 0.0F, 0.3491F));

		PartDefinition RightLeg_r6 = RightLeg2.addOrReplaceChild("RightLeg_r6",
				CubeListBuilder.create().texOffs(125, 124)
						.addBox(-1.625F, -0.125F, 0.05F, 0.1F, 0.85F, 0.1F, new CubeDeformation(0.0F)).texOffs(125, 124)
						.addBox(1.525F, -0.125F, 0.05F, 0.1F, 0.85F, 0.1F, new CubeDeformation(0.0F)).texOffs(118, 125)
						.addBox(-1.625F, -0.125F, 0.05F, 3.25F, 0.05F, 0.1F, new CubeDeformation(0.0F)).texOffs(45, 122)
						.addBox(-1.625F, -0.125F, -0.15F, 3.25F, 0.75F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.625F, 5.4F, 2.3F, -0.0349F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}