---
title: "BiomeMaskJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.biome"
fqcn: "com.hypixel.hytale.server.worldgen.loader.biome.BiomeMaskJsonLoader"
api_surface: false
extends: "JsonLoader<SeedStringResource, IIntCondition>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "worldgen"
  - "biome"
  - "loader"
  - "mask"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader.biome`

```java
public class BiomeMaskJsonLoader extends JsonLoader<SeedStringResource, IIntCondition>
```

Loads a biome mask condition from JSON. Biome masks define which biome IDs are included or excluded, producing an `IIntCondition` that tests whether a given biome ID passes the mask. Supports cached file-based masks via `FileMaskCache`.
