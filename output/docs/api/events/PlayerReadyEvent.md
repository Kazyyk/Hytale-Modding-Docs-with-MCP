---
title: "PlayerReadyEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.player"
fqcn: "com.hypixel.hytale.server.core.event.events.player.PlayerReadyEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-09T23:10:00Z"
tags:
  - player
  - lifecycle
---

> Package: `com.hypixel.hytale.server.core.event.events.player`
> Extends: `PlayerEvent<String>`
> Implements: `IEvent<String>`
> Cancellable: No

Dispatched when a player signals readiness to the server. This is the final step in the player connection flow -- after the player entity has been created, connected, and placed into a world, the client sends a ready signal and this event fires. Listeners can use this as the point at which the player is fully interactive.

The `playerRef` and `player` fields are inherited from `PlayerEvent`. The `readyId` field identifies the specific readiness signal (the server may track multiple ready states).

Because the key type is `String`, this event supports keyed dispatch. Listeners can register for a specific key or use `registerGlobal()` to receive all dispatches.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Notes |
|-------|------|----------|---------|-------|
| `playerRef` | `Ref<EntityStore>` | `getPlayerRef()` | No | Reference to the player. Inherited from `PlayerEvent`. |
| `player` | `Player` | `getPlayer()` | No | The player component. Inherited from `PlayerEvent`. |
| `readyId` | `int` | `getReadyId()` | No | Identifier for the readiness signal. |

## Fired By

- Dispatched by `Player.onReady()` (line 306) via `eventBus.dispatchFor()` using keyed dispatch when the player signals readiness to the server.

## Listening

```java
getEventRegistry().registerGlobal(PlayerReadyEvent.class, event -> {
    Player player = event.getPlayer();
    int readyId = event.getReadyId();
    // Player is fully interactive
});
```

## Related Events

- [`AddPlayerToWorldEvent`](./AddPlayerToWorldEvent.md) -- fired before this event when the player enters a world. Previous step in the connection flow.
- [`PlayerConnectEvent`](./PlayerConnectEvent.md) -- fired earlier in the connection flow when the player entity is created.

### Connection Flow

```
PlayerSetupConnectEvent --> PlayerConnectEvent --> AddPlayerToWorldEvent --> PlayerReadyEvent
```
