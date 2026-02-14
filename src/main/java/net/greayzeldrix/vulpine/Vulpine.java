package net.greayzeldrix.vulpine;

import net.fabricmc.api.ModInitializer;
import net.greayzeldrix.vulpine.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Vulpine implements ModInitializer {
    public static final String MODID = "vulpine";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
    }
}
