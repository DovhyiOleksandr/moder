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
public class Modelpalach<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("doz_in_maincraft", "modelpalach"), "main");
	public final ModelPart Head;
	public final ModelPart LeftArm;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;
	public final ModelPart RightArm;
	public final ModelPart Body;
	public final ModelPart bb_main;

	public Modelpalach(ModelPart root) {
		this.Head = root.getChild("Head");
		this.LeftArm = root.getChild("LeftArm");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.RightArm = root.getChild("RightArm");
		this.Body = root.getChild("Body");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(43, 49).addBox(2.6F, -9.4F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(52, 3)
						.addBox(1.4F, -9.4F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 14).addBox(1.4F, -9.4F, 2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 50)
						.addBox(-1.6F, -9.4F, 2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 38).addBox(2.4F, -6.5F, -4.4F, 0.6F, 1.7F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 30)
						.addBox(0.5F, -6.5F, -4.4F, 0.6F, 1.7F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 30).addBox(1.1F, -4.8F, -4.4F, 1.3F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(57, 63)
						.addBox(-1.6F, -4.4F, -4.4F, 3.2F, 0.6F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 29).addBox(1.1F, -6.9F, -4.4F, 1.3F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 0)
						.addBox(-2.6F, -6.9F, -4.4F, 1.3F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 39).addBox(-3.2F, -6.5F, -4.4F, 0.6F, 1.7F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 16)
						.addBox(-2.6F, -4.8F, -4.4F, 1.3F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 39).addBox(-1.3F, -6.5F, -4.4F, 0.6F, 1.7F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.2F, -3.8F, -4.4F, 0.2F, 0.7F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.6F, -3.8F, -4.4F, 0.2F, 0.7F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.5F, -3.8F, -4.4F, 0.2F, 0.7F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(1.1F, -3.8F, -4.4F, 0.2F, 0.7F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.1F, -3.8F, -4.4F, 0.2F, 0.7F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 36).addBox(-3.3F, -9.4F, 0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 51)
						.addBox(2.6F, -9.4F, 0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 50).addBox(-0.4F, -9.4F, 0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 30)
						.addBox(-3.3F, -9.4F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 33).addBox(-0.4F, -9.4F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 0)
						.addBox(-1.6F, -9.4F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(61, 63).addBox(21.7F, -17.9F, -4.4F, 1.5F, 0.9F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, -0.9163F));
		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(51, 8).addBox(-23.1F, -18.0F, -4.4F, 1.4F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, 0.9163F));
		PartDefinition bone4 = Head.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-2.2F, -18.1F, -5.4F));
		PartDefinition Head_r3 = bone4.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(50, 22).addBox(-9.5F, -13.6F, -3.4F, 3.6F, 1.6F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3441F, 0.8192F, -2.3365F));
		PartDefinition Head_r4 = bone4.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(49, 28).addBox(-2.1F, -14.8F, -3.4F, 3.6F, 1.6F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2524F, 0.8449F, -3.1246F));
		PartDefinition Head_r5 = bone4.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(12, 32).addBox(-2.1F, -14.8F, -3.4F, 3.6F, 1.6F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.3F, 6.1F, 0.0F, -0.2524F, 0.8449F, 2.4168F));
		PartDefinition Head_r6 = bone4.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(24, 6).addBox(-9.5F, -13.6F, -3.4F, 3.6F, 1.6F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.3F, 6.1F, 0.0F, 0.3441F, 0.8192F, -3.0783F));
		PartDefinition bone5 = Head.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-2.0F, -16.6F, -9.2F));
		PartDefinition Head_r7 = bone5.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(47, 48).addBox(-9.5F, -13.6F, -3.4F, 3.6F, 1.6F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.8816F, 0.6841F, -0.8348F));
		PartDefinition Head_r8 = bone5.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(48, 46).addBox(-2.1F, -14.8F, -3.4F, 3.6F, 1.6F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.9524F, 0.7035F, -0.1485F));
		PartDefinition Head_r9 = bone5.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(12, 34).addBox(-9.5F, -13.6F, -3.4F, 3.6F, 1.6F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.4F, 3.1F, 0.0F, 2.8816F, 0.6841F, -0.0494F));
		PartDefinition Head_r10 = bone5.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(48, 44).addBox(-2.1F, -14.8F, -3.4F, 3.6F, 1.6F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.4F, 3.1F, 0.0F, -2.9524F, 0.7035F, 0.6369F));
		PartDefinition bone3 = Head.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Head_r11 = bone3.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(58, 61).addBox(8.2F, -11.2F, -5.8F, 3.0F, 3.0F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0185F, -0.0185F, -0.7852F));
		PartDefinition Head_r12 = bone3.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(60, 62).addBox(-1.1F, -23.5F, -12.7F, 2.1F, 2.8F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3316F, 0.0F, 0.0F));
		PartDefinition Head_r13 = bone3.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(60, 56).addBox(-1.1F, -23.5F, -5.8F, 2.1F, 8.8F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0262F, 0.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(32, 0).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 2.0F, 0.0F));
		PartDefinition Head_r14 = LeftArm.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(32, 0).addBox(-8.9F, -24.9F, -1.0F, 1.7F, 3.8F, 1.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 26.6F, 0.0F, 0.0F, 0.0F, 0.6545F));
		PartDefinition Head_r15 = LeftArm.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(44, 0).addBox(-8.9F, -24.9F, -1.0F, 1.7F, 3.8F, 1.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 22.0F, 0.0F, 0.0F, 0.0F, 0.6545F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(16, 32).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 32).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition Head_r16 = RightLeg.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(0, 16).addBox(-3.75F, -12.5F, -1.0F, 1.7F, 3.8F, 1.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 16.6F, 0.0F, 0.0F, 0.0F, 0.6545F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(24, 16).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 2.0F, 0.0F));
		PartDefinition Head_r17 = RightArm.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(28, 32).addBox(6.9F, -25.4F, -1.0F, 1.7F, 3.8F, 1.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 26.6F, 0.0F, 0.0F, 0.0F, -0.6545F));
		PartDefinition Head_r18 = RightArm.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(36, 16).addBox(6.9F, -25.4F, -1.0F, 1.7F, 3.8F, 1.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 22.0F, 0.0F, 0.0F, 0.0F, -0.6545F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -3.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 40).addBox(-4.0F, -3.0F, -2.5F, 1.6F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 16)
						.addBox(-3.1F, -2.5F, 2.0F, 5.9F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 38).addBox(0.9F, -2.5F, 3.0F, 1.4F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 48)
						.addBox(-2.4F, -2.5F, 3.0F, 1.4F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 40).addBox(2.4F, -3.0F, -2.5F, 1.6F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 40)
						.addBox(-4.0F, -3.0F, 1.8F, 1.6F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 40).addBox(2.4F, -3.0F, 1.8F, 1.6F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 3.0F, 0.0F));
		PartDefinition Head_r19 = Body.addOrReplaceChild("Head_r19",
				CubeListBuilder.create().texOffs(52, 39).addBox(3.9F, -14.3F, -3.4F, 1.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 39).addBox(3.9F, -14.3F, -7.7F, 1.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8F, -6.1F, 5.2F, 0.0F, 0.0F, 2.3998F));
		PartDefinition Head_r20 = Body.addOrReplaceChild("Head_r20",
				CubeListBuilder.create().texOffs(52, 19).addBox(-9.5F, -13.0F, -3.4F, 1.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 19).addBox(-9.5F, -13.0F, -7.7F, 1.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8F, -6.1F, 5.2F, 0.0F, 0.0F, -2.9234F));
		PartDefinition Head_r21 = Body.addOrReplaceChild("Head_r21",
				CubeListBuilder.create().texOffs(52, 41).addBox(3.9F, -14.3F, -3.4F, 1.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 41).addBox(3.9F, -14.3F, -7.7F, 1.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8F, -9.5F, 5.2F, 0.0F, 0.0F, 2.3998F));
		PartDefinition Head_r22 = Body.addOrReplaceChild("Head_r22",
				CubeListBuilder.create().texOffs(52, 17).addBox(-9.5F, -13.0F, -3.4F, 1.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 17).addBox(-9.5F, -13.0F, -7.7F, 1.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8F, -9.5F, 5.2F, 0.0F, 0.0F, -2.9234F));
		PartDefinition Head_r23 = Body.addOrReplaceChild("Head_r23",
				CubeListBuilder.create().texOffs(44, 52).addBox(3.9F, -14.3F, -3.4F, 1.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 52).addBox(3.9F, -14.3F, -7.7F, 1.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8F, -11.6F, 5.2F, 0.0F, 0.0F, 2.3998F));
		PartDefinition Head_r24 = Body.addOrReplaceChild("Head_r24",
				CubeListBuilder.create().texOffs(52, 12).addBox(-9.5F, -13.0F, -3.4F, 1.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 12).addBox(-9.5F, -13.0F, -7.7F, 1.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8F, -11.6F, 5.2F, 0.0F, 0.0F, -2.9234F));
		PartDefinition Head_r25 = Body.addOrReplaceChild("Head_r25",
				CubeListBuilder.create().texOffs(31, 53).addBox(3.9F, -14.3F, -3.4F, 1.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 53).addBox(3.9F, -14.3F, -7.7F, 1.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8F, -15.0F, 5.2F, 0.0F, 0.0F, 2.3998F));
		PartDefinition Head_r26 = Body.addOrReplaceChild("Head_r26",
				CubeListBuilder.create().texOffs(52, 10).addBox(-9.5F, -13.0F, -3.4F, 1.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 10).addBox(-9.5F, -13.0F, -7.7F, 1.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8F, -15.0F, 5.2F, 0.0F, 0.0F, -2.9234F));
		PartDefinition Head_r27 = Body.addOrReplaceChild("Head_r27",
				CubeListBuilder.create().texOffs(53, 32).addBox(3.9F, -14.3F, -3.4F, 1.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(53, 32).addBox(3.9F, -14.3F, -7.7F, 1.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.0F, 5.2F, 0.0F, 0.0F, -0.48F));
		PartDefinition Head_r28 = Body.addOrReplaceChild("Head_r28",
				CubeListBuilder.create().texOffs(35, 53).addBox(-9.5F, -13.0F, -3.4F, 1.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 53).addBox(-9.5F, -13.0F, -7.7F, 1.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.0F, 5.2F, 0.0F, 0.0F, 0.48F));
		PartDefinition Head_r29 = Body.addOrReplaceChild("Head_r29",
				CubeListBuilder.create().texOffs(47, 53).addBox(3.9F, -14.3F, -3.4F, 1.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 53).addBox(3.9F, -14.3F, -7.7F, 1.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.4F, 5.2F, 0.0F, 0.0F, -0.48F));
		PartDefinition Head_r30 = Body.addOrReplaceChild("Head_r30",
				CubeListBuilder.create().texOffs(51, 53).addBox(-9.5F, -13.0F, -3.4F, 1.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 53).addBox(-9.5F, -13.0F, -7.7F, 1.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.4F, 5.2F, 0.0F, 0.0F, 0.48F));
		PartDefinition Head_r31 = Body.addOrReplaceChild("Head_r31",
				CubeListBuilder.create().texOffs(8, 54).addBox(3.9F, -14.3F, -3.4F, 1.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 54).addBox(3.9F, -14.3F, -7.7F, 1.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 18.5F, 5.2F, 0.0F, 0.0F, -0.48F));
		PartDefinition Head_r32 = Body.addOrReplaceChild("Head_r32",
				CubeListBuilder.create().texOffs(12, 54).addBox(-9.5F, -13.0F, -3.4F, 1.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 54).addBox(-9.5F, -13.0F, -7.7F, 1.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 18.5F, 5.2F, 0.0F, 0.0F, 0.48F));
		PartDefinition Head_r33 = Body.addOrReplaceChild("Head_r33",
				CubeListBuilder.create().texOffs(16, 54).addBox(-9.5F, -13.0F, -3.4F, 1.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 54).addBox(-9.5F, -13.0F, -7.7F, 1.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 21.9F, 5.2F, 0.0F, 0.0F, 0.48F));
		PartDefinition Head_r34 = Body.addOrReplaceChild("Head_r34",
				CubeListBuilder.create().texOffs(20, 54).addBox(3.9F, -14.3F, -3.4F, 1.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 54).addBox(3.9F, -14.3F, -7.7F, 1.6F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 21.9F, 5.2F, 0.0F, 0.0F, -0.48F));
		PartDefinition Head_r35 = Body.addOrReplaceChild("Head_r35", CubeListBuilder.create().texOffs(48, 9).addBox(5.1F, -21.0F, -11.6F, 1.9F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 21.0F, 1.0F, -0.6981F, 0.0F, -0.4363F));
		PartDefinition Head_r36 = Body.addOrReplaceChild("Head_r36",
				CubeListBuilder.create().texOffs(16, 48).addBox(5.1F, -25.5F, 3.0F, 1.9F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 0).addBox(4.9F, -25.5F, 1.5F, 3.2F, 5.0F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 21.0F, 1.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition Head_r37 = Body.addOrReplaceChild("Head_r37", CubeListBuilder.create().texOffs(8, 48).addBox(-7.3F, -21.1F, -10.9F, 1.9F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 21.0F, 1.0F, -0.6545F, 0.0F, 0.4363F));
		PartDefinition Head_r38 = Body.addOrReplaceChild("Head_r38",
				CubeListBuilder.create().texOffs(12, 48).addBox(-7.1F, -25.5F, 3.0F, 1.9F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-8.1F, -25.5F, 1.5F, 3.2F, 5.0F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 21.0F, 1.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition bone2 = Body.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 21.0F, 0.0F));
		PartDefinition Head_r39 = bone2.addOrReplaceChild("Head_r39", CubeListBuilder.create().texOffs(40, 40).addBox(-16.5F, 14.8F, 1.2F, 1.4F, 9.3F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0524F, 0.4363F, -3.1416F));
		PartDefinition Head_r40 = bone2.addOrReplaceChild("Head_r40", CubeListBuilder.create().texOffs(42, 29).addBox(-25.8F, 13.8F, 1.2F, 1.4F, 9.3F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.4189F, 2.618F));
		PartDefinition Head_r41 = bone2.addOrReplaceChild("Head_r41",
				CubeListBuilder.create().texOffs(44, 39).addBox(-18.9F, -29.0F, 1.4F, 1.4F, 9.3F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 32).addBox(-17.5F, -27.8F, 1.7F, 5.1F, 8.1F, 0.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4051F, -0.2415F, 0.9748F));
		PartDefinition Head_r42 = bone2.addOrReplaceChild("Head_r42",
				CubeListBuilder.create().texOffs(24, 48).addBox(-8.4F, -26.4F, 1.4F, 1.4F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 16).addBox(-7.0F, -26.4F, 1.7F, 4.5F, 3.2F, 0.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, -0.3927F, 0.5236F));
		PartDefinition bone = Body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 21.0F, 0.0F));
		PartDefinition Head_r43 = bone.addOrReplaceChild("Head_r43", CubeListBuilder.create().texOffs(46, 29).addBox(14.8F, 15.9F, 0.9F, 1.4F, 8.9F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0524F, -0.4363F, -3.1416F));
		PartDefinition Head_r44 = bone.addOrReplaceChild("Head_r44", CubeListBuilder.create().texOffs(0, 48).addBox(24.3F, 14.4F, 0.9F, 1.4F, 8.9F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, -0.4189F, -2.618F));
		PartDefinition Head_r45 = bone.addOrReplaceChild("Head_r45",
				CubeListBuilder.create().texOffs(40, 22).addBox(12.1F, -28.3F, 1.4F, 5.0F, 7.7F, 0.4F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(17.1F, -29.5F, 1.1F, 1.4F, 8.9F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4011F, 0.2483F, -0.9583F));
		PartDefinition Head_r46 = bone.addOrReplaceChild("Head_r46",
				CubeListBuilder.create().texOffs(20, 48).addBox(6.8F, -26.3F, 1.1F, 1.4F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 6).addBox(2.3F, -26.3F, 1.4F, 4.5F, 2.5F, 0.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.3927F, -0.5236F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Head_r47 = bb_main.addOrReplaceChild("Head_r47", CubeListBuilder.create().texOffs(0, 32).addBox(2.5F, -12.5F, -1.0F, 1.7F, 3.8F, 1.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.6F, 0.0F, 0.0F, 0.0F, -0.6545F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
