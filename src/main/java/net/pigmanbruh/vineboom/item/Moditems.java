package net.pigmanbruh.vineboom.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.pigmanbruh.vineboom.Main;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Moditems {

    public static final Item VINE_BOOM_ITEM =
      Registry.register(Registries.ITEM, new Identifier("vineboom", "vine_boom_item"),
        new Item(new FabricItemSettings()));
    
    public static void registerModItems() {
        TutorialMod.LOGGER.debug("Registering Mod Items for " + MOD_ID);

        addItemsToItemGroups();
    }
}
