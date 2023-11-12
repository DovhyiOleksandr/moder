
package net.mcreator.doz_in_maincraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class KevlarItem extends Item {
	public KevlarItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
