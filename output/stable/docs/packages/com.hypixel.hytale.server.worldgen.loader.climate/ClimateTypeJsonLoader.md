---
title: "ClimateTypeJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.climate"
fqcn: "com.hypixel.hytale.server.worldgen.loader.climate.ClimateTypeJsonLoader"
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
public class ClimateTypeJsonLoader<K extends SeedResource> extends JsonLoader<K, ClimateType>
```

JSON loader that deserializes configuration data from JSON files.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `super(seed, dataFolder, json)` |
| `` | `public ClimateType` | `load()` |
| `` | `return new` | `ClimateType(name, color, island, points, children)` |
| `@Nonnull protected` | `String` | `loadName()` |
| `@Nonnull protected` | `ClimateColor` | `loadIslandColor(@Nonnull ClimateColor color)` |
| `@Nonnull protected` | `ClimatePoint[]` | `loadClimatePoints()` |
| `@Nonnull protected` | `ClimateType[]` | `loadChildren(ClimateType parent)` |
| `@Nonnull protected` | `ClimatePoint` | `loadPoint(int index, JsonElement pointsJson)` |
