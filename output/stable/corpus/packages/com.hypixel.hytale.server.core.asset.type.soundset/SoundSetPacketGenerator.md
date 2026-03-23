# SoundSetPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.asset.type.soundset | Extends: SimpleAssetPacketGenerator

public class SoundSetPacketGenerator extends SimpleAssetPacketGenerator

## Methods

- @Nonnull public ToClientPacket generateInitPacket(IndexedLookupTableAssetMap<String,SoundSet> assetMap, Map<String,SoundSet> assets)
- @Nonnull public ToClientPacket generateUpdatePacket(IndexedLookupTableAssetMap<String,SoundSet> assetMap, Map<String,SoundSet> loadedAssets)
- @Nonnull public ToClientPacket generateRemovePacket(IndexedLookupTableAssetMap<String,SoundSet> assetMap, Set<String> removed)
