
package net.mcreator.doz_in_maincraft.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.doz_in_maincraft.procedures.LoadForestersPriShchielchkiePravoiKnopkoiMyshiNaBlokieProcedure;

public class LoadForestersItem extends Item {
	public LoadForestersItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		LoadForestersPriShchielchkiePravoiKnopkoiMyshiNaBlokieProcedure.execute(context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
