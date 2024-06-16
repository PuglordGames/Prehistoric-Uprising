
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.prehistoricuprising.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.prehistoricuprising.entity.TyrannosaurusEntity;
import net.mcreator.prehistoricuprising.entity.TriceratopsEntity;
import net.mcreator.prehistoricuprising.entity.ParasaurolophusEntity;
import net.mcreator.prehistoricuprising.entity.EdmontosaurusEntity;
import net.mcreator.prehistoricuprising.entity.DakotaraptorEntity;
import net.mcreator.prehistoricuprising.entity.CarnotaurusEntity;
import net.mcreator.prehistoricuprising.PrehistoricUprisingMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PrehistoricUprisingModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PrehistoricUprisingMod.MODID);
	public static final RegistryObject<EntityType<TyrannosaurusEntity>> TYRANNOSAURUS = register("tyrannosaurus",
			EntityType.Builder.<TyrannosaurusEntity>of(TyrannosaurusEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(TyrannosaurusEntity::new)

					.sized(2f, 4.6f));
	public static final RegistryObject<EntityType<DakotaraptorEntity>> DAKOTARAPTOR = register("dakotaraptor",
			EntityType.Builder.<DakotaraptorEntity>of(DakotaraptorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(DakotaraptorEntity::new)

					.sized(0.4f, 1.5f));
	public static final RegistryObject<EntityType<CarnotaurusEntity>> CARNOTAURUS = register("carnotaurus",
			EntityType.Builder.<CarnotaurusEntity>of(CarnotaurusEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(CarnotaurusEntity::new)

					.sized(1.5f, 2.8f));
	public static final RegistryObject<EntityType<TriceratopsEntity>> TRICERATOPS = register("triceratops",
			EntityType.Builder.<TriceratopsEntity>of(TriceratopsEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(TriceratopsEntity::new)

					.sized(1.7f, 2.9f));
	public static final RegistryObject<EntityType<ParasaurolophusEntity>> PARASAUROLOPHUS = register("parasaurolophus",
			EntityType.Builder.<ParasaurolophusEntity>of(ParasaurolophusEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(ParasaurolophusEntity::new)

					.sized(1.7f, 3.1f));
	public static final RegistryObject<EntityType<EdmontosaurusEntity>> EDMONTOSAURUS = register("edmontosaurus",
			EntityType.Builder.<EdmontosaurusEntity>of(EdmontosaurusEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(EdmontosaurusEntity::new)

					.sized(2f, 3.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TyrannosaurusEntity.init();
			DakotaraptorEntity.init();
			CarnotaurusEntity.init();
			TriceratopsEntity.init();
			ParasaurolophusEntity.init();
			EdmontosaurusEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(TYRANNOSAURUS.get(), TyrannosaurusEntity.createAttributes().build());
		event.put(DAKOTARAPTOR.get(), DakotaraptorEntity.createAttributes().build());
		event.put(CARNOTAURUS.get(), CarnotaurusEntity.createAttributes().build());
		event.put(TRICERATOPS.get(), TriceratopsEntity.createAttributes().build());
		event.put(PARASAUROLOPHUS.get(), ParasaurolophusEntity.createAttributes().build());
		event.put(EDMONTOSAURUS.get(), EdmontosaurusEntity.createAttributes().build());
	}
}
