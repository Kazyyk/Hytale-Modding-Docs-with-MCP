# EnvironmentPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.asset.type.environment | Extends: AssetPacketGenerator

public class EnvironmentPacketGenerator extends AssetPacketGenerator

## Methods

- @Nonnull public ToClientPacket generateInitPacket(IndexedLookupTableAssetMap<String,Environment> assetMap, Map<String,Environment> assets)
- @Nonnull public ToClientPacket generateUpdatePacket(IndexedLookupTableAssetMap<String,Environment> assetMap, Map<String,Environment> loadedAssets, AssetUpdateQuery query)
- @Nonnull public ToClientPacket generateRemovePacket(IndexedLookupTableAssetMap<String,Environment> assetMap, Set<String> removed, AssetUpdateQuery query)
