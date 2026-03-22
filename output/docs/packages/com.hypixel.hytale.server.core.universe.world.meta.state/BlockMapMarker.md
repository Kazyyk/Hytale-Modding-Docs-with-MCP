---
title: "BlockMapMarker"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.meta.state"
fqcn: "com.hypixel.hytale.server.core.universe.world.meta.state.BlockMapMarker"
api_surface: false
extends: "java.lang.Object"
implements:
  - "Component<ChunkStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "world"
  - "block-state"
  - "ecs"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.meta.state`

```java
public class BlockMapMarker implements Component<ChunkStore>
```

ECS component attached to chunk-store entities that manages block-based map markers. Tracks marker positions within a chunk and synchronizes them with the `WorldMapManager`. Implements the `RefSystem` callbacks for marker lifecycle (add, remove, tick).
