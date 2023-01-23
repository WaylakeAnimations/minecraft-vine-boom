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
import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.util.ActionResult;
import net.minecraft.sound.SoundCategory;
import net.minecraft.entity.player.ItemCooldownManager;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;

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

    private static final Identifier VINE_BOOM_SOUND = new Identifier("vineboom:vine_boom_sound");
    private static SoundEvent VINE_BOOM_SOUND_EVENT = SoundEvent.of(VINE_BOOM_SOUND);

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(Main.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, new SoundEvent(id));
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient() && hand == Hand.MAIN_HAND) {
            world.playSound(
                null, // Player - if non-null, will play sound for every nearby player *except* the specified player
                playerPos,
                Moditems.VINE_BOOM_SOUND_EVENT,
                SoundCategory.PLAYERS,
                1f, //Volume multiplier
                1f // Pitch multiplier
            );
            user.getItemCooldownManager().set(this, 20);
        }
        return super.use(world, user, hand);
    }
}