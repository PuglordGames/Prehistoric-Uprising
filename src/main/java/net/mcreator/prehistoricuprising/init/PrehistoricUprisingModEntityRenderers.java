
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.prehistoricuprising.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.prehistoricuprising.client.renderer.TyrannosaurusRenderer;
import net.mcreator.prehistoricuprising.client.renderer.TriceratopsRenderer;
import net.mcreator.prehistoricuprising.client.renderer.ParasaurolophusRenderer;
import net.mcreator.prehistoricuprising.client.renderer.EdmontosaurusRenderer;
import net.mcreator.prehistoricuprising.client.renderer.DakotaraptorRenderer;
import net.mcreator.prehistoricuprising.client.renderer.CarnotaurusRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PrehistoricUprisingModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PrehistoricUprisingModEntities.TYRANNOSAURUS.get(), TyrannosaurusRenderer::new);
		event.registerEntityRenderer(PrehistoricUprisingModEntities.DAKOTARAPTOR.get(), DakotaraptorRenderer::new);
		event.registerEntityRenderer(PrehistoricUprisingModEntities.CARNOTAURUS.get(), CarnotaurusRenderer::new);
		event.registerEntityRenderer(PrehistoricUprisingModEntities.TRICERATOPS.get(), TriceratopsRenderer::new);
		event.registerEntityRenderer(PrehistoricUprisingModEntities.PARASAUROLOPHUS.get(), ParasaurolophusRenderer::new);
		event.registerEntityRenderer(PrehistoricUprisingModEntities.EDMONTOSAURUS.get(), EdmontosaurusRenderer::new);
	}
}
