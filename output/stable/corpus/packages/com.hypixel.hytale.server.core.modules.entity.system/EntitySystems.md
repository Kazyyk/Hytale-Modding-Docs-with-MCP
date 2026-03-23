# EntitySystems

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.system

public class EntitySystems

Container class for general-purpose entity ECS systems. Includes marker-clearing systems for prefab/worldgen origins, a dynamic light tracker, new-spawn tracking, UUID assignment for externally loaded entities, and entity-chunk unloading logic.

## Inner Classes

### ClearMarker


public abstract static class ClearMarker<T extends Component<EntityStore>> extends RefSystem<EntityStore>

Abstract base system that removes a marker component from entities when they are first added to the store. Used to clear one-shot flags like `FromPrefab` and `FromWorldGen` after the entity has been processed by downstream systems.

Declares a dependency to run `AFTER` a specified `SystemGroup`, ensuring other systems that need the marker have already processed the entity.

- **onEntityAdded**: Removes the marker component via `commandBuffer.removeComponent()`.
- **onEntityRemove**: No-op.

### ClearFromPrefabMarker


public static class ClearFromPrefabMarker extends EntitySystems.ClearMarker<FromPrefab>

Concrete specialization that clears the `FromPrefab` marker component.

### ClearFromWorldGenMarker


public static class ClearFromWorldGenMarker extends EntitySystems.ClearMarker<FromWorldGen>

Concrete specialization that clears the `FromWorldGen` marker component.

### DynamicLightTracker


public static class DynamicLightTracker extends EntityTickingSystem<EntityStore>

Per-tick system that synchronizes `DynamicLight` component state with visible players. Runs in the `EntityTrackerSystems.QUEUE_UPDATE_GROUP` system group. Supports parallel execution.

On each tick:
1. If `DynamicLight.consumeNetworkOutdated()` returns true:
   - If the entity has a `ColorLight`, queues a `DynamicLightUpdate` to all viewers.
   - If the `ColorLight` is null (light removed), queues a `ComponentUpdateType.DynamicLight` removal to all viewers.
2. Otherwise, if `newlyVisibleTo` is non-empty and a `ColorLight` exists, queues the update to newly visible viewers only.

### NewSpawnEntityTrackerUpdate


public static class NewSpawnEntityTrackerUpdate extends EntityTickingSystem<EntityStore>

Per-tick system that sends `NewSpawnUpdate` packets to players who have just entered visibility range of a recently spawned entity. Runs in the `EntityTrackerSystems.QUEUE_UPDATE_GROUP` system group. Supports parallel execution.

Only sends to `newlyVisibleTo` viewers -- does not re-send to already-visible viewers.

### NewSpawnTick


public static class NewSpawnTick extends EntityTickingSystem<EntityStore>

Per-tick system that manages the lifetime of the `NewSpawnComponent` marker. Each tick calls `newSpawnComponent.newSpawnWindowPassed(dt)` to check whether the spawn animation window has elapsed. When it returns true, removes the `NewSpawnComponent` from the entity via the command buffer. Supports parallel execution.

### OnLoadFromExternal


public static class OnLoadFromExternal extends HolderSystem<EntityStore>

Holder system that assigns a version 3 UUID to entities loaded from prefabs or world generation. Queries for entities that have either `FromPrefab` or `FromWorldGen` plus a `UUIDComponent`.

Declares ordering dependencies:
- **BEFORE** `EntityStore.UUIDSystem` (so the UUID is set before the UUID system processes it)
- **AFTER** `EntityModule.LegacyUUIDSystem` (so legacy UUID assignment runs first)

Runs in the specified `SystemGroup` passed to the constructor.

- **onEntityAdd**: Replaces the entity's UUID with a newly generated version 3 UUID via `UUIDComponent.generateVersion3UUID()`.
- **onEntityRemoved**: No-op.

### UnloadEntityFromChunk


public static class UnloadEntityFromChunk extends RefSystem<EntityStore>

Ref system that handles cleanup when an entity is removed from the store. Queries for entities with `TransformComponent`.

- **onEntityAdded**: No-op.
- **onEntityRemove**: Reads the entity's chunk reference from `TransformComponent`. If the chunk reference is valid, looks up the `EntityChunk` component and calls either `removeEntityReference()` (for `RemoveReason.REMOVE`) or `unloadEntityReference()` (for `RemoveReason.UNLOAD`).

## Related Types

- AudioSystems -- audio tracker systems
- TransformSystems -- transform tracker systems
- ModelSystems -- model and bounding box systems
- UpdateLocationSystems -- chunk location tracking
- `FromPrefab` -- marker component for prefab-spawned entities
- `FromWorldGen` -- marker component for worldgen-spawned entities
- `DynamicLight` -- ECS component for entity dynamic lighting
- `NewSpawnComponent` -- ECS component marking recently spawned entities
- `UUIDComponent` -- ECS component holding entity UUIDs
- `EntityTrackerSystems.Visible` -- visibility tracking component
