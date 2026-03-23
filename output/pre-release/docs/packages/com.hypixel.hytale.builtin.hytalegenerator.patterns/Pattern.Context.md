---
title: "Pattern.Context"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.patterns"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.patterns.Pattern$Context"
api_surface: false
extends: null
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
public static class Context
```

Carries the position and material voxel space for pattern evaluation. Instances are reused and reassigned between evaluations to avoid allocation.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public` | `Vector3i` | `position` |
| `@Nonnull public` | `VoxelSpace<Material>` | `materialSpace` |

## Constructors

| Signature |
|---|
| `Context()` |
| `Context(@Nonnull Vector3i position, @Nullable VoxelSpace<Material> materialSpace)` |
| `Context(@Nonnull Pattern.Context other)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `assign(@Nonnull Pattern.Context other)` |
| `public` | `void` | `assign(@Nonnull Prop.Context other)` |
