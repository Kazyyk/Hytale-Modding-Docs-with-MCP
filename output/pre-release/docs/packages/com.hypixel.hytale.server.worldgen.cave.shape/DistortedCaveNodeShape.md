---
title: "DistortedCaveNodeShape"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.cave.shape"
fqcn: "com.hypixel.hytale.server.worldgen.cave.shape.DistortedCaveNodeShape"
api_surface: false
extends: null
implements:
  - "com.hypixel.hytale.server.worldgen.cave.shape.CaveNodeShape"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:30:09Z"
tags:
  - "server"
  - "worldgen"
  - "cave"
  - "shape"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.cave.shape`

```java
public class DistortedCaveNodeShape implements CaveNodeShape
```

Implements `CaveNodeShape` using a `DistortedShape` and `ShapeDistortion`. Determines whether blocks should be replaced based on shape projection, height distortion, floor/ceiling calculations. Populates chunks by carving blocks, applying fillings, and placing cover entries.
