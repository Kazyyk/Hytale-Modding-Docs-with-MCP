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
