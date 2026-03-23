---
title: "RangeIntAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.delimiters"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.delimiters.RangeIntAsset"
api_surface: false
extends: null
implements: ["JsonAssetWithMap"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "assets"
  - "delimiters"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.delimiters`

```java
public class RangeIntAsset implements JsonAssetWithMap
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `AssetBuilderCodec<String,RangeIntAsset>` | `CODEC` |
| `private` | `String` | `id` |
| `private` | `AssetExtraInfo.Data` | `data` |
| `private` | `int` | `minInclusive` |
| `private` | `int` | `maxExclusive` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `RangeInt` | `build()` |
| `@Nonnull public` | `String` | `getId()` |
