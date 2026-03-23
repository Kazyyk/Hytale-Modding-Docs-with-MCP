# EntityStatTypePacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.modules.entitystats | Extends: SimpleAssetPacketGenerator<String, EntityStatType, IndexedLookupTableAssetMap<String, EntityStatType>>

public class EntityStatTypePacketGenerator extends SimpleAssetPacketGenerator<String, EntityStatType, IndexedLookupTableAssetMap<String, EntityStatType>>

Generates `UpdateEntityStatTypes` packets for client synchronization of entity stat type assets. Produces init, update, and remove packets mapping stat indices to their protocol representations.

## Methods

- generateInitPacket(IndexedLookupTableAssetMap, Map) | ToClientPacket | Creates an `Init` packet with all stat types and the max ID.
- generateUpdatePacket(IndexedLookupTableAssetMap, Map) | ToClientPacket | Creates an `AddOrUpdate` packet for changed stat types.
- generateRemovePacket(IndexedLookupTableAssetMap, Set) | ToClientPacket | Creates a `Remove` packet for deleted stat types.

Also in this package: DefaultEntityStatTypes, EntityStatEffects, EntityStatType, RegenType, Regenerating

Complete API:
  public ToClientPacket generateInitPacket(IndexedLookupTableAssetMap<String,EntityStatType> assetMap, Map<String,EntityStatType> assets)
  public ToClientPacket generateUpdatePacket(IndexedLookupTableAssetMap<String,EntityStatType> assetMap, Map<String,EntityStatType> loadedAssets)
  public ToClientPacket generateRemovePacket(IndexedLookupTableAssetMap<String,EntityStatType> assetMap, Set<String> removed)
