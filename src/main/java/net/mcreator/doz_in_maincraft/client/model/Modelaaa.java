package net.mcreator.doz_in_maincraft.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelaaa<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("doz_in_maincraft", "modelaaa"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;
	public final ModelPart Leftbot;
	public final ModelPart Rightbot;

	public Modelaaa(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.Leftbot = root.getChild("Leftbot");
		this.Rightbot = root.getChild("Rightbot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(142, 0).addBox(-4.2F, -8.2F, -4.2F, 8.4F, 8.2F, 8.4F, new CubeDeformation(0.0F)).texOffs(151, 164).addBox(1.3F, -8.7F, -4.7F, 3.1F, 2.0F, 9.2F, new CubeDeformation(0.0F)).texOffs(151, 164)
						.addBox(-4.4F, -8.7F, -4.7F, 3.1F, 2.0F, 9.2F, new CubeDeformation(0.0F)).texOffs(154, 165).addBox(-1.3F, -8.7F, -4.2F, 2.6F, 2.0F, 8.4F, new CubeDeformation(0.0F)).texOffs(170, 168)
						.addBox(-1.3F, -8.7F, 4.2F, 2.6F, 7.5F, 0.3F, new CubeDeformation(0.0F)).texOffs(32, 0).addBox(-4.2F, 0.0F, -4.325F, 8.4F, 0.1F, 8.525F, new CubeDeformation(0.0F)).texOffs(16, 167)
						.addBox(-1.5F, -6.1F, -4.4F, 3.0F, 1.3F, 0.2F, new CubeDeformation(0.0F)).texOffs(14, 81).addBox(-4.2F, -8.2F, -4.4F, 8.4F, 2.1F, 0.2F, new CubeDeformation(0.0F)).texOffs(170, 168)
						.addBox(-1.3F, -8.7F, -4.6F, 2.6F, 2.1F, 0.4F, new CubeDeformation(0.0F)).texOffs(30, 167).addBox(-4.2F, -8.2F, -4.4F, 0.6F, 3.4F, 0.2F, new CubeDeformation(0.0F)).texOffs(30, 164)
						.addBox(3.5F, -8.2F, -4.4F, 0.7F, 3.4F, 0.2F, new CubeDeformation(0.0F)).texOffs(30, 87).addBox(-4.2F, -4.8F, -4.4F, 8.4F, 1.4F, 0.2F, new CubeDeformation(0.0F)).texOffs(158, 0)
						.addBox(-4.2F, -3.4F, -4.325F, 8.4F, 3.4F, 0.125F, new CubeDeformation(0.0F)).texOffs(159, 171).addBox(-4.1F, -8.1F, -4.3F, 8.2F, 4.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 150)
						.addBox(-1.8F, -3.8F, -5.2F, 3.6F, 2.3F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 147).addBox(-1.7F, -2.7947F, -4.8191F, 3.4F, 2.3F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 172)
						.addBox(4.2F, 0.0F, -4.2F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(0, 146).addBox(-1.375F, -0.25F, -0.5F, 2.95F, 1.5F, 1.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, -4.0489F, -4.6994F, 0.925F, 0.0F, 0.0F));
		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(0, 155).addBox(-1.6F, -0.5375F, -0.5F, 3.4F, 1.075F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, -1.1745F, -4.542F, 0.3622F, 0.0F, 0.0F));
		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(24, 164).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 1.525F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9604F, -2.7805F, -4.675F, 0.0F, 0.0F, 0.9076F));
		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4",
				CubeListBuilder.create().texOffs(4, 171).addBox(-0.15F, -0.475F, -0.1F, 0.2F, 0.975F, 0.2F, new CubeDeformation(0.0F)).texOffs(2, 172).addBox(-0.45F, -0.175F, -0.2F, 0.3F, 0.375F, 0.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8999F, -2.1797F, -4.675F, -1.5708F, 0.0F, -0.0087F));
		PartDefinition Head_r5 = Head
				.addOrReplaceChild(
						"Head_r5", CubeListBuilder.create().texOffs(16, 165).addBox(-0.5968F, -8.7375F, -0.2F, 3.55F, 0.25F, 0.4F, new CubeDeformation(0.0F)).texOffs(8, 155)
								.addBox(-0.5968F, -8.4875F, -0.2F, 0.25F, 8.65F, 0.4F, new CubeDeformation(0.0F)).texOffs(34, 168).addBox(-0.3468F, -0.0875F, -0.2F, 0.525F, 0.25F, 0.4F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-3.8532F, -2.1713F, -4.2867F, -1.5708F, 0.0F, 0.0F));
		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(34, 168).addBox(-0.325F, -0.1875F, -0.2F, 0.475F, 0.375F, 0.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6091F, -2.1735F, -4.5295F, -1.5708F, 0.7636F, -0.0087F));
		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(2, 172).addBox(-0.15F, -0.1875F, -0.2F, 0.3F, 0.375F, 0.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4237F, -2.1751F, -4.6465F, -1.5708F, 0.3622F, -0.0087F));
		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(4, 171).addBox(-0.15F, -0.45F, -0.1F, 0.2F, 0.9F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8999F, -2.1797F, -4.675F, -1.309F, 0.0F, -0.0087F));
		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(4, 171).addBox(-0.15F, -0.45F, -0.1F, 0.2F, 0.9F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8999F, -2.1797F, -4.675F, -1.8326F, 0.0F, -0.0087F));
		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(4, 171).addBox(-0.15F, -0.45F, -0.1F, 0.2F, 0.9F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8999F, -2.1797F, -4.675F, -2.2689F, 0.0F, -0.0087F));
		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(4, 171).addBox(-0.15F, -0.45F, -0.1F, 0.2F, 0.9F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8999F, -2.1797F, -4.675F, -2.7053F, 0.0F, -0.0087F));
		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(4, 171).addBox(-0.15F, -0.45F, -0.1F, 0.2F, 0.9F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8999F, -2.1797F, -4.675F, -0.8727F, 0.0F, -0.0087F));
		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(4, 171).addBox(-0.15F, -0.45F, -0.1F, 0.2F, 0.9F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8999F, -2.1797F, -4.675F, -0.4363F, 0.0F, -0.0087F));
		PartDefinition Head_r14 = Head.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(4, 171).addBox(-0.15F, -0.45F, -0.1F, 0.2F, 0.9F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8999F, -2.1797F, -4.675F, 0.0F, 0.0F, -0.0087F));
		PartDefinition Head_r15 = Head.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(62, 140).addBox(-2.2625F, -0.55F, -0.5F, 4.525F, 1.225F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5875F, -2.1998F, -4.675F, 0.0F, 0.0F, -0.0087F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(150, 0).addBox(-4.2F, -0.15F, -2.2F, 8.4F, 12.15F, 4.4F, new CubeDeformation(0.0F)).texOffs(34, 96).addBox(4.2F, -0.2F, -2.2F, 0.075F, 4.475F, 4.4F, new CubeDeformation(0.0F)).texOffs(8, 166)
						.addBox(-4.275F, -0.2F, -2.2F, 0.075F, 4.475F, 4.4F, new CubeDeformation(0.0F)).texOffs(60, 62).addBox(4.2F, 4.275F, -2.2F, 0.025F, 7.725F, 4.4F, new CubeDeformation(0.0F)).texOffs(52, 62)
						.addBox(-4.225F, 4.275F, -2.2F, 0.025F, 7.725F, 4.4F, new CubeDeformation(0.0F)).texOffs(24, 164).addBox(-3.9F, 0.65F, -2.3F, 0.2F, 6.75F, 0.1F, new CubeDeformation(0.0F)).texOffs(159, 0)
						.addBox(-4.2F, 8.725F, -2.275F, 8.4F, 2.675F, 0.075F, new CubeDeformation(0.0F)).texOffs(60, 104).addBox(-4.3F, 8.725F, -2.275F, 0.1F, 2.675F, 4.475F, new CubeDeformation(0.0F)).texOffs(0, 89)
						.addBox(-4.3F, 0.85F, 2.2F, 8.6F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(10, 146).addBox(-2.7F, 6.55F, 2.2F, 5.4F, 1.05F, 0.1F, new CubeDeformation(0.0F)).texOffs(14, 134)
						.addBox(-2.7F, 1.85F, 2.2F, 5.4F, 3.75F, 0.1F, new CubeDeformation(0.0F)).texOffs(60, 94).addBox(-4.2F, 0.85F, -2.275F, 8.4F, 1.0F, 0.075F, new CubeDeformation(0.0F)).texOffs(40, 134)
						.addBox(4.2F, 0.85F, -2.275F, 0.1F, 1.0F, 4.475F, new CubeDeformation(0.0F)).texOffs(48, 134).addBox(-4.3F, 0.85F, -2.275F, 0.1F, 1.0F, 4.475F, new CubeDeformation(0.0F)).texOffs(52, 104)
						.addBox(4.2F, 8.725F, -2.275F, 0.1F, 2.675F, 4.475F, new CubeDeformation(0.0F)).texOffs(0, 140).addBox(4.2F, 6.6F, -2.075F, 0.1F, 2.125F, 4.075F, new CubeDeformation(0.0F)).texOffs(56, 134)
						.addBox(-4.3F, 6.6F, -2.075F, 0.1F, 2.125F, 4.075F, new CubeDeformation(0.0F)).texOffs(159, 172).addBox(-4.3F, 8.725F, 2.2F, 8.6F, 2.675F, 0.1F, new CubeDeformation(0.0F)).texOffs(173, 0)
						.addBox(-3.7F, 6.8F, -2.3F, 1.0F, 0.6F, 0.1F, new CubeDeformation(0.0F)).texOffs(143, 4).addBox(-2.9F, 7.4F, -2.3F, 0.2F, 0.75F, 0.1F, new CubeDeformation(0.0F)).texOffs(173, 1)
						.addBox(-2.7F, 8.15F, -2.275F, 1.0F, 0.275F, 0.075F, new CubeDeformation(0.0F)).texOffs(172, 0).addBox(1.7F, 8.05F, -2.375F, 1.0F, 0.475F, 0.275F, new CubeDeformation(0.0F)).texOffs(165, 152)
						.addBox(-2.7F, 7.575F, -2.3F, 5.4F, 0.575F, 0.1F, new CubeDeformation(0.0F)).texOffs(24, 134).addBox(4.2F, 5.6F, -2.275F, 0.1F, 1.0F, 4.475F, new CubeDeformation(0.0F)).texOffs(70, 81)
						.addBox(-4.3F, 5.6F, 2.2F, 8.6F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(32, 134).addBox(-4.3F, 5.6F, -2.275F, 0.1F, 1.0F, 4.475F, new CubeDeformation(0.0F)).texOffs(60, 93)
						.addBox(-4.2F, 5.6F, -2.275F, 8.4F, 1.0F, 0.075F, new CubeDeformation(0.0F)).texOffs(12, 96).addBox(-3.6F, 8.425F, -2.3F, 7.2F, 3.275F, 0.1F, new CubeDeformation(0.0F)).texOffs(143, 4)
						.addBox(2.7F, 7.4F, -2.3F, 0.2F, 0.75F, 0.1F, new CubeDeformation(0.0F)).texOffs(173, 0).addBox(2.7F, 6.8F, -2.3F, 1.0F, 0.6F, 0.1F, new CubeDeformation(0.0F)).texOffs(24, 164)
						.addBox(3.7F, 0.85F, -2.3F, 0.2F, 6.55F, 0.1F, new CubeDeformation(0.0F)).texOffs(62, 112).addBox(-3.7F, 0.65F, -2.3F, 7.6F, 0.275F, 0.1F, new CubeDeformation(0.0F)).texOffs(32, 170)
						.addBox(-3.7F, -0.3F, -2.275F, 1.0F, 0.95F, 0.075F, new CubeDeformation(0.0F)).texOffs(32, 169).addBox(2.7F, -0.3F, -2.275F, 1.0F, 0.95F, 0.075F, new CubeDeformation(0.0F)).texOffs(38, 146)
						.addBox(-3.7F, -0.3F, 2.2F, 1.0F, 9.15F, 0.075F, new CubeDeformation(0.0F)).texOffs(40, 146).addBox(2.7F, -0.3F, 2.2F, 1.0F, 9.15F, 0.075F, new CubeDeformation(0.0F)).texOffs(32, 32)
						.addBox(-4.275F, -0.3F, -2.2F, 8.55F, 0.1F, 4.4F, new CubeDeformation(0.0F)).texOffs(32, 36).addBox(-4.2F, -0.2F, -2.2F, 8.4F, 0.05F, 4.4F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1",
				CubeListBuilder.create().texOffs(162, 173).addBox(-3.5F, 1.6875F, 0.05F, 7.0F, 2.275F, 0.2F, new CubeDeformation(0.0F)).texOffs(161, 173).addBox(-3.5F, 0.5375F, -0.05F, 7.0F, 2.275F, 0.25F, new CubeDeformation(0.0F)).texOffs(161, 174)
						.addBox(-3.5F, -0.6125F, -0.25F, 7.0F, 1.25F, 0.2F, new CubeDeformation(0.0F)).texOffs(161, 169).addBox(-3.5F, -0.6125F, -0.15F, 7.0F, 2.25F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.0625F, -2.25F, -0.1309F, 0.0F, 0.0F));
		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2",
				CubeListBuilder.create().texOffs(162, 0).addBox(-3.4F, 1.0625F, -0.15F, 6.8F, 0.675F, 0.2F, new CubeDeformation(0.0F)).texOffs(162, 1).addBox(-3.4F, 0.4625F, -0.125F, 6.8F, 0.675F, 0.2F, new CubeDeformation(0.0F)).texOffs(162, 2)
						.addBox(-3.4F, -0.1375F, -0.1F, 6.8F, 0.675F, 0.2F, new CubeDeformation(0.0F)).texOffs(162, 3).addBox(-3.4F, -0.7375F, -0.075F, 6.8F, 0.675F, 0.2F, new CubeDeformation(0.0F)).texOffs(162, 4)
						.addBox(-3.4F, -1.3375F, -0.05F, 6.8F, 0.675F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.0625F, 2.35F, 0.0742F, 0.0F, 0.0F));
		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3",
				CubeListBuilder.create().texOffs(168, 169).addBox(-0.55F, 1.9375F, -1.9375F, 0.3F, 3.125F, 3.875F, new CubeDeformation(0.0F)).texOffs(168, 169).addBox(-0.45F, 2.9375F, -1.9375F, 0.1F, 3.125F, 3.875F, new CubeDeformation(0.0F))
						.texOffs(168, 169).addBox(-0.375F, 0.9375F, -1.9375F, 0.225F, 3.125F, 3.875F, new CubeDeformation(0.0F)).texOffs(168, 169).addBox(-0.15F, -0.0625F, -1.9375F, 0.1F, 3.125F, 3.875F, new CubeDeformation(0.0F)).texOffs(168, 170)
						.addBox(0.05F, -1.0625F, -1.9375F, 0.1F, 2.125F, 3.875F, new CubeDeformation(0.0F)).texOffs(168, 169).addBox(-0.05F, -1.0625F, -1.9375F, 0.1F, 3.125F, 3.875F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.35F, 6.7625F, -0.0375F, 0.0F, 0.0F, -0.0873F));
		PartDefinition Body_r4 = Body.addOrReplaceChild("Body_r4",
				CubeListBuilder.create().texOffs(168, 169).addBox(0.35F, 2.9375F, -1.9375F, 0.1F, 3.125F, 3.875F, new CubeDeformation(0.0F)).texOffs(168, 169).addBox(0.25F, 1.9375F, -1.9375F, 0.1F, 3.125F, 3.875F, new CubeDeformation(0.0F))
						.texOffs(168, 169).addBox(0.15F, 0.9375F, -1.9375F, 0.1F, 3.125F, 3.875F, new CubeDeformation(0.0F)).texOffs(168, 169).addBox(0.05F, -0.0625F, -1.9375F, 0.1F, 3.125F, 3.875F, new CubeDeformation(0.0F)).texOffs(168, 170)
						.addBox(-0.15F, -1.0625F, -1.9375F, 0.1F, 2.125F, 3.875F, new CubeDeformation(0.0F)).texOffs(168, 169).addBox(-0.05F, -1.0625F, -1.9375F, 0.1F, 3.125F, 3.875F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.35F, 6.6625F, -0.0375F, 0.0F, 0.0F, 0.0873F));
		PartDefinition Body_r5 = Body.addOrReplaceChild("Body_r5",
				CubeListBuilder.create().texOffs(8, 140).addBox(-2.7F, 2.125F, -0.45F, 5.4F, 2.75F, 0.3F, new CubeDeformation(0.0F)).texOffs(161, 171).addBox(-3.6F, 2.125F, -0.25F, 7.2F, 3.75F, 0.1F, new CubeDeformation(0.0F)).texOffs(32, 89)
						.addBox(-3.6F, 1.125F, -0.2F, 7.2F, 3.75F, 0.1F, new CubeDeformation(0.0F)).texOffs(46, 89).addBox(-3.6F, 0.125F, -0.15F, 7.2F, 3.75F, 0.1F, new CubeDeformation(0.0F)).texOffs(60, 89)
						.addBox(-3.6F, -0.875F, -0.1F, 7.2F, 3.75F, 0.1F, new CubeDeformation(0.0F)).texOffs(14, 104).addBox(-3.6F, -1.875F, -0.05F, 7.2F, 1.75F, 0.225F, new CubeDeformation(0.0F)).texOffs(66, 96)
						.addBox(-3.6F, -1.875F, -0.05F, 7.2F, 2.75F, 0.15F, new CubeDeformation(0.0F)).texOffs(0, 90).addBox(-3.6F, -1.875F, -0.05F, 7.2F, 3.75F, 0.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.725F, 2.35F, 0.0524F, 0.0F, 0.0F));
		PartDefinition Body_r6 = Body.addOrReplaceChild("Body_r6", CubeListBuilder.create().texOffs(34, 140).addBox(-0.025F, -0.1875F, -2.2F, 0.05F, 0.35F, 4.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2232F, 4.4352F, 0.0F, 0.0F, 0.0F, 0.1396F));
		PartDefinition Body_r7 = Body.addOrReplaceChild("Body_r7", CubeListBuilder.create().texOffs(42, 140).addBox(-0.025F, -0.125F, -2.2F, 0.05F, 0.325F, 4.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.2252F, 4.3715F, 0.0F, 0.0F, 0.0F, -0.192F));
		PartDefinition Body_r8 = Body.addOrReplaceChild("Body_r8",
				CubeListBuilder.create().texOffs(171, 171).addBox(-2.7F, -3.55F, -0.95F, 1.0F, 0.5F, 0.2F, new CubeDeformation(0.0F)).texOffs(161, 173).addBox(-3.7F, -3.55F, -0.75F, 2.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(171, 170)
						.addBox(1.7F, -3.55F, -0.95F, 1.0F, 0.5F, 0.2F, new CubeDeformation(0.0F)).texOffs(161, 175).addBox(1.7F, -3.55F, -0.75F, 2.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(156, 167)
						.addBox(-3.7F, -3.05F, -0.75F, 7.4F, 6.7F, 2.2F, new CubeDeformation(0.0F)).texOffs(153, 170).addBox(-1.7F, -3.25F, -0.95F, 3.4F, 0.2F, 0.7F, new CubeDeformation(0.0F)).texOffs(160, 166)
						.addBox(-2.7F, -3.05F, -0.95F, 5.4F, 6.9F, 2.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.996F, -2.2422F, 0.2487F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(142, 0).addBox(-3.2F, -2.2F, -2.2F, 4.2F, 12.4F, 4.4F, new CubeDeformation(0.0F)).texOffs(163, 169).addBox(-3.3F, 7.05F, -2.3F, 1.8F, 2.15F, 4.6F, new CubeDeformation(0.0F)).texOffs(162, 171)
						.addBox(-1.5F, 7.25F, -2.3F, 2.6F, 0.7F, 4.6F, new CubeDeformation(0.0F)).texOffs(30, 170).addBox(0.975F, 7.95F, -0.5F, 0.075F, 0.4F, 1.0F, new CubeDeformation(0.0F)).texOffs(162, 171)
						.addBox(-1.5F, 8.3F, -2.275F, 2.6F, 0.7F, 4.55F, new CubeDeformation(0.0F)).texOffs(165, 168).addBox(-3.2F, 6.25F, -2.3F, 0.9F, 2.95F, 4.6F, new CubeDeformation(0.0F)).texOffs(166, 170)
						.addBox(-3.675F, 5.325F, -2.3F, 0.475F, 1.0F, 4.6F, new CubeDeformation(0.0F)).texOffs(167, 169).addBox(-3.3F, -2.2F, -2.2F, 0.1F, 2.6F, 4.4F, new CubeDeformation(0.0F)).texOffs(167, 175)
						.addBox(-3.3087F, -0.0174F, -2.4F, 4.375F, 0.825F, 0.1F, new CubeDeformation(0.0F)).texOffs(166, 170).addBox(-3.4087F, -0.0174F, -2.4F, 0.1F, 0.825F, 4.7F, new CubeDeformation(0.0F)).texOffs(167, 175)
						.addBox(-3.4087F, -0.0174F, 2.3F, 4.5F, 0.825F, 0.1F, new CubeDeformation(0.0F)).texOffs(166, 170).addBox(1.0663F, -0.0174F, -2.4F, 0.125F, 0.825F, 4.8F, new CubeDeformation(0.0F)).texOffs(166, 170)
						.addBox(0.8873F, 3.5838F, -2.3F, 0.225F, 1.0F, 4.6F, new CubeDeformation(0.0F)).texOffs(46, 111).addBox(1.0F, -2.2F, -2.2F, 0.1F, 2.6F, 4.4F, new CubeDeformation(0.0F)).texOffs(167, 173)
						.addBox(-3.3F, -2.2F, -2.3F, 4.4F, 2.6F, 0.1F, new CubeDeformation(0.0F)).texOffs(167, 173).addBox(-3.3F, -2.2F, 2.2F, 4.4F, 2.6F, 0.1F, new CubeDeformation(0.0F)).texOffs(166, 170)
						.addBox(-3.4F, -2.3F, -2.4F, 0.225F, 1.4F, 4.8F, new CubeDeformation(0.0F)).texOffs(0, 68).addBox(-3.3F, -2.3F, -2.3F, 4.4F, 0.1F, 4.6F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition Body_r9 = RightArm.addOrReplaceChild("Body_r9", CubeListBuilder.create().texOffs(36, 45).addBox(-2.1375F, -0.05F, -2.4F, 4.525F, 1.4F, 4.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2599F, -2.4328F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition RightArm_r1 = RightArm.addOrReplaceChild("RightArm_r1",
				CubeListBuilder.create().texOffs(169, 174).addBox(-0.75F, -0.725F, 2.2F, 3.5F, 2.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(169, 174).addBox(-0.75F, -0.725F, -2.3F, 3.5F, 2.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(165, 169)
						.addBox(-0.85F, -0.725F, -2.3F, 1.0F, 2.2F, 4.6F, new CubeDeformation(0.0F)).texOffs(174, 175).addBox(2.75F, 0.475F, -2.3F, 1.025F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(174, 175)
						.addBox(2.75F, 0.475F, 2.2F, 1.025F, 1.0F, 0.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6929F, 2.7231F, 0.0F, 0.0F, 0.0F, 0.1047F));
		PartDefinition RightArm_r2 = RightArm.addOrReplaceChild("RightArm_r2", CubeListBuilder.create().texOffs(169, 174).addBox(-0.05F, -1.425F, 2.2F, 3.5F, 1.7F, 0.2F, new CubeDeformation(0.0F)).texOffs(169, 174)
				.addBox(-0.05F, -1.425F, -2.4F, 3.5F, 1.7F, 0.2F, new CubeDeformation(0.0F)).texOffs(166, 169).addBox(-0.05F, -1.425F, -2.3F, 0.3F, 2.7F, 4.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.45F, 1.7F, 0.0F, 0.0F, 0.0F, 0.1484F));
		PartDefinition RightArm_r3 = RightArm.addOrReplaceChild("RightArm_r3", CubeListBuilder.create().texOffs(166, 170).addBox(-0.25F, -0.525F, -2.3F, 0.45F, 1.0F, 4.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.25F, 6.7F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition RightArm_r4 = RightArm.addOrReplaceChild("RightArm_r4", CubeListBuilder.create().texOffs(166, 169).addBox(-0.325F, -1.35F, -0.05F, 0.65F, 2.725F, 4.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4879F, 6.5101F, -2.25F, 0.0F, 0.0F, -0.781F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(18, 67).addBox(-2.1F, -3.175F, -2.2F, 4.2F, 0.1F, 4.4F, new CubeDeformation(0.0F)), PartPose.offset(6.1F, 2.875F, 0.0F));
		PartDefinition RightArm2 = LeftArm.addOrReplaceChild("RightArm2",
				CubeListBuilder.create().texOffs(158, 0).addBox(-1.8008F, -5.0149F, -2.1983F, 4.2F, 12.4F, 4.4F, new CubeDeformation(0.0F)).texOffs(163, 168).addBox(-1.9008F, 4.2351F, -2.2983F, 1.8F, 2.15F, 4.6F, new CubeDeformation(0.0F))
						.texOffs(162, 170).addBox(-0.1008F, 4.4351F, -2.2983F, 2.6F, 0.7F, 4.6F, new CubeDeformation(0.0F)).texOffs(32, 164).addBox(2.3742F, 5.1351F, -0.4983F, 0.075F, 0.4F, 1.0F, new CubeDeformation(0.0F)).texOffs(162, 170)
						.addBox(-0.1008F, 5.4851F, -2.2733F, 2.6F, 0.7F, 4.55F, new CubeDeformation(0.0F)).texOffs(165, 167).addBox(-1.8008F, 3.4351F, -2.2983F, 0.9F, 2.95F, 4.6F, new CubeDeformation(0.0F)).texOffs(166, 169)
						.addBox(-2.2758F, 2.5101F, -2.2983F, 0.475F, 1.0F, 4.6F, new CubeDeformation(0.0F)).texOffs(114, 120).addBox(-1.9008F, -5.0149F, -2.1983F, 0.1F, 2.6F, 4.4F, new CubeDeformation(0.0F)).texOffs(84, 167)
						.addBox(-1.9095F, -2.8323F, -2.3983F, 4.375F, 0.825F, 0.1F, new CubeDeformation(0.0F)).texOffs(166, 169).addBox(-2.0095F, -2.8323F, -2.3983F, 0.1F, 0.825F, 4.7F, new CubeDeformation(0.0F)).texOffs(167, 174)
						.addBox(-2.0095F, -2.8323F, 2.3017F, 4.5F, 0.825F, 0.1F, new CubeDeformation(0.0F)).texOffs(166, 170).addBox(2.4655F, -2.8323F, -2.3983F, 0.125F, 0.825F, 4.8F, new CubeDeformation(0.0F)).texOffs(166, 170)
						.addBox(2.2865F, 0.7689F, -2.2983F, 0.225F, 1.0F, 4.6F, new CubeDeformation(0.0F)).texOffs(30, 111).addBox(2.3992F, -5.0149F, -2.1983F, 0.1F, 2.6F, 4.4F, new CubeDeformation(0.0F)).texOffs(143, 173)
						.addBox(-1.9008F, -5.0149F, -2.2983F, 4.4F, 2.6F, 0.1F, new CubeDeformation(0.0F)).texOffs(143, 170).addBox(-1.9008F, -5.0149F, 2.2017F, 4.4F, 2.6F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 111)
						.addBox(-2.0008F, -5.1149F, -2.3983F, 0.225F, 1.4F, 4.8F, new CubeDeformation(0.0F)).texOffs(18, 62).addBox(-1.9008F, -5.1149F, -2.2983F, 4.4F, 0.1F, 4.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2008F, 1.9399F, -0.0017F, 0.0F, 3.1416F, 0.0F));
		PartDefinition Body_r10 = RightArm2.addOrReplaceChild("Body_r10", CubeListBuilder.create().texOffs(56, 45).addBox(-2.1375F, -0.05F, -2.4F, 4.525F, 1.4F, 4.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1393F, -5.2478F, 0.0017F, 0.0F, 0.0F, -0.0873F));
		PartDefinition RightArm_r5 = RightArm2.addOrReplaceChild("RightArm_r5",
				CubeListBuilder.create().texOffs(169, 173).addBox(-0.75F, -0.725F, 2.2F, 3.5F, 2.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(169, 173).addBox(-0.75F, -0.725F, -2.3F, 3.5F, 2.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(165, 168)
						.addBox(-0.85F, -0.725F, -2.3F, 1.0F, 2.2F, 4.6F, new CubeDeformation(0.0F)).texOffs(174, 174).addBox(2.75F, 0.475F, -2.3F, 1.025F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(174, 174)
						.addBox(2.75F, 0.475F, 2.2F, 1.025F, 1.0F, 0.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2937F, -0.0918F, 0.0017F, 0.0F, 0.0F, 0.1047F));
		PartDefinition RightArm_r6 = RightArm2.addOrReplaceChild("RightArm_r6", CubeListBuilder.create().texOffs(169, 173).addBox(-0.05F, -1.425F, 2.2F, 3.5F, 1.7F, 0.2F, new CubeDeformation(0.0F)).texOffs(169, 173)
				.addBox(-0.05F, -1.425F, -2.4F, 3.5F, 1.7F, 0.2F, new CubeDeformation(0.0F)).texOffs(166, 168).addBox(-0.05F, -1.425F, -2.3F, 0.3F, 2.7F, 4.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0508F, -1.1149F, 0.0017F, 0.0F, 0.0F, 0.1484F));
		PartDefinition RightArm_r7 = RightArm2.addOrReplaceChild("RightArm_r7", CubeListBuilder.create().texOffs(166, 169).addBox(-0.25F, -0.525F, -2.3F, 0.45F, 1.0F, 4.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8508F, 3.8851F, 0.0017F, 0.0F, 0.0F, -0.3927F));
		PartDefinition RightArm_r8 = RightArm2.addOrReplaceChild("RightArm_r8", CubeListBuilder.create().texOffs(166, 168).addBox(-0.325F, -1.35F, -0.05F, 0.65F, 2.725F, 4.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0887F, 3.6952F, -2.2483F, 0.0F, 0.0F, -0.781F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(142, 0).addBox(-2.3F, 0.0F, -2.2F, 4.3F, 9.0F, 4.4F, new CubeDeformation(0.0F)).texOffs(157, 170).addBox(-2.4F, 6.5F, -2.3F, 4.5F, 0.8F, 4.6F, new CubeDeformation(0.0F)).texOffs(157, 168)
						.addBox(-2.4F, 1.0F, -2.3F, 4.5F, 2.9F, 4.6F, new CubeDeformation(0.0F)).texOffs(158, 0).addBox(-2.375F, 3.9F, -2.275F, 4.45F, 1.0F, 4.55F, new CubeDeformation(0.0F)).texOffs(165, 171)
						.addBox(-2.4F, 0.3F, -2.3F, 1.0F, 0.7F, 4.6F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition RightLeg_r1 = RightLeg.addOrReplaceChild("RightLeg_r1",
				CubeListBuilder.create().texOffs(0, 171).addBox(1.925F, -1.725F, -0.35F, 0.2F, 0.3F, 0.5F, new CubeDeformation(0.0F)).texOffs(2, 171).addBox(-2.125F, -1.725F, -0.35F, 0.2F, 0.3F, 0.5F, new CubeDeformation(0.0F)).texOffs(167, 175)
						.addBox(-2.125F, -1.725F, -0.35F, 4.25F, 0.3F, 0.2F, new CubeDeformation(0.0F)).texOffs(164, 171).addBox(-2.125F, -1.425F, -0.35F, 4.25F, 3.4F, 1.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.15F, 6.65F, -2.4F, 0.2269F, 0.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(158, 0).addBox(-2.0F, 0.0F, -2.2F, 4.3F, 9.0F, 4.4F, new CubeDeformation(0.0F)), PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition RightLeg2 = LeftLeg
				.addOrReplaceChild(
						"RightLeg2", CubeListBuilder.create().texOffs(139, 154).addBox(1.7F, 6.5F, -2.3F, 4.5F, 0.8F, 4.6F, new CubeDeformation(0.0F)).texOffs(139, 152).addBox(1.7F, 1.0F, -2.3F, 4.5F, 2.9F, 4.6F, new CubeDeformation(0.0F))
								.texOffs(158, 0).addBox(1.725F, 3.9F, -2.275F, 4.45F, 1.0F, 4.55F, new CubeDeformation(0.0F)).texOffs(165, 171).addBox(5.2F, 0.3F, -2.3F, 1.0F, 0.7F, 4.6F, new CubeDeformation(0.0F)),
						PartPose.offset(-3.8F, 0.0F, 0.0F));
		PartDefinition LeftLeg_r1 = RightLeg2.addOrReplaceChild("LeftLeg_r1", CubeListBuilder.create().texOffs(14, 67).addBox(-1.1F, -0.35F, -2.3F, 2.2F, 0.7F, 4.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.3242F, 1.0492F, 0.0F, 0.0F, 0.0F, -0.3971F));
		PartDefinition LeftLeg_r2 = RightLeg2.addOrReplaceChild("LeftLeg_r2",
				CubeListBuilder.create().texOffs(34, 152).addBox(-2.125F, -1.725F, -0.35F, 0.2F, 0.3F, 0.5F, new CubeDeformation(0.0F)).texOffs(34, 153).addBox(1.925F, -1.725F, -0.35F, 0.2F, 0.3F, 0.5F, new CubeDeformation(0.0F)).texOffs(167, 159)
						.addBox(-2.125F, -1.725F, -0.35F, 4.25F, 0.3F, 0.2F, new CubeDeformation(0.0F)).texOffs(154, 155).addBox(-2.125F, -1.425F, -0.35F, 4.25F, 3.4F, 1.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.95F, 6.65F, -2.4F, 0.2269F, 0.0F, 0.0F));
		PartDefinition Leftbot = partdefinition.addOrReplaceChild("Leftbot", CubeListBuilder.create().texOffs(159, 169).addBox(-2.0F, 9.0F, -2.2F, 4.3F, 3.0F, 4.4F, new CubeDeformation(0.0F)), PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition Rightbot2 = Leftbot.addOrReplaceChild("Rightbot2", CubeListBuilder.create().texOffs(159, 169).addBox(1.8F, 9.0F, -2.2F, 4.3F, 2.95F, 4.4F, new CubeDeformation(0.0F)).texOffs(158, 169)
				.addBox(1.8F, 10.1528F, -2.9594F, 4.3F, 1.8F, 4.8F, new CubeDeformation(0.0F)).texOffs(167, 0).addBox(1.825F, 8.5531F, -2.2968F, 4.25F, 0.45F, 0.1F, new CubeDeformation(0.0F)), PartPose.offset(-3.8F, 0.0F, 0.0F));
		PartDefinition LeftLeg_r3 = Rightbot2.addOrReplaceChild("LeftLeg_r3", CubeListBuilder.create().texOffs(165, 174).addBox(-2.15F, -0.225F, -0.05F, 4.3F, 0.45F, 1.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.95F, 9.9641F, -2.8271F, -0.3927F, 0.0F, 0.0F));
		PartDefinition LeftLeg_r4 = Rightbot2.addOrReplaceChild("LeftLeg_r4", CubeListBuilder.create().texOffs(165, 173).addBox(-2.15F, -1.225F, -0.05F, 4.3F, 1.45F, 1.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.95F, 9.6133F, -2.5927F, -0.7854F, 0.0F, 0.0F));
		PartDefinition LeftLeg_r5 = Rightbot2.addOrReplaceChild("LeftLeg_r5", CubeListBuilder.create().texOffs(165, 173).addBox(-2.15F, -1.225F, -0.05F, 4.3F, 1.45F, 1.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.95F, 9.2301F, -2.3367F, -0.3927F, 0.0F, 0.0F));
		PartDefinition Rightbot = partdefinition.addOrReplaceChild("Rightbot", CubeListBuilder.create().texOffs(159, 169).addBox(-2.3F, 9.0F, -2.2F, 4.3F, 2.95F, 4.4F, new CubeDeformation(0.0F)).texOffs(158, 169)
				.addBox(-2.3F, 10.1528F, -2.9594F, 4.3F, 1.8F, 4.8F, new CubeDeformation(0.0F)).texOffs(8, 164).addBox(-2.275F, 8.5531F, -2.2968F, 4.25F, 0.45F, 0.1F, new CubeDeformation(0.0F)), PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition RightLeg_r2 = Rightbot.addOrReplaceChild("RightLeg_r2", CubeListBuilder.create().texOffs(165, 174).addBox(-2.15F, -0.225F, -0.05F, 4.3F, 0.45F, 1.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.15F, 9.9641F, -2.8271F, -0.3927F, 0.0F, 0.0F));
		PartDefinition RightLeg_r3 = Rightbot.addOrReplaceChild("RightLeg_r3", CubeListBuilder.create().texOffs(165, 173).addBox(-2.15F, -1.225F, -0.05F, 4.3F, 1.45F, 1.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.15F, 9.6133F, -2.5927F, -0.7854F, 0.0F, 0.0F));
		PartDefinition RightLeg_r4 = Rightbot.addOrReplaceChild("RightLeg_r4", CubeListBuilder.create().texOffs(165, 173).addBox(-2.15F, -1.225F, -0.05F, 4.3F, 1.45F, 1.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.15F, 9.2301F, -2.3367F, -0.3927F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 176, 176);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leftbot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Rightbot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Leftbot.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Rightbot.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
