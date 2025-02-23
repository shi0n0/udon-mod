package com.gmail.uiasas0509.screen;

import com.gmail.uiasas0509.UdonMod;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, UdonMod.MOD_ID);

    public static void register(IEventBus eventBus){
        MENUS.register(eventBus);
    }
}
