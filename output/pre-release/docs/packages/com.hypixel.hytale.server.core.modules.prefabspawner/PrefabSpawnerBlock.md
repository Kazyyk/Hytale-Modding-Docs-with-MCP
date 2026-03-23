---
title: "PrefabSpawnerBlock"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.prefabspawner"
fqcn: "com.hypixel.hytale.server.core.modules.prefabspawner.PrefabSpawnerBlock"
api_surface: false
extends: ~
implements:
  - "Component<ChunkStore>"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "prefab"
  - "spawner"
  - "block"
  - "component"
---

**Package:** `com.hypixel.hytale.server.core.modules.prefabspawner`

```java
public class PrefabSpawnerBlock implements Component<ChunkStore>
```

Component attached to chunk store block entities that configures prefab spawning. Stores the prefab path (dot-notation), whether the child prefab should follow the heightmap, inherit the parent seed, inherit the height condition, and per-prefab probability weights.

## Methods

| Method | Signature |
|---|---|
| `getComponentType` | `static ComponentType<ChunkStore, PrefabSpawnerBlock> getComponentType()` |
| `getPrefabPath` | `String getPrefabPath()` |
| `setPrefabPath` | `void setPrefabPath(String prefabPath)` |
| `isFitHeightmap` | `boolean isFitHeightmap()` |
| `setFitHeightmap` | `void setFitHeightmap(boolean fitHeightmap)` |
| `isInheritSeed` | `boolean isInheritSeed()` |
| `setInheritSeed` | `void setInheritSeed(boolean inheritSeed)` |
| `isInheritHeightCondition` | `boolean isInheritHeightCondition()` |
| `setInheritHeightCondition` | `void setInheritHeightCondition(boolean inheritHeightCondition)` |
| `getPrefabWeights` | `PrefabWeights getPrefabWeights()` |
| `setPrefabWeights` | `void setPrefabWeights(PrefabWeights prefabWeights)` |
| `clone` | `@Nullable Component<ChunkStore> clone()` |

## Inner Types

- [PrefabSpawnerBlock.PrefabSpawnerSettingsPage](PrefabSpawnerBlock.PrefabSpawnerSettingsPage.md) -- custom UI page for editing spawner settings
- [PrefabSpawnerBlock.PrefabSpawnerSettingsPageEventData](PrefabSpawnerBlock.PrefabSpawnerSettingsPageEventData.md) -- event data for the settings page