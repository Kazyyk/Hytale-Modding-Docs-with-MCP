---
title: "MaterialAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.material"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.material.MaterialAsset"
api_surface: false
extends: null
implements: ["JsonAssetWithMap", "Cleanable"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "assets"
  - "material"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.material`

```java
public class MaterialAsset implements JsonAssetWithMap, Cleanable
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `AssetBuilderCodec<String,MaterialAsset>` | `CODEC` |
| `private` | `String` | `id` |
| `private` | `AssetExtraInfo.Data` | `data` |
| `private` | `String` | `solidName` |
| `private` | `String` | `fluidName` |
| `private` | `boolean` | `isSolidBottomUp` |
| `private` | `OrthogonalRotationAsset` | `solidRotationAsset` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `Material` | `build(MaterialCache materialCache)` |
| `public` | `String` | `getId()` |
| `@Override public` | `void` | `cleanUp()` |
