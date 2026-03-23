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
