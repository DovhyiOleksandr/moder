
package net.mcreator.doz_in_maincraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.doz_in_maincraft.init.DozInMaincraftModItems;

public class StealPickaxeItem extends PickaxeItem {
	public StealPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 802;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 32;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DozInMaincraftModItems.STEAL_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}
