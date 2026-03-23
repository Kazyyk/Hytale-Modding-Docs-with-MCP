---
title: "CurveAsset"
kind: "abstract class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.curves"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.curves.CurveAsset"
api_surface: false
extends: ~
implements: ["JsonAssetWithMap<String, DefaultAssetMap<String, CurveAsset>>", "Cleanable"]
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "assets"
  - "curves"
  - "abstract class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.curves`

```java
public abstract class CurveAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, CurveAsset>>, Cleanable
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `CurveAsset[]` | `EMPTY_INPUTS` |
| `private static final Map<String,` | `CurveAsset>` | `exportedNodes` |
| `private` | `String` | `id` |
| `private` | `AssetExtraInfo.Data` | `data` |
| `private` | `String` | `exportName` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `Double2DoubleFunction` | `build()` |
| `public static` | `CurveAsset` | `getExportedAsset(@Nonnull String name)` |
| `public` | `String` | `getId()` |
