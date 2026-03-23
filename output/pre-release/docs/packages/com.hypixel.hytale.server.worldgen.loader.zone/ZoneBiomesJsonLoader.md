---
title: "ZoneBiomesJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.zone"
fqcn: "com.hypixel.hytale.server.worldgen.loader.zone.ZoneBiomesJsonLoader"
api_surface: false
extends: "JsonLoader<SeedStringResource, IWeightedMap<TileBiome>>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "loader"
  - "zone"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader.zone`

```java
public class ZoneBiomesJsonLoader extends JsonLoader<SeedStringResource, IWeightedMap<TileBiome>>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `ZoneFileContext` | `zoneContext` |
| `` | `WeightedMap.Builder<TileBiome>` | `builder` |
| `` | `TileBiome` | `biome` |
| `` | `JsonElement` | `biomeJson` |
| `` | `String` | `ERROR_BIOME_FILES_NULL` |
| `` | `String` | `ERROR_BIOME_FAILED` |
| `` | `String` | `ERROR_NO_TILE_BIOMES` |
| `` | `String` | `FILE_TILE_PREFIX` |
| `` | `String` | `FILE_TILE_SUFFIX` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ZoneBiomesJsonLoader(SeedString<SeedStringResource> seed, Path dataFolder, JsonElement json, ZoneFileContext zone)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public IWeightedMap<TileBiome>` | `load()` |
| `` | `throw new` | `IllegalArgumentException("Could not find any tile biomes for this zone!")` |
| `protected` | `TileBiome` | `loadBiome(@Nonnull BiomeFileContext biomeContext)` |
| `` | `return new` | `TileBiomeJsonLoader(this.seed, this.dataFolder, biomeJson, biomeContext)` |
| `` | `throw new` | `Error(String.format("Error while loading tile biome \"%s\" from \"%s\"", biomeContext.getName()` |

## Inner Types

- `ZoneBiomesJsonLoader.Constants`
