# PlayerMouseButtonEvent

Type: class | Package: com.hypixel.hytale.server.core.event.events.player | Extends: PlayerRefEvent

public class PlayerMouseButtonEvent extends PlayerRefEvent

Fired when a player presses a mouse button.

Also in this package: AddPlayerToWorldEvent, DrainPlayerFromWorldEvent, Formatter, PlayerChatEvent, PlayerConnectEvent, PlayerCraftEvent, PlayerDisconnectEvent, PlayerEvent, PlayerInteractEvent, PlayerMouseMotionEvent, PlayerReadyEvent, PlayerRefEvent, PlayerSetupConnectEvent, PlayerSetupDisconnectEvent

Complete API:
  public PlayerRef getPlayerRefComponent()
  public boolean isCancelled()
  public void setCancelled(boolean cancelled)
  public long getClientUseTime()
  public Item getItemInHand()
  public Vector3i getTargetBlock()
  public Entity getTargetEntity()
  public Vector2f getScreenPoint()
  public MouseButtonEvent getMouseButton()
  public String toString()

Fields:
private final PlayerRef playerRef
private final long clientUseTime
private final Item itemInHand
private final Vector3i targetBlock
private final Entity targetEntity
private final Vector2f screenPoint
private final MouseButtonEvent mouseButton
private boolean cancelled
