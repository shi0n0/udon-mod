package com.gmail.uiasas0509.registry;

import com.gmail.uiasas0509.UdonMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class UdonBlocks {
    // レジストリを作成
    public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, UdonMod.MOD_ID);

    // レジストリに登録
    public static final RegistryObject<Block> STONE_MILL =
            registerBlockWithItem("stone_mill", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK)));

    // イベントバスに登録
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

    // ブロック・アイテムを作成
    private static <T extends Block> RegistryObject<T> registerBlockWithItem(String name, Supplier<T> supplier){
        RegistryObject<T>block = BLOCKS.register(name, supplier);
        UdonItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }
}
