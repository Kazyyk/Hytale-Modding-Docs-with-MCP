---
title: "DistanceFunctionAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.density.positions.distancefunctions"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.density.positions.distancefunctions.DistanceFunctionAsset"
api_surface: false
extends: null
implements: ["JsonAssetWithMap"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "assets"
  - "density"
  - "positions"
  - "distancefunctions"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.density.positions.distancefunctions`

```java
public abstract class DistanceFunctionAsset implements JsonAssetWithMap
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `AssetCodecMapCodec<String,DistanceFunctionAsset>` | `CODEC` |
| `public static final` | `Codec<String>` | `CHILD_ASSET_CODEC` |
| `public static final` | `Codec<String[]>` | `CHILD_ASSET_CODEC_ARRAY` |
| `public static final` | `BuilderCodec<DistanceFunctionAsset>` | `ABSTRACT_CODEC` |
| `private` | `String` | `id` |
| `private` | `AssetExtraInfo.Data` | `data` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `DistanceFunction` | `build(SeedBox var1, double var2)` |
| `public` | `String` | `getId()` |
