---
title: "WorldPathChangedEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.universe.world.path"
fqcn: "com.hypixel.hytale.server.core.universe.world.path.WorldPathChangedEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - world
---

> Package: `com.hypixel.hytale.server.core.universe.world.path`
> Implements: `IEvent<Void>`
> Cancellable: No

Standard event dispatched when the world path configuration changes. The world path must not be null -- the constructor validates this requirement.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `worldPath` | `WorldPath` | `getWorldPath()` | No | No |

- **worldPath** -- The new world path configuration.

## Fired By

Dispatch location not identified in decompiled source. This event may be dispatched by game modules not yet mapped.

## Listening

```java
getEventRegistry().register(WorldPathChangedEvent.class, event -> {
    WorldPath path = event.getWorldPath();
    // React to world path configuration changes
});
```

## Related Events

- [`AllWorldsLoadedEvent`](./AllWorldsLoadedEvent.md) -- Fired when all worlds have loaded.
