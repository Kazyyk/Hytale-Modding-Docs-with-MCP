---
title: "NPCDamageSystems.DropDeathItems"
kind: "class"
package: "com.hypixel.hytale.server.npc.systems"
fqcn: "com.hypixel.hytale.server.npc.systems.NPCDamageSystems.DropDeathItems"
api_surface: false
extends: "com.hypixel.hytale.component.system.tick.EntityTickingSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:28:03Z"
tags:
  - "server"
  - "npc"
  - "ecs"
  - "system"
  - "damage"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.systems`

```java
public static class DropDeathItems extends EntityTickingSystem<EntityStore>
```

Inner class of `NPCDamageSystems`. Ticking system that handles item drops on NPC death. Runs after `DeathSystems.TickCorpseRemoval` and before `DeathSystems.CorpseRemoval`. When an NPC dies with `ItemsLossMode.ALL`, drops inventory items and items from the configured drop list as item entities.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Query<EntityStore>` | `getQuery()` |
| `public` | `Set<Dependency<EntityStore>>` | `getDependencies()` |
| `public` | `void` | `tick(float dt, int index, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer)` |
