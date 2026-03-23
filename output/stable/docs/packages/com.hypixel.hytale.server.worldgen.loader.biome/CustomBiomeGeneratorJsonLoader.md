---
title: "CustomBiomeGeneratorJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.biome"
fqcn: "com.hypixel.hytale.server.worldgen.loader.biome.CustomBiomeGeneratorJsonLoader"
api_surface: false
extends: "JsonLoader<SeedStringResource, CustomBiomeGenerator>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "worldgen"
  - "biome"
  - "loader"
  - "generator"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader.biome`

```java
public class CustomBiomeGeneratorJsonLoader extends JsonLoader<SeedStringResource, CustomBiomeGenerator>
```

Loads a `CustomBiomeGenerator` from JSON, configuring noise thresholds, valid parent biome conditions, and biome masks that determine where a custom biome can generate within a zone.
