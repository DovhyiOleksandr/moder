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
public class Modeloplot_tulovish<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("doz_in_maincraft", "modeloplot_tulovish"), "main");
	public final ModelPart Body;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;

	public Modeloplot_tulovish(ModelPart root) {
		this.Body = root.getChild("Body");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(110, 0).addBox(0.5F, 7.6F, -2.5F, 4.1F, 1.3F, 4.9F, new CubeDeformation(0.0F)).texOffs(110, 0).addBox(-4.5F, 7.6F, -2.6F, 4.0F, 1.3F, 5.0F, new CubeDeformation(0.0F)).texOffs(122, 0)
						.addBox(-0.5F, 7.6F, 0.7F, 1.0F, 1.3F, 1.7F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0F, 7.6F, -2.9F, 0.4F, 1.3F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.9F, 7.6F, -2.9F, 0.2F, 1.3F, 0.3F, new CubeDeformation(0.0F)).texOffs(126, 0).addBox(-1.6F, 7.65F, -2.7F, 0.6F, 1.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(124, 0)
						.addBox(-4.2F, 5.55F, -2.7F, 1.4F, 1.6F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 127).addBox(-3.625F, 6.1F, -2.75F, 0.25F, 0.325F, 0.05F, new CubeDeformation(0.0F)).texOffs(125, 0)
						.addBox(-2.625F, 5.525F, -2.725F, 1.45F, 0.725F, 0.025F, new CubeDeformation(0.0F)).texOffs(0, 127).addBox(-2.025F, 6.1F, -2.75F, 0.25F, 0.325F, 0.05F, new CubeDeformation(0.0F)).texOffs(123, 1)
						.addBox(1.075F, 5.525F, -2.725F, 1.45F, 0.725F, 0.025F, new CubeDeformation(0.0F)).texOffs(0, 127).addBox(1.675F, 6.1F, -2.75F, 0.25F, 0.325F, 0.05F, new CubeDeformation(0.0F)).texOffs(125, 0)
						.addBox(2.675F, 5.525F, -2.725F, 1.45F, 0.725F, 0.025F, new CubeDeformation(0.0F)).texOffs(0, 127).addBox(3.275F, 6.1F, -2.75F, 0.25F, 0.325F, 0.05F, new CubeDeformation(0.0F)).texOffs(125, 0)
						.addBox(-4.225F, 5.525F, -2.725F, 1.45F, 0.725F, 0.025F, new CubeDeformation(0.0F)).texOffs(124, 0).addBox(2.7F, 5.55F, -2.7F, 1.4F, 1.6F, 0.3F, new CubeDeformation(0.0F)).texOffs(124, 0)
						.addBox(1.1F, 5.55F, -2.7F, 1.4F, 1.6F, 0.3F, new CubeDeformation(0.0F)).texOffs(109, 0).addBox(-4.6F, 6.45F, -2.6F, 9.1F, 0.6F, 0.2F, new CubeDeformation(0.0F)).texOffs(117, 0)
						.addBox(-4.6F, 6.45F, -2.6F, 0.2F, 0.6F, 4.9F, new CubeDeformation(0.0F)).texOffs(109, 0).addBox(-4.6F, 6.45F, 2.3F, 9.1F, 0.6F, 0.2F, new CubeDeformation(0.0F)).texOffs(123, 0)
						.addBox(4.5F, 6.45F, 0.6F, 0.2F, 0.6F, 1.9F, new CubeDeformation(0.0F)).texOffs(123, 0).addBox(4.5F, 6.45F, -2.6F, 0.2F, 0.6F, 2.025F, new CubeDeformation(0.0F)).texOffs(124, 0)
						.addBox(-2.6F, 5.55F, -2.7F, 1.4F, 1.6F, 0.3F, new CubeDeformation(0.0F)).texOffs(126, 0).addBox(1.0F, 7.65F, -2.7F, 0.6F, 1.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(125, 0)
						.addBox(-0.6F, 7.8F, -2.7F, 1.2F, 0.9F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.2F, 7.6F, -2.6F, 0.4F, 1.3F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.6F, 7.6F, -2.9F, 0.4F, 1.3F, 0.4F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(1.7F, 7.6F, -2.9F, 0.2F, 1.3F, 0.4F, new CubeDeformation(0.0F)).texOffs(100, 16)
						.addBox(-4.4F, 1.0F, -2.4F, 8.9F, 8.0F, 4.7F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(4.4985F, 2.7052F, -0.6965F, 0.175F, 0.3F, 0.6F, new CubeDeformation(0.0F)).texOffs(0, 125)
						.addBox(4.4985F, 2.3052F, 0.5035F, 0.3F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 126).addBox(4.4985F, 2.3052F, -0.6965F, 0.3F, 0.1F, 1.3F, new CubeDeformation(0.0F)).texOffs(0, 126)
						.addBox(4.4985F, 2.6052F, -0.0965F, 0.2F, 0.5F, 0.6F, new CubeDeformation(0.0F)).texOffs(0, 127).addBox(4.6985F, 2.7052F, -0.6965F, 0.1F, 0.3F, 0.6F, new CubeDeformation(0.0F)).texOffs(0, 126)
						.addBox(4.4985F, 3.2052F, -0.6965F, 0.3F, 0.1F, 1.3F, new CubeDeformation(0.0F)).texOffs(0, 125).addBox(4.6985F, 2.3052F, -0.7965F, 0.1F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(109, 0)
						.addBox(-4.4015F, 2.4052F, -2.5965F, 9.1F, 0.8F, 0.2F, new CubeDeformation(0.0F)).texOffs(0, 122).addBox(-4.6015F, -2.9948F, -2.5965F, 0.2F, 1.1F, 4.9F, new CubeDeformation(0.0F)).texOffs(0, 126)
						.addBox(-4.6015F, -2.9948F, 2.3035F, 9.1F, 1.1F, 0.2F, new CubeDeformation(0.0F)).texOffs(0, 122).addBox(4.4985F, -2.9948F, -2.3965F, 0.2F, 1.1F, 4.9F, new CubeDeformation(0.0F)).texOffs(0, 126)
						.addBox(-4.4015F, -2.9948F, -2.5965F, 9.1F, 1.1F, 0.2F, new CubeDeformation(0.0F)).texOffs(117, 0).addBox(-4.6015F, 2.4052F, -2.5965F, 0.2F, 0.8F, 4.9F, new CubeDeformation(0.0F)).texOffs(109, 0)
						.addBox(-4.6015F, 2.4052F, 2.3035F, 9.3F, 0.8F, 0.2F, new CubeDeformation(0.0F)).texOffs(123, 0).addBox(4.4985F, 2.4052F, -2.3965F, 0.2F, 0.8F, 1.9F, new CubeDeformation(0.0F)).texOffs(124, 0)
						.addBox(4.4985F, 2.4052F, 0.6035F, 0.2F, 0.8F, 1.7F, new CubeDeformation(0.0F)).texOffs(0, 125).addBox(4.4985F, 7.1052F, -0.6965F, 0.3F, 0.1F, 1.2F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(4.4985F, 6.6552F, -0.6965F, 0.175F, 0.3F, 0.6F, new CubeDeformation(0.0F)).texOffs(0, 127).addBox(4.6985F, 6.6552F, -0.6965F, 0.1F, 0.3F, 0.6F, new CubeDeformation(0.0F)).texOffs(0, 126)
						.addBox(4.4985F, 6.5552F, -0.0965F, 0.2F, 0.5F, 0.6F, new CubeDeformation(0.0F)).texOffs(0, 125).addBox(4.4985F, 6.3052F, -0.6965F, 0.3F, 0.1F, 1.2F, new CubeDeformation(0.0F)).texOffs(0, 125)
						.addBox(4.6985F, 6.3052F, -0.7965F, 0.1F, 0.9F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 125).addBox(4.4985F, 6.3052F, 0.5035F, 0.3F, 0.9F, 0.1F, new CubeDeformation(0.0F)).texOffs(100, 14)
						.addBox(-4.4F, -3.0F, -2.4F, 8.9F, 4.0F, 4.7F, new CubeDeformation(0.0F)).texOffs(0, 122).addBox(-4.4F, -3.0F, -3.2F, 8.9F, 0.2F, 5.5F, new CubeDeformation(0.0F)).texOffs(0, 124)
						.addBox(-3.5F, 0.2F, 2.3F, 7.1F, 3.0F, 0.4F, new CubeDeformation(0.0F)).texOffs(0, 125).addBox(-3.325F, -2.4F, 2.3F, 6.8F, 2.2F, 0.4F, new CubeDeformation(0.0F)).texOffs(0, 125)
						.addBox(3.4F, -2.4F, 2.3F, 0.2F, 2.2F, 0.5F, new CubeDeformation(0.0F)).texOffs(125, 124).addBox(3.1F, -2.1F, 2.3F, 0.2F, 1.7F, 0.425F, new CubeDeformation(0.0F)).texOffs(125, 124)
						.addBox(2.1F, -2.1F, 2.3F, 0.2F, 1.7F, 0.425F, new CubeDeformation(0.0F)).texOffs(125, 124).addBox(-1.9F, -2.1F, 2.3F, 0.8F, 0.2F, 0.425F, new CubeDeformation(0.0F)).texOffs(125, 124)
						.addBox(-3.2F, -2.1F, 2.3F, 1.0F, 0.2F, 0.425F, new CubeDeformation(0.0F)).texOffs(125, 124).addBox(-1.1F, -2.1F, 2.3F, 0.2F, 1.7F, 0.425F, new CubeDeformation(0.0F)).texOffs(125, 124)
						.addBox(-1.9F, -0.6F, 2.3F, 0.8F, 0.2F, 0.425F, new CubeDeformation(0.0F)).texOffs(125, 124).addBox(-2.1F, -2.1F, 2.3F, 0.2F, 1.7F, 0.425F, new CubeDeformation(0.0F)).texOffs(125, 124)
						.addBox(-2.8F, -1.9F, 2.3F, 0.2F, 1.5F, 0.425F, new CubeDeformation(0.0F)).texOffs(125, 124).addBox(2.3F, -0.6F, 2.3F, 0.8F, 0.2F, 0.425F, new CubeDeformation(0.0F)).texOffs(125, 124)
						.addBox(2.3F, -2.1F, 2.3F, 0.8F, 0.2F, 0.425F, new CubeDeformation(0.0F)).texOffs(125, 124).addBox(0.7F, -2.1F, 2.3F, 0.2F, 1.7F, 0.425F, new CubeDeformation(0.0F)).texOffs(125, 124)
						.addBox(1.7F, -2.1F, 2.3F, 0.2F, 1.7F, 0.425F, new CubeDeformation(0.0F)).texOffs(125, 124).addBox(0.9F, -2.1F, 2.3F, 0.8F, 0.2F, 0.425F, new CubeDeformation(0.0F)).texOffs(125, 124)
						.addBox(-0.8F, -2.1F, 2.3F, 0.2F, 1.7F, 0.425F, new CubeDeformation(0.0F)).texOffs(125, 124).addBox(0.2F, -2.1F, 2.3F, 0.2F, 1.2F, 0.425F, new CubeDeformation(0.0F)).texOffs(125, 124)
						.addBox(-0.6F, -2.1F, 2.3F, 0.8F, 0.2F, 0.425F, new CubeDeformation(0.0F)).texOffs(0, 125).addBox(-3.5F, -2.4F, 2.3F, 0.2F, 2.2F, 0.5F, new CubeDeformation(0.0F)).texOffs(2, 127)
						.addBox(-3.5F, -0.2F, 2.3F, 7.1F, 0.2F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 127).addBox(-3.5F, -2.6F, 2.3F, 7.1F, 0.2F, 0.5F, new CubeDeformation(0.0F)).texOffs(112, 15)
						.addBox(-3.7F, -2.8F, 2.3F, 7.5F, 9.9F, 0.25F, new CubeDeformation(0.0F)).texOffs(110, 13).addBox(-4.3F, -1.9F, 2.3F, 8.7F, 4.3F, 0.15F, new CubeDeformation(0.0F)).texOffs(110, 14)
						.addBox(-4.3F, 3.2F, 2.3F, 8.7F, 3.3F, 0.15F, new CubeDeformation(0.0F)).texOffs(0, 124).addBox(-3.5F, 3.4F, 2.3F, 7.1F, 3.0F, 0.4F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 1.0F, 0.0F));
		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(125, 124).addBox(-0.7189F, 1.971F, 2.3F, 0.2F, 0.575F, 0.425F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition Body_r2 = Body
				.addOrReplaceChild(
						"Body_r2", CubeListBuilder.create().texOffs(0, 125).addBox(-0.6306F, 0.8576F, -2.6249F, 1.175F, 1.75F, 0.975F, new CubeDeformation(0.0F)).texOffs(0, 124)
								.addBox(-2.1F, 0.3805F, -2.9779F, 1.5F, 2.225F, 1.35F, new CubeDeformation(0.0F)).texOffs(10, 118).addBox(0.5F, 0.3805F, -2.9779F, 1.5F, 2.225F, 1.35F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3",
				CubeListBuilder.create().texOffs(0, 124).addBox(-4.3504F, -0.2635F, -3.0196F, 2.275F, 2.275F, 1.3F, new CubeDeformation(0.0F)).texOffs(78, 10).addBox(-4.6504F, 0.5865F, -2.5196F, 2.875F, 1.375F, 0.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, -0.0873F, 0.0F, -0.2618F));
		PartDefinition Body_r4 = Body.addOrReplaceChild("Body_r4",
				CubeListBuilder.create().texOffs(0, 124).addBox(1.9845F, -0.2173F, -3.0174F, 2.25F, 2.225F, 1.3F, new CubeDeformation(0.0F)).texOffs(14, 78).addBox(1.6845F, -0.2173F, -2.4924F, 2.85F, 2.225F, 0.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, -0.0873F, 0.0F, 0.2618F));
		PartDefinition Body_r5 = Body.addOrReplaceChild("Body_r5",
				CubeListBuilder.create().texOffs(0, 124).addBox(-4.3559F, 1.5579F, -3.2584F, 1.825F, 2.05F, 1.475F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.6559F, 1.5579F, -2.7584F, 0.325F, 2.05F, 0.275F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.0436F, 0.0F, -0.2618F));
		PartDefinition Body_r6 = Body.addOrReplaceChild("Body_r6", CubeListBuilder.create().texOffs(0, 124).addBox(-2.1F, 2.1814F, -3.2921F, 4.1F, 2.125F, 1.475F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition Body_r7 = Body.addOrReplaceChild("Body_r7",
				CubeListBuilder.create().texOffs(0, 127).addBox(4.514F, 9.6552F, -0.9231F, 0.2F, 0.3F, 0.6F, new CubeDeformation(0.0F)).texOffs(0, 127).addBox(4.514F, 5.7052F, -0.9231F, 0.2F, 0.3F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.0F, -0.1745F, 0.0F));
		PartDefinition Body_r8 = Body.addOrReplaceChild("Body_r8",
				CubeListBuilder.create().texOffs(0, 124).addBox(2.529F, 1.5981F, -3.2493F, 1.7F, 2.05F, 1.45F, new CubeDeformation(0.0F)).texOffs(5, 125).addBox(2.229F, 1.5981F, -2.7243F, 2.3F, 2.05F, 0.275F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.0436F, 0.0F, 0.2618F));
		PartDefinition Body_r9 = Body.addOrReplaceChild("Body_r9",
				CubeListBuilder.create().texOffs(0, 122).addBox(3.0184F, 3.3417F, -3.5596F, 1.2F, 3.875F, 1.325F, new CubeDeformation(0.0F)).texOffs(63, 79).addBox(2.7184F, 3.3417F, -3.0346F, 1.8F, 1.1F, 0.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.1309F, 0.0F, 0.2618F));
		PartDefinition Body_r10 = Body.addOrReplaceChild("Body_r10",
				CubeListBuilder.create().texOffs(43, 79).addBox(-4.6602F, 3.31F, -3.0686F, 1.8F, 1.275F, 0.825F, new CubeDeformation(0.0F)).texOffs(0, 122).addBox(-4.3602F, 3.31F, -3.5686F, 1.2F, 3.875F, 1.325F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.1309F, 0.0F, -0.2618F));
		PartDefinition Body_r11 = Body.addOrReplaceChild("Body_r11", CubeListBuilder.create().texOffs(33, 81).addBox(-4.333F, 1.0475F, -2.4683F, 0.3F, 0.85F, 0.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, -0.1309F, 0.0262F, 0.0F));
		PartDefinition Body_r12 = Body
				.addOrReplaceChild(
						"Body_r12", CubeListBuilder.create().texOffs(78, 63).addBox(-1.4F, 8.0152F, -3.4779F, 2.7F, 1.0F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 118)
								.addBox(-2.1F, 3.9902F, -3.6529F, 4.1F, 4.025F, 1.3F, new CubeDeformation(0.0F)).texOffs(0, 126).addBox(-1.1F, 8.0152F, -3.6529F, 2.1F, 1.0F, 0.5F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition Body_r13 = Body.addOrReplaceChild("Body_r13",
				CubeListBuilder.create().texOffs(0, 0).addBox(11.6F, -0.6F, -2.8F, 0.1F, 1.2F, 0.4F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(11.15F, -0.6F, -2.8F, 0.2F, 1.2F, 0.4F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(10.8F, -0.625F, -2.8F, 0.1F, 1.225F, 0.4F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(10.55F, -1.9F, -2.9F, 0.1F, 1.3F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(11.85F, -1.9F, -2.9F, 0.1F, 1.3F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(10.55F, 0.6F, -2.9F, 0.1F, 1.3F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(11.85F, 0.6F, -2.9F, 0.1F, 1.3F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition Body_r14 = Body.addOrReplaceChild("Body_r14",
				CubeListBuilder.create().texOffs(125, 0).addBox(-4.225F, 2.35F, 8.525F, 1.45F, 0.35F, 0.025F, new CubeDeformation(0.0F)).texOffs(125, 0).addBox(2.675F, 2.35F, 8.525F, 1.45F, 0.35F, 0.025F, new CubeDeformation(0.0F)).texOffs(125, 0)
						.addBox(1.075F, 2.35F, 8.525F, 1.45F, 0.35F, 0.025F, new CubeDeformation(0.0F)).texOffs(125, 0).addBox(-2.625F, 2.35F, 8.525F, 1.45F, 0.35F, 0.025F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(110, 15).addBox(-3.4216F, 0.0519F, -2.3267F, 4.1F, 12.4F, 4.6F, new CubeDeformation(0.0F)).texOffs(62, 118).addBox(-3.8216F, 5.7519F, -2.3267F, 0.4F, 4.9F, 4.6F, new CubeDeformation(0.0F))
						.texOffs(117, 122).addBox(-3.9216F, 5.7519F, -2.7267F, 0.1F, 0.2F, 5.4F, new CubeDeformation(0.0F)).texOffs(117, 122).addBox(-3.9216F, 10.4519F, -2.7267F, 0.1F, 0.2F, 5.4F, new CubeDeformation(0.0F)).texOffs(118, 4)
						.addBox(-3.6216F, 5.1519F, -2.3267F, 0.2F, 0.6F, 4.6F, new CubeDeformation(0.0F)).texOffs(118, 0).addBox(-3.6216F, 10.6519F, -2.3267F, 0.2F, 0.6F, 4.6F, new CubeDeformation(0.0F)).texOffs(50, 122)
						.addBox(-3.8216F, 5.7519F, -2.7267F, 3.4F, 4.9F, 0.4F, new CubeDeformation(0.0F)).texOffs(51, 122).addBox(-3.8216F, 5.7519F, 2.2733F, 3.4F, 4.9F, 0.4F, new CubeDeformation(0.0F)).texOffs(120, 126)
						.addBox(-3.9216F, 5.7519F, 2.6733F, 3.5F, 0.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(120, 126).addBox(-3.9216F, 10.4519F, -2.8267F, 3.5F, 0.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(120, 126)
						.addBox(-3.9216F, 5.7519F, -2.8267F, 3.5F, 0.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(120, 126).addBox(-3.9216F, 10.4519F, 2.6733F, 3.5F, 0.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(120, 126)
						.addBox(-0.6216F, 9.2519F, 2.6733F, 0.2F, 1.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(120, 126).addBox(-0.6216F, 7.7519F, 2.6733F, 0.2F, 0.9F, 0.1F, new CubeDeformation(0.0F)).texOffs(120, 126)
						.addBox(-0.6216F, 5.9519F, 2.6733F, 0.2F, 1.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(120, 126).addBox(-0.6216F, 9.2519F, -2.8267F, 0.2F, 1.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(120, 126)
						.addBox(-0.6216F, 7.7519F, -2.8267F, 0.2F, 0.9F, 0.1F, new CubeDeformation(0.0F)).texOffs(120, 126).addBox(-0.6216F, 5.9519F, -2.8267F, 0.2F, 1.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(119, 0)
						.addBox(-3.6216F, 5.1519F, 2.2733F, 4.3F, 0.6F, 0.2F, new CubeDeformation(0.0F)).texOffs(117, 0).addBox(0.6784F, 5.1519F, -2.5267F, 0.2F, 0.6F, 5.0F, new CubeDeformation(0.0F)).texOffs(126, 0)
						.addBox(-0.4216F, 5.7519F, 2.2733F, 0.8F, 4.9F, 0.2F, new CubeDeformation(0.0F)).texOffs(119, 0).addBox(-3.6216F, 5.1519F, -2.5267F, 4.3F, 0.6F, 0.2F, new CubeDeformation(0.0F)).texOffs(126, 0)
						.addBox(-0.4216F, 5.7519F, -2.5267F, 0.8F, 4.9F, 0.2F, new CubeDeformation(0.0F)).texOffs(119, 0).addBox(-3.6216F, 10.6519F, -2.5267F, 4.3F, 0.6F, 0.2F, new CubeDeformation(0.0F)).texOffs(122, 0)
						.addBox(-3.6216F, 11.2519F, -2.5267F, 2.5F, 0.5F, 0.2F, new CubeDeformation(0.0F)).texOffs(121, 7).addBox(-3.6216F, 11.2519F, -2.5267F, 0.8F, 1.0F, 0.2F, new CubeDeformation(0.0F)).texOffs(126, 0)
						.addBox(-3.6216F, 11.2519F, 2.2733F, 0.4F, 1.175F, 0.2F, new CubeDeformation(0.0F)).texOffs(118, 0).addBox(-3.6216F, 11.2519F, -2.3267F, 0.4F, 1.175F, 4.6F, new CubeDeformation(0.0F)).texOffs(122, 0)
						.addBox(-3.6216F, 11.2519F, 2.2733F, 2.5F, 0.5F, 0.2F, new CubeDeformation(0.0F)).texOffs(126, 0).addBox(-3.6216F, 11.2519F, 2.2733F, 0.8F, 1.0F, 0.2F, new CubeDeformation(0.0F)).texOffs(126, 3)
						.addBox(-3.6216F, 11.2519F, -2.5267F, 0.4F, 1.175F, 0.2F, new CubeDeformation(0.0F)).texOffs(119, 0).addBox(-3.6216F, 10.6519F, 2.2733F, 4.3F, 0.6F, 0.2F, new CubeDeformation(0.0F)).texOffs(120, 127)
						.addBox(-4.0216F, 8.6519F, 2.6733F, 3.7F, 0.6F, 0.2F, new CubeDeformation(0.0F)).texOffs(120, 127).addBox(-4.0216F, 7.1519F, -2.9267F, 3.7F, 0.6F, 0.2F, new CubeDeformation(0.0F)).texOffs(120, 127)
						.addBox(-4.0216F, 8.6519F, -2.9267F, 3.7F, 0.6F, 0.2F, new CubeDeformation(0.0F)).texOffs(120, 127).addBox(-4.0216F, 7.1519F, 2.6733F, 3.7F, 0.6F, 0.2F, new CubeDeformation(0.0F)).texOffs(116, 122)
						.addBox(-4.0216F, 8.6519F, -2.7267F, 0.2F, 0.6F, 5.4F, new CubeDeformation(0.0F)).texOffs(116, 122).addBox(-4.0216F, 7.1519F, -2.7267F, 0.2F, 0.6F, 5.4F, new CubeDeformation(0.0F)).texOffs(52, 127)
						.addBox(-0.4216F, 7.0519F, 2.4733F, 0.2F, 0.8F, 0.2F, new CubeDeformation(0.0F)).texOffs(52, 127).addBox(-0.4216F, 8.5519F, -2.7267F, 0.2F, 0.8F, 0.2F, new CubeDeformation(0.0F)).texOffs(52, 127)
						.addBox(-0.4216F, 7.0519F, -2.7267F, 0.2F, 0.8F, 0.2F, new CubeDeformation(0.0F)).texOffs(52, 127).addBox(-0.4216F, 8.5519F, 2.4733F, 0.2F, 0.8F, 0.2F, new CubeDeformation(0.0F)).texOffs(117, 0)
						.addBox(0.6784F, 10.6519F, -2.5267F, 0.2F, 0.6F, 5.0F, new CubeDeformation(0.0F)).texOffs(120, 0).addBox(-3.6216F, 2.6519F, 2.2733F, 3.6F, 1.3F, 0.2F, new CubeDeformation(0.0F)).texOffs(126, 0)
						.addBox(-0.0216F, -0.3481F, -2.5267F, 0.7F, 4.3F, 0.2F, new CubeDeformation(0.0F)).texOffs(126, 0).addBox(-0.0216F, 0.4519F, 2.2733F, 0.7F, 3.5F, 0.2F, new CubeDeformation(0.0F)).texOffs(126, 0)
						.addBox(-0.0216F, -0.3481F, 2.2733F, 0.5F, 0.8F, 0.2F, new CubeDeformation(0.0F)).texOffs(120, 0).addBox(-3.6216F, 2.6519F, -2.5267F, 3.6F, 1.3F, 0.2F, new CubeDeformation(0.0F)).texOffs(51, 122)
						.addBox(-3.8216F, -0.3481F, -2.7267F, 4.0F, 3.0F, 0.4F, new CubeDeformation(0.0F)).texOffs(56, 125).addBox(0.1784F, 0.5519F, -2.7267F, 0.6F, 2.1F, 0.4F, new CubeDeformation(0.0F)).texOffs(69, 120)
						.addBox(-0.0216F, 0.6519F, 2.2733F, 0.8F, 2.0F, 0.4F, new CubeDeformation(0.0F)).texOffs(118, 124).addBox(-3.8216F, -0.4481F, 2.5733F, 3.8F, 0.1F, 0.2F, new CubeDeformation(0.0F)).texOffs(118, 124)
						.addBox(-1.8216F, -0.6481F, -1.8267F, 1.0F, 0.4F, 3.6F, new CubeDeformation(0.0F)).texOffs(118, 124).addBox(-1.8216F, -0.5481F, -1.8767F, 1.0F, 0.3F, 3.7F, new CubeDeformation(0.0F)).texOffs(116, 121)
						.addBox(-3.4216F, -0.6481F, -1.8267F, 1.0F, 0.4F, 3.6F, new CubeDeformation(0.0F)).texOffs(118, 124).addBox(-3.4216F, -0.5481F, -1.8767F, 1.0F, 0.3F, 3.7F, new CubeDeformation(0.0F)).texOffs(116, 122)
						.addBox(-0.0216F, -0.4481F, -2.8267F, 0.2F, 0.2F, 5.6F, new CubeDeformation(0.0F)).texOffs(118, 124).addBox(-3.8216F, -0.3481F, 2.6733F, 3.8F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(117, 122)
						.addBox(-3.9216F, -0.4481F, 2.5733F, 0.1F, 3.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(118, 124).addBox(-3.9216F, -0.4481F, 2.6733F, 0.2F, 3.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(118, 124)
						.addBox(-3.8216F, 2.4519F, 2.6733F, 4.6F, 0.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(117, 122).addBox(-3.9216F, 2.4519F, -2.6267F, 0.1F, 0.2F, 5.2F, new CubeDeformation(0.0F)).texOffs(118, 124)
						.addBox(-3.9216F, -0.4481F, -2.8267F, 3.9F, 0.1F, 0.2F, new CubeDeformation(0.0F)).texOffs(118, 124).addBox(-3.7216F, -0.3481F, -2.8267F, 3.7F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(118, 124)
						.addBox(-3.9216F, -0.3481F, -2.8267F, 0.1F, 3.0F, 0.2F, new CubeDeformation(0.0F)).texOffs(118, 124).addBox(-3.8216F, -0.3481F, -2.8267F, 0.1F, 3.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(118, 124)
						.addBox(-3.8216F, 2.4519F, -2.8267F, 4.6F, 0.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(50, 119).addBox(-3.8216F, -0.3481F, 2.2733F, 3.8F, 3.0F, 0.4F, new CubeDeformation(0.0F)).texOffs(53, 123)
						.addBox(-3.4216F, -0.3481F, -2.3267F, 4.1F, 0.4F, 4.6F, new CubeDeformation(0.0F)).texOffs(52, 120).addBox(-3.8216F, -0.3481F, -2.3267F, 0.4F, 3.0F, 4.6F, new CubeDeformation(0.0F)).texOffs(118, 0)
						.addBox(-3.6216F, 2.6519F, -2.3267F, 0.2F, 1.3F, 4.6F, new CubeDeformation(0.0F)).texOffs(117, 0).addBox(0.6784F, 0.4519F, -2.5267F, 0.2F, 3.5F, 5.0F, new CubeDeformation(0.0F)).texOffs(117, 0)
						.addBox(-3.7216F, 2.8519F, -2.5267F, 0.1F, 0.8F, 5.0F, new CubeDeformation(0.0F)).texOffs(118, 0).addBox(-3.7216F, 2.8519F, 2.4733F, 4.6F, 0.8F, 0.1F, new CubeDeformation(0.0F)).texOffs(116, 0)
						.addBox(-3.7216F, 2.8519F, -2.6267F, 4.7F, 0.8F, 0.1F, new CubeDeformation(0.0F)).texOffs(117, 0).addBox(0.8784F, 2.8519F, -2.5267F, 0.1F, 0.8F, 5.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0216F, -2.2519F, -0.0733F, 0.0F, 3.1416F, 0.0F));
		PartDefinition LeftArm_r1 = LeftArm.addOrReplaceChild("LeftArm_r1",
				CubeListBuilder.create().texOffs(125, 127).addBox(6.2F, -0.8075F, -2.5646F, 1.0F, 0.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(125, 127).addBox(4.6F, -0.8075F, -2.5646F, 1.0F, 0.4F, 0.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0216F, 1.2519F, 0.0733F, -0.48F, 0.0F, 0.0F));
		PartDefinition LeftArm_r2 = LeftArm.addOrReplaceChild("LeftArm_r2",
				CubeListBuilder.create().texOffs(118, 124).addBox(-1.0F, 3.9F, -1.95F, 1.0F, 0.3F, 3.7F, new CubeDeformation(0.0F)).texOffs(118, 121).addBox(-1.0F, 3.8F, -1.9F, 1.0F, 0.4F, 3.6F, new CubeDeformation(0.0F)).texOffs(118, 124)
						.addBox(0.3F, 3.9F, -1.95F, 1.0F, 0.3F, 3.7F, new CubeDeformation(0.0F)).texOffs(118, 119).addBox(0.3F, 3.8F, -1.9F, 1.0F, 0.4F, 3.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0216F, 1.2519F, 0.0733F, 0.0F, 0.0F, -1.5708F));
		PartDefinition LeftArm_r3 = LeftArm.addOrReplaceChild("LeftArm_r3",
				CubeListBuilder.create().texOffs(125, 127).addBox(-1.0F, 4.1561F, -0.3447F, 1.0F, 0.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(125, 127).addBox(0.3F, 4.1561F, -0.3447F, 1.0F, 0.4F, 0.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0216F, 1.2519F, 0.0733F, 0.48F, 0.0F, -1.5708F));
		PartDefinition LeftArm_r4 = LeftArm.addOrReplaceChild("LeftArm_r4",
				CubeListBuilder.create().texOffs(125, 127).addBox(-1.0F, 4.2485F, 0.0673F, 1.0F, 0.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(125, 127).addBox(0.3F, 4.2485F, 0.0673F, 1.0F, 0.4F, 0.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0216F, 1.2519F, 0.0733F, -0.48F, 0.0F, -1.5708F));
		PartDefinition LeftArm_r5 = LeftArm.addOrReplaceChild("LeftArm_r5",
				CubeListBuilder.create().texOffs(125, 127).addBox(4.6F, -0.8999F, 2.2872F, 1.0F, 0.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(125, 127).addBox(6.2F, -0.8999F, 2.2872F, 1.0F, 0.4F, 0.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0216F, 1.2519F, 0.0733F, 0.48F, 0.0F, 0.0F));
		PartDefinition LeftArm_r6 = LeftArm.addOrReplaceChild("LeftArm_r6",
				CubeListBuilder.create().texOffs(119, 0).addBox(1.3744F, 11.5545F, -2.6F, 4.075F, 0.525F, 0.2F, new CubeDeformation(0.0F)).texOffs(119, 0).addBox(1.3744F, 11.5545F, 2.2F, 4.075F, 0.525F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0216F, 1.2519F, 0.0733F, 0.0F, 0.0F, -0.2923F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(110, 15).addBox(-3.4216F, 0.0519F, -2.3267F, 4.1F, 12.4F, 4.6F, new CubeDeformation(0.0F)).texOffs(51, 118).addBox(-3.8216F, 5.7519F, -2.3267F, 0.4F, 4.9F, 4.6F, new CubeDeformation(0.0F))
						.texOffs(116, 120).addBox(-3.9216F, 5.7519F, -2.7267F, 0.1F, 0.2F, 5.4F, new CubeDeformation(0.0F)).texOffs(116, 120).addBox(-3.9216F, 10.4519F, -2.7267F, 0.1F, 0.2F, 5.4F, new CubeDeformation(0.0F)).texOffs(118, 0)
						.addBox(-3.6216F, 5.1519F, -2.3267F, 0.2F, 0.6F, 4.6F, new CubeDeformation(0.0F)).texOffs(118, 0).addBox(-3.6216F, 10.6519F, -2.3267F, 0.2F, 0.6F, 4.6F, new CubeDeformation(0.0F)).texOffs(56, 122)
						.addBox(-3.8216F, 5.7519F, -2.7267F, 3.4F, 4.9F, 0.4F, new CubeDeformation(0.0F)).texOffs(50, 122).addBox(-3.8216F, 5.7519F, 2.2733F, 3.4F, 4.9F, 0.4F, new CubeDeformation(0.0F)).texOffs(116, 120)
						.addBox(-3.9216F, 5.7519F, 2.6733F, 3.5F, 0.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(116, 120).addBox(-3.9216F, 10.4519F, -2.8267F, 3.5F, 0.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(116, 120)
						.addBox(-3.9216F, 5.7519F, -2.8267F, 3.5F, 0.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(116, 120).addBox(-3.9216F, 10.4519F, 2.6733F, 3.5F, 0.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(116, 120)
						.addBox(-0.6216F, 9.2519F, 2.6733F, 0.2F, 1.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(116, 120).addBox(-0.6216F, 7.7519F, 2.6733F, 0.2F, 0.9F, 0.1F, new CubeDeformation(0.0F)).texOffs(116, 120)
						.addBox(-0.6216F, 5.9519F, 2.6733F, 0.2F, 1.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(116, 120).addBox(-0.6216F, 9.2519F, -2.8267F, 0.2F, 1.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(116, 120)
						.addBox(-0.6216F, 7.7519F, -2.8267F, 0.2F, 0.9F, 0.1F, new CubeDeformation(0.0F)).texOffs(116, 120).addBox(-0.6216F, 5.9519F, -2.8267F, 0.2F, 1.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(119, 0)
						.addBox(-3.6216F, 5.1519F, 2.2733F, 4.3F, 0.6F, 0.2F, new CubeDeformation(0.0F)).texOffs(117, 0).addBox(0.6784F, 5.1519F, -2.5267F, 0.2F, 0.6F, 5.0F, new CubeDeformation(0.0F)).texOffs(126, 0)
						.addBox(-0.4216F, 5.7519F, 2.2733F, 0.8F, 4.9F, 0.2F, new CubeDeformation(0.0F)).texOffs(119, 2).addBox(-3.6216F, 5.1519F, -2.5267F, 4.3F, 0.6F, 0.2F, new CubeDeformation(0.0F)).texOffs(126, 1)
						.addBox(-0.4216F, 5.7519F, -2.5267F, 0.8F, 4.9F, 0.2F, new CubeDeformation(0.0F)).texOffs(119, 0).addBox(-3.6216F, 10.6519F, -2.5267F, 4.3F, 0.6F, 0.2F, new CubeDeformation(0.0F)).texOffs(122, 0)
						.addBox(-3.6216F, 11.2519F, -2.5267F, 2.5F, 0.5F, 0.2F, new CubeDeformation(0.0F)).texOffs(123, 0).addBox(-3.6216F, 11.2519F, -2.5267F, 0.8F, 1.0F, 0.2F, new CubeDeformation(0.0F)).texOffs(126, 3)
						.addBox(-3.6216F, 11.2519F, 2.2733F, 0.4F, 1.175F, 0.2F, new CubeDeformation(0.0F)).texOffs(118, 0).addBox(-3.6216F, 11.2519F, -2.3267F, 0.4F, 1.175F, 4.6F, new CubeDeformation(0.0F)).texOffs(122, 0)
						.addBox(-3.6216F, 11.2519F, 2.2733F, 2.5F, 0.5F, 0.2F, new CubeDeformation(0.0F)).texOffs(126, 0).addBox(-3.6216F, 11.2519F, 2.2733F, 0.8F, 1.0F, 0.2F, new CubeDeformation(0.0F)).texOffs(126, 0)
						.addBox(-3.6216F, 11.2519F, -2.5267F, 0.4F, 1.175F, 0.2F, new CubeDeformation(0.0F)).texOffs(119, 0).addBox(-3.6216F, 10.6519F, 2.2733F, 4.3F, 0.6F, 0.2F, new CubeDeformation(0.0F)).texOffs(120, 121)
						.addBox(-4.0216F, 8.6519F, 2.6733F, 3.7F, 0.6F, 0.2F, new CubeDeformation(0.0F)).texOffs(120, 118).addBox(-4.0216F, 7.1519F, -2.9267F, 3.7F, 0.6F, 0.2F, new CubeDeformation(0.0F)).texOffs(120, 119)
						.addBox(-4.0216F, 8.6519F, -2.9267F, 3.7F, 0.6F, 0.2F, new CubeDeformation(0.0F)).texOffs(120, 120).addBox(-4.0216F, 7.1519F, 2.6733F, 3.7F, 0.6F, 0.2F, new CubeDeformation(0.0F)).texOffs(116, 122)
						.addBox(-4.0216F, 8.6519F, -2.7267F, 0.2F, 0.6F, 5.4F, new CubeDeformation(0.0F)).texOffs(116, 120).addBox(-4.0216F, 7.1519F, -2.7267F, 0.2F, 0.6F, 5.4F, new CubeDeformation(0.0F)).texOffs(0, 127)
						.addBox(-0.4216F, 7.0519F, 2.4733F, 0.2F, 0.8F, 0.2F, new CubeDeformation(0.0F)).texOffs(0, 122).addBox(-0.4216F, 8.5519F, -2.7267F, 0.2F, 0.8F, 0.2F, new CubeDeformation(0.0F)).texOffs(0, 122)
						.addBox(-0.4216F, 7.0519F, -2.7267F, 0.2F, 0.8F, 0.2F, new CubeDeformation(0.0F)).texOffs(0, 127).addBox(-0.4216F, 8.5519F, 2.4733F, 0.2F, 0.8F, 0.2F, new CubeDeformation(0.0F)).texOffs(117, 0)
						.addBox(0.6784F, 10.6519F, -2.5267F, 0.2F, 0.6F, 5.0F, new CubeDeformation(0.0F)).texOffs(120, 0).addBox(-3.6216F, 2.6519F, 2.2733F, 3.6F, 1.3F, 0.2F, new CubeDeformation(0.0F)).texOffs(125, 0)
						.addBox(-0.0216F, -0.3481F, -2.5267F, 0.7F, 4.3F, 0.2F, new CubeDeformation(0.0F)).texOffs(126, 0).addBox(-0.0216F, 0.4519F, 2.2733F, 0.7F, 3.5F, 0.2F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.0216F, -0.3481F, 2.2733F, 0.5F, 0.8F, 0.2F, new CubeDeformation(0.0F)).texOffs(120, 0).addBox(-3.6216F, 2.6519F, -2.5267F, 3.6F, 1.3F, 0.2F, new CubeDeformation(0.0F)).texOffs(57, 114)
						.addBox(-3.8216F, -0.3481F, -2.7267F, 4.0F, 3.0F, 0.4F, new CubeDeformation(0.0F)).texOffs(0, 125).addBox(0.1784F, 0.5519F, -2.7267F, 0.6F, 2.1F, 0.4F, new CubeDeformation(0.0F)).texOffs(0, 125)
						.addBox(-0.0216F, 0.6519F, 2.2733F, 0.8F, 2.0F, 0.4F, new CubeDeformation(0.0F)).texOffs(117, 122).addBox(-3.8216F, -0.4481F, 2.5733F, 3.8F, 0.1F, 0.2F, new CubeDeformation(0.0F)).texOffs(118, 124)
						.addBox(-1.8216F, -0.6481F, -1.8267F, 1.0F, 0.4F, 3.6F, new CubeDeformation(0.0F)).texOffs(115, 122).addBox(-1.8216F, -0.5481F, -1.8767F, 1.0F, 0.3F, 3.7F, new CubeDeformation(0.0F)).texOffs(116, 122)
						.addBox(-3.4216F, -0.6481F, -1.8267F, 1.0F, 0.4F, 3.6F, new CubeDeformation(0.0F)).texOffs(113, 124).addBox(-3.4216F, -0.5481F, -1.8767F, 1.0F, 0.3F, 3.7F, new CubeDeformation(0.0F)).texOffs(116, 120)
						.addBox(-0.0216F, -0.4481F, -2.8267F, 0.2F, 0.2F, 5.6F, new CubeDeformation(0.0F)).texOffs(117, 122).addBox(-3.8216F, -0.3481F, 2.6733F, 3.8F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(117, 122)
						.addBox(-3.9216F, -0.4481F, 2.5733F, 0.1F, 3.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(117, 122).addBox(-3.9216F, -0.4481F, 2.6733F, 0.2F, 3.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(117, 122)
						.addBox(-3.8216F, 2.4519F, 2.6733F, 4.6F, 0.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(117, 122).addBox(-3.9216F, 2.4519F, -2.6267F, 0.1F, 0.2F, 5.2F, new CubeDeformation(0.0F)).texOffs(117, 122)
						.addBox(-3.9216F, -0.4481F, -2.8267F, 3.9F, 0.1F, 0.2F, new CubeDeformation(0.0F)).texOffs(117, 122).addBox(-3.7216F, -0.3481F, -2.8267F, 3.7F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(117, 122)
						.addBox(-3.9216F, -0.3481F, -2.8267F, 0.1F, 3.0F, 0.2F, new CubeDeformation(0.0F)).texOffs(117, 122).addBox(-3.8216F, -0.3481F, -2.8267F, 0.1F, 3.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(117, 122)
						.addBox(-3.8216F, 2.4519F, -2.8267F, 4.6F, 0.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(59, 124).addBox(-3.8216F, -0.3481F, 2.2733F, 3.8F, 3.0F, 0.4F, new CubeDeformation(0.0F)).texOffs(47, 115)
						.addBox(-3.4216F, -0.3481F, -2.3267F, 4.1F, 0.4F, 4.6F, new CubeDeformation(0.0F)).texOffs(42, 120).addBox(-3.8216F, -0.3481F, -2.3267F, 0.4F, 3.0F, 4.6F, new CubeDeformation(0.0F)).texOffs(118, 0)
						.addBox(-3.6216F, 2.6519F, -2.3267F, 0.2F, 1.3F, 4.6F, new CubeDeformation(0.0F)).texOffs(117, 0).addBox(0.6784F, 0.4519F, -2.5267F, 0.2F, 3.5F, 5.0F, new CubeDeformation(0.0F)).texOffs(117, 0)
						.addBox(-3.7216F, 2.8519F, -2.5267F, 0.1F, 0.8F, 5.0F, new CubeDeformation(0.0F)).texOffs(118, 0).addBox(-3.7216F, 2.8519F, 2.4733F, 4.6F, 0.8F, 0.1F, new CubeDeformation(0.0F)).texOffs(116, 0)
						.addBox(-3.7216F, 2.8519F, -2.6267F, 4.7F, 0.8F, 0.1F, new CubeDeformation(0.0F)).texOffs(109, 4).addBox(0.8784F, 2.8519F, -2.5267F, 0.1F, 0.8F, 5.1F, new CubeDeformation(0.0F)),
				PartPose.offset(-8.0784F, -2.2519F, -0.0733F));
		PartDefinition LeftArm_r7 = RightArm.addOrReplaceChild("LeftArm_r7",
				CubeListBuilder.create().texOffs(125, 126).addBox(-9.9F, -0.8075F, -2.5646F, 1.0F, 0.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(125, 126).addBox(-11.5F, -0.8075F, -2.5646F, 1.0F, 0.4F, 0.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0784F, 1.2519F, 0.0733F, -0.48F, 0.0F, 0.0F));
		PartDefinition LeftArm_r8 = RightArm.addOrReplaceChild("LeftArm_r8",
				CubeListBuilder.create().texOffs(115, 122).addBox(-1.0F, -12.2F, -1.95F, 1.0F, 0.3F, 3.7F, new CubeDeformation(0.0F)).texOffs(116, 124).addBox(-1.0F, -12.3F, -1.9F, 1.0F, 0.4F, 3.6F, new CubeDeformation(0.0F)).texOffs(118, 124)
						.addBox(0.3F, -12.2F, -1.95F, 1.0F, 0.3F, 3.7F, new CubeDeformation(0.0F)).texOffs(118, 124).addBox(0.3F, -12.3F, -1.9F, 1.0F, 0.4F, 3.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0784F, 1.2519F, 0.0733F, 0.0F, 0.0F, -1.5708F));
		PartDefinition LeftArm_r9 = RightArm.addOrReplaceChild("LeftArm_r9",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -10.1248F, 7.0894F, 1.0F, 0.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(0.3F, -10.1248F, 7.0894F, 1.0F, 0.4F, 0.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0784F, 1.2519F, 0.0733F, 0.48F, 0.0F, -1.5708F));
		PartDefinition LeftArm_r10 = RightArm.addOrReplaceChild("LeftArm_r10",
				CubeListBuilder.create().texOffs(122, 121).addBox(-1.0F, -10.0324F, -7.3668F, 1.0F, 0.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(122, 121).addBox(0.3F, -10.0324F, -7.3668F, 1.0F, 0.4F, 0.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0784F, 1.2519F, 0.0733F, -0.48F, 0.0F, -1.5708F));
		PartDefinition LeftArm_r11 = RightArm.addOrReplaceChild("LeftArm_r11",
				CubeListBuilder.create().texOffs(122, 127).addBox(-11.5F, -0.8999F, 2.2872F, 1.0F, 0.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(122, 127).addBox(-9.9F, -0.8999F, 2.2872F, 1.0F, 0.4F, 0.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0784F, 1.2519F, 0.0733F, 0.48F, 0.0F, 0.0F));
		PartDefinition LeftArm_r12 = RightArm.addOrReplaceChild("LeftArm_r12",
				CubeListBuilder.create().texOffs(119, 0).addBox(-14.0425F, 6.9145F, -2.6F, 4.075F, 0.525F, 0.2F, new CubeDeformation(0.0F)).texOffs(119, 0).addBox(-14.0425F, 6.9145F, 2.2F, 4.075F, 0.525F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0784F, 1.2519F, 0.0733F, 0.0F, 0.0F, -0.2923F));
		PartDefinition RightArm2 = RightArm.addOrReplaceChild("RightArm2", CubeListBuilder.create(), PartPose.offset(5.0784F, 24.2519F, 0.0733F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
