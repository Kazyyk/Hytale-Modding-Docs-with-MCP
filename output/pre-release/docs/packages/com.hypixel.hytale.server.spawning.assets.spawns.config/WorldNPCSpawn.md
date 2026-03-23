---
title: "WorldNPCSpawn"
kind: "class"
package: "com.hypixel.hytale.server.spawning.assets.spawns.config"
fqcn: "com.hypixel.hytale.server.spawning.assets.spawns.config.WorldNPCSpawn"
api_surface: false
extends: "NPCSpawn"
implements: ["JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, WorldNPCSpawn>>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "spawning"
  - "config"
  - "npc"
---

**Package:** `com.hypixel.hytale.server.spawning.assets.spawns.config`

```java
public class WorldNPCSpawn extends NPCSpawn implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, WorldNPCSpawn>>
```

NPC spawn configuration for world-level ambient spawning. Adds biome-based spawn weighting and density control.
