---
title: "DistortedShape"
kind: "interface"
package: "com.hypixel.hytale.server.worldgen.cave.shape.distorted"
fqcn: "com.hypixel.hytale.server.worldgen.cave.shape.distorted.DistortedShape"
api_surface: false
extends: null
implements:
  - "com.hypixel.hytale.server.worldgen.util.bounds.IWorldBounds"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:30:09Z"
tags:
  - "server"
  - "worldgen"
  - "cave"
  - "shape"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.worldgen.cave.shape.distorted`

```java
public interface DistortedShape extends IWorldBounds
```

Interface for distorted cave shapes. Extends `IWorldBounds`. Provides methods for shape projection, validity testing, Y/width/height interpolation, height calculation with distortion, and ceiling/floor computation. Includes a `Factory` interface for creating shapes with configurable dimensions and interpolation.
