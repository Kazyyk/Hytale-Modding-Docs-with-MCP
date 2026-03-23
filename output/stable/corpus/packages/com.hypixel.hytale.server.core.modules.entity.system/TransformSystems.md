# TransformSystems

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.system

public class TransformSystems

Container class for ECS systems that handle entity transform (position and rotation) lifecycle and network synchronization. Contains a tracker update system for sending transform changes to clients and a cleanup system for entity removal.

## Inner Classes

### EntityTrackerUpdate


public static class EntityTrackerUpdate extends EntityTickingSystem<EntityStore>

Per-tick system that sends `TransformUpdate` packets to visible players when an entity's position or rotation changes. Runs in the `EntityTrackerSystems.QUEUE_UPDATE_GROUP` system group. Supports parallel execution.

Queries for entities matching both `EntityTrackerSystems.Visible` and `TransformComponent`.

On each tick:
1. Reads the current position, body rotation, and head rotation (from `HeadRotation` component, if present; otherwise `Vector3f.ZERO`).
2. Compares against the `sentTransform` stored in the `TransformComponent` using `PositionUtil.equals()`.
3. If position, look orientation, or body orientation has changed:
   - Updates the `sentTransform` fields.
   - Queues a `TransformUpdate` to all viewers in `visibleTo`, excluding the entity itself (to avoid sending self-updates).
4. If nothing changed but `newlyVisibleTo` is non-empty:
   - Queues the current transform to newly visible viewers only, including the entity itself.

### OnRemove


public static class OnRemove extends HolderSystem<EntityStore>

Holder system that clears the chunk location reference from `TransformComponent` when an entity is removed from the store. Queries for entities with `TransformComponent`.

- **onEntityAdd**: No-op.
- **onEntityRemoved**: Calls `TransformComponent.setChunkLocation(null, null)` to release the chunk reference.

## Related Types

- AudioSystems -- audio tracker update follows a similar pattern
- ModelSystems -- animation tracker update follows a similar pattern
- SnapshotSystems -- captures transform snapshots for lag compensation
- UpdateLocationSystems -- manages chunk assignment based on position
- EntitySystems -- contains `UnloadEntityFromChunk` for chunk cleanup
- `TransformComponent` -- ECS component holding position, rotation, and chunk reference
- `HeadRotation` -- optional ECS component for head orientation
- `EntityTrackerSystems.Visible` -- visibility tracking component
- `PositionUtil` -- utility for comparing positions and directions

Also in this package: Add, AdventurePlayerSystem, AnimationEntityTrackerUpdate, ApplyRandomSkin, AssignNetworkIdToProps, AudioSystems, Capture, ClearFromPrefabMarker, ClearFromWorldGenMarker, ClearMarker, DynamicLightTracker, EnsurePropsPrefabCopyable, EntityInteractableSystems, EntitySpatialSystem, EntitySystems, EntityTrackerAddAndRemove, EntityTrackerAddAndRemove, EntityTrackerAddAndRemove, EntityTrackerAddAndRemove, EntityTrackerUpdate (and 40 more)
