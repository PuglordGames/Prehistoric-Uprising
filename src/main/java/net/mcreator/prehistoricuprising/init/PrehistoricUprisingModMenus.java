
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.prehistoricuprising.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.prehistoricuprising.world.inventory.SdfghjdfhgudfvhjfdghbhjdfhbdfsbnfdgvnbMenu;
import net.mcreator.prehistoricuprising.PrehistoricUprisingMod;

public class PrehistoricUprisingModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, PrehistoricUprisingMod.MODID);
	public static final RegistryObject<MenuType<SdfghjdfhgudfvhjfdghbhjdfhbdfsbnfdgvnbMenu>> SDFGHJDFHGUDFVHJFDGHBHJDFHBDFSBNFDGVNB = REGISTRY.register("sdfghjdfhgudfvhjfdghbhjdfhbdfsbnfdgvnb",
			() -> IForgeMenuType.create(SdfghjdfhgudfvhjfdghbhjdfhbdfsbnfdgvnbMenu::new));
}
