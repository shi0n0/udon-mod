package com.gmail.uiasas0509.registry;

import com.gmail.uiasas0509.UdonMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class UdonTabs
{
    // レジストリを作成
    public static final DeferredRegister<CreativeModeTab> TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UdonMod.MOD_ID);

    // タブを作成
    public static final RegistryObject<CreativeModeTab> UDON_TAB =
            TABS.register("udon_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("creativetabs.udon_tab")) //クリエイティブタブのタイトル
                    .icon(UdonItems.FLOUR.get()::getDefaultInstance) // クリエイティブタブのアイコン
                    .displayItems( // クリエイティブタブに表示するアイテム
                            (pParameters, pOutput) ->
                                {
                                    // ここでアイテムを追加
                                    pOutput.accept(UdonItems.FLOUR.get());
                                    pOutput.accept(UdonItems.DADHI.get());
                                    pOutput.accept(UdonItems.DRY_UDON.get());
                                    pOutput.accept(UdonItems.RICH_BUKKAKE_UDON.get());  // 高級ぶっかけ
                                    pOutput.accept(UdonItems.BUKKAKE_UDON.get());       // ぶっかけ
                                    pOutput.accept(UdonItems.COLD_UDON.get());          // 冷うどん
                                    pOutput.accept(UdonItems.RICH_COLD_UDON.get());     // 高級冷うどん
                                    pOutput.accept(UdonItems.CURRY_UDON.get());         // カレー
                                    pOutput.accept(UdonItems.RICH_CURRY_UDON.get());    // 高級カレー
                                    pOutput.accept(UdonItems.KITSUNE_UDON.get());       // きつねうどん
                                    pOutput.accept(UdonItems.RICH_KITSUNE_UDON.get());  // 高級きつねうどん
                                    pOutput.accept(UdonItems.ZARU_UDON.get());          // 冷うどん
                                    pOutput.accept(UdonItems.RICH_ZARU_UDON.get());     // 冷うどん
                                    pOutput.accept(UdonBlocks.STONE_MILL.get());        // 石臼
                                    pOutput.accept(UdonItems.DRIED_IWASHI.get());
                                    pOutput.accept(UdonItems.KATSUO.get());
                                    pOutput.accept(UdonItems.KATSUO_FLAKES.get());
                                    pOutput.accept(UdonItems.DRIED_KATSUO.get());
                                    pOutput.accept(UdonItems.ICED_UDON.get());
                                    pOutput.accept(UdonItems.IWASHI.get());
                                    pOutput.accept(UdonItems.RICH_DASHI.get());
                                    pOutput.accept(UdonItems.UDON_ROPE.get());
                                }
                            )
                    .withSearchBar()
                    .build());

    // レジストリをイベントバスに登録するためのメソッド
    public static void register(IEventBus eventBus)
    {
        TABS.register(eventBus);
    }
}

