package com.wxd.blocks;

import com.wxd.blocks.block.OilBlock;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "scaleworld");
    public static RegistryObject<Block> oilBlock = BLOCKS.register("obsidian_block", () -> {
        return new OilBlock();
    });
}
