---
title: "EmptyChunkStorageProvider"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.storage"
fqcn: "com.hypixel.hytale.server.core.universe.world.storage.provider.EmptyChunkStorageProvider"
api_surface: false
implements:
  - "IChunkStorageProvider<Void>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "world"
  - "chunks"
  - "storage"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.storage`

```java
public class EmptyChunkStorageProvider implements IChunkStorageProvider<Void>
```

No-op chunk storage provider. Discards saves and returns null for loads. Registered as `"Empty"` in the codec. Singleton via `INSTANCE`.
