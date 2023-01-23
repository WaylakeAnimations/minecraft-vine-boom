package net.pigmanbruh.vineboom.sound;

import net.pigmanbruh.vineboom.Main;

import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.fabricmc.api.ModInitializer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Vineboomsound implements ModInitializer {

    public static final Identifier VINE_BOOM_SOUND = new Identifier("vineboom:vine_boom_sound");
    public static SoundEvent VINE_BOOM_SOUND_EVENT = SoundEvent.of(VINE_BOOM_SOUND);

    @Override
    public void onInitialize(){
        Registry.register(Registries.SOUND_EVENT, Vineboomsound.VINE_BOOM_SOUND, VINE_BOOM_SOUND_EVENT);
    }
}