---
title: "PrepareUniverseEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events"
fqcn: "com.hypixel.hytale.server.core.event.events.PrepareUniverseEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - lifecycle
  - deprecated
---

> **DEPRECATED** -- This event is deprecated.

> Package: `com.hypixel.hytale.server.core.event.events`
> Implements: `IEvent<Void>`
> Cancellable: No

Standard event dispatched during universe initialization. Provides listeners with access to the world configuration provider. The `worldConfigProvider` field is mutable, allowing listeners to replace the provider entirely before worlds are created.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `worldConfigProvider` | `WorldConfigProvider` | `getWorldConfigProvider()` | Yes | No |

- **worldConfigProvider** -- The world configuration provider used to configure worlds in the universe. Mutable via `setWorldConfigProvider(WorldConfigProvider)`.

## Fired By

- `Universe.init` (line 255) via `eventBus dispatch` -- Dispatched during universe initialization with the world config provider.

## Listening

```java
getEventRegistry().register(PrepareUniverseEvent.class, event -> {
    WorldConfigProvider provider = event.getWorldConfigProvider();
    // Inspect or replace the world config provider before worlds are created
});
```

## Related Events

- [`BootEvent`](./BootEvent.md) -- Fires earlier in the server lifecycle, before universes are initialized.
- [`ShutdownEvent`](./ShutdownEvent.md) -- Fires during server shutdown.
- [`AllWorldsLoadedEvent`](./AllWorldsLoadedEvent.md) -- Fires after all worlds have completed loading.
