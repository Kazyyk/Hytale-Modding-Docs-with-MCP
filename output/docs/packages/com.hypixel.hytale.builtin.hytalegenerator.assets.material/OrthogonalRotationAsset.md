---
title: "OrthogonalRotationAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.material"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.material.OrthogonalRotationAsset"
api_surface: false
extends: null
implements: ["JsonAssetWithMap"]
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
public class OrthogonalRotationAsset implements JsonAssetWithMap
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `AssetBuilderCodec<String,OrthogonalRotationAsset>` | `CODEC` |
| `private` | `String` | `id` |
| `private` | `AssetExtraInfo.Data` | `data` |
| `private` | `Rotation` | `yaw` |
| `private` | `Rotation` | `pitch` |
| `private` | `Rotation` | `roll` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `RotationTuple` | `build()` |
| `public` | `boolean` | `isNone()` |
| `public` | `String` | `getId()` |
