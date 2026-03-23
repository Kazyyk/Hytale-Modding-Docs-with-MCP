---
title: "DirectGrid"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.climate"
fqcn: "com.hypixel.hytale.server.worldgen.climate.DirectGrid"
api_surface: false
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
public class DirectGrid
```

Fixed-resolution 2D grid that directly stores climate type indices at each cell. Used as the backing storage for `ClimateGraph` lookup tables. Provides array-based O(1) access by quantized coordinates.
