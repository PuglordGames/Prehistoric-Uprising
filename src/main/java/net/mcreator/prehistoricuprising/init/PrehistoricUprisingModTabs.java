
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.prehistoricuprising.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.prehistoricuprising.PrehistoricUprisingMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PrehistoricUprisingModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PrehistoricUprisingMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(PrehistoricUprisingModBlocks.CLEANER.get().asItem());
			tabData.accept(PrehistoricUprisingModBlocks.EXTRACTOR.get().asItem());
			tabData.accept(PrehistoricUprisingModBlocks.DNA_SEQUENCER.get().asItem());
			tabData.accept(PrehistoricUprisingModBlocks.CULTIVATOR.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(PrehistoricUprisingModItems.TYRANNOSAURUS_SPAWN_EGG.get());
			tabData.accept(PrehistoricUprisingModBlocks.TYRANNOSAURUS_EGG.get().asItem());
			tabData.accept(PrehistoricUprisingModItems.DAKOTARAPTOR_SPAWN_EGG.get());
			tabData.accept(PrehistoricUprisingModBlocks.DAKOTARAPTOR_EGG.get().asItem());
			tabData.accept(PrehistoricUprisingModItems.CARNOTAURUS_SPAWN_EGG.get());
			tabData.accept(PrehistoricUprisingModBlocks.CARNOTAURUS_EGG.get().asItem());
			tabData.accept(PrehistoricUprisingModItems.TRICERATOPS_SPAWN_EGG.get());
			tabData.accept(PrehistoricUprisingModBlocks.TRICERATOPS_EGG.get().asItem());
			tabData.accept(PrehistoricUprisingModItems.PARASAUROLOPHUS_SPAWN_EGG.get());
			tabData.accept(PrehistoricUprisingModBlocks.PARASAUROLOPHUS_EGG.get().asItem());
			tabData.accept(PrehistoricUprisingModItems.EDMONTOSAURUS_SPAWN_EGG.get());
			tabData.accept(PrehistoricUprisingModBlocks.EDMONTOSAURUS_EGG.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(PrehistoricUprisingModItems.CLEAR_AMBER.get());
			tabData.accept(PrehistoricUprisingModItems.AMBER.get());
			tabData.accept(PrehistoricUprisingModItems.DIRTY_FOSSIL.get());
			tabData.accept(PrehistoricUprisingModItems.FOSSIL.get());
			tabData.accept(PrehistoricUprisingModItems.VIAL.get());
			tabData.accept(PrehistoricUprisingModItems.FRACTURED_DNA_VIAL_AMBER.get());
			tabData.accept(PrehistoricUprisingModItems.FRACTURED_DNA_VIAL_FOSSIL.get());
			tabData.accept(PrehistoricUprisingModItems.COMPLETE_DNA_VIAL.get());
			tabData.accept(PrehistoricUprisingModItems.CIRCUIT.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(PrehistoricUprisingModBlocks.AMBER_ORE.get().asItem());
			tabData.accept(PrehistoricUprisingModBlocks.FOSSIL_ORE.get().asItem());
		}
	}
}
