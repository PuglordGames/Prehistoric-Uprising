
package net.mcreator.prehistoricuprising.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ClearAmberItem extends Item {
	public ClearAmberItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
