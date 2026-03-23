---
title: "ZoneRequirementJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.zone"
fqcn: "com.hypixel.hytale.server.worldgen.loader.zone.ZoneRequirementJsonLoader"
api_surface: false
extends: "JsonLoader<SeedStringResource, Set<String>>"
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
public class ZoneRequirementJsonLoader extends JsonLoader<SeedStringResource, Set<String>>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `` | `Set<String>` | `zoneSet` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ZoneRequirementJsonLoader(SeedString<SeedStringResource> seed, Path dataFolder, JsonElement json)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Set<String>` | `load()` |
| `` | `throw new` | `IllegalArgumentException("Could not find mappings for colors in mask file. Keyword: MaskMapping")` |

## Related Types

- [UniqueZoneEntryJsonLoader](UniqueZoneEntryJsonLoader.md)
- [ZoneColorMappingJsonLoader](ZoneColorMappingJsonLoader.md)
