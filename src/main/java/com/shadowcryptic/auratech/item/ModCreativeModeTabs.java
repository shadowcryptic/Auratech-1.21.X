package com.shadowcryptic.auratech.item;

import com.shadowcryptic.auratech.Auratech;
import com.shadowcryptic.auratech.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Auratech.MOD_ID);

    public static final Supplier<CreativeModeTab> AURATECH_TAB = CREATIVE_MODE_TAB.register("auratech_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack((ModItems.CRYSTAL_SNIFFER.get())))
                    .title(Component.translatable("creativetab.auratech.auratech"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CRYSTAL_SNIFFER);
                        output.accept(ModItems.INFUSED_LEAF);
                        output.accept(ModItems.VERDANT_SHARD);
                        output.accept(ModItems.AURA_CORE);
                        output.accept(ModBlocks.AURA_CONDENSER);
                    }).build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
