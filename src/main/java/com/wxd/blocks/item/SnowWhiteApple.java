package com.wxd.blocks.item;

import com.wxd.ui.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

import java.util.function.Supplier;

public class SnowWhiteApple extends BaseItem {

    private static Supplier <EffectInstance>  effectInstance = () -> new EffectInstance(Effects.POISON, 3 * 20, 1);
    private static Food food = (new Food.Builder())
            .saturation(10)
            .hunger(20)
            .effect(effectInstance, 1)
            .build();
    public SnowWhiteApple() {
        super(new Properties().food(food).group(ModGroup.itemGroup));
    }
}
