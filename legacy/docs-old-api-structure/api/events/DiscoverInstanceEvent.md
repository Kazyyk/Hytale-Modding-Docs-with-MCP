---
title: "DiscoverInstanceEvent"
kind: "event"
package: "com.hypixel.hytale.builtin.instances.event"
fqcn: "com.hypixel.hytale.builtin.instances.event.DiscoverInstanceEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - ecs
  - instance
---

> Package: `com.hypixel.hytale.builtin.instances.event`
> Extends: `EcsEvent`
> Cancellable: No (base class) -- see inner class below

Abstract ECS event dispatched when an instance is discovered. Carries the instance world UUID and the discovery configuration. The `Display` inner class fires for the visual notification and can be cancelled.

## Fields / Accessors (Base Class)

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `instanceWorldUuid` | `UUID` | `getInstanceWorldUuid()` | No | No |
| `discoveryConfig` | `InstanceDiscoveryConfig` | `getDiscoveryConfig()` | No | No |

- **instanceWorldUuid** -- The UUID of the instance world that was discovered.
- **discoveryConfig** -- The discovery configuration for this instance.

---

## DiscoverInstanceEvent.Display

> Extends: `DiscoverInstanceEvent`
> Implements: `ICancellableEcsEvent`
> Cancellable: Yes

Fired when instance discovery UI should be displayed. Cancelling this event suppresses the display. The `display` field can be toggled independently via `setDisplay(boolean)`.

### Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `instanceWorldUuid` | `UUID` | `getInstanceWorldUuid()` | No | No |
| `discoveryConfig` | `InstanceDiscoveryConfig` | `getDiscoveryConfig()` | No | No |
| `display` | `boolean` | `shouldDisplay()` | Yes | No |

- **display** -- Whether to show the discovery UI. Defaults to `discoveryConfig.isDisplay()`. Mutable via `setDisplay(boolean)`.

### Fired By

Dispatch location not identified in decompiled source. This event may be dispatched by game modules not yet mapped.

### Listening

```java
public class MyInstanceDisplayHandler extends EntityEventSystem<EntityStore, DiscoverInstanceEvent.Display> {
    @Override
    public Query<EntityStore> getQuery() {
        return MY_COMPONENT_TYPE;
    }

    @Override
    public void handle(int index, ArchetypeChunk<EntityStore> chunk,
                       Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer,
                       DiscoverInstanceEvent.Display event) {
        UUID instanceId = event.getInstanceWorldUuid();

        // Example: suppress discovery popups for already-visited instances
        if (hasVisited(instanceId)) {
            event.setCancelled(true);
        }
    }
}

// Register in plugin setup():
getEntityStoreRegistry().registerSystem(new MyInstanceDisplayHandler());
```

## Related Events

- [`DiscoverZoneEvent`](./DiscoverZoneEvent.md) -- Similar ECS event for zone discovery. Follows the same base/Display pattern.
