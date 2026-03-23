---
title: "ClimateGraph"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.climate"
fqcn: "com.hypixel.hytale.server.worldgen.climate.ClimateGraph"
api_surface: true
extends: "java.lang.Object"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "worldgen"
  - "climate"
  - "biome"
---

**Package:** `com.hypixel.hytale.server.worldgen.climate`

```java
public class ClimateGraph
```

Precomputed 2D lookup table that maps temperature-humidity coordinates to climate types. Operates on a fixed 512x512 resolution grid. Builds the lookup table using distance transforms and fade blending at climate boundaries. Supports parent-child climate hierarchies for smooth transitions between biome regions.
