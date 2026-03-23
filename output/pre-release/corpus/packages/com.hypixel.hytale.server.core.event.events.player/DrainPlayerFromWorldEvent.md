# DrainPlayerFromWorldEvent

Type: class | Package: com.hypixel.hytale.server.core.event.events.player | Extends: PlayerRefEvent

public class DrainPlayerFromWorldEvent extends PlayerRefEvent

Fired when a player is drained from a world.

Also in this package: AddPlayerToWorldEvent, Formatter, PlayerChatEvent, PlayerConnectEvent, PlayerCraftEvent, PlayerDisconnectEvent, PlayerEvent, PlayerInteractEvent, PlayerMouseButtonEvent, PlayerMouseMotionEvent, PlayerReadyEvent, PlayerRefEvent, PlayerSetupConnectEvent, PlayerSetupDisconnectEvent, RemovedPlayerFromWorldEvent

Complete API:
  public Holder<EntityStore> getHolder()
  public World getWorld()
  public void setWorld(World world)
  public Transform getTransform()
  public void setTransform(Transform transform)
  public String toString()

Fields:
private final Holder<EntityStore> holder
private World world
private Transform transform
