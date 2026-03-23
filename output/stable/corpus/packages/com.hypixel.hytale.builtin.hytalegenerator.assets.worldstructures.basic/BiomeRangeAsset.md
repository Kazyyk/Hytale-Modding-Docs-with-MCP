# BiomeRangeAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.worldstructures.basic | Implements: JsonAssetWithMap<String, DefaultAssetMap<String, BiomeRangeAsset>>

public class BiomeRangeAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, BiomeRangeAsset>>

Implementation of `JsonAssetWithMap<String, DefaultAssetMap<String, BiomeRangeAsset>>`.

## Fields

- id | String | String field.
- data | AssetExtraInfo.Data | AssetExtraInfo.Data field.
- min | double | double field.
- max | double | double field.
- biomeAssetId | String | String field.

## Constructors

- BiomeRangeAsset() | Creates a new BiomeRangeAsset instance.

## Methods

- getRange() | DoubleRange | public method.
- getBiomeAsset() | BiomeAsset | public method.
- getBiomeAssetId() | String | public method.
- getId() | String | public method.

Also in this package: BasicWorldStructureAsset

Complete API:
  public DoubleRange getRange()
  public BiomeAsset getBiomeAsset()
  public String getBiomeAssetId()
  public String getId()

Fields:
public static final AssetBuilderCodec<String,BiomeRangeAsset> CODEC
private String id
private AssetExtraInfo.Data data
private double min
private double max
private String biomeAssetId
