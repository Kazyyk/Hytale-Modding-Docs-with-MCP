# PlayerSystems.BlockPausedMovementSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Implements: RunWhenPausedSystem<EntityStore>, QuerySystem<EntityStore>

public static class PlayerSystems.BlockPausedMovementSystem implements RunWhenPausedSystem<EntityStore>, QuerySystem<EntityStore>

An ECS system that blocks player movement input while the game is paused. When a paused player sends movement that differs from their current position or head rotation by more than 0.01, teleports them back to their current position. Clears the input queue each tick.

## Related Types

- PlayerSystems -- parent container class
