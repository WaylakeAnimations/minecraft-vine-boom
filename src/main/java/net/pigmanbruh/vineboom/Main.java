package net.pigmanbruh.vineboom;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.mojang.datafixers.util.Pair;
import net.minecraft.item.Item;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;

public class Main implements ModInitializer {
	public static final String MOD_ID = "vineboom";
	public static final Logger LOGGER = LoggerFactory.getLogger("vineboom");
}
