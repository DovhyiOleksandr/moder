package net.mcreator.doz_in_maincraft.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.doz_in_maincraft.init.DozInMaincraftModItems;

public class FortressArmorSetPriShchielchkiePKMPoBlokuProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(DozInMaincraftModItems.FORTRESS_ARMOR_SET.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(DozInMaincraftModItems.ARMOR_FORTRESS_HELMET.get());
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(DozInMaincraftModItems.ARMOR_FORTRESS_CHESTPLATE.get());
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(DozInMaincraftModItems.ARMOR_FORTRESS_LEGGINGS.get());
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(DozInMaincraftModItems.ARMOR_FORTRESS_BOOTS.get());
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
	}
}
