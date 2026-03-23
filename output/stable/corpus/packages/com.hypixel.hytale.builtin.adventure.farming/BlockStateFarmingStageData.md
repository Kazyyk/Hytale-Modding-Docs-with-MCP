# BlockStateFarmingStageData

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.config.stages | Extends: FarmingStageData

public class BlockStateFarmingStageData extends FarmingStageData

A farming stage that transitions a block to a different block state (variant of the same block type). Resolves the target state via `BlockType.getBlockForState(state)` and replaces the block in the world chunk.

## Codec Fields

state (String)

## Key Methods

- public void apply(@Nonnull ComponentAccessor<ChunkStore> commandBuffer, @Nonnull Ref<ChunkStore> sectionRef, @Nonnull Ref<ChunkStore> blockRef, int x, int y, int z, @Nullable FarmingStageData previousStage)
