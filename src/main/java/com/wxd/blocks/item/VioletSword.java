package com.wxd.blocks.item;

import com.wxd.blocks.ItemRegistry;
import com.wxd.ui.ModGroup;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;

public class VioletSword extends SwordItem {

    public VioletSword() {
        super(iItemTier, 3, -2.4F, new Item.Properties().group(ModGroup.itemGroup));
    }

    private static IItemTier iItemTier = new IItemTier() {
        @Override
        public int getMaxUses() {
            return 2000;
        }

        @Override
        public float getEfficiency() {
            return 10.0F;
        }

        @Override
        public float getAttackDamage() {
            return 4.0F;
        }

        @Override
        public int getHarvestLevel() {
            return 3;
        }

        @Override
        public int getEnchantability() {
            return 30;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromItems(ItemRegistry.firstItem.get());
        }
    };
}
