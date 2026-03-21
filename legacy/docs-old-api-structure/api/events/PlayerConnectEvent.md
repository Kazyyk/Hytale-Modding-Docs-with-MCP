---
title: "PlayerConnectEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.player"
fqcn: "com.hypixel.hytale.server.core.event.events.player.PlayerConnectEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - player
  - connection
  - lifecycle
---

> Package: `com.hypixel.hytale.server.core.event.events.player`
> Implements: `IEvent<Void>`
> Cancellable: No

Standard event dispatched when a player entity has been created and connected to the server. This fires after the setup phase is complete (after `PlayerSetupConnectEvent`) and provides access to the player's entity holder and reference.

The `world` field is mutable, allowing listeners to override which world the player initially spawns into. If set to `null`, the server uses its default world selection logic.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `holder` | `Holder<EntityStore>` | `getHolder()` | No | No |
| `playerRef` | `PlayerRef` | `getPlayerRef()` | No | No |
| `player` | `Player` | `getPlayer()` | No | No |
| `world` | `World` | `getWorld()` | Yes | Yes |

- **holder** -- The entity holder for the connecting player's ECS store.
- **playerRef** -- Reference to the connected player, usable for sending messages and tracking identity.
- **player** -- The `Player` component. Deprecated -- use `holder.getComponent(Player.getComponentType())` instead.
- **world** -- The world the player will be placed in. May be `null`. Mutable via `setWorld(@Nullable World)` -- changing this redirects the player's initial world.

## Fired By

- `Universe` (line 697) via `eventBus dispatchFor` -- EventBus dispatch when player entity is created and connected.

## Listening

```java
getEventRegistry().register(PlayerConnectEvent.class, event -> {
    PlayerRef playerRef = event.getPlayerRef();
    World world = event.getWorld();

    // Example: redirect all players to a specific world
    if (world == null) {
        event.setWorld(myDefaultWorld);
    }
});
```

## Related Events

- [`PlayerSetupConnectEvent`](./PlayerSetupConnectEvent.md) -- Fired earlier in the connection lifecycle, during the setup phase (before the player entity exists). Can be cancelled to reject the connection.
- [`PlayerDisconnectEvent`](./PlayerDisconnectEvent.md) -- Fired when a connected player disconnects.
- [`AddPlayerToWorldEvent`](./AddPlayerToWorldEvent.md) -- Fired when the player is actually added to a world.
- [`PlayerReadyEvent`](./PlayerReadyEvent.md) -- Fired when the player signals readiness after connecting.

### Connection Flow

```
PlayerSetupConnectEvent --> PlayerConnectEvent --> AddPlayerToWorldEvent --> PlayerReadyEvent
```
