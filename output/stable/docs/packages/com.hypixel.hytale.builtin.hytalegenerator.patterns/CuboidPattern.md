---
title: "CuboidPattern"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.patterns"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.patterns.CuboidPattern"
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
public class CuboidPattern extends Pattern
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Pattern` | `subPattern` |
| `private final` | `Vector3i` | `min` |
| `private final` | `Vector3i` | `max` |
| `private final` | `SpaceSize` | `readSpaceSize` |
| `private final` | `Vector3i` | `rScanMin` |
| `private final` | `Vector3i` | `rScanMax` |
| `private final` | `Vector3i` | `rChildPosition` |
| `private final` | `Pattern.Context` | `rChildContext` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `CuboidPattern(@Nonnull Pattern subPattern, @Nonnull Vector3i min, @Nonnull Vector3i max)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `matches(@Nonnull Pattern.Context context)` |
| `public` | `SpaceSize` | `readSpace()` |

## Related Types

- [Pattern](Pattern.md)
