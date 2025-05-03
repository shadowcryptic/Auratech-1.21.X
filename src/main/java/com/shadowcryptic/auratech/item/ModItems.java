package com.shadowcryptic.auratech.item;

import com.shadowcryptic.auratech.Auratech;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Auratech.MOD_ID);

    public static final DeferredItem<Item> CRYSTAL_SNIFFER = ITEMS.register("crystal_sniffer", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INFUSED_LEAF = ITEMS.register("infused_leaf", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> VERDANT_SHARD = ITEMS.register("verdant_shard", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AURA_CORE = ITEMS.register("aura_core", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
