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
public class Modelprotgas<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("doz_in_maincraft", "modelprotgas"), "main");
	public final ModelPart head;

	public Modelprotgas(ModelPart root) {
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(23, 29).addBox(-1.65F, -2.35F, -6.0F, 3.25F, 1.25F, 1.25F, new CubeDeformation(0.0F)).texOffs(24, 28).addBox(-1.15F, -2.85F, -6.0F, 2.25F, 2.25F, 1.5F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(-1.05F, -2.75F, -6.1F, 2.05F, 2.05F, 0.1F, new CubeDeformation(0.0F)).texOffs(26, 22).addBox(-0.65F, -2.35F, -5.5F, 1.25F, 1.25F, 1.5F, new CubeDeformation(0.0F)).texOffs(29, 30)
						.addBox(-0.65F, -2.45F, -4.5F, 1.25F, 1.45F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 30).addBox(-0.75F, -2.35F, -4.5F, 1.45F, 1.25F, 0.1F, new CubeDeformation(0.0F)).texOffs(26, 28)
						.addBox(-0.9F, -3.1F, -6.0F, 1.75F, 2.75F, 1.25F, new CubeDeformation(0.0F)).texOffs(21, 27).addBox(-0.65F, -3.35F, -6.0F, 1.25F, 3.25F, 1.25F, new CubeDeformation(0.0F)).texOffs(24, 25)
						.addBox(-1.4F, -2.6F, -6.0F, 2.75F, 1.75F, 1.25F, new CubeDeformation(0.0F)).texOffs(28, 29).addBox(1.5F, -4.8F, -4.3F, 1.0F, 0.3F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 29)
						.addBox(2.2F, -4.7F, -4.4F, 0.1F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 29).addBox(1.7F, -4.7F, -4.4F, 0.1F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 29)
						.addBox(1.7F, -5.9F, -4.4F, 0.1F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 29).addBox(2.2F, -5.9F, -4.4F, 0.1F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 29)
						.addBox(2.6F, -5.5F, -4.4F, 0.1F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 29).addBox(2.6F, -5.1F, -4.4F, 0.1F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 29)
						.addBox(1.3F, -5.5F, -4.4F, 0.1F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 29).addBox(1.3F, -5.1F, -4.4F, 0.1F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 29)
						.addBox(2.5F, -4.8F, -4.3F, 0.1F, 0.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 29).addBox(2.6F, -4.8F, -4.3F, 0.1F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 29)
						.addBox(2.6F, -4.7F, -4.2F, 0.1F, 0.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 29).addBox(2.7F, -4.7F, -4.2F, 0.1F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 29)
						.addBox(2.6F, -6.0F, -4.2F, 0.1F, 0.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 29).addBox(2.7F, -5.9F, -4.2F, 0.1F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 29)
						.addBox(2.5F, -5.9F, -4.3F, 0.1F, 0.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 29).addBox(2.6F, -5.8F, -4.3F, 0.1F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 29)
						.addBox(1.2F, -5.9F, -4.2F, 0.1F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 29).addBox(1.3F, -4.7F, -4.2F, 0.1F, 0.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 29)
						.addBox(1.2F, -4.7F, -4.2F, 0.1F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 29).addBox(1.3F, -4.8F, -4.3F, 0.1F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 29)
						.addBox(1.4F, -4.8F, -4.3F, 0.1F, 0.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 29).addBox(1.3F, -6.0F, -4.2F, 0.1F, 0.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 29)
						.addBox(1.4F, -5.9F, -4.3F, 0.1F, 0.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 29).addBox(1.3F, -5.8F, -4.3F, 0.1F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 29)
						.addBox(1.4F, -4.8F, -4.2F, 1.2F, 0.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 29).addBox(1.4F, -6.1F, -4.2F, 1.2F, 0.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 29)
						.addBox(1.5F, -6.0F, -4.3F, 1.0F, 0.3F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 29).addBox(1.2F, -5.7F, -4.3F, 0.3F, 0.9F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 29)
						.addBox(1.1F, -5.8F, -4.2F, 0.4F, 1.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 29).addBox(2.5F, -5.8F, -4.2F, 0.4F, 1.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(28, 29)
						.addBox(2.5F, -5.7F, -4.3F, 0.3F, 0.9F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 29).addBox(-2.5F, -4.8F, -4.3F, 1.0F, 0.3F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 29)
						.addBox(-2.8F, -5.7F, -4.3F, 0.3F, 0.9F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 29).addBox(-2.5F, -6.0F, -4.3F, 1.0F, 0.3F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 29)
						.addBox(-1.5F, -5.7F, -4.3F, 0.3F, 0.9F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 29).addBox(-2.6F, -4.8F, -4.2F, 1.2F, 0.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 29)
						.addBox(-2.9F, -5.8F, -4.2F, 0.4F, 1.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 29).addBox(-2.6F, -6.1F, -4.2F, 1.2F, 0.4F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 29)
						.addBox(-1.5F, -5.8F, -4.2F, 0.4F, 1.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 29).addBox(-1.8F, -4.7F, -4.4F, 0.1F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 29)
						.addBox(-1.5F, -4.8F, -4.3F, 0.1F, 0.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 29).addBox(-1.4F, -4.8F, -4.3F, 0.1F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 29)
						.addBox(-1.4F, -4.7F, -4.2F, 0.1F, 0.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 29).addBox(-1.3F, -4.7F, -4.2F, 0.1F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 29)
						.addBox(-1.4F, -5.8F, -4.3F, 0.1F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 29).addBox(-1.5F, -5.9F, -4.3F, 0.1F, 0.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 29)
						.addBox(-1.3F, -5.9F, -4.2F, 0.1F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 29).addBox(-1.4F, -6.0F, -4.2F, 0.1F, 0.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 29)
						.addBox(-2.7F, -5.8F, -4.3F, 0.1F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 29).addBox(-2.6F, -5.9F, -4.3F, 0.1F, 0.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 29)
						.addBox(-2.7F, -6.0F, -4.2F, 0.1F, 0.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 29).addBox(-2.6F, -4.8F, -4.3F, 0.1F, 0.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 29)
						.addBox(-2.7F, -4.8F, -4.3F, 0.1F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 29).addBox(-2.8F, -4.7F, -4.2F, 0.1F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 29)
						.addBox(-2.7F, -4.7F, -4.2F, 0.1F, 0.2F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 29).addBox(-2.8F, -5.9F, -4.2F, 0.1F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 29)
						.addBox(-2.3F, -4.7F, -4.4F, 0.1F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 29).addBox(-1.8F, -5.9F, -4.4F, 0.1F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 29)
						.addBox(-2.3F, -5.9F, -4.4F, 0.1F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 29).addBox(-1.4F, -5.5F, -4.4F, 0.1F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 29)
						.addBox(-1.4F, -5.1F, -4.4F, 0.1F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 29).addBox(-2.7F, -5.1F, -4.4F, 0.1F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(27, 29)
						.addBox(-2.7F, -5.5F, -4.4F, 0.1F, 0.1F, 0.1F, new CubeDeformation(0.0F)).texOffs(24, 28).addBox(-4.2F, -2.2F, -2.7F, 0.1F, 0.2F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 29)
						.addBox(-4.3F, -2.2F, -2.7F, 0.1F, 0.1F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 29).addBox(-4.3F, -3.1F, -2.7F, 0.1F, 0.1F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 30)
						.addBox(-4.2F, -3.2F, -2.7F, 0.1F, 0.2F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 27).addBox(-4.2F, -3.1F, -2.8F, 0.1F, 1.0F, 0.2F, new CubeDeformation(0.0F)).texOffs(29, 28)
						.addBox(-4.2F, -3.1F, -1.8F, 0.1F, 1.0F, 0.2F, new CubeDeformation(0.0F)).texOffs(23, 27).addBox(-4.3F, -3.1F, -1.8F, 0.1F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(31, 30)
						.addBox(-4.3F, -3.1F, -2.7F, 0.1F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(29, 30).addBox(4.1F, -2.2F, -2.7F, 0.1F, 0.2F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 30)
						.addBox(4.1F, -3.1F, -2.8F, 0.1F, 1.0F, 0.2F, new CubeDeformation(0.0F)).texOffs(29, 30).addBox(4.1F, -3.1F, -1.8F, 0.1F, 1.0F, 0.2F, new CubeDeformation(0.0F)).texOffs(29, 30)
						.addBox(4.1F, -3.2F, -2.7F, 0.1F, 0.2F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 30).addBox(4.2F, -3.1F, -1.8F, 0.1F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(29, 30)
						.addBox(4.2F, -3.1F, -2.7F, 0.1F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(29, 30).addBox(4.2F, -2.2F, -2.7F, 0.1F, 0.1F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 30)
						.addBox(4.2F, -3.1F, -2.7F, 0.1F, 0.1F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 3).addBox(-4.0F, -4.8F, -4.1F, 8.0F, 4.8F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(-4.0F, -8.0F, -4.1F, 8.0F, 2.3F, 0.1F, new CubeDeformation(0.0F)).texOffs(22, 5).addBox(-4.0F, -5.7F, -4.1F, 1.5F, 0.9F, 0.1F, new CubeDeformation(0.0F)).texOffs(20, 9)
						.addBox(2.5F, -5.7F, -4.1F, 1.5F, 0.9F, 0.1F, new CubeDeformation(0.0F)).texOffs(18, 16).addBox(-1.5F, -5.7F, -4.1F, 3.0F, 0.9F, 0.1F, new CubeDeformation(0.0F)).texOffs(6, 7)
						.addBox(4.0F, -8.0F, -4.0F, 0.1F, 8.0F, 2.9F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, -8.1F, -4.0F, 8.0F, 0.1F, 2.9F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(4.0F, -6.5F, -1.1F, 0.1F, 6.5F, 2.9F, new CubeDeformation(0.0F)).texOffs(10, 16).addBox(-4.1F, -3.9F, 0.4F, 0.1F, 3.9F, 2.2F, new CubeDeformation(0.0F)).texOffs(6, 16)
						.addBox(4.0F, -3.9F, 0.4F, 0.1F, 3.9F, 2.2F, new CubeDeformation(0.0F)).texOffs(12, 8).addBox(-4.1F, -6.5F, -1.1F, 0.1F, 6.5F, 2.9F, new CubeDeformation(0.0F)).texOffs(11, 4)
						.addBox(2.0F, -8.1F, -4.0F, 0.5F, 0.1F, 8.0F, new CubeDeformation(0.0F)).texOffs(13, 2).addBox(-2.5F, -8.1F, -4.0F, 0.5F, 0.1F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.5F, -8.0F, 4.0F, 0.5F, 3.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(2.0F, -8.0F, 4.0F, 0.5F, 3.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(18, 13)
						.addBox(4.0F, -5.0F, 1.8F, 0.1F, 0.5F, 2.2F, new CubeDeformation(0.0F)).texOffs(16, 7).addBox(-4.1F, -5.0F, 1.8F, 0.1F, 0.5F, 2.2F, new CubeDeformation(0.0F)).texOffs(12, 10)
						.addBox(-4.0F, -5.0F, 4.0F, 8.0F, 0.5F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 7).addBox(-4.1F, -8.0F, -4.0F, 0.1F, 8.0F, 2.9F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
	}
}
