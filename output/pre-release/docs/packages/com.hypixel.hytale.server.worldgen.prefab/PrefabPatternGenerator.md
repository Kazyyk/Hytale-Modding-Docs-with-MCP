---
title: "PrefabPatternGenerator"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.prefab"
fqcn: "com.hypixel.hytale.server.worldgen.prefab.PrefabPatternGenerator"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "prefab"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.prefab`

```java
public class PrefabPatternGenerator
```

Configures how prefabs are distributed across the world during generation. Combines a point generator (grid pattern), height/spawn conditions, block masks, rotation options, and displacement functions to control prefab placement.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `PrefabCategory` | `getCategory()` |
| `public` | `IPointGenerator` | `getGridGenerator()` |
| `public` | `ICoordinateCondition` | `getMapCondition()` |
| `public` | `BlockMaskCondition` | `getPrefabPlacementConfiguration()` |
| `public` | `boolean` | `isFitHeightmap()` |
| `public` | `IBlockFluidCondition` | `getParentCondition()` |
| `public` | `ICoordinateRndCondition` | `getHeightCondition()` |
| `public` | `IHeightThresholdInterpreter` | `getHeightThresholdInterpreter()` |
| `public` | `PrefabRotation[]` | `getRotations()` |
| `public` | `int` | `getDisplacement(int seed, int x, int z)` |
| `public` | `boolean` | `isOnWater()` |
| `public` | `boolean` | `isDeepSearch()` |
| `public` | `boolean` | `isSubmerge()` |
| `public` | `int` | `getMaxSize()` |
| `public` | `int` | `getExclusionRadius()` |
