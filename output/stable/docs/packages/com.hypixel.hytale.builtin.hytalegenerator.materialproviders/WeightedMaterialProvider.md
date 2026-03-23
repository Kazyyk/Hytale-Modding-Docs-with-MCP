---
title: "WeightedMaterialProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.materialproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.materialproviders.WeightedMaterialProvider"
api_surface: false
extends: "MaterialProvider<V>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "materialproviders"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.materialproviders`

```java
public class WeightedMaterialProvider<V> extends MaterialProvider<V>
```

Provider supplying WeightedMaterial values based on context.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `WeightedMap<MaterialProvider<V>>` | `weightedMap` |
| `@Nonnull private final` | `SeedGenerator` | `seedGenerator` |
| `private final` | `double` | `noneProbability` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `WeightedMaterialProvider(@Nonnull WeightedMap<MaterialProvider<V>> weightedMap, @Nonnull SeedBox seedBox, double noneProbability)` |
| `@Nullable @Override public` | `V` | `getVoxelTypeAt(@Nonnull MaterialProvider.Context context)` |
