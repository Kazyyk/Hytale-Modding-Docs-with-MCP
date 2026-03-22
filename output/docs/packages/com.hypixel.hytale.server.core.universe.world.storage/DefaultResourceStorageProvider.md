---
title: "DefaultResourceStorageProvider"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.storage"
fqcn: "com.hypixel.hytale.server.core.universe.world.storage.resources.DefaultResourceStorageProvider"
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
public class DefaultResourceStorageProvider implements IResourceStorageProvider
```

Default resource storage that delegates to `DiskResourceStorageProvider`. Registered as `"Hytale"`. Singleton via `INSTANCE`.
