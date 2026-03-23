---
title: "BiomeRangeAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.worldstructures.basic"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.worldstructures.basic.BiomeRangeAsset"
api_surface: false
extends: ~
implements:
  - "JsonAssetWithMap<String, DefaultAssetMap<String, BiomeRangeAsset>>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "worldgen"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.worldstructures.basic`

```java
public class BiomeRangeAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, BiomeRangeAsset>>
```

Implementation of `JsonAssetWithMap<String, DefaultAssetMap<String, BiomeRangeAsset>>`.

## Fields

| Field | Type | Description |
|---|---|---|
| `id` | `String` | String field. |
| `data` | `AssetExtraInfo.Data` | AssetExtraInfo.Data field. |
| `min` | `double` | double field. |
| `max` | `double` | double field. |
| `biomeAssetId` | `String` | String field. |

## Constructors

| Constructor | Description |
|---|---|
| `BiomeRangeAsset()` | Creates a new BiomeRangeAsset instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getRange()` | `DoubleRange` | public method. |
| `getBiomeAsset()` | `BiomeAsset` | public method. |
| `getBiomeAssetId()` | `String` | public method. |
| `getId()` | `String` | public method. |
