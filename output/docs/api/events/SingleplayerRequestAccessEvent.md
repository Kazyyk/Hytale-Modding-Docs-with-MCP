---
title: "SingleplayerRequestAccessEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.modules.singleplayer"
fqcn: "com.hypixel.hytale.server.core.modules.singleplayer.SingleplayerRequestAccessEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - singleplayer
---

> Package: `com.hypixel.hytale.server.core.modules.singleplayer`
> Implements: `IEvent<Void>`
> Cancellable: No

Standard event dispatched when singleplayer mode requests access control. Carries an `Access` object representing the access request.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `access` | `Access` | `getAccess()` | No | No |

- **access** -- The access request from the singleplayer module.

## Fired By

Dispatch location not identified in decompiled source. This event may be dispatched by game modules not yet mapped.

## Listening

```java
getEventRegistry().register(SingleplayerRequestAccessEvent.class, event -> {
    Access access = event.getAccess();
    // Handle singleplayer access request
});
```

## Related Events

- [`PlayerSetupConnectEvent`](./PlayerSetupConnectEvent.md) -- The general connection event. Singleplayer access may occur before the standard connection flow.
