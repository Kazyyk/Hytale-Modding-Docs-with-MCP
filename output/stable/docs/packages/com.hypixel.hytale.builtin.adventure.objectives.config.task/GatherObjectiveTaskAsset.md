---
title: "GatherObjectiveTaskAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.config.task"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.config.task.GatherObjectiveTaskAsset"
api_surface: false
extends: "CountObjectiveTaskAsset"
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
public class GatherObjectiveTaskAsset extends CountObjectiveTaskAsset
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<GatherObjectiveTaskAsset>` | `CODEC` |
| `protected` | `BlockTagOrItemIdField` | `blockTagOrItemIdField` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `GatherObjectiveTaskAsset(String descriptionId, TaskConditionAsset[] taskConditions, Vector3i[] mapMarkers, int count, BlockTagOrItemIdField blockTagOrItemIdField)` |
| `protected` | `GatherObjectiveTaskAsset()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `ObjectiveTaskAsset.TaskScope` | `getTaskScope()` |
| `` | `public BlockTagOrItemIdField` | `getBlockTagOrItemIdField()` |
| `protected` | `boolean` | `matchesAsset0(ObjectiveTaskAsset task)` |
| `public` | `String` | `toString()` |

## Related Types

- [BlockTagOrItemIdField](BlockTagOrItemIdField.md)
- [CountObjectiveTaskAsset](CountObjectiveTaskAsset.md)
- [ObjectiveTaskAsset](ObjectiveTaskAsset.md)
