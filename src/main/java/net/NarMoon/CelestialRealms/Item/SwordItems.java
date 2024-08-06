package net.NarMoon.CelestialRealms.Item;

import net.NarMoon.CelestialRealms.CelestialRealms;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class SwordItems extends SwordItem{
    public SwordItems(Tier tier, int attackDamageModifier, float attackSpeedModifier, Properties properties) {
        super(tier, attackDamageModifier, attackSpeedModifier, properties);
    }

    public static class Builder {
        private Tier tier;
        private int attackDamageModifier;
        private float attackSpeedModifier;
        private Item.Properties properties = new Item.Properties().tab(CelestialRealms.WEAPON_TAB);

        public Builder setTier(Tier tier) {
            this.tier = tier;
            return this;
        }

        public Builder setAttackDamageModifier(int attackDamageModifier) {
            this.attackDamageModifier = attackDamageModifier;
            return this;
        }

        public Builder setAttackSpeedModifier(float attackSpeedModifier) {
            this.attackSpeedModifier = attackSpeedModifier;
            return this;
        }

        public Builder setProperties(Item.Properties properties) {
            this.properties = properties;
            return this;
        }

        public SwordItems build() {
            return new SwordItems(tier, attackDamageModifier, attackSpeedModifier, properties);
        }
    }
}
