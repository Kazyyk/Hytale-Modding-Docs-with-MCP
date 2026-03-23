# BlockTypeFarmingStageData

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.config.stages | Extends: FarmingStageData

public class BlockTypeFarmingStageData extends FarmingStageData

Farming stage that replaces the current block with an entirely different block type identified by name.

Also in this package: BlockStateFarmingStageData, PrefabFarmingStageData, PrefabStage

Complete API:
  public String getBlock()
  public void apply(ComponentAccessor<ChunkStore> commandBuffer, Ref<ChunkStore> sectionRef, Ref<ChunkStore> blockRef, int x, int y, int z, FarmingStageData previousStage)
  public String toString()

Fields:
private static final HytaleLogger LOGGER
public static final BuilderCodec<BlockTypeFarmingStageData> CODEC
protected String block
