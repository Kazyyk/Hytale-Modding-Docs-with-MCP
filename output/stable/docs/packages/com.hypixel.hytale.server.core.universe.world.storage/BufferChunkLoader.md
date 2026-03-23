---
title: "BufferChunkLoader"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.storage"
fqcn: "com.hypixel.hytale.server.core.universe.world.storage.BufferChunkLoader"
api_surface: false
implements:
  - "IChunkLoader"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "world"
  - "chunks"
  - "storage"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.storage`

```java
public abstract class BufferChunkLoader implements IChunkLoader
```

Abstract chunk loader that deserializes chunks from `ByteBuffer` via BSON. Subclasses provide the `loadBuffer(int, int)` implementation.
