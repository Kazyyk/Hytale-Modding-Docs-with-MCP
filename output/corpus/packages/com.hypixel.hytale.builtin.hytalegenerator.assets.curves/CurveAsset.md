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
