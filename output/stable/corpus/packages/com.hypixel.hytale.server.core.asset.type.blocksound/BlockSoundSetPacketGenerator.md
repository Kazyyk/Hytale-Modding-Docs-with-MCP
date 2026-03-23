# BlockSoundSetPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.asset.type.blocksound | Extends: SimpleAssetPacketGenerator

public class BlockSoundSetPacketGenerator extends SimpleAssetPacketGenerator

## Methods

- @Nonnull public ToClientPacket generateInitPacket(IndexedLookupTableAssetMap<String,BlockSoundSet> assetMap, Map<String,BlockSoundSet> assets)
- @Nonnull public ToClientPacket generateUpdatePacket(IndexedLookupTableAssetMap<String,BlockSoundSet> assetMap, Map<String,BlockSoundSet> loadedAssets)
- @Nonnull public ToClientPacket generateRemovePacket(IndexedLookupTableAssetMap<String,BlockSoundSet> assetMap, Set<String> removed)

Complete API:
  public ToClientPacket generateInitPacket(IndexedLookupTableAssetMap<String,BlockSoundSet> assetMap, Map<String,BlockSoundSet> assets)
  public ToClientPacket generateUpdatePacket(IndexedLookupTableAssetMap<String,BlockSoundSet> assetMap, Map<String,BlockSoundSet> loadedAssets)
  public ToClientPacket generateRemovePacket(IndexedLookupTableAssetMap<String,BlockSoundSet> assetMap, Set<String> removed)
