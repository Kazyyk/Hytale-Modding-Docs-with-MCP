---
title: "PlayerMouseButtonEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.player"
fqcn: "com.hypixel.hytale.server.core.event.events.player.PlayerMouseButtonEvent"
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

Standard event dispatched when a player presses or releases a mouse button. Provides full context about the interaction including what the player is holding, what they are targeting (block or entity), and screen coordinates.

Cancelling this event prevents the mouse button action from being processed by the server.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `playerRef` | `Ref<EntityStore>` | `getPlayerRef()` | No | No |
| `player` | `Player` | `getPlayer()` | No | No |
| `playerRefComponent` | `PlayerRef` | `getPlayerRefComponent()` | No | No |
| `clientUseTime` | `long` | `getClientUseTime()` | No | No |
| `itemInHand` | `Item` | `getItemInHand()` | No | No |
| `targetBlock` | `Vector3i` | `getTargetBlock()` | No | No |
| `targetEntity` | `Entity` | `getTargetEntity()` | No | No |
| `screenPoint` | `Vector2f` | `getScreenPoint()` | No | No |
| `mouseButton` | `MouseButtonEvent` | `getMouseButton()` | No | No |

- **playerRef** -- ECS reference to the player entity. Inherited from `PlayerEvent`.
- **player** -- The player who triggered the input. Inherited from `PlayerEvent`.
- **playerRefComponent** -- The `PlayerRef` component for the player.
- **clientUseTime** -- Client-side timestamp of the use action.
- **itemInHand** -- The item the player is holding.
- **targetBlock** -- World-space coordinates of the targeted block, if any.
- **targetEntity** -- The targeted entity, if any.
- **screenPoint** -- Screen-space coordinates of the mouse cursor.
- **mouseButton** -- The mouse button event data (which button, press/release).

## Fired By

- `InteractionModule.doMouseInteraction()` (line 407) via `eventBus dispatchFor` -- EventBus dispatch when a player presses or releases a mouse button.

## Listening

```java
getEventRegistry().register(PlayerMouseButtonEvent.class, event -> {
    MouseButtonEvent mouseButton = event.getMouseButton();
    Player player = event.getPlayer();
    Entity target = event.getTargetEntity();

    // Example: cancel right-click interactions on specific entities
    if (target != null && mouseButton.isRightClick()) {
        event.setCancelled(true);
    }
});
```

## Related Events

- [`PlayerMouseMotionEvent`](./PlayerMouseMotionEvent.md) -- The companion input event for mouse movement/drag.
- [`PlayerInteractEvent`](./PlayerInteractEvent.md) -- Deprecated predecessor.
- [`BreakBlockEvent`](./BreakBlockEvent.md) -- ECS event that may fire downstream if the mouse button triggers block mining.
- [`UseBlockEvent`](./UseBlockEvent.md) -- ECS event that may fire downstream if the mouse button triggers block use.
