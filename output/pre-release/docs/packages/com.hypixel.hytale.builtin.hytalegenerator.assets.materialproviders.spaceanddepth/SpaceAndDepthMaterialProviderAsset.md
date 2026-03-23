---
title: "SpaceAndDepthMaterialProviderAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders.spaceanddepth"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders.spaceanddepth.SpaceAndDepthMaterialProviderAsset"
api_surface: false
extends: "MaterialProviderAsset"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "assets"
  - "materialproviders"
  - "spaceanddepth"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders.spaceanddepth`

```java
public class SpaceAndDepthMaterialProviderAsset extends MaterialProviderAsset
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<SpaceAndDepthMaterialProviderAsset>` | `CODEC` |
| `private` | `SpaceAndDepthMaterialProvider.LayerContextType` | `layerContext` |
| `private` | `int` | `maxDistance` |
| `private` | `ConditionAsset` | `conditionAsset` |
| `private` | `LayerAsset[]` | `layerAssets` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `MaterialProvider<Material>` | `build(MaterialProviderAsset.Argument argument)` |
| `@Override public` | `void` | `cleanUp()` |
