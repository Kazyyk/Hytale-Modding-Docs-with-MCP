# World

Type: class | Package: com.hypixel.hytale.server.core.universe.world | Extends: TickingThread | Implements: Executor, ExecutorMetricsRegistry.ExecutorMetric, ChunkAccessor, IWorldChunks, IMessageReceiver

public class World extends TickingThread implements Executor, ExecutorMetricsRegistry.ExecutorMetric, ChunkAccessor<WorldChunk>, IWorldChunks, IMessageReceiver

Central class representing a game world. Runs on its own `TickingThread`, owns a `ChunkStore` and `EntityStore`, manages player connections, chunk lighting, world map, event dispatching, and world lifecycle (start, tick, pause, save, shutdown). Worlds are named and persisted to a save directory with a `WorldConfig`. Client features (health bars, combat text, armor visibility) are configured at construction time from gameplay config.

## Constants

- SAVE_INTERVAL | float | 10.0F | World save interval in seconds.
- DEFAULT | String | "default" | Default world name.

## Key Fields

- name | String | World name (thread name is `"WorldThread - " + name`).
- savePath | Path | Directory for persistent world data.
- worldConfig | WorldConfig | Configuration including seed, spawn, world gen, game mode, etc.
- chunkStore | ChunkStore | Chunk-level ECS storage manager.
- entityStore | EntityStore | Entity-level ECS storage manager.
- chunkLighting | ChunkLightingManager | Manages chunk light propagation.
- worldMapManager | WorldMapManager | Manages world map images and markers.
- eventRegistry | EventRegistry | World-scoped event bus.
- notificationHandler | WorldNotificationHandler | Sends block change notifications to players.
- players | Map<UUID, PlayerRef> | Connected players indexed by UUID.
- features | Map<ClientFeature, Boolean> | Client feature toggles.
- taskQueue | Deque<Runnable> | Thread-safe queue for tasks to execute on the world thread.

## Key Methods

- getName() | String | Returns the world name.
- getWorldConfig() | WorldConfig | Returns the world configuration.
- getEntityStore() | EntityStore | Returns the entity store.
- getChunkStore() | ChunkStore | Returns the chunk store.
- getPlayerRefs() | Collection<PlayerRef> | Returns an unmodifiable view of connected player refs.
- getWorldMapManager() | WorldMapManager | Returns the world map manager.
- getNotificationHandler() | WorldNotificationHandler | Returns the block notification handler.
- getEventRegistry() | EventRegistry | Returns the world event registry.
- execute(Runnable) | void | Submits a task to the world thread queue.

## See Also

- WorldConfig
- WorldNotificationHandler
- WorldMapTracker
- WorldProvider
