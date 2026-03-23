---
title: "SurfacePattern"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.patterns"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.patterns.SurfacePattern"
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
public class SurfacePattern extends Pattern
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Pattern` | `wallPattern` |
| `private final` | `Pattern` | `originPattern` |
| `private final` | `SpaceSize` | `readSpaceSize` |
| `private final` | `List<Vector3i>` | `surfacePositions` |
| `private final` | `List<Vector3i>` | `originPositions` |
| `private final` | `Vector3i` | `rChildPosition` |
| `private final` | `Pattern.Context` | `rChildContext` |
| `` | `int` | `surfaceY` |
| `` | `Vector3i` | `position` |
| `` | `int` | `originY` |
| `` | `SpaceSize` | `floorSpace` |
| `` | `SpaceSize` | `originSpace` |
| `` | `int` | `y` |
| `` | `U,
        D,
        E,
        W,
        S,` | `N` |
| `` | `public static Codec<SurfacePattern.Facing>` | `CODEC` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `SurfacePattern(@Nonnull Pattern surfacePattern,
        @Nonnull Pattern originPattern,
        double surfaceRadius,
        double originRadius,
        @Nonnull SurfacePattern.Facing facing,
        int surfaceGap,
        int originGap)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `matches(@Nonnull Pattern.Context context)` |
| `` | `private void` | `applyFacing(@Nonnull Vector3i pos, @Nonnull SurfacePattern.Facing facing)` |
| `` | `private void` | `toD(@Nonnull Vector3i pos)` |
| `` | `private void` | `toN(@Nonnull Vector3i pos)` |
| `` | `private void` | `toS(@Nonnull Vector3i pos)` |
| `` | `private void` | `toW(@Nonnull Vector3i pos)` |
| `` | `private void` | `toE(@Nonnull Vector3i pos)` |
| `public` | `SpaceSize` | `readSpace()` |

## Inner Types

- `SurfacePattern.Facing`

## Related Types

- [Pattern](Pattern.md)
