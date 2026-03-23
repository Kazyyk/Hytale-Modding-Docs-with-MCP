---
title: "Pattern"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.patterns"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.patterns.Pattern"
api_surface: false
extends: "null"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
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

## Fields

| Modifier | Type | Name |
|---|---|---|
| `` | `final SpaceSize` | `space` |
| `` | `public Vector3i` | `position` |
| `` | `public VoxelSpace<Material>` | `materialSpace` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `boolean` | `matches(@Nonnull Pattern.Context var1)` |
| `` | `public abstract SpaceSize` | `readSpace()` |
| `public static` | `Pattern` | `noPattern()` |
| `` | `public boolean` | `matches(@Nonnull Pattern.Context context)` |
| `` | `public SpaceSize` | `readSpace()` |
| `public static` | `Pattern` | `yesPattern()` |
| `` | `public` | `Context()` |
| `` | `public` | `Context(@Nonnull Vector3i position, @Nullable VoxelSpace<Material> materialSpace)` |
| `` | `public` | `Context(@Nonnull Pattern.Context other)` |
| `` | `public void` | `assign(@Nonnull Pattern.Context other)` |

## Inner Types

- `Pattern.Context`
