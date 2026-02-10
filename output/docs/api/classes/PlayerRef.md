---
title: PlayerRef
kind: class
package: com.hypixel.hytale.server.core.universe
api_surface: true
extends: ~
implements:
  - Component<EntityStore>
  - MetricProvider
  - IMessageReceiver
generator_version: "1.0.0"
generated_at: "2026-02-09T23:45:00Z"
tags:
  - universe
  - player
  - component
  - ecs
  - identity
  - network
---

**Package:** `com.hypixel.hytale.server.core.universe`

```java
public class PlayerRef implements Component<EntityStore>, MetricProvider, IMessageReceiver
```

The persistent player reference that survives world transitions. A `PlayerRef` bridges three concerns: player identity (UUID, username), network connectivity (`PacketHandler`), and ECS presence (`Component<EntityStore>`). When a player moves between worlds, the `PlayerRef` is removed from one [Store](Store.md) and added to another, maintaining the player's identity and connection throughout.

`PlayerRef` is managed by [Universe](Universe.md) at the server level and tracked per-world by [World](World.md).

## Component Type

```java
@Nonnull
public static ComponentType<EntityStore, PlayerRef> getComponentType()
```

Returns the [ComponentType](ComponentType.md) used to access `PlayerRef` as a component on player entities. This is the key for looking up the `PlayerRef` component in an `EntityStore`:

```java
PlayerRef playerRef = store.getComponent(ref, PlayerRef.getComponentType());
```

## Constructor

```java
public PlayerRef(
    @Nonnull Holder<EntityStore> holder,
    @Nonnull UUID uuid,
    @Nonnull String username,
    @Nonnull String language,
    @Nonnull PacketHandler packetHandler,
    @Nonnull ChunkTracker chunkTracker
)
```

Creates a new `PlayerRef`. Constructed internally by the server during the player connection flow. The `holder` contains the player entity's initial ECS data. The `packetHandler` manages the player's network connection. The `chunkTracker` manages which chunks are sent to the player's client.

## Store Operations

These methods manage the player's presence in a world's entity store.

```java
@Nullable
public Ref<EntityStore> addToStore(@Nonnull Store<EntityStore> store)
```

Adds this player's entity to the given store. Returns a [Ref](Ref.md) identifying the player entity within the store, or `null` if the add fails. Called internally when a player enters a [World](World.md).

```java
@Nonnull
public Holder<EntityStore> removeFromStore()
```

Removes this player's entity from its current store and returns the `Holder` containing the entity's component data. The holder can then be used to add the player to a different store (world transition). Called internally when a player leaves a [World](World.md).

## Validity

```java
public boolean isValid()
```

Returns `true` if this `PlayerRef` has a valid entity reference in a store. Returns `false` if the player is between worlds (removed from one store but not yet added to another) or has been disconnected.

```java
@Nullable
public Ref<EntityStore> getReference()
```

Returns the [Ref](Ref.md) for this player's entity in its current store, or `null` if the player is not currently in a store.

```java
@Nullable
public Holder<EntityStore> getHolder()
```

Returns the `Holder` containing this player's entity data, or `null` if the player is currently in a store (the holder is consumed when the entity is added to a store).

## Identity

```java
@Nonnull
public UUID getUuid()
```

Returns the player's UUID. This is the canonical player identity and is stable across sessions.

```java
@Nonnull
public String getUsername()
```

Returns the player's username as provided at connection time.

## Network

```java
@Nonnull
public PacketHandler getPacketHandler()
```

Returns the `PacketHandler` managing this player's network connection. Used to send packets to the player's client.

```java
public void referToServer(@Nonnull String host, int port)
```

Sends the player to another server at the specified host and port. The client will disconnect from this server and connect to the target server.

```java
public void referToServer(@Nonnull String host, int port, @Nullable byte[] data)
```

Sends the player to another server with optional transfer data. The `data` byte array is forwarded to the target server and can carry state for the transfer (e.g., return coordinates, session tokens).

## Chunk Tracking

```java
@Nonnull
public ChunkTracker getChunkTracker()
```

Returns the `ChunkTracker` for this player. The chunk tracker manages which chunks are loaded and sent to the player's client based on the player's position and view distance.

## Hidden Players

```java
@Nonnull
public HiddenPlayersManager getHiddenPlayersManager()
```

Returns the `HiddenPlayersManager` for this player. Controls which other players are visible or hidden from this player's client.

## Language

```java
@Nonnull
public String getLanguage()
```

Returns the player's language code (e.g., `"en_US"`).

```java
public void setLanguage(@Nonnull String language)
```

Sets the player's language code. Used for server-side localization.

## Position

```java
@Nonnull
public Transform getTransform()
```

Returns the player's current transform (position and rotation). The transform is preserved across world transitions so the player can be placed at a specific location when entering a new world.

```java
public void updatePosition(@Nonnull World world, @Nonnull Transform transform, @Nonnull Vector3f headRotation)
```

Updates the player's position and head rotation within the specified [World](World.md). Called by the server when processing movement packets from the client.

## Messaging

```java
@Override
public void sendMessage(@Nonnull Message message)
```

Sends a message to this player. Implements `IMessageReceiver`. The message is serialized and sent via the player's `PacketHandler`.

## World Transition Flow

When a player moves between worlds, the sequence is:

```
Source World:
    PlayerRef.removeFromStore() --> returns Holder with entity data

Target World:
    World.addPlayer(playerRef, transform)
        --> PlayerRef.addToStore(targetEntityStore) --> returns new Ref
        --> AddPlayerToWorldEvent dispatched
```

The `PlayerRef` itself is never destroyed during a world transfer -- only its ECS presence moves. The UUID, username, PacketHandler, and ChunkTracker remain stable.

## Related Types

- [Universe](Universe.md) -- manages all PlayerRef instances at the server level
- [World](World.md) -- manages PlayerRef instances per-world, calls addToStore/removeFromStore
- [Store](Store.md) -- the entity store that PlayerRef is added to/removed from
- [Ref](Ref.md) -- the entity reference returned by addToStore
- [ComponentType](ComponentType.md) -- type key returned by getComponentType()
- [ComponentRegistryProxy](ComponentRegistryProxy.md) -- registers PlayerRef's component type
- [`PlayerConnectEvent`](../events/PlayerConnectEvent.md) -- dispatched when this player connects, contains PlayerRef
- [`PlayerDisconnectEvent`](../events/PlayerDisconnectEvent.md) -- dispatched when this player disconnects
- [`AddPlayerToWorldEvent`](../events/AddPlayerToWorldEvent.md) -- dispatched when this player enters a world
- [`DrainPlayerFromWorldEvent`](../events/DrainPlayerFromWorldEvent.md) -- dispatched when this player is drained from a world
- [`PlayerReadyEvent`](../events/PlayerReadyEvent.md) -- dispatched when this player signals readiness
- `PacketHandler` -- network connection manager
- `ChunkTracker` -- chunk loading and streaming for the player's client
- `HiddenPlayersManager` -- player visibility control
- `Transform` -- position and rotation data
- `Holder` -- ECS entity data snapshot, used during world transitions
- `Entity` -- base entity component on the player's ECS entity
