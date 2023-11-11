
package net.mcreator.doz_in_maincraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.doz_in_maincraft.init.DozInMaincraftModFluids;

public class FLUEDGLASSItem extends BucketItem {
	public FLUEDGLASSItem() {
		super(DozInMaincraftModFluids.FLUEDGLASS, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
