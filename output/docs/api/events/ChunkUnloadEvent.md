---
title: "ChunkUnloadEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.universe.world.events.ecs"
fqcn: "com.hypixel.hytale.server.core.universe.world.events.ecs.ChunkUnloadEvent"
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

ECS event dispatched when a chunk is being unloaded from memory. Cancelling this event prevents the chunk from being unloaded. The `resetKeepAlive` field (default `true`) controls whether the chunk's keep-alive timer is reset. This can be accessed via `willResetKeepAlive()` and modified via `setResetKeepAlive(boolean)`.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `chunk` | `WorldChunk` | `getChunk()` | No | No |
| `resetKeepAlive` | `boolean` | `willResetKeepAlive()` | Yes | No |

- **chunk** -- The world chunk being unloaded.
- **resetKeepAlive** -- Whether to reset the chunk's keep-alive timer. Default: `true`. Mutable via `setResetKeepAlive(boolean)`.

## Fired By

- `ChunkUnloadingSystem.unload` (line 83) via `componentAccessor.invoke(event)` -- ECS dispatch when a chunk is being unloaded from memory.

## Listening

ECS events are handled by `EntityEventSystem` subclasses, not by `getEventRegistry().register()`.

```java
public class MyChunkUnloadHandler extends EntityEventSystem<EntityStore, ChunkUnloadEvent> {
    @Override
    public Query<EntityStore> getQuery() {
        return MY_COMPONENT_TYPE;
    }

    @Override
    public void handle(int index, ArchetypeChunk<EntityStore> chunk,
                       Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer,
                       ChunkUnloadEvent event) {
        WorldChunk worldChunk = event.getChunk();

        // Example: prevent unloading chunks near spawn
        if (isNearSpawn(worldChunk)) {
            event.setCancelled(true);
        }
    }
}

// Register in plugin setup():
getEntityStoreRegistry().registerSystem(new MyChunkUnloadHandler());
```

## Related Events

- [`ChunkSaveEvent`](./ChunkSaveEvent.md) -- Fired when a chunk is being saved. Typically precedes unload.
