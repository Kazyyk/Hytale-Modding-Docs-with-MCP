---
title: "PlayerInteractEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.player"
fqcn: "com.hypixel.hytale.server.core.event.events.player.PlayerInteractEvent"
api_surface: "public"
cancellable: true
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
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

Previously dispatched when a player interacted with the world. No active instantiation sites exist in the current codebase -- this event is retained for backward compatibility but is never fired. It has been replaced by `UseBlockEvent` (for block interactions) and `PlayerMouseButtonEvent` (for input handling).

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `playerRef` | `Ref<EntityStore>` | `getPlayerRef()` | No | No |
| `player` | `Player` | `getPlayer()` | No | No |
| `actionType` | `InteractionType` | `getActionType()` | No | No |
| `clientUseTime` | `long` | `getClientUseTime()` | No | No |
| `itemInHand` | `ItemStack` | `getItemInHand()` | No | No |
| `targetBlock` | `Vector3i` | `getTargetBlock()` | No | No |
| `targetRef` | `Ref<EntityStore>` | `getTargetRef()` | No | No |
| `targetEntity` | `Entity` | `getTargetEntity()` | No | No |

- **playerRef** -- ECS reference to the player entity. Inherited from `PlayerEvent`.
- **player** -- The player who triggered the interaction. Inherited from `PlayerEvent`.
- **actionType** -- The type of interaction performed.
- **clientUseTime** -- Client-side timestamp of the use action.
- **itemInHand** -- The item stack the player is holding.
- **targetBlock** -- World-space coordinates of the targeted block, if any.
- **targetRef** -- ECS reference to the targeted entity, if any.
- **targetEntity** -- The targeted entity, if any.

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

- **For block interactions** -- use the ECS-based [`UseBlockEvent`](./UseBlockEvent.md).
- **For mouse input handling** -- use [`PlayerMouseButtonEvent`](./PlayerMouseButtonEvent.md).

## Related Events

- [`PlayerMouseButtonEvent`](./PlayerMouseButtonEvent.md) -- Replacement for mouse button input handling.
- [`PlayerMouseMotionEvent`](./PlayerMouseMotionEvent.md) -- Replacement for mouse motion input handling.
- [`UseBlockEvent`](./UseBlockEvent.md) -- ECS-based replacement for block interaction handling.
