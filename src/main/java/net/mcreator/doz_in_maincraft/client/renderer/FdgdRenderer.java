
package net.mcreator.doz_in_maincraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.doz_in_maincraft.entity.FdgdEntity;
import net.mcreator.doz_in_maincraft.client.model.Modeldron;

public class FdgdRenderer extends MobRenderer<FdgdEntity, Modeldron<FdgdEntity>> {
	public FdgdRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldron(context.bakeLayer(Modeldron.LAYER_LOCATION)), 0f);
		this.addLayer(new EyesLayer<FdgdEntity, Modeldron<FdgdEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("doz_in_maincraft:textures/entities/dron.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(FdgdEntity entity) {
		return new ResourceLocation("doz_in_maincraft:textures/entities/dron.png");
	}
}
