package net.mcreator.doz_in_maincraft.client.model;

import net.minecraft.world.entity.Entity;
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
public class Modeldron<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("doz_in_maincraft", "modeldron"), "main");
	public final ModelPart bone;

	public Modeldron(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -0.25F, -1.5F, 3.0F, 1.3F, 4.5F, new CubeDeformation(0.0F)).texOffs(57, 60).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.3F, 2.5F, new CubeDeformation(0.0F)).texOffs(57, 62)
						.addBox(-1.5F, -0.25F, -2.5F, 3.0F, 1.3F, 0.5F, new CubeDeformation(0.0F)).texOffs(53, 61).addBox(-1.5F, 0.5F, -5.0F, 3.0F, 0.55F, 2.5F, new CubeDeformation(0.0F)).texOffs(0, 62)
						.addBox(-1.1F, -0.05F, -2.5F, 0.25F, 0.225F, 1.5F, new CubeDeformation(0.0F)).texOffs(0, 62).addBox(0.9F, -0.05F, -2.5F, 0.25F, 0.225F, 1.5F, new CubeDeformation(0.0F)).texOffs(0, 62)
						.addBox(0.9F, 0.45F, -2.5F, 0.25F, 0.225F, 1.5F, new CubeDeformation(0.0F)).texOffs(0, 62).addBox(-1.1F, 0.45F, -2.5F, 0.25F, 0.225F, 1.5F, new CubeDeformation(0.0F)).texOffs(52, 60)
						.addBox(-1.25F, 0.0F, 3.0F, 2.5F, 0.75F, 3.75F, new CubeDeformation(0.0F)).texOffs(55, 60).addBox(-1.25F, -0.25F, 3.0F, 0.75F, 0.25F, 3.75F, new CubeDeformation(0.0F)).texOffs(55, 60)
						.addBox(0.5F, -0.25F, 3.0F, 0.75F, 0.25F, 3.75F, new CubeDeformation(0.0F)).texOffs(54, 62).addBox(-1.75F, 0.5F, -0.75F, 3.5F, 0.25F, 1.5F, new CubeDeformation(0.0F)).texOffs(0, 55)
						.addBox(-0.5F, -0.15F, 3.0F, 1.0F, 0.15F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 19.0F, 0.0F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(54, 62).addBox(-1.75F, -5.5F, -2.25F, 3.5F, 0.5F, 1.525F, new CubeDeformation(0.0F)).texOffs(52, 61).addBox(-1.5F, -5.75F, -3.5F, 3.0F, 0.5F, 2.775F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, 0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 63).addBox(8.75F, -2.0F, -0.5F, 0.95F, 0.2F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 63).addBox(-9.25F, -2.0F, -0.5F, 0.95F, 0.2F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
						.addBox(-6.25F, -2.0F, -0.5F, 13.45F, 0.2F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 63).addBox(-1.65F, -2.5F, 7.4F, 3.55F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
						.addBox(-1.55F, -2.5F, -8.2F, 3.15F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 39).addBox(-9.25F, -2.5F, -0.5F, 18.95F, 0.5F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, 0.0F, -0.7898F, 0.0F));
		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 63).addBox(-9.45F, -2.0F, -0.5F, 0.95F, 0.2F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 63).addBox(8.55F, -2.0F, -0.5F, 0.95F, 0.2F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
						.addBox(-6.45F, -2.0F, -0.5F, 13.45F, 0.2F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 63).addBox(-1.7F, -2.5F, -8.25F, 3.2F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
						.addBox(-1.7F, -2.5F, 7.5F, 3.2F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 39).addBox(-9.45F, -2.5F, -0.5F, 18.95F, 0.5F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, 0.0F, 0.7898F, 0.0F));
		PartDefinition bone2 = bone.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(61, 62).addBox(0.0F, -6.375F, -1.0F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)).texOffs(61, 62).addBox(-0.025F, -6.375F, -4.25F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.875F, 5.0F, -3.075F));
		PartDefinition cube_r4 = bone2.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(61, 62).addBox(0.925F, -1.375F, -3.775F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)).texOffs(61, 62).addBox(1.125F, -1.375F, -0.475F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.48F, 0.0F));
		PartDefinition cube_r5 = bone2.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(61, 62).addBox(-2.925F, -1.375F, -2.3F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)).texOffs(61, 62).addBox(-2.875F, -1.375F, 0.85F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r6 = bone2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(61, 62).addBox(1.6F, -1.375F, 0.925F, 1.05F, 1.375F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 1.1912F, 0.0F));
		PartDefinition cube_r7 = bone2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(61, 62).addBox(1.95F, -1.375F, -2.525F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 1.0996F, 0.0F));
		PartDefinition cube_r8 = bone2.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(61, 62).addBox(-2.525F, -1.375F, -3.4F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)).texOffs(61, 62).addBox(-2.275F, -1.375F, -0.175F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, -1.0908F, 0.0F));
		PartDefinition cube_r9 = bone2.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(61, 62).addBox(-1.125F, -1.375F, -4.225F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)).texOffs(61, 62).addBox(-1.225F, -1.375F, -0.95F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, -0.48F, 0.0F));
		PartDefinition bone3 = bone.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(61, 62).addBox(0.0F, -6.375F, -1.0F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)).texOffs(61, 62).addBox(-0.025F, -6.375F, -4.25F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.0F, 5.0F, 8.0F));
		PartDefinition cube_r10 = bone3.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(61, 62).addBox(0.925F, -1.375F, -3.775F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)).texOffs(61, 62).addBox(1.125F, -1.375F, -0.475F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.48F, 0.0F));
		PartDefinition cube_r11 = bone3.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(61, 62).addBox(-2.925F, -1.375F, -2.3F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)).texOffs(61, 62).addBox(-2.875F, -1.375F, 0.85F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r12 = bone3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(61, 62).addBox(1.6F, -1.375F, 0.925F, 1.05F, 1.375F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 1.1912F, 0.0F));
		PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(61, 62).addBox(1.95F, -1.375F, -2.525F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 1.0996F, 0.0F));
		PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(61, 62).addBox(-2.525F, -1.375F, -3.4F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)).texOffs(61, 62).addBox(-2.275F, -1.375F, -0.175F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, -1.0908F, 0.0F));
		PartDefinition cube_r15 = bone3.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(61, 62).addBox(-1.125F, -1.375F, -4.225F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)).texOffs(61, 62).addBox(-1.225F, -1.375F, -0.95F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, -0.48F, 0.0F));
		PartDefinition bone4 = bone.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(61, 62).addBox(0.0F, -6.375F, -1.0F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)).texOffs(61, 62).addBox(-0.025F, -6.375F, -4.25F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offset(5.175F, 5.0F, 8.15F));
		PartDefinition cube_r16 = bone4.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(61, 62).addBox(0.925F, -1.375F, -3.775F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)).texOffs(61, 62).addBox(1.125F, -1.375F, -0.475F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.48F, 0.0F));
		PartDefinition cube_r17 = bone4.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(61, 62).addBox(-2.925F, -1.375F, -2.3F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)).texOffs(61, 62).addBox(-2.875F, -1.375F, 0.85F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r18 = bone4.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(61, 62).addBox(1.6F, -1.375F, 0.925F, 1.05F, 1.375F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 1.1912F, 0.0F));
		PartDefinition cube_r19 = bone4.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(61, 62).addBox(1.95F, -1.375F, -2.525F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 1.0996F, 0.0F));
		PartDefinition cube_r20 = bone4.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(61, 62).addBox(-2.525F, -1.375F, -3.4F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)).texOffs(61, 62).addBox(-2.275F, -1.375F, -0.175F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, -1.0908F, 0.0F));
		PartDefinition cube_r21 = bone4.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(61, 62).addBox(-1.125F, -1.375F, -4.225F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)).texOffs(61, 62).addBox(-1.225F, -1.375F, -0.95F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, -0.48F, 0.0F));
		PartDefinition bone5 = bone.addOrReplaceChild("bone5",
				CubeListBuilder.create().texOffs(61, 62).addBox(0.0F, -6.375F, -1.0F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)).texOffs(61, 62).addBox(-0.025F, -6.375F, -4.25F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 5.0F, -3.0F));
		PartDefinition cube_r22 = bone5.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(61, 62).addBox(0.925F, -1.375F, -3.775F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)).texOffs(61, 62).addBox(1.125F, -1.375F, -0.475F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.48F, 0.0F));
		PartDefinition cube_r23 = bone5.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(61, 62).addBox(-2.925F, -1.375F, -2.3F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)).texOffs(61, 62).addBox(-2.875F, -1.375F, 0.85F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r24 = bone5.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(61, 62).addBox(1.6F, -1.375F, 0.925F, 1.05F, 1.375F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 1.1912F, 0.0F));
		PartDefinition cube_r25 = bone5.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(61, 62).addBox(1.95F, -1.375F, -2.525F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 1.0996F, 0.0F));
		PartDefinition cube_r26 = bone5.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(61, 62).addBox(-2.525F, -1.375F, -3.4F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)).texOffs(61, 62).addBox(-2.275F, -1.375F, -0.175F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, -1.0908F, 0.0F));
		PartDefinition cube_r27 = bone5.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(61, 62).addBox(-1.125F, -1.375F, -4.225F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)).texOffs(61, 62).addBox(-1.225F, -1.375F, -0.95F, 1.0F, 1.375F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, -0.48F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.bone.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.bone.xRot = headPitch / (180F / (float) Math.PI);
	}
}
