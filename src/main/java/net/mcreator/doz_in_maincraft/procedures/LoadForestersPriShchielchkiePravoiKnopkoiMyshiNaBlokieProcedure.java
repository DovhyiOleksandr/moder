package net.mcreator.doz_in_maincraft.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.doz_in_maincraft.init.DozInMaincraftModItems;

public class LoadForestersPriShchielchkiePravoiKnopkoiMyshiNaBlokieProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.25) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(DozInMaincraftModItems.ELECTRICAL_TAPE.get());
				_setstack.setCount(4);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else {
			if (Math.random() < 0.25) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DozInMaincraftModItems.ELECTRICAL_TAPE.get());
					_setstack.setCount(3);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else {
				if (Math.random() < 0.25) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(DozInMaincraftModItems.ELECTRICAL_TAPE.get());
						_setstack.setCount(2);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(DozInMaincraftModItems.ELECTRICAL_TAPE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			}
		}
		if (Math.random() < 0.25) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(DozInMaincraftModItems.HEALING_MIXTURE.get());
				_setstack.setCount(2);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(DozInMaincraftModItems.HEALING_MIXTURE.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (Math.random() < 0.25) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(DozInMaincraftModItems.CASTING_MOLD.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (Math.random() < 0.25) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.NETHERITE_SCRAP);
				_setstack.setCount(6);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else {
			if (Math.random() < 0.25) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Items.NETHERITE_SCRAP);
					_setstack.setCount(5);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else {
				if (Math.random() < 0.25) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Items.NETHERITE_SCRAP);
						_setstack.setCount(4);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else {
					if (Math.random() < 0.25) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.NETHERITE_SCRAP);
							_setstack.setCount(3);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else {
						if (Math.random() < 0.25) {
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(Items.NETHERITE_SCRAP);
								_setstack.setCount(2);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
						} else {
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(Items.NETHERITE_SCRAP);
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
						}
					}
				}
			}
		}
		if (Math.random() < 0.25) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(DozInMaincraftModItems.ADDED_AROMATIC_SPICES.get());
				_setstack.setCount(4);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else {
			if (Math.random() < 0.25) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DozInMaincraftModItems.ADDED_AROMATIC_SPICES.get());
					_setstack.setCount(3);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else {
				if (Math.random() < 0.25) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(DozInMaincraftModItems.ADDED_AROMATIC_SPICES.get());
						_setstack.setCount(2);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(DozInMaincraftModItems.ADDED_AROMATIC_SPICES.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			}
		}
		if (Math.random() < 0.25) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(DozInMaincraftModItems.SEEDLING_MAGIC_PINE.get());
				_setstack.setCount(3);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else {
			if (Math.random() < 0.25) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DozInMaincraftModItems.SEEDLING_MAGIC_PINE.get());
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DozInMaincraftModItems.SEEDLING_MAGIC_PINE.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(DozInMaincraftModItems.LOAD_FORESTERS.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
	}
}
