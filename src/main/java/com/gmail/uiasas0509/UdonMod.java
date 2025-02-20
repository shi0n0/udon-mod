package com.gmail.uiasas0509;

import com.gmail.uiasas0509.registry.UdonItems;
import com.gmail.uiasas0509.registry.UdonTabs;
import com.mojang.logging.LogUtils;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.slf4j.Logger;


@Mod(UdonMod.MOD_ID)
public class UdonMod {

    public static final String MOD_ID = "udonmod";

    private static final Logger LOGGER = LogUtils.getLogger();

    public UdonMod(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        modEventBus.addListener(this::commonSetup);

        // レジストリをイベントバスに登録
        UdonItems.register(modEventBus);
        UdonTabs.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // クリエイティブタブに登録
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) // 材料タブに追加
        {
            event.accept(UdonItems.FLOUR);
            event.accept(UdonItems.DADHI);
            event.accept(UdonItems.DRY_UDON);


        }
        else if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS)
        {
            event.accept(UdonItems.BUKKAKE_UDON);
            event.accept(UdonItems.RICH_BUKKAKE_UDON);
            event.accept(UdonItems.CURRY_UDON);
            event.accept(UdonItems.RICH_CURRY_UDON);
            event.accept(UdonItems.COLD_UDON);
            event.accept(UdonItems.RICH_COLD_UDON);
            event.accept(UdonItems.KITSUNE_UDON);
            event.accept(UdonItems.RICH_KITSUNE_UDON);
            event.accept(UdonItems.ZARU_UDON);
            event.accept(UdonItems.RICH_ZARU_UDON);


        }
    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
