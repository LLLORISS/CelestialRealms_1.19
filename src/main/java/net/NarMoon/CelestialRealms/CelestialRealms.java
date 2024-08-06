package net.NarMoon.CelestialRealms;
import com.mojang.logging.LogUtils;
import net.NarMoon.CelestialRealms.Block.BaseBlock;
import net.NarMoon.CelestialRealms.Item.ModItems;
import net.NarMoon.CelestialRealms.Item.SwordItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(CelestialRealms.MOD_ID)
public class CelestialRealms {
    public static final String MOD_ID = "celestialrealms";

    private static final Logger LOGGER = LogUtils.getLogger();

    public CelestialRealms() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        BaseBlock.BLOCKS.register(modEventBus);
        ModItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    public static final CreativeModeTab FOOD_TAB = new CreativeModeTab("celestialrealms.food") {
        @Override
        public ItemStack makeIcon() {
            return ModItems.Tangerine.get().getDefaultInstance();
        }
    };

    public static final CreativeModeTab BLOCKS_TAB = new CreativeModeTab("celestialrealms.blocks") {
        @Override
        public ItemStack makeIcon() {
            return BaseBlock.RubyOre.get().asItem().getDefaultInstance();
        }
    };

    public static final CreativeModeTab RES_TAB = new CreativeModeTab("celestialrealms.Resources") {
        @Override
        public ItemStack makeIcon() {
            return ModItems.Ruby.get().getDefaultInstance();
        }
    };

    public static final CreativeModeTab WEAPON_TAB = new CreativeModeTab("celestialrealms.Weapons") {
        @Override
        public ItemStack makeIcon() {
            return ModItems.RUBY_SWORD.get().getDefaultInstance();
        }
    };

    public static final CreativeModeTab TOOLS_TAB = new CreativeModeTab("celestialrealms.Tools") {
        @Override
        public ItemStack makeIcon(){
            return ModItems.RUBY_PICKAXE.get().getDefaultInstance();
        }
    };

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Common setup for {} started", CelestialRealms.MOD_ID);

        LOGGER.info("Common setup for {} finished", CelestialRealms.MOD_ID);
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
