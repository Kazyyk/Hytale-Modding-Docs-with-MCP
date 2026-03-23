---
title: "DirectionalityAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.props.prefabprop.directionality"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.props.prefabprop.directionality.DirectionalityAsset"
api_surface: false
extends: ~
implements: ["Cleanable", "JsonAssetWithMap<String, DefaultAssetMap<String, DirectionalityAsset>>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "assets"
  - "props"
  - "prefabprop"
  - "directionality"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.props.prefabprop.directionality`

```java
public abstract class DirectionalityAsset implements Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, DirectionalityAsset>>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public static final` | `AssetCodecMapCodec<String, DirectionalityAsset>` | `CODEC` |
| `@Nonnull private static final` | `Map<String, DirectionalityAsset>` | `exportedNodes` |
| `@Nonnull public static final` | `Codec<String>` | `CHILD_ASSET_CODEC` |
| `@Nonnull public static final` | `Codec<String[]>` | `CHILD_ASSET_CODEC_ARRAY` |
| `private` | `String` | `id` |
| `private` | `AssetExtraInfo.Data` | `data` |
| `private` | `String` | `exportName` |

## Constructors

| Modifier | Signature |
|---|---|
| `protected` | `DirectionalityAsset()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `Directionality` | `build(@Nonnull DirectionalityAsset.Argument var1)` |
| `@Override public` | `void` | `cleanUp()` |
| `public static` | `DirectionalityAsset` | `getExportedAsset(@Nonnull String name)` |
| `public` | `String` | `getId()` |
| `@Nonnull public static` | `DirectionalityAsset.Argument` | `argumentFrom(@Nonnull PropAsset.Argument argument)` |

## Inner Types

- `DirectionalityAsset.Argument`
