# GamePacketHandler

Type: class | Package: com.hypixel.hytale.server.core.io.handlers.game | Extends: GenericPacketHandler | Implements: IPacketHandler

public class GamePacketHandler extends GenericPacketHandler implements IPacketHandler

The main packet handler for authenticated, in-game players. Registers handlers for all gameplay-related packets (movement, chat, interactions, windows, inventory, camera, machinima, world map, etc.). Maintains a reference to the player's `PlayerRef` and queues interaction packets for world-thread processing.

## Constructors

- public GamePacketHandler(Channel channel, ProtocolVersion protocolVersion, PlayerAuthentication auth)

## Key Methods

- public Deque<SyncInteractionChain> getInteractionPacketQueue()
- public PlayerRef getPlayerRef()
- public void setPlayerRef(PlayerRef playerRef, Player playerComponent)
- public String getIdentifier()

## Relationships

- Extends `GenericPacketHandler`
- Implements `IPacketHandler`
- Holds a reference to `PlayerRef`
