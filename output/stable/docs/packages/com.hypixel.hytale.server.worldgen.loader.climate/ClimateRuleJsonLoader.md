---
title: "ClimateRuleJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.climate"
fqcn: "com.hypixel.hytale.server.worldgen.loader.climate.ClimateRuleJsonLoader"
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
public class ClimateRuleJsonLoader<K extends SeedResource> extends JsonLoader<K, ClimateSearch.Rule>
```

JSON loader that deserializes configuration data from JSON files.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `super(seed, dataFolder, json)` |
| `@Nullable public` | `ClimateSearch.Rule` | `load()` |
| `` | `protected ClimateSearch.Range` | `loadRange(String key)` |
| `` | `protected static double` | `loadTarget(@Nonnull JsonObject json)` |
| `` | `protected static double` | `loadRadius(@Nonnull JsonObject json)` |
| `` | `protected static double` | `loadWeight(@Nonnull JsonObject json)` |
