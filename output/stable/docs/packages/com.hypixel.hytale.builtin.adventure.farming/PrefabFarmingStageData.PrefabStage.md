---
title: "PrefabFarmingStageData.PrefabStage"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming.config.stages"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.config.stages.PrefabFarmingStageData.PrefabStage"
api_surface: false
extends: null
implements:
  - "IWeightedElement"
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "farming"
  - "config"
  - "stage"
  - "prefab"
---

**Package:** `com.hypixel.hytale.builtin.adventure.farming.config.stages`

```java
public static class PrefabFarmingStageData.PrefabStage implements IWeightedElement
```

A weighted entry in the [PrefabFarmingStageData](PrefabFarmingStageData.md) prefab selection map. Each entry has a weight (for random selection) and a path to a prefab asset file.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `int` | `weight` |
| `protected` | `String` | `path` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `double` | `getWeight()` |
| `@Nonnull public` | `Path` | `getResolvedPath()` |
