---
title: "IChunkSaver"
kind: "interface"
package: "com.hypixel.hytale.server.core.universe.world.storage"
fqcn: "com.hypixel.hytale.server.core.universe.world.storage.IChunkSaver"
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
public interfaceinterface IChunkSaver implements Closeable
```

Interface for saving/removing chunk holders to persistent storage. Provides `saveHolder`, `removeHolder`, `getIndexes`, and `flush` methods.
