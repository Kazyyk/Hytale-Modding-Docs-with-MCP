# EntityStatTypePacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.modules.entitystats.asset | Extends: SimpleAssetPacketGenerator<String, EntityStatType, IndexedLookupTableAssetMap<String, EntityStatType>>

public class EntityStatTypePacketGenerator extends SimpleAssetPacketGenerator<String, EntityStatType, IndexedLookupTableAssetMap<String, EntityStatType>>

Generates `UpdateEntityStatTypes` network packets for asset synchronization with clients. Supports three packet types: `Init` (full asset dump), `AddOrUpdate` (incremental), and `Remove` (deletions). Each entry maps its asset map index to the protocol representation via `EntityStatType.toPacket()`.

## Methods

- @Nonnull public ToClientPacket generateInitPacket(@Nonnull IndexedLookupTableAssetMap<String, EntityStatType> assetMap, @Nonnull Map<String, EntityStatType> assets)
- @Nonnull public ToClientPacket generateUpdatePacket(@Nonnull IndexedLookupTableAssetMap<String, EntityStatType> assetMap, @Nonnull Map<String, EntityStatType> loadedAssets)
- @Nonnull public ToClientPacket generateRemovePacket(@Nonnull IndexedLookupTableAssetMap<String, EntityStatType> assetMap, @Nonnull Set<String> removed)

Also in this package: DefaultEntityStatTypes, EntityStatEffects, EntityStatType, RegenType, Regenerating

Complete API:
  public ToClientPacket generateInitPacket(IndexedLookupTableAssetMap<String,EntityStatType> assetMap, Map<String,EntityStatType> assets)
  public ToClientPacket generateUpdatePacket(IndexedLookupTableAssetMap<String,EntityStatType> assetMap, Map<String,EntityStatType> loadedAssets)
  public ToClientPacket generateRemovePacket(IndexedLookupTableAssetMap<String,EntityStatType> assetMap, Set<String> removed)
