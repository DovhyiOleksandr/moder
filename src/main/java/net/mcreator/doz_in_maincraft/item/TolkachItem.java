
package net.mcreator.doz_in_maincraft.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.doz_in_maincraft.procedures.TolkachKoghdaPriedmietVInvientarieProcedure;

public class TolkachItem extends Item {
	public TolkachItem() {
		super(new Item.Properties().durability(200).rarity(Rarity.COMMON));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		TolkachKoghdaPriedmietVInvientarieProcedure.execute(entity);
	}
}
