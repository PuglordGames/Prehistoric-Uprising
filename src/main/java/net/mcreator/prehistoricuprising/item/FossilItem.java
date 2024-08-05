
package net.mcreator.prehistoricuprising.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class FossilItem extends Item {
	public FossilItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
