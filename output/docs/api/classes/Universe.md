---
title: Universe
kind: class
package: com.hypixel.hytale.server.core.universe
api_surface: true
extends: JavaPlugin
implements:
  - IMessageReceiver
  - MetricProvider
generator_version: "1.0.0"
generated_at: "2026-02-09T23:45:00Z"
tags:
  - universe
  - world
  - player
  - singleton
  - plugin
  - lifecycle
---

**Package:** `com.hypixel.hytale.server.core.universe`

```java
public class Universe extends JavaPlugin implements IMessageReceiver, MetricProvider
```

The top-level container for all worlds and connected players on a Hytale server. `Universe` is a singleton -- accessed via `Universe.get()` -- and is itself a plugin (`JavaPlugin`), meaning it participates in the standard plugin lifecycle.

`Universe` manages the complete player connection flow: when a player connects, it creates the player entity, dispatches [`PlayerConnectEvent`](../events/PlayerConnectEvent.md), and adds the player to a [World](World.md). When a player disconnects, it dispatches [`PlayerDisconnectEvent`](../events/PlayerDisconnectEvent.md) and cleans up the player's state.

## Singleton Access

```java
public static Universe get()
```

Returns the singleton `Universe` instance. This is the primary entry point for accessing the world and player management APIs.

## World Management

Worlds are stored in a `ConcurrentHashMap<String, World>` keyed by world name.

### Creating Worlds

```java
@Nonnull
@CheckReturnValue
public CompletableFuture<World> addWorld(@Nonnull String name)
```

Creates and adds a new [World](World.md) with the given name using default configuration and save path. Returns a future that completes when the world is initialized and ready.

```java
@Nonnull
@CheckReturnValue
public CompletableFuture<World> makeWorld(@Nonnull String name, @Nonnull Path savePath, @Nonnull WorldConfig worldConfig)
```

Creates and adds a new [World](World.md) with explicit save path and configuration. This is the lower-level factory method that `addWorld` delegates to. Returns a future that completes when the world is initialized.

```java
@Nonnull
@CheckReturnValue
public CompletableFuture<World> loadWorld(@Nonnull String name)
```

Loads an existing [World](World.md) from disk by name. The world's save directory and configuration are read from the server's world storage. Returns a future that completes when the world is loaded and ready.

### Querying Worlds

```java
@Nullable
public World getWorld(@Nullable String worldName)
```

Returns the [World](World.md) with the given name, or `null` if no such world exists. Returns `null` if `worldName` is `null`.

```java
@Nullable
public World getWorld(@Nonnull UUID uuid)
```

Returns the [World](World.md) with the given UUID, or `null` if no such world exists.

```java
@Nullable
public World getDefaultWorld()
```

Returns the default world (the world named `"default"`), or `null` if no default world has been created.

```java
@Nonnull
public Map<String, World> getWorlds()
```

Returns an unmodifiable view of all worlds, keyed by name.

### Removing Worlds

```java
public boolean removeWorld(@Nonnull String name)
```

Removes a world by name. Players in the world should be drained first via [`World.drainPlayersTo()`](World.md). Returns `true` if the world was found and removed.

## Player Management

Connected players are stored in a `ConcurrentHashMap<UUID, PlayerRef>`.

### Player Lookup

```java
@Nonnull
public List<PlayerRef> getPlayers()
```

Returns a list of all currently connected [PlayerRef](PlayerRef.md) instances.

```java
@Nullable
public PlayerRef getPlayer(@Nonnull UUID uuid)
```

Returns the [PlayerRef](PlayerRef.md) for the player with the given UUID, or `null` if the player is not connected.

```java
@Nullable
public PlayerRef getPlayer(@Nonnull String value, @Nonnull NameMatching matching)
```

Returns the [PlayerRef](PlayerRef.md) matching the given string value using the specified `NameMatching` strategy (exact match, case-insensitive, prefix, etc.). Returns `null` if no match is found.

```java
public int getPlayerCount()
```

Returns the number of currently connected players.

### Player Lifecycle

```java
public void removePlayer(@Nonnull PlayerRef playerRef)
```

