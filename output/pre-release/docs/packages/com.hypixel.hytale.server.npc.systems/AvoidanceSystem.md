---
title: "AvoidanceSystem"
kind: "class"
package: "com.hypixel.hytale.server.npc.systems"
fqcn: "com.hypixel.hytale.server.npc.systems.AvoidanceSystem"
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
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.systems`

```java
public class AvoidanceSystem extends SteppableTickingSystem
```

ECS ticking system that applies avoidance and separation steering to NPCs. Runs after `RoleSystems.BehaviourTickSystem`. For each NPC, blends avoidance and separation forces into the body steering vector, and optionally renders debug visualizations for avoidance, separation, orientation hints, and pre/post-blend steering.

## Constructors

| Signature |
|---|
| `AvoidanceSystem(@Nonnull ComponentType<EntityStore, NPCEntity> componentType)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Set<Dependency<EntityStore>>` | `getDependencies()` |
| `public` | `boolean` | `isParallel(int archetypeChunkSize, int taskCount)` |
| `public` | `Query<EntityStore>` | `getQuery()` |
| `public` | `void` | `steppedTick(float dt, int index, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer)` |
