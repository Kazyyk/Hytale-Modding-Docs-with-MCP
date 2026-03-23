---
title: "CavePrefabConfigJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.cave"
fqcn: "com.hypixel.hytale.server.worldgen.loader.cave.CavePrefabConfigJsonLoader"
api_surface: false
extends: "JsonLoader<SeedStringResource, CavePrefabContainer.CavePrefabEntry.CavePrefabConfig>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "worldgen"
  - "cave"
  - "loader"
  - "prefab"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader.cave`

```java
public class CavePrefabConfigJsonLoader extends JsonLoader<SeedStringResource, CavePrefabContainer.CavePrefabEntry.CavePrefabConfig>
```

JSON loader for cave prefab placement configuration. Parses allowed rotations, placement mode, biome mask, block mask, iteration count, displacement range, noise condition, and height condition.
