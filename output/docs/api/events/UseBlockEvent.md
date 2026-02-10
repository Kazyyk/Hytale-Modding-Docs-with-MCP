---
title: "UseBlockEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.ecs"
fqcn: "com.hypixel.hytale.server.core.event.events.ecs.UseBlockEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-09T23:10:00Z"
tags:
  - ecs
  - block
  - interaction
---

> Package: `com.hypixel.hytale.server.core.event.events.ecs`
> Extends: `EcsEvent`
> Cancellable: No (base class) -- see inner classes below

ECS event dispatched when a player interacts with (uses) a block. The base class is **not** cancellable; it serves as the common supertype for the `Pre` and `Post` inner classes.

This event uses a Pre/Post pattern: `UseBlockEvent.Pre` fires before the interaction takes effect and can be cancelled, while `UseBlockEvent.Post` fires after the interaction has completed and is informational only.

## Fields / Accessors (Base Class)

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `interactionType` | `InteractionType` | `getInteractionType()` | No | No |
| `context` | `InteractionContext` | `getContext()` | No | No |
| `targetBlock` | `Vector3i` | `getTargetBlock()` | No | No |
| `blockType` | `BlockType` | `getBlockType()` | No | No |

- **interactionType** -- The type of interaction being performed on the block.
- **context** -- Additional context about the interaction (e.g., which face was clicked, cursor position).
- **targetBlock** -- The world-space coordinates of the block being used.
- **blockType** -- The type of block being interacted with.

---

## UseBlockEvent.Pre

> Extends: `UseBlockEvent`
> Implements: `ICancellableEcsEvent`
> Cancellable: Yes

Fired **before** the block interaction takes effect. Cancelling this event prevents the interaction from occurring.

### Fired By

- `UseBlockInteraction.execute` (line 65) via `commandBuffer.invoke(ref, event)` -- ECS dispatch before block use takes effect.

### Listening

```java
public class MyUseBlockPreHandler extends EntityEventSystem<EntityStore, UseBlockEvent.Pre> {
    @Override
    public Query<EntityStore> getQuery() {
        return MY_COMPONENT_TYPE;
    }

    @Override
    public void handle(int index, ArchetypeChunk<EntityStore> chunk,
                       Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer,
                       UseBlockEvent.Pre event) {
        BlockType blockType = event.getBlockType();

        // Example: prevent interaction with certain blocks
        if (blockType == BlockType.LOCKED_CHEST) {
            event.setCancelled(true);
        }
    }
}

// Register in plugin setup():
getEntityStoreRegistry().registerSystem(new MyUseBlockPreHandler());
```

---

## UseBlockEvent.Post

> Extends: `UseBlockEvent`
> Cancellable: No

Fired **after** the block interaction has completed. This is an informational event -- the interaction has already occurred and cannot be undone via cancellation.

### Fired By

- `UseBlockInteraction.execute` (line 76) via `commandBuffer.invoke(ref, event)` -- ECS dispatch after block use completes.

### Listening

```java
public class MyUseBlockPostHandler extends EntityEventSystem<EntityStore, UseBlockEvent.Post> {
    @Override
    public Query<EntityStore> getQuery() {
        return MY_COMPONENT_TYPE;
    }

    @Override
    public void handle(int index, ArchetypeChunk<EntityStore> chunk,
                       Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer,
                       UseBlockEvent.Post event) {
        BlockType blockType = event.getBlockType();
        Vector3i target = event.getTargetBlock();

        // Example: log block interactions for analytics
        logger.info("Block used: {} at {}", blockType, target);
    }
}

// Register in plugin setup():
getEntityStoreRegistry().registerSystem(new MyUseBlockPostHandler());
```

## Related Events

- [`BreakBlockEvent`](./BreakBlockEvent.md) -- Fired when a block is mined/destroyed, as opposed to interacted with.
- [`PlaceBlockEvent`](./PlaceBlockEvent.md) -- Fired when a block is placed.
- [`LivingEntityUseBlockEvent`](./LivingEntityUseBlockEvent.md) -- Deprecated standard-event predecessor. Use `UseBlockEvent` instead.
