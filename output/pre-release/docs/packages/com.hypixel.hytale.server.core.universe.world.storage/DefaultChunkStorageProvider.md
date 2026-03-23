---
title: "DefaultChunkStorageProvider"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.storage"
fqcn: "com.hypixel.hytale.server.core.universe.world.storage.provider.DefaultChunkStorageProvider"
api_surface: false
implements:
  - "IChunkStorageProvider<Object>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "world"
  - "chunks"
  - "storage"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.storage`

```java
public class DefaultChunkStorageProvider implements IChunkStorageProvider<Object>
```

Default chunk storage provider that delegates to `IndexedStorageChunkStorageProvider`. Registered as `"Hytale"` in the codec.
