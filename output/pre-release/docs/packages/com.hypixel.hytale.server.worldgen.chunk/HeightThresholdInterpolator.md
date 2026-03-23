---
title: "HeightThresholdInterpolator"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.chunk"
fqcn: "com.hypixel.hytale.server.worldgen.chunk.HeightThresholdInterpolator"
api_surface: false
extends: "null"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "chunk"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.chunk`

```java
public class HeightThresholdInterpolator
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `int` | `MAX_RADIUS` |
| `public static final` | `int` | `MAX_RADIUS2` |
| `private final` | `ChunkGeneratorExecution` | `execution` |
| `private final` | `CoreDataCacheEntry[]` | `entries` |
| `private final` | `int` | `radius` |
| `private final` | `int` | `size` |
| `private final` | `int` | `totalSize` |
| `` | `ChunkGenerator` | `generator` |
| `` | `int` | `cx` |
| `` | `int` | `cz` |
| `` | `CoreDataCacheEntry` | `entry` |
| `` | `InterpolatedBiomeCountList` | `list` |
| `` | `ZoneBiomeResult` | `center` |
| `` | `int` | `radius` |
| `` | `int` | `radius2` |
| `` | `int` | `distance2` |
| `` | `ZoneBiomeResult` | `biomeResult` |
| `` | `InterpolatedBiomeCountList.BiomeCountResult` | `result` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `HeightThresholdInterpolator(ChunkGeneratorExecution execution)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `CoreDataCacheEntry[]` | `getEntries()` |
| `public` | `HeightThresholdInterpolator` | `populate(int seed)` |
| `` | `public void` | `generateInterpolatedBiomeCountAt(int cx, int cz, @Nonnull InterpolatedBiomeCountList biomeCountList)` |
| `` | `public double` | `getHeightNoise(int cx, int cz)` |
| `` | `public float` | `getHeightThreshold(int seed, int x, int z, int y)` |
| `` | `private float` | `interpolateHeightThreshold(int seed, int x, int z, int y)` |
| `` | `protected CoreDataCacheEntry` | `tableEntry(int cx, int cz)` |
| `` | `protected void` | `setTableEntry(int cx, int cz, CoreDataCacheEntry entry)` |
| `` | `protected ZoneBiomeResult` | `zoneBiomeResult(int cx, int cz)` |
| `` | `public int` | `getLowestNonOne(int cx, int cz)` |
| `` | `public int` | `getHighestNonZero(int cx, int cz)` |
| `` | `protected int` | `indexLocal(int x, int z)` |

## Related Types

- [ChunkGenerator](ChunkGenerator.md)
- [ChunkGeneratorExecution](ChunkGeneratorExecution.md)
- [ZoneBiomeResult](ZoneBiomeResult.md)
