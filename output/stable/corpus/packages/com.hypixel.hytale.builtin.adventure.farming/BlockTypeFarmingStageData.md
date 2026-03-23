# BlockTypeFarmingStageData

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.config.stages | Extends: FarmingStageData

public class BlockTypeFarmingStageData extends FarmingStageData

A farming stage that transitions a block to a completely different block type. Resolves the target block via `BlockType.getAssetMap().getIndex(block)` and replaces the block in the world chunk.

## Codec Fields

block (String)

## Key Methods

- public void apply(@Nonnull ComponentAccessor<ChunkStore> commandBuffer, @Nonnull Ref<ChunkStore> sectionRef, @Nonnull Ref<ChunkStore> blockRef, int x, int y, int z, @Nullable FarmingStageData previousStage)

Also in this package: BlockStateFarmingStageData, PrefabFarmingStageData, PrefabStage

Complete API:
  public String getBlock()
  public void apply(ComponentAccessor<ChunkStore> commandBuffer, Ref<ChunkStore> sectionRef, Ref<ChunkStore> blockRef, int x, int y, int z, FarmingStageData previousStage)
  public String toString()

Fields:
private static final HytaleLogger LOGGER
public static final BuilderCodec<BlockTypeFarmingStageData> CODEC
protected String block
