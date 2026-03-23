# AudioCategoryPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.asset.type.audiocategory | Extends: SimpleAssetPacketGenerator

public class AudioCategoryPacketGenerator extends SimpleAssetPacketGenerator

## Methods

- @Nonnull public ToClientPacket generateInitPacket(IndexedLookupTableAssetMap<String,AudioCategory> assetMap, Map<String,AudioCategory> assets)
- @Nonnull public ToClientPacket generateUpdatePacket(IndexedLookupTableAssetMap<String,AudioCategory> assetMap, Map<String,AudioCategory> loadedAssets)
- @Nonnull public ToClientPacket generateRemovePacket(IndexedLookupTableAssetMap<String,AudioCategory> assetMap, Set<String> removed)

Complete API:
  public ToClientPacket generateInitPacket(IndexedLookupTableAssetMap<String,AudioCategory> assetMap, Map<String,AudioCategory> assets)
  public ToClientPacket generateUpdatePacket(IndexedLookupTableAssetMap<String,AudioCategory> assetMap, Map<String,AudioCategory> loadedAssets)
  public ToClientPacket generateRemovePacket(IndexedLookupTableAssetMap<String,AudioCategory> assetMap, Set<String> removed)
