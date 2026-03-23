# BlockSetPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blockset | Extends: AssetPacketGenerator

public class BlockSetPacketGenerator extends AssetPacketGenerator<String, BlockSet, IndexedLookupTableAssetMap<String, BlockSet>>

Generates init, update, and remove network packets for `BlockSet` assets.

## Methods

- generateInitPacket(IndexedLookupTableAssetMap<String, BlockSet> assetMap, Map<String, BlockSet> assets) | ToClientPacket | Instance method.

Complete API:
  public ToClientPacket generateInitPacket(IndexedLookupTableAssetMap<String,BlockSet> assetMap, Map<String,BlockSet> assets)
  public ToClientPacket generateUpdatePacket(IndexedLookupTableAssetMap<String,BlockSet> assetMap, Map<String,BlockSet> loadedAssets, AssetUpdateQuery query)
  public ToClientPacket generateRemovePacket(IndexedLookupTableAssetMap<String,BlockSet> assetMap, Set<String> removed, AssetUpdateQuery query)
