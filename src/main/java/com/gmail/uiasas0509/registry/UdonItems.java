package com.gmail.uiasas0509.registry;

import com.gmail.uiasas0509.UdonMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class UdonItems {
    // レジストリを作成
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, UdonMod.MOD_ID);

    // アイテムの作成・レジストリへ登録
    // 食料（材料）
    // 小麦粉
    public static final RegistryObject<Item> FLOUR =
            ITEMS.register("flour", () -> new Item(new Item.Properties()));
    // だしの素
    public static final RegistryObject<Item> DADHI =
            ITEMS.register("dashi", () -> new Item(new Item.Properties()));
    // 乾燥うどん
    public static final RegistryObject<Item> DRY_UDON =
            ITEMS.register("dry_udon", () -> new Item(new Item.Properties()));

    // 食料（食べ物）
    // ぶっかけうどん
    public static final RegistryObject<Item> BUKKAKE_UDON =
            ITEMS.register("bukkake_udon", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                            .nutrition(1) // 満腹度の設定
                            .saturationModifier(0.4f) // 隠し満腹度（満腹時以降の満腹度）
                            .alwaysEdible() // 満腹でも食べられる
                            .effect(new MobEffectInstance(MobEffects.REGENERATION, 100, 0), 1.0F)
                            .build())));
    // 高級ぶっかけうどん
    public static final RegistryObject<Item> RICH_BUKKAKE_UDON =
            ITEMS.register("rich_bukkake_udon", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(2) // 満腹度の設定
                    .saturationModifier(0.5f) // 隠し満腹度（満腹時以降の満腹度）
                    .alwaysEdible() // 満腹でも食べられる
                    .effect(new MobEffectInstance(MobEffects.HEAL, 1, 6), 1.0F)
                    .build())));

    // カレーうどん
    public static final RegistryObject<Item> CURRY_UDON =
            ITEMS.register("curry_udon", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(20) // 満腹度の設定
                    .saturationModifier(0.7f) // 隠し満腹度（満腹時以降の満腹度）
                    .build())));

    // 高級カレーうどん
    public static final RegistryObject<Item> RICH_CURRY_UDON =
            ITEMS.register("rich_curry_udon", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(20) // 満腹度の設定
                    .saturationModifier(0.7f) // 隠し満腹度（満腹時以降の満腹度）
                    .effect(new MobEffectInstance(MobEffects.REGENERATION, 300, 0), 1.0F)
                    .build())));

    // 冷うどん
    public static final RegistryObject<Item> COLD_UDON =
            ITEMS.register("cold_udon", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(5) // 満腹度の設定
                    .saturationModifier(0.4f) // 隠し満腹度（満腹時以降の満腹度）
                    .build())));

    // 高級冷うどん
    public static final RegistryObject<Item> RICH_COLD_UDON =
            ITEMS.register("rich_cold_udon", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(7) // 満腹度の設定
                    .saturationModifier(0.4f) // 隠し満腹度（満腹時以降の満腹度）

                    .build())));

    // きつねうどん
    public static final RegistryObject<Item> KITSUNE_UDON =
            ITEMS.register("rich_cold_udon", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(5) // 満腹度の設定
                    .saturationModifier(0.4f) // 隠し満腹度（満腹時以降の満腹度）
                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 1.0F) // 移動速度上昇
                    .build())));
    // 高級きつねうどん
    public static final RegistryObject<Item> RICH_KITSUNE_UDON =
            ITEMS.register("rich_cold_udon", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(7) // 満腹度の設定
                    .saturationModifier(0.4f) // 隠し満腹度（満腹時以降の満腹度）
                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1), 1.0F)
                    .build())));
    // レジストリをイベントバスに登録するためのメソッド
    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
