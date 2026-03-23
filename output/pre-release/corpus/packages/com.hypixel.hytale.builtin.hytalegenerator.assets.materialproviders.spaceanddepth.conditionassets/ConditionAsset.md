# ConditionAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders.spaceanddepth.conditionassets | Implements: JsonAssetWithMap<String, DefaultAssetMap<String, ConditionAsset>>

public abstract class ConditionAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, ConditionAsset>>

Implementation of `JsonAssetWithMap<String, DefaultAssetMap<String, ConditionAsset>>`.

## Fields

- EMPTY_INPUTS | ConditionAsset[] | Static final ConditionAsset[] field.
- id | String | String field.
- data | AssetExtraInfo.Data | AssetExtraInfo.Data field.

## Constructors

- ConditionAsset() | Creates a new ConditionAsset instance.

## Methods

- build() | SpaceAndDepthMaterialProvider.Condition | public method.
- getId() | String | public method.

Known subclasses: AlwaysTrueConditionAsset, AndConditionAsset, EqualsConditionAsset, GreaterThanConditionAsset, NotConditionAsset, OrConditionAsset, SmallerThanConditionAsset

Also in this package: AlwaysTrueConditionAsset, AndConditionAsset, EqualsConditionAsset, GreaterThanConditionAsset, NotConditionAsset, OrConditionAsset, SmallerThanConditionAsset

Complete API:
  public abstract SpaceAndDepthMaterialProvider.Condition build()
  public String getId()

Fields:
private static final ConditionAsset[] EMPTY_INPUTS
public static final AssetCodecMapCodec<String,ConditionAsset> CODEC
public static final Codec<String> CHILD_ASSET_CODEC
public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
public static final BuilderCodec<ConditionAsset> ABSTRACT_CODEC
private String id
private AssetExtraInfo.Data data
