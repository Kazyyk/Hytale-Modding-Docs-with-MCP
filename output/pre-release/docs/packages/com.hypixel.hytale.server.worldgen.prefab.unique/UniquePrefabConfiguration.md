---
title: "UniquePrefabConfiguration"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.prefab.unique"
fqcn: "com.hypixel.hytale.server.worldgen.prefab.unique.UniquePrefabConfiguration"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "worldgen"
  - "prefab"
  - "unique"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.prefab.unique`

```java
public class UniquePrefabConfiguration
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `ICoordinateRndCondition` | `heightCondition` |
| `protected final` | `BlockMaskCondition` | `placementConfiguration` |
| `protected final` | `PrefabRotation[]` | `rotations` |
| `protected final` | `IIntCondition` | `biomeMask` |
| `protected final` | `ICoordinateCondition` | `mapCondition` |
| `protected final` | `IBlockFluidCondition` | `parent` |
| `protected final` | `Vector2d` | `anchor` |
| `protected final` | `Vector3d` | `spawnOffset` |
| `protected final` | `double` | `maxDistance` |
| `protected final` | `boolean` | `fitHeightmap` |
| `protected final` | `boolean` | `submerge` |
| `protected final` | `boolean` | `onWater` |
| `protected final` | `int` | `environmentId` |
| `protected final` | `int` | `maxAttempts` |
| `protected final` | `double` | `exclusionRadiusSquared` |
| `protected final` | `boolean` | `spawnLocation` |
| `protected final` | `double` | `zoneBorderExclusion` |
| `protected final` | `boolean` | `showOnMap` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `UniquePrefabConfiguration(ICoordinateRndCondition heightCondition,
        BlockMaskCondition placementConfiguration,
        PrefabRotation[] rotations,
        IIntCondition biomeMask,
        ICoordinateCondition mapCondition,
        IBlockFluidCondition parent,
        Vector2d anchor,
        Vector3d spawnOffset,
        double maxDistance,
        boolean fitHeightmap,
        boolean submerge,
        boolean onWater,
        int environmentId,
        int maxAttempts,
        double exclusionRadius,
        boolean spawnLocation,
        double zoneBorderExclusion,
        boolean showOnMap)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Vector2d` | `getAnchor()` |
| `public` | `double` | `getMaxDistance()` |
| `public` | `ICoordinateCondition` | `getMapCondition()` |
| `public` | `BlockMaskCondition` | `getPlacementConfiguration()` |
| `public` | `Vector3d` | `getSpawnOffset()` |
| `public` | `boolean` | `isValidParentBiome(@Nonnull Biome biome)` |
| `public` | `boolean` | `isFitHeightmap()` |
| `public` | `boolean` | `isSubmerge()` |
| `public` | `boolean` | `isValidParentBlock(int block, int fluid)` |
| `public` | `ICoordinateRndCondition` | `getHeightCondition()` |
| `public` | `PrefabRotation` | `getRotation(@Nonnull Random random)` |
| `public` | `boolean` | `isOnWater()` |
| `public` | `int` | `getEnvironmentId()` |
| `public` | `int` | `getMaxAttempts()` |
| `public` | `double` | `getExclusionRadiusSquared()` |
| `public` | `boolean` | `isSpawnLocation()` |
| `public` | `double` | `getZoneBorderExclusion()` |
| `public` | `boolean` | `isShowOnMap()` |
