# PlayerInput.SetBody

Type: record | Package: com.hypixel.hytale.server.core.modules.entity.player | Implements: PlayerInput.InputUpdate

public record PlayerInput.SetBody(Direction direction) implements PlayerInput.InputUpdate

An input update that sets the entity's body rotation from the client-reported `Direction` (pitch, yaw, roll). Updates the `TransformComponent` rotation.

## Record Components

- direction | Direction | The body orientation to apply.

## Related Types

- PlayerInput -- parent component
- PlayerInput.SetHead -- head rotation counterpart

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, EnsureEffectControllerSystem, EnsurePlayerInput, EnsureUniqueItemUsagesSystem, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems (and 35 more)

Complete API:
  public void apply(CommandBuffer<EntityStore> commandBuffer, ArchetypeChunk<EntityStore> archetypeChunk, int index)
