---
title: "ChunkGenerator"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.chunk"
fqcn: "com.hypixel.hytale.server.worldgen.chunk.ChunkGenerator"
api_surface: false
extends: null
implements:
  - "com.hypixel.hytale.server.core.universe.world.worldgen.IBenchmarkableWorldGen"
  - "com.hypixel.hytale.server.core.universe.world.worldgen.ValidatableWorldGen"
  - "com.hypixel.hytale.metrics.MetricProvider"
  - "com.hypixel.hytale.server.core.universe.world.worldmap.provider.IWorldMapProvider"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:30:09Z"
tags:
  - "server"
  - "worldgen"
  - "chunk"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.chunk`

```java
public class ChunkGenerator implements IBenchmarkableWorldGen, ValidatableWorldGen, MetricProvider, IWorldMapProvider
```

Main chunk generation orchestrator. Manages a thread pool, caches for zone/biome results, interpolated biome counts, heights, caves, and unique prefabs. Generates chunks asynchronously by creating `ChunkGeneratorExecution` instances. Computes spawn points from unique prefabs.
