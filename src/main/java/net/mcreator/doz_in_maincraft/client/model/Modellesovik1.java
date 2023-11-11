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
public class Modellesovik1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("doz_in_maincraft", "modellesovik_1"), "main");
	public final ModelPart head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modellesovik1(ModelPart root) {
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
				CubeListBuilder.create().texOffs(26, 20).addBox(-2.0F, -2.25F, -2.25F, 4.0F, 2.25F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(26, 23)
						.addBox(-2.0F, -4.0F, -2.25F, 4.0F, 1.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 8).addBox(-2.0F, -4.25F, -2.0F, 4.0F, 0.5F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 12)
						.addBox(-2.25F, -4.0F, -2.0F, 0.5F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(18, 6).addBox(-2.0F, -3.0F, -2.25F, 0.5F, 0.75F, 0.5F, new CubeDeformation(0.0F)).texOffs(18, 4)
						.addBox(1.5F, -3.0F, -2.25F, 0.5F, 0.75F, 0.5F, new CubeDeformation(0.0F)).texOffs(12, 4).addBox(1.75F, -4.0F, -2.0F, 0.5F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(21, 11)
						.addBox(-2.0F, -4.0F, 1.75F, 4.0F, 4.0F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 13).addBox(-2.0F, -3.0F, -1.0F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(25, 27).addBox(0.25F, -2.5F, -1.5F, 2.0F, 2.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(10, 13)
						.addBox(0.25F, -2.5F, -1.75F, 2.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(13, 28).addBox(0.25F, -2.0F, -1.75F, 1.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(0.25F, -1.5F, -1.75F, 1.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(6, 21).addBox(0.25F, -1.0F, -1.75F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.25F, -2.0F, -1.5F, 0.5F, 1.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(16, 20).addBox(-0.75F, -1.0F, -1.75F, 0.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 10)
						.addBox(-1.25F, -1.5F, -1.75F, 1.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(7, 28).addBox(-2.25F, -2.5F, -1.5F, 2.0F, 2.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(28, 2)
						.addBox(-2.25F, -2.5F, -1.75F, 2.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(22, 16).addBox(-2.75F, -3.0F, -1.5F, 5.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(26, 0)
						.addBox(-2.25F, -2.5F, -1.5F, 4.2F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(19, 28).addBox(-1.75F, -2.0F, -1.75F, 1.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(10, 0)
						.addBox(-3.25F, -3.25F, -1.0F, 6.5F, 0.25F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 18).addBox(-2.75F, -3.0F, 1.0F, 5.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(12, 2)
						.addBox(-2.25F, -2.5F, 1.0F, 4.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(26, 25).addBox(-1.75F, -2.0F, 1.0F, 3.5F, 0.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 15.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(10, 20).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 13.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(18, 20).addBox(0.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 13.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 21).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(22, 2).addBox(0.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
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
