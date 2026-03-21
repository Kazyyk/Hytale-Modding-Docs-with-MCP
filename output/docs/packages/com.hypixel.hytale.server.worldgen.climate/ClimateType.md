---
title: "ClimateType"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.climate"
fqcn: "com.hypixel.hytale.server.worldgen.climate.ClimateType"
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
public class ClimateType
```

Defines a distinct climate/biome type with its temperature-humidity position, map colors, parent-child relationships, and associated generation parameters. Each climate type occupies a region in the 2D climate graph. Supports hierarchical nesting (e.g., a desert climate type may have sub-types for dunes vs. oasis).
