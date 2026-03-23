---
title: "ContinentThresholdsJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.climate"
fqcn: "com.hypixel.hytale.server.worldgen.loader.climate.ContinentThresholdsJsonLoader"
api_surface: false
extends: "SeedResource> extends JsonLoader"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "worldgen"
  - "loader"
  - "climate"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader.climate`

```java
public class ContinentThresholdsJsonLoader<K extends SeedResource> extends JsonLoader<K, ClimateNoise.Thresholds>
```

JSON loader that deserializes configuration data from JSON files.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `super(seed, dataFolder, json)` |
| `@Nonnull public` | `ClimateNoise.Thresholds` | `load()` |
| `` | `protected double` | `loadLandThreshold()` |
| `` | `protected double` | `loadIslandThreshold()` |
| `` | `protected double` | `loadBeachSize()` |
| `` | `protected double` | `loadShallowOceanSize()` |
