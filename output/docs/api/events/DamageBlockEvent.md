---
title: "DamageBlockEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.ecs"
fqcn: "com.hypixel.hytale.server.core.event.events.ecs.DamageBlockEvent"
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

ECS event dispatched for each mining progress tick when a player is actively mining a block. Cancelling this event prevents the damage tick from being applied, effectively pausing mining progress for that tick.

This event fires repeatedly as the player mines. Once cumulative damage reaches the block's durability threshold, a [`BreakBlockEvent`](./BreakBlockEvent.md) fires for the final destruction. The `damage` field is mutable, allowing listeners to increase or decrease the mining speed per tick.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `itemInHand` | `ItemStack` | `getItemInHand()` | No | Yes |
| `targetBlock` | `Vector3i` | `getTargetBlock()` | Yes | No |
| `blockType` | `BlockType` | `getBlockType()` | No | No |
| `currentDamage` | `float` | `getCurrentDamage()` | No | No |
| `damage` | `float` | `getDamage()` | Yes | No |

- **itemInHand** -- The item the player is holding while mining. May be `null` if the player is empty-handed.
- **targetBlock** -- The world-space coordinates of the block being mined. Mutable -- changing this redirects which block receives damage.
- **blockType** -- The type of block being mined.
- **currentDamage** -- The cumulative damage already applied to the block before this tick. Read-only.
- **damage** -- The damage to be applied on this tick. Mutable -- set to `0` to nullify this tick, or increase to speed up mining.

## Fired By

- `BlockHarvestUtils` (line 338) via `entityStore.invoke(ref, event)` -- ECS dispatch for each mining progress tick on a block.

## Listening

ECS events are handled by `EntityEventSystem` subclasses, not by `getEventRegistry().register()`.

```java
public class MyDamageBlockHandler extends EntityEventSystem<EntityStore, DamageBlockEvent> {
    @Override
    public Query<EntityStore> getQuery() {
        return MY_COMPONENT_TYPE;
    }

    @Override
    public void handle(int index, ArchetypeChunk<EntityStore> chunk,
                       Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer,
                       DamageBlockEvent event) {
        BlockType blockType = event.getBlockType();
        float currentDamage = event.getCurrentDamage();
        float tickDamage = event.getDamage();

        // Example: double mining speed for stone blocks
        if (blockType == BlockType.STONE) {
            event.setDamage(tickDamage * 2.0f);
        }
    }
}

// Register in plugin setup():
getEntityStoreRegistry().registerSystem(new MyDamageBlockHandler());
```

## Related Events

- [`BreakBlockEvent`](./BreakBlockEvent.md) -- Fired once when cumulative damage reaches the threshold and the block is destroyed. Terminal event in the mining lifecycle.
- [`PlaceBlockEvent`](./PlaceBlockEvent.md) -- The inverse operation: fired when a player places a block.
