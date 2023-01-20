package net.pigmanbruh.vineboom.item;

import net.pigmanbruh.vineboom.Main;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.util.Identifier;

public class moditems implements ModInitializer {
 
    // an instance of our new item
    public static final Item VINE_BOOM = new Item(new FabricItemSettings());
 
    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "vine_boom"), VINE_BOOM);
    }
}
