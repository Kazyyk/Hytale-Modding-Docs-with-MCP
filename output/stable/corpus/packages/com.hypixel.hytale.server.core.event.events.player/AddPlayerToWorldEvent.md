# AddPlayerToWorldEvent

Type: class | Package: com.hypixel.hytale.server.core.event.events.player | Extends: PlayerRefEvent

public class AddPlayerToWorldEvent extends PlayerRefEvent

Fired when a player is added to a world.

Also in this package: DrainPlayerFromWorldEvent, Formatter, PlayerChatEvent, PlayerConnectEvent, PlayerCraftEvent, PlayerDisconnectEvent, PlayerEvent, PlayerInteractEvent, PlayerMouseButtonEvent, PlayerMouseMotionEvent, PlayerReadyEvent, PlayerRefEvent, PlayerSetupConnectEvent, PlayerSetupDisconnectEvent

Complete API:
  public Holder<EntityStore> getHolder()
  public World getWorld()
  public boolean shouldBroadcastJoinMessage()
  public void setBroadcastJoinMessage(boolean broadcastJoinMessage)
  public String toString()

Fields:
private final Holder<EntityStore> holder
private final World world
private boolean broadcastJoinMessage
