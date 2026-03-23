# BlockMaskAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.blockmask | Implements: JsonAssetWithMap<String, DefaultAssetMap<String, BlockMaskAsset>>, Cleanable

public class BlockMaskAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, BlockMaskAsset>>, Cleanable

Implementation of `JsonAssetWithMap<String, DefaultAssetMap<String, BlockMaskAsset>>, Cleanable`.

## Fields

- id | String | String field.
- data | AssetExtraInfo.Data | AssetExtraInfo.Data field.
- exportName | String | String field.
- importName | String | String field.
- blockMaskEntries | BlockMaskEntryAsset[] | BlockMaskEntryAsset[] field.

## Methods

- build(@Nonnull MaterialCache materialCache) | BlockMask | public method.
- getId() | String | public method.
- cleanUp() | void | public method.

Also in this package: BlockMaskEntryAsset, Exported

Complete API:
  public BlockMask build(MaterialCache materialCache)
  public String getId()
  public void cleanUp()

Fields:
private static final Map<String,BlockMaskAsset.Exported> exportedNodes
public static final AssetBuilderCodec<String,BlockMaskAsset> CODEC
private String id
private AssetExtraInfo.Data data
protected String exportName
protected String importName
private MaterialSetAsset dontPlaceMaterialSetAsset
private MaterialSetAsset dontReplaceMaterialSetAsset
private BlockMaskEntryAsset[] blockMaskEntries
