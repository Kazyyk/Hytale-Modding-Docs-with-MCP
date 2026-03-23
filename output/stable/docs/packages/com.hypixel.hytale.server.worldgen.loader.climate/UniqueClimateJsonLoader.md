---
title: "UniqueClimateJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.climate"
fqcn: "com.hypixel.hytale.server.worldgen.loader.climate.UniqueClimateJsonLoader"
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
public class UniqueClimateJsonLoader<K extends SeedResource> extends JsonLoader<K, UniqueClimateGenerator.Entry>
```

JSON loader that deserializes configuration data from JSON files.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `super(seed, dataFolder, json)` |
| `@Nonnull public` | `UniqueClimateGenerator.Entry` | `load()` |
| `` | `protected String` | `loadName()` |
| `` | `protected String` | `loadParent()` |
| `` | `protected int` | `loadColor()` |
| `` | `protected int` | `loadRadius()` |
| `@Nonnull protected` | `Vector2i` | `loadOrigin()` |
| `` | `return new` | `Vector2i(x, y)` |
| `` | `protected int` | `loadDistance()` |
| `` | `protected int` | `loadMinDistance()` |
| `` | `protected ClimateSearch.Rule` | `loadRule()` |
