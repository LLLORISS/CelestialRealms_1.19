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
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

import static net.NarMoon.CelestialRealms.Item.ModItems.ITEMS;

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

    public static class CustomTiers{
        public static final Tier RUBY_TIER = TierSortingRegistry.registerTier(new ForgeTier(
                2,
                500,
                7.0F,
                3.0F,
                15,
                BlockTags.NEEDS_IRON_TOOL,
                () -> Ingredient.of(ModItems.Ruby.get())),
                new ResourceLocation(CelestialRealms.MOD_ID, "ruby"),
                List.of(Tiers.IRON),
                List.of());
    };
}
