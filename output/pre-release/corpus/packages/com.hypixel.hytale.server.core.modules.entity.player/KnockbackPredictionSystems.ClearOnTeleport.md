# KnockbackPredictionSystems.ClearOnTeleport

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: RefChangeSystem<EntityStore, Teleport>

public static class KnockbackPredictionSystems.ClearOnTeleport extends RefChangeSystem<EntityStore, Teleport>

An ECS component-change system that removes the `KnockbackSimulation` component when a `Teleport` component is added to an entity that has a knockback simulation in progress. This cancels the knockback prediction when the player is teleported.

## Related Types

- KnockbackPredictionSystems -- parent container class
- KnockbackSimulation -- component removed by this system

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, CollisionAxis, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems, KnockbackSimulation, NameplateRefChangeSystem, NameplateRefSystem, PlayerAddedSystem (and 33 more)

Complete API:
  public Query<EntityStore> getQuery()
  public ComponentType<EntityStore,Teleport> componentType()
  public void onComponentAdded(Ref<EntityStore> ref, Teleport component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onComponentSet(Ref<EntityStore> ref, Teleport oldComponent, Teleport newComponent, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onComponentRemoved(Ref<EntityStore> ref, Teleport component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private static final ComponentType<EntityStore,Teleport> TELEPORT_COMPONENT_TYPE
private static final ComponentType<EntityStore,KnockbackSimulation> KNOCKBACK_SIMULATION_COMPONENT_TYPE
