# KnockbackPredictionSystems.CaptureKnockbackInput

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: EntityTickingSystem<EntityStore>

public static class KnockbackPredictionSystems.CaptureKnockbackInput extends EntityTickingSystem<EntityStore>

An ECS ticking system that runs BEFORE `PlayerSystems.ProcessPlayerInput` to extract movement and jump inputs from the player input queue during knockback. Updates the KnockbackSimulation component with client position, relative movement, and movement states.

Queries entities with both `PlayerInput` and `KnockbackSimulation` components.

## Related Types

- KnockbackPredictionSystems -- parent container class
- KnockbackSimulation -- simulation state updated by this system
- PlayerInput -- input queue consumed by this system

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, EnsureEffectControllerSystem, EnsurePlayerInput, EnsureUniqueItemUsagesSystem, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems, KnockbackSimulation (and 35 more)

Complete API:
  public Query<EntityStore> getQuery()
  public Set<Dependency<EntityStore>> getDependencies()
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private static final Query<EntityStore> QUERY
private static final Set<Dependency<EntityStore>> DEPENDENCIES
