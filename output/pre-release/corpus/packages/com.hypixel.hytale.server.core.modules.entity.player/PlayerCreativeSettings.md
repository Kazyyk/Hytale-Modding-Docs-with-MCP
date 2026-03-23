# PlayerCreativeSettings

Type: record | Package: com.hypixel.hytale.server.core.modules.entity.player

public record PlayerCreativeSettings(boolean allowNPCDetection, boolean respondToHit)

A record holding player-specific creative mode settings. Used as a nested value within PlayerSettings.

## Record Components

- allowNPCDetection | boolean | Whether NPCs can detect this player in creative mode.
- respondToHit | boolean | Whether the player responds to hit events in creative mode.

## Constructors


public PlayerCreativeSettings()

Default constructor: `allowNPCDetection = false`, `respondToHit = false`.

## Methods


@Nonnull
public PlayerCreativeSettings clone()

Returns a copy of this record.

## Related Types

- PlayerSettings -- parent settings record that contains this

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems, KnockbackSimulation, NameplateRefChangeSystem, NameplateRefSystem (and 33 more)

Complete API:
  public PlayerCreativeSettings clone()
