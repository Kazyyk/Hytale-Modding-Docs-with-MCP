---
title: "ChunkSaveEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.universe.world.events.ecs"
fqcn: "com.hypixel.hytale.server.core.universe.world.events.ecs.ChunkSaveEvent"
api_surface: "public"
cancellable: true
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - ecs
  - world
  - chunk
  - cancellable
---

> Package: `com.hypixel.hytale.server.core.universe.world.events.ecs`
> Extends: `CancellableEcsEvent`
> Implements: `ICancellableEcsEvent`
> Cancellable: Yes

ECS event dispatched when a chunk is being saved to storage. Cancelling this event prevents the chunk from being saved.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `chunk` | `WorldChunk` | `getChunk()` | No | No |

- **chunk** -- The world chunk being saved.

## Fired By

- `ChunkSavingSystems.save` (lines 76, 95) via `componentAccessor.invoke(event)` -- ECS dispatch when a chunk is being saved (two call sites -- different save paths).

## Listening

ECS events are handled by `EntityEventSystem` subclasses, not by `getEventRegistry().register()`. Chunk events operate on the `ChunkStore` pipeline, not `EntityStore`.

```java
public class MyChunkSaveHandler extends EntityEventSystem<ChunkStore, ChunkSaveEvent> {
    @Override
    public Query<ChunkStore> getQuery() {
        return MY_COMPONENT_TYPE;
    }

    @Override
    public void handle(int index, ArchetypeChunk<ChunkStore> chunk,
                       Store<ChunkStore> store, CommandBuffer<ChunkStore> commandBuffer,
                       ChunkSaveEvent event) {
        WorldChunk worldChunk = event.getChunk();

        // Example: skip saving empty chunks
        if (isChunkEmpty(worldChunk)) {
            event.setCancelled(true);
        }
    }
}

// Register in plugin setup():
getChunkStoreRegistry().registerSystem(new MyChunkSaveHandler());
```

## Related Events

- [`ChunkUnloadEvent`](./ChunkUnloadEvent.md) -- Fired when a chunk is being unloaded from memory. May occur after a save.
