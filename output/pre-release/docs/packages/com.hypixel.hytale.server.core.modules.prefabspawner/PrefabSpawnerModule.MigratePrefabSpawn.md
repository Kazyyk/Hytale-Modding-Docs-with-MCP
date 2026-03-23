---
title: "PrefabSpawnerModule.MigratePrefabSpawn"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.prefabspawner"
fqcn: "com.hypixel.hytale.server.core.modules.prefabspawner.PrefabSpawnerModule.MigratePrefabSpawn"
api_surface: false
extends: "BlockModule.MigrationSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "prefab"
  - "spawner"
  - "migration"
---

**Package:** `com.hypixel.hytale.server.core.modules.prefabspawner`

```java
public static class PrefabSpawnerModule.MigratePrefabSpawn extends BlockModule.MigrationSystem
```

Migration system that moves legacy prefab spawner data from unknown components to the typed `PrefabSpawnerBlock` component. Queries entities with unknown components and extracts `"prefabspawner"` data using the `PrefabSpawnerBlock.CODEC`.

## Methods

| Method | Signature |
|---|---|
| `onEntityAdd` | `void onEntityAdd(@Nonnull Holder<ChunkStore> holder, @Nonnull AddReason reason, @Nonnull Store<ChunkStore> store)` |
| `onEntityRemoved` | `void onEntityRemoved(@Nonnull Holder<ChunkStore> holder, @Nonnull RemoveReason reason, @Nonnull Store<ChunkStore> store)` |
| `getQuery` | `@Nullable Query<ChunkStore> getQuery()` |

## See Also

- [PrefabSpawnerModule](PrefabSpawnerModule.md)