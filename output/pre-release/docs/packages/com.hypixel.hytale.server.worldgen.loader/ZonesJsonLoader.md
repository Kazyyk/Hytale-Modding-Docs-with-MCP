---
title: "ZonesJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader"
fqcn: "com.hypixel.hytale.server.worldgen.loader.ZonesJsonLoader"
api_surface: false
extends: "null"
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
public class ZonesJsonLoader extends Loader<SeedStringResource, Zone[]>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `FileLoadingContext` | `loadingContext` |
| `` | `FileContext.Registry<ZoneFileContext>` | `zoneRegistry` |
| `` | `int` | `index` |
| `` | `Zone[]` | `zones` |
| `` | `ZoneFileContext` | `zoneContext` |
| `` | `JsonObject` | `zoneJson` |
| `` | `Zone` | `zone` |
| `` | `String` | `PATH_ZONES` |
| `` | `String` | `FILE_ZONE_MAIN_FILE` |
| `` | `String` | `ERROR_LOADING_ZONE` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ZonesJsonLoader(@Nonnull SeedString<SeedStringResource> seed, Path dataFolder, FileLoadingContext loadingContext)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Zone[]` | `load()` |
| `` | `throw new` | `Error(String.format("Error while loading zone \"%s\" for world generator from file.", zoneContext.getPath()` |

## Inner Types

- `ZonesJsonLoader.Constants`
