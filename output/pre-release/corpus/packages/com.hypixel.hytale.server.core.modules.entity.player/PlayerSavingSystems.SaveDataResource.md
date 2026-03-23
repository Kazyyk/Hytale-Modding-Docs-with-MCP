# PlayerSavingSystems.SaveDataResource

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Implements: Resource<EntityStore>

public static class PlayerSavingSystems.SaveDataResource implements Resource<EntityStore>

An ECS resource that holds the countdown timer for periodic player data saving. The delay resets to 10 seconds after each save cycle.

## Related Types

- PlayerSavingSystems -- parent container class
- PlayerSavingSystems.TickingSystem -- system that decrements this timer

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems, KnockbackSimulation, NameplateRefChangeSystem, NameplateRefSystem (and 33 more)

Complete API:
  public Resource<EntityStore> clone()

Fields:
private float delay
