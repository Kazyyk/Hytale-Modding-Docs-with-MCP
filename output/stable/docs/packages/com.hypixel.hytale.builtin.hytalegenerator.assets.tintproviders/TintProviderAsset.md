---
title: "TintProviderAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.tintproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.tintproviders.TintProviderAsset"
api_surface: false
extends: ~
implements: ["Cleanable", "JsonAssetWithMap<String, DefaultAssetMap<String, TintProviderAsset>>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "assets"
  - "tintproviders"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.tintproviders`

```java
public abstract class TintProviderAsset implements Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, TintProviderAsset>>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public static final` | `AssetCodecMapCodec<String, TintProviderAsset>` | `CODEC` |
| `@Nonnull private static final` | `Map<String, TintProviderAsset>` | `exportedNodes` |
| `@Nonnull public static final` | `Codec<String>` | `CHILD_ASSET_CODEC` |
| `@Nonnull public static final` | `Codec<String[]>` | `CHILD_ASSET_CODEC_ARRAY` |
| `private` | `String` | `id` |
| `private` | `AssetExtraInfo.Data` | `data` |
| `private` | `boolean` | `skip` |
| `private` | `String` | `exportName` |

## Constructors

| Modifier | Signature |
|---|---|
| `protected` | `TintProviderAsset()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `TintProvider` | `build(@Nonnull TintProviderAsset.Argument var1)` |
| `@Nonnull public static` | `TintProviderAsset` | `getFallbackAsset()` |
| `public` | `boolean` | `isSkipped()` |
| `public static` | `TintProviderAsset` | `getExportedAsset(@Nonnull String name)` |
| `public` | `String` | `getId()` |
| `@Override public` | `void` | `cleanUp()` |

## Inner Types

- `TintProviderAsset.Argument`
