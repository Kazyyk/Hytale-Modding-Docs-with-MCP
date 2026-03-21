---
title: "PrefabPasteEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.prefab.event"
fqcn: "com.hypixel.hytale.server.core.prefab.event.PrefabPasteEvent"
api_surface: "public"
cancellable: true
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - ecs
  - prefab
  - cancellable
---

> Package: `com.hypixel.hytale.server.core.prefab.event`
> Extends: `CancellableEcsEvent`
> Implements: `ICancellableEcsEvent`
> Cancellable: Yes

ECS event dispatched when a prefab is being pasted into the world. Cancelling this event prevents the paste operation.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `prefabId` | `int` | `getPrefabId()` | No | No |
| `pasteStart` | `boolean` | `isPasteStart()` | No | No |

- **prefabId** -- The identifier of the prefab being pasted.
- **pasteStart** -- Whether this is the start of the paste operation (`true`) or a continuation.

## Fired By

Dispatch location not identified in decompiled source. This event may be dispatched by game modules not yet mapped.

## Listening

ECS events are handled by `EntityEventSystem` subclasses, not by `getEventRegistry().register()`.

```java
public class MyPrefabPasteHandler extends EntityEventSystem<EntityStore, PrefabPasteEvent> {
    @Override
    public Query<EntityStore> getQuery() {
        return MY_COMPONENT_TYPE;
    }

    @Override
    public void handle(int index, ArchetypeChunk<EntityStore> chunk,
                       Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer,
                       PrefabPasteEvent event) {
        int prefabId = event.getPrefabId();
        boolean isStart = event.isPasteStart();

        // Example: prevent pasting restricted prefabs
        if (isRestrictedPrefab(prefabId)) {
            event.setCancelled(true);
        }
    }
}

// Register in plugin setup():
getEntityStoreRegistry().registerSystem(new MyPrefabPasteHandler());
```

## Related Events

- [`PrefabPlaceEntityEvent`](./PrefabPlaceEntityEvent.md) -- Fired when a prefab places an entity into the world.
