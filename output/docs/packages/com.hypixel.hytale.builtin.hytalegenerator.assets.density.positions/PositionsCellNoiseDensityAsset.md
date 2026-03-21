---
title: "PositionsCellNoiseDensityAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.density.positions"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.density.positions.PositionsCellNoiseDensityAsset"
api_surface: false
extends: "DensityAsset"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "assets"
  - "density"
  - "positions"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.density.positions`

```java
public class PositionsCellNoiseDensityAsset extends DensityAsset
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<PositionsCellNoiseDensityAsset>` | `CODEC` |
| `private` | `PositionProviderAsset` | `positionProviderAsset` |
| `private` | `ReturnTypeAsset` | `returnTypeAsset` |
| `private` | `DistanceFunctionAsset` | `distanceFunctionAsset` |
| `private` | `double` | `maxDistance` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `Density` | `build(DensityAsset.Argument argument)` |
| `@Override public` | `void` | `cleanUp()` |
