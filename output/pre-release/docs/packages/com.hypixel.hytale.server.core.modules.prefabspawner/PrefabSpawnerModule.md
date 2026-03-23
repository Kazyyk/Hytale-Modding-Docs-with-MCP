---
title: "PrefabSpawnerModule"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.prefabspawner"
fqcn: "com.hypixel.hytale.server.core.modules.prefabspawner.PrefabSpawnerModule"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "prefab"
  - "spawner"
  - "module"
  - "plugin"
---

**Package:** `com.hypixel.hytale.server.core.modules.prefabspawner`

```java
public class PrefabSpawnerModule extends JavaPlugin
```

Core plugin module that manages prefab spawner blocks. Registers the `PrefabSpawnerBlock` component type on the chunk store, the `PrefabSpawnerCommand`, and a migration system for legacy prefab spawner data.

## Static Methods

| Method | Signature |
|---|---|
| `get` | `static PrefabSpawnerModule get()` |

## Methods

| Method | Signature |
|---|---|
| `getPrefabSpawnerBlockType` | `ComponentType<ChunkStore, PrefabSpawnerBlock> getPrefabSpawnerBlockType()` |

## Inner Types

- [PrefabSpawnerModule.MigratePrefabSpawn](PrefabSpawnerModule.MigratePrefabSpawn.md) -- migration system for legacy data