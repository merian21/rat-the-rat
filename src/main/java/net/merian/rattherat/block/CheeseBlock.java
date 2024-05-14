package net.merian.rattherat.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CheeseBlock extends Block {
    public static final IntProperty SLICE = IntProperty.of("slice", 1, 4);

    public CheeseBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(SLICE, 1));
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext context) {
        return this.getDefaultState().with(SLICE, 1);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(SLICE);
    }
    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (!world.isClient) {
            // Check if the player is hungry
            if (player.getHungerManager().isNotFull()) {
                // Add food level and saturation
                player.getHungerManager().add(2, 0.3f); // Adjust these values as needed

                int bites = state.get(SLICE);
                if (bites < 4) {
                    world.setBlockState(pos, state.with(SLICE, bites + 1), 3);
                } else {
                    world.removeBlock(pos, false);
                }
                return ActionResult.SUCCESS;
            }
        }
        return ActionResult.PASS;
    }

}
