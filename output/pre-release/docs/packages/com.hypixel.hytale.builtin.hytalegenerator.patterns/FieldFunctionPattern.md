---
title: "FieldFunctionPattern"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.patterns"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.patterns.FieldFunctionPattern"
api_surface: false
extends: "Pattern"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "patterns"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.patterns`

```java
public class FieldFunctionPattern extends Pattern
```

Pattern that matches when a `Density` field value at the evaluated position falls within any of the configured `RangeDouble` delimiters. Delimiters are added after construction via `addDelimiter`.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `Density` | `field` |
| `@Nonnull private final` | `List<RangeDouble>` | `delimiters` |
| `@Nonnull private final` | `Density.Context` | `rDensityContext` |

## Constructors

| Signature |
|---|
| `FieldFunctionPattern(@Nonnull Density field)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `matches(@Nonnull Pattern.Context context)` |
| `@NonNullDecl @Override public` | `Bounds3i` | `getBounds_voxelGrid()` |
| `public` | `void` | `addDelimiter(double min, double max)` |
