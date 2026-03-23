# PlayerSavingSystems

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player

public class PlayerSavingSystems

Container class for ECS systems that handle periodic and on-removal player data saving.

## Constants

- PLAYER_SAVE_INTERVAL_SECONDS | float | 10.0F | Interval between periodic saves.

## Inner Types

- PlayerSavingSystems.SaveDataResource -- resource tracking save timer
- PlayerSavingSystems.TickingSystem -- periodic save system
- PlayerSavingSystems.WorldRemovedSystem -- saves and disconnects on world removal

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, EnsureEffectControllerSystem, EnsurePlayerInput, EnsureUniqueItemUsagesSystem, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems (and 35 more)

Fields:
private static final HytaleLogger LOGGER
private static final float PLAYER_SAVE_INTERVAL_SECONDS
