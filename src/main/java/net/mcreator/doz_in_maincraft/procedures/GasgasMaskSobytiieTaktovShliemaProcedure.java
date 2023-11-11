package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

import net.mcreator.doz_in_maincraft.init.DozInMaincraftModMobEffects;

public class GasgasMaskSobytiieTaktovShliemaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrCreateTag().getDouble("protgas") != 0) {
			if (entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(DozInMaincraftModMobEffects.FOREST_SPORES.get())) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(DozInMaincraftModMobEffects.FOREST_SPORES.get());
			}
			if (entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(MobEffects.POISON)) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.POISON);
			}
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrCreateTag().putDouble("protgas",
					((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrCreateTag().getDouble("protgas") - 1));
		}
	}
}
