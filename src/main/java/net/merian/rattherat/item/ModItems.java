package net.merian.rattherat.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.merian.rattherat.RatTheRat;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item CHEESE = registerItem("cheese", new Item(new Item.Settings().food(ModFoodComponent.CHEESE)));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(CHEESE);
    }

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RatTheRat.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RatTheRat.LOGGER.info("Registering Mod Items for " + RatTheRat.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToIngredientTabItemGroup);
    }


}

