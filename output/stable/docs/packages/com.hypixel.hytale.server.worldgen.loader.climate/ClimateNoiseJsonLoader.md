---
title: "ClimateNoiseJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.climate"
fqcn: "com.hypixel.hytale.server.worldgen.loader.climate.ClimateNoiseJsonLoader"
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
public class ClimateNoiseJsonLoader<K extends SeedResource> extends JsonLoader<K, ClimateNoise>
```

JSON loader that deserializes configuration data from JSON files.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `super(seed, dataFolder, json)` |
| `@Nonnull public` | `ClimateNoise` | `load()` |
| `@Nonnull protected` | `ClimateNoise.Grid` | `loadGrid()` |
| `@Nonnull protected` | `NoiseProperty` | `loadContinentNoise()` |
| `@Nonnull protected` | `NoiseProperty` | `loadTemperatureNoise()` |
| `@Nonnull protected` | `NoiseProperty` | `loadIntensityNoise()` |
| `@Nonnull protected` | `ClimateNoise.Thresholds` | `loadThresholds()` |
