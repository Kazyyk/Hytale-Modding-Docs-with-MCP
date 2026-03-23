---
title: "GeneratorChunkWorldMap"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.map"
fqcn: "com.hypixel.hytale.server.worldgen.map.GeneratorChunkWorldMap"
api_surface: false
extends: "ChunkWorldMap"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "map"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.map`

```java
public class GeneratorChunkWorldMap extends ChunkWorldMap
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `WorldMap` | `EMPTY` |
| `private final` | `ChunkGenerator` | `generator` |
| `private final` | `Executor` | `executor` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `CompletableFuture<Map<String,MapMarker>>` | `generatePointsOfInterest(World world)` |
| `@Nonnull @Override public` | `WorldMapSettings` | `getWorldMapSettings()` |
