package com.wxd.blocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OilBlock extends Block {
    public OilBlock() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(5));
    }
}
