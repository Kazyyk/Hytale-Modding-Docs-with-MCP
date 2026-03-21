---
title: "PlayerMouseMotionEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.player"
fqcn: "com.hypixel.hytale.server.core.event.events.player.PlayerMouseMotionEvent"
api_surface: "public"
cancellable: true
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
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

Standard event dispatched when a player moves the mouse during a drag interaction. Provides context about the current interaction state including the item in hand, targeted block or entity, and screen coordinates.

Cancelling this event prevents the mouse motion from being processed by the server's interaction system.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `playerRef` | `Ref<EntityStore>` | `getPlayerRef()` | No | No |
| `player` | `Player` | `getPlayer()` | No | No |
| `clientUseTime` | `long` | `getClientUseTime()` | No | No |
| `itemInHand` | `Item` | `getItemInHand()` | No | No |
| `targetBlock` | `Vector3i` | `getTargetBlock()` | No | No |
| `targetEntity` | `Entity` | `getTargetEntity()` | No | No |
| `screenPoint` | `Vector2f` | `getScreenPoint()` | No | No |
| `mouseMotion` | `MouseMotionEvent` | `getMouseMotion()` | No | No |

- **playerRef** -- ECS reference to the player entity. Inherited from `PlayerEvent`.
- **player** -- The player who triggered the input. Inherited from `PlayerEvent`.
- **clientUseTime** -- Client-side timestamp of the use action.
- **itemInHand** -- The item the player is holding.
- **targetBlock** -- World-space coordinates of the targeted block, if any.
- **targetEntity** -- The targeted entity, if any.
- **screenPoint** -- Screen-space coordinates of the mouse cursor.
- **mouseMotion** -- The mouse motion event data (delta movement, drag state).

## Fired By

- `InteractionModule.doMouseInteraction()` (line 428) via `eventBus dispatchFor` -- EventBus dispatch when a player moves the mouse during an active drag interaction.

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

- [`PlayerMouseButtonEvent`](./PlayerMouseButtonEvent.md) -- The companion input event for mouse button presses/releases.
- [`PlayerInteractEvent`](./PlayerInteractEvent.md) -- Deprecated predecessor that handled both button and motion input.
