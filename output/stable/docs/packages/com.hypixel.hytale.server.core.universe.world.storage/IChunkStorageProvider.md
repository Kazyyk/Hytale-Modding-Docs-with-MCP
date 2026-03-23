---
title: "IChunkStorageProvider"
kind: "interface"
package: "com.hypixel.hytale.server.core.universe.world.storage"
fqcn: "com.hypixel.hytale.server.core.universe.world.storage.provider.IChunkStorageProvider"
api_surface: true
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "world"
  - "chunks"
  - "storage"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.storage`

```java
public interfaceinterface IChunkStorageProvider
```

Pluggable storage backend interface for chunk persistence. Implementations provide `initialize`, `close`, `getLoader`, `getSaver`, and `migrateFrom` methods. Uses `BuilderCodecMapCodec` for JSON configuration.
