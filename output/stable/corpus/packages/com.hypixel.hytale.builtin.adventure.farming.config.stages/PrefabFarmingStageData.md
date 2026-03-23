# PrefabFarmingStageData

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.config.stages | Extends: FarmingStageData

public class PrefabFarmingStageData extends FarmingStageData

Farming stage that places or transitions a prefab structure. Supports weighted prefab selection, obstruction checking, rotation, replace masks by block tags, and removal of the previous prefab stage. Contains inner class `PrefabStage`.

Also in this package: BlockStateFarmingStageData, BlockTypeFarmingStageData, PrefabStage

Complete API:
  private static double computeParticlesRate(IPrefabBuffer prefab)
  private static boolean isPrefabBlockIntact(LocalCachedChunkAccessor chunkAccessor, int worldX, int worldY, int worldZ, int blockX, int blockY, int blockZ, int blockId, int rotation, PrefabRotation prefabRotation)
  private static boolean isPrefabIntact(IPrefabBuffer prefabBuffer, LocalCachedChunkAccessor chunkAccessor, int worldX, int worldY, int worldZ, PrefabRotation prefabRotation, FastRandom random)
  public IWeightedMap<PrefabFarmingStageData.PrefabStage> getPrefabStages()
  public void apply(ComponentAccessor<ChunkStore> commandBuffer, Ref<ChunkStore> sectionRef, Ref<ChunkStore> blockRef, int x, int y, int z, FarmingStageData previousStage)
  private boolean doesBlockObstruct(int blockId, int worldBlockId)
  private boolean canReplace(int worldBlockId, BlockTypeAssetMap<String,BlockType> assetMap)
  public void remove(ComponentAccessor<ChunkStore> commandBuffer, Ref<ChunkStore> sectionRef, Ref<ChunkStore> blockRef, int x, int y, int z)
  private IPrefabBuffer getCachedPrefab(int x, int y, int z, int generation)
  private void processConfig()
  public String toString()

Fields:
private static final HytaleLogger LOGGER
public static final float MIN_VOLUME_PREFAB
public static final float MAX_VOLUME_PREFAB
public static final float MIN_BROKEN_PARTICLE_RATE
public static final float MAX_BROKEN_PARTICLE_RATE
private static final String[] EMPTY_REPLACE_MASK
public static final BuilderCodec<PrefabFarmingStageData> CODEC
protected IWeightedMap<PrefabFarmingStageData.PrefabStage> prefabStages
private String[] replaceMaskTags
private int[] replaceMaskTagIndices
