# FarmingStageData

Type: abstract class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config.farming | Extends: java.lang.Object

Base class for farming stage definitions. Each stage has a `duration` range, optional sound event, and lifecycle methods: `apply()` (triggers when entering the stage), `remove()` (cleanup when leaving), and `shouldStop()` (conditional early termination). Uses a `CodecMapCodec` for polymorphic deserialization by `Type` key.

Known subclasses: BlockStateFarmingStageData, BlockTypeFarmingStageData, PrefabFarmingStageData, SpreadFarmingStageData

Also in this package: FarmingData, GrowthModifierAsset, SoilConfig

Complete API:
  public Rangef getDuration()
  public String getSoundEventId()
  public int getSoundEventIndex()
  public boolean implementsShouldStop()
  public boolean shouldStop(ComponentAccessor<ChunkStore> commandBuffer, Ref<ChunkStore> sectionRef, Ref<ChunkStore> blockRef, int x, int y, int z)
  public void apply(ComponentAccessor<ChunkStore> commandBuffer, Ref<ChunkStore> sectionRef, Ref<ChunkStore> blockRef, int x, int y, int z, FarmingStageData previousStage)
  public void remove(ComponentAccessor<ChunkStore> commandBuffer, Ref<ChunkStore> sectionRef, Ref<ChunkStore> blockRef, int x, int y, int z)
  public String toString()

Fields:
public static CodecMapCodec<FarmingStageData> CODEC
public static BuilderCodec<FarmingStageData> BASE_CODEC
protected Rangef duration
protected String soundEventId
protected transient int soundEventIndex
