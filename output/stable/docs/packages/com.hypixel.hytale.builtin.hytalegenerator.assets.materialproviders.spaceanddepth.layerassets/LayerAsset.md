---
title: "LayerAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders.spaceanddepth.layerassets"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders.spaceanddepth.layerassets.LayerAsset"
api_surface: false
extends: ~
implements: ["Cleanable", "JsonAssetWithMap<String, DefaultAssetMap<String, LayerAsset>>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "assets"
  - "materialproviders"
  - "spaceanddepth"
  - "layerassets"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders.spaceanddepth.layerassets`

```java
public abstract class LayerAsset implements Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, LayerAsset>>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private static final` | `LayerAsset[]` | `EMPTY_INPUTS` |
| `@Nonnull public static final` | `AssetCodecMapCodec<String, LayerAsset>` | `CODEC` |
| `@Nonnull public static final` | `Codec<String>` | `CHILD_ASSET_CODEC` |
| `@Nonnull public static final` | `Codec<String[]>` | `CHILD_ASSET_CODEC_ARRAY` |
| `@Nonnull public static final` | `BuilderCodec<LayerAsset>` | `ABSTRACT_CODEC` |
| `private` | `String` | `id` |
| `private` | `AssetExtraInfo.Data` | `data` |

## Constructors

| Modifier | Signature |
|---|---|
| `protected` | `LayerAsset()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `SpaceAndDepthMaterialProvider.Layer<Material>` | `build(@Nonnull MaterialProviderAsset.Argument var1)` |
| `public` | `String` | `getId()` |
| `@Override public` | `void` | `cleanUp()` |
