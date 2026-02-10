---
title: "PlayerInteractEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.player"
fqcn: "com.hypixel.hytale.server.core.event.events.player.PlayerInteractEvent"
api_surface: "public"
cancellable: true
generator_version: "1.0.0"
generated_at: "2026-02-09T23:10:00Z"
tags:
  - player
  - interaction
  - deprecated
  - cancellable
---

> **DEPRECATED** -- This event is deprecated. Use [`UseBlockEvent`](./UseBlockEvent.md) (ECS event) for block interactions and [`PlayerMouseButtonEvent`](./PlayerMouseButtonEvent.md) for mouse input handling instead.

> Package: `com.hypixel.hytale.server.core.event.events.player`
> Extends: `PlayerEvent<String>`
> Implements: `IEvent<String>`, `ICancellable`
> Cancellable: Yes
> Key type: `String`

Previously dispatched when a player interacted with the world. No active instantiation sites exist in the current codebase -- this event is retained for backward compatibility but is never fired. It has been replaced by the more specific `UseBlockEvent` (for block interactions) and `PlayerMouseButtonEvent` (for input handling).

Because the key type is `String`, this event would have been dispatched with a keyed dispatch.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Notes |
|-------|------|----------|---------|-------|
| `playerRef` | `Ref<EntityStore>` | `getPlayerRef()` | No | ECS reference to the player entity. Inherited from `PlayerEvent`. |
| `player` | `Player` | `getPlayer()` | No | The player who triggered the interaction. Inherited from `PlayerEvent`. |
| `actionType` | `InteractionType` | `getActionType()` | No | The type of interaction performed. |
| `clientUseTime` | `long` | `getClientUseTime()` | No | Client-side timestamp of the use action. |
| `itemInHand` | `ItemStack` | `getItemInHand()` | No | The item stack the player is holding. |
| `targetBlock` | `Vector3i` | `getTargetBlock()` | No | World-space coordinates of the targeted block, if any. |
| `targetRef` | `Ref<EntityStore>` | `getTargetRef()` | No | ECS reference to the targeted entity, if any. |
| `targetEntity` | `Entity` | `getTargetEntity()` | No | The targeted entity, if any. |

## Fired By

No active dispatch sites found in the current codebase. This event is deprecated and no longer fired by the server.

## Listening

```java
// DEPRECATED -- do not use in new code
getEventRegistry().register(PlayerInteractEvent.class, event -> {
    InteractionType action = event.getActionType();
    Player player = event.getPlayer();
    // This listener will never fire -- no dispatch sites exist
});
```

## Migration

Replace usage of `PlayerInteractEvent` with the appropriate replacement:

**For block interactions** -- use the ECS-based `UseBlockEvent`:

```java
// Register an EntityEventSystem<EntityStore, UseBlockEvent> instead.
// See UseBlockEvent documentation for the ECS event handler pattern.
```

**For mouse input handling** -- use `PlayerMouseButtonEvent`:

```java
getEventRegistry().register(PlayerMouseButtonEvent.class, event -> {
    MouseButtonEvent mouseButton = event.getMouseButton();
    Entity target = event.getTargetEntity();
    // Handle mouse input
});
```

## Related Events

- [`PlayerMouseButtonEvent`](./PlayerMouseButtonEvent.md) -- replacement for mouse button input handling.
- [`PlayerMouseMotionEvent`](./PlayerMouseMotionEvent.md) -- replacement for mouse motion input handling.
- [`UseBlockEvent`](./UseBlockEvent.md) -- ECS-based replacement for block interaction handling.
