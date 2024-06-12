package net.mcreator.prehistoricuprising.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.prehistoricuprising.entity.TyrannosaurusEntity;
import net.mcreator.prehistoricuprising.PrehistoricUprisingMod;

public class TyrannosaurusOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 1, 250) == 1) {
			if (entity instanceof TyrannosaurusEntity animatable)
				animatable.setTexture("tyrannosaurus_blink");
			PrehistoricUprisingMod.queueServerWork(5, () -> {
				if (entity instanceof TyrannosaurusEntity animatable)
					animatable.setTexture("tyrannosaurus");
			});
		}
	}
}
