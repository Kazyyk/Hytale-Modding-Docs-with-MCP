---
title: "WorldMapTracker"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world"
fqcn: "com.hypixel.hytale.server.core.universe.world.WorldMapTracker"
api_surface: true
extends: ~
implements:
  - "Tickable"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "world"
  - "map"
  - "tracker"
---

**Package:** `com.hypixel.hytale.server.core.universe.world`

```java
public class WorldMapTracker implements Tickable
```

Per-player world map state manager. Tracks which map chunks are loaded for a player, handles spiral-order loading/unloading, zone discovery with sound/title events, marker tracking, biome tracking, and reload-on-change. Respects world map area bounds, view radius, and frame size limits.

## Inner Types

- `WorldMapTracker.ZoneDiscoveryInfo` -- record with zone name, region, display flag, sound, icon, and timing