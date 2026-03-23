---
title: "ResultBuffer"
kind: "class"
package: "com.hypixel.hytale.procedurallib.logic"
fqcn: "com.hypixel.hytale.procedurallib.logic.ResultBuffer"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "procedural"
  - "noise"
  - "buffer"
---

**Package:** `com.hypixel.hytale.procedurallib.logic`

```java
public class ResultBuffer
```

Provides static thread-local result buffer instances for nearest-cell searches. Contains static singletons `bounds2d`, `buffer2d`, and `buffer3d` used by cell noise functions to accumulate nearest and second-nearest cell data without allocating per-call.

## Static Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `ResultBuffer.Bounds2d` | `bounds2d` |
| `public static final` | `ResultBuffer.ResultBuffer2d` | `buffer2d` |
| `public static final` | `ResultBuffer.ResultBuffer3d` | `buffer3d` |

## Inner Types

### Bounds2d

```java
public static class Bounds2d
```

| Type | Name |
|---|---|
| `double` | `minX`, `minY`, `maxX`, `maxY` |

| Return Type | Signature |
|---|---|
| `void` | `assign(double minX, double minY, double maxX, double maxY)` |
| `boolean` | `contains(double x, double y)` |

### ResultBuffer2d

```java
public static class ResultBuffer2d
```

Accumulates nearest and second-nearest cell data (hash, grid coordinates, distance, world position) for 2D cell queries.

| Return Type | Signature |
|---|---|
| `void` | `register(int hash, int ix, int iy, double distance, double x, double y)` |
| `void` | `register2(int hash, int ix, int iy, double distance, double x, double y)` |

### ResultBuffer3d

```java
public static class ResultBuffer3d
```

Accumulates nearest and second-nearest cell data for 3D cell queries.

| Return Type | Signature |
|---|---|
| `void` | `register(int hash, int ix, int iy, int iz, double distance, double x, double y, double z)` |
| `void` | `register2(int hash, int ix, int iy, int iz, double distance, double x, double y, double z)` |
