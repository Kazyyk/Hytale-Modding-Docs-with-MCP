# PlayerInteractEvent

Type: class | Package: com.hypixel.hytale.server.core.event.events.player | Extends: PlayerRefEvent

public class PlayerInteractEvent extends PlayerRefEvent

Fired when a player interacts with the world.

Also in this package: AddPlayerToWorldEvent, DrainPlayerFromWorldEvent, Formatter, PlayerChatEvent, PlayerConnectEvent, PlayerCraftEvent, PlayerDisconnectEvent, PlayerEvent, PlayerMouseButtonEvent, PlayerMouseMotionEvent, PlayerReadyEvent, PlayerRefEvent, PlayerSetupConnectEvent, PlayerSetupDisconnectEvent

Complete API:
  public boolean isCancelled()
  public void setCancelled(boolean cancelled)
  public InteractionType getActionType()
  public long getClientUseTime()
  public ItemStack getItemInHand()
  public Vector3i getTargetBlock()
  public Entity getTargetEntity()
  public Ref<EntityStore> getTargetRef()
  public String toString()

Fields:
private final InteractionType actionType
private final long clientUseTime
private final ItemStack itemInHand
private final Vector3i targetBlock
private final Ref<EntityStore> targetRef
private final Entity targetEntity
private boolean cancelled
