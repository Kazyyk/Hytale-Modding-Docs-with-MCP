---
title: "TriangularGrid2dPositionProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.positionproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.positionproviders.TriangularGrid2dPositionProvider"
api_surface: false
extends: "PositionProvider"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:59Z"
tags:
  - "worldgen"
  - "position-provider"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.positionproviders`

```java
public class TriangularGrid2dPositionProvider extends PositionProvider
```

Generates positions on a 2D triangular (hexagonal) grid at Y=0. Alternating rows are offset by half a unit for triangular tiling. Only emits positions within bounds.
