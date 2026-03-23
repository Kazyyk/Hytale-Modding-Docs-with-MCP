# Teleport

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.teleport | Implements: Component<EntityStore>

public class Teleport implements Component<EntityStore>

ECS component representing a teleport that is being processed.

Also in this package: Entry, MoveSystem, PendingTeleport, PlayerMoveCompleteSystem, PlayerMoveSystem, Result, TeleportRecord, TeleportSystems

Complete API:
  public static ComponentType<EntityStore,Teleport> getComponentType()
  public static Teleport createForPlayer(World world, Transform transform)
  public static Teleport createForPlayer(World world, Vector3d position, Vector3f rotation)
  public static Teleport createForPlayer(Vector3d position, Vector3f rotation)
  public static Teleport createForPlayer(Transform transform)
  public static Teleport createExact(Vector3d position, Vector3f bodyRotation, Vector3f headRotation)
  public static Teleport createExact(Vector3d position, Vector3f bodyRotation)
  public void setPosition(Vector3d position)
  public void setRotation(Vector3f rotation)
  public Teleport setHeadRotation(Vector3f headRotation)
  public Teleport withoutVelocityReset()
  public void setOnComplete(CompletableFuture<Void> onComplete)
  public CompletableFuture<Void> getOnComplete()
  public World getWorld()
  public Vector3d getPosition()
  public Vector3f getRotation()
  public Vector3f getHeadRotation()
  public boolean isResetVelocity()
  public Teleport clone()

Fields:
private final World world
private final Vector3d position
private final Vector3f rotation
private Vector3f headRotation
private boolean resetVelocity
private CompletableFuture<Void> onComplete
