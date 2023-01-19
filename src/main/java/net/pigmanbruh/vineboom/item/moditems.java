package net.pigmanbruh.vineboom.item;

import net.pigmanbruh.vineboom.Main;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.util.Identifier;

public class moditems {

	public static final Item VINE_BOOM = registerItem("vine_boom", new Item(new FabricItemSettings().group(ItemGroup.FUNCTIONAL)));

	private static Item registerItem(String name, Item item) {
		return Registries.register(Registries.ITEM, new Identifier(Main.MOD_ID, "vine_boom"), item);
	}

	public static void registerModItems() {
		Main.LOGGER.debug("Registering mod items for " + Main.MOD_ID);

	}
}
