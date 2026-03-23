# BlockMaskEntryAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.blockmask | Implements: JsonAssetWithMap<String, DefaultAssetMap<String, BlockMaskEntryAsset>>, Cleanable

public class BlockMaskEntryAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, BlockMaskEntryAsset>>, Cleanable

Implementation of `JsonAssetWithMap<String, DefaultAssetMap<String, BlockMaskEntryAsset>>, Cleanable`.

## Fields

- id | String | String field.
- data | AssetExtraInfo.Data | AssetExtraInfo.Data field.

## Constructors

- BlockMaskEntryAsset() | Creates a new BlockMaskEntryAsset instance.

## Methods

- getPropBlockSet(@Nonnull MaterialCache materialCache) | MaterialSet | public method.
- getReplacesBlockSet(@Nonnull MaterialCache materialCache) | MaterialSet | public method.
- getId() | String | public method.
- cleanUp() | void | public method.

Also in this package: BlockMaskAsset, Exported

Complete API:
  public MaterialSet getPropBlockSet(MaterialCache materialCache)
  public MaterialSet getReplacesBlockSet(MaterialCache materialCache)
  public String getId()
  public void cleanUp()

Fields:
public static final AssetBuilderCodec<String,BlockMaskEntryAsset> CODEC
private String id
private AssetExtraInfo.Data data
private MaterialSetAsset propBlockSet
private MaterialSetAsset replacesBlockSet
