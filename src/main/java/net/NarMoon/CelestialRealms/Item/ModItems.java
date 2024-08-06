package net.NarMoon.CelestialRealms.Item;


import net.NarMoon.CelestialRealms.CelestialRealms;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;
import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CelestialRealms.MOD_ID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }



    public static class CustomTiers {
        public static final Tier RUBY_TIER = new ForgeTier(
                2,
                500,
                1.3F,
                3.0F,
                15,
                BlockTags.NEEDS_IRON_TOOL,
                () -> Ingredient.of(ModItems.Ruby.get())
        );
    }

    public static final RegistryObject<Item> Tangerine = ITEMS.register("tangerine",
            () -> new EdibleItem(new FoodProperties.Builder()
                    .nutrition(3)
                    .saturationMod(0.2F)
                    .build()));

    public static final RegistryObject<Item> GreenApple = ITEMS.register("green_apple",
            () -> new EdibleItem(new FoodProperties.Builder()
                    .nutrition(4)
                    .saturationMod(0.3F)
                    .build()));

    public static final RegistryObject<Item> Ruby = ITEMS.register("ruby"
            , () -> new Item((new Item.Properties().tab(CelestialRealms.RES_TAB))));

    public static final RegistryObject<SwordItems> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItems.Builder()
                    .setTier(CustomTiers.RUBY_TIER)
                    .setAttackDamageModifier(3)
                    .setAttackSpeedModifier(1.2F)
                    .build());

    public static final RegistryObject<PickaxeItems> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            ()->new PickaxeItems.Builder()
                    .setTier(CustomTiers.RUBY_TIER)
                    .setAttackDamage(1)
                    .setAttackSpeed(0F)
                    .build());
}
