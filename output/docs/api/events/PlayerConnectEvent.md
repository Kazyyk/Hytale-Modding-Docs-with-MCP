---
title: "PlayerConnectEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.player"
fqcn: "com.hypixel.hytale.server.core.event.events.player.PlayerConnectEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-09T23:10:00Z"
tags:
  - player
  - connection
  - lifecycle
---

> Package: `com.hypixel.hytale.server.core.event.events.player`
> Implements: `IEvent<Void>`
> Cancellable: No

Dispatched when a player entity has been created and the player is fully connected to the server. This event fires after the setup phase is complete (after `PlayerSetupConnectEvent`) and provides access to the player's entity holder and reference.

The `world` field is mutable, allowing listeners to override which world the player initially spawns into. If set to `null`, the server uses its default world selection logic.

Because the key type is `Void`, this event is dispatched globally -- all registered listeners receive it regardless of key.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Notes |
|-------|------|----------|---------|-------|
| `holder` | `Holder<EntityStore>` | `getHolder()` | No | The entity holder for the connected player. |
| `playerRef` | `PlayerRef` | `getPlayerRef()` | No | Reference to the connected player. |
| `player` | `Player` | `getPlayer()` | No | **Deprecated.** Use `holder.getComponent(Player.getComponentType())` instead. |
| `world` | `World` | `getWorld()` | Yes | The world the player will be placed into. Nullable -- mutable to override spawn world. |

## Fired By

- Dispatched by `Universe` (line 697) via `eventBus.dispatchFor()` when the player entity is created and connected. This fires after the setup phase completes and the player entity exists in the ECS.

## Listening

```java
getEventRegistry().register(PlayerConnectEvent.class, event -> {
    PlayerRef playerRef = event.getPlayerRef();
    World world = event.getWorld();
    // Player entity is now available
});
```

## Related Events

- [`PlayerSetupConnectEvent`](./PlayerSetupConnectEvent.md) -- fired before this event, during early connection before the player entity exists. Previous step in the connection flow.
- [`PlayerDisconnectEvent`](./PlayerDisconnectEvent.md) -- the counterpart event fired when the player disconnects after being fully connected.
- [`AddPlayerToWorldEvent`](./AddPlayerToWorldEvent.md) -- fired after this event when the player enters a world. Next step in the connection flow.

### Connection Flow

```
PlayerSetupConnectEvent --> PlayerConnectEvent --> AddPlayerToWorldEvent --> PlayerReadyEvent
```
