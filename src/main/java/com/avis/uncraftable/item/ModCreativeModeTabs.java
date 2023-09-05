package com.avis.uncraftable.item;

import com.avis.uncraftable.Uncraftable;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            Uncraftable.MOD_ID);

    public static RegistryObject<CreativeModeTab> UNCRAFTABLE_TAB = CREATIVE_MODE_TABS.register("uncraftable_tab", () ->
            CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MYSTICAL_EGG.get()))
                    .title(Component.translatable("itemGroup.uncraftable_tab")).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}