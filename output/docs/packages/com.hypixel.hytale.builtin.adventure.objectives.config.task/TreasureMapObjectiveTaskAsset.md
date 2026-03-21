---
title: "TreasureMapObjectiveTaskAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.config.task"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.config.task.TreasureMapObjectiveTaskAsset"
api_surface: false
extends: "ObjectiveTaskAsset"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "objectives"
  - "config"
  - "task"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.config.task`

```java
public class TreasureMapObjectiveTaskAsset extends ObjectiveTaskAsset
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<TreasureMapObjectiveTaskAsset>` | `CODEC` |
| `protected` | `TreasureMapObjectiveTaskAsset.ChestConfig[]` | `chestConfigs` |
| `` | `public static final BuilderCodec<TreasureMapObjectiveTaskAsset.ChestConfig>` | `CODEC` |
| `` | `protected float` | `minRadius` |
| `` | `protected float` | `maxRadius` |
| `` | `protected String` | `droplistId` |
| `` | `protected WorldLocationProvider` | `worldLocationProvider` |
| `` | `protected String` | `chestBlockTypeKey` |
| `` | `TreasureMapObjectiveTaskAsset.ChestConfig` | `that` |
| `` | `int` | `result` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `TreasureMapObjectiveTaskAsset(String descriptionId, TaskConditionAsset[] taskConditions, Vector3i[] mapMarkers, TreasureMapObjectiveTaskAsset.ChestConfig[] chestConfigs)` |
| `protected` | `TreasureMapObjectiveTaskAsset()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `ObjectiveTaskAsset.TaskScope` | `getTaskScope()` |
| `` | `public TreasureMapObjectiveTaskAsset.ChestConfig[]` | `getChestConfigs()` |
| `protected` | `boolean` | `matchesAsset0(ObjectiveTaskAsset task)` |
| `public` | `String` | `toString()` |
| `` | `throw new` | `IllegalArgumentException("ChestConfig.MinRadius ("
                                + chestConfig.minRadius
                                + ")` |
| `` | `public float` | `getMinRadius()` |
| `` | `public float` | `getMaxRadius()` |
| `` | `public String` | `getDroplistId()` |
| `` | `public WorldLocationProvider` | `getWorldLocationProvider()` |
| `` | `public String` | `getChestBlockTypeKey()` |
| `` | `public boolean` | `equals(@Nullable Object o)` |
| `` | `public int` | `hashCode()` |
| `` | `public String` | `toString()` |

## Inner Types

- `TreasureMapObjectiveTaskAsset.ChestConfig`

## Related Types

- [ObjectiveTaskAsset](ObjectiveTaskAsset.md)
