# PlayerInput.SetMovementStates

Type: record | Package: com.hypixel.hytale.server.core.modules.entity.player | Implements: PlayerInput.InputUpdate

public record PlayerInput.SetMovementStates(MovementStates movementStates) implements PlayerInput.InputUpdate

An input update that sets the entity's movement state flags (on ground, jumping, flying, swimming, etc.) from client-reported `MovementStates`.

## Record Components

- movementStates | MovementStates | The movement state flags to apply.

## Related Types

- PlayerInput -- parent component
- PlayerInput.SetRiderMovementStates -- rider variant

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, EnsureEffectControllerSystem, EnsurePlayerInput, EnsureUniqueItemUsagesSystem, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems (and 35 more)

Complete API:
  public void apply(CommandBuffer<EntityStore> commandBuffer, ArchetypeChunk<EntityStore> archetypeChunk, int index)
