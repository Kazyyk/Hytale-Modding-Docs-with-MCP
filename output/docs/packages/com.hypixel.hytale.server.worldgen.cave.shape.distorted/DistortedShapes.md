---
title: "DistortedShapes"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.cave.shape.distorted"
fqcn: "com.hypixel.hytale.server.worldgen.cave.shape.distorted.DistortedShapes"
api_surface: false
extends: "null"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "cave"
  - "shape"
  - "distorted"
---

**Package:** `com.hypixel.hytale.server.worldgen.cave.shape.distorted`

```java
public final class DistortedShapes
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `DistortedShape.Factory` | `CYLINDER` |
| `public static final` | `DistortedShape.Factory` | `ELLIPSE` |
| `public static final` | `DistortedShape.Factory` | `PIPE` |
| `private static final` | `Map<String, DistortedShape.Factory>` | `SHAPES` |
| `` | `DistortedShape.Factory` | `factory` |

## Constructors

| Modifier | Signature |
|---|---|
| `private` | `DistortedShapes()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public static void` | `register(String name, DistortedShape.Factory factory)` |
| `` | `public static void` | `forEach(BiConsumer<String, DistortedShape.Factory> consumer)` |
| `` | `public static void` | `forEachName(Consumer<String> consumer)` |
| `` | `public static void` | `forEachShape(Consumer<DistortedShape.Factory> consumer)` |
| `public static` | `DistortedShape.Factory` | `getDefault()` |
| `public static` | `DistortedShape.Factory` | `getOrDefault(String name)` |
| `public static` | `DistortedShape.Factory` | `getByName(String name)` |

## Related Types

- [DistortedCylinderShape](DistortedCylinderShape.md)
- [DistortedEllipsoidShape](DistortedEllipsoidShape.md)
- [DistortedPipeShape](DistortedPipeShape.md)
- [DistortedShape](DistortedShape.md)
