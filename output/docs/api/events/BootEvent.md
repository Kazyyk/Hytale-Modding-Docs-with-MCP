---
title: "BootEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events"
fqcn: "com.hypixel.hytale.server.core.event.events.BootEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - lifecycle
---

> Package: `com.hypixel.hytale.server.core.event.events`
> Implements: `IEvent<Void>`
> Cancellable: No

Marker event dispatched during the server boot lifecycle. This event carries no data fields and serves as a signal that the server boot sequence has reached the event-dispatch stage. Plugins can listen for this event to perform initialization that depends on the server's core systems being available.

The event is dispatched using class-dispatch shorthand -- no event object is constructed by the caller. The EventBus creates one internally.

## Fields / Accessors

This event has no data fields.

## Fired By

- `HytaleServer.boot()` (line 407) via `eventBus.dispatch(BootEvent.class)` -- Server boot lifecycle. Uses class-dispatch shorthand.

## Listening

```java
getEventRegistry().register(BootEvent.class, event -> {
    // Server has booted -- perform plugin initialization
    getLogger().info("Plugin initialized during server boot");
});
```

## Related Events

- [`ShutdownEvent`](./ShutdownEvent.md) -- The counterpart lifecycle event, fired when the server is shutting down.
- [`LoadAssetEvent`](./LoadAssetEvent.md) -- Fired earlier in the boot sequence during asset loading.
- [`PrepareUniverseEvent`](./PrepareUniverseEvent.md) -- Fired during universe initialization.
