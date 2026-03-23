---
title: "PointInOutAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.curves.manual"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.curves.manual.PointInOutAsset"
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
  - "manual"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.curves.manual`

```java
public class PointInOutAsset implements JsonAssetWithMap
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `AssetBuilderCodec<String,PointInOutAsset>` | `CODEC` |
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
