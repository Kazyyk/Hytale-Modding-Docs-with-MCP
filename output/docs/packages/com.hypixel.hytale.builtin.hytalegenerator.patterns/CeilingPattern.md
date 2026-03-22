---
title: "CeilingPattern"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.patterns"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.patterns.CeilingPattern"
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
public class CeilingPattern extends Pattern
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Pattern` | `ceilingPattern` |
| `private final` | `Pattern` | `airPattern` |
| `private final` | `SpaceSize` | `readSpaceSize` |
| `` | `SpaceSize` | `ceilingSpace` |
| `` | `Vector3i` | `ceilingPosition` |
| `` | `Pattern.Context` | `ceilingContext` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `CeilingPattern(@Nonnull Pattern ceilingPattern, @Nonnull Pattern airPattern)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `matches(@Nonnull Pattern.Context context)` |
| `public` | `SpaceSize` | `readSpace()` |

## Related Types

- [Pattern](Pattern.md)
