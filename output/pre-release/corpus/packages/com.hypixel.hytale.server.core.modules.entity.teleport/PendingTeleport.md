# PendingTeleport

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.teleport | Implements: Component<EntityStore>

public class PendingTeleport implements Component<EntityStore>

ECS component representing a pending teleport request that has not yet been executed.

Also in this package: Entry, MoveSystem, PlayerMoveCompleteSystem, PlayerMoveSystem, Result, Teleport, TeleportRecord, TeleportSystems

Complete API:
  public static ComponentType<EntityStore,PendingTeleport> getComponentType()
  public PendingTeleport.Result validate(int teleportId, Position teleportPosition)
  public boolean isEmpty()
  public int queueTeleport(Teleport teleport)
  public Vector3d getPosition()
  public Component<EntityStore> clone()

Fields:
public static final double MAX_OFFSET
private final Vector3d position
private final List<Teleport> pendingTeleports
private int nextTeleportId
private int lastTeleportId
