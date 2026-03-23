---
title: "PositionProviderAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.positionproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.positionproviders.PositionProviderAsset"
api_surface: false
extends: null
implements:
  - "Cleanable"
  - "JsonAssetWithMap"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "hytalegenerator"
  - "assets"
  - "positionproviders"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.positionproviders`

```java
public abstract class PositionProviderAsset implements Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, PositionProviderAsset>>
```

Abstract base class in the `positionproviders` package.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `@Nonnull public static final` | `Codec<String>` | `CHILD_ASSET_CODEC` | `new ContainedAssetCodec<>(PositionProviderAsset.class, CODEC)` |
| `@Nonnull public static final` | `Codec<String[]>` | `CHILD_ASSET_CODEC_ARRAY` | `new ArrayCodec<>(CHILD_ASSET_CODEC, String[]::new)` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `String` | `id` |
| `private` | `AssetExtraInfo.Data` | `data` |
| `private` | `boolean` | `skip` |
| `private` | `String` | `exportName` |
| `public` | `SeedBox` | `parentSeed` |
| `public` | `ReferenceBundle` | `referenceBundle` |
| `public` | `WorkerIndexer.Id` | `workerId` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public abstract PositionProvider` | `build(@Nonnull PositionProviderAsset.Argument var1)` |
| `` | `public boolean` | `skip()` |
| `` | `public static PositionProviderAsset` | `getExportedAsset(@Nonnull String name)` |
| `` | `public String` | `getId()` |
| `@Override public` | `void` | `cleanUp()` |
| `` | `public` | `Argument(@Nonnull SeedBox parentSeed, @Nonnull ReferenceBundle referenceBundle, @Nonnull WorkerIndexer.Id workerId)` |
| `` | `public` | `Argument(@Nonnull PositionProviderAsset.Argument argument)` |
