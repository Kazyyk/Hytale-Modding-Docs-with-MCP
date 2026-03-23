---
title: "NoiseAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.noisegenerators"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.noisegenerators.NoiseAsset"
api_surface: false
extends: null
implements: ["JsonAssetWithMap"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "assets"
  - "noisegenerators"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.noisegenerators`

```java
public abstract class NoiseAsset implements JsonAssetWithMap
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `AssetCodecMapCodec<String,NoiseAsset>` | `CODEC` |
| `public static final` | `Codec<String>` | `CHILD_ASSET_CODEC` |
| `public static final` | `Codec<String[]>` | `CHILD_ASSET_CODEC_ARRAY` |
| `public static final` | `BuilderCodec<NoiseAsset>` | `ABSTRACT_CODEC` |
| `private` | `String` | `id` |
| `private` | `AssetExtraInfo.Data` | `data` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `NoiseField` | `build(SeedBox var1)` |
| `public` | `String` | `getId()` |
