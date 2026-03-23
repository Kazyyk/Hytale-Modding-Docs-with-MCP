---
title: "WorldGenTimingsCollector"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.worldgen"
fqcn: "com.hypixel.hytale.server.core.universe.world.worldgen.WorldGenTimingsCollector"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "world"
  - "worldgen"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.worldgen`

```java
public class WorldGenTimingsCollector
```

Collects and reports timing metrics for world generation phases: zone/biome resolution, preparation, block generation, cave generation, and prefab generation. Uses atomic counters for thread safety. Skips warmup period (first 100 chunks).
