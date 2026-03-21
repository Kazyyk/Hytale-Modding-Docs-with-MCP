---
title: "IChunkLoader"
kind: "interface"
package: "com.hypixel.hytale.server.core.universe.world.storage"
fqcn: "com.hypixel.hytale.server.core.universe.world.storage.IChunkLoader"
api_surface: true
implements:
  - "Closeable"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "world"
  - "chunks"
  - "storage"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.storage`

```java
public interfaceinterface IChunkLoader implements Closeable
```

Interface for loading chunk holders from persistent storage. Provides `loadHolder(int, int)` returning a future and `getIndexes()` returning all stored chunk indices.
