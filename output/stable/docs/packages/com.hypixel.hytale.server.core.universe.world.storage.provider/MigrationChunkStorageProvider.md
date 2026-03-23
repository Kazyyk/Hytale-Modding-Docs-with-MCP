---
title: "MigrationChunkStorageProvider"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.storage.provider"
fqcn: "com.hypixel.hytale.server.core.universe.world.storage.provider.MigrationChunkStorageProvider"
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
public class MigrationChunkStorageProvider implements IChunkStorageProvider<MigrationChunkStorageProvider.MigrationData>
```

Chains multiple storage providers: tries each loader in order until a chunk is found, and saves to a single target provider. Used for migrating worlds between storage formats or creating read-only storage backed by multiple sources.
