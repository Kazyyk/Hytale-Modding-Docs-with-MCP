---
title: "com.hypixel.hytale.server.core.prefab"
kind: "package"
package: "com.hypixel.hytale.server.core.prefab"
fqcn: "com.hypixel.hytale.server.core.prefab"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "prefab"
  - "rotation"
  - "store"
---

**Package:** `com.hypixel.hytale.server.core.prefab`

Core prefab system providing rotation handling, prefab file I/O (load/save/cache), weighted random selection, exception types, and entity copyability markers. The `PrefabRotation` enum handles coordinate transformation for the four 90-degree rotation increments.

## Types

| Type | Kind | Description |
|---|---|---|
| [PrefabRotation](PrefabRotation.md) | enum | Four 90-degree rotation constants with coordinate transformation. |
| [PrefabEntry](PrefabEntry.md) | record | Reference to a prefab file with path and asset pack info. |
| [PrefabStore](PrefabStore.md) | class | Singleton for loading, caching, and saving prefab files. |
| [PrefabWeights](PrefabWeights.md) | class | Weighted random selection for prefab variants. |
| [PrefabCopyableComponent](PrefabCopyableComponent.md) | class | Singleton marker component for prefab-copyable entities. |
| [PrefabLoadException](PrefabLoadException.md) | class | Exception for prefab load failures (ERROR, NOT_FOUND). |
| [PrefabSaveException](PrefabSaveException.md) | class | Exception for prefab save failures (ERROR, ALREADY_EXISTS). |
