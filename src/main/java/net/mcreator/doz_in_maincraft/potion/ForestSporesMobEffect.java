
package net.mcreator.doz_in_maincraft.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.doz_in_maincraft.procedures.ForestSporesKazhdyiTikVoVriemiaEffiektaProcedure;

public class ForestSporesMobEffect extends MobEffect {
	public ForestSporesMobEffect() {
		super(MobEffectCategory.HARMFUL, -13434829);
	}

	@Override
	public String getDescriptionId() {
		return "effect.doz_in_maincraft.forest_spores";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ForestSporesKazhdyiTikVoVriemiaEffiektaProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
