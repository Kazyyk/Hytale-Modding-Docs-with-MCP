# PlayerInput.SetClientVelocity

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Implements: PlayerInput.InputUpdate

public static class PlayerInput.SetClientVelocity implements PlayerInput.InputUpdate

An input update that sets the client-reported velocity on the entity's `Velocity` component. Converts a protocol `Vector3d` to a math `Vector3d`.

## Constructors


public SetClientVelocity(com.hypixel.hytale.protocol.Vector3d velocity)

## Methods


public Vector3d getVelocity()

Returns the velocity vector.


@Override
public void apply(CommandBuffer<EntityStore> commandBuffer, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, int index)

Sets the client velocity on the `Velocity` component if present.

## Related Types

- PlayerInput -- parent component

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems, KnockbackSimulation, NameplateRefChangeSystem, NameplateRefSystem (and 33 more)

Complete API:
  public Vector3d getVelocity()
  public void apply(CommandBuffer<EntityStore> commandBuffer, ArchetypeChunk<EntityStore> archetypeChunk, int index)

Fields:
private final Vector3d velocity
