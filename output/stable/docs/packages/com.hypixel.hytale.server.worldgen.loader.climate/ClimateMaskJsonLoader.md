---
title: "ClimateMaskJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.climate"
fqcn: "com.hypixel.hytale.server.worldgen.loader.climate.ClimateMaskJsonLoader"
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
public class ClimateMaskJsonLoader<K extends SeedResource> extends JsonLoader<K, ClimateMaskProvider>
```

JSON loader that deserializes configuration data from JSON files.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable public` | `ClimateMaskProvider` | `load()` |
| `@Nonnull protected` | `ICoordinateRandomizer` | `loadRandomizer()` |
| `@Nonnull protected` | `ClimateNoise` | `loadClimateNoise()` |
| `@Nonnull protected` | `ClimateGraph` | `loadClimateGraph()` |
| `@Nonnull protected` | `UniqueClimateGenerator` | `loadUniqueClimateGenerator()` |
| `` | `protected static JsonObject` | `loadMaskFileJson(Path file)` |
| `` | `throw new` | `Error("Failed to load Mask.json", var2)` |
