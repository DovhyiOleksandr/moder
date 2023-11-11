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
public class Modelfak<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("doz_in_maincraft", "modelfak"), "main");
	public final ModelPart head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelfak(ModelPart root) {
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
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.9F, -8.0F, -4.0F, 7.9F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(19, 246).addBox(-1.9F, -8.0F, -4.5F, 1.625F, 8.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(41, 218)
						.addBox(-0.3F, -8.0F, -4.5F, 0.575F, 4.85F, 0.5F, new CubeDeformation(0.0F)).texOffs(41, 218).addBox(-0.3F, -1.9F, -4.5F, 0.575F, 1.9F, 0.5F, new CubeDeformation(0.0F)).texOffs(51, 248)
						.addBox(-3.6F, -8.0F, -4.5F, 1.7F, 6.2F, 0.5F, new CubeDeformation(0.0F)).texOffs(31, 201).addBox(-2.8F, -1.8F, -4.5F, 0.9F, 1.2F, 0.5F, new CubeDeformation(0.0F)).texOffs(250, 233)
						.addBox(-0.25F, -9.05F, -3.5F, 0.55F, 1.2F, 0.5F, new CubeDeformation(0.0F)).texOffs(224, 240).addBox(-0.25F, -9.05F, -1.8F, 0.55F, 1.2F, 0.5F, new CubeDeformation(0.0F)).texOffs(204, 240)
						.addBox(-0.25F, -9.05F, 1.775F, 0.55F, 1.2F, 0.5F, new CubeDeformation(0.0F)).texOffs(204, 235).addBox(-0.25F, -9.05F, 0.075F, 0.55F, 1.2F, 0.5F, new CubeDeformation(0.0F)).texOffs(27, 201)
						.addBox(1.9F, -1.8F, -4.5F, 0.9F, 1.2F, 0.5F, new CubeDeformation(0.0F)).texOffs(35, 201).addBox(0.275F, -8.0F, -4.5F, 1.625F, 8.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(25, 246)
						.addBox(1.9F, -8.0F, -4.5F, 1.825F, 6.2F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -1.0F, 0.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(246, 233).addBox(-7.9F, -20.75F, -3.5F, 0.55F, 1.2F, 0.5F, new CubeDeformation(0.0F)).texOffs(206, 235).addBox(-7.9F, -20.75F, -1.8F, 0.55F, 1.2F, 0.5F, new CubeDeformation(0.0F)).texOffs(206, 223)
						.addBox(-7.9F, -20.75F, 0.075F, 0.55F, 1.2F, 0.5F, new CubeDeformation(0.0F)).texOffs(210, 223).addBox(-7.9F, -20.75F, 1.775F, 0.55F, 1.2F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 13.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(227, 237).addBox(-4.45F, -23.15F, 1.775F, 0.55F, 1.2F, 0.5F, new CubeDeformation(0.0F)).texOffs(208, 223).addBox(-4.45F, -23.15F, 0.075F, 0.55F, 1.2F, 0.5F, new CubeDeformation(0.0F)).texOffs(206, 240)
						.addBox(-4.45F, -23.15F, -1.8F, 0.55F, 1.2F, 0.5F, new CubeDeformation(0.0F)).texOffs(246, 248).addBox(-4.45F, -23.15F, -3.5F, 0.55F, 1.2F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 13.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(220, 246).addBox(4.9F, -26.775F, 10.575F, 0.9F, 3.95F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 13.0F, 0.0F, 0.5657F, 0.2403F, -0.5535F));
		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(224, 246).addBox(-13.55F, -17.05F, 14.275F, 0.9F, 3.95F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 13.0F, 0.0F, 0.8742F, -0.2403F, 0.5535F));
		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(244, 245).addBox(-9.55F, -22.05F, -4.5F, 0.9F, 3.95F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 13.0F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(190, 247).addBox(-0.05F, -26.05F, -4.5F, 0.9F, 3.95F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 13.0F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(245, 235).addBox(-7.9F, -7.05F, 0.525F, 0.8F, 1.95F, 0.75F, new CubeDeformation(0.0F)).texOffs(197, 238).addBox(-5.9F, -7.05F, 0.525F, 0.8F, 1.95F, 0.75F, new CubeDeformation(0.0F)).texOffs(233, 221)
						.addBox(-5.9F, -7.05F, -1.475F, 0.8F, 1.95F, 0.75F, new CubeDeformation(0.0F)).texOffs(235, 217).addBox(-7.9F, -7.05F, -1.475F, 0.8F, 1.95F, 0.75F, new CubeDeformation(0.0F)).texOffs(197, 216)
						.addBox(6.75F, -7.05F, -1.475F, 0.8F, 1.95F, 0.75F, new CubeDeformation(0.0F)).texOffs(197, 221).addBox(4.75F, -7.05F, -1.475F, 0.8F, 1.95F, 0.75F, new CubeDeformation(0.0F)).texOffs(217, 221)
						.addBox(4.75F, -7.05F, 0.525F, 0.8F, 1.95F, 0.75F, new CubeDeformation(0.0F)).texOffs(221, 221).addBox(6.75F, -7.05F, 0.525F, 0.8F, 1.95F, 0.75F, new CubeDeformation(0.0F)).texOffs(167, 9)
						.addBox(-4.15F, -5.0F, -2.0F, 8.4F, 12.5F, 4.0F, new CubeDeformation(0.0F)).texOffs(29, 220).addBox(-4.35F, -5.0F, 1.0F, 8.8F, 2.5F, 1.5F, new CubeDeformation(0.0F)).texOffs(1, 239)
						.addBox(-4.25F, -2.5F, 2.25F, 8.5F, 2.25F, 0.5F, new CubeDeformation(0.0F)).texOffs(29, 230).addBox(-3.75F, -0.25F, 2.5F, 7.5F, 2.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(5, 249)
						.addBox(-3.25F, 1.75F, 2.65F, 6.5F, 1.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(37, 233).addBox(-2.75F, 3.25F, 2.5F, 5.5F, 2.25F, 0.5F, new CubeDeformation(0.0F)).texOffs(3, 217)
						.addBox(-8.35F, -5.5F, -2.0F, 16.8F, 0.5F, 4.0F, new CubeDeformation(0.0F)).texOffs(55, 244).addBox(-8.35F, -5.0F, -2.5F, 4.05F, 2.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(248, 114)
						.addBox(-2.125F, 1.0F, -2.5F, 4.05F, 2.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(240, 153).addBox(-4.125F, 6.25F, -2.25F, 8.55F, 1.25F, 0.25F, new CubeDeformation(0.0F)).texOffs(21, 210)
						.addBox(2.575F, 5.35F, -2.35F, 0.45F, 2.75F, 0.25F, new CubeDeformation(0.0F)).texOffs(21, 210).addBox(3.775F, 5.35F, -2.35F, 0.45F, 2.75F, 0.25F, new CubeDeformation(0.0F)).texOffs(250, 4)
						.addBox(4.25F, 6.05F, -1.35F, 1.2F, 2.425F, 2.6F, new CubeDeformation(0.0F)).texOffs(109, 249).addBox(4.4F, 6.225F, -0.25F, 1.2F, 0.925F, 0.325F, new CubeDeformation(0.0F)).texOffs(106, 256)
						.addBox(-5.45F, 6.225F, -0.25F, 1.2F, 0.925F, 0.325F, new CubeDeformation(0.0F)).texOffs(248, 38).addBox(-5.25F, 6.05F, -1.35F, 1.2F, 2.425F, 2.6F, new CubeDeformation(0.0F)).texOffs(21, 210)
						.addBox(-2.725F, 5.35F, -2.35F, 0.45F, 2.75F, 0.25F, new CubeDeformation(0.0F)).texOffs(47, 224).addBox(-0.975F, 5.775F, -2.55F, 1.7F, 0.5F, 0.35F, new CubeDeformation(0.0F)).texOffs(43, 221)
						.addBox(-0.775F, 6.775F, -2.55F, 1.325F, 0.25F, 0.35F, new CubeDeformation(0.0F)).texOffs(43, 221).addBox(-0.975F, 7.125F, -2.55F, 1.7F, 0.15F, 0.35F, new CubeDeformation(0.0F)).texOffs(43, 221)
						.addBox(-1.025F, 7.025F, -2.55F, 1.8F, 0.1F, 0.35F, new CubeDeformation(0.0F)).texOffs(43, 224).addBox(-0.975F, 7.525F, -2.55F, 1.7F, 0.5F, 0.35F, new CubeDeformation(0.0F)).texOffs(43, 221)
						.addBox(-0.975F, 7.275F, -2.55F, 0.2F, 0.25F, 0.35F, new CubeDeformation(0.0F)).texOffs(43, 221).addBox(-0.475F, 7.275F, -2.55F, 0.2F, 0.25F, 0.35F, new CubeDeformation(0.0F)).texOffs(43, 221)
						.addBox(0.025F, 7.275F, -2.55F, 0.2F, 0.25F, 0.35F, new CubeDeformation(0.0F)).texOffs(43, 221).addBox(0.525F, 7.275F, -2.55F, 0.2F, 0.25F, 0.35F, new CubeDeformation(0.0F)).texOffs(43, 221)
						.addBox(-1.225F, 6.025F, -2.55F, 0.45F, 1.0F, 0.35F, new CubeDeformation(0.0F)).texOffs(43, 221).addBox(-0.375F, 6.275F, -2.55F, 0.45F, 0.5F, 0.35F, new CubeDeformation(0.0F)).texOffs(43, 221)
						.addBox(0.55F, 6.025F, -2.55F, 0.45F, 1.0F, 0.35F, new CubeDeformation(0.0F)).texOffs(21, 210).addBox(-3.925F, 5.35F, -2.35F, 0.45F, 2.75F, 0.25F, new CubeDeformation(0.0F)).texOffs(21, 210)
						.addBox(-2.725F, 5.35F, 2.1F, 0.45F, 2.75F, 0.25F, new CubeDeformation(0.0F)).texOffs(21, 210).addBox(-3.925F, 5.35F, 2.1F, 0.45F, 2.75F, 0.25F, new CubeDeformation(0.0F)).texOffs(21, 210)
						.addBox(2.575F, 5.35F, 2.1F, 0.45F, 2.75F, 0.25F, new CubeDeformation(0.0F)).texOffs(21, 210).addBox(3.775F, 5.35F, 2.1F, 0.45F, 2.75F, 0.25F, new CubeDeformation(0.0F)).texOffs(21, 210)
						.addBox(0.325F, 5.35F, 2.1F, 0.45F, 2.75F, 0.25F, new CubeDeformation(0.0F)).texOffs(21, 210).addBox(1.525F, 5.35F, 2.1F, 0.45F, 2.75F, 0.25F, new CubeDeformation(0.0F)).texOffs(21, 210)
						.addBox(-1.925F, 5.35F, 2.1F, 0.45F, 2.75F, 0.25F, new CubeDeformation(0.0F)).texOffs(21, 210).addBox(-0.725F, 5.35F, 2.1F, 0.45F, 2.75F, 0.25F, new CubeDeformation(0.0F)).texOffs(240, 152)
						.addBox(-4.125F, 6.25F, 2.0F, 8.55F, 1.25F, 0.25F, new CubeDeformation(0.0F)).texOffs(222, 116).addBox(-2.875F, -2.025F, -2.5F, 5.55F, 3.025F, 0.5F, new CubeDeformation(0.0F)).texOffs(238, 138)
						.addBox(-3.625F, -5.5F, -2.5F, 7.05F, 3.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(55, 240).addBox(4.4F, -5.0F, -2.5F, 4.05F, 2.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(41, 252)
						.addBox(4.4F, -5.0F, 2.0F, 4.05F, 2.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(3, 201).addBox(8.45F, -5.0F, -2.0F, 0.5F, 2.5F, 4.0F, new CubeDeformation(0.0F)).texOffs(31, 248)
						.addBox(-8.85F, -5.0F, -2.0F, 0.6F, 2.5F, 4.0F, new CubeDeformation(0.0F)).texOffs(55, 236).addBox(-8.35F, -5.0F, 2.0F, 4.05F, 2.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 4.0F, 0.0F));
		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(57, 199).addBox(5.05F, -8.1F, -2.2F, 1.375F, 6.6F, 0.2F, new CubeDeformation(0.0F)).texOffs(31, 249).addBox(5.05F, -8.1F, 2.0F, 1.375F, 6.6F, 0.2F, new CubeDeformation(0.0F)).texOffs(221, 219)
						.addBox(6.65F, -7.6F, -1.5F, 0.1F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(223, 219).addBox(6.65F, -4.3F, -1.5F, 0.1F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(207, 251)
						.addBox(6.75F, -8.1F, -1.5F, 0.5F, 6.1F, 0.5F, new CubeDeformation(0.0F)).texOffs(27, 232).addBox(6.4F, -8.1F, -2.0F, 0.25F, 6.6F, 4.0F, new CubeDeformation(0.0F)).texOffs(136, 38)
						.addBox(2.25F, -14.0F, -2.0F, 4.15F, 12.5F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -3.0F, -8.0F, -1.5708F, 0.6545F, 0.0F));
		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(199, 196).addBox(6.65F, -7.6F, -1.5F, 0.1F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(199, 196)
				.addBox(6.65F, -4.3F, -1.5F, 0.1F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(205, 251).addBox(6.75F, -8.1F, -1.5F, 0.5F, 6.1F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -3.0F, -5.7F, -1.5708F, 0.6545F, 0.0F));
		PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(239, 198).addBox(5.525F, -4.6F, -1.5F, 0.5F, 1.7F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -3.0F, -5.7F, -1.5708F, 1.021F, 0.0F));
		PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(256, 245).addBox(5.525F, -4.6F, -1.5F, 0.5F, 1.7F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -3.0F, -8.0F, -1.5708F, 1.021F, 0.0F));
		PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(237, 198).addBox(7.9583F, 7.3197F, -1.4F, 0.5F, 1.7F, 0.5F, new CubeDeformation(0.0F)).texOffs(239, 228).addBox(7.9583F, 7.3197F, 0.9F, 0.5F, 1.7F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -3.0F, 0.0F, -1.6175F, 0.3662F, 3.1249F));
		PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(172, 34).addBox(-4.3F, -2.0F, -2.0F, 4.15F, 12.5F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -3.0F, 0.0F, -1.5272F, 0.0F, 0.0F));
		PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(37, 233).addBox(3.05F, 3.9F, 2.0F, 1.375F, 6.6F, 0.2F, new CubeDeformation(0.0F)).texOffs(203, 251)
				.addBox(4.75F, 3.9F, 0.9F, 0.5F, 6.1F, 0.5F, new CubeDeformation(0.0F)).texOffs(233, 241).addBox(4.75F, 3.9F, -1.4F, 0.5F, 6.1F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -3.0F, 0.0F, -1.6144F, 0.0F, 3.1416F));
		PartDefinition cube_r14 = Body.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(19, 232).addBox(4.4F, 3.9F, -2.0F, 0.25F, 6.6F, 4.0F, new CubeDeformation(0.0F)).texOffs(35, 233).addBox(3.05F, 3.9F, -2.2F, 1.375F, 6.6F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -3.0F, 0.0F, -1.6144F, 0.0F, 3.1416F));
		PartDefinition cube_r15 = Body.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(199, 196).addBox(6.65F, -7.6F, -1.5F, 0.1F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(199, 196).addBox(6.65F, -4.3F, -1.5F, 0.1F, 0.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 9.0F, -2.4F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition cube_r16 = Body.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(199, 196).addBox(6.65F, -7.6F, -1.5F, 0.1F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(199, 196).addBox(6.65F, -4.3F, -1.5F, 0.1F, 0.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 9.0F, -0.1F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition cube_r17 = Body.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(197, 200).addBox(-1.275F, -4.375F, -12.475F, 0.8F, 1.95F, 0.75F, new CubeDeformation(0.0F)).texOffs(251, 211).addBox(0.725F, -4.375F, -12.475F, 0.8F, 1.95F, 0.75F, new CubeDeformation(0.0F))
						.texOffs(251, 247).addBox(0.725F, 12.625F, -12.475F, 0.8F, 1.95F, 0.75F, new CubeDeformation(0.0F)).texOffs(201, 200).addBox(-1.275F, 12.625F, -12.475F, 0.8F, 1.95F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 8.0F, 0.0F, -1.5708F, 1.5708F, 0.0F));
		PartDefinition cube_r18 = Body.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(253, 204).addBox(-12.5F, 1.625F, -12.475F, 0.8F, 1.95F, 0.75F, new CubeDeformation(0.0F)).texOffs(239, 255).addBox(-10.5F, 1.625F, -12.475F, 0.8F, 1.95F, 0.75F, new CubeDeformation(0.0F))
						.texOffs(253, 214).addBox(1.75F, -3.625F, -12.475F, 0.8F, 1.95F, 0.75F, new CubeDeformation(0.0F)).texOffs(235, 255).addBox(-10.5F, -3.625F, -12.475F, 0.8F, 1.95F, 0.75F, new CubeDeformation(0.0F)).texOffs(215, 227)
						.addBox(-12.5F, -3.625F, -12.475F, 0.8F, 1.95F, 0.75F, new CubeDeformation(0.0F)).texOffs(253, 207).addBox(-0.25F, -3.625F, -12.475F, 0.8F, 1.95F, 0.75F, new CubeDeformation(0.0F)).texOffs(253, 224)
						.addBox(-0.25F, 1.625F, -12.475F, 0.8F, 1.95F, 0.75F, new CubeDeformation(0.0F)).texOffs(254, 227).addBox(1.75F, 1.625F, -12.475F, 0.8F, 1.95F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 8.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition bone = Body.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(173, 209).addBox(-31.0F, -9.075F, -0.4F, 33.9F, 0.85F, 0.825F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(-7.05F, -9.275F, -0.45F, 8.7F, 0.9F, 0.925F, new CubeDeformation(0.0F))
						.texOffs(173, 209).addBox(-6.95F, -9.5F, -0.35F, 2.225F, 0.225F, 0.725F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(-5.325F, -10.1F, -0.35F, 0.575F, 0.6F, 0.725F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(-5.325F, -11.225F, -0.55F, 0.575F, 1.125F, 1.125F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(-0.575F, -11.225F, -0.55F, 0.725F, 1.125F, 1.125F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(-0.575F, -10.1F, -0.35F, 0.7F, 0.825F, 0.725F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(10.925F, -4.75F, -0.35F, 0.7F, 1.85F, 0.725F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(10.575F, -4.075F, -0.65F, 1.35F, 0.375F, 1.325F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(10.575F, -3.375F, -0.65F, 1.35F, 0.375F, 1.325F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(-2.675F, -11.95F, -0.35F, 0.75F, 0.725F, 0.725F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(-2.675F, -11.05F, 0.575F, 0.75F, 0.725F, 0.625F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(-2.675F, -11.05F, -1.175F, 0.75F, 0.725F, 0.625F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(0.475F, -11.225F, -0.65F, 3.35F, 1.3F, 1.325F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(-13.35F, -11.8F, -1.175F, 4.275F, 2.375F, 2.375F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(-9.125F, -11.7F, -0.975F, 0.2F, 2.2F, 1.975F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(-8.925F, -11.6F, -0.875F, 0.675F, 1.975F, 1.775F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(-8.25F, -11.475F, -0.775F, 0.6F, 1.75F, 1.575F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(-7.65F, -11.35F, -0.675F, 0.7F, 1.5F, 1.375F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(-6.95F, -11.25F, -0.575F, 0.7F, 1.275F, 1.175F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(-6.25F, -11.175F, -0.475F, 0.375F, 1.05F, 0.975F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(-3.0F, -11.225F, -0.65F, 1.375F, 1.275F, 1.325F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(0.625F, -11.325F, -0.55F, 3.2F, 0.1F, 1.125F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(0.625F, -9.925F, -0.55F, 3.2F, 0.1F, 1.125F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(0.625F, -11.125F, -0.75F, 3.2F, 1.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(0.625F, -11.125F, 0.675F, 3.2F, 1.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(-5.875F, -11.125F, -0.45F, 6.5F, 0.95F, 0.925F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(-4.625F, -9.5F, -0.35F, 0.225F, 0.225F, 0.725F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(-4.275F, -9.5F, -0.35F, 0.225F, 0.225F, 0.725F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(-3.575F, -9.5F, -0.35F, 0.225F, 0.225F, 0.725F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(-3.925F, -9.5F, -0.35F, 0.225F, 0.225F, 0.725F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(-2.175F, -9.5F, -0.35F, 0.225F, 0.225F, 0.725F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(-2.525F, -9.5F, -0.35F, 0.225F, 0.225F, 0.725F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(-2.875F, -9.5F, -0.35F, 0.225F, 0.225F, 0.725F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(-3.225F, -9.5F, -0.35F, 0.225F, 0.225F, 0.725F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(0.125F, -9.4F, -0.35F, 1.4F, 0.125F, 0.725F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(-1.825F, -9.5F, -0.35F, 0.225F, 0.225F, 0.725F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(-1.475F, -9.5F, -0.35F, 0.225F, 0.225F, 0.725F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(-1.125F, -9.5F, -0.35F, 0.225F, 0.225F, 0.725F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(-0.775F, -9.5F, -0.35F, 0.225F, 0.225F, 0.725F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(12.65F, -8.525F, -1.0F, 1.875F, 4.575F, 2.0F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(12.075F, -8.0F, -1.0F, 0.575F, 4.075F, 2.0F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(10.8F, -8.0F, -1.0F, 1.275F, 3.25F, 2.0F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(6.625F, -7.65F, -1.0F, 4.175F, 2.575F, 2.0F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(4.55F, -7.725F, -1.0F, 2.075F, 0.9F, 2.0F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(2.625F, -6.6F, -0.8F, 1.8F, 1.075F, 1.6F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(3.375F, -5.025F, -1.0F, 0.125F, 0.825F, 2.0F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(-3.45F, -6.6F, -1.0F, 4.15F, 0.7F, 2.0F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(-3.45F, -6.3F, -0.8F, 3.475F, 1.2F, 1.6F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(-1.725F, -5.1F, -0.8F, 1.75F, 0.25F, 1.6F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(-1.725F, -5.0F, -0.9F, 0.6F, 0.15F, 1.8F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(-3.55F, -5.1F, -0.9F, 1.825F, 0.125F, 1.8F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(-1.125F, -4.85F, -0.9F, 1.25F, 0.125F, 1.8F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(0.125F, -5.675F, -0.25F, 0.225F, 0.7F, 0.5F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(-0.575F, -5.9F, -1.0F, 1.275F, 0.125F, 2.0F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(0.825F, -5.475F, -0.6F, 1.625F, 0.15F, 1.1F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(1.4F, -6.6F, -1.0F, 0.925F, 0.125F, 2.0F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(0.7F, -6.6F, -1.0F, 0.125F, 0.125F, 2.0F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(2.55F, -6.6F, -1.0F, 0.125F, 0.125F, 2.0F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(-0.325F, -5.775F, -1.0F, 1.025F, 0.1F, 2.0F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(5.225F, -6.825F, -0.9F, 1.4F, 0.125F, 1.8F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(3.5F, -5.225F, -0.9F, 3.125F, 1.4F, 1.8F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(3.6F, -3.825F, -1.0F, 1.375F, 0.475F, 2.0F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(3.5F, -3.825F, -1.0F, 0.1F, 0.35F, 2.0F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(6.15F, -6.7F, -0.9F, 0.475F, 0.1F, 1.8F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(6.275F, -6.6F, -0.9F, 0.35F, 0.125F, 1.8F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(6.5F, -6.475F, -0.9F, 0.125F, 0.225F, 1.8F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(6.5F, -5.675F, -0.9F, 0.125F, 0.225F, 1.8F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(6.275F, -5.45F, -0.9F, 0.35F, 0.15F, 1.8F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(6.15F, -5.325F, -0.9F, 0.475F, 0.125F, 1.8F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(3.825F, -7.725F, -0.925F, 8.075F, 0.075F, 1.85F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(0.275F, -7.8F, -0.85F, 11.225F, 0.075F, 1.7F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(0.275F, -7.875F, -0.775F, 11.225F, 0.075F, 1.55F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(0.375F, -7.95F, -0.7F, 12.125F, 0.075F, 1.4F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(-1.6F, -8.025F, -0.625F, 14.7F, 0.075F, 1.25F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(-1.6F, -8.1F, -0.55F, 14.7F, 0.075F, 1.1F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(7.6F, -8.55F, -0.4F, 4.9F, 0.075F, 0.725F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(3.1F, -8.25F, -0.4F, 10.0F, 0.075F, 0.725F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(7.6F, -8.475F, -0.475F, 4.9F, 0.075F, 0.875F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(7.6F, -8.625F, -0.325F, 4.9F, 0.075F, 0.575F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(7.6F, -8.4F, -0.325F, 4.9F, 0.175F, 0.575F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(7.6F, -8.7F, -0.25F, 4.9F, 0.075F, 0.425F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(7.6F, -8.775F, -0.175F, 4.9F, 0.075F, 0.275F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(-1.6F, -8.175F, -0.475F, 14.7F, 0.075F, 0.95F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(-13.775F, -8.5F, -0.85F, 16.85F, 0.075F, 1.7F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(-13.65F, -8.575F, -0.775F, 16.7F, 0.075F, 1.55F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(-13.525F, -8.65F, -0.7F, 16.55F, 0.075F, 1.4F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(-13.4F, -8.725F, -0.625F, 16.4F, 0.075F, 1.25F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(-13.25F, -8.8F, -0.55F, 16.225F, 0.075F, 1.1F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(-13.125F, -8.875F, -0.475F, 16.075F, 0.075F, 0.95F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(14.525F, -8.525F, -1.0F, 0.1F, 4.575F, 2.0F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(12.7F, -8.575F, -0.75F, 1.975F, 0.05F, 1.5F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(12.7F, -8.625F, -0.7F, 1.975F, 0.05F, 1.4F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(12.375F, -3.95F, -1.0F, 1.975F, 0.1F, 2.0F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(14.625F, -5.4F, -1.0F, 0.1F, 1.45F, 2.0F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(14.725F, -5.15F, -1.0F, 0.1F, 1.2F, 2.0F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(14.825F, -4.875F, -1.0F, 0.1F, 0.925F, 2.0F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(14.825F, -8.525F, -1.0F, 0.1F, 0.925F, 2.0F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(14.725F, -8.525F, -1.0F, 0.1F, 1.2F, 2.0F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(14.625F, -8.525F, -1.0F, 0.1F, 1.45F, 2.0F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(-13.775F, -8.425F, -1.0F, 16.875F, 1.7F, 2.0F, new CubeDeformation(0.0F)).texOffs(173, 209).addBox(-6.125F, -7.75F, -1.0F, 10.675F, 1.15F, 2.0F, new CubeDeformation(0.0F)).texOffs(173, 209)
						.addBox(-13.9F, -8.425F, -1.0F, 0.125F, 1.6F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 4.0F, -13.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(173, 209).addBox(-0.9F, -1.0704F, -1.0F, 3.275F, 1.3F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.375F, -4.375F, 0.0F, 0.0F, 0.0F, -0.3971F));
		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(173, 209).addBox(-0.7F, -0.5F, -1.0F, 1.375F, 0.475F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.625F, -3.6F, 0.0F, 0.0F, 0.0F, -0.4145F));
		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(173, 209).addBox(-0.9F, -0.825F, -0.8F, 2.375F, 1.425F, 1.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, -6.1F, 0.0F, 0.0F, 0.0F, 1.0952F));
		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(173, 209).addBox(0.55F, -0.6F, -0.6F, 0.825F, 0.175F, 1.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.65F, -5.375F, 0.0F, 0.0F, 0.0F, -2.3736F));
		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(173, 209).addBox(0.65F, 0.325F, -0.6F, 0.725F, 0.15F, 1.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.65F, -5.375F, 0.0F, 0.0F, 0.0F, -0.5672F));
		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(173, 209).addBox(-0.875F, -1.125F, -1.0F, 2.4F, 0.7F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.3403F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 1.0F, 0.0F, -1.5272F, 0.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 1.0F, 0.0F, -1.4355F, 0.8681F, 0.1035F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(174, 0).addBox(-2.175F, 0.5F, -2.0F, 4.15F, 12.5F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 11.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(160, 21).addBox(-2.025F, 0.5F, -2.0F, 4.275F, 12.5F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 11.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 258, 258);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
