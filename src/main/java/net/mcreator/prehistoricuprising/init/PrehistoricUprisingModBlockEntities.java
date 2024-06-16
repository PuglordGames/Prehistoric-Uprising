
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.prehistoricuprising.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.prehistoricuprising.block.entity.ExtractorBlockEntity;
import net.mcreator.prehistoricuprising.block.entity.DNASequencerBlockEntity;
import net.mcreator.prehistoricuprising.block.entity.CultivatorBlockEntity;
import net.mcreator.prehistoricuprising.block.entity.CleanerBlockEntity;
import net.mcreator.prehistoricuprising.PrehistoricUprisingMod;

public class PrehistoricUprisingModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, PrehistoricUprisingMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> CLEANER = register("cleaner", PrehistoricUprisingModBlocks.CLEANER, CleanerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> EXTRACTOR = register("extractor", PrehistoricUprisingModBlocks.EXTRACTOR, ExtractorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DNA_SEQUENCER = register("dna_sequencer", PrehistoricUprisingModBlocks.DNA_SEQUENCER, DNASequencerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CULTIVATOR = register("cultivator", PrehistoricUprisingModBlocks.CULTIVATOR, CultivatorBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
