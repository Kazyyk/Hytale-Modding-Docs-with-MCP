# DistanceFunctionAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.density.positions.distancefunctions | Implements: JsonAssetWithMap

public abstract class DistanceFunctionAsset implements JsonAssetWithMap

## Fields

- public static final AssetCodecMapCodec<String,DistanceFunctionAsset> CODEC
- public static final Codec<String> CHILD_ASSET_CODEC
- public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
- public static final BuilderCodec<DistanceFunctionAsset> ABSTRACT_CODEC
- private String id
- private AssetExtraInfo.Data data

## Methods

- public abstract DistanceFunction build(SeedBox var1, double var2)
- public String getId()

Known subclasses: EuclideanDistanceFunctionAsset, ManhattanDistanceFunctionAsset

Also in this package: EuclideanDistanceFunctionAsset, ManhattanDistanceFunctionAsset

Complete API:
  public abstract DistanceFunction build(SeedBox var1, double var2)
  public String getId()

Fields:
public static final AssetCodecMapCodec<String,DistanceFunctionAsset> CODEC
public static final Codec<String> CHILD_ASSET_CODEC
public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
public static final BuilderCodec<DistanceFunctionAsset> ABSTRACT_CODEC
private String id
private AssetExtraInfo.Data data
