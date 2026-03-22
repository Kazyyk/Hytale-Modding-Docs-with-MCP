---
title: "ChunkSavingSystems"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.storage"
fqcn: "com.hypixel.hytale.server.core.universe.world.storage.component.ChunkSavingSystems"
api_surface: true
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "world"
  - "chunks"
  - "storage"
  - "ecs"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.storage`

```java
public class ChunkSavingSystems
```

Systems and utilities for periodic and shutdown chunk saving. Contains `Data` resource (save queue with timer), `Ticking` system (parallel save dispatch), and `WorldRemoved` system (full save on shutdown).
