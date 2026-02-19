---
title: "AllNPCsLoadedEvent"
kind: "event"
package: "com.hypixel.hytale.server.npc"
fqcn: "com.hypixel.hytale.server.npc.AllNPCsLoadedEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - lifecycle
  - npc
---

> Package: `com.hypixel.hytale.server.npc`
> Implements: `IEvent<Void>`
> Cancellable: No

Standard event dispatched when all NPC builders have been loaded. Carries two maps of NPC builder info: the complete set of all NPCs and the subset that were successfully loaded. Both maps are returned as unmodifiable views.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `allNPCs` | `Int2ObjectMap<BuilderInfo>` | `getAllNPCs()` | No | No |
| `loadedNPCs` | `Int2ObjectMap<BuilderInfo>` | `getLoadedNPCs()` | No | No |

- **allNPCs** -- Unmodifiable map of all NPC builder info entries, keyed by integer ID.
- **loadedNPCs** -- Unmodifiable map of successfully loaded NPC builder info entries, keyed by integer ID.

## Fired By

Dispatch location not identified in decompiled source. This event may be dispatched by game modules not yet mapped.

## Listening

```java
getEventRegistry().register(AllNPCsLoadedEvent.class, event -> {
    Int2ObjectMap<BuilderInfo> allNPCs = event.getAllNPCs();
    Int2ObjectMap<BuilderInfo> loaded = event.getLoadedNPCs();

    getLogger().info("Loaded " + loaded.size() + " of " + allNPCs.size() + " NPCs");
});
```

## Related Events

- [`LoadedNPCEvent`](./LoadedNPCEvent.md) -- Fired individually for each NPC builder as it is loaded.
