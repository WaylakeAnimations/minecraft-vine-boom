package net.pigmanbruh.vineboom.item.custom;

import net.pigmanbruh.vineboom.item.Moditems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraft.util.Hand;
import net.minecraft.entity.player.ItemCooldownManager;
import net.minecraft.sound.SoundEvent;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class VineBoomItemFunction extends Item {
    public VineBoomItemFunction(Settings settings) {
        super(settings);
    }
    
    public static final Identifier VINE_BOOM_SOUND = new Identifier("vineboom:vine_boom_sound");
    public static SoundEvent VINE_BOOM_SOUND_EVENT = SoundEvent.of(VINE_BOOM_SOUND);

    public static void registerModSounds() {
        Registry.register(Registries.SOUND_EVENT, VineBoomItemFunction.VINE_BOOM_SOUND, VINE_BOOM_SOUND_EVENT);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(world.isClient() && hand == Hand.MAIN_HAND) {
            user.playSound(SoundEvent.VINE_BOOM_SOUND_EVENT, 1.0F, 1.0F);
            user.getItemCooldownManager().set(this, 10);
        }
        return super.use(world, user, hand);
    }
}
