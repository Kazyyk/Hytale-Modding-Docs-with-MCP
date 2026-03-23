---
title: "ConditionAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders.spaceanddepth.conditionassets"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders.spaceanddepth.conditionassets.ConditionAsset"
api_surface: false
extends: ~
implements:
  - "JsonAssetWithMap<String, DefaultAssetMap<String, ConditionAsset>>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "worldgen"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders.spaceanddepth.conditionassets`

```java
public abstract class ConditionAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, ConditionAsset>>
```

Implementation of `JsonAssetWithMap<String, DefaultAssetMap<String, ConditionAsset>>`.

## Fields

| Field | Type | Description |
|---|---|---|
| `EMPTY_INPUTS` | `ConditionAsset[]` | Static final ConditionAsset[] field. |
| `id` | `String` | String field. |
| `data` | `AssetExtraInfo.Data` | AssetExtraInfo.Data field. |

## Constructors

| Constructor | Description |
|---|---|
| `ConditionAsset()` | Creates a new ConditionAsset instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `build()` | `SpaceAndDepthMaterialProvider.Condition` | public method. |
| `getId()` | `String` | public method. |
