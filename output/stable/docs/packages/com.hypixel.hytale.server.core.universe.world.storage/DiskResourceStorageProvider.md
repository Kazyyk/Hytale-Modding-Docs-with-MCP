---
title: "DiskResourceStorageProvider"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.storage"
fqcn: "com.hypixel.hytale.server.core.universe.world.storage.resources.DiskResourceStorageProvider"
api_surface: false
implements:
  - "IResourceStorageProvider"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "world"
  - "storage"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.storage`

```java
public class DiskResourceStorageProvider implements IResourceStorageProvider
```

File-based resource storage. Persists ECS resources as JSON files in `<world>/<path>/` directory. Default path: `resources`. Registered as `"Disk"`. Handles legacy migration of `chunkstore`/`entitystore` subdirectories.
