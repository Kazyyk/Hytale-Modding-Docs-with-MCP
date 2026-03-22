---
title: "SpaceAndDepthMaterialProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.materialproviders.spaceanddepth"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.materialproviders.spaceanddepth.SpaceAndDepthMaterialProvider"
api_surface: false
extends: "MaterialProvider<V>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "materialproviders"
  - "spaceanddepth"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.materialproviders.spaceanddepth`

```java
public class SpaceAndDepthMaterialProvider<V> extends MaterialProvider<V>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `SpaceAndDepthMaterialProvider.LayerContextType` | `layerContextType` |
| `@Nonnull private final` | `SpaceAndDepthMaterialProvider.Layer<V>[]` | `layers` |
| `@Nonnull private final` | `SpaceAndDepthMaterialProvider.Condition` | `condition` |
| `private final` | `int` | `maxDistance` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `SpaceAndDepthMaterialProvider(@Nonnull SpaceAndDepthMaterialProvider.LayerContextType layerContextType,
        @Nonnull List<SpaceAndDepthMaterialProvider.Layer<V>> layers,
        @Nonnull SpaceAndDepthMaterialProvider.Condition condition,
        int maxDistance)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable @Override public` | `V` | `getVoxelTypeAt(@Nonnull MaterialProvider.Context context)` |

## Inner Types

- `SpaceAndDepthMaterialProvider.Condition`
- `SpaceAndDepthMaterialProvider.Layer`
- `SpaceAndDepthMaterialProvider.LayerContextType`
