---
title: "InteractivelyPickupItemEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.ecs"
fqcn: "com.hypixel.hytale.server.core.event.events.ecs.InteractivelyPickupItemEvent"
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

ECS event dispatched when an entity picks up an item from the world. Cancelling this event prevents the pickup. The `itemStack` field is mutable, allowing listeners to modify the item being picked up (e.g., change quantity or metadata).

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `itemStack` | `ItemStack` | `getItemStack()` | Yes | No |

- **itemStack** -- The item being picked up. Mutable -- changing this alters what the entity receives in their inventory.

## Fired By

- `ItemUtils.pickupItem()` (line 35) via `componentAccessor.invoke(ref, event)` -- ECS dispatch when an entity picks up an item from the world.

## Listening

ECS events are handled by `EntityEventSystem` subclasses, not by `getEventRegistry().register()`.

```java
public class MyPickupHandler extends EntityEventSystem<EntityStore, InteractivelyPickupItemEvent> {
    @Override
    public Query<EntityStore> getQuery() {
        return MY_COMPONENT_TYPE;
    }

    @Override
    public void handle(int index, ArchetypeChunk<EntityStore> chunk,
                       Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer,
                       InteractivelyPickupItemEvent event) {
        ItemStack item = event.getItemStack();

        // Example: prevent picking up banned items
        if (isBannedItem(item)) {
            event.setCancelled(true);
        }

        // Example: double the stack size on pickup
        event.setItemStack(item.withCount(item.getCount() * 2));
    }
}

// Register in plugin setup():
getEntityStoreRegistry().registerSystem(new MyPickupHandler());
```

## Related Events

- [`DropItemEvent`](./DropItemEvent.md) -- The inverse operation: fired when a player drops an item into the world.
