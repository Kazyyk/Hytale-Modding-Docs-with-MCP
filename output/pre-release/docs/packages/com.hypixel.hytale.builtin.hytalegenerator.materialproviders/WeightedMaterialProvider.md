---
title: "WeightedMaterialProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.materialproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.materialproviders.WeightedMaterialProvider"
api_surface: false
extends: "MaterialProvider<V>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "materialproviders"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.materialproviders`

```java
public class WeightedMaterialProvider<V> extends MaterialProvider<V>
```

A `MaterialProvider` that selects from a weighted map of child providers using a deterministic RNG field seeded by voxel position. Before selecting, applies a `noneProbability` chance to return null (no material). The RNG field ensures consistent material selection for the same world position across generation runs.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `WeightedMap<MaterialProvider<V>>` | `weightedMap` |
| `@Nonnull private final` | `RngField` | `rngField` |
| `@Nonnull private final` | `FastRandom` | `random` |
| `private final` | `double` | `noneProbability` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `WeightedMaterialProvider(@Nonnull WeightedMap<MaterialProvider<V>> weightedMap, @Nonnull SeedBox seedBox, double noneProbability)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable @Override public` | `V` | `getVoxelTypeAt(@Nonnull MaterialProvider.Context context)` |
