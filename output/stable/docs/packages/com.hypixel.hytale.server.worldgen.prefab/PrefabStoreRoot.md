---
title: "PrefabStoreRoot"
kind: "enum"
package: "com.hypixel.hytale.server.worldgen.prefab"
fqcn: "com.hypixel.hytale.server.worldgen.prefab.PrefabStoreRoot"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "prefab"
  - "enum"
---

**Package:** `com.hypixel.hytale.server.worldgen.prefab`

```java
public enum PrefabStoreRoot
```

Enumerates the root directories for prefab storage: `ASSETS` (from the asset prefabs path) and `WORLD_GEN` (from the data folder Prefabs directory).

## Constants

| Constant | Description |
|---|---|
| `ASSETS` | Asset prefabs path |
| `WORLD_GEN` | Data folder Prefabs directory |

## Fields

| Modifier | Type | Field | Description |
|---|---|---|---|
| `public static final` | `PrefabStoreRoot` | `DEFAULT` | Default root (WORLD_GEN) |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `Path` | `resolvePrefabStore(PrefabStoreRoot store, Path dataFolder)` |
