
package net.mcreator.prehistoricuprising.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DirtyFossilItem extends Item {
	public DirtyFossilItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
