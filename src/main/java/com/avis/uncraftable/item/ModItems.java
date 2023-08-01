package com.avis.uncraftable.item;

import com.avis.uncraftable.Uncraftable;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Uncraftable.MOD_ID);

    public static final RegistryObject<Item> MYSTICAL_EGG = ITEMS.register("mystical_egg",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MALICIOUS_EGG = ITEMS.register("malicious_egg",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
