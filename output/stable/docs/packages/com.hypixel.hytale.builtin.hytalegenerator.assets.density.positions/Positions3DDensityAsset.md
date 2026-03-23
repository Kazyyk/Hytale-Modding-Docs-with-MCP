---
title: "Positions3DDensityAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.density.positions"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.density.positions.Positions3DDensityAsset"
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
public class Positions3DDensityAsset extends DensityAsset
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<Positions3DDensityAsset>` | `CODEC` |
| `private` | `PositionProviderAsset` | `positionProviderAsset` |
| `private` | `CurveAsset` | `curveAsset` |
| `private` | `double` | `maxDistance` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `Density` | `build(DensityAsset.Argument argument)` |
| `@Override public` | `void` | `cleanUp()` |