Disconnects a player from the server. Dispatches [`PlayerDisconnectEvent`](../events/PlayerDisconnectEvent.md), removes the player from their current world, and cleans up the player's state.

```java
@Nonnull
public CompletableFuture<PlayerRef> resetPlayer(@Nonnull PlayerRef oldPlayer)
```

Resets a player's state by creating a new [PlayerRef](PlayerRef.md) with fresh ECS data while preserving the player's network connection. The old player reference is invalidated and the new one takes its place. Returns a future that completes with the new `PlayerRef`.

### Player Component Type

```java
@Nonnull
public ComponentType<EntityStore, PlayerRef> getPlayerRefComponentType()
```

Returns the [ComponentType](ComponentType.md) used to store [PlayerRef](PlayerRef.md) as a component on player entities in the entity store. This is the key for accessing a player's `PlayerRef` through the ECS.

## Messaging and Broadcasting

```java
@Override
public void sendMessage(@Nonnull Message message)
```

Broadcasts a message to all connected players across all worlds. Implements `IMessageReceiver`. For world-scoped messaging, use [`World.sendMessage()`](World.md) instead.

```java
public void broadcastPacket(@Nonnull Packet packet)
```

Sends a raw network packet to all connected players. Lower-level than `sendMessage` -- used for protocol-level broadcasts.

## Storage

```java
public PlayerStorage getPlayerStorage()
```

Returns the `PlayerStorage` instance responsible for persisting and loading player data.

```java
public WorldConfigProvider getWorldConfigProvider()
```

Returns the `WorldConfigProvider` that supplies world configuration data for world creation and loading.

## Connection Flow

The complete player connection and disconnection sequence managed by `Universe`:

### Connection

```
Client connects
    --> Universe creates player entity (Holder<EntityStore>)
    --> PlayerSetupConnectEvent dispatched
    --> PlayerConnectEvent dispatched (world field is mutable)
    --> World.addPlayer(playerRef) called
    --> AddPlayerToWorldEvent dispatched
    --> PlayerReadyEvent dispatched
```

### Disconnection

```
Client disconnects (or server kicks)
    --> PlayerSetupDisconnectEvent dispatched
    --> PlayerDisconnectEvent dispatched
    --> Player removed from World
    --> DrainPlayerFromWorldEvent dispatched (if world transfer)
    --> Player state finalized and cleaned up
```

## Related Types

- [World](World.md) -- game world instances managed by Universe
- [PlayerRef](PlayerRef.md) -- persistent player reference managed per-connection
- [PluginBase](PluginBase.md) -- base plugin class; Universe extends `JavaPlugin` which extends `PluginBase`
- [Store](Store.md) -- ECS store; each World has an EntityStore and ChunkStore
- [ComponentType](ComponentType.md) -- type key for PlayerRef component access
- [EventRegistry](EventRegistry.md) -- event registration; Universe dispatches lifecycle events
- [`PlayerConnectEvent`](../events/PlayerConnectEvent.md) -- dispatched by Universe when a player connects
- [`PlayerDisconnectEvent`](../events/PlayerDisconnectEvent.md) -- dispatched by Universe when a player disconnects
- [`PlayerSetupConnectEvent`](../events/PlayerSetupConnectEvent.md) -- dispatched early in connection before player entity exists
- [`PlayerSetupDisconnectEvent`](../events/PlayerSetupDisconnectEvent.md) -- dispatched early in disconnection
- [`PrepareUniverseEvent`](../events/PrepareUniverseEvent.md) -- dispatched during Universe initialization
- [`AddPlayerToWorldEvent`](../events/AddPlayerToWorldEvent.md) -- dispatched when a player enters a world
- [`DrainPlayerFromWorldEvent`](../events/DrainPlayerFromWorldEvent.md) -- dispatched when a player leaves a world
- `WorldConfig` -- configuration for world creation
- `WorldConfigProvider` -- supplies world configurations
- `PlayerStorage` -- player data persistence
- `NameMatching` -- player lookup strategy enum
- `Packet` -- network packet base type
- `JavaPlugin` -- concrete plugin base class that Universe extends
