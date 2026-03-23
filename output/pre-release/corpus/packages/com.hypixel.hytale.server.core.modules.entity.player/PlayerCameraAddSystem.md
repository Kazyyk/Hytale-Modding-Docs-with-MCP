# PlayerCameraAddSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: HolderSystem<EntityStore>

public class PlayerCameraAddSystem extends HolderSystem<EntityStore>

An ECS holder system that ensures every player entity has a `CameraManager` component. Queries entities that have a `PlayerRef` but lack a `CameraManager`, and adds one on entity creation.

## Related Types

- PlayerSystems -- other player initialization systems

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems, KnockbackSimulation, NameplateRefChangeSystem, NameplateRefSystem (and 33 more)

Complete API:
  public Query<EntityStore> getQuery()
  public void onEntityAdd(Holder<EntityStore> holder, AddReason reason, Store<EntityStore> store)
  public void onEntityRemoved(Holder<EntityStore> holder, RemoveReason reason, Store<EntityStore> store)

Fields:
private static final ComponentType<EntityStore,CameraManager> CAMERA_MANAGER_COMPONENT_TYPE
private static final Query<EntityStore> QUERY
