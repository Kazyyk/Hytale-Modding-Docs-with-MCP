---
title: "ShutdownEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events"
fqcn: "com.hypixel.hytale.server.core.event.events.ShutdownEvent"
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

Marker event dispatched during the server shutdown lifecycle. This event carries no data fields but defines static priority constants that govern the ordering of shutdown-phase listeners. Listeners register at specific priority levels to ensure graceful teardown (e.g., disconnecting players before unbinding network listeners).

Because the key type is `Void`, this event uses class-dispatch shorthand -- no event object is constructed.

## Fields / Accessors

This event has no instance fields or accessors.

### Static Constants

| Constant | Type | Value | Description |
|----------|------|-------|-------------|
| `DISCONNECT_PLAYERS` | `short` | `-48` | Priority for listeners that disconnect players during shutdown. |
| `UNBIND_LISTENERS` | `short` | `-40` | Priority for listeners that unbind network listeners during shutdown. |
| `SHUTDOWN_WORLDS` | `short` | `-32` | Priority for listeners that shut down worlds during shutdown. |

These constants define well-known priority values for ordering shutdown-phase listener execution. Lower (more negative) values execute first, ensuring players are disconnected before network listeners are unbound, and network listeners are unbound before worlds are shut down.

## Fired By

- Dispatched by `HytaleServer.shutdown0()` (line 440) via `eventBus.dispatch(ShutdownEvent.class)`. Fires during the server shutdown lifecycle using class-dispatch shorthand (no event object is constructed).

## Listening

```java
// Register at a specific shutdown phase priority
getEventRegistry().register(ShutdownEvent.class, ShutdownEvent.DISCONNECT_PLAYERS, event -> {
    // Disconnect all players before other shutdown work
});

getEventRegistry().register(ShutdownEvent.class, ShutdownEvent.UNBIND_LISTENERS, event -> {
    // Unbind network listeners after players are disconnected
});

getEventRegistry().register(ShutdownEvent.class, ShutdownEvent.SHUTDOWN_WORLDS, event -> {
    // Shut down worlds after network is unbound
});
```

## Related Events

- [`BootEvent`](./BootEvent.md) -- the corresponding lifecycle event fired when the server boots up.
