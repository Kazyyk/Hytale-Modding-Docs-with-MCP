# RepulsionConfigPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.repulsion | Extends: AssetPacketGenerator<String, RepulsionConfig, IndexedLookupTableAssetMap<String, RepulsionConfig>>

public class RepulsionConfigPacketGenerator extends AssetPacketGenerator<String, RepulsionConfig, IndexedLookupTableAssetMap<String, RepulsionConfig>>

Generates `UpdateRepulsionConfig` packets for asset synchronization.

Also in this package: EntityTrackerRemove, EntityTrackerUpdate, PlayerSetup, Repulsion, RepulsionConfig, RepulsionSystems, RepulsionTicker

Complete API:
  public ToClientPacket generateInitPacket(IndexedLookupTableAssetMap<String,RepulsionConfig> assetMap, Map<String,RepulsionConfig> assets)
  public ToClientPacket generateUpdatePacket(IndexedLookupTableAssetMap<String,RepulsionConfig> assetMap, Map<String,RepulsionConfig> loadedAssets, AssetUpdateQuery query)
  public ToClientPacket generateRemovePacket(IndexedLookupTableAssetMap<String,RepulsionConfig> assetMap, Set<String> removed, AssetUpdateQuery query)
