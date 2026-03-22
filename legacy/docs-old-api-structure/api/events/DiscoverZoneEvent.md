---
title: "DiscoverZoneEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.ecs"
fqcn: "com.hypixel.hytale.server.core.event.events.ecs.DiscoverZoneEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - ecs
  - world
  - zone
---

> Package: `com.hypixel.hytale.server.core.event.events.ecs`
> Extends: `EcsEvent`
> Cancellable: No (base class) -- see inner class below

Abstract ECS event dispatched when a player discovers a new zone in the world. The base class is **not** cancellable -- zone discovery itself always proceeds. The `Display` inner class fires for the visual notification and can be cancelled to suppress the on-screen display.

## Fields / Accessors (Base Class)

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `discoveryInfo` | `WorldMapTracker.ZoneDiscoveryInfo` | `getDiscoveryInfo()` | No | No |

- **discoveryInfo** -- Contains information about the discovered zone, including zone identity and discovery metadata from the world map tracker.

---

## DiscoverZoneEvent.Display

> Extends: `DiscoverZoneEvent`
> Implements: `ICancellableEcsEvent`
> Cancellable: Yes

Fired after zone discovery to trigger the on-screen display notification. Cancelling this event suppresses the visual notification while the zone is still recorded as discovered.

### Fired By

- `WorldMapTracker` (line 148) via `componentAccessor.invoke(ref, event)` -- ECS dispatch when a player discovers a new zone.

### Listening

```java
public class MyZoneDisplayHandler extends EntityEventSystem<EntityStore, DiscoverZoneEvent.Display> {
    @Override
    public Query<EntityStore> getQuery() {
        return MY_COMPONENT_TYPE;
    }

    @Override
    public void handle(int index, ArchetypeChunk<EntityStore> chunk,
                       Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer,
                       DiscoverZoneEvent.Display event) {
        WorldMapTracker.ZoneDiscoveryInfo info = event.getDiscoveryInfo();

        // Example: suppress zone discovery popups during cutscenes
        if (isCutsceneActive()) {
            event.setCancelled(true);
        }
    }
}

// Register in plugin setup():
getEntityStoreRegistry().registerSystem(new MyZoneDisplayHandler());
```

## Related Events

- [`DiscoverInstanceEvent`](./DiscoverInstanceEvent.md) -- Similar ECS event for instance discovery. Follows the same base/Display pattern.
