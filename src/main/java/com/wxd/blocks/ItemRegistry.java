package com.wxd.blocks;

import com.wxd.blocks.item.FirstItem;
import com.wxd.blocks.item.SnowWhiteApple;
import com.wxd.blocks.item.VioletSword;
import com.wxd.ui.ModGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * 物品注冊對象
 * 物品注冊分三步：
 *          1.創建自己的物品類
 *          2.創建自己的物品注冊器并將物品注冊進去
 *          3.在mod的主類中實現調用正式的注冊方法
 */
public class ItemRegistry {
    //創建延遲注冊器（物品對象）
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "scaleworld");
    //物品對應的物品欄
    private static ItemGroup itemGroup = ModGroup.itemGroup;
    //物品注冊操作(放在物品欄中)
    public static RegistryObject<Item> firstItem = ITEMS.register("first_item", () -> {
        return new FirstItem();
    });
    public static RegistryObject<Item> snowWhiteApple = ITEMS.register("snow_white_apple", () -> {
        return new SnowWhiteApple();
    });
    public static RegistryObject<Item> obsidianSword = ITEMS.register("violet_sword", () -> {
        return new VioletSword();
    });
    public static RegistryObject<Item> obsidianBlock = ITEMS.register("obsidian_block", () -> {
        return new BlockItem(BlockRegistry.oilBlock.get(), new Item.Properties().group(ModGroup.itemGroup));
    });

}
