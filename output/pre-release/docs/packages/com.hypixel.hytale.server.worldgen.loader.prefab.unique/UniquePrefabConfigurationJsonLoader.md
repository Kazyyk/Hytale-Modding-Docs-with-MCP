---
title: "UniquePrefabConfigurationJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.prefab.unique"
fqcn: "com.hypixel.hytale.server.worldgen.loader.prefab.unique.UniquePrefabConfigurationJsonLoader"
api_surface: false
extends: "JsonLoader<SeedStringResource, UniquePrefabConfiguration>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "worldgen"
  - "loader"
  - "prefab"
  - "unique"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader.prefab.unique`

```java
public class UniquePrefabConfigurationJsonLoader extends JsonLoader<SeedStringResource, UniquePrefabConfiguration>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `ZoneFileContext` | `zoneContext` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `UniquePrefabConfigurationJsonLoader(SeedString<SeedStringResource> seed, Path dataFolder, JsonElement json, ZoneFileContext zoneContext)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `UniquePrefabConfiguration` | `load()` |
| `@Nonnull protected` | `IBlockFluidCondition` | `loadParent()` |
| `@Nullable protected` | `ICoordinateRndCondition` | `loadHeightThresholds()` |
| `@Nullable protected` | `IIntCondition` | `loadBiomeMask()` |
| `@Nullable protected` | `PrefabRotation[]` | `loadRotations()` |
| `@Nonnull protected` | `ICoordinateCondition` | `loadMapCondition()` |
| `@Nullable protected` | `BlockMaskCondition` | `loadMask()` |
| `@Nonnull protected` | `Vector2d` | `loadAnchor()` |
| `@Nonnull protected` | `Vector3d` | `loadSpawnOffset()` |
| `protected` | `int` | `loadEnvironment()` |
| `protected` | `boolean` | `loadFitHeightmap()` |
| `protected` | `boolean` | `loadSubmerge()` |
| `protected` | `boolean` | `loadOnWater()` |
| `protected` | `double` | `loadMaxDistance()` |
| `protected` | `int` | `loadMaxAttempts()` |
| `protected` | `double` | `loadExclusionRadius()` |
| `protected` | `boolean` | `loadIsSpawn()` |
| `protected` | `double` | `loadZoneBorderExclusion()` |
| `protected` | `boolean` | `loadShowOnMap()` |

## Inner Types

- `UniquePrefabConfigurationJsonLoader.Constants`
