package net.pigmanbruh.vineboom.sound;
// This class used for adding and registering mod sound(s)

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.sound.SoundEvent;

public class Sounds {
    public static final Identifier VINE_BOOM_SOUND = new Identifier("vineboom:vine_boom_sound");
    public static SoundEvent VINE_BOOM_SOUND_EVENT = SoundEvent.of(VINE_BOOM_SOUND);

    public static void registerModSounds() {
        Registry.register(Registries.SOUND_EVENT, Sounds.VINE_BOOM_SOUND, VINE_BOOM_SOUND_EVENT);
    }
}
