package net.pigmanbruh.vineboom.item;

import net.pigmanbruh.vineboom.Main;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.util.Identifier;

public class moditems {

    public static final Item VINE_BOOM_ITEM = new Item(new FabricItemSettings());

    public void onInitialize() {
        Registry.register(Registries.ITEM, new Identifier("vineboom", "vine_boom_item"), VINE_BOOM_ITEM);
    }
}
