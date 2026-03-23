# ReverbEffectPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.asset.type.reverbeffect | Extends: SimpleAssetPacketGenerator

public class ReverbEffectPacketGenerator extends SimpleAssetPacketGenerator

## Methods

- @Nonnull public ToClientPacket generateInitPacket(IndexedLookupTableAssetMap<String,ReverbEffect> assetMap, Map<String,ReverbEffect> assets)
- @Nonnull public ToClientPacket generateUpdatePacket(IndexedLookupTableAssetMap<String,ReverbEffect> assetMap, Map<String,ReverbEffect> loadedAssets)
- @Nonnull public ToClientPacket generateRemovePacket(IndexedLookupTableAssetMap<String,ReverbEffect> assetMap, Set<String> removed)

Complete API:
  public ToClientPacket generateInitPacket(IndexedLookupTableAssetMap<String,ReverbEffect> assetMap, Map<String,ReverbEffect> assets)
  public ToClientPacket generateUpdatePacket(IndexedLookupTableAssetMap<String,ReverbEffect> assetMap, Map<String,ReverbEffect> loadedAssets)
  public ToClientPacket generateRemovePacket(IndexedLookupTableAssetMap<String,ReverbEffect> assetMap, Set<String> removed)
