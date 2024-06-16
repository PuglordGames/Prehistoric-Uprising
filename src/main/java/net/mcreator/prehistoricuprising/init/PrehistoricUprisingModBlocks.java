
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.prehistoricuprising.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.prehistoricuprising.block.TyrannosaurusEggBlock;
import net.mcreator.prehistoricuprising.block.TriceratopsEggBlock;
import net.mcreator.prehistoricuprising.block.ParasaurolophusEggBlock;
import net.mcreator.prehistoricuprising.block.FossilOreBlock;
import net.mcreator.prehistoricuprising.block.ExtractorBlock;
import net.mcreator.prehistoricuprising.block.EdmontosaurusEggBlock;
import net.mcreator.prehistoricuprising.block.DakotaraptorEggBlock;
import net.mcreator.prehistoricuprising.block.DNASequencerBlock;
import net.mcreator.prehistoricuprising.block.CultivatorBlock;
import net.mcreator.prehistoricuprising.block.CleanerBlock;
import net.mcreator.prehistoricuprising.block.CarnotaurusEggBlock;
import net.mcreator.prehistoricuprising.block.AmberOreBlock;
import net.mcreator.prehistoricuprising.PrehistoricUprisingMod;

public class PrehistoricUprisingModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PrehistoricUprisingMod.MODID);
	public static final RegistryObject<Block> CLEANER = REGISTRY.register("cleaner", () -> new CleanerBlock());
	public static final RegistryObject<Block> EXTRACTOR = REGISTRY.register("extractor", () -> new ExtractorBlock());
	public static final RegistryObject<Block> DNA_SEQUENCER = REGISTRY.register("dna_sequencer", () -> new DNASequencerBlock());
	public static final RegistryObject<Block> CULTIVATOR = REGISTRY.register("cultivator", () -> new CultivatorBlock());
	public static final RegistryObject<Block> AMBER_ORE = REGISTRY.register("amber_ore", () -> new AmberOreBlock());
	public static final RegistryObject<Block> FOSSIL_ORE = REGISTRY.register("fossil_ore", () -> new FossilOreBlock());
	public static final RegistryObject<Block> TYRANNOSAURUS_EGG = REGISTRY.register("tyrannosaurus_egg", () -> new TyrannosaurusEggBlock());
	public static final RegistryObject<Block> DAKOTARAPTOR_EGG = REGISTRY.register("dakotaraptor_egg", () -> new DakotaraptorEggBlock());
	public static final RegistryObject<Block> CARNOTAURUS_EGG = REGISTRY.register("carnotaurus_egg", () -> new CarnotaurusEggBlock());
	public static final RegistryObject<Block> TRICERATOPS_EGG = REGISTRY.register("triceratops_egg", () -> new TriceratopsEggBlock());
	public static final RegistryObject<Block> PARASAUROLOPHUS_EGG = REGISTRY.register("parasaurolophus_egg", () -> new ParasaurolophusEggBlock());
	public static final RegistryObject<Block> EDMONTOSAURUS_EGG = REGISTRY.register("edmontosaurus_egg", () -> new EdmontosaurusEggBlock());
}
