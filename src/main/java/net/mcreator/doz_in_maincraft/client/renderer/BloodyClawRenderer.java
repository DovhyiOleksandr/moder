
package net.mcreator.doz_in_maincraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.doz_in_maincraft.entity.BloodyClawEntity;
import net.mcreator.doz_in_maincraft.client.model.Modelkogot;

public class BloodyClawRenderer extends MobRenderer<BloodyClawEntity, Modelkogot<BloodyClawEntity>> {
	public BloodyClawRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkogot(context.bakeLayer(Modelkogot.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<BloodyClawEntity, Modelkogot<BloodyClawEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("doz_in_maincraft:textures/entities/kogot.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(BloodyClawEntity entity) {
		return new ResourceLocation("doz_in_maincraft:textures/entities/kogot.png");
	}
}
