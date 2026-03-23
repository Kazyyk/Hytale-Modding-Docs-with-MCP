---
title: "WorldGenPrefabSupplier"
kind: class
package: "com.hypixel.hytale.server.worldgen.loader"
fqcn: "com.hypixel.hytale.server.worldgen.loader.WorldGenPrefabSupplier"
api_surface: "public"
extends: "java.lang.Object"
implements: ["PrefabSupplier"]
generator_version: "2.0.0"
generated_at: "2026-03-21T05:14:49Z"
tags: ["worldgen", "loader"]
---

Supplies individual world generation prefabs on demand. Implements `PrefabSupplier`. Lazily resolves the prefab name and computes chunk bounds (with recursive child prefab expansion up to depth 10). Equality is based on the file path.

## Hierarchy

- **Extends:** `java.lang.Object`
- **Implements:** `PrefabSupplier`

## Methods

| Method | Return Type | Description |
|--------|------------|-------------|
| `getLoader()` | `WorldGenPrefabLoader` | Returns the parent `WorldGenPrefabLoader`. |
| `getName()` | `String` | Returns the full file path as the name. |
| `getPrefabName()` | `String` | Lazily resolves and returns the relative prefab name. |
| `getPath()` | `Path` | Returns the prefab file path. |
| `get()` | `IPrefabBuffer` | Loads the prefab buffer from the chunk generator resource cache. |
| `getBounds(IPrefabBuffer)` | `IChunkBounds` | Lazily computes and caches chunk bounds, recursively including child prefabs. |

