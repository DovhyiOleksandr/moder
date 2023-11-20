package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.doz_in_maincraft.init.DozInMaincraftModBlocks;

import java.util.Map;

public class AirdropPriDobavlieniiBlokaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 1, z), DozInMaincraftModBlocks.AIRDROP.get().defaultBlockState(), 3);
		} else {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = DozInMaincraftModBlocks.AIRDROP_OPEN.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
	}
}
