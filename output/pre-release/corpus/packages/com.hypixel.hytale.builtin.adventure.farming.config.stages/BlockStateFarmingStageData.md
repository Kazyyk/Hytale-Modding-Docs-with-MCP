# BlockStateFarmingStageData

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.config.stages | Extends: FarmingStageData

public class BlockStateFarmingStageData extends FarmingStageData

Farming stage that transitions a block to a named block state variant of the same block type. Resolves the target via `BlockType.getBlockForState(state)`.

Also in this package: BlockTypeFarmingStageData, PrefabFarmingStageData, PrefabStage

Complete API:
  public String getState()
  public void apply(ComponentAccessor<ChunkStore> commandBuffer, Ref<ChunkStore> sectionRef, Ref<ChunkStore> blockRef, int x, int y, int z, FarmingStageData previousStage)
  public String toString()

Fields:
private static final HytaleLogger LOGGER
public static final BuilderCodec<BlockStateFarmingStageData> CODEC
protected String state
