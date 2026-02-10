---
title: "LivingEntityInventoryChangeEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.entity"
fqcn: "com.hypixel.hytale.server.core.event.events.entity.LivingEntityInventoryChangeEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-09T23:10:00Z"
tags:
  - entity
  - inventory
---

> Package: `com.hypixel.hytale.server.core.event.events.entity`
> Extends: `EntityEvent<LivingEntity, String>`
> Implements: `IEvent<String>`
> Cancellable: No
> Key type: `String`

Dispatched when a living entity's inventory changes. This event fires from multiple inventory operations and provides the affected item container and the transaction that describes the change. This event cannot be cancelled -- it is a notification of a change that has already occurred.

Because the key type is `String`, this event is dispatched with a keyed dispatch. Listeners can filter by the entity's type key.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Notes |
|-------|------|----------|---------|-------|
| `entity` | `LivingEntity` | `getEntity()` | No | The living entity whose inventory changed. Inherited from `EntityEvent`. |
| `itemContainer` | `ItemContainer` | `getItemContainer()` | No | The item container that was modified. |
| `transaction` | `Transaction` | `getTransaction()` | No | The transaction describing the inventory change (items added, removed, or moved). |

## Fired By

This event is dispatched from multiple sites within the `Inventory` class, covering various inventory mutation operations:

- `Inventory` (line 183) via `eventBus.dispatchFor()`
- `Inventory` (line 195) via `eventBus.dispatchFor()`
- `Inventory` (line 209) via `eventBus.dispatchFor()`
- `Inventory` (line 247) via `eventBus.dispatchFor()`
- `Inventory` (line 285) via `eventBus.dispatchFor()`
- `Inventory` (line 302) via `eventBus.dispatchFor()`

All dispatch sites fire after the inventory operation completes, providing a consistent notification mechanism for any inventory change on a living entity.

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

- [`PlayerCraftEvent`](./PlayerCraftEvent.md) -- **deprecated** event that fires specifically for crafting operations, which also result in inventory changes.
