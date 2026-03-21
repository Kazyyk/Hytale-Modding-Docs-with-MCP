---
title: "LocalSpawnForceTriggerSystem"
kind: "class"
package: "com.hypixel.hytale.server.spawning.local"
fqcn: "com.hypixel.hytale.server.spawning.local.LocalSpawnForceTriggerSystem"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "spawning"
  - "local"
  - "class"
---

**Package:** `com.hypixel.hytale.server.spawning.local`

```java
public class LocalSpawnForceTriggerSystem extends EntityTickingSystem<EntityStore>
```

System that handles forced re-triggering of local spawn controllers with a randomized delay (0-5 seconds). Activated when spawn beacons are removed or other events require immediate re-evaluation.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Query<EntityStore>` | `getQuery()` |
| `public` | `void` | `tick(float dt, int systemIndex, Store<EntityStore> store)` |
| `public` | `void` | `tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)` |
