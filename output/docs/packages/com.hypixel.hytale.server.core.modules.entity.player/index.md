---
title: "com.hypixel.hytale.server.core.modules.entity.player"
kind: "package"
package: "com.hypixel.hytale.server.core.modules.entity.player"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "player"
  - "entity"
  - "module"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

The player package implements ECS components and systems for player entity management on the server. This includes chunk loading and visibility tracking, player input processing, knockback prediction, network synchronization (ping, connection flushing, inventory sending), player data saving, and lifecycle management (spawn, removal, kill feed, nameplates).

## API Surface Types

| Type | Kind | Description |
|---|---|---|
| [ChunkTracker](ChunkTracker.md) | class | Manages chunk loading, unloading, and visibility for a connected player. |
| [ChunkTracker.ChunkVisibility](ChunkTracker.ChunkVisibility.md) | enum | Classifies chunk proximity as HOT, COLD, or NONE. |
| [PlayerSettings](PlayerSettings.md) | record | Player-configurable settings for pickup behavior, armor visibility, and creative mode. |

## Internal Types -- Components

| Type | Kind | Description |
|---|---|---|
| [ApplyRandomSkinPersistedComponent](ApplyRandomSkinPersistedComponent.md) | class | Singleton flag for random skin assignment. |
| [KnockbackSimulation](KnockbackSimulation.md) | class | State for server-side knockback prediction. |
| [PlayerCreativeSettings](PlayerCreativeSettings.md) | record | Creative mode settings (NPC detection, respond to hit). |
| [PlayerInput](PlayerInput.md) | class | Queues client input updates for processing. |
| [PlayerInput.InputUpdate](PlayerInput.InputUpdate.md) | interface | Interface for input update entries. |
| [PlayerInput.AbsoluteMovement](PlayerInput.AbsoluteMovement.md) | class | Absolute position input. |
| [PlayerInput.RelativeMovement](PlayerInput.RelativeMovement.md) | class | Relative position offset input. |
| [PlayerInput.WishMovement](PlayerInput.WishMovement.md) | class | Wish-based movement for knockback. |
| [PlayerInput.SetBody](PlayerInput.SetBody.md) | record | Body rotation input. |
| [PlayerInput.SetHead](PlayerInput.SetHead.md) | record | Head rotation input. |
| [PlayerInput.SetClientVelocity](PlayerInput.SetClientVelocity.md) | class | Client velocity input. |
| [PlayerInput.SetMovementStates](PlayerInput.SetMovementStates.md) | record | Movement state flags input. |
| [PlayerInput.SetRiderMovementStates](PlayerInput.SetRiderMovementStates.md) | record | Rider movement state flags input. |
| [PlayerSkinComponent](PlayerSkinComponent.md) | class | Holds player skin data with network dirty tracking. |

## Internal Types -- Chunk Tracking

| Type | Kind | Description |
|---|---|---|
| [PlayerChunkTrackerSystems](PlayerChunkTrackerSystems.md) | class | Container for chunk tracker systems. |
| [PlayerChunkTrackerSystems.AddSystem](PlayerChunkTrackerSystems.AddSystem.md) | class | Initializes chunk tracker readiness. |
| [PlayerChunkTrackerSystems.UpdateSystem](PlayerChunkTrackerSystems.UpdateSystem.md) | class | Ticks chunk tracker each frame. |

## Internal Types -- Knockback Prediction

| Type | Kind | Description |
|---|---|---|
| [KnockbackPredictionSystems](KnockbackPredictionSystems.md) | class | Container for knockback prediction systems. |
| [KnockbackPredictionSystems.CaptureKnockbackInput](KnockbackPredictionSystems.CaptureKnockbackInput.md) | class | Captures input during knockback. |
| [KnockbackPredictionSystems.ClearOnRemove](KnockbackPredictionSystems.ClearOnRemove.md) | class | Removes simulation on entity removal. |
| [KnockbackPredictionSystems.ClearOnTeleport](KnockbackPredictionSystems.ClearOnTeleport.md) | class | Clears simulation on teleport. |
| [KnockbackPredictionSystems.CollisionAxis](KnockbackPredictionSystems.CollisionAxis.md) | enum | Collision axis enum (private). |
| [KnockbackPredictionSystems.InitKnockback](KnockbackPredictionSystems.InitKnockback.md) | class | Initializes simulation state. |
| [KnockbackPredictionSystems.SimulateKnockback](KnockbackPredictionSystems.SimulateKnockback.md) | class | Runs knockback physics (deprecated). |

