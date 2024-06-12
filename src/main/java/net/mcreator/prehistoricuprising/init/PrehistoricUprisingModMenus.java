
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.prehistoricuprising.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.prehistoricuprising.world.inventory.ExtractorGUIMenu;
import net.mcreator.prehistoricuprising.world.inventory.DNASequencerGUIMenu;
import net.mcreator.prehistoricuprising.world.inventory.CultivatorGUIMenu;
import net.mcreator.prehistoricuprising.world.inventory.CleanerGUIMenu;
import net.mcreator.prehistoricuprising.PrehistoricUprisingMod;

public class PrehistoricUprisingModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, PrehistoricUprisingMod.MODID);
	public static final RegistryObject<MenuType<CleanerGUIMenu>> CLEANER_GUI = REGISTRY.register("cleaner_gui", () -> IForgeMenuType.create(CleanerGUIMenu::new));
	public static final RegistryObject<MenuType<ExtractorGUIMenu>> EXTRACTOR_GUI = REGISTRY.register("extractor_gui", () -> IForgeMenuType.create(ExtractorGUIMenu::new));
	public static final RegistryObject<MenuType<DNASequencerGUIMenu>> DNA_SEQUENCER_GUI = REGISTRY.register("dna_sequencer_gui", () -> IForgeMenuType.create(DNASequencerGUIMenu::new));
	public static final RegistryObject<MenuType<CultivatorGUIMenu>> CULTIVATOR_GUI = REGISTRY.register("cultivator_gui", () -> IForgeMenuType.create(CultivatorGUIMenu::new));
}
