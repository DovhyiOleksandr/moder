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
public class Modelnachalka2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("doz_in_maincraft", "modelnachalka_2"), "main");
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;

	public Modelnachalka2(ModelPart root) {
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 55).addBox(-4.2F, 0.0F, -2.2F, 8.4F, 12.0F, 4.4F, new CubeDeformation(0.0F)).texOffs(74, 45).addBox(-4.3F, 11.25F, -2.3F, 8.6F, 1.05F, 4.6F, new CubeDeformation(0.0F)).texOffs(17, 8)
						.addBox(-4.3F, 9.0F, -2.0F, 0.1F, 1.2F, 0.2F, new CubeDeformation(0.0F)).texOffs(5, 12).addBox(-4.3F, 9.0F, -1.775F, 0.1F, 1.2F, 0.2F, new CubeDeformation(0.0F)).texOffs(7, 9)
						.addBox(-4.3F, 9.0F, -1.55F, 0.1F, 1.2F, 0.2F, new CubeDeformation(0.0F)).texOffs(11, 9).addBox(-4.3F, 9.0F, -1.325F, 0.1F, 1.2F, 0.2F, new CubeDeformation(0.0F)).texOffs(11, 5)
						.addBox(-4.3F, 9.0F, -0.875F, 0.1F, 1.2F, 0.2F, new CubeDeformation(0.0F)).texOffs(7, 12).addBox(-4.3F, 9.0F, -1.1F, 0.1F, 1.2F, 0.2F, new CubeDeformation(0.0F)).texOffs(9, 12)
						.addBox(-4.3F, 9.0F, -0.65F, 0.1F, 1.2F, 0.2F, new CubeDeformation(0.0F)).texOffs(11, 13).addBox(-4.3F, 9.0F, -0.425F, 0.1F, 1.2F, 0.2F, new CubeDeformation(0.0F)).texOffs(5, 6)
						.addBox(-4.3F, 9.0F, 0.475F, 0.1F, 1.2F, 0.2F, new CubeDeformation(0.0F)).texOffs(4, 7).addBox(-4.3F, 9.0F, 0.25F, 0.1F, 1.2F, 0.2F, new CubeDeformation(0.0F)).texOffs(4, 5)
						.addBox(-4.3F, 9.0F, 0.025F, 0.1F, 1.2F, 0.2F, new CubeDeformation(0.0F)).texOffs(3, 6).addBox(-4.3F, 9.0F, -0.2F, 0.1F, 1.2F, 0.2F, new CubeDeformation(0.0F)).texOffs(6, 5)
						.addBox(-4.3F, 9.0F, 0.925F, 0.1F, 1.2F, 0.2F, new CubeDeformation(0.0F)).texOffs(15, 0).addBox(-4.3F, 9.0F, 0.7F, 0.1F, 1.2F, 0.2F, new CubeDeformation(0.0F)).texOffs(9, 8)
						.addBox(-4.3F, 9.0F, 1.15F, 0.1F, 1.2F, 0.2F, new CubeDeformation(0.0F)).texOffs(11, 7).addBox(-4.3F, 9.0F, 1.375F, 0.1F, 1.2F, 0.2F, new CubeDeformation(0.0F)).texOffs(43, 36)
						.addBox(1.5F, 9.2F, -2.4F, 2.4F, 2.0F, 0.2F, new CubeDeformation(0.0F)).texOffs(18, 45).addBox(2.3F, 9.1F, -2.5F, 0.8F, 1.5F, 0.3F, new CubeDeformation(0.0F)).texOffs(43, 41)
						.addBox(-3.975F, 9.175F, -2.45F, 2.35F, 1.325F, 0.25F, new CubeDeformation(0.0F)).texOffs(58, 67).addBox(-3.2F, 9.1F, -2.5F, 0.8F, 1.5F, 0.3F, new CubeDeformation(0.0F)).texOffs(62, 21)
						.addBox(1.525F, 9.175F, -2.45F, 2.35F, 1.325F, 0.25F, new CubeDeformation(0.0F)).texOffs(43, 33).addBox(-4.0F, 9.2F, -2.4F, 2.4F, 2.0F, 0.2F, new CubeDeformation(0.0F)).texOffs(46, 48)
						.addBox(-4.3F, -0.3F, -2.3F, 8.6F, 6.3F, 4.6F, new CubeDeformation(0.0F)).texOffs(46, 99).addBox(-4.25F, 9.5F, -2.25F, 3.75F, 1.0F, 4.575F, new CubeDeformation(0.0F)).texOffs(87, 35)
						.addBox(-0.5F, 9.5F, -2.25F, 4.75F, 1.0F, 4.575F, new CubeDeformation(0.0F)).texOffs(14, 6).addBox(0.5F, 9.5F, -2.3F, 0.2F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(15, 21)
						.addBox(-0.5F, 9.9F, -2.3F, 1.0F, 0.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(5, 16).addBox(-0.1F, 9.5F, -2.3F, 0.2F, 0.5F, 0.1F, new CubeDeformation(0.0F)).texOffs(15, 8)
						.addBox(-0.7F, 9.5F, -2.3F, 0.2F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(2, 4).addBox(-0.7F, 9.4F, -2.3F, 1.4F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(2, 4)
						.addBox(-0.7F, 10.5F, -2.3F, 1.4F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(42, 26).addBox(-4.2F, -0.4F, -2.3F, 2.5F, 0.1F, 4.6F, new CubeDeformation(0.0F)).texOffs(9, 18)
						.addBox(-4.2F, -0.4F, 2.3F, 1.4F, 0.225F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 0).addBox(2.8F, -0.4F, 2.3F, 1.4F, 0.225F, 0.1F, new CubeDeformation(0.0F)).texOffs(47, 51)
						.addBox(-3.3F, -0.4F, -2.3F, 7.5F, 0.1F, 4.6F, new CubeDeformation(0.0F)).texOffs(122, 41).addBox(-4.2F, -0.4F, -2.4F, 8.4F, 1.8F, 0.1F, new CubeDeformation(0.0F)).texOffs(83, 71)
						.addBox(-3.5169F, 1.0856F, -2.4F, 7.0F, 3.8F, 0.1F, new CubeDeformation(0.0F)).texOffs(64, 66).addBox(-3.2F, -0.4F, 2.3F, 6.5F, 4.8F, 0.1F, new CubeDeformation(0.0F)).texOffs(69, 74)
						.addBox(-8.3F, -0.3F, -2.3F, 4.1F, 5.3F, 4.6F, new CubeDeformation(0.0F)).texOffs(34, 110).addBox(4.2F, -0.3F, -2.325F, 4.125F, 5.3F, 4.65F, new CubeDeformation(0.0F)).texOffs(109, 53)
						.addBox(4.7F, -0.6F, -2.3F, 3.6F, 0.3F, 4.6F, new CubeDeformation(0.0F)).texOffs(31, 32).addBox(8.3F, -0.6F, -2.6F, 0.3F, 3.3F, 5.2F, new CubeDeformation(0.0F)).texOffs(16, 11)
						.addBox(8.6F, -0.7F, -2.6F, 0.1F, 0.1F, 5.2F, new CubeDeformation(0.0F)).texOffs(16, 11).addBox(8.6F, 2.7F, -2.6F, 0.1F, 0.1F, 5.2F, new CubeDeformation(0.0F)).texOffs(6, 4)
						.addBox(4.7F, 2.7F, -2.7F, 4.0F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(2, 5).addBox(4.7F, -0.6F, -2.7F, 0.1F, 3.3F, 0.1F, new CubeDeformation(0.0F)).texOffs(16, 11)
						.addBox(4.7F, -0.7F, -2.7F, 0.1F, 0.1F, 5.3F, new CubeDeformation(0.0F)).texOffs(0, 25).addBox(4.7F, -0.7F, 2.6F, 0.1F, 3.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(4, 0)
						.addBox(4.7F, 2.7F, 2.6F, 4.0F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(-2, -6).addBox(4.7F, 2.7F, -2.6F, 0.1F, 0.1F, 5.3F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(8.6F, -0.7F, 2.6F, 0.1F, 3.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(1, 4).addBox(8.6F, -0.7F, -2.7F, 0.1F, 3.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(25, 6)
						.addBox(4.8F, -0.7F, -2.7F, 3.9F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(18, 4).addBox(4.8F, -0.7F, 2.6F, 3.9F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(93, 91)
						.addBox(4.7F, -0.6F, -2.6F, 3.6F, 3.3F, 0.3F, new CubeDeformation(0.0F)).texOffs(121, 67).addBox(4.7F, -0.6F, 2.3F, 3.6F, 3.3F, 0.3F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1",
				CubeListBuilder.create().texOffs(94, 82).addBox(-1.6F, -1.6F, -2.3F, 3.6F, 0.3F, 4.6F, new CubeDeformation(0.0F)).texOffs(23, 9).addBox(-1.6F, -1.6F, -2.6F, 3.6F, 3.3F, 0.3F, new CubeDeformation(0.0F)).texOffs(35, 0)
						.addBox(2.0F, -1.6F, -2.6F, 0.3F, 3.3F, 5.2F, new CubeDeformation(0.0F)).texOffs(37, 15).addBox(-1.6F, -1.6F, 2.3F, 3.6F, 3.3F, 0.3F, new CubeDeformation(0.0F)).texOffs(17, 27)
						.addBox(-1.5F, -1.7F, -2.7F, 3.9F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(2.3F, -1.7F, -2.7F, 0.1F, 3.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(1, 0)
						.addBox(-1.6F, -1.6F, -2.7F, 0.1F, 3.3F, 0.1F, new CubeDeformation(0.0F)).texOffs(16, 11).addBox(-1.6F, -1.7F, -2.7F, 0.1F, 0.1F, 5.3F, new CubeDeformation(0.0F)).texOffs(13, 15)
						.addBox(-1.6F, 1.7F, -2.7F, 0.1F, 0.1F, 0.4F, new CubeDeformation(0.0F)).texOffs(14, 16).addBox(-1.6F, 1.7F, -2.7F, 4.0F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(16, 14)
						.addBox(2.3F, 1.7F, -2.6F, 0.1F, 0.1F, 5.2F, new CubeDeformation(0.0F)).texOffs(2, 1).addBox(-1.6F, 1.7F, 2.0F, 0.1F, 0.1F, 0.7F, new CubeDeformation(0.0F)).texOffs(3, 2)
						.addBox(-1.6F, 1.7F, 2.6F, 4.0F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(2, 0).addBox(-1.6F, -1.7F, 2.6F, 0.1F, 3.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(16, 2)
						.addBox(-1.5F, -1.7F, 2.6F, 3.9F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(58, 23).addBox(2.3F, -1.7F, -2.6F, 0.1F, 0.1F, 5.2F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.3F, -1.7F, 2.6F, 0.1F, 3.4F, 0.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.3F, 1.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(43, 72).addBox(0.175F, -2.25F, -0.05F, 1.0F, 4.7F, 0.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7F, 2.0F, 2.35F, 0.0F, 0.0F, -0.1309F));
		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3", CubeListBuilder.create().texOffs(49, 18).addBox(-1.175F, -2.25F, -0.05F, 1.0F, 4.7F, 0.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8F, 2.0F, 2.35F, 0.0F, 0.0F, 0.1309F));
		PartDefinition Body_r4 = Body.addOrReplaceChild("Body_r4", CubeListBuilder.create().texOffs(16, 43).addBox(-0.375F, -0.975F, -0.05F, 1.0F, 1.8F, 0.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3509F, 3.9939F, -2.35F, 0.0F, 0.0F, -0.2618F));
		PartDefinition Body_r5 = Body.addOrReplaceChild("Body_r5", CubeListBuilder.create().texOffs(61, 64).addBox(-0.375F, -0.975F, -0.05F, 1.0F, 1.8F, 0.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7F, 2.3F, -2.35F, 0.0F, 0.0F, -0.1309F));
		PartDefinition Body_r6 = Body.addOrReplaceChild("Body_r6", CubeListBuilder.create().texOffs(53, 45).addBox(-0.525F, 0.75F, -0.05F, 1.0F, 1.8F, 0.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7F, 2.3F, -2.35F, 0.0F, 0.0F, 0.2618F));
		PartDefinition Body_r7 = Body.addOrReplaceChild("Body_r7", CubeListBuilder.create().texOffs(11, 31).addBox(-0.625F, -0.975F, -0.05F, 1.0F, 1.8F, 0.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7F, 2.3F, -2.35F, 0.0F, 0.0F, 0.1309F));
		PartDefinition Body_r8 = Body.addOrReplaceChild("Body_r8", CubeListBuilder.create().texOffs(2, 10).addBox(-0.2F, -0.2625F, -0.05F, 0.4F, 2.25F, 0.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9377F, 0.0279F, 2.35F, 0.0F, 0.0F, 0.2618F));
		PartDefinition Body_r9 = Body.addOrReplaceChild("Body_r9", CubeListBuilder.create().texOffs(3, 9).addBox(-0.2F, -0.0375F, -0.05F, 0.4F, 3.925F, 0.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -0.1875F, 2.35F, 0.0F, 0.0F, -0.2618F));
		PartDefinition Body_r10 = Body.addOrReplaceChild("Body_r10", CubeListBuilder.create().texOffs(79, 90).addBox(-0.7F, -1.9F, -0.125F, 1.0F, 7.0F, 0.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4785F, 6.6403F, 2.15F, 0.0F, 0.0F, -0.8727F));
		PartDefinition Body_r11 = Body.addOrReplaceChild("Body_r11", CubeListBuilder.create().texOffs(4, 29).addBox(-0.3F, -5.05F, -2.25F, 1.0F, 7.4F, 0.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7F, 7.85F, 4.275F, 0.0F, 0.0F, 0.4363F));
		PartDefinition Body_r12 = Body.addOrReplaceChild("Body_r12", CubeListBuilder.create().texOffs(38, 69).addBox(-0.275F, -1.9F, -0.125F, 0.575F, 7.0F, 0.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2785F, 6.6403F, -2.125F, 0.0F, 0.0F, -0.8727F));
		PartDefinition Body_r13 = Body.addOrReplaceChild("Body_r13", CubeListBuilder.create().texOffs(0, 30).addBox(-0.3F, -5.05F, -2.25F, 1.0F, 7.4F, 0.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 7.85F, 0.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(67, 27).addBox(9.2F, 3.0F, -5.0F, 4.0F, 7.0F, 4.4F, new CubeDeformation(0.0F)), PartPose.offset(-17.4F, 2.0F, 2.8F));
		PartDefinition LeftArm_r1 = RightArm.addOrReplaceChild("LeftArm_r1",
				CubeListBuilder.create().texOffs(4, 1).addBox(-3.0F, 1.0F, 2.075F, 3.6F, 0.5F, 0.1F, new CubeDeformation(0.0F)).texOffs(95, 65).addBox(-3.1F, 0.0F, 2.075F, 3.8F, 0.5F, 0.2F, new CubeDeformation(0.0F)).texOffs(55, 14)
						.addBox(-3.1F, -1.0F, 2.075F, 3.8F, 0.5F, 0.2F, new CubeDeformation(0.0F)).texOffs(61, 77).addBox(-3.1F, -2.0F, 2.075F, 3.8F, 0.5F, 0.2F, new CubeDeformation(0.0F)).texOffs(65, 85)
						.addBox(-3.1F, -3.0F, 2.075F, 3.8F, 0.5F, 0.2F, new CubeDeformation(0.0F)).texOffs(0, 41).addBox(-2.8F, -3.6F, 2.075F, 3.2F, 4.7F, 0.2F, new CubeDeformation(0.0F)).texOffs(97, 54)
						.addBox(-2.7F, -3.5F, 2.175F, 3.0F, 4.5F, 0.2F, new CubeDeformation(0.0F)).texOffs(101, 42).addBox(-3.5F, -3.2F, -2.025F, 4.6F, 4.2F, 4.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.2F, 8.0F, -1.6F, 0.0F, -1.5708F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(108, 28).addBox(-2.0F, -4.23F, -3.59F, 4.0F, 7.0F, 4.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.2F, 9.23F, -1.41F, 0.0F, 3.1416F, 0.0F));
		PartDefinition LeftArm_r2 = LeftArm.addOrReplaceChild("LeftArm_r2",
				CubeListBuilder.create().texOffs(6, 3).addBox(-3.0F, 1.0F, 2.075F, 3.6F, 0.5F, 0.1F, new CubeDeformation(0.0F)).texOffs(3, 102).addBox(-3.1F, 0.0F, 2.075F, 3.8F, 0.5F, 0.2F, new CubeDeformation(0.0F)).texOffs(83, 89)
						.addBox(-3.1F, -1.0F, 2.075F, 3.8F, 0.5F, 0.2F, new CubeDeformation(0.0F)).texOffs(46, 106).addBox(-3.1F, -2.0F, 2.075F, 3.8F, 0.5F, 0.2F, new CubeDeformation(0.0F)).texOffs(113, 61)
						.addBox(-3.1F, -3.0F, 2.075F, 3.8F, 0.5F, 0.2F, new CubeDeformation(0.0F)).texOffs(1, 17).addBox(-2.8F, -3.6F, 2.075F, 3.2F, 4.7F, 0.2F, new CubeDeformation(0.0F)).texOffs(43, 47)
						.addBox(-2.7F, -3.5F, 2.175F, 3.0F, 4.5F, 0.2F, new CubeDeformation(0.0F)).texOffs(98, 69).addBox(-3.5F, -3.2F, -2.025F, 4.6F, 4.2F, 4.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.77F, -0.19F, 0.0F, -1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