## Internal Types -- Player Systems

| Type | Kind | Description |
|---|---|---|
| [PlayerSystems](PlayerSystems.md) | class | Container for core player lifecycle systems. |
| [PlayerSystems.BlockPausedMovementSystem](PlayerSystems.BlockPausedMovementSystem.md) | class | Blocks movement when paused. |
| [PlayerSystems.EnsureEffectControllerSystem](PlayerSystems.EnsureEffectControllerSystem.md) | class | Ensures effect controller on add. |
| [PlayerSystems.EnsurePlayerInput](PlayerSystems.EnsurePlayerInput.md) | class | Ensures player input on add/remove. |
| [PlayerSystems.EnsureUniqueItemUsagesSystem](PlayerSystems.EnsureUniqueItemUsagesSystem.md) | class | Ensures unique item usages. |
| [PlayerSystems.KillFeedDecedentEventSystem](PlayerSystems.KillFeedDecedentEventSystem.md) | class | Victim name for kill feed. |
| [PlayerSystems.KillFeedKillerEventSystem](PlayerSystems.KillFeedKillerEventSystem.md) | class | Killer name for kill feed. |
| [PlayerSystems.NameplateRefChangeSystem](PlayerSystems.NameplateRefChangeSystem.md) | class | Updates nameplate on name change. |
| [PlayerSystems.NameplateRefSystem](PlayerSystems.NameplateRefSystem.md) | class | Initializes nameplate. |
| [PlayerSystems.PlayerAddedSystem](PlayerSystems.PlayerAddedSystem.md) | class | Full initialization on world join. |
| [PlayerSystems.PlayerRemovedSystem](PlayerSystems.PlayerRemovedSystem.md) | class | Cleanup on player removal. |
| [PlayerSystems.PlayerSpawnedSystem](PlayerSystems.PlayerSpawnedSystem.md) | class | Sends initial state to client. |
| [PlayerSystems.ProcessPlayerInput](PlayerSystems.ProcessPlayerInput.md) | class | Drains and applies input queue. |
| [PlayerSystems.UpdatePlayerRef](PlayerSystems.UpdatePlayerRef.md) | class | Updates position reference each tick. |

## Internal Types -- Movement

| Type | Kind | Description |
|---|---|---|
| [PlayerMovementManagerSystems](PlayerMovementManagerSystems.md) | class | Container for movement manager systems. |
| [PlayerMovementManagerSystems.AssignmentSystem](PlayerMovementManagerSystems.AssignmentSystem.md) | class | Ensures MovementManager on add. |
| [PlayerMovementManagerSystems.PostAssignmentSystem](PlayerMovementManagerSystems.PostAssignmentSystem.md) | class | Resets defaults after assignment. |
| [PlayerProcessMovementSystem](PlayerProcessMovementSystem.md) | class | Processes movement and block collision. |
| [PlayerCameraAddSystem](PlayerCameraAddSystem.md) | class | Ensures CameraManager on add. |

## Internal Types -- Network

| Type | Kind | Description |
|---|---|---|
| [PlayerPingSystem](PlayerPingSystem.md) | class | Periodic ping measurement. |
| [PlayerConnectionFlushSystem](PlayerConnectionFlushSystem.md) | class | Flushes outbound packets. |
| [PlayerSendInventorySystem](PlayerSendInventorySystem.md) | class | Sends dirty inventory to client. |

## Internal Types -- HUD

| Type | Kind | Description |
|---|---|---|
| [PlayerHudManagerSystems](PlayerHudManagerSystems.md) | class | Container for HUD systems. |
| [PlayerHudManagerSystems.InitializeSystem](PlayerHudManagerSystems.InitializeSystem.md) | class | Sends initial HUD state. |

## Internal Types -- Saving

| Type | Kind | Description |
|---|---|---|
| [PlayerSavingSystems](PlayerSavingSystems.md) | class | Container for saving systems. |
| [PlayerSavingSystems.SaveDataResource](PlayerSavingSystems.SaveDataResource.md) | class | Save timer resource. |
| [PlayerSavingSystems.TickingSystem](PlayerSavingSystems.TickingSystem.md) | class | Periodic save system. |
| [PlayerSavingSystems.WorldRemovedSystem](PlayerSavingSystems.WorldRemovedSystem.md) | class | Save and disconnect on world removal. |

## Internal Types -- Item Pickup

| Type | Kind | Description |
|---|---|---|
| [PlayerItemEntityPickupSystem](PlayerItemEntityPickupSystem.md) | class | Handles item entity pickup by players. |
