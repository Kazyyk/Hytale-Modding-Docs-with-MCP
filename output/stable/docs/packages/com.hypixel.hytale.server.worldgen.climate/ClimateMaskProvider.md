---
title: "ClimateMaskProvider"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.climate"
fqcn: "com.hypixel.hytale.server.worldgen.climate.ClimateMaskProvider"
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
public class ClimateMaskProvider
```

Provides climate mask data for world generation. Generates per-chunk climate classification masks by sampling noise fields and looking up the climate graph. Used by the terrain generation pipeline to determine which biome decorations and features apply to each area.
