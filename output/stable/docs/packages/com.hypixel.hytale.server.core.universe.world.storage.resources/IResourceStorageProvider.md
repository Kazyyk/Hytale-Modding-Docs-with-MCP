---
title: "IResourceStorageProvider"
kind: "interface"
package: "com.hypixel.hytale.server.core.universe.world.storage.resources"
fqcn: "com.hypixel.hytale.server.core.universe.world.storage.resources.IResourceStorageProvider"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "world"
  - "storage"
  - "resources"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.storage.resources`

```java
public interface IResourceStorageProvider
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull` | `BuilderCodecMapCodec<IResourceStorageProvider>` | `CODEC` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `<T extends WorldProvider> IResourceStorage` | `getResourceStorage(@Nonnull World var1)` |
