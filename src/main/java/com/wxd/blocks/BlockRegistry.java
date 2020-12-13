package com.wxd.blocks;

import com.wxd.blocks.block.OilBlock;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    //方塊注冊（配置文件对应 【modid】/blockstates/【方块名称.json】-》【modid】/models/models/【方块名称.json】-》【modid】/textures/【方块名称】）
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "scaleworld");
    public static RegistryObject<Block> oilBlock = BLOCKS.register("oil_block", OilBlock::new);
}
