# UnarmedInteractionsPacketGenerator

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction | Extends: DefaultAssetPacketGenerator<String, UnarmedInteractions>

public class UnarmedInteractionsPacketGenerator extends DefaultAssetPacketGenerator<String, UnarmedInteractions>

Generates `UpdateUnarmedInteractions` packets for synchronizing unarmed interaction configuration to clients. Reads from the `"Empty"` unarmed interaction asset and maps `InteractionType` to indexed `RootInteraction` references.

## Key Methods

- generateInitPacket(DefaultAssetMap, Map) | ToClientPacket | Creates an init packet with the default unarmed interactions
- generateUpdatePacket(Map) | ToClientPacket | Creates an add/update packet for changed unarmed interactions
- generateRemovePacket(Set) | ToClientPacket | Creates a remove packet

Also in this package: Cooldown, CooldownHandler, InteractionPacketGenerator, RootInteractionPacketGenerator, UnarmedInteractions

Complete API:
  public ToClientPacket generateInitPacket(DefaultAssetMap<String,UnarmedInteractions> assetMap, Map<String,UnarmedInteractions> assets)
  public ToClientPacket generateUpdatePacket(Map<String,UnarmedInteractions> loadedAssets)
  public ToClientPacket generateRemovePacket(Set<String> removed)
