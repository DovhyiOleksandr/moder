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

// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelы2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("doz_in_maincraft", "modely_2"), "main");
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;

	public Modelы2(ModelPart root) {
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(48, 16).addBox(-4.0F, -1.0F, -2.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 39).addBox(-3.5F, 5.5F, 1.25F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 0)
						.addBox(-3.0F, 6.0F, 1.25F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 39).addBox(-2.5F, 6.5F, 1.25F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 31)
						.addBox(-2.0F, 7.0F, 1.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 21).addBox(-2.5F, 6.5F, -2.25F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 2)
						.addBox(-3.0F, 6.0F, -2.25F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 60).addBox(-2.0F, 7.0F, -2.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 19)
						.addBox(-3.5F, 5.5F, -2.25F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(1.0F, -5.0F, -2.5F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 68)
						.addBox(-4.0F, -5.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 47).addBox(0.0F, -1.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 50)
						.addBox(-1.0F, -2.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 12).addBox(-1.0F, -3.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 15)
						.addBox(-2.0F, -4.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 44).addBox(-3.0F, -5.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(73, 73)
						.addBox(0.0F, -3.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 6).addBox(-1.0F, -4.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 9)
						.addBox(-2.0F, -5.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 0).addBox(1.0F, -3.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 64)
						.addBox(0.0F, -4.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 55).addBox(-1.0F, -5.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(2.0F, -3.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 52).addBox(1.0F, -4.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 44)
						.addBox(0.0F, -5.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 41).addBox(3.0F, -3.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(43, 4)
						.addBox(2.0F, -4.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 48).addBox(1.0F, -5.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(-2.0F, -1.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 36).addBox(-3.0F, -2.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 4)
						.addBox(-4.0F, -3.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 65).addBox(-3.0F, -4.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 62)
						.addBox(-2.0F, -3.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 14).addBox(-3.5F, -4.5F, -2.75F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 10)
						.addBox(0.5F, -4.5F, -2.75F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(58, 44)
						.addBox(-4.0F, -5.0F, 2.0F, 8.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(52, 72).addBox(-3.5F, 2.25F, -2.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 72)
						.addBox(1.5F, 2.25F, -2.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 41).addBox(-1.0F, 2.25F, -2.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 76)
						.addBox(-4.0F, -5.0F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(49, 75).addBox(-1.0F, -2.0F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(53, 75)
						.addBox(-2.0F, -3.0F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(13, 75).addBox(1.0F, 0.0F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(45, 75)
						.addBox(0.0F, -1.0F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 53).addBox(3.0F, 2.0F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 41)
						.addBox(3.0F, 3.5F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 62).addBox(-0.5F, 3.5F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 37)
						.addBox(-4.0F, 3.5F, -2.25F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 58).addBox(-4.0F, 3.5F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 71)
						.addBox(2.0F, 1.0F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 76).addBox(-3.0F, -4.0F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 60)
						.addBox(0.5F, 3.0F, 1.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 33).addBox(-3.5F, 3.0F, 1.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 5.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(24, 33).addBox(-3.25F, -2.25F, -2.0F, 0.0F, 9.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(66, 55).addBox(-3.0F, -3.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(71, 78)
						.addBox(-4.0F, -1.75F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(67, 78).addBox(-4.0F, -1.75F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(78, 44)
						.addBox(-2.5F, -1.75F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(78, 41).addBox(-0.5F, -1.75F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 78)
						.addBox(-2.5F, 0.25F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 78).addBox(-2.5F, 2.25F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 72)
						.addBox(-0.5F, -1.75F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 74).addBox(-2.5F, -1.75F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 77)
						.addBox(-2.5F, 0.25F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(78, 6).addBox(-0.5F, 0.25F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 78)
						.addBox(-2.5F, 2.25F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(78, 39).addBox(-0.5F, 0.25F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(78, 62)
						.addBox(-4.0F, 0.25F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(63, 78).addBox(-4.0F, 0.25F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(78, 56)
						.addBox(-4.0F, 2.25F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(59, 78).addBox(-4.0F, 2.25F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(78, 54)
						.addBox(-4.0F, 4.25F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 78).addBox(-4.0F, 4.25F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition cube_r1 = RightArm.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(40, 65).addBox(2.25F, -24.75F, 6.25F, 0.0F, 10.0F, 2.0F, new CubeDeformation(-0.25F)).texOffs(44, 66).addBox(2.25F, -24.75F, 5.75F, 0.0F, 9.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(70, 68)
						.addBox(2.25F, -24.75F, 4.75F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(72, 61).addBox(2.25F, -24.75F, 4.25F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(72, 67)
						.addBox(2.25F, -24.75F, 3.75F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(10, 67).addBox(-2.25F, -24.75F, 5.25F, 0.0F, 8.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(68, 71)
						.addBox(-2.25F, -24.75F, 3.75F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(66, 71).addBox(-2.25F, -24.75F, 4.25F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(70, 61)
						.addBox(-2.25F, -24.75F, 4.75F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(64, 5).addBox(-2.25F, -24.75F, 5.75F, 0.0F, 9.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(16, 50)
						.addBox(-2.25F, -24.75F, 6.25F, 0.0F, 10.0F, 2.0F, new CubeDeformation(-0.25F)).texOffs(12, 67).addBox(2.25F, -24.75F, 5.25F, 0.0F, 8.0F, 1.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(5.0F, 22.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(77, 70).addBox(1.5F, 2.25F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 17).addBox(3.0F, 4.25F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 14)
						.addBox(3.0F, 4.25F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 11).addBox(3.0F, 2.25F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 77)
						.addBox(3.0F, 2.25F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 8).addBox(3.0F, 0.25F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 76)
						.addBox(3.0F, 0.25F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 76).addBox(3.0F, -1.75F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 76)
						.addBox(3.0F, -1.75F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 77).addBox(1.5F, -1.75F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 77)
						.addBox(-0.5F, 0.25F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 46).addBox(-0.5F, -1.75F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 77)
						.addBox(1.5F, 0.25F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 49).addBox(1.5F, 2.25F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 67)
						.addBox(1.5F, 0.25F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 64).addBox(-0.5F, 0.25F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 52)
						.addBox(-0.5F, -1.75F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 77).addBox(1.5F, -1.75F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(3.25F, -2.25F, -2.0F, 0.0F, 9.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(66, 39).addBox(-1.0F, -3.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition cube_r2 = LeftArm.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(32, 36).addBox(2.25F, -24.75F, -6.75F, 0.0F, 9.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(36, 47).addBox(2.25F, -24.75F, -6.25F, 0.0F, 8.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(52, 20)
						.addBox(-2.25F, -24.75F, -6.75F, 0.0F, 9.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(8, 67).addBox(-2.25F, -24.75F, -6.25F, 0.0F, 8.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(60, 71)
						.addBox(2.25F, -24.75F, -5.25F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(58, 71).addBox(2.25F, -24.75F, -4.75F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(46, 20)
						.addBox(2.25F, -24.75F, -5.75F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(38, 46).addBox(2.25F, -24.75F, -8.25F, 0.0F, 10.0F, 2.0F, new CubeDeformation(-0.25F)).texOffs(62, 71)
						.addBox(-2.25F, -24.75F, -5.25F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(64, 71).addBox(-2.25F, -24.75F, -4.75F, 0.0F, 6.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(14, 67)
						.addBox(-2.25F, -24.75F, -5.75F, 0.0F, 7.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(48, 19).addBox(-2.25F, -24.75F, -8.25F, 0.0F, 10.0F, 2.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-5.0F, 22.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
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
