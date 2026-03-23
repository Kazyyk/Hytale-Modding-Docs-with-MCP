# ItemSoundSetPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.asset.type.itemsound | Extends: SimpleAssetPacketGenerator

public class ItemSoundSetPacketGenerator extends SimpleAssetPacketGenerator

## Methods

- @Nonnull public ToClientPacket generateInitPacket(IndexedLookupTableAssetMap<String,ItemSoundSet> assetMap, Map<String,ItemSoundSet> assets)
- @Nonnull public ToClientPacket generateUpdatePacket(IndexedLookupTableAssetMap<String,ItemSoundSet> assetMap, Map<String,ItemSoundSet> loadedAssets)
- @Nonnull public ToClientPacket generateRemovePacket(IndexedLookupTableAssetMap<String,ItemSoundSet> assetMap, Set<String> removed)

Complete API:
  public ToClientPacket generateInitPacket(IndexedLookupTableAssetMap<String,ItemSoundSet> assetMap, Map<String,ItemSoundSet> assets)
  public ToClientPacket generateUpdatePacket(IndexedLookupTableAssetMap<String,ItemSoundSet> assetMap, Map<String,ItemSoundSet> loadedAssets)
  public ToClientPacket generateRemovePacket(IndexedLookupTableAssetMap<String,ItemSoundSet> assetMap, Set<String> removed)
