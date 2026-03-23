# KnockbackPredictionSystems.InitKnockback

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: RefChangeSystem<EntityStore, KnockbackSimulation>

public static class KnockbackPredictionSystems.InitKnockback extends RefChangeSystem<EntityStore, KnockbackSimulation>

An ECS component-change system that initializes a KnockbackSimulation when it is added to a player entity. Sets the simulation's client and sim positions to the entity's current transform position, and copies the current movement states. On removal, moves the player to the client's final position and restores the client's movement states.

Queries entities with `Player`, `TransformComponent`, `KnockbackSimulation`, and `MovementStatesComponent`.

## Related Types

- KnockbackPredictionSystems -- parent container class
- KnockbackSimulation -- component initialized/cleaned up by this system

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems, KnockbackSimulation, NameplateRefChangeSystem, NameplateRefSystem, PlayerAddedSystem (and 33 more)

Complete API:
  public Query<EntityStore> getQuery()
  public ComponentType<EntityStore,KnockbackSimulation> componentType()
  public void onComponentAdded(Ref<EntityStore> ref, KnockbackSimulation component, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onComponentSet(Ref<EntityStore> ref, KnockbackSimulation oldComponent, KnockbackSimulation newComponent, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public void onComponentRemoved(Ref<EntityStore> ref, KnockbackSimulation knockbackSimulationComponent, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private static final Query<EntityStore> QUERY
