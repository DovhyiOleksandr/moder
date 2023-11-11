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
public class Modelnachalka_1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("doz_in_maincraft", "modelnachalka_1"), "main");
	public final ModelPart Head;

	public Modelnachalka_1(ModelPart root) {
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 239).addBox(-4.4F, -8.2F, -4.2F, 0.2F, 8.2F, 8.4F, new CubeDeformation(0.0F)).texOffs(0, 183).addBox(-4.4F, -8.4F, -4.4F, 0.2F, 4.4F, 0.2F, new CubeDeformation(0.0F)).texOffs(9, 172)
						.addBox(-4.2F, -8.4F, -4.375F, 0.25F, 1.45F, 0.2F, new CubeDeformation(0.0F)).texOffs(5, 185).addBox(-4.2F, -8.0F, -4.375F, 0.35F, 4.05F, 0.2F, new CubeDeformation(0.0F)).texOffs(3, 185)
						.addBox(3.9F, -8.0F, -4.375F, 0.35F, 4.05F, 0.2F, new CubeDeformation(0.0F)).texOffs(11, 181).addBox(-4.2F, -8.4F, -4.375F, 1.25F, 0.45F, 0.2F, new CubeDeformation(0.0F)).texOffs(6, 175)
						.addBox(-4.2F, -8.4F, -4.375F, 0.45F, 1.25F, 0.2F, new CubeDeformation(0.0F)).texOffs(63, 210).addBox(-4.2F, -8.4F, -4.375F, 8.45F, 0.65F, 0.2F, new CubeDeformation(0.0F)).texOffs(2, 183)
						.addBox(3.975F, -8.4F, -4.375F, 0.275F, 1.475F, 0.2F, new CubeDeformation(0.0F)).texOffs(43, 207).addBox(3.7F, -7.75F, -4.375F, 0.55F, 0.575F, 0.2F, new CubeDeformation(0.0F)).texOffs(8, 178)
						.addBox(3.9F, -7.75F, -4.375F, 0.35F, 0.675F, 0.2F, new CubeDeformation(0.0F)).texOffs(0, 166).addBox(3.625F, -7.75F, -4.375F, 0.1F, 0.35F, 0.2F, new CubeDeformation(0.0F)).texOffs(6, 177)
						.addBox(3.375F, -7.75F, -4.375F, 0.875F, 0.25F, 0.2F, new CubeDeformation(0.0F)).texOffs(3, 171).addBox(-3.75F, -8.4F, -4.375F, 0.325F, 0.925F, 0.2F, new CubeDeformation(0.0F)).texOffs(13, 175)
						.addBox(-3.95F, -8.4F, -4.375F, 0.325F, 1.025F, 0.2F, new CubeDeformation(0.0F)).texOffs(2, 185).addBox(4.2F, -8.4F, -4.4F, 0.2F, 4.4F, 0.2F, new CubeDeformation(0.0F)).texOffs(28, 212)
						.addBox(4.2F, -8.2F, -4.2F, 0.2F, 8.2F, 8.4F, new CubeDeformation(0.0F)).texOffs(70, 247).addBox(-4.4F, -8.4F, -4.2F, 8.8F, 0.2F, 8.4F, new CubeDeformation(0.0F)).texOffs(45, 237)
						.addBox(-4.4F, -8.4F, 4.2F, 8.8F, 8.4F, 0.2F, new CubeDeformation(0.0F)).texOffs(0, 203).addBox(-4.4F, 0.0F, -4.2F, 8.8F, 0.2F, 8.6F, new CubeDeformation(0.0F)).texOffs(52, 192)
						.addBox(-4.4F, 0.0F, -4.4F, 8.8F, 0.35F, 6.5F, new CubeDeformation(0.0F)).texOffs(62, 186).addBox(-4.4F, -4.0F, -4.4F, 8.8F, 4.2F, 0.2F, new CubeDeformation(0.0F)).texOffs(29, 253)
						.addBox(-2.4F, -3.5F, -4.875F, 4.8F, 2.425F, 0.475F, new CubeDeformation(0.0F)).texOffs(50, 255).addBox(-2.6F, -2.5F, -4.5F, 5.2F, 0.5F, 0.1F, new CubeDeformation(0.0F)).texOffs(12, 171)
						.addBox(-3.0F, -2.6F, -4.5F, 0.1F, 0.7F, 0.1F, new CubeDeformation(0.0F)).texOffs(12, 171).addBox(2.9F, -2.6F, -4.5F, 0.1F, 0.7F, 0.1F, new CubeDeformation(0.0F)).texOffs(19, 200)
						.addBox(-4.4F, -2.65F, -4.5F, 1.4F, 0.8F, 0.1F, new CubeDeformation(0.0F)).texOffs(68, 227).addBox(-4.5F, -2.65F, -4.5F, 0.1F, 0.8F, 8.9F, new CubeDeformation(0.0F)).texOffs(62, 218)
						.addBox(-4.5F, -2.65F, 4.4F, 8.9F, 0.8F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 194).addBox(4.4F, -2.65F, -4.4F, 0.1F, 0.8F, 8.9F, new CubeDeformation(0.0F)).texOffs(27, 200)
						.addBox(3.0F, -2.65F, -4.5F, 1.5F, 0.8F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 172).addBox(4.4F, -2.65F, -4.4F, 0.1F, 0.8F, 0.0F, new CubeDeformation(0.0F)).texOffs(5, 169)
						.addBox(-2.9F, -2.0F, -4.5F, 0.5F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(6, 172).addBox(2.4F, -2.6F, -4.5F, 0.5F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(13, 173)
						.addBox(2.4F, -2.0F, -4.5F, 0.5F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(7, 170).addBox(-2.9F, -2.6F, -4.5F, 0.5F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 179)
						.addBox(-2.3F, -3.5F, -4.975F, 4.6F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 188).addBox(-2.4F, -3.5F, -4.975F, 0.1F, 2.425F, 0.1F, new CubeDeformation(0.0F)).texOffs(7, 185)
						.addBox(1.3F, -3.5F, -4.95F, 0.1F, 2.425F, 0.075F, new CubeDeformation(0.0F)).texOffs(7, 188).addBox(2.3F, -3.5F, -4.975F, 0.1F, 2.425F, 0.1F, new CubeDeformation(0.0F)).texOffs(30, 244)
						.addBox(-2.4F, -1.3F, -4.7F, 4.8F, 0.8F, 0.3F, new CubeDeformation(0.0F)).texOffs(0, 182).addBox(-2.4F, -0.5F, -4.8F, 4.8F, 0.1F, 0.4F, new CubeDeformation(0.0F)).texOffs(6, 181)
						.addBox(-1.4F, -3.5F, -4.95F, 0.1F, 2.425F, 0.075F, new CubeDeformation(0.0F)).texOffs(0, 181).addBox(-2.3F, -1.175F, -4.975F, 4.6F, 0.1F, 0.1F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(10, 170).addBox(-2.4F, -0.375F, -0.125F, 0.1F, 0.65F, 0.075F, new CubeDeformation(0.0F)).texOffs(0, 168).addBox(-3.4F, -0.375F, -0.125F, 0.1F, 0.65F, 0.075F, new CubeDeformation(0.0F)).texOffs(47, 202)
						.addBox(-2.3F, -0.35F, -0.125F, 2.6F, 0.625F, 0.275F, new CubeDeformation(0.0F)).texOffs(49, 251).addBox(-3.4F, -0.325F, -0.05F, 4.8F, 0.6F, 0.2F, new CubeDeformation(0.0F)).texOffs(11, 173)
						.addBox(0.3F, -0.375F, -0.125F, 0.1F, 0.65F, 0.075F, new CubeDeformation(0.0F)).texOffs(9, 169).addBox(1.3F, -0.375F, -0.125F, 0.1F, 0.65F, 0.075F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -0.7787F, -4.7307F, 0.2967F, 0.0F, 0.0F));
		PartDefinition Head_r2 = Head
				.addOrReplaceChild(
						"Head_r2", CubeListBuilder.create().texOffs(0, 175).addBox(-1.0F, 0.0875F, -0.2375F, 2.1F, 0.125F, 0.275F, new CubeDeformation(0.0F)).texOffs(0, 177)
								.addBox(-1.1F, -0.2125F, -0.2375F, 2.1F, 0.125F, 0.275F, new CubeDeformation(0.0F)).texOffs(0, 178).addBox(-1.0F, -0.2125F, -0.2375F, 2.0F, 0.425F, 0.275F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -2.2875F, -4.9375F, 0.0F, 0.0F, 3.0107F));
		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(10, 177).addBox(-1.0F, -0.2125F, -0.2375F, 2.0F, 0.425F, 0.275F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.2875F, -4.9375F, 0.0F, 0.0F, 2.6005F));
		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(11, 179).addBox(-1.0F, -0.2125F, -0.2375F, 2.0F, 0.425F, 0.275F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.2875F, -4.9375F, 0.0F, 0.0F, 2.1817F));
		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(11, 179).addBox(-1.0F, -0.2125F, -0.2375F, 2.0F, 0.425F, 0.275F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.2875F, -4.9375F, 0.0F, 0.0F, 1.7628F));
		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(11, 179).addBox(-1.0F, -0.2125F, -0.2375F, 2.0F, 0.425F, 0.275F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.2875F, -4.9375F, 0.0F, 0.0F, 1.3439F));
		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(11, 179).addBox(-1.0F, -0.2125F, -0.2375F, 2.0F, 0.425F, 0.275F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.2875F, -4.9375F, 0.0F, 0.0F, 0.925F));
		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(11, 179).addBox(-1.0F, -0.2125F, -0.2375F, 2.0F, 0.425F, 0.275F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.2875F, -4.9375F, 0.0F, 0.0F, 0.5061F));
		PartDefinition Head_r9 = Head
				.addOrReplaceChild(
						"Head_r9", CubeListBuilder.create().texOffs(0, 175).addBox(-1.1F, 0.0875F, -0.2375F, 2.1F, 0.125F, 0.275F, new CubeDeformation(0.0F)).texOffs(0, 180)
								.addBox(-1.0F, -0.2125F, -0.2375F, 2.1F, 0.125F, 0.275F, new CubeDeformation(0.0F)).texOffs(11, 179).addBox(-1.0F, -0.2125F, -0.2375F, 2.0F, 0.425F, 0.275F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -2.2875F, -4.9375F, 0.0F, 0.0F, 0.0873F));
		PartDefinition Head_r10 = Head
				.addOrReplaceChild(
						"Head_r10", CubeListBuilder.create().texOffs(37, 177).addBox(-4.4F, -0.55F, -1.625F, 8.8F, 2.325F, 0.35F, new CubeDeformation(0.0F)).texOffs(11, 240)
								.addBox(-4.4F, -0.375F, -1.625F, 8.8F, 2.15F, 0.85F, new CubeDeformation(0.0F)).texOffs(59, 178).addBox(-4.4F, -0.175F, -1.625F, 8.8F, 2.275F, 1.425F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 1.8067F, 3.7123F, -1.5708F, 0.0F, 0.0F));
		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(63, 206).addBox(-4.4F, -0.65F, -0.325F, 8.8F, 1.5F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.85F, 4.3F, -0.3491F, 0.0F, 0.0F));
		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(1, 171).addBox(-0.525F, -1.8F, -0.075F, 0.2F, 2.2F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.3F, -7.3F, -4.3F, 0.0F, 0.0F, -0.7854F));
		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(16, 175).addBox(0.3F, -1.825F, -0.075F, 0.2F, 2.2F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3F, -7.3F, -4.3F, 0.0F, 0.0F, 0.7854F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
	}
}
