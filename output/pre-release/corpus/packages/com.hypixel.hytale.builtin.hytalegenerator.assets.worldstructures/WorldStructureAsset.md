# WorldStructureAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.worldstructures | Implements: Cleanable, JsonAssetWithMap

public abstract class WorldStructureAsset implements Cleanable, JsonAssetWithMap

## Fields

- public static final AssetCodecMapCodec<String,WorldStructureAsset> CODEC
- public static final Codec<String> CHILD_ASSET_CODEC
- public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
- public static final BuilderCodec<WorldStructureAsset> ABSTRACT_CODEC
- private String id
- private AssetExtraInfo.Data data

## Methods

- @Nullable public abstract WorldStructure build(WorldStructureAsset.Argument var1)
- @Nonnull public abstract PositionProviderAsset getSpawnPositionsAsset()
- public String getId()
- @Override public void cleanUp()

## Inner Types

- `WorldStructureAsset.Argument`

Known subclasses: BasicWorldStructureAsset

Also in this package: Argument

Complete API:
  public abstract WorldStructure build(WorldStructureAsset.Argument var1)
  public abstract PositionProviderAsset getSpawnPositionsAsset()
  public String getId()
  public void cleanUp()

Fields:
public static final AssetCodecMapCodec<String,WorldStructureAsset> CODEC
public static final Codec<String> CHILD_ASSET_CODEC
public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
public static final BuilderCodec<WorldStructureAsset> ABSTRACT_CODEC
private String id
private AssetExtraInfo.Data data
