---
title: "SeedResourcePointGenerator"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.SeedResourcePointGenerator"
api_surface: false
extends: "PointGenerator"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "procedural-generation"
  - "noise"
  - "json-loader"
---

**Package:** `com.hypixel.hytale.procedurallib.json`

```java
public class SeedResourcePointGenerator extends PointGenerator
```

A `PointGenerator` subclass that delegates thread-local buffer access to a `SeedResource` instance. Used by [PointGeneratorJsonLoader](PointGeneratorJsonLoader.md) to create point generators with correct buffer scoping.

## Constructor

```java
public SeedResourcePointGenerator(int seedOffset, CellDistanceFunction cellDistanceFunction, PointEvaluator pointEvaluator, SeedResource seedResource)
```

## Overridden Methods

| Method | Returns | Description |
|---|---|---|
| `localBounds2d()` | `ResultBuffer.Bounds2d` | Delegates to `seedResource.localBounds2d()`. |
| `localBuffer2d()` | `ResultBuffer.ResultBuffer2d` | Delegates to `seedResource.localBuffer2d()`. |
| `localBuffer3d()` | `ResultBuffer.ResultBuffer3d` | Delegates to `seedResource.localBuffer3d()`. |

## Related Types

- [SeedResource](SeedResource.md) -- provides the thread-local buffers
- [PointGeneratorJsonLoader](PointGeneratorJsonLoader.md) -- creates instances of this class
