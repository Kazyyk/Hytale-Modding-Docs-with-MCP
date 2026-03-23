# ChunkTracker

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Implements: Component<EntityStore>

public class ChunkTracker implements Component<EntityStore>

An ECS component that manages chunk loading, unloading, and visibility for a connected player. Uses a spiral-outward iteration pattern to progressively load chunks within the player's view radius. Tracks loaded and loading chunk sets with `StampedLock` concurrency, and classifies chunks as HOT (ticking, near the player) or COLD (loaded but further away).

Chunk loading is rate-limited by configurable per-second and per-tick caps that vary based on connection type (local, LAN, or remote).

## Constants

- MAX_CHUNKS_PER_SECOND_LOCAL | int | 256 | Maximum chunk send rate for local connections.
- MAX_CHUNKS_PER_SECOND_LAN | int | 128 | Maximum chunk send rate for LAN connections.
- MAX_CHUNKS_PER_SECOND | int | 36 | Maximum chunk send rate for remote connections.
- MAX_CHUNKS_PER_TICK | int | 4 | Maximum chunks that can begin loading per tick.
- MIN_LOADED_CHUNKS_RADIUS | int | 2 | Minimum radius of loaded chunks around the player.
- MAX_HOT_LOADED_CHUNKS_RADIUS | int | 8 | Maximum radius for "hot" (ticking) chunks.
- MAX_FAILURE_BACKOFF_NANOS | long | TimeUnit.SECONDS.toNanos(10L) | Backoff duration after a chunk load failure.

## Static Fields

- METRICS_REGISTRY | MetricsRegistry<ChunkTracker> | Metrics registry exposing view radius, loaded/loading counts, and readiness.

## Static Methods


public static ComponentType<EntityStore, ChunkTracker> getComponentType()

Returns the component type from `EntityModule.get().getChunkTrackerComponentType()`.


public static boolean tryUnloadChunk(long chunkIndex, int chunkViewRadiusSquared, int chunkX, int chunkZ, @Nonnull PlayerRef playerRef, @Nonnull LongSet loading)

Attempts to unload a chunk if it is outside the player's view radius. Sends unload packets to the client and removes the chunk from the loading set. Returns `true` if the chunk was unloaded.

## Constructors


public ChunkTracker()

Creates a tracker with default radius values: `minLoadedChunksRadius = 2`, `maxHotLoadedChunksRadius = 8`, `maxChunksPerTick = 4`.

## Methods


public void unloadAll(@Nonnull PlayerRef playerRefComponent)

Unloads all tracked chunks, sending `UnloadChunk` packets to the client for each loaded chunk.


public void clear()

Clears all loading and loaded sets and resets radii without sending packets.


public void tick(@Nonnull Player playerComponent, @Nonnull PlayerRef playerRefComponent, @Nonnull TransformComponent transformComponent, float dt, @Nonnull CommandBuffer<EntityStore> commandBuffer)

Main per-tick update. Unloads out-of-range chunks, loads new chunks within the view radius using spiral iteration, and promotes near chunks to HOT/ticking status.


public boolean isLoaded(long indexChunk)

Returns `true` if the specified chunk index is in the loaded set.


public void removeForReload(long indexChunk)

Marks a chunk for reload if it should be visible to this player.


public boolean shouldBeVisible(long chunkCoordinates)

Returns `true` if the given chunk coordinates fall within the player's current view radius.


@Nonnull
public ChunkTracker.ChunkVisibility getChunkVisibility(long indexChunk)

Returns the ChunkVisibility classification for a chunk: `HOT`, `COLD`, or `NONE`.


public int getMaxChunksPerSecond()

Returns the configured maximum chunks per second send rate.


public void setMaxChunksPerSecond(int maxChunksPerSecond)

Sets the maximum chunks per second and recalculates the inverse.


public void setDefaultMaxChunksPerSecond(@Nonnull PlayerRef playerRef)

Sets the max chunks per second based on connection type: 256 for local, 128 for LAN, 36 for remote.


public int getMaxChunksPerTick()

Returns the maximum chunks that can begin loading per tick.


public void setMaxChunksPerTick(int maxChunksPerTick)

Sets the maximum chunks per tick.


public int getMinLoadedChunksRadius()

Returns the minimum loaded chunks radius.


public void setMinLoadedChunksRadius(int minLoadedChunksRadius)

Sets the minimum loaded chunks radius.


public int getMaxHotLoadedChunksRadius()

Returns the maximum radius for hot (ticking) chunks.


public void setMaxHotLoadedChunksRadius(int maxHotLoadedChunksRadius)

Sets the maximum hot loaded chunks radius.


public int getLoadedChunksCount()

Returns the number of loaded chunks. Uses optimistic read locking.


public int getLoadingChunksCount()

Returns the number of chunks currently being loaded. Uses optimistic read locking.


@Nonnull
public Message getLoadedChunksMessage()

Returns a `Message` containing a grid visualization and statistics of loaded chunks.


@Nonnull
public String getLoadedChunksDebug()

Returns a debug string with a text grid of chunk states and summary statistics.


public void setReadyForChunks(boolean readyForChunks)

Sets whether the player is ready to receive chunk data.


public boolean isReadyForChunks()

Returns `true` if the player is ready to receive chunk data.


public void copyFrom(@Nonnull ChunkTracker chunkTracker)

Copies loading, loaded, and reload sets from another `ChunkTracker`.


public void tryLoadChunkAsync(@Nonnull ChunkStore chunkStore, @Nonnull PlayerRef playerRefComponent, long chunkIndex, @Nonnull TransformComponent transformComponent, @Nonnull ComponentAccessor<EntityStore> componentAccessor)

Asynchronously loads a chunk and sends its packets to the client. Handles hot-chunk promotion and failure backoff.


@Nonnull
@Override
public Component<EntityStore> clone()

Returns a new `ChunkTracker` with copied state.

## Inner Types

- ChunkTracker.ChunkVisibility -- enum classifying chunk proximity

## Related Types

- PlayerChunkTrackerSystems -- systems that initialize and tick the chunk tracker
