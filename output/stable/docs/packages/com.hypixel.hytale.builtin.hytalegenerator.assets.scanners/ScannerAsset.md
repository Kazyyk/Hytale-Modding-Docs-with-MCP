---
title: "ScannerAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.scanners"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.scanners.ScannerAsset"
api_surface: false
extends: ~
implements: ["Cleanable", "JsonAssetWithMap<String, DefaultAssetMap<String, ScannerAsset>>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "assets"
  - "scanners"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.scanners`

```java
public abstract class ScannerAsset implements Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, ScannerAsset>>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public static final` | `AssetCodecMapCodec<String, ScannerAsset>` | `CODEC` |
| `@Nonnull private static final` | `Map<String, ScannerAsset>` | `exportedNodes` |
| `@Nonnull public static final` | `Codec<String>` | `CHILD_ASSET_CODEC` |
| `@Nonnull public static final` | `Codec<String[]>` | `CHILD_ASSET_CODEC_ARRAY` |
| `private` | `String` | `id` |
| `private` | `AssetExtraInfo.Data` | `data` |
| `private` | `boolean` | `skip` |
| `private` | `String` | `exportName` |

## Constructors

| Modifier | Signature |
|---|---|
| `protected` | `ScannerAsset()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `Scanner` | `build(@Nonnull ScannerAsset.Argument var1)` |
| `public` | `boolean` | `skip()` |
| `public static` | `ScannerAsset` | `getExportedAsset(@Nonnull String name)` |
| `public` | `String` | `getId()` |
| `@Nonnull public static` | `ScannerAsset.Argument` | `argumentFrom(@Nonnull PropAsset.Argument argument)` |
| `@Override public` | `void` | `cleanUp()` |

## Inner Types

- `ScannerAsset.Argument`
