---
title: "UniqueClimateGenerator"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.climate"
fqcn: "com.hypixel.hytale.server.worldgen.climate.UniqueClimateGenerator"
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
public class UniqueClimateGenerator
```

Generates unique climate assignments for world regions by combining multiple noise layers with the climate graph. Ensures that each generated world area has a deterministic but varied climate distribution. Used during initial world generation to assign base climate types to chunks.
