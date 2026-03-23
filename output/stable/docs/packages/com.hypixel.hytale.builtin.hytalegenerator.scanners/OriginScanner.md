---
title: "OriginScanner"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.scanners"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.scanners.OriginScanner"
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
public class OriginScanner extends Scanner
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `OriginScanner` | `instance` |
| `private static final` | `SpaceSize` | `SCAN_SPACE_SIZE` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override @Nonnull public` | `List<Vector3i>` | `scan(@Nonnull Scanner.Context context)` |
| `@Override @Nonnull public` | `SpaceSize` | `scanSpace()` |
| `@Nonnull public static` | `OriginScanner` | `getInstance()` |
