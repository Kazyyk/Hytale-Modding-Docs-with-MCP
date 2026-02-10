---
title: World
kind: class
package: com.hypixel.hytale.server.core.universe.world
api_surface: true
extends: TickingThread
implements:
  - Executor
  - ExecutorMetricsRegistry.ExecutorMetric
  - ChunkAccessor<WorldChunk>
  - IWorldChunks
  - IMessageReceiver
generator_version: "1.0.0"
generated_at: "2026-02-09T23:45:00Z"
tags:
  - universe
  - world
  - ticking
  - executor
  - chunk
  - entity
  - player
---

**Package:** `com.hypixel.hytale.server.core.universe.world`

```java
public class World extends TickingThread implements Executor, ExecutorMetricsRegistry.ExecutorMetric, ChunkAccessor<WorldChunk>, IWorldChunks, IMessageReceiver
```

The central game world class. Each `World` runs its own tick loop (via `TickingThread`), owns an `EntityStore` and `ChunkStore` for ECS data, maintains a world-scoped [EventRegistry](EventRegistry.md), and manages all players currently in the world. Worlds are created and managed by [Universe](Universe.md).

A `World` acts as an `Executor` -- tasks can be submitted to it via `execute()` and they will run on the world's tick thread, ensuring thread-safe access to the world's stores and state.

## Constants

```java
public static final float SAVE_INTERVAL = 10.0F
```

The interval in seconds between automatic world saves.

```java
public static final String DEFAULT = "default"
```

The name used for the default world.

## Constructor

```java
public World(@Nonnull String name, @Nonnull Path savePath, @Nonnull WorldConfig worldConfig) throws IOException
```

Creates a new world with the given name, save directory, and configuration. The world is not yet ticking after construction -- call `init()` to start it.

## Initialization

```java
@Nonnull
public CompletableFuture<World> init()
```

Initializes the world asynchronously. Sets up the chunk store, entity store, lighting manager, world map, and event registry. Returns a future that completes when the world is ready to tick.

## Identity and Configuration

```java
@Nonnull
public String getName()
```

Returns the world's name as provided to the constructor.

```java
public boolean isAlive()
```

Returns `true` if the world's tick thread is still running.

```java
@Nonnull
public WorldConfig getWorldConfig()
```

Returns the `WorldConfig` that was used to create this world. Contains world generation settings, dimension properties, and other structural configuration.

```java
@Nonnull
public GameplayConfig getGameplayConfig()
```

Returns the gameplay configuration for this world, controlling game rules and mechanics.

```java
@Nonnull
public DeathConfig getDeathConfig()
```

Returns the death configuration for this world, controlling respawn behavior and death penalties.

## Tick State

```java
public boolean isTicking()
```

Returns `true` if the world is actively running tick cycles.

```java
public void setTicking(boolean ticking)
```

Enables or disables the world's tick loop. A world that is not ticking does not process entities, chunks, or scheduled tasks.

```java
public boolean isPaused()
```

Returns `true` if the world is paused. A paused world still runs its tick thread but skips gameplay processing.

```java
public void setPaused(boolean paused)
```

Pauses or unpauses the world.

```java
public long getTick()
```

Returns the current tick number. Increments by one each tick cycle.

## Time Dilation

```java
public static void setTimeDilation(float timeDilationModifier, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
```

Adjusts the time dilation modifier for the given entity store. Time dilation scales the effective tick rate for gameplay systems without changing the actual tick frequency.

## ECS Stores

```java
@Nonnull
public ChunkStore getChunkStore()
```

Returns the world's [chunk store](Store.md). The `ChunkStore` manages chunk-level ECS data including terrain, block states, and lighting. Chunk store components are registered via [ComponentRegistryProxy](ComponentRegistryProxy.md).

```java
@Nonnull
public EntityStore getEntityStore()
```

Returns the world's [entity store](Store.md). The `EntityStore` manages game entities (players, mobs, items, projectiles). Entity store components are registered via [ComponentRegistryProxy](ComponentRegistryProxy.md).

## Lighting

```java
@Nonnull
public ChunkLightingManager getChunkLighting()
```

Returns the chunk lighting manager for this world.

## World Map

```java
@Nonnull
public WorldMapManager getWorldMapManager()
```

Returns the world map manager, which handles map-level data and rendering.

## Events

```java
@Nonnull
public EventRegistry getEventRegistry()
```

Returns the world-scoped [EventRegistry](EventRegistry.md). Events registered here are scoped to this world instance and are cleaned up when the world is destroyed. This is distinct from the global `EventBus` -- world-scoped events only fire for activity within this world.

## Player Management

Players in a world are tracked as `PlayerRef` instances in a `ConcurrentHashMap<UUID, PlayerRef>`.

```java
@Nullable
public CompletableFuture<PlayerRef> addPlayer(@Nonnull PlayerRef playerRef)
```

Adds a player to this world at their current transform. Dispatches [`AddPlayerToWorldEvent`](../events/AddPlayerToWorldEvent.md). Returns a future that completes when the player is fully added, or `null` if the add fails.

```java
@Nullable
public CompletableFuture<PlayerRef> addPlayer(@Nonnull PlayerRef playerRef, @Nullable Transform transform)
```

Adds a player to this world at a specific transform. If `transform` is `null`, the world's default spawn position is used. Dispatches [`AddPlayerToWorldEvent`](../events/AddPlayerToWorldEvent.md).

