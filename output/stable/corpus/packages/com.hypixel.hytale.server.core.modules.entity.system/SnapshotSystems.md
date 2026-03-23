# SnapshotSystems

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.system

public class SnapshotSystems

Container class for ECS systems that maintain a rolling history of entity transform snapshots. This snapshot buffer is used for server-side lag compensation (rewinding entity positions to verify hit registration at the time a client fired). The default history length is 500 milliseconds.

## Fields


public static long HISTORY_LENGTH_NS = TimeUnit.MILLISECONDS.toNanos(500L)

The target history duration in nanoseconds. Defaults to 500ms. This value can be changed at runtime; the `Resize` system will detect the change and resize all snapshot buffers accordingly.

## Inner Classes

### Add


public static class Add extends HolderSystem<EntityStore>

Holder system that initializes a `SnapshotBuffer` for every entity with a `TransformComponent` when it is added to the store. Ensures the component exists via `holder.ensureAndGetComponent()` and resizes the buffer to the current `historySize` from the `SnapshotWorldInfo` resource.

### Capture


public static class Capture extends EntityTickingSystem<EntityStore>

Per-tick system that records the current transform into the snapshot buffer. Declares dependencies to run `AFTER` `Resize` and at the closest root priority.

On the store-level tick, increments the `currentTick` counter in `SnapshotWorldInfo`.

On each per-entity tick, stores a snapshot of the entity's current position and rotation at the current tick index via `SnapshotBuffer.storeSnapshot()`.

Queries for entities matching `TransformComponent` and `SnapshotBuffer`. Supports parallel execution.

### Resize


public static class Resize extends EntityTickingSystem<EntityStore>

Per-tick system that recalculates the snapshot buffer size when the world tick rate or history length changes. Declares a `RootDependency` with first priority so it runs before other snapshot systems.

On the store-level tick:
1. Reads the world's tick step in nanoseconds.
2. Compares against the stored `tickLengthNanos` and `historyLength` in `SnapshotWorldInfo`.
3. If either has changed, recalculates `historySize = ceil(historyLength / tickLength)` (minimum 1).
4. Only invokes per-entity ticks when a resize is needed.

On each per-entity tick: resizes the entity's `SnapshotBuffer` to the new `historySize`.

Supports parallel execution.

### SnapshotWorldInfo


public static class SnapshotWorldInfo implements Resource<EntityStore>

Store-scoped resource that holds shared snapshot configuration state:

- tickLengthNanos | int | World tick step in nanoseconds (initialized to -1).
- historyLength | long | Target history duration in nanoseconds (initialized to -1).
- historySize | int | Number of snapshot slots (initialized to 1).
- currentTick | int | Rolling tick counter (initialized to -1).

Provides two constructors: a default no-arg constructor and a full constructor for cloning. The resource type is obtained from `EntityModule.get().getSnapshotWorldInfoResourceType()`.

## Related Types

- TransformSystems -- provides transform data that is captured
- UpdateLocationSystems -- location tracking for chunk management
- `SnapshotBuffer` -- ECS component holding the circular buffer of position/rotation snapshots
- `TransformComponent` -- provides the position and rotation to capture
- `EntityModule` -- registers these systems and provides the resource type

Also in this package: Add, AdventurePlayerSystem, AnimationEntityTrackerUpdate, ApplyRandomSkin, AssignNetworkIdToProps, AudioSystems, Capture, ClearFromPrefabMarker, ClearFromWorldGenMarker, ClearMarker, DynamicLightTracker, EnsurePropsPrefabCopyable, EntityInteractableSystems, EntitySpatialSystem, EntitySystems, EntityTrackerAddAndRemove, EntityTrackerAddAndRemove, EntityTrackerAddAndRemove, EntityTrackerAddAndRemove, EntityTrackerUpdate (and 40 more)

Fields:
public static long HISTORY_LENGTH_NS
private static final HytaleLogger LOGGER
