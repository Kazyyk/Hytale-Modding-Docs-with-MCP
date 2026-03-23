---
title: "IResourceStorageProvider"
kind: "interface"
package: "com.hypixel.hytale.server.core.universe.world.storage"
fqcn: "com.hypixel.hytale.server.core.universe.world.storage.resources.IResourceStorageProvider"
api_surface: true
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "world"
  - "storage"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.storage`

```java
public interfaceinterface IResourceStorageProvider
```

Interface for pluggable resource (non-chunk) storage. Provides `getResourceStorage(World)` returning an `IResourceStorage`. Uses `BuilderCodecMapCodec` for configuration.
