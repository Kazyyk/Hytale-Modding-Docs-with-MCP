---
title: "VoidInvasionPortalsSpawnSystem"
kind: "class"
package: "com.hypixel.hytale.builtin.portals.systems.voidevent"
fqcn: "com.hypixel.hytale.builtin.portals.systems.voidevent.VoidInvasionPortalsSpawnSystem"
api_surface: false
extends: "DelayedEntitySystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "portals"
  - "systems"
  - "voidevent"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.portals.systems.voidevent`

```java
public class VoidInvasionPortalsSpawnSystem extends DelayedEntitySystem<EntityStore>
```

Delayed entity system (2.0s interval) that spawns invasion portals during void events. Searches for valid positions near random players using spatial queries with clustering constraints. Limited to 24 portals.

## Fields

| Modifier | Type | Field | Description |
|---|---|---|---|
| `private static final` | `int` | `MAX_PORTALS` | Maximum invasion portals (24) |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)` |
| `public` | `Query<EntityStore>` | `getQuery()` |
