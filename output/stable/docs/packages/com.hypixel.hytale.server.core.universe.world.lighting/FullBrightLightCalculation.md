---
title: "FullBrightLightCalculation"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.lighting"
fqcn: "com.hypixel.hytale.server.core.universe.world.lighting.FullBrightLightCalculation"
api_surface: false
extends: "null"
implements: ["LightCalculation"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "world"
  - "lighting"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.lighting`

```java
public class FullBrightLightCalculation implements LightCalculation
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `ChunkLightingManager` | `chunkLightingManager` |
| `private` | `LightCalculation` | `delegate` |
| `` | `CalculationResult` | `result` |
| `` | `WorldChunk` | `worldChunk` |
| `` | `boolean` | `handled` |
| `` | `BlockSection` | `section` |
| `` | `ChunkLightDataBuilder` | `light` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `FullBrightLightCalculation(ChunkLightingManager chunkLightingManager, LightCalculation delegate)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `init(@Nonnull WorldChunk worldChunk)` |
| `public` | `CalculationResult` | `calculateLight(@Nonnull Vector3i chunkPosition)` |
| `public` | `boolean` | `invalidateLightAtBlock(@Nonnull WorldChunk worldChunk, int blockX, int blockY, int blockZ, @Nonnull BlockType blockType, int oldHeight, int newHeight)` |
| `public` | `boolean` | `invalidateLightInChunkSections(@Nonnull WorldChunk worldChunk, int sectionIndexFrom, int sectionIndexTo)` |
| `` | `public void` | `setFullBright(@Nonnull WorldChunk worldChunk, int chunkY)` |

## Related Types

- [CalculationResult](CalculationResult.md)
- [ChunkLightingManager](ChunkLightingManager.md)
- [LightCalculation](LightCalculation.md)
