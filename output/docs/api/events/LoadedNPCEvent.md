---
title: "LoadedNPCEvent"
kind: "event"
package: "com.hypixel.hytale.server.spawning"
fqcn: "com.hypixel.hytale.server.spawning.LoadedNPCEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - lifecycle
  - npc
---

> Package: `com.hypixel.hytale.server.spawning`
> Implements: `IEvent<Void>`
> Cancellable: No

Standard event dispatched when a single NPC builder is loaded. The builder info must contain a builder that implements `ISpawnableWithModel` -- the constructor validates this requirement.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `builderInfo` | `BuilderInfo` | `getBuilderInfo()` | No | No |

- **builderInfo** -- Information about the NPC builder that was loaded. The builder within this info is guaranteed to implement `ISpawnableWithModel`.

## Fired By

Dispatch location not identified in decompiled source. This event may be dispatched by game modules not yet mapped.

## Listening

```java
getEventRegistry().register(LoadedNPCEvent.class, event -> {
    BuilderInfo info = event.getBuilderInfo();
    // Handle individual NPC builder load
});
```

## Related Events

- [`AllNPCsLoadedEvent`](./AllNPCsLoadedEvent.md) -- Fired after all NPC builders have been loaded. Provides aggregate maps.
