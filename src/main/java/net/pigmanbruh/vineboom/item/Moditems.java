package net.pigmanbruh.vineboom.item;

import net.pigmanbruh.vineboom.Main;
import net.pigmanbruh.vineboom.sound.Vineboomsound;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.util.ActionResult;
import net.minecraft.sound.SoundCategory;
import net.minecraft.entity.player.ItemCooldownManager;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;

public class Moditems {

    public static final Item VINE_BOOM_ITEM =
      Registry.register(Registries.ITEM, new Identifier(Main.MOD_ID, "vine_boom_item"),
        new Item(new FabricItemSettings()));
    
    public static void addItemsToItemGroups() {
        addToItemGroup(ItemGroups.TOOLS, VINE_BOOM_ITEM);
    }
    
    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    
    public static void registerModItems() {
        Main.LOGGER.debug("Registering Mod Items for " + Main.MOD_ID + " mod");

        addItemsToItemGroups();
    }

    public static void onItemRightClick() {
        playSoundFromEntity(
            null,
            PlayerEntity.player,
            Vineboomsound.VINE_BOOM_SOUND_EVENT,
            SoundCategory.PLAYERS,
            1.0f,
            1.0f);
    }
}
