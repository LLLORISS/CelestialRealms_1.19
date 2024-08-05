package net.NarMoon.CelestialRealms.Block;


import net.NarMoon.CelestialRealms.CelestialRealms;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BaseBlock{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS
            , CelestialRealms.MOD_ID);

    public static final RegistryObject<Block> RubyOre = BLOCKS.register("ruby_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).friction(0.5f)));
}
