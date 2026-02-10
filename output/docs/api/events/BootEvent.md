---
title: "BootEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events"
fqcn: "com.hypixel.hytale.server.core.event.events.BootEvent"
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

Marker event dispatched during the server boot lifecycle. This event carries no data and serves as a signal that the server boot sequence has reached the event-dispatch stage. Listeners can use this to perform initialization work that depends on core server infrastructure being available.

Because the key type is `Void`, this event uses class-dispatch shorthand -- no event object is constructed. The event bus dispatches directly from the class token.

## Fields / Accessors

This event has no fields or accessors. It is an empty marker event.

## Fired By

- Dispatched by `HytaleServer.boot()` (line 388) via `eventBus.dispatch(BootEvent.class)`. Fires during the server boot lifecycle using class-dispatch shorthand (no event object is constructed).

## Listening

```java
getEventRegistry().register(BootEvent.class, event -> {
    // Perform initialization work after server boot infrastructure is ready
});
```

## Related Events

- [`ShutdownEvent`](./ShutdownEvent.md) -- the corresponding lifecycle event fired when the server shuts down.
