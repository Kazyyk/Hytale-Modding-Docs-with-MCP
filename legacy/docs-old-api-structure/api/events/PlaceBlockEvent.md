---
title: "PlaceBlockEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.ecs"
fqcn: "com.hypixel.hytale.server.core.event.events.ecs.PlaceBlockEvent"
api_surface: "public"
cancellable: true
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - ecs
  - block
  - cancellable
---

> Package: `com.hypixel.hytale.server.core.event.events.ecs`
> Extends: `CancellableEcsEvent`
> Implements: `ICancellableEcsEvent`
> Cancellable: Yes

ECS event dispatched when a player places a block in the world. Cancelling this event prevents the block from being placed.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `itemInHand` | `ItemStack` | `getItemInHand()` | No | Yes |
| `targetBlock` | `Vector3i` | `getTargetBlock()` | Yes | No |
| `rotation` | `RotationTuple` | `getRotation()` | Yes | No |

- **itemInHand** -- The item the player is holding when placing the block. May be `null` if the placement is not item-driven.
- **targetBlock** -- The world-space coordinates where the block is being placed. Mutable via `setTargetBlock(@Nonnull Vector3i)` -- changing this redirects where the block is placed.
- **rotation** -- The rotation applied to the placed block. Mutable via `setRotation(@Nonnull RotationTuple)` -- changing this alters the block's orientation.

## Fired By

- `BlockPlaceUtils` (lines 102-103) via `entityStore.invoke(ref, event)` -- ECS dispatch when a player places a block.

## Listening

ECS events are handled by `EntityEventSystem` subclasses, not by `getEventRegistry().register()`.

```java
public class MyPlaceBlockHandler extends EntityEventSystem<EntityStore, PlaceBlockEvent> {
    @Override
    public Query<EntityStore> getQuery() {
        return MY_COMPONENT_TYPE;
    }

    @Override
    public void handle(int index, ArchetypeChunk<EntityStore> chunk,
                       Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer,
                       PlaceBlockEvent event) {
        Vector3i target = event.getTargetBlock();
        ItemStack item = event.getItemInHand();

        // Example: prevent placing blocks above Y=200
        if (target.y() > 200) {
            event.setCancelled(true);
        }
    }
}

// Register in plugin setup():
getEntityStoreRegistry().registerSystem(new MyPlaceBlockHandler());
```

## Related Events

- [`BreakBlockEvent`](./BreakBlockEvent.md) -- The inverse operation: fired when a player finishes mining a block.
- [`DamageBlockEvent`](./DamageBlockEvent.md) -- Fired for each mining progress tick. Part of the block-mining lifecycle.
- [`UseBlockEvent`](./UseBlockEvent.md) -- Fired when a player interacts with (uses) a block rather than placing one.
