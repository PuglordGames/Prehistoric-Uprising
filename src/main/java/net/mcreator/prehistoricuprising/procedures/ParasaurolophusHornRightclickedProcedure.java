package net.mcreator.prehistoricuprising.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.prehistoricuprising.network.PrehistoricUprisingModVariables;
import net.mcreator.prehistoricuprising.PrehistoricUprisingMod;

public class ParasaurolophusHornRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("prehistoric_uprising:parasaurolophus_horn_sound")), SoundSource.VOICE, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("prehistoric_uprising:parasaurolophus_horn_sound")), SoundSource.VOICE, 1, 1, false);
			}
		}
		PrehistoricUprisingModVariables.WorldVariables.get(world).para_horn_pos_x = x;
		PrehistoricUprisingModVariables.WorldVariables.get(world).syncData(world);
		PrehistoricUprisingModVariables.MapVariables.get(world).para_horn_pos_y = y;
		PrehistoricUprisingModVariables.MapVariables.get(world).syncData(world);
		PrehistoricUprisingModVariables.MapVariables.get(world).para_horn_pos_z = z;
		PrehistoricUprisingModVariables.MapVariables.get(world).syncData(world);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 100);
		PrehistoricUprisingModVariables.WorldVariables.get(world).para_horn_can_use = false;
		PrehistoricUprisingModVariables.WorldVariables.get(world).syncData(world);
		PrehistoricUprisingMod.queueServerWork(20, () -> {
			PrehistoricUprisingModVariables.WorldVariables.get(world).para_horn_can_use = true;
			PrehistoricUprisingModVariables.WorldVariables.get(world).syncData(world);
		});
	}
}
