---
title: "DecimalBounds3dAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.bounds"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.bounds.DecimalBounds3dAsset"
api_surface: false
extends: null
implements: ["JsonAssetWithMap"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "assets"
  - "bounds"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.bounds`

```java
public class DecimalBounds3dAsset implements JsonAssetWithMap
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `AssetBuilderCodec<String,DecimalBounds3dAsset>` | `CODEC` |
| `private` | `String` | `id` |
| `private` | `AssetExtraInfo.Data` | `data` |
| `private` | `Vector3d` | `pointA` |
| `private` | `Vector3d` | `pointB` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `Bounds3d` | `build()` |
| `public` | `String` | `getId()` |
