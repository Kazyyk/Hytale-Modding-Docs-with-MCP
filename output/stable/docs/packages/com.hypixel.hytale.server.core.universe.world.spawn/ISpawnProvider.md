---
title: "ISpawnProvider"
kind: "interface"
package: "com.hypixel.hytale.server.core.universe.world.spawn"
fqcn: "com.hypixel.hytale.server.core.universe.world.spawn.ISpawnProvider"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "world"
  - "spawn"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.spawn`

```java
public interface ISpawnProvider
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `` | `BuilderCodecMapCodec<ISpawnProvider>` | `CODEC` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `default` | `Transform` | `getSpawnPoint(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `@Deprecated default` | `Transform` | `getSpawnPoint(@Nonnull Entity entity)` |
| `` | `Transform` | `getSpawnPoint(@Nonnull World var1, @Nonnull UUID var2)` |
| `@Deprecated` | `Transform[]` | `getSpawnPoints()` |
| `` | `boolean` | `isWithinSpawnDistance(@Nonnull Vector3d var1, double var2)` |
