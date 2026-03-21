---
title: "FieldFunctionMaterialProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.materialproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.materialproviders.FieldFunctionMaterialProvider"
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
public class FieldFunctionMaterialProvider<V> extends MaterialProvider<V>
```

Provider supplying FieldFunctionMaterial values based on context.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `Density` | `density` |
| `@Nonnull private final` | `FieldFunctionMaterialProvider.FieldDelimiter<V>[]` | `fieldDelimiters` |
| `@Nonnull private final` | `Density.Context` | `rDensityContext` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `FieldFunctionMaterialProvider(@Nonnull Density density, @Nonnull List<FieldFunctionMaterialProvider.FieldDelimiter<V>> delimiters)` |
| `@Nullable @Override public` | `V` | `getVoxelTypeAt(@Nonnull MaterialProvider.Context context)` |
