# ItemQualityPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.modules.item | Extends: SimpleAssetPacketGenerator<String, ItemQuality, IndexedLookupTableAssetMap<String, ItemQuality>>

public class ItemQualityPacketGenerator extends SimpleAssetPacketGenerator<String, ItemQuality, IndexedLookupTableAssetMap<String, ItemQuality>>

## Methods

- @Nonnull public ToClientPacket generateInitPacket(@Nonnull IndexedLookupTableAssetMap<String, ItemQuality> assetMap, @Nonnull Map<String, ItemQuality> assets)
- @Nonnull protected ToClientPacket generateUpdatePacket(@Nonnull IndexedLookupTableAssetMap<String, ItemQuality> assetMap, @Nonnull Map<String, ItemQuality> loadedAssets)
- @Nonnull protected ToClientPacket generateRemovePacket(@Nonnull IndexedLookupTableAssetMap<String, ItemQuality> assetMap, @Nonnull Set<String> removed)
