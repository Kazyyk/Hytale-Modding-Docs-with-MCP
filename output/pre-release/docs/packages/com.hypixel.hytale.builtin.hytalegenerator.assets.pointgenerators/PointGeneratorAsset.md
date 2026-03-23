---
title: "PointGeneratorAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.pointgenerators"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.pointgenerators.PointGeneratorAsset"
api_surface: false
extends: null
implements: ["JsonAssetWithMap"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "assets"
  - "pointgenerators"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.pointgenerators`

```java
public abstract class PointGeneratorAsset implements JsonAssetWithMap
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `PointGeneratorAsset[]` | `EMPTY_INPUTS` |
| `public static final` | `AssetCodecMapCodec<String,PointGeneratorAsset>` | `CODEC` |
| `private static final` | `Map<String,PointGeneratorAsset>` | `exportedNodes` |
| `public static final` | `Codec<String>` | `CHILD_ASSET_CODEC` |
| `public static final` | `Codec<String[]>` | `CHILD_ASSET_CODEC_ARRAY` |
| `public static final` | `BuilderCodec<PointGeneratorAsset>` | `ABSTRACT_CODEC` |
| `private` | `String` | `id` |
| `private` | `AssetExtraInfo.Data` | `data` |
| `private` | `PointGeneratorAsset[]` | `inputs` |
| `private` | `boolean` | `skip` |
| `private` | `String` | `exportName` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `PointProvider` | `build(SeedBox var1)` |
| `@Nonnull public` | `PointGeneratorAsset[]` | `inputs()` |
| `public` | `boolean` | `skip()` |
| `public static` | `PointGeneratorAsset` | `getExportedAsset(String name)` |
| `public` | `String` | `getId()` |
