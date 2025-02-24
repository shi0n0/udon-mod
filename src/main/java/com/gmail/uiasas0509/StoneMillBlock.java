package com.gmail.uiasas0509;

import com.gmail.uiasas0509.registry.UdonItems;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class StoneMillBlock extends Block {
    public StoneMillBlock(Properties properties){
        super(properties);
    }

    /*
    // 右クリックすると音が流れる
    @Override
    protected InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, BlockHitResult pHitResult) {
        pLevel.playSound(pPlayer, pPos, SoundEvents.AMETHYST_CLUSTER_PLACE, SoundSource.BLOCKS, 1f, 1f);
        return InteractionResult.SUCCESS;
    }
    */



    // 小麦をブロックの上面に乗せると小麦粉になる
    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        if(pEntity instanceof ItemEntity itemEntity){
            if(itemEntity.getItem().getItem() == Items.WHEAT){

                // 以下のItemStackの引数はマイクラのアイテムならItemStack(Items.EXAMPLE, itemEntity.getItem().getCount()));となり、
                // オリジナルのアイテムならItemStack(UdonItems.EXAMPLE.get(), 以下同文);となる
                itemEntity.setItem(new ItemStack(UdonItems.FLOUR.get(), itemEntity.getItem().getCount()));
            }
        }
        super.stepOn(pLevel, pPos, pState, pEntity);
    }
}
