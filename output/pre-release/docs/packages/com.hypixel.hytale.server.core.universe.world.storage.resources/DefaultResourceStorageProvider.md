---
title: "DefaultResourceStorageProvider"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.storage.resources"
fqcn: "com.hypixel.hytale.server.core.universe.world.storage.resources.DefaultResourceStorageProvider"
api_surface: false
extends: ~
implements: ["IResourceStorageProvider"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "world"
  - "storage"
  - "resources"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.storage.resources`

```java
public class DefaultResourceStorageProvider implements IResourceStorageProvider
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `DefaultResourceStorageProvider` | `INSTANCE` |
| `public static final` | `String` | `ID` |
| `public static final` | `BuilderCodec<DefaultResourceStorageProvider>` | `CODEC` |
| `public static final` | `DiskResourceStorageProvider` | `DEFAULT` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `<T extends WorldProvider> IResourceStorage` | `getResourceStorage(@Nonnull World world)` |
| `@Nonnull @Override public` | `String` | `toString()` |
