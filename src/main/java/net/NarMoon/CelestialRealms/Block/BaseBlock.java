package net.NarMoon.CelestialRealms.Block;


import net.NarMoon.CelestialRealms.CelestialRealms;
import net.NarMoon.CelestialRealms.Item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;
import java.util.function.Supplier;

public class BaseBlock{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS
            , CelestialRealms.MOD_ID);

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier
            , Item.Properties properties){
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    };

    public static final RegistryObject<Block> RubyOre = register("ruby_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.0F, 15.0F).requiresCorrectToolForDrops())
            , new Item.Properties().tab(CelestialRealms.BLOCKS_TAB));

    public static final RegistryObject<Block> RubyBlock = register("ruby_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3.5F, 18.0F).requiresCorrectToolForDrops())
            , new Item.Properties().tab(CelestialRealms.BLOCKS_TAB));
}
