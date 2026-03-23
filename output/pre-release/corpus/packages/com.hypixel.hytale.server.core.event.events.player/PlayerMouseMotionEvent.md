# PlayerMouseMotionEvent

Type: class | Package: com.hypixel.hytale.server.core.event.events.player | Extends: PlayerRefEvent

public class PlayerMouseMotionEvent extends PlayerRefEvent

Fired when a player moves the mouse.

Also in this package: AddPlayerToWorldEvent, DrainPlayerFromWorldEvent, Formatter, PlayerChatEvent, PlayerConnectEvent, PlayerCraftEvent, PlayerDisconnectEvent, PlayerEvent, PlayerInteractEvent, PlayerMouseButtonEvent, PlayerReadyEvent, PlayerRefEvent, PlayerSetupConnectEvent, PlayerSetupDisconnectEvent, RemovedPlayerFromWorldEvent

Complete API:
  public boolean isCancelled()
  public void setCancelled(boolean cancelled)
  public long getClientUseTime()
  public Item getItemInHand()
  public Vector3i getTargetBlock()
  public Entity getTargetEntity()
  public Vector2f getScreenPoint()
  public MouseMotionEvent getMouseMotion()
  public String toString()

Fields:
private final long clientUseTime
private final Item itemInHand
private final Vector3i targetBlock
private final Entity targetEntity
private final Vector2f screenPoint
private final MouseMotionEvent mouseMotion
private boolean cancelled
