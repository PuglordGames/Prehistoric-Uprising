
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.prehistoricuprising.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.prehistoricuprising.item.VialItem;
import net.mcreator.prehistoricuprising.item.FracturedDNAVialFossilItem;
import net.mcreator.prehistoricuprising.item.FracturedDNAVialAmberItem;
import net.mcreator.prehistoricuprising.item.FossilItem;
import net.mcreator.prehistoricuprising.item.DirtyFossilItem;
import net.mcreator.prehistoricuprising.item.CompleteTyrannosaurusDNAVialItem;
import net.mcreator.prehistoricuprising.item.CompleteDakotaraptorDNAVialItem;
import net.mcreator.prehistoricuprising.item.ClearAmberItem;
import net.mcreator.prehistoricuprising.item.AmberItem;
import net.mcreator.prehistoricuprising.PrehistoricUprisingMod;

public class PrehistoricUprisingModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PrehistoricUprisingMod.MODID);
	public static final RegistryObject<Item> TYRANNOSAURUS_SPAWN_EGG = REGISTRY.register("tyrannosaurus_spawn_egg", () -> new ForgeSpawnEggItem(PrehistoricUprisingModEntities.TYRANNOSAURUS, -12639969, -3752791, new Item.Properties()));
	public static final RegistryObject<Item> CLEANER = block(PrehistoricUprisingModBlocks.CLEANER);
	public static final RegistryObject<Item> EXTRACTOR = block(PrehistoricUprisingModBlocks.EXTRACTOR);
	public static final RegistryObject<Item> DNA_SEQUENCER = block(PrehistoricUprisingModBlocks.DNA_SEQUENCER);
	public static final RegistryObject<Item> CULTIVATOR = block(PrehistoricUprisingModBlocks.CULTIVATOR);
	public static final RegistryObject<Item> AMBER_ORE = block(PrehistoricUprisingModBlocks.AMBER_ORE);
	public static final RegistryObject<Item> CLEAR_AMBER = REGISTRY.register("clear_amber", () -> new ClearAmberItem());
	public static final RegistryObject<Item> AMBER = REGISTRY.register("amber", () -> new AmberItem());
	public static final RegistryObject<Item> FOSSIL_ORE = block(PrehistoricUprisingModBlocks.FOSSIL_ORE);
	public static final RegistryObject<Item> DIRTY_FOSSIL = REGISTRY.register("dirty_fossil", () -> new DirtyFossilItem());
	public static final RegistryObject<Item> FOSSIL = REGISTRY.register("fossil", () -> new FossilItem());
	public static final RegistryObject<Item> VIAL = REGISTRY.register("vial", () -> new VialItem());
	public static final RegistryObject<Item> COMPLETE_TYRANNOSAURUS_DNA_VIAL = REGISTRY.register("complete_tyrannosaurus_dna_vial", () -> new CompleteTyrannosaurusDNAVialItem());
	public static final RegistryObject<Item> FRACTURED_DNA_VIAL_AMBER = REGISTRY.register("fractured_dna_vial_amber", () -> new FracturedDNAVialAmberItem());
	public static final RegistryObject<Item> FRACTURED_DNA_VIAL_FOSSIL = REGISTRY.register("fractured_dna_vial_fossil", () -> new FracturedDNAVialFossilItem());
	public static final RegistryObject<Item> TYRANNOSAURUS_EGG = block(PrehistoricUprisingModBlocks.TYRANNOSAURUS_EGG);
	public static final RegistryObject<Item> DAKOTARAPTOR_SPAWN_EGG = REGISTRY.register("dakotaraptor_spawn_egg", () -> new ForgeSpawnEggItem(PrehistoricUprisingModEntities.DAKOTARAPTOR, -13868381, -9201726, new Item.Properties()));
	public static final RegistryObject<Item> COMPLETE_DAKOTARAPTOR_DNA_VIAL = REGISTRY.register("complete_dakotaraptor_dna_vial", () -> new CompleteDakotaraptorDNAVialItem());
	public static final RegistryObject<Item> DAKOTARAPTOR_EGG = block(PrehistoricUprisingModBlocks.DAKOTARAPTOR_EGG);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
