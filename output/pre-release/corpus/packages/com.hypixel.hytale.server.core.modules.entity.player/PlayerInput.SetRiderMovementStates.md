# PlayerInput.SetRiderMovementStates

Type: record | Package: com.hypixel.hytale.server.core.modules.entity.player | Implements: PlayerInput.InputUpdate

public record PlayerInput.SetRiderMovementStates(MovementStates movementStates) implements PlayerInput.InputUpdate

An input update that carries movement state flags for a mounted player's ride. The `apply()` method is a no-op in the current implementation.

## Record Components

- movementStates | MovementStates | The rider movement state flags.

## Related Types

- PlayerInput -- parent component
- PlayerInput.SetMovementStates -- player's own movement states

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems, KnockbackSimulation, NameplateRefChangeSystem, NameplateRefSystem (and 33 more)

Complete API:
  public void apply(CommandBuffer<EntityStore> commandBuffer, ArchetypeChunk<EntityStore> archetypeChunk, int index)
