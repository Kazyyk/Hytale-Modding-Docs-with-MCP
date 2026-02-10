---
title: "DropItemEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.ecs"
fqcn: "com.hypixel.hytale.server.core.event.events.ecs.DropItemEvent"
api_surface: "public"
cancellable: true
generator_version: "1.0.0"
generated_at: "2026-02-09T23:10:00Z"
tags:
  - ecs
  - item
  - cancellable
---

> Package: `com.hypixel.hytale.server.core.event.events.ecs`
> Extends: `CancellableEcsEvent`
> Implements: `ICancellableEcsEvent`
> Cancellable: Yes

ECS event superclass for item drop operations. There are two inner classes representing different stages of the drop lifecycle:

- **`DropItemEvent.PlayerRequest`** -- Fired when a player requests to drop an item (before the drop happens). Cancelling prevents the drop request from proceeding.
- **`DropItemEvent.Drop`** -- Fired when an item is actually being dropped into the world. Cancelling prevents the item entity from spawning.

Both inner classes extend `DropItemEvent` and inherit cancellability.

---

## DropItemEvent.PlayerRequest

> Extends: `DropItemEvent`
> Cancellable: Yes (inherited)

Fired when a player requests to drop an item from their inventory. This occurs before any item entity is spawned -- cancelling prevents the drop from being initiated.

### Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `inventorySectionId` | `int` | `getInventorySectionId()` | No | No |
| `slotId` | `short` | `getSlotId()` | No | No |

- **inventorySectionId** -- The inventory section from which the item is being dropped.
- **slotId** -- The specific slot within the inventory section.

### Fired By

- `InventoryPacketHandler` (line 298) via `store.invoke(ref, event)` -- ECS dispatch when a player requests to drop an item from inventory.

### Listening

```java
public class MyDropRequestHandler extends EntityEventSystem<EntityStore, DropItemEvent.PlayerRequest> {
    @Override
    public Query<EntityStore> getQuery() {
        return MY_COMPONENT_TYPE;
    }

    @Override
    public void handle(int index, ArchetypeChunk<EntityStore> chunk,
                       Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer,
                       DropItemEvent.PlayerRequest event) {
        int section = event.getInventorySectionId();
        short slot = event.getSlotId();

        // Example: prevent dropping items from the first hotbar slot
        if (slot == 0) {
            event.setCancelled(true);
        }
    }
}

// Register in plugin setup():
getEntityStoreRegistry().registerSystem(new MyDropRequestHandler());
```

---

## DropItemEvent.Drop

> Extends: `DropItemEvent`
> Cancellable: Yes (inherited)

Fired when an item is actually being dropped into the world as an item entity. This fires after the drop request has been validated. Cancelling prevents the item entity from being spawned.

### Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `itemStack` | `ItemStack` | `getItemStack()` | Yes | No |
| `throwSpeed` | `float` | `getThrowSpeed()` | Yes | No |

- **itemStack** -- The item being dropped. Mutable -- changing this alters what item entity is spawned in the world.
- **throwSpeed** -- The velocity at which the item is thrown. Mutable -- set to `0` for a simple drop, or increase for a stronger throw.

### Fired By

- `ItemUtils.throwItem()` (line 87) via `componentAccessor.invoke(ref, event)` -- ECS dispatch when an item is being dropped into the world.

### Listening

```java
public class MyDropHandler extends EntityEventSystem<EntityStore, DropItemEvent.Drop> {
    @Override
    public Query<EntityStore> getQuery() {
        return MY_COMPONENT_TYPE;
    }

    @Override
    public void handle(int index, ArchetypeChunk<EntityStore> chunk,
                       Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer,
                       DropItemEvent.Drop event) {
        ItemStack item = event.getItemStack();
        float speed = event.getThrowSpeed();

        // Example: reduce throw speed for heavy items
        if (isHeavyItem(item)) {
            event.setThrowSpeed(speed * 0.5f);
        }
    }
}

// Register in plugin setup():
getEntityStoreRegistry().registerSystem(new MyDropHandler());
```

## Related Events

- [`InteractivelyPickupItemEvent`](./InteractivelyPickupItemEvent.md) -- The inverse operation: fired when an entity picks up an item from the world.
- [`SwitchActiveSlotEvent`](./SwitchActiveSlotEvent.md) -- Also dispatched from `InventoryPacketHandler`, related to inventory manipulation.
