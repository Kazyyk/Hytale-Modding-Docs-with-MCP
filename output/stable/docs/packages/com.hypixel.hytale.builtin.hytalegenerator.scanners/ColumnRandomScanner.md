---
title: "ColumnRandomScanner"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.scanners"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.scanners.ColumnRandomScanner"
api_surface: false
extends: "Scanner"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "scanners"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.scanners`

```java
public class ColumnRandomScanner extends Scanner
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `int` | `minY` |
| `private final` | `int` | `maxY` |
| `private final` | `boolean` | `isRelativeToPosition` |
| `private final` | `double` | `baseHeight` |
| `private final` | `int` | `resultsCap` |
| `private final` | `SeedGenerator` | `seedGenerator` |
| `private final` | `ColumnRandomScanner.Strategy` | `strategy` |
| `private final` | `SpaceSize` | `scanSpaceSize` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override @Nonnull public` | `List<Vector3i>` | `scan(@Nonnull Scanner.Context context)` |
| `@Nonnull private` | `List<Vector3i>` | `scanPickValid(@Nonnull Scanner.Context context)` |
| `@Nonnull private` | `List<Vector3i>` | `scanDartThrow(@Nonnull Scanner.Context context)` |
| `@Override @Nonnull public` | `SpaceSize` | `scanSpace()` |

## Inner Types

- `ColumnRandomScanner.Strategy`
