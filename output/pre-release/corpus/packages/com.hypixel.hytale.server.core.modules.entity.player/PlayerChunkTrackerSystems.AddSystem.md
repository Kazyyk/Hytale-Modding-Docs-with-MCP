# PlayerChunkTrackerSystems.AddSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: HolderSystem<EntityStore>

public static class PlayerChunkTrackerSystems.AddSystem extends HolderSystem<EntityStore>

An ECS holder system that sets the ChunkTracker to "ready for chunks" when an entity with a `ChunkTracker` component is added to the store.

## Related Types

- PlayerChunkTrackerSystems -- parent container class
- ChunkTracker -- component initialized by this system

Also in this package: AbsoluteMovement, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems, KnockbackSimulation, NameplateRefChangeSystem, NameplateRefSystem, PlayerAddedSystem (and 33 more)

Complete API:
  public Query<EntityStore> getQuery()
  public void onEntityAdd(Holder<EntityStore> holder, AddReason reason, Store<EntityStore> store)
  public void onEntityRemoved(Holder<EntityStore> holder, RemoveReason reason, Store<EntityStore> store)

Fields:
private static final ComponentType<EntityStore,ChunkTracker> CHUNK_TRACKER_COMPONENT_TYPE
