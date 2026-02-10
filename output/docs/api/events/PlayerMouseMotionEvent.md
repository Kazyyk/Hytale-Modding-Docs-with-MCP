---
title: "PlayerMouseMotionEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.player"
fqcn: "com.hypixel.hytale.server.core.event.events.player.PlayerMouseMotionEvent"
api_surface: "public"
cancellable: true
generator_version: "1.0.0"
generated_at: "2026-02-09T23:10:00Z"
tags:
  - player
  - input
  - mouse
  - cancellable
---

> Package: `com.hypixel.hytale.server.core.event.events.player`
> Extends: `PlayerEvent<Void>`
> Implements: `IEvent<Void>`, `ICancellable`
> Cancellable: Yes
> Key type: `Void`

Dispatched when a player moves the mouse during a drag interaction. This event provides context about the current interaction state including the item in hand, targeted block or entity, and screen coordinates.

Cancelling this event prevents the mouse motion from being processed by the server's interaction system.

Because the key type is `Void`, this event is dispatched globally -- all registered listeners receive it regardless of key.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Notes |
|-------|------|----------|---------|-------|
| `playerRef` | `Ref<EntityStore>` | `getPlayerRef()` | No | ECS reference to the player entity. Inherited from `PlayerEvent`. |
| `player` | `Player` | `getPlayer()` | No | The player who triggered the input. Inherited from `PlayerEvent`. |
| `clientUseTime` | `long` | `getClientUseTime()` | No | Client-side timestamp of the use action. |
| `itemInHand` | `Item` | `getItemInHand()` | No | The item the player is holding. |
| `targetBlock` | `Vector3i` | `getTargetBlock()` | No | World-space coordinates of the targeted block, if any. |
| `targetEntity` | `Entity` | `getTargetEntity()` | No | The targeted entity, if any. |
| `screenPoint` | `Vector2f` | `getScreenPoint()` | No | Screen-space coordinates of the mouse cursor. |
| `mouseMotion` | `MouseMotionEvent` | `getMouseMotion()` | No | The mouse motion event data (delta movement, drag state). |

## Fired By

- `InteractionModule.doMouseInteraction()` (line 428) via `eventBus.dispatchFor()` -- dispatched when a player moves the mouse during an active drag interaction.

## Listening

```java
getEventRegistry().register(PlayerMouseMotionEvent.class, event -> {
    Player player = event.getPlayer();
    MouseMotionEvent motion = event.getMouseMotion();
    Vector2f screenPoint = event.getScreenPoint();

    // Example: track mouse drag positions
    logDragPosition(player, screenPoint);
});
```

## Related Events

- [`PlayerMouseButtonEvent`](./PlayerMouseButtonEvent.md) -- the companion input event for mouse button presses/releases. Together these two events cover all mouse input.
- [`PlayerInteractEvent`](./PlayerInteractEvent.md) -- **deprecated** predecessor that handled both button and motion input in a single event.
