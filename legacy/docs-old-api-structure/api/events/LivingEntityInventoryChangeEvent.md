---
title: "LivingEntityInventoryChangeEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.entity"
fqcn: "com.hypixel.hytale.server.core.event.events.entity.LivingEntityInventoryChangeEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - entity
  - inventory
---

> Package: `com.hypixel.hytale.server.core.event.events.entity`
> Extends: `EntityEvent<LivingEntity, String>`
> Implements: `IEvent<String>`
> Cancellable: No

Standard event dispatched when a living entity's inventory changes. This event fires from multiple inventory operations and provides the affected item container and the transaction that describes the change. This event cannot be cancelled -- it is a notification of a change that has already occurred.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `entity` | `LivingEntity` | `getEntity()` | No | No |
| `itemContainer` | `ItemContainer` | `getItemContainer()` | No | No |
| `transaction` | `Transaction` | `getTransaction()` | No | No |

- **entity** -- The living entity whose inventory changed. Inherited from `EntityEvent`.
- **itemContainer** -- The item container that was modified.
- **transaction** -- The transaction describing the inventory change (items added, removed, or moved).

## Fired By

This event is dispatched from multiple sites within the `Inventory` class, covering various inventory mutation operations:

- `Inventory` (lines 183, 195, 209, 247, 285, 302) via `eventBus dispatchFor` -- EventBus keyed dispatch from multiple inventory change operations.

## Listening

```java
getEventRegistry().register(LivingEntityInventoryChangeEvent.class, event -> {
    LivingEntity entity = event.getEntity();
    ItemContainer container = event.getItemContainer();
    Transaction transaction = event.getTransaction();

    // Example: log inventory changes for a specific entity type
    logInventoryChange(entity, container, transaction);
});
```

## Related Events

- [`PlayerCraftEvent`](./PlayerCraftEvent.md) -- Deprecated event that fires specifically for crafting operations, which also result in inventory changes.
