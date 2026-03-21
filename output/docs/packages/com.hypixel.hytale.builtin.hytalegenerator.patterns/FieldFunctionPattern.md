---
title: "FieldFunctionPattern"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.patterns"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.patterns.FieldFunctionPattern"
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
public class FieldFunctionPattern extends Pattern
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Density` | `field` |
| `private final` | `SpaceSize` | `readSpaceSize` |
| `private final` | `List<FieldFunctionPattern.Delimiter>` | `delimiters` |
| `private final` | `Density.Context` | `rDensityContext` |
| `` | `double` | `density` |
| `` | `FieldFunctionPattern.Delimiter` | `d` |
| `` | `double` | `min` |
| `` | `double` | `max` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `FieldFunctionPattern(@Nonnull Density field)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `matches(@Nonnull Pattern.Context context)` |
| `public` | `SpaceSize` | `readSpace()` |
| `` | `public void` | `addDelimiter(double min, double max)` |
| `` | `boolean` | `isInside(double v)` |

## Inner Types

- `FieldFunctionPattern.Delimiter`

## Related Types

- [Pattern](Pattern.md)
