---
title: "PointYOutAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.curves.legacy"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.curves.legacy.PointYOutAsset"
api_surface: false
extends: null
implements: ["JsonAssetWithMap"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "assets"
  - "curves"
  - "legacy"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.curves.legacy`

```java
public class PointYOutAsset implements JsonAssetWithMap
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `AssetBuilderCodec<String,PointYOutAsset>` | `CODEC` |
| `private` | `String` | `id` |
| `private` | `AssetExtraInfo.Data` | `data` |
| `private` | `double` | `y` |
| `private` | `double` | `out` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `Vector2d` | `build()` |
| `public` | `double` | `getY()` |
| `public` | `double` | `getOut()` |
| `public` | `String` | `getId()` |
