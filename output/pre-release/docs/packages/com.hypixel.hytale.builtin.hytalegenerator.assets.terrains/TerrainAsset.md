---
title: "TerrainAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.terrains"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.terrains.TerrainAsset"
api_surface: false
extends: null
implements: ["Cleanable", "JsonAssetWithMap"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "assets"
  - "terrains"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.terrains`

```java
public abstract class TerrainAsset implements Cleanable, JsonAssetWithMap
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `TerrainAsset[]` | `EMPTY_INPUTS` |
| `public static final` | `AssetCodecMapCodec<String,TerrainAsset>` | `CODEC` |
| `public static final` | `Codec<String>` | `CHILD_ASSET_CODEC` |
| `public static final` | `Codec<String[]>` | `CHILD_ASSET_CODEC_ARRAY` |
| `public static final` | `BuilderCodec<TerrainAsset>` | `ABSTRACT_CODEC` |
| `private` | `String` | `id` |
| `private` | `AssetExtraInfo.Data` | `data` |
| `private` | `TerrainAsset[]` | `inputs` |
| `private` | `boolean` | `skip` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `Density` | `buildDensity(SeedBox var1, ReferenceBundle var2, WorkerIndexer.Id var3)` |
| `public` | `String` | `getId()` |
| `@Override public` | `void` | `cleanUp()` |
