package net.pigmanbruh.vineboom.item;

import net.pigmanbruh.vineboom.Main;
import net.pigmanbruh.vineboom.item.custom.VineBoomItemFunction;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;

public class Moditems {

    public static final Item VINE_BOOM_ITEM =
      Registry.register(Registries.ITEM, new Identifier(Main.MOD_ID, "vine_boom_item"),
        new VineBoomItemFunction(new FabricItemSettings().maxCount(1)));
    
    public static void addItemsToItemGroups() {
        addToItemGroup(ItemGroups.TOOLS, VINE_BOOM_ITEM);
    }
    
    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    
    public static void registerModItems() {
        Main.LOGGER.debug("Registering Mod Items for " + Main.MOD_ID + " mod");

        addItemsToItemGroups();

    public void playVineboom (PlayerEntity user) {
        World.playSoundFromEntity (null, user, VINE_BOOM_SOUND_EVENT, SoundCategory.PLAYERS, 1.0f, 1.0f);
    }
}
