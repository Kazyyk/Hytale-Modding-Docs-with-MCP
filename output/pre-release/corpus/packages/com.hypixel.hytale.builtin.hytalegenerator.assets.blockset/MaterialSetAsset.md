# MaterialSetAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.blockset | Implements: JsonAssetWithMap, DefaultAssetMap, MaterialSetAsset>>, Cleanable

public class MaterialSetAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, MaterialSetAsset>>, Cleanable

Asset configuration loaded from JSON data packs.

## Accessors

- getId() | String | Accessor method.

## Methods

- build(MaterialCache materialCache) | MaterialSet | Instance method.
- cleanUp() | void | Instance method.

Complete API:
  public MaterialSet build(MaterialCache materialCache)
  public String getId()
  public void cleanUp()

Fields:
public static final AssetBuilderCodec<String,MaterialSetAsset> CODEC
private String id
private AssetExtraInfo.Data data
private boolean inclusive
private MaterialAsset[] materialAssets
