# ItemReticleConfigPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.modules.item | Extends: SimpleAssetPacketGenerator<String, ItemReticleConfig, IndexedLookupTableAssetMap<String, ItemReticleConfig>>

public class ItemReticleConfigPacketGenerator extends SimpleAssetPacketGenerator<String, ItemReticleConfig, IndexedLookupTableAssetMap<String, ItemReticleConfig>>

## Methods

- @Nonnull public ToClientPacket generateInitPacket(@Nonnull IndexedLookupTableAssetMap<String, ItemReticleConfig> assetMap, @Nonnull Map<String, ItemReticleConfig> assets)
- @Nonnull public ToClientPacket generateUpdatePacket(@Nonnull IndexedLookupTableAssetMap<String, ItemReticleConfig> assetMap, @Nonnull Map<String, ItemReticleConfig> loadedAssets)
- @Nonnull public ToClientPacket generateRemovePacket(@Nonnull IndexedLookupTableAssetMap<String, ItemReticleConfig> assetMap, @Nonnull Set<String> removed)
