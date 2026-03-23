---
title: "BufferChunkSaver"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.storage"
fqcn: "com.hypixel.hytale.server.core.universe.world.storage.BufferChunkSaver"
api_surface: false
implements:
  - "IChunkSaver"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "world"
  - "chunks"
  - "storage"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.storage`

```java
public abstract class BufferChunkSaver implements IChunkSaver
```

Abstract chunk saver that serializes chunks to `ByteBuffer` via BSON. Subclasses provide the `saveBuffer` and `removeBuffer` implementations.
