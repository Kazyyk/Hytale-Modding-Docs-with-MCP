---
title: "OffsetPattern"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.patterns"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.patterns.OffsetPattern"
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
public class OffsetPattern extends Pattern
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Pattern` | `pattern` |
| `private final` | `Vector3i` | `offset` |
| `private final` | `SpaceSize` | `readSpaceSize` |
| `private final` | `Vector3i` | `rChildPosition` |
| `private final` | `Pattern.Context` | `rChildContext` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `OffsetPattern(@Nonnull Pattern pattern, @Nonnull Vector3i offset)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `matches(@Nonnull Pattern.Context context)` |
| `public` | `SpaceSize` | `readSpace()` |

## Related Types

- [Pattern](Pattern.md)
