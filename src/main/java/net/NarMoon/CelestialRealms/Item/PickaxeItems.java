package net.NarMoon.CelestialRealms.Item;

import net.NarMoon.CelestialRealms.CelestialRealms;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class PickaxeItems extends PickaxeItem {
    public PickaxeItems(Tier tier, int attackDamage, float attackSpeed, Item.Properties properties){
        super(tier,attackDamage,attackSpeed,properties);
    }

    public static class Builder{
        private Tier tier;
        private int attackDamage;
        private float attackSpeed;
        private Item.Properties properties = new Item.Properties().tab(CelestialRealms.TOOLS_TAB);

        public Builder setTier(Tier tier) {
            this.tier = tier;
            return this;
        }

        public Builder setAttackDamage(int attackDamage) {
            this.attackDamage = attackDamage;
            return this;
        }

        public Builder setAttackSpeed(float attackSpeed) {
            this.attackSpeed = attackSpeed;
            return this;
        }

        public Builder setProperties(Item.Properties properties) {
            this.properties = properties;
            return this;
        }

        public PickaxeItems build() {
            return new PickaxeItems(tier, attackDamage, attackSpeed, properties);
        }
    }
}

