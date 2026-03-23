---
title: "CraftObjectiveTaskAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.config.task"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.config.task.CraftObjectiveTaskAsset"
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
public class CraftObjectiveTaskAsset extends CountObjectiveTaskAsset
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<CraftObjectiveTaskAsset>` | `CODEC` |
| `protected` | `String` | `itemId` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `CraftObjectiveTaskAsset(String descriptionId, TaskConditionAsset[] taskConditions, Vector3i[] mapMarkers, int count, String itemId)` |
| `protected` | `CraftObjectiveTaskAsset()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `ObjectiveTaskAsset.TaskScope` | `getTaskScope()` |
| `` | `public String` | `getItemId()` |
| `protected` | `boolean` | `matchesAsset0(ObjectiveTaskAsset task)` |
| `public` | `String` | `toString()` |

## Related Types

- [CountObjectiveTaskAsset](CountObjectiveTaskAsset.md)
- [ObjectiveTaskAsset](ObjectiveTaskAsset.md)
