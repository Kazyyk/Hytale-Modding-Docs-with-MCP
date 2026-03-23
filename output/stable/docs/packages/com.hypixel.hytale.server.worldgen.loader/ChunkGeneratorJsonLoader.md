---
title: "ChunkGeneratorJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader"
fqcn: "com.hypixel.hytale.server.worldgen.loader.ChunkGeneratorJsonLoader"
api_surface: false
extends: "Loader<SeedStringResource, ChunkGenerator>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "loader"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader`

```java
public class ChunkGeneratorJsonLoader extends Loader<SeedStringResource, ChunkGenerator>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `WorldGenConfig` | `config` |
| `` | `Path` | `worldFile` |
| `` | `JsonObject` | `worldJson` |
| `` | `Path` | `overrideDataFolder` |
| `` | `WorldGenConfig` | `config` |
| `` | `ChunkGenerator` | `var13` |
| `` | `Vector2i` | `worldSize` |
| `` | `Vector2i` | `worldOffset` |
| `` | `MaskProvider` | `maskProvider` |
| `` | `PrefabStoreRoot` | `prefabStore` |
| `` | `ZonePatternProviderJsonLoader` | `loader` |
| `` | `FileLoadingContext` | `loadingContext` |
| `` | `Zone[]` | `zones` |
| `` | `Path` | `overrideFolder` |
| `` | `Path` | `parent` |
| `` | `int` | `width` |
| `` | `int` | `height` |
| `` | `int` | `offsetX` |
| `` | `int` | `offsetY` |
| `` | `WeightedMap.Builder<String>` | `builder` |
| `` | `JsonElement` | `masks` |
| `` | `JsonArray` | `arr` |
| `` | `JsonObject` | `obj` |
| `` | `IWeightedMap<String>` | `weightedMap` |
| `` | `String` | `maskName` |
| `` | `Path` | `maskFile` |
| `` | `JsonElement` | `storeJson` |
| `` | `String` | `store` |
| `` | `Path` | `zoneFile` |
| `` | `JsonObject` | `zoneJson` |
| `` | `HytaleLogger.Api` | `logger` |
| `` | `Semver` | `unversioned` |
| `` | `AssetPack` | `pack` |
| `` | `String` | `name` |
| `` | `Semver` | `version` |
| `` | `Path` | `location` |
| `` | `String` | `KEY_WIDTH` |
| `` | `String` | `KEY_HEIGHT` |
| `` | `String` | `KEY_OFFSET_X` |
| `` | `String` | `KEY_OFFSET_Y` |
| `` | `String` | `KEY_RANDOMIZER` |
| `` | `String` | `KEY_MASKS` |
| `` | `String` | `KEY_PREFAB_STORE` |
| `` | `String` | `OVERRIDE_DATA_FOLDER` |
| `` | `String` | `FILE_WORLD_JSON` |
| `` | `String` | `FILE_ZONES_JSON` |
| `` | `String` | `FILE_MASK_JSON` |
| `` | `String` | `FILE_MASK_PNG` |
| `` | `String` | `ERROR_WORLD_FILE_EXIST` |
| `` | `String` | `ERROR_WORLD_FILE_READ` |
| `` | `String` | `ERROR_WORLD_JSON_CORRUPT` |
| `` | `String` | `ERROR_ZONE_FILE` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ChunkGeneratorJsonLoader(@Nonnull SeedString<SeedStringResource> seed, @Nonnull WorldGenConfig config)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `ChunkGenerator` | `load()` |
| `` | `throw new` | `IllegalArgumentException(String.valueOf(worldFile)` |
| `private` | `Path` | `loadOverrideDataFolderPath(@Nonnull JsonObject worldJson, @Nonnull Path dataFolder)` |
| `` | `throw new` | `Error(String.format("Override folder '%s' must exist within: '%s'", overrideFolder.getFileName()` |
| `protected` | `JsonObject` | `loadWorldJson(@Nonnull Path file)` |
| `` | `throw new` | `Error(String.format("Could not read JSON configuration for world. File: %s", file)` |
| `protected` | `Vector2i` | `loadWorldSize(@Nonnull JsonObject worldJson)` |
| `` | `return new` | `Vector2i(width, height)` |
| `protected` | `Vector2i` | `loadWorldOffset(@Nonnull JsonObject worldJson)` |
| `` | `return new` | `Vector2i(offsetX, offsetY)` |
| `protected` | `MaskProvider` | `loadMaskProvider(@Nonnull JsonObject worldJson, Vector2i worldSize, Vector2i worldOffset)` |
| `` | `throw new` | `Error("Invalid mask file path: " + maskName)` |
| `protected` | `PrefabStoreRoot` | `loadPrefabStore(@Nonnull JsonObject worldJson)` |
| `` | `throw new` | `Error("Invalid PrefabStore name: " + store, var5)` |
| `` | `throw new` | `Error("Expected 'PrefabStore' to be a string")` |
| `protected` | `ZonePatternProviderJsonLoader` | `loadZonePatternGenerator(MaskProvider maskProvider)` |
| `` | `return new` | `ZonePatternProviderJsonLoader(this.seed, this.dataFolder, zoneJson, maskProvider)` |
| `` | `throw new` | `Error(String.format("Failed to read zone configuration file! File: %s", zoneFile.toString()` |
| `` | `protected static void` | `logAssetPacks(@Nonnull List<AssetPack> packs)` |

## Inner Types

- `ChunkGeneratorJsonLoader.Constants`

## Related Types

- [AssetFileSystem](AssetFileSystem.md)
- [MaskProviderJsonLoader](MaskProviderJsonLoader.md)
- [ZonesJsonLoader](ZonesJsonLoader.md)
