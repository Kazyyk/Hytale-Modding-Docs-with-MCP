# TagPatternPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.asset.type.tagpattern | Extends: SimpleAssetPacketGenerator

public class TagPatternPacketGenerator extends SimpleAssetPacketGenerator

## Methods

- @Nonnull public ToClientPacket generateInitPacket(IndexedLookupTableAssetMap<String,TagPattern> assetMap, Map<String,TagPattern> assets)
- @Nonnull public ToClientPacket generateUpdatePacket(IndexedLookupTableAssetMap<String,TagPattern> assetMap, Map<String,TagPattern> loadedAssets)
- @Nonnull public ToClientPacket generateRemovePacket(IndexedLookupTableAssetMap<String,TagPattern> assetMap, Set<String> removed)

Complete API:
  public ToClientPacket generateInitPacket(IndexedLookupTableAssetMap<String,TagPattern> assetMap, Map<String,TagPattern> assets)
  public ToClientPacket generateUpdatePacket(IndexedLookupTableAssetMap<String,TagPattern> assetMap, Map<String,TagPattern> loadedAssets)
  public ToClientPacket generateRemovePacket(IndexedLookupTableAssetMap<String,TagPattern> assetMap, Set<String> removed)
