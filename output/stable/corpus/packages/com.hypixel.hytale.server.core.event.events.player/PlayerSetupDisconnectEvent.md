# PlayerSetupDisconnectEvent

Type: class | Package: com.hypixel.hytale.server.core.event.events.player | Extends: PlayerEvent

public class PlayerSetupDisconnectEvent extends PlayerEvent

Fired during player disconnection setup phase.

Also in this package: AddPlayerToWorldEvent, DrainPlayerFromWorldEvent, Formatter, PlayerChatEvent, PlayerConnectEvent, PlayerCraftEvent, PlayerDisconnectEvent, PlayerEvent, PlayerInteractEvent, PlayerMouseButtonEvent, PlayerMouseMotionEvent, PlayerReadyEvent, PlayerRefEvent, PlayerSetupConnectEvent

Complete API:
  public String getUsername()
  public UUID getUuid()
  public PlayerAuthentication getAuth()
  public PacketHandler.DisconnectReason getDisconnectReason()
  public String toString()

Fields:
private final String username
private final UUID uuid
private final PlayerAuthentication auth
private final PacketHandler.DisconnectReason disconnectReason
