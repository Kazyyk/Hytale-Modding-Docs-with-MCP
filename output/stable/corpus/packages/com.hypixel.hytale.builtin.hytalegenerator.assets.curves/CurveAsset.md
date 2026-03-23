# CurveAsset

Type: abstract class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.curves | Implements: JsonAssetWithMap<String, DefaultAssetMap<String, CurveAsset>>, Cleanable

public abstract class CurveAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, CurveAsset>>, Cleanable

## Fields

- private static final CurveAsset[] EMPTY_INPUTS
- private static final Map<String, CurveAsset> exportedNodes
- private String id
- private AssetExtraInfo.Data data
- private String exportName

## Methods

- public abstract Double2DoubleFunction build()
- public static CurveAsset getExportedAsset(@Nonnull String name)
- public String getId()

Known subclasses: CeilingCurveAsset, ClampCurveAsset, ConstantCurveAsset, DistanceExponentialCurveAsset, DistanceSCurveAsset, FloorCurveAsset, ImportedCurveAsset, InverterCurveAsset, ManualCurveAsset, MaxCurveAsset, MinCurveAsset, MultiplierCurveAsset, NotCurveAsset, SmoothCeilingCurveAsset, SmoothClampCurveAsset, SmoothFloorCurveAsset, SmoothMaxCurveAsset, SmoothMinCurveAsset, SumCurveAsset

Also in this package: CeilingCurveAsset, ClampCurveAsset, ConstantCurveAsset, DistanceExponentialCurveAsset, DistanceSCurveAsset, FloorCurveAsset, ImportedCurveAsset, InverterCurveAsset, MaxCurveAsset, MinCurveAsset, MultiplierCurveAsset, NotCurveAsset, SmoothCeilingCurveAsset, SmoothClampCurveAsset, SmoothFloorCurveAsset, SmoothMaxCurveAsset, SmoothMinCurveAsset, SumCurveAsset

Complete API:
  public abstract Double2DoubleFunction build()
  public static CurveAsset getExportedAsset(String name)
  public String getId()

Fields:
private static final CurveAsset[] EMPTY_INPUTS
public static final AssetCodecMapCodec<String,CurveAsset> CODEC
private static final Map<String,CurveAsset> exportedNodes
public static final Codec<String> CHILD_ASSET_CODEC
public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
public static final BuilderCodec<CurveAsset> ABSTRACT_CODEC
private String id
private AssetExtraInfo.Data data
private String exportName
