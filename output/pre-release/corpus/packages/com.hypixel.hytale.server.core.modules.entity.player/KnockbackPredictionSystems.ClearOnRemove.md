# KnockbackPredictionSystems.ClearOnRemove

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: RefSystem<EntityStore>

public static class KnockbackPredictionSystems.ClearOnRemove extends RefSystem<EntityStore>

An ECS ref system that removes the `KnockbackSimulation` component when an entity with that component is removed from the store. Prevents stale simulation state from persisting.

## Related Types

- KnockbackPredictionSystems -- parent container class
- KnockbackSimulation -- component removed by this system

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnTeleport, CollisionAxis, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems, KnockbackSimulation, NameplateRefChangeSystem, NameplateRefSystem, PlayerAddedSystem (and 33 more)

Complete API:
  public Query<EntityStore> getQuery()
  public void onEntityAdded(Ref<EntityStore> ref, AddReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onEntityRemove(Ref<EntityStore> ref, RemoveReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private static final ComponentType<EntityStore,KnockbackSimulation> KNOCKBACK_SIMULATION_COMPONENT_TYPE
