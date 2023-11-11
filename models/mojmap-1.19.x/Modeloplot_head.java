// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeloplot_head<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "oplot_head"), "main");
	private final ModelPart Head;

	public Modeloplot_head(ModelPart root) {
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(53, 125)
				.addBox(-3.7F, -8.2F, -4.8F, 3.225F, 2.1F, 0.6F, new CubeDeformation(0.0F)).texOffs(55, 123)
				.addBox(-3.7F, -3.6F, -4.8F, 3.2F, 3.6F, 0.6F, new CubeDeformation(0.0F)).texOffs(63, 122)
				.addBox(1.5F, -3.6F, -4.8F, 3.2F, 3.6F, 0.6F, new CubeDeformation(0.0F)).texOffs(66, 123)
				.addBox(0.3F, -3.6F, -5.135F, 0.4F, 3.75F, 0.9F, new CubeDeformation(0.0F)).texOffs(45, 125)
				.addBox(-3.5F, -5.8F, -4.7F, 2.0F, 2.2F, 0.5F, new CubeDeformation(0.0F)).texOffs(55, 122)
				.addBox(-3.7F, -8.7F, -4.8F, 0.2F, 5.1F, 0.6F, new CubeDeformation(0.0F)).texOffs(56, 120)
				.addBox(0.5F, -5.8F, -4.5F, 2.0F, 2.2F, 0.3F, new CubeDeformation(0.0F)).texOffs(126, 125)
				.addBox(0.4F, -5.8F, -4.6F, 0.2F, 2.2F, 0.4F, new CubeDeformation(0.0F)).texOffs(115, 120)
				.addBox(-1.5F, -5.8F, -4.6F, 0.1F, 2.2F, 0.4F, new CubeDeformation(0.0F)).texOffs(116, 123)
				.addBox(-1.6F, -5.8F, -4.8F, 0.1F, 2.2F, 0.6F, new CubeDeformation(0.0F)).texOffs(126, 125)
				.addBox(-3.5F, -5.8F, -4.8F, 0.1F, 2.2F, 0.6F, new CubeDeformation(0.0F)).texOffs(120, 119)
				.addBox(-3.45F, -3.7F, -4.8F, 1.9F, 0.1F, 0.6F, new CubeDeformation(0.0F)).texOffs(79, 39)
				.addBox(-3.45F, -5.8F, -4.6F, 1.9F, 0.1F, 0.6F, new CubeDeformation(0.0F)).texOffs(125, 125)
				.addBox(2.5F, -5.8F, -4.8F, 0.1F, 2.2F, 0.6F, new CubeDeformation(0.0F)).texOffs(119, 124)
				.addBox(2.55F, -3.7F, -4.8F, 1.9F, 0.1F, 0.6F, new CubeDeformation(0.0F)).texOffs(118, 121)
				.addBox(4.4F, -5.8F, -4.8F, 0.1F, 2.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(79, 25)
				.addBox(2.55F, -5.8F, -4.6F, 1.9F, 0.1F, 0.6F, new CubeDeformation(0.0F)).texOffs(127, 123)
				.addBox(2.4F, -5.8F, -4.6F, 0.1F, 2.2F, 0.4F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-1.5F, -5.8F, -4.4F, 4.0F, 0.1F, 0.4F, new CubeDeformation(0.0F)).texOffs(118, 127)
				.addBox(-1.5F, -3.7F, -4.6F, 4.0F, 0.1F, 0.4F, new CubeDeformation(0.0F)).texOffs(4, 118)
				.addBox(-0.6339F, -5.4F, -5.1983F, 0.28F, 1.4F, 0.75F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(-0.6339F, -5.5F, -5.1983F, 0.32F, 1.6F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(-1.2739F, -4.86F, -5.1983F, 1.6F, 0.32F, 0.3F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-0.6339F, -5.5F, -5.2983F, 0.32F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-0.6339F, -4.0F, -5.2983F, 0.32F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(0.2261F, -4.86F, -5.2983F, 0.1F, 0.32F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-1.2739F, -4.86F, -5.2983F, 0.1F, 0.32F, 0.1F, new CubeDeformation(0.0F)).texOffs(21, 126)
				.addBox(-1.1939F, -4.84F, -5.2483F, 1.4F, 0.28F, 0.1F, new CubeDeformation(0.0F)).texOffs(21, 126)
				.addBox(-0.6339F, -5.4F, -5.2483F, 0.28F, 1.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(13, 122)
				.addBox(-1.1939F, -4.84F, -5.1983F, 1.4F, 0.28F, 0.75F, new CubeDeformation(0.0F)).texOffs(67, 125)
				.addBox(-1.5F, -5.8F, -4.5F, 2.0F, 2.2F, 0.3F, new CubeDeformation(0.0F)).texOffs(58, 125)
				.addBox(2.5F, -5.8F, -4.7F, 2.2F, 2.2F, 0.5F, new CubeDeformation(0.0F)).texOffs(122, 126)
				.addBox(2.68F, -2.1F, -5.1F, 0.62F, 1.5F, 0.3F, new CubeDeformation(0.0F)).texOffs(124, 127)
				.addBox(-2.66F, -1.66F, -5.1F, 1.5F, 0.62F, 0.3F, new CubeDeformation(0.0F)).texOffs(124, 126)
				.addBox(-2.22F, -2.1F, -5.1F, 0.62F, 1.5F, 0.3F, new CubeDeformation(0.0F)).texOffs(121, 127)
				.addBox(2.24F, -1.66F, -5.1F, 1.5F, 0.62F, 0.3F, new CubeDeformation(0.0F)).texOffs(107, 125)
				.addBox(-4.2F, -6.1F, -5.0F, 9.375F, 0.3F, 1.07F, new CubeDeformation(0.0F)).texOffs(107, 126)
				.addBox(-3.5F, -3.6F, -5.0F, 8.7F, 0.3F, 1.1F, new CubeDeformation(0.0F)).texOffs(0, 115)
				.addBox(-4.145F, -8.7F, -3.98F, 0.445F, 8.7F, 2.9F, new CubeDeformation(0.0F)).texOffs(0, 111)
				.addBox(4.775F, -8.2F, -3.9F, 0.4F, 8.2F, 7.9F, new CubeDeformation(0.0F)).texOffs(0, 118)
				.addBox(-4.15F, -7.3F, -1.1F, 0.45F, 7.3F, 2.0F, new CubeDeformation(0.0F)).texOffs(51, 117)
				.addBox(-3.7F, -8.2F, -1.1F, 0.2F, 0.9F, 2.0F, new CubeDeformation(0.0F)).texOffs(115, 123)
				.addBox(-4.0F, -8.6F, -0.9F, 0.1F, 1.0F, 1.6F, new CubeDeformation(0.0F)).texOffs(114, 126)
				.addBox(-3.7F, -8.6F, -0.9F, 0.8F, 0.2F, 1.6F, new CubeDeformation(0.0F)).texOffs(118, 122)
				.addBox(-3.9F, -8.6F, -0.9F, 0.2F, 0.2F, 1.6F, new CubeDeformation(0.0F)).texOffs(49, 116)
				.addBox(-4.15F, -8.2F, 0.9F, 0.45F, 8.2F, 3.25F, new CubeDeformation(0.0F)).texOffs(69, 12)
				.addBox(-4.17F, -3.6F, -5.0F, 0.67F, 0.3F, 1.02F, new CubeDeformation(0.0F)).texOffs(55, 124)
				.addBox(1.5F, -8.7F, 0.9F, 3.675F, 0.5F, 3.5F, new CubeDeformation(0.0F)).texOffs(41, 118)
				.addBox(-4.15F, -8.7F, 0.9F, 3.675F, 0.5F, 3.5F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-0.5F, -8.5F, -4.6F, 2.025F, 0.3F, 8.9F, new CubeDeformation(0.0F)).texOffs(20, 72)
				.addBox(-0.5F, -8.2F, 4.2F, 2.025F, 8.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(52, 124)
				.addBox(-2.825F, -8.7F, -1.1F, 2.35F, 0.5F, 2.0F, new CubeDeformation(0.0F)).texOffs(43, 124)
				.addBox(-3.725F, -8.7F, -3.7F, 3.25F, 0.5F, 2.6F, new CubeDeformation(0.0F)).texOffs(50, 124)
				.addBox(1.5F, -8.7F, -1.1F, 3.675F, 0.5F, 2.0F, new CubeDeformation(0.0F)).texOffs(115, 125)
				.addBox(-3.5F, -8.2F, -1.1F, 0.8F, 0.2F, 2.0F, new CubeDeformation(0.0F)).texOffs(51, 124)
				.addBox(1.5F, -8.7F, -3.9F, 3.675F, 0.5F, 2.8F, new CubeDeformation(0.0F)).texOffs(53, 126)
				.addBox(1.5F, -8.7F, -4.7F, 3.175F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 126)
				.addBox(-3.725F, -8.7F, -4.75F, 3.25F, 0.5F, 1.05F, new CubeDeformation(0.0F)).texOffs(50, 125)
				.addBox(-3.65F, -8.7F, -4.8F, 3.175F, 0.5F, 0.45F, new CubeDeformation(0.0F)).texOffs(59, 127)
				.addBox(1.5F, -8.7F, -4.8F, 3.2F, 0.5F, 0.3F, new CubeDeformation(0.0F)).texOffs(120, 120)
				.addBox(-0.5F, -7.0F, -4.7F, 2.0F, 0.9F, 0.5F, new CubeDeformation(0.0F)).texOffs(55, 125)
				.addBox(1.5F, -8.2F, -4.8F, 3.2F, 2.1F, 0.6F, new CubeDeformation(0.0F)).texOffs(46, 16)
				.addBox(-0.5F, -8.2F, -4.6F, 2.0F, 1.4F, 0.4F, new CubeDeformation(0.0F)).texOffs(79, 7)
				.addBox(-0.5F, -8.2F, -4.2F, 2.0F, 1.4F, 0.7F, new CubeDeformation(0.0F)).texOffs(8, 113)
				.addBox(0.7539F, -4.84F, -5.1983F, 1.4F, 0.28F, 0.75F, new CubeDeformation(0.0F)).texOffs(21, 126)
				.addBox(1.3139F, -5.4F, -5.2483F, 0.28F, 1.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(21, 126)
				.addBox(0.7539F, -4.84F, -5.2483F, 1.4F, 0.28F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(0.6739F, -4.86F, -5.2983F, 0.1F, 0.32F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(2.1739F, -4.86F, -5.2983F, 0.1F, 0.32F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(1.3139F, -4.0F, -5.2983F, 0.32F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(1.3139F, -5.5F, -5.2983F, 0.32F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(0.6739F, -4.86F, -5.1983F, 1.6F, 0.32F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(1.3139F, -5.5F, -5.1983F, 0.32F, 1.6F, 0.3F, new CubeDeformation(0.0F)).texOffs(14, 125)
				.addBox(-2.6082F, -5.4F, -5.2932F, 0.28F, 1.4F, 0.75F, new CubeDeformation(0.0F)).texOffs(5, 122)
				.addBox(1.3139F, -5.4F, -5.1983F, 0.28F, 1.4F, 0.75F, new CubeDeformation(0.0F)).texOffs(5, 116)
				.addBox(-3.1682F, -4.84F, -5.2932F, 1.4F, 0.28F, 0.75F, new CubeDeformation(0.0F)).texOffs(21, 126)
				.addBox(-3.1682F, -4.84F, -5.3432F, 1.4F, 0.28F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-3.2482F, -4.86F, -5.3932F, 0.1F, 0.32F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-1.7482F, -4.86F, -5.3932F, 0.1F, 0.32F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-2.6082F, -4.0F, -5.3932F, 0.32F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-2.6082F, -5.5F, -5.3932F, 0.32F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(-3.2482F, -4.86F, -5.2932F, 1.6F, 0.32F, 0.3F, new CubeDeformation(0.0F)).texOffs(1, 125)
				.addBox(3.3882F, -5.4F, -5.2932F, 0.28F, 1.4F, 0.75F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(3.3882F, -5.5F, -5.2932F, 0.32F, 1.6F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(2.7482F, -4.86F, -5.2932F, 1.6F, 0.32F, 0.3F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(3.3882F, -5.5F, -5.3932F, 0.32F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(3.3882F, -4.0F, -5.3932F, 0.32F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(4.2482F, -4.86F, -5.3932F, 0.1F, 0.32F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(2.7482F, -4.86F, -5.3932F, 0.1F, 0.32F, 0.1F, new CubeDeformation(0.0F)).texOffs(21, 126)
				.addBox(2.8282F, -4.84F, -5.3432F, 1.4F, 0.28F, 0.1F, new CubeDeformation(0.0F)).texOffs(21, 126)
				.addBox(3.3882F, -5.4F, -5.3432F, 0.28F, 1.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(23, 108)
				.addBox(2.8282F, -4.84F, -5.2932F, 1.4F, 0.28F, 0.75F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(-2.6082F, -5.5F, -5.2932F, 0.32F, 1.6F, 0.3F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 109)
				.addBox(3.8963F, -3.3234F, -5.0932F, 1.4F, 0.28F, 0.75F, new CubeDeformation(0.0F)).texOffs(0, 124)
				.addBox(4.4563F, -3.8834F, -5.0932F, 0.28F, 1.4F, 0.75F, new CubeDeformation(0.0F)).texOffs(21, 126)
				.addBox(3.8963F, -3.3234F, -5.1432F, 1.4F, 0.28F, 0.1F, new CubeDeformation(0.0F)).texOffs(21, 126)
				.addBox(4.4563F, -3.8834F, -5.1432F, 0.28F, 1.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(3.8148F, -3.3357F, -5.1932F, 0.1F, 0.32F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(5.3148F, -3.3357F, -5.1932F, 0.1F, 0.32F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(4.4548F, -2.4757F, -5.1932F, 0.32F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(4.4548F, -3.9757F, -5.1932F, 0.32F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(4.4548F, -3.9757F, -5.0932F, 0.32F, 1.6F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(3.8148F, -3.3357F, -5.0932F, 1.6F, 0.32F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(-1.7252F, -5.6305F, -5.0932F, 1.6F, 0.32F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(-1.0852F, -6.2705F, -5.0932F, 0.32F, 1.6F, 0.3F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-1.0852F, -6.2705F, -5.1932F, 0.32F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-1.0852F, -4.7705F, -5.1932F, 0.32F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-0.2252F, -5.6305F, -5.1932F, 0.1F, 0.32F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-1.7252F, -5.6305F, -5.1932F, 0.1F, 0.32F, 0.1F, new CubeDeformation(0.0F)).texOffs(21, 126)
				.addBox(-1.0837F, -6.1781F, -5.1432F, 0.28F, 1.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(21, 126)
				.addBox(-1.6437F, -5.6181F, -5.1432F, 1.4F, 0.28F, 0.1F, new CubeDeformation(0.0F)).texOffs(22, 123)
				.addBox(-1.0837F, -6.1781F, -5.0932F, 0.28F, 1.4F, 0.75F, new CubeDeformation(0.0F)).texOffs(2, 120)
				.addBox(-1.6437F, -5.6181F, -5.0932F, 1.4F, 0.28F, 0.75F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(1.8984F, -4.1295F, -4.9983F, 1.6F, 0.32F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(2.5384F, -4.7695F, -4.9983F, 0.32F, 1.6F, 0.3F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(2.5384F, -4.7695F, -5.0983F, 0.32F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(2.5384F, -3.2695F, -5.0983F, 0.32F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(3.3984F, -4.1295F, -5.0983F, 0.1F, 0.32F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(1.8984F, -4.1295F, -5.0983F, 0.1F, 0.32F, 0.1F, new CubeDeformation(0.0F)).texOffs(21, 126)
				.addBox(2.5399F, -4.6772F, -5.0483F, 0.28F, 1.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(21, 126)
				.addBox(1.9799F, -4.1172F, -5.0483F, 1.4F, 0.28F, 0.1F, new CubeDeformation(0.0F)).texOffs(5, 116)
				.addBox(2.5399F, -4.6772F, -4.9983F, 0.28F, 1.4F, 0.75F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(1.9799F, -4.1172F, -4.9983F, 1.4F, 0.28F, 0.75F, new CubeDeformation(0.0F)).texOffs(0, 111)
				.addBox(0.1804F, -4.8626F, -4.9983F, 1.4F, 0.28F, 0.75F, new CubeDeformation(0.0F)).texOffs(0, 123)
				.addBox(0.7404F, -5.4226F, -4.9983F, 0.28F, 1.4F, 0.75F, new CubeDeformation(0.0F)).texOffs(21, 126)
				.addBox(0.1804F, -4.8626F, -5.0483F, 1.4F, 0.28F, 0.1F, new CubeDeformation(0.0F)).texOffs(21, 126)
				.addBox(0.7404F, -5.4226F, -5.0483F, 0.28F, 1.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(0.0989F, -4.8749F, -5.0983F, 0.1F, 0.32F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(1.5989F, -4.8749F, -5.0983F, 0.1F, 0.32F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(0.7389F, -4.0149F, -5.0983F, 0.32F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(0.7389F, -5.5149F, -5.0983F, 0.32F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(0.7389F, -5.5149F, -4.9983F, 0.32F, 1.6F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(0.0989F, -4.8749F, -4.9983F, 1.6F, 0.32F, 0.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 0.0F, -0.2F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 122)
				.addBox(-1.8821F, -5.6047F, -5.0932F, 1.4F, 0.28F, 0.75F, new CubeDeformation(0.0F)).texOffs(21, 126)
				.addBox(-1.3221F, -6.1647F, -5.1432F, 0.28F, 1.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(21, 126)
				.addBox(-1.8821F, -5.6047F, -5.1432F, 1.4F, 0.28F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 119)
				.addBox(-1.3221F, -6.1647F, -5.0932F, 0.28F, 1.4F, 0.75F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-1.328F, -4.7788F, -5.1932F, 0.32F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-1.328F, -6.2788F, -5.1932F, 0.32F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-1.968F, -5.6388F, -5.1932F, 0.1F, 0.32F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-0.468F, -5.6388F, -5.1932F, 0.1F, 0.32F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(-1.968F, -5.6388F, -5.0932F, 1.6F, 0.32F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(-1.328F, -6.2788F, -5.0932F, 0.32F, 1.6F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(-5.5681F, -2.0387F, -5.0932F, 0.32F, 1.6F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(-6.2081F, -1.3987F, -5.0932F, 1.6F, 0.32F, 0.3F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-4.7081F, -1.3987F, -5.1932F, 0.1F, 0.32F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-6.2081F, -1.3987F, -5.1932F, 0.1F, 0.32F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-5.5681F, -2.0387F, -5.1932F, 0.32F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-5.5681F, -0.5387F, -5.1932F, 0.32F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 125)
				.addBox(-5.5623F, -1.9245F, -5.0932F, 0.28F, 1.4F, 0.75F, new CubeDeformation(0.0F)).texOffs(21, 126)
				.addBox(-6.1223F, -1.3645F, -5.1432F, 1.4F, 0.28F, 0.1F, new CubeDeformation(0.0F)).texOffs(21, 126)
				.addBox(-5.5623F, -1.9245F, -5.1432F, 0.28F, 1.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(5, 124)
				.addBox(-6.1223F, -1.3645F, -5.0932F, 1.4F, 0.28F, 0.75F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(-2.7948F, -4.812F, -4.9983F, 0.32F, 1.6F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(-3.4348F, -4.172F, -4.9983F, 1.6F, 0.32F, 0.3F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-1.9348F, -4.172F, -5.0983F, 0.1F, 0.32F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-3.4348F, -4.172F, -5.0983F, 0.1F, 0.32F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-2.7948F, -4.812F, -5.0983F, 0.32F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-2.7948F, -3.312F, -5.0983F, 0.32F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(16, 125)
				.addBox(-2.7889F, -4.6979F, -4.9983F, 0.28F, 1.4F, 0.75F, new CubeDeformation(0.0F)).texOffs(21, 126)
				.addBox(-3.3489F, -4.1379F, -5.0483F, 1.4F, 0.28F, 0.1F, new CubeDeformation(0.0F)).texOffs(21, 126)
				.addBox(-2.7889F, -4.6979F, -5.0483F, 0.28F, 1.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(3, 118)
				.addBox(-3.3489F, -4.1379F, -4.9983F, 1.4F, 0.28F, 0.75F, new CubeDeformation(0.0F)).texOffs(118, 127)
				.addBox(-10.4496F, -2.3146F, -0.2F, 0.1F, 0.4F, 0.6F, new CubeDeformation(0.0F)).texOffs(124, 127)
				.addBox(0.0561F, -3.0253F, -4.9F, 1.5F, 0.62F, 0.3F, new CubeDeformation(0.0F)).texOffs(126, 125)
				.addBox(0.4961F, -3.4653F, -4.9F, 0.62F, 1.5F, 0.3F, new CubeDeformation(0.0F)).texOffs(124, 127)
				.addBox(-3.4087F, 0.4395F, -4.9F, 1.5F, 0.62F, 0.3F, new CubeDeformation(0.0F)).texOffs(126, 126)
				.addBox(-2.9687F, -0.0005F, -4.9F, 0.62F, 1.5F, 0.3F, new CubeDeformation(0.0F)).texOffs(13, 123)
				.addBox(-4.7262F, -2.7606F, -4.9983F, 1.4F, 0.28F, 0.75F, new CubeDeformation(0.0F)).texOffs(21, 126)
				.addBox(-4.1662F, -3.3206F, -5.0483F, 0.28F, 1.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(21, 126)
				.addBox(-4.7262F, -2.7606F, -5.0483F, 1.4F, 0.28F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 118)
				.addBox(-4.1662F, -3.3206F, -4.9983F, 0.28F, 1.4F, 0.75F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-4.172F, -1.9348F, -5.0983F, 0.32F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-4.172F, -3.4348F, -5.0983F, 0.32F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-4.812F, -2.7948F, -5.0983F, 0.1F, 0.32F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-3.312F, -2.7948F, -5.0983F, 0.1F, 0.32F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(-4.812F, -2.7948F, -4.9983F, 1.6F, 0.32F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(-4.172F, -3.4348F, -4.9983F, 0.32F, 1.6F, 0.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 0.0F, -0.2F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 126)
				.addBox(0.2991F, -5.6411F, -5.0932F, 1.4F, 0.28F, 0.75F, new CubeDeformation(0.0F)).texOffs(21, 126)
				.addBox(0.8591F, -6.2011F, -5.1432F, 0.28F, 1.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(21, 126)
				.addBox(0.2991F, -5.6411F, -5.1432F, 1.4F, 0.28F, 0.1F, new CubeDeformation(0.0F)).texOffs(7, 115)
				.addBox(0.8591F, -6.2011F, -5.0932F, 0.28F, 1.4F, 0.75F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(0.2176F, -5.6687F, -5.1932F, 0.1F, 0.32F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(1.7176F, -5.6687F, -5.1932F, 0.1F, 0.32F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(0.8576F, -4.8087F, -5.1932F, 0.32F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(0.8576F, -6.3087F, -5.1932F, 0.32F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(0.2176F, -5.6687F, -5.0932F, 1.6F, 0.32F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(0.8576F, -6.3087F, -5.0932F, 0.32F, 1.6F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(-4.6824F, -4.014F, -5.0932F, 0.32F, 1.6F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(-5.3224F, -3.374F, -5.0932F, 1.6F, 0.32F, 0.3F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-4.6824F, -4.014F, -5.1932F, 0.32F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-4.6824F, -2.514F, -5.1932F, 0.32F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-3.8224F, -3.374F, -5.1932F, 0.1F, 0.32F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-5.3224F, -3.374F, -5.1932F, 0.1F, 0.32F, 0.1F, new CubeDeformation(0.0F)).texOffs(2, 125)
				.addBox(-4.6809F, -3.9063F, -5.0932F, 0.28F, 1.4F, 0.75F, new CubeDeformation(0.0F)).texOffs(21, 126)
				.addBox(-5.2409F, -3.3463F, -5.1432F, 1.4F, 0.28F, 0.1F, new CubeDeformation(0.0F)).texOffs(21, 126)
				.addBox(-4.6809F, -3.9063F, -5.1432F, 0.28F, 1.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(5, 125)
				.addBox(-5.2409F, -3.3463F, -5.0932F, 1.4F, 0.28F, 0.75F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(-1.0589F, -5.5149F, -4.9983F, 0.32F, 1.6F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(-1.6989F, -4.8749F, -4.9983F, 1.6F, 0.32F, 0.3F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-1.0589F, -5.5149F, -5.0983F, 0.32F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-1.0589F, -4.0149F, -5.0983F, 0.32F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-0.1989F, -4.8749F, -5.0983F, 0.1F, 0.32F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-1.6989F, -4.8749F, -5.0983F, 0.1F, 0.32F, 0.1F, new CubeDeformation(0.0F)).texOffs(7, 125)
				.addBox(-1.0573F, -5.4073F, -4.9983F, 0.28F, 1.4F, 0.75F, new CubeDeformation(0.0F)).texOffs(21, 126)
				.addBox(-1.6173F, -4.8473F, -5.0483F, 1.4F, 0.28F, 0.1F, new CubeDeformation(0.0F)).texOffs(21, 126)
				.addBox(-1.0573F, -5.4073F, -5.0483F, 0.28F, 1.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(8, 116)
				.addBox(-1.6173F, -4.8473F, -4.9983F, 1.4F, 0.28F, 0.75F, new CubeDeformation(0.0F)).texOffs(22, 107)
				.addBox(-3.4169F, -4.1019F, -4.9983F, 1.4F, 0.28F, 0.75F, new CubeDeformation(0.0F)).texOffs(21, 126)
				.addBox(-2.8569F, -4.6619F, -5.0483F, 0.28F, 1.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(21, 126)
				.addBox(-3.4169F, -4.1019F, -5.0483F, 1.4F, 0.28F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 118)
				.addBox(-2.8569F, -4.6619F, -4.9983F, 0.28F, 1.4F, 0.75F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-3.4984F, -4.1295F, -5.0983F, 0.1F, 0.32F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-1.9984F, -4.1295F, -5.0983F, 0.1F, 0.32F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-2.8584F, -3.2695F, -5.0983F, 0.32F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(123, 122)
				.addBox(-2.8584F, -4.7695F, -5.0983F, 0.32F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(-3.4984F, -4.1295F, -4.9983F, 1.6F, 0.32F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 126)
				.addBox(-2.8584F, -4.7695F, -4.9983F, 0.32F, 1.6F, 0.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 0.0F, -0.2F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(21, 126).addBox(-3.5408F, -5.4F, -4.8651F, 0.28F, 1.4F, 0.1F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 0.0F, -0.2F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r5 = Head.addOrReplaceChild(
				"cube_r5", CubeListBuilder.create().texOffs(61, 118).addBox(-5.8576F, -8.7F, -2.1463F, 0.5F, 8.9F,
						0.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 0.0F, -0.2F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r6 = Head
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(59, 118).addBox(5.3681F, -8.7F, -2.1248F, 0.5F, 8.9F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.5F, 0.0F, -0.2F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(122, 126).addBox(7.0843F, 6.5128F, -0.2F, 0.1F, 0.5F, 0.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 0.0F, -0.2F, 0.0F, 0.0F, -2.8798F));

		PartDefinition cube_r8 = Head
				.addOrReplaceChild("cube_r8",
						CubeListBuilder.create().texOffs(121, 126).addBox(-0.8055F, 9.9069F, -0.2F, 0.1F, 0.5F, 0.6F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.5F, 0.0F, -0.2F, 0.0F, 0.0F, 2.5307F));

		PartDefinition cube_r9 = Head.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(118, 126).addBox(9.4823F, -2.1501F, -0.2F, 0.1F, 0.5F, 0.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 0.0F, -0.2F, 0.0F, 0.0F, -1.9635F));

		PartDefinition cube_r10 = Head.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(116, 126).addBox(-4.0546F, -9.8507F, -0.2F, 0.125F, 0.625F, 0.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r11 = Head.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(126, 127).addBox(4.0694F, -9.2262F, -0.2F, 0.1F, 0.4F, 0.6F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 0.0F, -0.2F, 0.0F, 0.0F, -1.0472F));

		PartDefinition cube_r12 = Head.addOrReplaceChild(
				"cube_r12", CubeListBuilder.create().texOffs(126, 126).addBox(-8.1948F, 6.3867F, -0.2F, 0.1F, 0.5F,
						0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 0.0F, -0.2F, 0.0F, 0.0F, 1.7017F));

		PartDefinition cube_r13 = Head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(120, 124)
				.addBox(0.2622F, -10.4306F, -0.5F, 1.2F, 0.52F, 1.2F, new CubeDeformation(0.0F)).texOffs(118, 126)
				.addBox(0.4622F, -10.4106F, -0.4F, 0.4F, 1.5F, 0.3F, new CubeDeformation(0.0F)).texOffs(113, 126)
				.addBox(0.3547F, -10.2419F, 0.3F, 0.4F, 1.5F, 0.3F, new CubeDeformation(0.0F)).texOffs(122, 125)
				.addBox(0.9622F, -10.4106F, -0.4F, 0.4F, 1.1F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 0.0F, -0.2F, 0.0F, 0.0F, -0.5672F));

		PartDefinition cube_r14 = Head.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(50, 125)
						.addBox(-3.725F, 0.0F, -4.675F, 8.325F, 0.2F, 0.525F, new CubeDeformation(0.0F))
						.texOffs(45, 127).addBox(-3.75F, 0.0F, 4.2F, 8.35F, 0.2F, 0.45F, new CubeDeformation(0.0F))
						.texOffs(41, 119).addBox(-4.6F, 0.0F, -4.2F, 9.2F, 0.2F, 8.4F, new CubeDeformation(0.0F))
						.texOffs(0, 116).addBox(4.2F, -8.2F, 0.975F, 0.4F, 8.2F, 3.675F, new CubeDeformation(0.0F))
						.texOffs(0, 116).addBox(4.2F, -8.2F, -4.675F, 0.4F, 8.2F, 3.675F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 0.0F, -0.2F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r15 = Head
				.addOrReplaceChild("cube_r15",
						CubeListBuilder.create().texOffs(62, 123).addBox(0.535F, -3.6F, -4.7057F, 1.0F, 3.75F, 0.8F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.5F, 0.0F, -0.2F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r16 = Head.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(66, 123).addBox(-1.535F, -3.6F, -4.7057F, 1.0F, 3.75F, 0.8F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 0.0F, -0.2F, 0.0F, -0.3491F, 0.0F));

		PartDefinition group2 = Head.addOrReplaceChild("group2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.008F, -4.7F, -4.915F, 0.0F, 0.1309F, 0.0F));

		PartDefinition bone = Head.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(-5.5755F, -8.2953F, -0.2F));

		PartDefinition group3 = Head.addOrReplaceChild("group3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.992F, -4.7F, -4.915F, 0.0F, -0.1745F, 0.0F));

		PartDefinition group4 = Head.addOrReplaceChild("group4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-3.008F, -4.7F, -5.015F, 0.1309F, 0.2618F, 0.0F));

		PartDefinition group = Head.addOrReplaceChild("group", CubeListBuilder.create(),
				PartPose.offsetAndRotation(3.092F, -4.7F, -5.015F, 0.0F, -0.2618F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
	}
}