---
title: "com.hypixel.hytale.server.core.modules.entity.system"
kind: "package"
package: "com.hypixel.hytale.server.core.modules.entity.system"
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "ecs"
  - "entity"
  - "system"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.system`

Entity ECS systems that run per-tick or on entity lifecycle events within the `EntityStore`. This package contains 18 top-level classes encapsulating 61 total types (including inner classes). The systems handle spatial indexing, network entity tracking, model/bounding-box management, transform synchronization, chunk location updates, snapshot capture for lag compensation, and component-specific tracker patterns.

None of the types in this package are part of the public API surface.

## Spatial Systems

Four `SpatialSystem` subclasses maintain separate spatial indices for different entity categories, enabling efficient proximity queries:

| Type | Query | Purpose |
|---|---|---|
| [EntitySpatialSystem](EntitySpatialSystem.md) | `TransformComponent` AND NOT `Intangible` AND NOT `Player` | General non-player, non-item entities. |
| [PlayerSpatialSystem](PlayerSpatialSystem.md) | `Player` AND `TransformComponent` | Player entities only. |
| [ItemSpatialSystem](ItemSpatialSystem.md) | `ItemComponent` AND `TransformComponent` AND NOT `PreventItemMerging` | Dropped items eligible for merging. |
| [NetworkSendableSpatialSystem](NetworkSendableSpatialSystem.md) | `TransformComponent` AND `NetworkId` | All network-visible entities. |

## Entity Tracker Systems

Several container classes follow an identical pattern for synchronizing ECS component state to clients via the entity tracker. Each contains an `EntityTrackerAddAndRemove` (reactive change listener), an `EntityTrackerUpdate` (per-tick sender), and a `QueueResource` (concurrent queue):

| Type | Tracked Component | Update Packet |
|---|---|---|
| [EntityInteractableSystems](EntityInteractableSystems.md) | `Interactable` | `InteractableUpdate` |
| [IntangibleSystems](IntangibleSystems.md) | `Intangible` | `IntangibleUpdate` |
| [InvulnerableSystems](InvulnerableSystems.md) | `Invulnerable` | `InvulnerableUpdate` |
| [RespondToHitSystems](RespondToHitSystems.md) | `RespondToHit` | `RespondToHitUpdate` |

Additionally, these systems provide tracker updates for non-flag components:

| Type | Tracked Data | Update Packet |
|---|---|---|
| [AudioSystems](AudioSystems.md) | `AudioComponent` sound events | `AudioUpdate` |
| [TransformSystems](TransformSystems.md) | Position, body rotation, head rotation | `TransformUpdate` |
| [ModelSystems](ModelSystems.md) (AnimationEntityTrackerUpdate) | `ActiveAnimationComponent` | `ActiveAnimationsUpdate` |
| [EntitySystems](EntitySystems.md) (DynamicLightTracker) | `DynamicLight` | `DynamicLightUpdate` |
| [EntitySystems](EntitySystems.md) (NewSpawnEntityTrackerUpdate) | `NewSpawnComponent` | `NewSpawnUpdate` |

## Model and Bounding Box Systems

[ModelSystems](ModelSystems.md) contains ten inner systems managing the full model lifecycle:

- **SetRenderedModel** -- restores `ModelComponent` from `PersistentModel` on load.
- **PlayerConnect** -- assigns models to connecting players from their preset.
- **ApplyRandomSkin** -- generates random skins for NPCs with `ApplyRandomSkinPersistedComponent`.
- **ModelSpawned** -- initializes `BoundingBox` from model data on entity add.
- **ModelChange** -- synchronizes model changes to `PersistentModel`.
- **UpdateBoundingBox** -- recalculates bounds when the model changes.
- **UpdateMovementStateBoundingBox** -- recalculates bounds when crouching/sliding/sitting/sleeping changes.
- **PlayerUpdateMovementManager** -- resets `MovementManager` when the model changes.
- **AssignNetworkIdToProps** -- ensures props get a `NetworkId`.
- **EnsurePropsPrefabCopyable** -- ensures props are prefab-copyable.

## Lifecycle and Location Systems

| Type | Purpose |
|---|---|
| [EntitySystems](EntitySystems.md) | Marker clearing (`FromPrefab`/`FromWorldGen`), UUID assignment for external loads, entity-chunk unloading, new-spawn tracking, dynamic light tracking. |
| [UpdateLocationSystems](UpdateLocationSystems.md) | Chunk assignment on spawn and per-tick, handling entities that move into unloaded or invalid chunks. Players in invalid chunks are teleported; non-player entities are removed. |
| [TransformSystems](TransformSystems.md) | Transform network sync and chunk reference cleanup on removal. |
| [HideEntitySystems](HideEntitySystems.md) | Filters entities with `HiddenFromAdventurePlayers` from Adventure mode players. |
| [PlayerCollisionResultAddSystem](PlayerCollisionResultAddSystem.md) | Initializes `CollisionResultComponent` for player entities. |

## Other Systems

| Type | Purpose |
|---|---|
| [RotateObjectSystem](RotateObjectSystem.md) | Continuously rotates entities with `RotateObjectComponent` around the Y axis. |
| [SnapshotSystems](SnapshotSystems.md) | Maintains a rolling 500ms history of entity transforms for server-side lag compensation. |
| [UpdateEntitySeedSystem](UpdateEntitySeedSystem.md) | Periodically updates the world's entity seed (1-second interval). |
| [AudioSystems](AudioSystems.md) (TickMovementAudio) | Plays block-based movement sounds when entities enter/move within block types. |

## Complete Type List (61 types)

| # | Type | Enclosing Class | Kind | Superclass |
|---|---|---|---|---|
| 1 | AudioSystems | -- | class | `Object` |
| 2 | AudioSystems.EntityTrackerUpdate | AudioSystems | class | `EntityTickingSystem<EntityStore>` |
| 3 | AudioSystems.TickMovementAudio | AudioSystems | class | `EntityTickingSystem<EntityStore>` |
| 4 | EntityInteractableSystems | -- | class | `Object` |
| 5 | EntityInteractableSystems.EntityTrackerAddAndRemove | EntityInteractableSystems | class | `RefChangeSystem<EntityStore, Interactable>` |
| 6 | EntityInteractableSystems.EntityTrackerUpdate | EntityInteractableSystems | class | `EntityTickingSystem<EntityStore>` |
| 7 | EntityInteractableSystems.QueueResource | EntityInteractableSystems | class | `Resource<EntityStore>` |
| 8 | EntitySpatialSystem | -- | class | `SpatialSystem<EntityStore>` |
| 9 | EntitySystems | -- | class | `Object` |
| 10 | EntitySystems.ClearMarker | EntitySystems | abstract class | `RefSystem<EntityStore>` |
| 11 | EntitySystems.ClearFromPrefabMarker | EntitySystems | class | `ClearMarker<FromPrefab>` |
| 12 | EntitySystems.ClearFromWorldGenMarker | EntitySystems | class | `ClearMarker<FromWorldGen>` |
| 13 | EntitySystems.DynamicLightTracker | EntitySystems | class | `EntityTickingSystem<EntityStore>` |
| 14 | EntitySystems.NewSpawnEntityTrackerUpdate | EntitySystems | class | `EntityTickingSystem<EntityStore>` |
| 15 | EntitySystems.NewSpawnTick | EntitySystems | class | `EntityTickingSystem<EntityStore>` |
| 16 | EntitySystems.OnLoadFromExternal | EntitySystems | class | `HolderSystem<EntityStore>` |
| 17 | EntitySystems.UnloadEntityFromChunk | EntitySystems | class | `RefSystem<EntityStore>` |
| 18 | HideEntitySystems | -- | class | `Object` |
| 19 | HideEntitySystems.AdventurePlayerSystem | HideEntitySystems | class | `EntityTickingSystem<EntityStore>` |
| 20 | IntangibleSystems | -- | class | `Object` |
| 21 | IntangibleSystems.EntityTrackerAddAndRemove | IntangibleSystems | class | `RefChangeSystem<EntityStore, Intangible>` |
| 22 | IntangibleSystems.EntityTrackerUpdate | IntangibleSystems | class | `EntityTickingSystem<EntityStore>` |
| 23 | IntangibleSystems.QueueResource | IntangibleSystems | class | `Resource<EntityStore>` |
| 24 | InvulnerableSystems | -- | class | `Object` |
| 25 | InvulnerableSystems.EntityTrackerAddAndRemove | InvulnerableSystems | class | `RefChangeSystem<EntityStore, Invulnerable>` |
| 26 | InvulnerableSystems.EntityTrackerUpdate | InvulnerableSystems | class | `EntityTickingSystem<EntityStore>` |
| 27 | InvulnerableSystems.QueueResource | InvulnerableSystems | class | `Resource<EntityStore>` |
| 28 | ItemSpatialSystem | -- | class | `SpatialSystem<EntityStore>` |
| 29 | ModelSystems | -- | class | `Object` |
| 30 | ModelSystems.AnimationEntityTrackerUpdate | ModelSystems | class | `EntityTickingSystem<EntityStore>` |
| 31 | ModelSystems.ApplyRandomSkin | ModelSystems | class | `HolderSystem<EntityStore>` |
| 32 | ModelSystems.AssignNetworkIdToProps | ModelSystems | class | `HolderSystem<EntityStore>` |
| 33 | ModelSystems.EnsurePropsPrefabCopyable | ModelSystems | class | `HolderSystem<EntityStore>` |
| 34 | ModelSystems.ModelChange | ModelSystems | class | `RefChangeSystem<EntityStore, ModelComponent>` |
| 35 | ModelSystems.ModelSpawned | ModelSystems | class | `HolderSystem<EntityStore>` |
| 36 | ModelSystems.PlayerConnect | ModelSystems | class | `HolderSystem<EntityStore>` |
| 37 | ModelSystems.PlayerUpdateMovementManager | ModelSystems | class | `RefChangeSystem<EntityStore, ModelComponent>` |
| 38 | ModelSystems.SetRenderedModel | ModelSystems | class | `HolderSystem<EntityStore>` |
| 39 | ModelSystems.UpdateBoundingBox | ModelSystems | class | `RefChangeSystem<EntityStore, ModelComponent>` |
| 40 | ModelSystems.UpdateMovementStateBoundingBox | ModelSystems | class | `EntityTickingSystem<EntityStore>` |
| 41 | NetworkSendableSpatialSystem | -- | class | `SpatialSystem<EntityStore>` |
| 42 | PlayerCollisionResultAddSystem | -- | class | `HolderSystem<EntityStore>` |
| 43 | PlayerSpatialSystem | -- | class | `SpatialSystem<EntityStore>` |
| 44 | RespondToHitSystems | -- | class | `Object` |
| 45 | RespondToHitSystems.EntityTrackerAddAndRemove | RespondToHitSystems | class | `RefChangeSystem<EntityStore, RespondToHit>` |
| 46 | RespondToHitSystems.EntityTrackerUpdate | RespondToHitSystems | class | `EntityTickingSystem<EntityStore>` |
| 47 | RespondToHitSystems.OnPlayerSettingsChange | RespondToHitSystems | class | `RefChangeSystem<EntityStore, PlayerSettings>` |
| 48 | RespondToHitSystems.QueueResource | RespondToHitSystems | class | `Resource<EntityStore>` |
| 49 | RotateObjectSystem | -- | class | `EntityTickingSystem<EntityStore>` |
| 50 | SnapshotSystems | -- | class | `Object` |
| 51 | SnapshotSystems.Add | SnapshotSystems | class | `HolderSystem<EntityStore>` |
| 52 | SnapshotSystems.Capture | SnapshotSystems | class | `EntityTickingSystem<EntityStore>` |
| 53 | SnapshotSystems.Resize | SnapshotSystems | class | `EntityTickingSystem<EntityStore>` |
| 54 | SnapshotSystems.SnapshotWorldInfo | SnapshotSystems | class | `Resource<EntityStore>` |
| 55 | TransformSystems | -- | class | `Object` |
| 56 | TransformSystems.EntityTrackerUpdate | TransformSystems | class | `EntityTickingSystem<EntityStore>` |
| 57 | TransformSystems.OnRemove | TransformSystems | class | `HolderSystem<EntityStore>` |
| 58 | UpdateEntitySeedSystem | -- | class | `DelayedSystem<EntityStore>` |
| 59 | UpdateLocationSystems | -- | class | `Object` |
| 60 | UpdateLocationSystems.SpawnSystem | UpdateLocationSystems | class | `RefSystem<EntityStore>` |
| 61 | UpdateLocationSystems.TickingSystem | UpdateLocationSystems | class | `EntityTickingSystem<EntityStore>` |
