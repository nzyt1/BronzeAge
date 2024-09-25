package com.chunqiuxu.bronzeage.content.items;

import com.chunqiuxu.bronzeage.content.blocks.BlockRegistry;
import com.jcraft.jorbis.Block;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.chunqiuxu.bronzeage.BronzeAge.MODID;

public class ItemRegistry {
    // Create a Deferred Register to hold Items which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    // Create Tin Ore Block Item.
    public static final RegistryObject<Item> TIN_ORE_BLOCK_ITEM = ITEMS.register("tin_ore_block_item",
            () -> new BlockItem(BlockRegistry.TIN_ORE_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> ALU_ORE_BLOCK_ITEM = ITEMS.register("alu_ore_block_item",
            () -> new BlockItem(BlockRegistry.ALU_ORE_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> LEAD_ORE_BLOCK_ITEM = ITEMS.register("lead_ore_block_item",
            () -> new BlockItem(BlockRegistry.LEAD_ORE_BLOCK.get(), new Item.Properties()));


    // Create a Deferred Register to hold CreativeModeTabs which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    // Creates a creative tab with the id "examplemod:example_tab" for the example item, that is placed after the combat tab
    public static final RegistryObject<CreativeModeTab> BRONZE_AGE_TAB = CREATIVE_MODE_TABS.register("example_tab",
            () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ItemRegistry.TIN_ORE_BLOCK_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ItemRegistry.TIN_ORE_BLOCK_ITEM.get()); // Add the example item to the tab. For your own tabs, this method is preferred over the event
            }).build());



    // Add the example block item to the building blocks tab
    public static void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(TIN_ORE_BLOCK_ITEM);
            event.accept(ALU_ORE_BLOCK_ITEM);
            event.accept(LEAD_ORE_BLOCK_ITEM);
        }
    }
}
