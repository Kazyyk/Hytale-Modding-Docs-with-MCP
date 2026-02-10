---
title: "AddPlayerToWorldEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.player"
fqcn: "com.hypixel.hytale.server.core.event.events.player.AddPlayerToWorldEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-09T23:10:00Z"
tags:
  - player
  - world
---

> Package: `com.hypixel.hytale.server.core.event.events.player`
> Implements: `IEvent<String>`
> Cancellable: No

Dispatched when a player enters a world. This event fires both during the initial connection flow (after `PlayerConnectEvent`) and whenever a player is transferred between worlds.

The `broadcastJoinMessage` field controls whether a join message is broadcast to other players in the world. It defaults to `true` and can be set to `false` to suppress the message.

Because the key type is `String`, this event supports keyed dispatch. Listeners can register for a specific key or use `registerGlobal()` to receive all dispatches.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Notes |
|-------|------|----------|---------|-------|
| `holder` | `Holder<EntityStore>` | `getHolder()` | No | The entity holder for the player entering the world. |
| `world` | `World` | `getWorld()` | No | The world the player is entering. |
| `broadcastJoinMessage` | `boolean` | `shouldBroadcastJoinMessage()` | Yes | Whether to broadcast a join message. Default: `true`. |

## Fired By

- Dispatched by `World.addPlayer()` (line 810) via `eventBus.dispatchFor()` using keyed dispatch when a player enters a world.

## Listening

```java
// Listen globally for all world joins
getEventRegistry().registerGlobal(AddPlayerToWorldEvent.class, event -> {
    World world = event.getWorld();
    boolean announce = event.shouldBroadcastJoinMessage();
    // Handle player entering a world
});
```

## Related Events

- [`DrainPlayerFromWorldEvent`](./DrainPlayerFromWorldEvent.md) -- the counterpart event fired when a player leaves a world. This event and `DrainPlayerFromWorldEvent` are inverses.
- [`PlayerConnectEvent`](./PlayerConnectEvent.md) -- fired before this event during the initial connection flow. Previous step in the connection flow.
- [`PlayerReadyEvent`](./PlayerReadyEvent.md) -- fired after this event when the player signals readiness. Next step in the connection flow.

### Connection Flow

```
PlayerSetupConnectEvent --> PlayerConnectEvent --> AddPlayerToWorldEvent --> PlayerReadyEvent
```
