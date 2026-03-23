# InteractionPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction | Extends: AssetPacketGenerator<String, Interaction, IndexedLookupTableAssetMap<String, Interaction>>

public class InteractionPacketGenerator extends AssetPacketGenerator<String, Interaction, IndexedLookupTableAssetMap<String, Interaction>>

Generates `UpdateInteractions` packets for synchronizing `Interaction` assets to clients. Produces init, update, and remove packets mapping interaction IDs to their indexed protocol representations.

## Key Methods

- generateInitPacket(IndexedLookupTableAssetMap, Map) | ToClientPacket | Creates an init packet with all interactions
- generateUpdatePacket(IndexedLookupTableAssetMap, Map, AssetUpdateQuery) | ToClientPacket | Creates an add/update packet for changed interactions
- generateRemovePacket(IndexedLookupTableAssetMap, Set, AssetUpdateQuery) | ToClientPacket | Creates a remove packet for deleted interactions

Also in this package: Cooldown, CooldownHandler, RootInteractionPacketGenerator, UnarmedInteractions, UnarmedInteractionsPacketGenerator

Complete API:
  public ToClientPacket generateInitPacket(IndexedLookupTableAssetMap<String,Interaction> assetMap, Map<String,Interaction> assets)
  public ToClientPacket generateUpdatePacket(IndexedLookupTableAssetMap<String,Interaction> assetMap, Map<String,Interaction> loadedAssets, AssetUpdateQuery query)
  public ToClientPacket generateRemovePacket(IndexedLookupTableAssetMap<String,Interaction> assetMap, Set<String> removed, AssetUpdateQuery query)
