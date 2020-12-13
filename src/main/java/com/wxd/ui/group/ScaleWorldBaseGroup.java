package com.wxd.ui.group;

import com.wxd.blocks.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ScaleWorldBaseGroup extends ItemGroup {
    public ScaleWorldBaseGroup() {
        super("scale_world_group");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegistry.snowWhiteApple.get());
    }
}