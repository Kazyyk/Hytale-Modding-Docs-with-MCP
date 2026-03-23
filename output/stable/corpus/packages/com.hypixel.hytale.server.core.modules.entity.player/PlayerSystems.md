# PlayerSystems

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player

public class PlayerSystems

Top-level container class for the core ECS systems that manage player entity lifecycle, input processing, nameplate display, kill feed messages, and reference updates.

## Static Fields

- LOGGER | HytaleLogger | Logger for player system events.

## Inner Types

- PlayerSystems.BlockPausedMovementSystem -- blocks player movement when paused
- PlayerSystems.EnsureEffectControllerSystem -- ensures effect controller on player add
- PlayerSystems.EnsurePlayerInput -- ensures player input component on add/remove
- PlayerSystems.EnsureUniqueItemUsagesSystem -- ensures unique item usages component
- PlayerSystems.KillFeedDecedentEventSystem -- provides victim name for kill feed
- PlayerSystems.KillFeedKillerEventSystem -- provides killer name for kill feed
- PlayerSystems.NameplateRefChangeSystem -- updates nameplate on display name change
- PlayerSystems.NameplateRefSystem -- initializes nameplate on entity add
- PlayerSystems.PlayerAddedSystem -- full player initialization on world join
- PlayerSystems.PlayerRemovedSystem -- cleanup on player removal
- PlayerSystems.PlayerSpawnedSystem -- sends initial entity state to client
- PlayerSystems.ProcessPlayerInput -- drains and applies input queue
- PlayerSystems.UpdatePlayerRef -- updates player ref position each tick

Also in this package: AbsoluteMovement, AddSystem, ApplyRandomSkinPersistedComponent, AssignmentSystem, BlockPausedMovementSystem, CaptureKnockbackInput, ChunkTracker, ChunkVisibility, ClearOnRemove, ClearOnTeleport, CollisionAxis, EnsureEffectControllerSystem, EnsurePlayerInput, EnsureUniqueItemUsagesSystem, InitKnockback, InitializeSystem, InputUpdate, KillFeedDecedentEventSystem, KillFeedKillerEventSystem, KnockbackPredictionSystems (and 35 more)

Fields:
public static final HytaleLogger LOGGER
