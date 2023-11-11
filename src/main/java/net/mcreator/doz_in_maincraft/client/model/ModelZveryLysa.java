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
public class ModelZveryLysa<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("doz_in_maincraft", "model_zvery_lysa"), "main");
	public final ModelPart head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public ModelZveryLysa(ModelPart root) {
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
				CubeListBuilder.create().texOffs(197, 200).addBox(-1.275F, -4.375F, -12.475F, 0.8F, 1.95F, 0.75F, new CubeDeformation(0.0F)).texOffs(251, 211).addBox(0.725F, -4.375F, -12.475F, 0.8F, 1.95F, 0.75F, new CubeDeformation(0.0F))
						.texOffs(251, 247).addBox(0.725F, 12.625F, -12.475F, 0.8F, 1.95F, 0.75F, new CubeDeformation(0.0F)).texOffs(201, 200).addBox(-1.275F, 12.625F, -12.475F, 0.8F, 1.95F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 8.0F, 0.0F, -1.5708F, 1.5708F, 0.0F));
		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(253, 204).addBox(-12.5F, 1.625F, -12.475F, 0.8F, 1.95F, 0.75F, new CubeDeformation(0.0F)).texOffs(239, 255).addBox(-10.5F, 1.625F, -12.475F, 0.8F, 1.95F, 0.75F, new CubeDeformation(0.0F))
						.texOffs(253, 214).addBox(1.75F, -3.625F, -12.475F, 0.8F, 1.95F, 0.75F, new CubeDeformation(0.0F)).texOffs(235, 255).addBox(-10.5F, -3.625F, -12.475F, 0.8F, 1.95F, 0.75F, new CubeDeformation(0.0F)).texOffs(215, 227)
						.addBox(-12.5F, -3.625F, -12.475F, 0.8F, 1.95F, 0.75F, new CubeDeformation(0.0F)).texOffs(253, 207).addBox(-0.25F, -3.625F, -12.475F, 0.8F, 1.95F, 0.75F, new CubeDeformation(0.0F)).texOffs(253, 224)
						.addBox(-0.25F, 1.625F, -12.475F, 0.8F, 1.95F, 0.75F, new CubeDeformation(0.0F)).texOffs(254, 227).addBox(1.75F, 1.625F, -12.475F, 0.8F, 1.95F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 8.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(172, 34).addBox(-4.3F, -2.0F, -2.0F, 4.15F, 12.5F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 1.0F, 0.0F));
		PartDefinition cube_r9 = RightArm.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(37, 233).addBox(5.05F, -8.1F, 2.0F, 1.375F, 6.6F, 0.2F, new CubeDeformation(0.0F)).texOffs(19, 232)
				.addBox(6.4F, -8.1F, -2.0F, 0.25F, 6.6F, 4.0F, new CubeDeformation(0.0F)).texOffs(35, 233).addBox(5.05F, -8.1F, -2.2F, 1.375F, 6.6F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 12.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition cube_r10 = RightArm.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(199, 196).addBox(6.65F, -7.6F, -1.5F, 0.1F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(199, 196)
				.addBox(6.65F, -4.3F, -1.5F, 0.1F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(203, 251).addBox(6.75F, -8.1F, -1.5F, 0.5F, 6.1F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 12.0F, -2.4F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition cube_r11 = RightArm.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(239, 228).addBox(5.525F, -4.6F, -1.5F, 0.5F, 1.7F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 12.0F, -2.4F, 3.1416F, 0.0F, 2.7751F));
		PartDefinition cube_r12 = RightArm.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(199, 196).addBox(6.65F, -7.6F, -1.5F, 0.1F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(199, 196)
				.addBox(6.65F, -4.3F, -1.5F, 0.1F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(233, 241).addBox(6.75F, -8.1F, -1.5F, 0.5F, 6.1F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 12.0F, -0.1F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition cube_r13 = RightArm.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(237, 198).addBox(5.525F, -4.6F, -1.5F, 0.5F, 1.7F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 12.0F, -0.1F, 3.1416F, 0.0F, 2.7751F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(136, 38).addBox(0.25F, -2.0F, -2.0F, 4.15F, 12.5F, 4.0F, new CubeDeformation(0.0F)).texOffs(27, 232).addBox(4.4F, 3.9F, -2.0F, 0.25F, 6.6F, 4.0F, new CubeDeformation(0.0F)).texOffs(207, 251)
						.addBox(4.75F, 3.9F, -1.5F, 0.5F, 6.1F, 0.5F, new CubeDeformation(0.0F)).texOffs(223, 219).addBox(4.65F, 7.7F, -1.5F, 0.1F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(221, 219)
						.addBox(4.65F, 4.4F, -1.5F, 0.1F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(205, 251).addBox(4.75F, 3.9F, 0.8F, 0.5F, 6.1F, 0.5F, new CubeDeformation(0.0F)).texOffs(199, 196)
						.addBox(4.65F, 7.7F, 0.8F, 0.1F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(199, 196).addBox(4.65F, 4.4F, 0.8F, 0.1F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(31, 249)
						.addBox(3.05F, 3.9F, 2.0F, 1.375F, 6.6F, 0.2F, new CubeDeformation(0.0F)).texOffs(57, 199).addBox(3.05F, 3.9F, -2.2F, 1.375F, 6.6F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 1.0F, 0.0F));
		PartDefinition cube_r14 = LeftArm.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(239, 198).addBox(5.525F, -4.6F, -1.5F, 0.5F, 1.7F, 0.5F, new CubeDeformation(0.0F)).texOffs(256, 245).addBox(5.525F, -4.6F, -3.8F, 0.5F, 1.7F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 12.0F, 2.3F, 0.0F, 0.0F, 0.3665F));
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
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
