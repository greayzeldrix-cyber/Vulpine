package net.greayzeldrix.vulpine.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.greayzeldrix.vulpine.Vulpine;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item FOXIUM = reisterItem("foxium", new Item(new Item.Settings()));


    private static Item reisterItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Vulpine.MODID), item);
    }

    public static void registerModItems() {
        Vulpine.LOGGER.info("Registering Mod Items for " + Vulpine.MODID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(FOXIUM);
        });
    }
}
