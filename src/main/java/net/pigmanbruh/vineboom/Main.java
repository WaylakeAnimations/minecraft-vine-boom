package net.pigmanbruh.vineboom;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.pigmanbruh.vineboom.item.Moditems;

public class Main implements ModInitializer {
    public static final String MOD_ID = "vineboom";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        Moditems.registerModItems();
        ModItems.registerItemGroups();
    }
}
