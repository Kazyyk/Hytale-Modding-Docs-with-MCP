---
title: "AreaScanner"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.scanners"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.scanners.AreaScanner"
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
public class AreaScanner extends Scanner
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `AreaScanner.ScanShape` | `scanShape` |
| `private final` | `int` | `range` |
| `private final` | `int` | `resultCap` |
| `private final` | `Scanner` | `childScanner` |
| `private final` | `List<Vector2i>` | `scanOrder` |
| `private final` | `SpaceSize` | `scanSpaceSize` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override @Nonnull public` | `List<Vector3i>` | `scan(@Nonnull Scanner.Context context)` |
| `@Override @Nonnull public` | `SpaceSize` | `scanSpace()` |

## Inner Types

- `AreaScanner.ScanShape`
- `AreaScanner.Verticality`
