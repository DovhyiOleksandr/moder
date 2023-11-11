
package net.mcreator.doz_in_maincraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.doz_in_maincraft.entity.BloodyCarcassEntity;
import net.mcreator.doz_in_maincraft.client.model.Modeltuha;

public class BloodyCarcassRenderer extends MobRenderer<BloodyCarcassEntity, Modeltuha<BloodyCarcassEntity>> {
	public BloodyCarcassRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltuha(context.bakeLayer(Modeltuha.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<BloodyCarcassEntity, Modeltuha<BloodyCarcassEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("doz_in_maincraft:textures/entities/tusha.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(BloodyCarcassEntity entity) {
		return new ResourceLocation("doz_in_maincraft:textures/entities/tusha.png");
	}
}
