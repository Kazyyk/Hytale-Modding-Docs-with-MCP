---
title: "Scanner"
kind: "abstract class"
package: "com.hypixel.hytale.builtin.hytalegenerator.scanners"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.scanners.Scanner"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "scanners"
  - "abstract class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.scanners`

```java
public abstract class Scanner
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public` | `Vector3i` | `position` |
| `public` | `Pattern` | `pattern` |
| `public` | `VoxelSpace<Material>` | `materialSpace` |
| `public` | `WorkerIndexer.Id` | `workerId` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `List<Vector3i>` | `scan(@Nonnull Scanner.Context var1)` |
| `public abstract` | `SpaceSize` | `scanSpace()` |
| `@Nonnull public` | `SpaceSize` | `readSpaceWith(@Nonnull Pattern pattern)` |
| `@Nonnull public static` | `Scanner` | `noScanner()` |
| `@Override @Nonnull public` | `List<Vector3i>` | `scan(@Nonnull Scanner.Context context)` |
| `@Override @Nonnull public` | `SpaceSize` | `scanSpace()` |

## Inner Types

- `Scanner.Context`
