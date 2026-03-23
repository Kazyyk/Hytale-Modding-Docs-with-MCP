---
title: "BlockMapMarkersResource"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.meta.state"
fqcn: "com.hypixel.hytale.server.core.universe.world.meta.state.BlockMapMarkersResource"
api_surface: false
extends: "java.lang.Object"
implements:
  - "Resource<ChunkStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "world"
  - "block-state"
  - "ecs"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.meta.state`

```java
public class BlockMapMarkersResource implements Resource<ChunkStore>
```

Per-chunk-store resource that collects all block map markers into a `MarkersCollector`. Provides the chunk-level aggregation of markers for the world map system.
