package net.pigmanbruh.vineboom.item;

import net.fabricmc.api.ModInitializer;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import net.pigmanbruh.vineboom.Main;
import net.minecraft.item.Item;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.util.Identifier;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import java.util.List;
import java.util.Map;

public class Moditems {

    public static final Item VINE_BOOM_ITEM =
      Registry.register(Registries.ITEM, new Identifier("vineboom", "vine_boom_item"),
        new Item(new FabricItemSettings()));
}