---
title: "WorldConfig"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world"
fqcn: "com.hypixel.hytale.server.core.universe.world.WorldConfig"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "world"
  - "config"
---

**Package:** `com.hypixel.hytale.server.core.universe.world`

```java
public class WorldConfig
```

Configuration for a single world. Controls all per-world settings including UUID, display name, seed, spawn provider, world gen, world map, chunk storage, ticking, PvP, fall damage, game time, weather, game mode, NPC spawning, chunk saving/unloading, compass, and plugin-specific configuration. Supports versioned codec serialization (version 4) with documentation annotations for each field.

## Inner Types

- `WorldConfig.ChunkConfig` -- nested config for pregenerate and keep-loaded regions