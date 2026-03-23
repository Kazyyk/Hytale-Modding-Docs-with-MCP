# BlockTypeListAsset

Type: class | Package: com.hypixel.hytale.server.core.asset.type.buildertool.config | Implements: JsonAssetWithMap<String, DefaultAssetMap<String, BlockTypeListAsset>>

public class BlockTypeListAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, BlockTypeListAsset>>

Asset that defines a named list of block type keys, used by builder tools to configure block palettes. Converts the block list into a `BlockPattern` for weighted random selection.

## Methods

- public static AssetStore<String, BlockTypeListAsset, DefaultAssetMap<String, BlockTypeListAsset>> getAssetStore()
- public static DefaultAssetMap<String, BlockTypeListAsset> getAssetMap()
- public BlockPattern getBlockPattern()
- public HashSet<String> getBlockTypeKeys()
- public String getId()
