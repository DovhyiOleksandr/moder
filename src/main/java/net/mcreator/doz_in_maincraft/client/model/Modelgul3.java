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
public class Modelgul3<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("doz_in_maincraft", "modelgul_3"), "main");
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart body;
	public final ModelPart head;

	public Modelgul3(ModelPart root) {
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.body = root.getChild("body");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(32, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 32)
				.addBox(-1.625F, 5.0F, -2.25F, 3.375F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 36).addBox(-0.95F, 4.425F, -2.25F, 1.975F, 3.2F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(24, 0).addBox(-1.7F, 5.0F, -2.25F, 3.375F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-1.025F, 4.425F, -2.25F, 1.975F, 3.2F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(24, 16).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 2.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(4.0F, 2.0F, 0.0F));
		PartDefinition cube_r1 = RightArm.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 32).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.9599F, 0.0F));
		PartDefinition bone = RightArm.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(2, 57).addBox(-8.9F, -17.2F, -10.6F, 1.7F, 1.2F, 4.4F, new CubeDeformation(0.0F)).texOffs(32, 56).addBox(-8.8F, -16.0F, -8.3F, 1.5F, 0.6F, 1.5F, new CubeDeformation(0.0F)).texOffs(35, 62)
						.addBox(-8.8F, -17.1F, -6.2F, 1.5F, 1.0F, 0.4F, new CubeDeformation(0.0F)).texOffs(19, 57).addBox(-8.25F, -17.3F, -18.0F, 0.4F, 0.4F, 1.6F, new CubeDeformation(0.0F)).texOffs(17, 57)
						.addBox(-8.35F, -17.4F, -18.5F, 0.6F, 0.6F, 0.7F, new CubeDeformation(0.0F)).texOffs(6, 61).addBox(-8.9F, -16.0F, -10.15F, 1.7F, 0.6F, 0.5F, new CubeDeformation(0.0F)).texOffs(11, 51)
						.addBox(-8.75F, -16.4F, -17.75F, 1.4F, 1.4F, 7.125F, new CubeDeformation(0.0F)).texOffs(17, 57).addBox(-8.95F, -16.6F, -17.75F, 1.8F, 1.8F, 0.925F, new CubeDeformation(0.0F)).texOffs(17, 57)
						.addBox(-8.85F, -16.5F, -16.85F, 1.6F, 1.6F, 0.425F, new CubeDeformation(0.0F)).texOffs(5, 60).addBox(-8.9F, -17.2F, -12.7F, 1.7F, 0.8F, 2.1F, new CubeDeformation(0.0F)).texOffs(2, 57)
						.addBox(-8.7F, -17.9F, -17.4F, 1.2F, 0.9F, 4.7F, new CubeDeformation(0.0F)).texOffs(3, 58).addBox(-8.9F, -17.0F, -16.4F, 1.7F, 0.4F, 3.7F, new CubeDeformation(0.0F)).texOffs(2, 57)
						.addBox(-8.5F, -18.1F, -17.4F, 0.8F, 0.2F, 4.7F, new CubeDeformation(0.0F)).texOffs(0, 55).addBox(-8.7F, -17.4F, -12.7F, 1.3F, 0.2F, 6.4F, new CubeDeformation(0.0F)).texOffs(1, 56)
						.addBox(-8.6F, -17.6F, -12.3F, 1.1F, 0.2F, 5.9F, new CubeDeformation(0.0F)).texOffs(1, 56).addBox(-8.5F, -17.8F, -12.3F, 0.9F, 0.2F, 5.8F, new CubeDeformation(0.0F)).texOffs(1, 56)
						.addBox(-8.4F, -18.0F, -12.3F, 0.7F, 0.2F, 5.7F, new CubeDeformation(0.0F)).texOffs(1, 56).addBox(-8.3F, -18.05F, -12.3F, 0.5F, 0.05F, 5.55F, new CubeDeformation(0.0F)).texOffs(6, 61)
						.addBox(-8.7F, -18.1F, -12.7F, 1.3F, 0.7F, 0.4F, new CubeDeformation(0.0F)).texOffs(6, 61).addBox(-8.3F, -18.3F, -13.3F, 0.5F, 0.2F, 1.1F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.3F, 13.9F, 1.0F));
		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(34, 58).addBox(-0.8F, 7.025F, -17.625F, 1.5F, 0.825F, 0.1F, new CubeDeformation(0.0F)).texOffs(33, 57)
				.addBox(-0.8F, 8.025F, -17.925F, 1.5F, 0.125F, 0.3F, new CubeDeformation(0.0F)).texOffs(24, 51).addBox(-0.7F, 6.925F, -20.625F, 1.3F, 1.1F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, 0.0F, 7.0F, -1.1781F, 0.0F, 0.0F));
		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(6, 61).addBox(-0.4F, -5.7F, -28.55F, 0.7F, 1.2F, 0.5F, new CubeDeformation(0.0F)).texOffs(6, 61).addBox(-0.6F, -7.3F, -22.75F, 1.0F, 1.2F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, 0.0F, 7.0F, -0.4363F, 0.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -4.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(55, 59)
				.addBox(-8.0F, -5.05F, -1.5F, 4.0F, 0.8F, 2.9F, new CubeDeformation(0.0F)).texOffs(55, 59).addBox(4.0F, -5.05F, -1.5F, 4.0F, 0.8F, 2.9F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0F, 0.0F));
		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(32, 5).addBox(-4.85F, -23.4F, -8.0F, 1.525F, 3.5F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 20.475F, 9.725F, 0.0F, 0.0F, 0.3491F));
		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(49, 61).addBox(-4.0F, -1.75F, -4.225F, 7.775F, 8.1F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.075F, 5.9F, -0.0218F, 0.0F, 0.0F));
		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(32, 5).addBox(3.275F, -23.4F, -8.0F, 1.525F, 3.5F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 20.475F, 9.725F, 0.0F, 0.0F, -0.3491F));
		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(49, 61).addBox(-3.625F, -0.05F, -2.675F, 7.2F, 6.4F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.075F, -0.1F, 0.0611F, 0.0F, 0.0F));
		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(49, 61).addBox(-0.2F, 0.275F, -2.675F, 4.175F, 1.45F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.075F, -0.1F, 0.0529F, 0.0305F, -0.5228F));
		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(49, 61).addBox(-5.975F, 2.775F, -2.675F, 6.95F, 1.45F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.075F, -0.1F, 0.0169F, 0.0587F, -1.4834F));
		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(49, 61).addBox(-1.0F, 2.825F, -2.675F, 6.95F, 1.45F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.075F, -0.1F, 0.0059F, -0.0608F, 1.4746F));
		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(49, 61).addBox(-3.925F, 0.275F, -2.675F, 4.15F, 1.45F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.075F, -0.1F, 0.0529F, -0.0305F, 0.5228F));
		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(49, 61).addBox(-0.2F, 0.275F, -2.675F, 3.5F, 1.45F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1173F, -0.0675F, -0.5196F));
		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(49, 61).addBox(-3.275F, 0.275F, -2.675F, 3.5F, 1.45F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1173F, 0.0675F, 0.5196F));
		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(49, 61).addBox(-0.9F, -0.05F, -2.675F, 1.85F, 1.45F, 1.0F, new CubeDeformation(0.0F)).texOffs(49, 61).addBox(-3.1F, -1.45F, -2.675F, 6.3F, 1.45F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1353F, 0.0F, 0.0F));
		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(55, 59).addBox(4.0F, -3.25F, -4.25F, 4.075F, 0.8F, 2.9F, new CubeDeformation(0.0F)).texOffs(55, 59).addBox(-8.1F, -3.25F, -4.25F, 4.075F, 0.8F, 2.9F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.2217F, 0.0F, 0.0F));
		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(55, 59).addBox(-8.1F, -3.275F, 1.325F, 4.075F, 0.8F, 2.9F, new CubeDeformation(0.0F)).texOffs(55, 59).addBox(4.0F, -3.275F, 1.325F, 4.075F, 0.8F, 2.9F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.2217F, 0.0F, 0.0F));
		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(32, 5).addBox(-4.85F, -23.4F, -8.0F, 1.525F, 3.5F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 20.0F, 5.4F, 0.0F, 0.0F, 0.3491F));
		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(32, 5).addBox(3.275F, -23.4F, -8.0F, 1.525F, 3.5F, 0.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 20.0F, 5.4F, 0.0F, 0.0F, -0.3491F));
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(49, 53).addBox(-4.075F, -8.525F, -4.325F, 8.175F, 2.0F, 8.6F, new CubeDeformation(0.0F)).texOffs(48, 52)
				.addBox(-4.35F, -6.9F, -4.675F, 8.775F, 0.575F, 9.35F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
