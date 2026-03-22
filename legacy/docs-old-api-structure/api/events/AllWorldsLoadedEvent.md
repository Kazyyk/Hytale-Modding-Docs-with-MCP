---
title: "AllWorldsLoadedEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.universe.world.events"
fqcn: "com.hypixel.hytale.server.core.universe.world.events.AllWorldsLoadedEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - lifecycle
  - world
---

> Package: `com.hypixel.hytale.server.core.universe.world.events`
> Implements: `IEvent<Void>`
> Cancellable: No

Standard event dispatched when all worlds have completed loading. This is a marker event with no data fields -- it signals that the world loading phase of the server startup is complete.

## Fields / Accessors

This event has no data fields.

## Fired By

Dispatch location not identified in decompiled source. This event may be dispatched by game modules not yet mapped.

## Listening

```java
getEventRegistry().register(AllWorldsLoadedEvent.class, event -> {
    // All worlds are now loaded and available
    getLogger().info("All worlds loaded successfully");
});
```

## Related Events

- [`PrepareUniverseEvent`](./PrepareUniverseEvent.md) -- Fired earlier during universe initialization.
- [`BootEvent`](./BootEvent.md) -- Fired during server boot lifecycle.
