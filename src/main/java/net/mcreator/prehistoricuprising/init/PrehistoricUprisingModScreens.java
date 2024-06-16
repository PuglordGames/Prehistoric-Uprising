
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.prehistoricuprising.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.prehistoricuprising.client.gui.ExtractorGUIScreen;
import net.mcreator.prehistoricuprising.client.gui.DNASequencerGUIScreen;
import net.mcreator.prehistoricuprising.client.gui.CultivatorGUIScreen;
import net.mcreator.prehistoricuprising.client.gui.CleanerGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PrehistoricUprisingModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(PrehistoricUprisingModMenus.CLEANER_GUI.get(), CleanerGUIScreen::new);
			MenuScreens.register(PrehistoricUprisingModMenus.EXTRACTOR_GUI.get(), ExtractorGUIScreen::new);
			MenuScreens.register(PrehistoricUprisingModMenus.DNA_SEQUENCER_GUI.get(), DNASequencerGUIScreen::new);
			MenuScreens.register(PrehistoricUprisingModMenus.CULTIVATOR_GUI.get(), CultivatorGUIScreen::new);
		});
	}
}
