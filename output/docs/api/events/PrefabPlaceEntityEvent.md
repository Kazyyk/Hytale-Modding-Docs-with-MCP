---
title: "PrefabPlaceEntityEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.prefab.event"
fqcn: "com.hypixel.hytale.server.core.prefab.event.PrefabPlaceEntityEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - ecs
  - prefab
  - entity
---

> Package: `com.hypixel.hytale.server.core.prefab.event`
> Extends: `EcsEvent`
> Cancellable: No

ECS event dispatched when a prefab places an entity into the world. This is an informational event -- the entity placement has already occurred.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `prefabId` | `int` | `getPrefabId()` | No | No |
| `holder` | `Holder<EntityStore>` | `getHolder()` | No | No |

- **prefabId** -- The identifier of the prefab that placed the entity.
- **holder** -- The entity holder for the entity that was placed.

## Fired By

Dispatch location not identified in decompiled source. This event may be dispatched by game modules not yet mapped.

## Listening

ECS events are handled by `EntityEventSystem` subclasses, not by `getEventRegistry().register()`.

```java
public class MyPrefabEntityHandler extends EntityEventSystem<EntityStore, PrefabPlaceEntityEvent> {
    @Override
    public Query<EntityStore> getQuery() {
        return MY_COMPONENT_TYPE;
    }

    @Override
    public void handle(int index, ArchetypeChunk<EntityStore> chunk,
                       Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer,
                       PrefabPlaceEntityEvent event) {
        int prefabId = event.getPrefabId();
        Holder<EntityStore> holder = event.getHolder();

        // Example: track entities spawned by prefabs
        trackPrefabEntity(prefabId, holder);
    }
}

// Register in plugin setup():
getEntityStoreRegistry().registerSystem(new MyPrefabEntityHandler());
```

## Related Events

- [`PrefabPasteEvent`](./PrefabPasteEvent.md) -- Fired when a prefab is pasted into the world. Entity placement may occur as part of the paste.
