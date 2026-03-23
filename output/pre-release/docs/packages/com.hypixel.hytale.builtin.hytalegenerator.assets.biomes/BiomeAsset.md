---
title: "BiomeAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.biomes"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.biomes.BiomeAsset"
api_surface: false
extends: null
implements: ["JsonAssetWithMap", "Cleanable"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "assets"
  - "biomes"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.biomes`

```java
public class BiomeAsset implements JsonAssetWithMap, Cleanable
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `ValidatorCache<String>` | `VALIDATOR_CACHE` |
| `private static` | `AssetStore<String,BiomeAsset,DefaultAssetMap<String,BiomeAsset>>` | `STORE` |
| `public static final` | `AssetBuilderCodec<String,BiomeAsset>` | `CODEC` |
| `private` | `String` | `id` |
| `private` | `AssetExtraInfo.Data` | `data` |
| `private` | `TerrainAsset` | `terrainAsset` |
| `private` | `MaterialProviderAsset` | `materialProviderAsset` |
| `private` | `PropRuntimeAsset[]` | `propRuntimeAssets` |
| `private` | `EnvironmentProviderAsset` | `environmentProviderAsset` |
| `private` | `TintProviderAsset` | `tintProviderAsset` |
| `private` | `String` | `biomeName` |
| `private` | `DensityAsset[]` | `floatingFunctionNodeAssets` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `AssetStore<String,BiomeAsset,DefaultAssetMap<String,BiomeAsset>>` | `getAssetStore()` |
| `@Override public` | `void` | `cleanUp()` |
| `@Nonnull public` | `Biome` | `build(MaterialCache materialCache, SeedBox parentSeed, ReferenceBundle referenceBundle, WorkerIndexer.Id workerId)` |
| `public` | `String` | `getBiomeName()` |
| `public` | `String` | `getId()` |
