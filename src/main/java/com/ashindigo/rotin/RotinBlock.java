package com.ashindigo.rotin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderLayer;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityContext;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.Random;

public class RotinBlock extends Block {

    private static final VoxelShape BOUNDING_SHAPE = Block.createCuboidShape(5.0D, 5.0D, 5.0D, 10.0D, 10.0D, 10.0D);

    RotinBlock(Settings block$Settings_1) {
        super(block$Settings_1);
    }

    public VoxelShape getOutlineShape(BlockState blockState_1, BlockView blockView_1, BlockPos blockPos_1, EntityContext entityContext_1) {
        return BOUNDING_SHAPE;
    }

    // Make some particles
    @Environment(EnvType.CLIENT)
    public void randomDisplayTick(BlockState blockState_1, World world_1, BlockPos blockPos_1, Random random_1) {
        double double_1 = (double)blockPos_1.getX() + 0.5D;
        double double_2 = (double)blockPos_1.getY() + 0.7D;
        double double_3 = (double)blockPos_1.getZ() + 0.5D;
        world_1.addParticle(ParticleTypes.FLAME, double_1, double_2, double_3, 0.0D, 0.0D, 0.0D);
    }

    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }
}
