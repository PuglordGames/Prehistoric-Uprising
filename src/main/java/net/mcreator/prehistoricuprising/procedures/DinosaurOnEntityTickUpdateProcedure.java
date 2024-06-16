package net.mcreator.prehistoricuprising.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.prehistoricuprising.entity.TyrannosaurusEntity;
import net.mcreator.prehistoricuprising.entity.TriceratopsEntity;
import net.mcreator.prehistoricuprising.entity.ParasaurolophusEntity;
import net.mcreator.prehistoricuprising.entity.DakotaraptorEntity;
import net.mcreator.prehistoricuprising.entity.CarnotaurusEntity;
import net.mcreator.prehistoricuprising.PrehistoricUprisingMod;

public class DinosaurOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof TyrannosaurusEntity) {
			if (Mth.nextInt(RandomSource.create(), 1, 250) == 1) {
				if (entity instanceof TyrannosaurusEntity animatable)
					animatable.setTexture("tyrannosaurus_blink");
				PrehistoricUprisingMod.queueServerWork(5, () -> {
					if (entity instanceof TyrannosaurusEntity animatable)
						animatable.setTexture("tyrannosaurus");
				});
			}
		}
		if (entity instanceof DakotaraptorEntity) {
			if (Mth.nextInt(RandomSource.create(), 1, 250) == 1) {
				if (entity instanceof DakotaraptorEntity animatable)
					animatable.setTexture("dakotaraptor_blink");
				PrehistoricUprisingMod.queueServerWork(5, () -> {
					if (entity instanceof DakotaraptorEntity animatable)
						animatable.setTexture("dakotaraptor");
				});
			}
		}
		if (entity instanceof CarnotaurusEntity) {
			if (Mth.nextInt(RandomSource.create(), 1, 250) == 1) {
				if (entity instanceof CarnotaurusEntity animatable)
					animatable.setTexture("carnotaurus_blink");
				PrehistoricUprisingMod.queueServerWork(5, () -> {
					if (entity instanceof CarnotaurusEntity animatable)
						animatable.setTexture("carnotaurus");
				});
			}
		}
		if (entity instanceof TriceratopsEntity) {
			if (Mth.nextInt(RandomSource.create(), 1, 250) == 1) {
				if (entity instanceof TriceratopsEntity animatable)
					animatable.setTexture("triceratops_blink");
				PrehistoricUprisingMod.queueServerWork(5, () -> {
					if (entity instanceof TriceratopsEntity animatable)
						animatable.setTexture("triceratops");
				});
			}
		}
		if (entity instanceof ParasaurolophusEntity) {
			if (Mth.nextInt(RandomSource.create(), 1, 250) == 1) {
				if (entity instanceof ParasaurolophusEntity animatable)
					animatable.setTexture("parasaurolophus_blink");
				PrehistoricUprisingMod.queueServerWork(5, () -> {
					if (entity instanceof ParasaurolophusEntity animatable)
						animatable.setTexture("parasaurolophus");
				});
			}
		}
	}
}
