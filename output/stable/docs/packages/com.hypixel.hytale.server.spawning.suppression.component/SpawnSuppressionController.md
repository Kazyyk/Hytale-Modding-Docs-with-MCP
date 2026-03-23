---
title: "SpawnSuppressionController"
kind: "class"
package: "com.hypixel.hytale.server.spawning.suppression.component"
fqcn: "com.hypixel.hytale.server.spawning.suppression.component.SpawnSuppressionController"
api_surface: false
extends: ~
implements: 
  - "Resource<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "spawning"
  - "ecs"
---

**Package:** `com.hypixel.hytale.server.spawning.suppression.component`

```java
public class SpawnSuppressionController implements Resource<EntityStore>
```

Implementation of `Resource<EntityStore>`.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getResourceType()` | `ResourceType<EntityStore, SpawnSuppressionController>` | static public method. |
| `getSpawnSuppressorMap()` | `Map<UUID, SpawnSuppressorEntry>` | public method. |
| `getChunkSuppressionMap()` | `Long2ObjectConcurrentHashMap<ChunkSuppressionEntry>` | public method. |
| `clone()` | `Resource<EntityStore>` | public method. |
