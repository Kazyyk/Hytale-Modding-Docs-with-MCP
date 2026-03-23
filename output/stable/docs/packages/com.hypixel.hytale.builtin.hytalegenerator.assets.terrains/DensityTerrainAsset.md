---
title: "DensityTerrainAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.terrains"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.terrains.DensityTerrainAsset"
api_surface: false
extends: "TerrainAsset"
implements: []
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
public class DensityTerrainAsset extends TerrainAsset
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<DensityTerrainAsset>` | `CODEC` |
| `private` | `DensityAsset` | `densityAsset` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `Density` | `buildDensity(SeedBox parentSeed, ReferenceBundle referenceBundle, WorkerIndexer.Id workerId)` |
| `@Override public` | `void` | `cleanUp()` |
