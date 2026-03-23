# UpdateLocationSystems

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.system

public class UpdateLocationSystems

Container class for ECS systems and helper methods that manage entity-to-chunk assignments. When entities move, these systems ensure they are tracked in the correct `EntityChunk` and handle edge cases like entities falling below the world or moving into unloaded chunks.

## Fields


@Nonnull
private static final Message MESSAGE_GENERAL_PLAYER_IN_INVALID_CHUNK = Message.translation("server.general.playerInInvalidChunk")

Localized message sent to players when they end up in an invalid chunk.


@Nonnull
private static final HytaleLogger LOGGER = HytaleLogger.forEnclosingClass()

## Static Helper Methods

The class contains several private static methods that implement the core chunk-update logic:

**`updateLocation(ref, transformComponent, world, commandBuffer)`** -- The main entry point. Converts the entity's position to chunk coordinates (bitwise shift right by 5, i.e., chunks are 32 blocks wide). If the chunk has changed from the old chunk:
- Looks up the new chunk reference. If the chunk is loaded, calls `updateChunk()`.
- If the chunk is not loaded, schedules an async chunk load via `getChunkReferenceAsync()` and processes the result on the world's executor.
- Entities below Y=-32 that are not players are removed with `RemoveReason.REMOVE`.

**`updateChunk(ref, transformComponent, oldChunkRef, newChunkRef, newWorldChunk, ...)`** -- Validates the new chunk. If it is null or not initialized (`ChunkFlag.INIT`), handles the invalid chunk case. Otherwise, for non-player entities, updates the `EntityChunk` tracking and sets the new chunk location on the `TransformComponent`.

**`handleInvalidChunk(ref, transformComponent, isPlayer, ...)`** -- For non-player entities, logs a severe error and removes the entity. For players, teleports them 32 blocks in the negative X direction and sends a warning message.

**`updateEntityInChunk(ref, oldChunkRef, newChunkRef, ...)`** -- Removes the entity reference from the old chunk (if valid) and adds it to the new chunk. If the new chunk is not ticking (`ChunkFlag.TICKING`), unloads the entity instead.

## Inner Classes

### SpawnSystem


public static class SpawnSystem extends RefSystem<EntityStore>

Ref system that assigns entities to chunks when they first spawn. Queries for entities with `TransformComponent`.

- **onEntityAdded**: Checks whether the entity's `TransformComponent` already has a valid chunk reference. If not, calls `updateLocation()` to assign the entity to the correct chunk.
- **onEntityRemove**: No-op.

### TickingSystem


public static class TickingSystem extends EntityTickingSystem<EntityStore>

Per-tick system that updates entity chunk assignments every tick. Queries for entities with `TransformComponent`.

On each tick: reads the entity's `TransformComponent` and the world from the command buffer's external data, then calls `updateLocation()` to check and update the chunk assignment if the entity has moved.

## Related Types

- TransformSystems -- clears chunk location on entity removal
- EntitySystems -- `UnloadEntityFromChunk` handles the chunk side of entity removal
- SnapshotSystems -- also accesses `World` from external data
- `TransformComponent` -- holds the entity's position and chunk reference
- `EntityChunk` -- chunk-side component tracking which entities are in the chunk
- `WorldChunk` -- chunk metadata including flags and coordinates
- `Teleport` -- component used to teleport players out of invalid chunks
- `ChunkFlag` -- flags indicating chunk state (`INIT`, `TICKING`)

Also in this package: Add, AdventurePlayerSystem, AnimationEntityTrackerUpdate, ApplyRandomSkin, AssignNetworkIdToProps, AudioSystems, Capture, ClearFromPrefabMarker, ClearFromWorldGenMarker, ClearMarker, DynamicLightTracker, EnsurePropsPrefabCopyable, EntityInteractableSystems, EntitySpatialSystem, EntitySystems, EntityTrackerAddAndRemove, EntityTrackerAddAndRemove, EntityTrackerAddAndRemove, EntityTrackerAddAndRemove, EntityTrackerUpdate (and 40 more)

Complete API:
  private static void updateLocation(Ref<EntityStore> ref, TransformComponent transformComponent, World world, CommandBuffer<EntityStore> commandBuffer)
  private static void updateChunkAsync(Ref<EntityStore> ref, Ref<ChunkStore> newChunkRef, WorldChunk newWorldChunk, Store<ChunkStore> chunkComponentStore)
  private static void updateChunk(Ref<EntityStore> ref, TransformComponent transformComponent, Ref<ChunkStore> oldChunkRef, Ref<ChunkStore> newChunkRef, WorldChunk newWorldChunkComponent, ComponentAccessor<ChunkStore> chunkComponentStore, ComponentAccessor<EntityStore> entityComponentAccessor)
  private static void handleInvalidChunk(Ref<EntityStore> ref, TransformComponent transformComponent, boolean isPlayer, ComponentAccessor<EntityStore> entityComponentAccessor)
  private static void updateEntityInChunk(Ref<EntityStore> ref, Ref<ChunkStore> oldChunkRef, Ref<ChunkStore> newChunkRef, WorldChunk newWorldChunk, ComponentAccessor<ChunkStore> chunkComponentStore, ComponentAccessor<EntityStore> entityComponentAccessor)

Fields:
private static final Message MESSAGE_GENERAL_PLAYER_IN_INVALID_CHUNK
private static final HytaleLogger LOGGER
