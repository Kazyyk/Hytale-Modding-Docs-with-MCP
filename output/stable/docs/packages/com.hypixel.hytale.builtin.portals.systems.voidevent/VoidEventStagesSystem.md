---
title: "VoidEventStagesSystem"
kind: "class"
package: "com.hypixel.hytale.builtin.portals.systems.voidevent"
fqcn: "com.hypixel.hytale.builtin.portals.systems.voidevent.VoidEventStagesSystem"
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
public class VoidEventStagesSystem extends DelayedEntitySystem<EntityStore>
```

Delayed entity system (1.5s interval) that manages progression through void event stages based on elapsed time. Transitions stages by starting/stopping forced weather effects.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)` |
| `public static` | `void` | `startStage(VoidEventStage stage, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)` |
| `public static` | `void` | `stopStage(VoidEventStage stage, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)` |
| `public` | `Query<EntityStore>` | `getQuery()` |
