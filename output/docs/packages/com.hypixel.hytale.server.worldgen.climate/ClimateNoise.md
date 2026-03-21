---
title: "ClimateNoise"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.climate"
fqcn: "com.hypixel.hytale.server.worldgen.climate.ClimateNoise"
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
public class ClimateNoise
```

Configures and evaluates the noise functions that produce temperature and humidity values for the climate system. Wraps procedural noise generators with scale, offset, and normalization parameters. The noise output feeds into `ClimateGraph` lookups to determine climate type at each world position.
