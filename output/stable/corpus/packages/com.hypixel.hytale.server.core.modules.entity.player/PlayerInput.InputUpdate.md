# PlayerInput.InputUpdate

Type: interface | Package: com.hypixel.hytale.server.core.modules.entity.player

public interface PlayerInput.InputUpdate

Interface for input update entries queued in PlayerInput. Each implementation applies a specific type of client input to the entity.

## Methods


void apply(CommandBuffer<EntityStore> var1, ArchetypeChunk<EntityStore> var2, int var3)

Applies this input update to the entity at the given index in the archetype chunk.

## Implementations

- PlayerInput.AbsoluteMovement
- PlayerInput.RelativeMovement
- PlayerInput.WishMovement
- PlayerInput.SetBody
- PlayerInput.SetHead
- PlayerInput.SetClientVelocity
- PlayerInput.SetMovementStates
- PlayerInput.SetRiderMovementStates
