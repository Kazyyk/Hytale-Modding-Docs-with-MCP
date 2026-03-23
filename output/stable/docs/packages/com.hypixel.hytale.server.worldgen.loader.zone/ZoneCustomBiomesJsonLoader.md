---
title: "ZoneCustomBiomesJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.zone"
fqcn: "com.hypixel.hytale.server.worldgen.loader.zone.ZoneCustomBiomesJsonLoader"
api_surface: false
extends: "null"
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
public class ZoneCustomBiomesJsonLoader extends JsonLoader<SeedStringResource, CustomBiome[]>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `Comparator<CustomBiome>` | `PRIORITY_SORTER` |
| `protected final` | `ZoneFileContext` | `zoneContext` |
| `protected final` | `Biome[]` | `tileBiomes` |
| `` | `int` | `index` |
| `` | `CustomBiome[]` | `biomes` |
| `` | `BiomeFileContext` | `biomeContext` |
| `` | `JsonElement` | `biomeJson` |
| `` | `CustomBiome` | `biome` |
| `` | `CustomBiomeGenerator` | `reference` |
| `` | `String` | `ERROR_BIOME_FILES_NULL` |
| `` | `String` | `ERROR_BIOME_FAILED` |
| `` | `String` | `ERROR_NO_CUSTOM_GENERATOR` |
| `` | `String` | `FILE_CUSTOM_PREFIX` |
| `` | `String` | `FILE_CUSTOM_SUFFIX` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ZoneCustomBiomesJsonLoader(SeedString<SeedStringResource> seed, Path dataFolder, JsonElement json, ZoneFileContext zoneContext, Biome[] tileBiomes)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `CustomBiome[]` | `load()` |
| `` | `throw new` | `NullPointerException(biomeContext.getPath()` |
| `` | `throw new` | `Error(String.format("Error while loading custom biome \"%s\" from \"%s\"", biomeContext.getName()` |

## Inner Types

- `ZoneCustomBiomesJsonLoader.Constants`
