package com.wxd;

import com.wxd.blocks.BlockRegistry;
import com.wxd.blocks.ItemRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("scaleworld")
public class ScaleWorld {
    public ScaleWorld() {
        //將物品注冊器注冊進模組中
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        //將方塊注冊器注冊進模組中
        BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
