# NoiseAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.noisegenerators | Implements: JsonAssetWithMap

public abstract class NoiseAsset implements JsonAssetWithMap

## Fields

- public static final AssetCodecMapCodec<String,NoiseAsset> CODEC
- public static final Codec<String> CHILD_ASSET_CODEC
- public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
- public static final BuilderCodec<NoiseAsset> ABSTRACT_CODEC
- private String id
- private AssetExtraInfo.Data data

## Methods

- public abstract NoiseField build(SeedBox var1)
- public String getId()

Known subclasses: CellNoiseAsset, SimplexNoiseAsset

Also in this package: CellNoiseAsset, SimplexNoiseAsset

Complete API:
  public abstract NoiseField build(SeedBox var1)
  public String getId()

Fields:
public static final AssetCodecMapCodec<String,NoiseAsset> CODEC
public static final Codec<String> CHILD_ASSET_CODEC
public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
public static final BuilderCodec<NoiseAsset> ABSTRACT_CODEC
private String id
private AssetExtraInfo.Data data
