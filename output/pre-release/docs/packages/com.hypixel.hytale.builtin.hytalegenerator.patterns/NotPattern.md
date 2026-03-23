---
title: "NotPattern"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.patterns"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.patterns.NotPattern"
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
public class NotPattern extends Pattern
```

Logical NOT wrapper that inverts the result of a delegate [Pattern](Pattern.md). Returns `true` when the wrapped pattern returns `false`, and vice versa. Delegates its voxel-grid bounds to the wrapped pattern.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `Pattern` | `pattern` |

## Constructors

| Signature |
|---|
| `NotPattern(@Nonnull Pattern pattern)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `matches(@Nonnull Pattern.Context context)` |
| `@NonNullDecl @Override public` | `Bounds3i` | `getBounds_voxelGrid()` |
