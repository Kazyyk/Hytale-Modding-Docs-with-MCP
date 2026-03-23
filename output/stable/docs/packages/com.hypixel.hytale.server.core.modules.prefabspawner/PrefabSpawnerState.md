---
title: "PrefabSpawnerState"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.prefabspawner"
fqcn: "com.hypixel.hytale.server.core.modules.prefabspawner.PrefabSpawnerState"
api_surface: false
extends: "BlockState"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "modules"
  - "prefabspawner"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.prefabspawner`

```java
public class PrefabSpawnerState extends BlockState
```

Block state for prefab spawner blocks. Stores configuration for spawning prefabs during world generation including prefab path, heightmap fitting, seed inheritance, height condition inheritance, and weighted prefab selection.

## Fields

| Modifier | Type | Field | Description |
|---|---|---|---|
| `public static final` | `String` | `PREFAB_SPAWNER_TYPE` | Type identifier ("prefabspawner") |
| `public static final` | `Codec<PrefabSpawnerState>` | `CODEC` | Serialization codec |
| `public static final` | `KeyedCodec<Boolean>` | `FIT_HEIGHTMAP_CODEC` | FitHeightmap field codec |
| `public static final` | `KeyedCodec<Boolean>` | `INHERIT_SEED_CODEC` | InheritSeed field codec |
| `public static final` | `KeyedCodec<Boolean>` | `INHERIT_HEIGHT_CONDITION_CODEC` | InheritHeightCondition field codec |
| `public static final` | `KeyedCodec<PrefabWeights>` | `PREFAB_WEIGHTS_CODEC` | PrefabWeights field codec |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `getPrefabPath()` |
| `public` | `void` | `setPrefabPath(String prefabPath)` |
| `public` | `boolean` | `isFitHeightmap()` |
| `public` | `void` | `setFitHeightmap(boolean fitHeightmap)` |
| `public` | `boolean` | `isInheritSeed()` |
| `public` | `void` | `setInheritSeed(boolean inheritSeed)` |
| `public` | `boolean` | `isInheritHeightCondition()` |
| `public` | `void` | `setInheritHeightCondition(boolean inheritHeightCondition)` |
| `public` | `PrefabWeights` | `getPrefabWeights()` |
| `public` | `void` | `setPrefabWeights(PrefabWeights prefabWeights)` |
