# TeleportRecord

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.teleport | Implements: Component<EntityStore>

public class TeleportRecord implements Component<EntityStore>

ECS component that records teleport history as a list of origin/destination entries with timestamps.

Also in this package: Entry, MoveSystem, PendingTeleport, PlayerMoveCompleteSystem, PlayerMoveSystem, Result, Teleport, TeleportSystems

Complete API:
  public static ComponentType<EntityStore,TeleportRecord> getComponentType()
  public TeleportRecord.Entry getLastTeleport()
  public void setLastTeleport(TeleportRecord.Entry lastTeleport)
  public boolean hasElapsedSinceLastTeleport(Duration duration)
  public boolean hasElapsedSinceLastTeleport(long nowNanos, Duration duration)
  public Component<EntityStore> clone()

Fields:
private TeleportRecord.Entry lastTeleport
