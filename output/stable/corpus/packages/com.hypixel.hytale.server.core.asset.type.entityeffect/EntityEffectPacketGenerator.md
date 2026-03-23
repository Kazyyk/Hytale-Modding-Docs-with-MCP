# EntityEffectPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.asset.type.entityeffect | Extends: SimpleAssetPacketGenerator

public class EntityEffectPacketGenerator extends SimpleAssetPacketGenerator

## Methods

- @Nonnull public ToClientPacket generateInitPacket(IndexedLookupTableAssetMap<String,EntityEffect> assetMap, Map<String,EntityEffect> assets)
- @Nonnull protected ToClientPacket generateUpdatePacket(IndexedLookupTableAssetMap<String,EntityEffect> assetMap, Map<String,EntityEffect> loadedAssets)
- @Nonnull protected ToClientPacket generateRemovePacket(IndexedLookupTableAssetMap<String,EntityEffect> assetMap, Set<String> removed)

Complete API:
  public ToClientPacket generateInitPacket(IndexedLookupTableAssetMap<String,EntityEffect> assetMap, Map<String,EntityEffect> assets)
  protected ToClientPacket generateUpdatePacket(IndexedLookupTableAssetMap<String,EntityEffect> assetMap, Map<String,EntityEffect> loadedAssets)
  protected ToClientPacket generateRemovePacket(IndexedLookupTableAssetMap<String,EntityEffect> assetMap, Set<String> removed)
