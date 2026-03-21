---
title: "ShutdownEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events"
fqcn: "com.hypixel.hytale.server.core.event.events.ShutdownEvent"
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

Marker event dispatched during the server shutdown lifecycle. This event carries no instance data fields, but defines static priority constants that govern the ordering of shutdown-phase listeners. Listeners registered at these priority levels handle orderly teardown stages.

### Static Constants

| Constant | Type | Value | Description |
|----------|------|-------|-------------|
| `DISCONNECT_PLAYERS` | `short` | `-48` | Priority for listeners that disconnect players |
| `UNBIND_LISTENERS` | `short` | `-40` | Priority for listeners that unbind network listeners |
| `SHUTDOWN_WORLDS` | `short` | `-32` | Priority for listeners that shut down worlds |

These constants define well-known priority values for ordering shutdown-phase listener execution. Lower (more negative) values execute first, ensuring players are disconnected before network listeners are unbound, and network listeners are unbound before worlds are shut down.

## Fields / Accessors

This event has no instance data fields. It is dispatched using the class-dispatch shorthand `eventBus.dispatch(ShutdownEvent.class)`.

## Fired By

- `HytaleServer.shutdown0()` (line 459) via `eventBus.dispatch(ShutdownEvent.class)` -- Server shutdown lifecycle.

## Listening

```java
// Standard shutdown listener:
getEventRegistry().register(ShutdownEvent.class, event -> {
    // Perform cleanup
    getLogger().info("Plugin shutting down");
});

// Listener at a specific shutdown phase:
getEventRegistry().register(ShutdownEvent.SHUTDOWN_WORLDS, ShutdownEvent.class, event -> {
    // Runs at the SHUTDOWN_WORLDS phase (priority -32)
    saveWorldData();
});
```

## Related Events

- [`BootEvent`](./BootEvent.md) -- The counterpart lifecycle event, fired when the server boots.
