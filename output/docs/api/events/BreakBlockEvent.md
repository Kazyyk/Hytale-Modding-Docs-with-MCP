---
title: "BreakBlockEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.ecs"
fqcn: "com.hypixel.hytale.server.core.event.events.ecs.BreakBlockEvent"
api_surface: "public"
cancellable: true
generator_version: "1.0.0"
generated_at: "2026-02-09T23:10:00Z"
tags:
  - ecs
  - block
  - cancellable
---

> Package: `com.hypixel.hytale.server.core.event.events.ecs`
> Extends: `CancellableEcsEvent`
> Implements: `ICancellableEcsEvent`
> Cancellable: Yes

ECS event dispatched when a player finishes mining a block and the block is about to be destroyed. Cancelling this event prevents the block from being broken, leaving it intact at the target position.

This event is the terminal event in the block-mining lifecycle. Each mining tick fires a [`DamageBlockEvent`](./DamageBlockEvent.md) first; once cumulative damage meets the threshold, `BreakBlockEvent` fires for the final destruction.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `itemInHand` | `ItemStack` | `getItemInHand()` | No | Yes |
| `targetBlock` | `Vector3i` | `getTargetBlock()` | Yes | No |
| `blockType` | `BlockType` | `getBlockType()` | No | No |

- **itemInHand** -- The item the player is holding when breaking the block. May be `null` if the player is empty-handed.
- **targetBlock** -- The world-space coordinates of the block being broken. Mutable -- changing this redirects which block is destroyed.
- **blockType** -- The type of the block being broken.

## Fired By

- `BlockHarvestUtils` (line 581) via `entityStore.invoke(ref, event)` -- ECS dispatch when a player finishes mining a block and the harvest succeeds.

## Listening

ECS events are handled by `EntityEventSystem` subclasses, not by `getEventRegistry().register()`.

```java
public class MyBreakBlockHandler extends EntityEventSystem<EntityStore, BreakBlockEvent> {
    @Override
    public Query<EntityStore> getQuery() {
        return MY_COMPONENT_TYPE;
    }

    @Override
    public void handle(int index, ArchetypeChunk<EntityStore> chunk,
                       Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer,
                       BreakBlockEvent event) {
        BlockType blockType = event.getBlockType();
        Vector3i target = event.getTargetBlock();

        // Example: prevent breaking bedrock
        if (blockType == BlockType.BEDROCK) {
            event.setCancelled(true);
        }
    }
}

// Register in plugin setup():
getEntityStoreRegistry().registerSystem(new MyBreakBlockHandler());
```

## Related Events

- [`DamageBlockEvent`](./DamageBlockEvent.md) -- Fired for each mining progress tick before the block breaks. Part of the block-mining lifecycle.
- [`PlaceBlockEvent`](./PlaceBlockEvent.md) -- The inverse operation: fired when a player places a block.
- [`UseBlockEvent`](./UseBlockEvent.md) -- Fired when a player interacts with (uses) a block rather than mining it.
