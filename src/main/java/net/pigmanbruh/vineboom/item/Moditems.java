package net.pigmanbruh.vineboom.item;
// This class is used for adding and registering mod item(s)
// and also adding item into an item group

import net.pigmanbruh.vineboom.item.custom.VineBoomItemFunction;
import net.pigmanbruh.vineboom.Main;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Moditems {

    public static final Item VINE_BOOM_ITEM = 
        Registry.register(Registries.ITEM, new Identifier(Main.MOD_ID, "vine_boom_item"),
            new VineBoomItemFunction(new FabricItemSettings().maxCount(1)));

    public static void addItemsToItemGroups() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.add(VINE_BOOM_ITEM);
        });

    public static void registerModItems() {
        Main.LOGGER.info("Vineboom Mod is loaded, ONLY USE FOR TROLLING PURPOSES *insert trollface here* ");
        addItemsToItemGroups();
    }
}
