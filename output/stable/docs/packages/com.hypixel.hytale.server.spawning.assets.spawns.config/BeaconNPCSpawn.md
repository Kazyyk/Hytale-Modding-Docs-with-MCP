---
title: "BeaconNPCSpawn"
kind: "class"
package: "com.hypixel.hytale.server.spawning.assets.spawns.config"
fqcn: "com.hypixel.hytale.server.spawning.assets.spawns.config.BeaconNPCSpawn"
api_surface: false
extends: "NPCSpawn"
implements: ["JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, BeaconNPCSpawn>>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "spawning"
  - "config"
  - "npc"
---

**Package:** `com.hypixel.hytale.server.spawning.assets.spawns.config`

```java
public class BeaconNPCSpawn extends NPCSpawn implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, BeaconNPCSpawn>>
```

NPC spawn configuration for beacon-based spawning at fixed prefab locations. Adds spawn position selection via `FloodFillPositionSelector` parameters and environment restrictions.
