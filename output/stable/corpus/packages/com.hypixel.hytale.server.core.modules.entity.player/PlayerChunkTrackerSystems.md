# PlayerChunkTrackerSystems

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player

public class PlayerChunkTrackerSystems

Container class for ECS systems that manage the ChunkTracker component lifecycle. Contains an initialization system and a per-tick update system.

## Inner Types

- PlayerChunkTrackerSystems.AddSystem -- marks the chunk tracker as ready on entity add
- PlayerChunkTrackerSystems.UpdateSystem -- ticks the chunk tracker each frame

## Related Types

- ChunkTracker -- component managed by these systems

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, EnsureEffectControllerSystem, EnsurePlayerInput, EnsureUniqueItemUsagesSystem, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems (and 35 more)
