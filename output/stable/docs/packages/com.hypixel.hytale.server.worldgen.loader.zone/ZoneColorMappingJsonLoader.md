---
title: "ZoneColorMappingJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.zone"
fqcn: "com.hypixel.hytale.server.worldgen.loader.zone.ZoneColorMappingJsonLoader"
api_surface: false
extends: "JsonLoader<SeedStringResource, ZoneColorMapping>"
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
public class ZoneColorMappingJsonLoader extends JsonLoader<SeedStringResource, ZoneColorMapping>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `Map<String, Zone>` | `zoneLookup` |
| `` | `ZoneColorMapping` | `colorMapping` |
| `` | `JsonObject` | `mappingObj` |
| `` | `int` | `rgb` |
| `` | `JsonArray` | `arr` |
| `` | `Zone[]` | `zoneArr` |
| `` | `String` | `zoneName` |
| `` | `Zone` | `zone` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ZoneColorMappingJsonLoader(SeedString<SeedStringResource> seed, Path dataFolder, JsonElement json, Map<String, Zone> zoneLookup)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `ZoneColorMapping` | `load()` |
| `` | `throw new` | `IllegalArgumentException(String.format("Zone with name %s was not found for color %s!", zoneName, entry.getKey()` |
| `` | `public static void` | `collectZones(Set<String> zoneSet, @Nullable JsonElement json)` |
