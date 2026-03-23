---
title: "ZoneJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.zone"
fqcn: "com.hypixel.hytale.server.worldgen.loader.zone.ZoneJsonLoader"
api_surface: false
extends: "JsonLoader<SeedStringResource, Zone>"
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
public class ZoneJsonLoader extends JsonLoader<SeedStringResource, Zone>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `ZoneFileContext` | `zoneContext` |
| `` | `JsonElement` | `discoveryElement` |
| `` | `JsonObject` | `discoveryObject` |
| `` | `Boolean` | `display` |
| `` | `JsonElement` | `displayElement` |
| `` | `String` | `zoneName` |
| `` | `JsonElement` | `zoneNameElement` |
| `` | `String` | `soundEventId` |
| `` | `JsonElement` | `soundElement` |
| `` | `String` | `icon` |
| `` | `JsonElement` | `iconElement` |
| `` | `Boolean` | `major` |
| `` | `JsonElement` | `majorElement` |
| `` | `Float` | `duration` |
| `` | `JsonElement` | `durationElement` |
| `` | `Float` | `fadeInDuration` |
| `` | `JsonElement` | `fadeInElement` |
| `` | `Float` | `fadeOutDuration` |
| `` | `JsonElement` | `fadeOutElement` |
| `` | `IWeightedMap<TileBiome>` | `tileBiomes` |
| `` | `TileBiome[]` | `biomes` |
| `` | `CustomBiome[]` | `customBiomes` |
| `` | `String` | `KEY_BIOME_GENERATOR` |
| `` | `String` | `KEY_UNIQUE_PREFABS` |
| `` | `String` | `KEY_DISCOVERY` |
| `` | `String` | `KEY_DISCOVERY_DISPLAY` |
| `` | `String` | `KEY_DISCOVERY_ZONE` |
| `` | `String` | `KEY_DISCOVERY_SOUND_EVENT_ID` |
| `` | `String` | `KEY_DISCOVERY_ICON` |
| `` | `String` | `KEY_DISCOVERY_MAJOR` |
| `` | `String` | `KEY_DISCOVERY_DURATION` |
| `` | `String` | `KEY_DISCOVERY_FADE_IN_DURATION` |
| `` | `String` | `KEY_DISCOVERY_FADE_OUT_DURATION` |
| `` | `String` | `PATH_CAVE` |
| `` | `String` | `SEED_ZONE_SUFFIX` |
| `` | `String` | `ERROR_BIOME_GENERATOR` |
| `` | `String` | `ERROR_TILE_BIOMES` |
| `` | `String` | `ERROR_CUSTOM_BIOMES` |
| `` | `String` | `ERROR_CAVE_GENERATOR` |
| `` | `String` | `ERROR_UNIQUE_PREFABS` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ZoneJsonLoader(@Nonnull SeedString<SeedStringResource> seed, @Nonnull Path dataFolder, @Nonnull JsonElement json, @Nonnull ZoneFileContext zoneContext)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Zone` | `load()` |
| `` | `return new` | `Zone(this.zoneContext.getId()` |
| `protected` | `ZoneDiscoveryConfig` | `loadDiscoveryConfig()` |
| `protected` | `BiomePatternGenerator` | `loadBiomePatternGenerator()` |
| `` | `return new` | `BiomePatternGeneratorJsonLoader(this.seed, this.dataFolder, this.get("BiomeGenerator")` |
| `` | `throw new` | `Error("Error while loading biome generator.", var5)` |
| `protected` | `IWeightedMap<TileBiome>` | `loadBiomes()` |
| `` | `return new` | `ZoneBiomesJsonLoader(this.seed, this.dataFolder, this.get("BiomeGenerator")` |
| `` | `throw new` | `Error("Error while loading tile biomes.", var2)` |
| `protected` | `CustomBiome[]` | `loadCustomBiomes(@Nonnull Biome[] tileBiomes)` |
| `` | `return new` | `ZoneCustomBiomesJsonLoader(this.seed, this.dataFolder, this.get("BiomeGenerator")` |
| `` | `throw new` | `Error("Error while loading custom biomes.", var3)` |
| `protected` | `CaveGenerator` | `loadCaveGenerator()` |
| `` | `return new` | `CaveGeneratorJsonLoader(this.seed, this.dataFolder, this.json, this.zoneContext.getPath()` |
| `` | `throw new` | `Error("Error while loading cave generator.", var2)` |
| `protected` | `UniquePrefabContainer` | `loadUniquePrefabContainer()` |
| `` | `return new` | `UniquePrefabContainerJsonLoader(this.seed, this.dataFolder, this.get("UniquePrefabs")` |
| `` | `throw new` | `Error("Error while loading unique prefabs.", var2)` |

## Inner Types

- `ZoneJsonLoader.Constants`

## Related Types

- [ZoneBiomesJsonLoader](ZoneBiomesJsonLoader.md)
- [ZoneCustomBiomesJsonLoader](ZoneCustomBiomesJsonLoader.md)
