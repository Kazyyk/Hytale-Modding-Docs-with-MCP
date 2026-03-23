---
title: "WallPattern"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.patterns"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.patterns.WallPattern"
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
public class WallPattern extends Pattern
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Pattern` | `wallPattern` |
| `private final` | `Pattern` | `originPattern` |
| `private final` | `List<WallPattern.WallDirection>` | `directions` |
| `private final` | `boolean` | `matchAll` |
| `private final` | `SpaceSize` | `readSpaceSize` |
| `private final` | `Vector3i` | `rWallPosition` |
| `private final` | `Pattern.Context` | `rWallContext` |
| `` | `SpaceSize` | `originSpace` |
| `` | `SpaceSize` | `wallSpace` |
| `` | `SpaceSize` | `totalSpace` |
| `` | `SpaceSize` | `directionedWallSpace` |
| `` | `boolean` | `matches` |
| `` | `N,
        S,
        E,` | `W` |
| `` | `public static final Codec<WallPattern.WallDirection>` | `CODEC` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `WallPattern(@Nonnull Pattern wallPattern, @Nonnull Pattern originPattern, @Nonnull List<WallPattern.WallDirection> wallDirections, boolean matchAll)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `matches(@Nonnull Pattern.Context context)` |
| `` | `private boolean` | `matches(@Nonnull Pattern.Context context, @Nonnull WallPattern.WallDirection direction)` |
| `public` | `SpaceSize` | `readSpace()` |

## Inner Types

- `WallPattern.WallDirection`

## Related Types

- [Pattern](Pattern.md)
