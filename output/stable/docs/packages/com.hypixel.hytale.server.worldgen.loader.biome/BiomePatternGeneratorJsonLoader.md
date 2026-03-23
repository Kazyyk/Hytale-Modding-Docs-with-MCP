---
title: "BiomePatternGeneratorJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.biome"
fqcn: "com.hypixel.hytale.server.worldgen.loader.biome.BiomePatternGeneratorJsonLoader"
api_surface: false
extends: "JsonLoader<SeedStringResource, BiomePatternGenerator>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "worldgen"
  - "biome"
  - "loader"
  - "pattern"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader.biome`

```java
public class BiomePatternGeneratorJsonLoader extends JsonLoader<SeedStringResource, BiomePatternGenerator>
```

Loads a `BiomePatternGenerator` from JSON, configuring the point generator, distance function, tile biome definitions, and custom biome overlays that determine biome distribution within a zone.
