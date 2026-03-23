---
title: "MigrationChunkStorageProvider"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.storage"
fqcn: "com.hypixel.hytale.server.core.universe.world.storage.provider.MigrationChunkStorageProvider"
api_surface: false
implements:
  - "IChunkStorageProvider<MigrationData>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "world"
  - "chunks"
  - "storage"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.storage`

```java
public class MigrationChunkStorageProvider implements IChunkStorageProvider<MigrationData>
```

Chains multiple loader providers with a single saver. Loaders are tried in order until one succeeds. Registered as `"Migration"` in the codec. Useful for format migration or read-only configurations.
