---
title: "EnvironmentProviderAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.environmentproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.environmentproviders.EnvironmentProviderAsset"
api_surface: false
extends: null
implements: ["Cleanable", "JsonAssetWithMap<String, DefaultAssetMap<String, EnvironmentProviderAsset>>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "assets"
  - "environmentproviders"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.environmentproviders`

```java
public abstract class EnvironmentProviderAsset implements Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, EnvironmentProviderAsset>>
```

Abstract base class providing shared logic for EnvironmentProviderAsset implementations.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `@Nonnull private static final` | `Map<String, EnvironmentProviderAsset>` | `exportedNodes` | `new ConcurrentHashMap<>()` |
| `@Nonnull public static final` | `Codec<String>` | `CHILD_ASSET_CODEC` | `new ContainedAssetCodec<>(EnvironmentProviderAsset.class, CODEC)` |
| `@Nonnull public static final` | `Codec<String[]>` | `CHILD_ASSET_CODEC_ARRAY` | `new ArrayCodec<>(CHILD_ASSET_CODEC, String[]::new)` |

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `private` | `String` | `id` |  |
| `private` | `AssetExtraInfo.Data` | `data` |  |
| `private` | `boolean` | `skip` | `false` |
| `private` | `String` | `exportName` | `""` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `protected` | | `EnvironmentProviderAsset()` |
| `public abstract` | `EnvironmentProvider` | `build(@Nonnull EnvironmentProviderAsset.Argument var1)` |
| `@Nonnull public static` | `EnvironmentProviderAsset` | `getFallbackAsset()` |
| `public` | `boolean` | `isSkipped()` |
| `public static` | `EnvironmentProviderAsset` | `getExportedAsset(@Nonnull String name)` |
| `public` | `String` | `getId()` |
| `@Override public` | `void` | `cleanUp()` |
