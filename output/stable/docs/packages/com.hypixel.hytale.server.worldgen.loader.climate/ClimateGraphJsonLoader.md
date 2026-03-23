---
title: "ClimateGraphJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.climate"
fqcn: "com.hypixel.hytale.server.worldgen.loader.climate.ClimateGraphJsonLoader"
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
public class ClimateGraphJsonLoader<K extends SeedResource> extends JsonLoader<K, ClimateGraph>
```

JSON loader that deserializes configuration data from JSON files.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `super(seed, dataFolder, json)` |
| `@Nonnull public` | `ClimateGraph` | `load()` |
| `` | `return new` | `ClimateGraph(512, climates, fadeMode, fadeRadius, fadeDistance)` |
| `` | `protected ClimateGraph.FadeMode` | `loadFadeMode()` |
| `` | `protected double` | `loadFadeRadius()` |
| `` | `protected double` | `loadFadeDistance()` |
| `@Nonnull protected` | `ClimateType[]` | `loadClimates()` |