```java
@Nonnull
public CompletableFuture<Void> drainPlayersTo(@Nonnull World fallbackTargetWorld)
```

Removes all players from this world and transfers them to the specified fallback world. Dispatches [`DrainPlayerFromWorldEvent`](../events/DrainPlayerFromWorldEvent.md) for each player. Used during world shutdown or reset.

```java
public int getPlayerCount()
```

Returns the number of players currently in this world.

```java
@Nonnull
public Collection<PlayerRef> getPlayerRefs()
```

Returns an unmodifiable view of all [PlayerRef](PlayerRef.md) instances currently in this world.

```java
public void trackPlayerRef(@Nonnull PlayerRef playerRef)
```

Begins tracking a player reference in this world's player map. Called internally during the add-player flow.

```java
public void untrackPlayerRef(@Nonnull PlayerRef playerRef)
```

Stops tracking a player reference in this world's player map. Called internally during the remove-player flow.

## Entity Management

```java
@Deprecated
@Nullable
public <T extends Entity> T spawnEntity(T entity, @Nonnull Vector3d position, Vector3f rotation)
```

**Deprecated.** Spawns an entity at the given position and rotation. This method is a convenience wrapper that delegates to `addEntity` with `AddReason.SPAWN`. Prefer using the entity store directly for new code.

```java
@Deprecated
@Nullable
public <T extends Entity> T addEntity(T entity, @Nonnull Vector3d position, @Nullable Vector3f rotation, @Nonnull AddReason reason)
```

**Deprecated.** Adds an entity to this world's entity store at the given position with the specified add reason. Returns the entity if successful, or `null` if the add fails. Prefer using the entity store directly for new code.

```java
@Nullable
public Ref<EntityStore> getEntityRef(@Nonnull UUID uuid)
```

Returns the [Ref](Ref.md) for the entity with the given UUID, or `null` if no such entity exists in this world's entity store.

```java
@Nullable
@Deprecated
public Entity getEntity(@Nonnull UUID uuid)
```

**Deprecated.** Returns the `Entity` component for the entity with the given UUID, or `null` if not found. Prefer `getEntityRef()` and component access via the entity store.

## Messaging

```java
@Override
public void sendMessage(@Nonnull Message message)
```

Broadcasts a message to all players in this world. Implements `IMessageReceiver`. The message is forwarded to every tracked [PlayerRef](PlayerRef.md).

## Executor

```java
@Override
public void execute(@Nonnull Runnable command)
```

Submits a task to be executed on this world's tick thread. Implements `Executor`. This is the primary mechanism for scheduling thread-safe mutations to the world's state from external threads.

## Client Features

```java
public boolean isFeatureEnabled(@Nonnull ClientFeature feature)
```

Returns `true` if the specified client feature is enabled for this world.

```java
public void registerFeature(@Nonnull ClientFeature feature, boolean enabled)
```

Registers or updates a client feature's enabled state for this world. Client features control client-side behavior such as rendering modes and UI elements.

## Persistence

```java
@Nonnull
public Path getSavePath()
```

Returns the file-system path to this world's save directory.

## Chunk Access

As a `ChunkAccessor<WorldChunk>` and `IWorldChunks` implementation, `World` provides chunk access methods. These are the primary entry points for loading and querying chunks:

- `getChunkAsync` -- asynchronously loads a chunk, triggering generation if needed
- `getChunkIfLoaded` -- returns a chunk only if it is fully loaded
- `getChunkIfInMemory` -- returns a chunk if it is in memory (may not be fully loaded)
- `loadChunkIfInMemory` -- loads a chunk from the in-memory cache without disk access
- `getNonTickingChunkAsync` -- loads a chunk without adding it to the tick loop

Purpose unknown for exact signatures -- inferred from interface contracts and usage context.

## Related Types

- [Universe](Universe.md) -- top-level container that manages all worlds
- [PlayerRef](PlayerRef.md) -- persistent player reference, managed per-world
- [Store](Store.md) -- base ECS store class; `World` owns an `EntityStore` and `ChunkStore`
- [Ref](Ref.md) -- entity reference handle used with the entity store
- [ComponentType](ComponentType.md) -- type-safe key for component access on stores
- [ComponentRegistryProxy](ComponentRegistryProxy.md) -- plugin-scoped ECS registration
- [EventRegistry](EventRegistry.md) -- world-scoped event registration
- [PluginBase](PluginBase.md) -- plugin entry point that accesses worlds through `Universe`
- [`AddPlayerToWorldEvent`](../events/AddPlayerToWorldEvent.md) -- fired when a player enters this world
- [`DrainPlayerFromWorldEvent`](../events/DrainPlayerFromWorldEvent.md) -- fired when a player is drained from this world
- [`PlayerConnectEvent`](../events/PlayerConnectEvent.md) -- fired during player connection, contains mutable world field
- `WorldConfig` -- structural configuration for world creation
- `GameplayConfig` -- gameplay rules configuration
- `DeathConfig` -- death and respawn configuration
- `ChunkLightingManager` -- chunk lighting system
- `WorldMapManager` -- world map data management
- `TickingThread` -- base class providing the tick loop
- `ClientFeature` -- client-side feature flags
- `Entity` -- base entity component
- `Transform` -- position and rotation data
