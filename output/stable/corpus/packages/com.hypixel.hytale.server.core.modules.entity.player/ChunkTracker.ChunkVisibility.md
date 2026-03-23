# ChunkTracker.ChunkVisibility

Type: enum | Package: com.hypixel.hytale.server.core.modules.entity.player

public static enum ChunkTracker.ChunkVisibility

Classifies a chunk's visibility state relative to a player. Used by ChunkTracker to determine how chunks are treated.

## Enum Constants

- NONE | The chunk is outside the player's view radius and should not be loaded.
- HOT | The chunk is within the hot radius and is actively ticking.
- COLD | The chunk is within the view radius but outside the hot radius; loaded but not ticking.

## Related Types

- ChunkTracker -- component that uses this enum to classify chunks

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ClearOnRemove, ClearOnTeleport, CollisionAxis, EnsureEffectControllerSystem, EnsurePlayerInput, EnsureUniqueItemUsagesSystem, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems, KnockbackSimulation (and 35 more)
