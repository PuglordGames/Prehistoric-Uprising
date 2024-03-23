
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.prehistoricuprising.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.prehistoricuprising.item.TestitemItem;
import net.mcreator.prehistoricuprising.PrehistoricUprisingMod;

public class PrehistoricUprisingModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PrehistoricUprisingMod.MODID);
	public static final RegistryObject<Item> TESTITEM = REGISTRY.register("testitem", () -> new TestitemItem());
}
