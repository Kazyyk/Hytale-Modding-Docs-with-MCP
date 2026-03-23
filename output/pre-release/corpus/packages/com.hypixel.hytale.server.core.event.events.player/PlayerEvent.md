# PlayerEvent

Type: class | Package: com.hypixel.hytale.server.core.event.events.player | Extends: Event

public class PlayerEvent extends Event

Base class for all player-related events.

Known subclasses: PlayerCraftEvent, PlayerInteractEvent, PlayerMouseButtonEvent, PlayerMouseMotionEvent, PlayerReadyEvent

Also in this package: AddPlayerToWorldEvent, DrainPlayerFromWorldEvent, Formatter, PlayerChatEvent, PlayerConnectEvent, PlayerCraftEvent, PlayerDisconnectEvent, PlayerInteractEvent, PlayerMouseButtonEvent, PlayerMouseMotionEvent, PlayerReadyEvent, PlayerRefEvent, PlayerSetupConnectEvent, PlayerSetupDisconnectEvent, RemovedPlayerFromWorldEvent

Complete API:
  public Ref<EntityStore> getPlayerRef()
  public Player getPlayer()
  public String toString()

Fields:
private final Ref<EntityStore> playerRef
private final Player player
