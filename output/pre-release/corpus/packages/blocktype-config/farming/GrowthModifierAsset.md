# GrowthModifierAsset

Type: abstract class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config.farming | Extends: java.lang.Object | Implements: JsonAssetWithMap<String, DefaultAssetMap<String, GrowthModifierAsset>>

Asset-registered growth modifier for farming. Each modifier has a `modifier` multiplier (double) and a `getCurrentGrowthMultiplier()` method that subclasses can override for context-sensitive growth rates (e.g., based on adjacent blocks or light level).

Known subclasses: FertilizerGrowthModifierAsset, LightLevelGrowthModifierAsset, WaterGrowthModifierAsset

Also in this package: FarmingData, FarmingStageData, SoilConfig

Complete API:
  public static AssetStore<String,GrowthModifierAsset,DefaultAssetMap<String,GrowthModifierAsset>> getAssetStore()
  public static DefaultAssetMap<String,GrowthModifierAsset> getAssetMap()
  public String getId()
  public double getModifier()
  public double getCurrentGrowthMultiplier(CommandBuffer<ChunkStore> commandBuffer, Ref<ChunkStore> sectionRef, Ref<ChunkStore> blockRef, int x, int y, int z, boolean initialTick)
  public String toString()

Fields:
public static final AssetCodecMapCodec<String,GrowthModifierAsset> CODEC
public static final Codec<String> CHILD_ASSET_CODEC
public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
public static final BuilderCodec<GrowthModifierAsset> ABSTRACT_CODEC
private static AssetStore<String,GrowthModifierAsset,DefaultAssetMap<String,GrowthModifierAsset>> ASSET_STORE
private AssetExtraInfo.Data data
protected String id
protected double modifier
