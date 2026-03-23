# RootInteractionPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction | Extends: AssetPacketGenerator<String, RootInteraction, IndexedLookupTableAssetMap<String, RootInteraction>>

public class RootInteractionPacketGenerator extends AssetPacketGenerator<String, RootInteraction, IndexedLookupTableAssetMap<String, RootInteraction>>

Generates `UpdateRootInteractions` packets for synchronizing `RootInteraction` assets to clients. Produces init, update, and remove packets mapping root interaction IDs to their indexed protocol representations.

## Key Methods

- generateInitPacket(IndexedLookupTableAssetMap, Map) | ToClientPacket | Creates an init packet with all root interactions
- generateUpdatePacket(IndexedLookupTableAssetMap, Map, AssetUpdateQuery) | ToClientPacket | Creates an add/update packet for changed root interactions
- generateRemovePacket(IndexedLookupTableAssetMap, Set, AssetUpdateQuery) | ToClientPacket | Creates a remove packet for deleted root interactions

Also in this package: Cooldown, CooldownHandler, InteractionPacketGenerator, UnarmedInteractions, UnarmedInteractionsPacketGenerator

Complete API:
  public ToClientPacket generateInitPacket(IndexedLookupTableAssetMap<String,RootInteraction> assetMap, Map<String,RootInteraction> assets)
  public ToClientPacket generateUpdatePacket(IndexedLookupTableAssetMap<String,RootInteraction> assetMap, Map<String,RootInteraction> loadedAssets, AssetUpdateQuery query)
  public ToClientPacket generateRemovePacket(IndexedLookupTableAssetMap<String,RootInteraction> assetMap, Set<String> removed, AssetUpdateQuery query)
