# GrowthModifierAsset

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype.config.farming | Implements: JsonAssetWithMap<String, DefaultAssetMap<String, GrowthModifierAsset>>

public abstract class GrowthModifierAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, GrowthModifierAsset>>

## Fields

- public static final AssetCodecMapCodec<String, GrowthModifierAsset> CODEC
- public static final Codec<String> CHILD_ASSET_CODEC
- public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
- public static final BuilderCodec<GrowthModifierAsset> ABSTRACT_CODEC
- private static AssetStore<String, GrowthModifierAsset, DefaultAssetMap<String, GrowthModifierAsset>> ASSET_STORE
- private AssetExtraInfo.Data data
- protected String id
- protected double modifier

## Constructors

- public GrowthModifierAsset()
- public GrowthModifierAsset(String id)

## Methods

- public static AssetStore<String, GrowthModifierAsset, DefaultAssetMap<String, GrowthModifierAsset>> getAssetStore()
- public static DefaultAssetMap<String, GrowthModifierAsset> getAssetMap()
- public String getId()
- public double getModifier()
- public double getCurrentGrowthMultiplier(@Nonnull CommandBuffer<ChunkStore> commandBuffer,
        @Nonnull Ref<ChunkStore> sectionRef,
        @Nonnull Ref<ChunkStore> blockRef,
        int x,
        int y,
        int z,
        boolean initialTick)` |
| `@Nonnull @Override public` | `String` | `toString()` |

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
