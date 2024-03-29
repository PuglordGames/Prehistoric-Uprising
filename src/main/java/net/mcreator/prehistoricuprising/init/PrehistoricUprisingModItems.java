
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.prehistoricuprising.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.prehistoricuprising.PrehistoricUprisingMod;

public class PrehistoricUprisingModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PrehistoricUprisingMod.MODID);
	public static final RegistryObject<Item> TYRANNOSAURUS_SPAWN_EGG = REGISTRY.register("tyrannosaurus_spawn_egg", () -> new ForgeSpawnEggItem(PrehistoricUprisingModEntities.TYRANNOSAURUS, -10276067, -3887729, new Item.Properties()));
}
