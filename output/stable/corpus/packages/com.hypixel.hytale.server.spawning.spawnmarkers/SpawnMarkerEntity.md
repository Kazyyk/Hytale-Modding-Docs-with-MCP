# SpawnMarkerEntity

Type: class | Package: com.hypixel.hytale.server.spawning.spawnmarkers | Implements: Component<EntityStore>

public class SpawnMarkerEntity implements Component<EntityStore>

ECS component for spawn marker entities. Tracks the marker's spawn state including the referenced `SpawnMarker` asset, respawn timer, NPC references, flock data, suppression state, and deactivation behavior. Handles the full spawn lifecycle: validation, position testing, NPC creation, flock integration, and failure handling with automatic removal after 5 consecutive failures.

## Key Constants

- SPAWN_LOST_TIMEOUT | double | 35.0 | Seconds before a lost spawn connection triggers respawn.
- MAX_FAILED_SPAWNS | int | 5 | Consecutive failures before the marker entity is removed.

## Methods

- getComponentType() | ComponentType<EntityStore, SpawnMarkerEntity> | Returns the registered component type from `SpawningPlugin`.
- getCachedMarker() | SpawnMarker | Returns the cached asset reference.
- setCachedMarker(SpawnMarker) | void | Sets the cached asset reference.
- getSpawnCount() | int | Number of currently spawned NPCs.
- setSpawnCount(int) | void | Sets the spawn count.
- tickRespawnTimer(float dt) | boolean | Decrements the realtime respawn counter, returning `true` when it reaches zero.
- spawnNPC(Ref, SpawnMarker, Store) | boolean | Attempts to spawn an NPC from the marker's weighted configurations. Performs role validation, exclusion radius checks, position testing, and flock spawning.
- trigger(Ref, Store) | boolean | Manually triggers a spawn for manual-trigger markers when spawn count is zero.
- suppress(UUID) | void | Adds a suppressor UUID to prevent spawning.
- releaseSuppression(UUID) | void | Removes a suppressor.
- getStoredFlock() | StoredFlock | Returns stored flock data for deactivation/reactivation.
- getNpcReferences() | InvalidatablePersistentRef[] | Returns persistent references to spawned NPCs.
- isManualTrigger() | boolean | Whether this marker requires manual triggering.

## Serialized Fields (CODEC)

`SpawnMarker` (String), `RespawnTime` (double), `SpawnCount` (int), `GameTimeRespawn` (Duration), `SpawnAfter` (Instant), `NPCReferences` (InvalidatablePersistentRef[]), `PersistedFlock` (StoredFlock), `SpawnPosition` (Vector3d)
