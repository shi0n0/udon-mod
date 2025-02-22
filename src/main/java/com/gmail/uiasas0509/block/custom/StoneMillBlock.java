package com.gmail.uiasas0509.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class GemPolishingStationBlock extends BaseEntityBlock {
    // ブロックのサイズが(x, y, z) = (16, 16, 16)でない場合、以下で第1～第3引数を原点に、以降の引数でサイズを指定
    public static final VoxelShape SHAPE = Block.box(0, 0, 0, 16, 12, 16);

    public GemPolishingStationBlock(Properties pProperties) {
        super(pProperties);
    }

    // 上記のVoxelShapeに付随
    @Override
    protected VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return super.getShape(pState, pLevel, pPos, pContext);
    }
    // これを追加しないとブロックエンティティが見えない
    @Override
    public RenderShape getRenderShape(BlockState pState)
    {
        return RenderShape.MODEL;
    }

    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() {
        return null;
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return ;
    }


}
