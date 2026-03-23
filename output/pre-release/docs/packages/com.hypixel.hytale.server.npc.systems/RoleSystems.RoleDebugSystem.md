---
title: "RoleSystems.RoleDebugSystem"
kind: "class"
package: "com.hypixel.hytale.server.npc.systems"
fqcn: "com.hypixel.hytale.server.npc.systems.RoleSystems.RoleDebugSystem"
api_surface: false
extends: "com.hypixel.hytale.server.npc.systems.SteppableTickingSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:28:03Z"
tags:
  - "server"
  - "npc"
  - "ecs"
  - "system"
  - "debug"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.systems`

```java
public static class RoleDebugSystem extends SteppableTickingSystem
```

Inner class of `RoleSystems`. Renders debug visualizations for NPC roles including sensor ranges (discs/sectors), leash position tethers, path waypoints, and marked target arrows. Uses `DebugUtils` to draw shapes, spheres, lines, and arrows in the world.

## Constructors

| Signature |
|---|
| `RoleDebugSystem(@Nonnull ComponentType<EntityStore, NPCEntity> npcComponentType, @Nonnull Set<Dependency<EntityStore>> dependencies)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Set<Dependency<EntityStore>>` | `getDependencies()` |
| `public` | `boolean` | `isParallel(int archetypeChunkSize, int taskCount)` |
| `public` | `Query<EntityStore>` | `getQuery()` |
| `public` | `void` | `steppedTick(float dt, int index, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer)` |
