---
title: "SurfacePatternAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.patterns"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.patterns.SurfacePatternAsset"
api_surface: false
extends: "PatternAsset"
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "builtin"
  - "patterns"
---
**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.patterns`

```java
public class SurfacePatternAsset extends PatternAsset
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `double` | `surfaceRadius` |
| `private` | `double` | `originRadius` |
| `private` | `int` | `surfaceGap` |
| `private` | `int` | `originGap` |
| `private` | `SurfacePattern.Facing[]` | `facings` |
| `private` | `boolean` | `requireAllFacings` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Pattern` | `build(@Nonnull PatternAsset.Argument argument)` |
| `public` | `void` | `cleanUp()` |
