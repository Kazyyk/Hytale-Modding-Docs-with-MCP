---
title: "IWorldGen"
kind: "interface"
package: "com.hypixel.hytale.server.core.universe.world.worldgen"
fqcn: "com.hypixel.hytale.server.core.universe.world.worldgen.IWorldGen"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "world"
  - "worldgen"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.worldgen`

```java
public interface IWorldGen
```

Core interface for world generation implementations. Defines the contract for generating chunks, providing spawn points, and timing collection.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `WorldGenTimingsCollector` | `getTimings()` |
| `` | `CompletableFuture<GeneratedChunk>` | `generate(int seed, long chunkIndex, int x, int z, LongPredicate predicate)` |
| `` | `Transform[]` | `getSpawnPoints(int seed)` |
| `default` | `ISpawnProvider` | `getDefaultSpawnProvider(int seed)` |
| `default` | `void` | `shutdown()` |
