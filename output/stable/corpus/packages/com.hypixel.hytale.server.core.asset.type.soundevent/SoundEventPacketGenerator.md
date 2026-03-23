# SoundEventPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.asset.type.soundevent | Extends: SimpleAssetPacketGenerator

public class SoundEventPacketGenerator extends SimpleAssetPacketGenerator

## Methods

- @Nonnull public ToClientPacket generateInitPacket(IndexedLookupTableAssetMap<String,SoundEvent> assetMap, Map<String,SoundEvent> assets)
- @Nonnull public ToClientPacket generateUpdatePacket(IndexedLookupTableAssetMap<String,SoundEvent> assetMap, Map<String,SoundEvent> loadedAssets)
- @Nonnull public ToClientPacket generateRemovePacket(IndexedLookupTableAssetMap<String,SoundEvent> assetMap, Set<String> removed)

Complete API:
  public ToClientPacket generateInitPacket(IndexedLookupTableAssetMap<String,SoundEvent> assetMap, Map<String,SoundEvent> assets)
  public ToClientPacket generateUpdatePacket(IndexedLookupTableAssetMap<String,SoundEvent> assetMap, Map<String,SoundEvent> loadedAssets)
  public ToClientPacket generateRemovePacket(IndexedLookupTableAssetMap<String,SoundEvent> assetMap, Set<String> removed)
