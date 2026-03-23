# PlayerConnectEvent

Type: class | Package: com.hypixel.hytale.server.core.event.events.player | Extends: PlayerEvent

public class PlayerConnectEvent extends PlayerEvent

Fired when a player connects to the server.

Also in this package: AddPlayerToWorldEvent, DrainPlayerFromWorldEvent, Formatter, PlayerChatEvent, PlayerCraftEvent, PlayerDisconnectEvent, PlayerEvent, PlayerInteractEvent, PlayerMouseButtonEvent, PlayerMouseMotionEvent, PlayerReadyEvent, PlayerRefEvent, PlayerSetupConnectEvent, PlayerSetupDisconnectEvent, RemovedPlayerFromWorldEvent

Complete API:
  public Holder<EntityStore> getHolder()
  public PlayerRef getPlayerRef()
  public Player getPlayer()
  public World getWorld()
  public void setWorld(World world)
  public String toString()

Fields:
private final Holder<EntityStore> holder
private final PlayerRef playerRef
private World world
