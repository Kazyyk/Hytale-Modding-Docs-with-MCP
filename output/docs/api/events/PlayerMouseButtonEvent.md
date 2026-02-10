---
title: "PlayerMouseButtonEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.player"
fqcn: "com.hypixel.hytale.server.core.event.events.player.PlayerMouseButtonEvent"
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

Dispatched when a player presses or releases a mouse button. This event provides full context about the interaction including what the player is holding, what they are targeting (block or entity), and screen coordinates.

Cancelling this event prevents the mouse button action from being processed by the server.

Because the key type is `Void`, this event is dispatched globally -- all registered listeners receive it regardless of key.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Notes |
|-------|------|----------|---------|-------|
| `playerRef` | `Ref<EntityStore>` | `getPlayerRef()` | No | ECS reference to the player entity. Inherited from `PlayerEvent`. |
| `player` | `Player` | `getPlayer()` | No | The player who triggered the input. Inherited from `PlayerEvent`. |
| `playerRefComponent` | `PlayerRef` | `getPlayerRefComponent()` | No | The `PlayerRef` component for the player. |
| `clientUseTime` | `long` | `getClientUseTime()` | No | Client-side timestamp of the use action. |
| `itemInHand` | `Item` | `getItemInHand()` | No | The item the player is holding. |
| `targetBlock` | `Vector3i` | `getTargetBlock()` | No | World-space coordinates of the targeted block, if any. |
| `targetEntity` | `Entity` | `getTargetEntity()` | No | The targeted entity, if any. |
| `screenPoint` | `Vector2f` | `getScreenPoint()` | No | Screen-space coordinates of the mouse cursor. |
| `mouseButton` | `MouseButtonEvent` | `getMouseButton()` | No | The mouse button event data (which button, press/release). |

## Fired By

- `InteractionModule.doMouseInteraction()` (line 407) via `eventBus.dispatchFor()` -- dispatched when a player presses or releases a mouse button during gameplay interaction processing.

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

- [`PlayerMouseMotionEvent`](./PlayerMouseMotionEvent.md) -- the companion input event for mouse movement/drag. Together these two events cover all mouse input.
- [`PlayerInteractEvent`](./PlayerInteractEvent.md) -- **deprecated** predecessor. `PlayerMouseButtonEvent` is one of its replacements.
- [`BreakBlockEvent`](./BreakBlockEvent.md) -- ECS event that may fire downstream if the mouse button triggers block mining.
- [`UseBlockEvent`](./UseBlockEvent.md) -- ECS event that may fire downstream if the mouse button triggers block use.
