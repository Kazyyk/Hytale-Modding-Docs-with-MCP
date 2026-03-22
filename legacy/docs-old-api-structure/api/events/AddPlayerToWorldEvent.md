---
title: "AddPlayerToWorldEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.player"
fqcn: "com.hypixel.hytale.server.core.event.events.player.AddPlayerToWorldEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - player
  - world
---

> Package: `com.hypixel.hytale.server.core.event.events.player`
> Implements: `IEvent<String>`
> Cancellable: No

Standard event dispatched when a player enters a world. This fires both during the initial connection flow (after `PlayerConnectEvent`) and whenever a player is transferred between worlds.

The `broadcastJoinMessage` field controls whether a join message is broadcast to other players in the world. It defaults to `true` and can be set to `false` to suppress the message.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `holder` | `Holder<EntityStore>` | `getHolder()` | No | No |
| `world` | `World` | `getWorld()` | No | No |
| `broadcastJoinMessage` | `boolean` | `shouldBroadcastJoinMessage()` | Yes | No |

- **holder** -- The entity holder for the player entering the world.
- **world** -- The world the player is entering.
- **broadcastJoinMessage** -- Whether to broadcast a join message. Default: `true`. Mutable via `setBroadcastJoinMessage(boolean)`.

## Fired By

- `World.addPlayer()` (line 810) via `eventBus dispatchFor` -- EventBus keyed dispatch when a player enters a world.

## Listening

```java
// Listen globally for all world joins
getEventRegistry().registerGlobal(AddPlayerToWorldEvent.class, event -> {
    World world = event.getWorld();
    boolean announce = event.shouldBroadcastJoinMessage();

    // Example: suppress join messages in specific worlds
    if (isQuietWorld(world)) {
        event.setBroadcastJoinMessage(false);
    }
});
```

## Related Events

- [`DrainPlayerFromWorldEvent`](./DrainPlayerFromWorldEvent.md) -- The counterpart event fired when a player leaves a world.
- [`PlayerConnectEvent`](./PlayerConnectEvent.md) -- Fired before this event during the initial connection flow.
- [`PlayerReadyEvent`](./PlayerReadyEvent.md) -- Fired after this event when the player signals readiness.

### Connection Flow

```
PlayerSetupConnectEvent --> PlayerConnectEvent --> AddPlayerToWorldEvent --> PlayerReadyEvent
```
