---
title: "PlayerReadyEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.player"
fqcn: "com.hypixel.hytale.server.core.event.events.player.PlayerReadyEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - player
  - lifecycle
---

> Package: `com.hypixel.hytale.server.core.event.events.player`
> Extends: `PlayerEvent<String>`
> Implements: `IEvent<String>`
> Cancellable: No

Standard event dispatched when a player signals readiness to the server. This is the final step in the player connection flow -- after the player entity has been created, connected, and placed into a world, the client sends a ready signal and this event fires.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `playerRef` | `Ref<EntityStore>` | `getPlayerRef()` | No | No |
| `player` | `Player` | `getPlayer()` | No | No |
| `readyId` | `int` | `getReadyId()` | No | No |

- **playerRef** -- Reference to the player. Inherited from `PlayerEvent`.
- **player** -- The player component. Inherited from `PlayerEvent`.
- **readyId** -- Identifier for the readiness signal.

## Fired By

- `Player.onReady()` (line 306) via `eventBus dispatchFor` -- EventBus keyed dispatch when the player signals readiness.

## Listening

```java
getEventRegistry().registerGlobal(PlayerReadyEvent.class, event -> {
    Player player = event.getPlayer();
    int readyId = event.getReadyId();
    // Player is fully interactive
});
```

## Related Events

- [`AddPlayerToWorldEvent`](./AddPlayerToWorldEvent.md) -- Fired before this event when the player enters a world.
- [`PlayerConnectEvent`](./PlayerConnectEvent.md) -- Fired earlier in the connection flow when the player entity is created.

### Connection Flow

```
PlayerSetupConnectEvent --> PlayerConnectEvent --> AddPlayerToWorldEvent --> PlayerReadyEvent
```
