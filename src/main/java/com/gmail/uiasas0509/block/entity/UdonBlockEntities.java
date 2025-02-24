package com.gmail.uiasas0509.block.entity;

import com.gmail.uiasas0509.UdonMod;
import com.gmail.uiasas0509.block.custom.StoneMillBlock;
import com.gmail.uiasas0509.registry.UdonBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.swing.*;

public class UdonBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES  =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, UdonMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<StoneMillBlockEntity>> STONE_MILL_BE =
            BLOCK_ENTITIES.register("stone_mill_be", () -> BlockEntityType.Builder.of(StoneMillBlockEntity::new,
                    UdonBlocks.STONE_MILL.get()).build(null));

    public static void register(IEventBus eventBus)
    {
        BLOCK_ENTITIES.register(eventBus);
    }
}
