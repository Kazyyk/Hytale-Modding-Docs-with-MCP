---
title: "ChunkUnloadingSystem.Data"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.storage"
fqcn: "com.hypixel.hytale.server.core.universe.world.storage.component.ChunkUnloadingSystem.Data"
api_surface: true
implements:
  - "Resource<ChunkStore>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "world"
  - "chunks"
  - "storage"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.storage.component`

```java
public class Data implements Resource<ChunkStore>
```

Resource tracking unload interval timer (0.5s), poll count, and active chunk trackers list.
