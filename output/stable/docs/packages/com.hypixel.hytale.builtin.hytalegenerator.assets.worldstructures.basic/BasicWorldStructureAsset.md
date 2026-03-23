---
title: "BasicWorldStructureAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.worldstructures.basic"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.worldstructures.basic.BasicWorldStructureAsset"
api_surface: false
extends: "WorldStructureAsset"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "worldgen"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.worldstructures.basic`

```java
public class BasicWorldStructureAsset extends WorldStructureAsset
```

Concrete implementation extending `WorldStructureAsset`.

## Fields

| Field | Type | Description |
|---|---|---|
| `biomeRangeAssets` | `BiomeRangeAsset[]` | BiomeRangeAsset[] field. |
| `biomeTransitionDistance` | `int` | int field. |
| `maxBiomeEdgeDistance` | `int` | int field. |
| `defaultBiomeId` | `String` | String field. |
| `frameworkAssets` | `FrameworkAsset[]` | FrameworkAsset[] field. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `build(@Nonnull WorldStructureAsset.Argument argument)` | `WorldStructure` | public method. |
| `getSpawnPositionsAsset()` | `PositionProviderAsset` | public method. |
| `cleanUp()` | `void` | public method. |
