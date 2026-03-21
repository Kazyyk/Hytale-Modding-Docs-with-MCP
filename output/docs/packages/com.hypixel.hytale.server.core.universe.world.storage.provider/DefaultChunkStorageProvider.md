---
title: "DefaultChunkStorageProvider"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.storage.provider"
fqcn: "com.hypixel.hytale.server.core.universe.world.storage.provider.DefaultChunkStorageProvider"
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
public class DefaultChunkStorageProvider implements IChunkStorageProvider<Object>
```

Delegates all operations to the server-recommended default storage provider (currently `IndexedStorageChunkStorageProvider`). Versioned codec with ID `Hytale`.
