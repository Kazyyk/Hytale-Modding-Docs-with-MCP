---
title: "MaterialSetPattern"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.patterns"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.patterns.MaterialSetPattern"
api_surface: false
extends: "Pattern"
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
public class MaterialSetPattern extends Pattern
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `SpaceSize` | `READ_SPACE_SIZE` |
| `private final` | `MaterialSet` | `materialSet` |
| `` | `Material` | `material` |
| `` | `int` | `hash` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `MaterialSetPattern(@Nonnull MaterialSet materialSet)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `matches(@Nonnull Pattern.Context context)` |
| `public` | `SpaceSize` | `readSpace()` |

## Related Types

- [Pattern](Pattern.md)
