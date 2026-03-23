---
title: "Pattern"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.patterns"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.patterns.Pattern"
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
public abstract class Pattern
```

Abstract base class for world-generation pattern matching. A pattern tests whether a voxel position within a material space satisfies some condition, and declares its voxel-grid bounding box for spatial queries.

## Inner Types

| Type | Kind |
|---|---|
| [Pattern.Context](Pattern.Context.md) | class |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `boolean` | `matches(@Nonnull Pattern.Context var1)` |
| `@Nonnull public abstract` | `Bounds3i` | `getBounds_voxelGrid()` |
