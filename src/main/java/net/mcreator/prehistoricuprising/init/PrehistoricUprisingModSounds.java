
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.prehistoricuprising.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.prehistoricuprising.PrehistoricUprisingMod;

public class PrehistoricUprisingModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, PrehistoricUprisingMod.MODID);
	public static final RegistryObject<SoundEvent> REX_HURT = REGISTRY.register("rex_hurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("prehistoric_uprising", "rex_hurt")));
	public static final RegistryObject<SoundEvent> REX_DEATH = REGISTRY.register("rex_death", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("prehistoric_uprising", "rex_death")));
	public static final RegistryObject<SoundEvent> REX_ROAR = REGISTRY.register("rex_roar", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("prehistoric_uprising", "rex_roar")));
	public static final RegistryObject<SoundEvent> REX_AMBIENT = REGISTRY.register("rex_ambient", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("prehistoric_uprising", "rex_ambient")));
}
