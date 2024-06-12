package net.mcreator.prehistoricuprising.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.prehistoricuprising.init.PrehistoricUprisingModEntities;
import net.mcreator.prehistoricuprising.PrehistoricUprisingMod;

public class TyrannosaurusEggBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		PrehistoricUprisingMod.queueServerWork(500, () -> {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = PrehistoricUprisingModEntities.TYRANNOSAURUS.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
				}
			}
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		});
	}
}
