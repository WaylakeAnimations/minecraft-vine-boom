package net.pigmanbruh.vineboom.item.custom;

import net.pigmanbruh.vineboom.item.custom.VineBoomItemFunction;

import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;

public class PlaySound {

    public void playSound() {
        World.playSoundFromEntity (null, PlayerEntity, VineBoomItemFunction.VINE_BOOM_SOUND_EVENT, SoundCategory.PLAYERS, 1.0f, 1.0f);
    }
}