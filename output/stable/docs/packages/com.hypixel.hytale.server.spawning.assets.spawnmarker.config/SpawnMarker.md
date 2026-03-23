---
title: "SpawnMarker"
kind: "class"
package: "com.hypixel.hytale.server.spawning.assets.spawnmarker.config"
fqcn: "com.hypixel.hytale.server.spawning.assets.spawnmarker.config.SpawnMarker"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "spawning"
  - "assets"
  - "spawnmarker"
  - "config"
  - "class"
---

**Package:** `com.hypixel.hytale.server.spawning.assets.spawnmarker.config`

```java
public class SpawnMarker implements JsonAssetWithMap<String, DefaultAssetMap<String, SpawnMarker>>
```

Asset configuration for spawn markers that spawn NPCs at designated positions with defined rotations. When the spawned NPC dies, a new one respawns after a configurable cooldown (game time or real time). Supports model configuration, role assignment, flock integration, and multiple spawn timing options.
