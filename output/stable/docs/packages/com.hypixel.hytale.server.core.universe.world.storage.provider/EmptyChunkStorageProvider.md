---
title: "EmptyChunkStorageProvider"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.storage.provider"
fqcn: "com.hypixel.hytale.server.core.universe.world.storage.provider.EmptyChunkStorageProvider"
api_surface: false
extends: null
implements:
  - "com.hypixel.hytale.server.core.universe.world.storage.provider.IChunkStorageProvider"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "storage"
  - "chunks"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.storage.provider`

```java
public class EmptyChunkStorageProvider implements IChunkStorageProvider<Void>
```

Singleton no-op provider that discards all save operations and always returns null from load. Provides empty index sets. Codec ID is `Empty`.
