package com.chunqiuxu.bronzeage.content.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.chunqiuxu.bronzeage.BronzeAge.MODID;

public class BlockRegistry{
    // Create a Deferred Register to hold Blocks which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    public static final RegistryObject<Block> TIN_ORE_BLOCK = BLOCKS.register("tin_ore_block",
            () -> new TinOreBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK)));

    public static final RegistryObject<Block> ALU_ORE_BLOCK = BLOCKS.register("alu_ore_block",
            () -> new AluOreBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK)));

    public static final RegistryObject<Block> LEAD_ORE_BLOCK = BLOCKS.register("lead_ore_block",
            () -> new LeadOreBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK)));

}
