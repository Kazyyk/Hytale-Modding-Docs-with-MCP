---
title: "EntityRemoveEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.entity"
fqcn: "com.hypixel.hytale.server.core.event.events.entity.EntityRemoveEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - entity
  - lifecycle
---

> Package: `com.hypixel.hytale.server.core.event.events.entity`
> Extends: `EntityEvent<Entity, String>`
> Implements: `IEvent<String>`
> Cancellable: No

Standard event dispatched when an entity is removed from the world. This is a lifecycle notification event that fires during entity removal and cannot be cancelled -- by the time listeners receive it, the removal is committed.

Because the key type is `String`, this event supports keyed dispatch. Listeners can register for a specific entity type key or use `registerGlobal()` to receive all entity removals.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `entity` | `Entity` | `getEntity()` | No | No |

- **entity** -- The entity being removed from the world. Inherited from `EntityEvent`.

## Fired By

- `Entity.remove()` (line 113) via `eventBus dispatchFor` -- EventBus keyed dispatch when an entity is removed from the world.

## Listening

```java
getEventRegistry().register(EntityRemoveEvent.class, event -> {
    Entity entity = event.getEntity();
    // Perform cleanup when an entity is removed
});
```

## Related Events

- [`AddPlayerToWorldEvent`](./AddPlayerToWorldEvent.md) -- For player entities, this is the corresponding "add" event. `EntityRemoveEvent` covers all entity types, not just players.
