package net.NarMoon.CelestialRealms.Item;


import net.NarMoon.CelestialRealms.Block.BaseBlock;
import net.NarMoon.CelestialRealms.CelestialRealms;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CelestialRealms.MOD_ID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
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

}
