---
title: "PrepareUniverseEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events"
fqcn: "com.hypixel.hytale.server.core.event.events.PrepareUniverseEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-09T23:10:00Z"
tags:
  - lifecycle
  - server
---

> Package: `com.hypixel.hytale.server.core.event.events`
> Implements: `IEvent<Void>`
> Cancellable: No

**Deprecated.** This event is deprecated and may be removed in a future version.

Dispatched during universe initialization to provide listeners with access to the world configuration provider. Listeners can use this event to inspect or mutate the `WorldConfigProvider` before worlds are created. The world config provider field is mutable, allowing listeners to replace the provider entirely.

## Fields / Accessors

| Accessor | Return Type | Description |
|----------|-------------|-------------|
| `getWorldConfigProvider()` | `WorldConfigProvider` | Returns the current world configuration provider. Mutable -- listeners may replace this value. |

## Fired By

- Dispatched by `Universe.init` (line 255) via the event bus during universe initialization. The event carries the `WorldConfigProvider` used to configure worlds in the universe.

## Listening

```java
getEventRegistry().register(PrepareUniverseEvent.class, event -> {
    WorldConfigProvider provider = event.getWorldConfigProvider();
    // Inspect or replace the world config provider before worlds are created
});
```

## Related Events

- [`BootEvent`](./BootEvent.md) -- fires earlier in the server lifecycle, before universes are initialized.
- [`ShutdownEvent`](./ShutdownEvent.md) -- fires during server shutdown, after universes have been active.
