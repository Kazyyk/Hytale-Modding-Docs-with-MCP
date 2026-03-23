---
title: "WeightedThicknessLayerAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders.spaceanddepth.layerassets"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders.spaceanddepth.layerassets.WeightedThicknessLayerAsset"
api_surface: false
extends: "LayerAsset"
implements: []
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
public class WeightedThicknessLayerAsset extends LayerAsset
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public static final` | `BuilderCodec<WeightedThicknessLayerAsset>` | `CODEC` |
| `private` | `MaterialProviderAsset` | `materialProviderAsset` |
| `private` | `String` | `seed` |
| `private` | `WeightedThicknessLayerAsset.WeightedThicknessAsset[]` | `possibleThicknessAssets` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `SpaceAndDepthMaterialProvider.Layer<Material>` | `build(@Nonnull MaterialProviderAsset.Argument argument)` |
| `@Override public` | `void` | `cleanUp()` |

## Inner Types

- `WeightedThicknessLayerAsset.WeightedThicknessAsset`
