---
title: "LivingEntityUseBlockEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.entity"
fqcn: "com.hypixel.hytale.server.core.event.events.entity.LivingEntityUseBlockEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-09T23:10:00Z"
tags:
  - entity
  - block
  - deprecated
---

> **DEPRECATED** -- This event is deprecated. Use [`UseBlockEvent`](./UseBlockEvent.md) (ECS event) instead.

> Package: `com.hypixel.hytale.server.core.event.events.entity`
> Implements: `IEvent<String>`
> Cancellable: No
> Key type: `String`

Dispatched after a living entity uses (interacts with) a block. This event has been replaced by the ECS-based `UseBlockEvent` which provides richer context and cancellation support.

Because the key type is `String`, this event is dispatched with a keyed dispatch using the block type as the key.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Notes |
|-------|------|----------|---------|-------|
| `ref` | `Ref<EntityStore>` | `getRef()` | No | ECS reference to the entity that used the block. |
| `blockType` | `String` | `getBlockType()` | No | The type identifier of the block that was used. |

## Fired By

- `UseBlockInteraction` (line 81) via `eventBus.dispatchFor()` -- dispatched after a block use interaction completes. This is a post-use notification and cannot prevent the interaction.

## Listening

```java
getEventRegistry().register(LivingEntityUseBlockEvent.class, event -> {
    Ref<EntityStore> entityRef = event.getRef();
    String blockType = event.getBlockType();

    // Handle block use (deprecated -- prefer UseBlockEvent)
});
```

## Migration

This event should be replaced with the ECS-based `UseBlockEvent`:

```java
// Old (deprecated):
getEventRegistry().register(LivingEntityUseBlockEvent.class, event -> { ... });

// New (preferred):
// Register an EntityEventSystem<EntityStore, UseBlockEvent> instead.
// See UseBlockEvent documentation for the ECS event handler pattern.
```

## Related Events

- [`UseBlockEvent`](./UseBlockEvent.md) -- the ECS-based replacement for this event. Provides cancellation support and richer context.
- [`BreakBlockEvent`](./BreakBlockEvent.md) -- ECS event for block destruction (distinct from block use).
- [`PlaceBlockEvent`](./PlaceBlockEvent.md) -- ECS event for block placement.
