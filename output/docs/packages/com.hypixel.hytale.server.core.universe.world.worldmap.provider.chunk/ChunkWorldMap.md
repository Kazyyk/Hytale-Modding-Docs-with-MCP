---
title: "ChunkWorldMap"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.worldmap.provider.chunk"
fqcn: "com.hypixel.hytale.server.core.universe.world.worldmap.provider.chunk.ChunkWorldMap"
api_surface: false
extends: null
implements:
  - "IWorldMap"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "worldmap"
  - "provider"
  - "chunk"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.worldmap.provider.chunk`

```java
public class ChunkWorldMap implements IWorldMap
```

Implements `IWorldMap`.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `WorldMapSettings` | `getWorldMapSettings()` |
| `` | `return new` | `WorldMapSettings(null, 3.0F, 2.0F, 3, 32, settingsPacket)` |
| `@Override public` | `CompletableFuture<WorldMap>` | `generate(World world, int imageWidth, int imageHeight, @Nonnull LongSet chunksToGenerate)` |
| `@Override public` | `CompletableFuture<Map<String, MapMarker>>` | `generatePointsOfInterest(World world)` |
