package com.avis.uncraftable;

import com.avis.uncraftable.item.ModCreativeModeTabs;
import com.avis.uncraftable.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Uncraftable.MOD_ID)
public class Uncraftable {

    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "uncraftable";

    public Uncraftable() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::setup);

        modEventBus.addListener(this::addCreative);

        ModItems.register(modEventBus);

        ModCreativeModeTabs.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == ModCreativeModeTabs.TUTORIAL_TAB.get()) {
            event.accept(ModItems.MALICIOUS_EGG);
            event.accept(ModItems.MYSTICAL_EGG);
        }
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }
}