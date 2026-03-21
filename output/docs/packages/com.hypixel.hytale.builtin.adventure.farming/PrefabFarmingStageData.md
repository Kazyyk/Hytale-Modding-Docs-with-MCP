---
title: "PrefabFarmingStageData"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming.config.stages"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.config.stages.PrefabFarmingStageData"
api_surface: false
extends: "FarmingStageData"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "farming"
  - "config"
  - "stage"
---

**Package:** `com.hypixel.hytale.builtin.adventure.farming.config.stages`

```java
public class PrefabFarmingStageData extends FarmingStageData
```

A farming stage that places or transitions between prefab structures. Supports weighted random prefab selection, integrity checking of previous prefabs, obstruction testing, and block replacement masking. When transitioning from one prefab to another, performs a diff-based update that only modifies changed blocks and adds break particles. Contains the inner class `PrefabStage`.

## Codec Fields

prefabStages (IWeightedMap<PrefabStage>), replaceMaskTags (String[])

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `apply(@Nonnull ComponentAccessor<ChunkStore> commandBuffer, @Nonnull Ref<ChunkStore> sectionRef, @Nonnull Ref<ChunkStore> blockRef, int x, int y, int z, @Nullable FarmingStageData previousStage)` |
