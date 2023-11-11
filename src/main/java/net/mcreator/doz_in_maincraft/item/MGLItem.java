
package net.mcreator.doz_in_maincraft.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;

import net.mcreator.doz_in_maincraft.procedures.MGLPriIspolzovaniiStrielkovoghoPriedmietaProcedure;
import net.mcreator.doz_in_maincraft.procedures.MGLMozhnoIspolzovatDalnoboinyiPriedmietProcedure;
import net.mcreator.doz_in_maincraft.entity.MGLEntity;

import java.util.List;

public class MGLItem extends Item {
	public MGLItem() {
		super(new Item.Properties().durability(1000));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		entity.startUsingItem(hand);
		return new InteractionResultHolder(InteractionResult.SUCCESS, entity.getItemInHand(hand));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("40 mm grenade"));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.NONE;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 72000;
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
		if (!world.isClientSide() && entityLiving instanceof ServerPlayer entity) {
			double x = entity.getX();
			double y = entity.getY();
			double z = entity.getZ();
			if (MGLMozhnoIspolzovatDalnoboinyiPriedmietProcedure.execute(itemstack)) {
				MGLEntity entityarrow = MGLEntity.shoot(world, entity, world.getRandom(), 3f, 1, 5);
				itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
				entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
				MGLPriIspolzovaniiStrielkovoghoPriedmietaProcedure.execute(itemstack);
			}
		}
	}
}
