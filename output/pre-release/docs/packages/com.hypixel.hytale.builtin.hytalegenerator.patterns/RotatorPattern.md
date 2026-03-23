---
title: "RotatorPattern"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.patterns"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.patterns.RotatorPattern"
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
public class RotatorPattern extends Pattern
```

Pattern decorator that applies a rotation transform before delegating to a child [Pattern](Pattern.md). Uses a `RotationVoxelSpace` to rotate the material-space read coordinates, allowing the child pattern to operate in rotated local space. The voxel-grid bounds are the rotation-expanded bounds of the child pattern.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `Pattern` | `pattern` |
| `@Nonnull private final` | `Bounds3i` | `bounds` |
| `@Nonnull private final` | `RotationVoxelSpace` | `readRotationVoxelSpace` |
| `@Nonnull private final` | `Pattern.Context` | `rChildContext` |

## Constructors

| Signature |
|---|
| `RotatorPattern(@Nonnull Pattern pattern, @Nonnull RotationTuple rotation, @Nonnull MaterialCache materialCache)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `matches(@NonNullDecl Pattern.Context context)` |
| `@NonNullDecl @Override public` | `Bounds3i` | `getBounds_voxelGrid()` |
