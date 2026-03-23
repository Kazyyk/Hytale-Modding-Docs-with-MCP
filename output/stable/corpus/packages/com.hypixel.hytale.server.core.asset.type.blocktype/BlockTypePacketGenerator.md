# BlockTypePacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocktype | Extends: AssetPacketGenerator

public class BlockTypePacketGenerator extends AssetPacketGenerator<String, BlockType, BlockTypeAssetMap<String, BlockType>>

Generates `UpdateBlockTypes` network packets for synchronizing block type assets to clients. Maps block type string keys to integer indices via `BlockTypeAssetMap` and includes cache rebuild flags from `AssetUpdateQuery`.

## Methods

- generateInitPacket(@Nonnull BlockTypeAssetMap, @Nonnull Map) | ToClientPacket | Creates an `UpdateBlockTypes` init packet with all block types indexed by integer ID, plus max ID and full cache rebuild.
- generateUpdatePacket(@Nonnull BlockTypeAssetMap, @Nonnull Map, @Nonnull AssetUpdateQuery) | ToClientPacket | Creates an add/update packet with selective cache rebuild flags. Result is wrapped in `CachedPacket`.
- generateRemovePacket(@Nonnull BlockTypeAssetMap, @Nonnull Set, @Nonnull AssetUpdateQuery) | ToClientPacket | Creates a remove packet with block type stubs (name only). Wrapped in `CachedPacket`.

## Related Types

- `BlockType` -- the asset type this generator serializes
- `UpdateBlockTypes` -- the packet type produced
- `BlockTypeAssetMap` -- provides string-to-integer key mapping

Also in this package: BlockGroupPacketGenerator

Complete API:
  public ToClientPacket generateInitPacket(BlockTypeAssetMap<String,BlockType> assetMap, Map<String,BlockType> assets)
  public ToClientPacket generateUpdatePacket(BlockTypeAssetMap<String,BlockType> assetMap, Map<String,BlockType> loadedAssets, AssetUpdateQuery query)
  public ToClientPacket generateRemovePacket(BlockTypeAssetMap<String,BlockType> assetMap, Set<String> removed, AssetUpdateQuery query)
