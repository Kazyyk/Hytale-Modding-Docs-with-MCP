---
title: "LivingEntityUseBlockEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.entity"
fqcn: "com.hypixel.hytale.server.core.event.events.entity.LivingEntityUseBlockEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - entity
  - block
  - deprecated
---

> **DEPRECATED (forRemoval=true)** -- This event is deprecated and scheduled for removal. Use [`UseBlockEvent`](./UseBlockEvent.md) (ECS event) instead.

> Package: `com.hypixel.hytale.server.core.event.events.entity`
> Implements: `IEvent<String>`
> Cancellable: No

Standard event dispatched after a living entity uses (interacts with) a block. This event has been replaced by the ECS-based `UseBlockEvent` which provides richer context and cancellation support.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `ref` | `Ref<EntityStore>` | `getRef()` | No | No |
| `blockType` | `String` | `getBlockType()` | No | No |

- **ref** -- ECS reference to the entity that used the block.
- **blockType** -- The type identifier of the block that was used.

## Fired By

- `UseBlockInteraction` (line 81) via `eventBus dispatchFor` -- EventBus dispatch after block use (deprecated).

## Listening

```java
getEventRegistry().register(LivingEntityUseBlockEvent.class, event -> {
    Ref<EntityStore> entityRef = event.getRef();
    String blockType = event.getBlockType();

    // Handle block use (deprecated -- prefer UseBlockEvent)
});
```

## Migration

Replace usage with the ECS-based `UseBlockEvent`:

```java
// Old (deprecated):
getEventRegistry().register(LivingEntityUseBlockEvent.class, event -> { ... });

// New (preferred):
// Register an EntityEventSystem<EntityStore, UseBlockEvent> instead.
// See UseBlockEvent documentation for the ECS event handler pattern.
```

## Related Events

- [`UseBlockEvent`](./UseBlockEvent.md) -- The ECS-based replacement for this event. Provides cancellation support and richer context.
- [`BreakBlockEvent`](./BreakBlockEvent.md) -- ECS event for block destruction (distinct from block use).
- [`PlaceBlockEvent`](./PlaceBlockEvent.md) -- ECS event for block placement.
