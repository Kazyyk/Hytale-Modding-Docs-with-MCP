---
title: "CountObjectiveTaskAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.config.task"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.config.task.CountObjectiveTaskAsset"
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
public abstract class CountObjectiveTaskAsset extends ObjectiveTaskAsset
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<CountObjectiveTaskAsset>` | `CODEC` |
| `protected` | `int` | `count` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `CountObjectiveTaskAsset(String descriptionId, TaskConditionAsset[] taskConditions, Vector3i[] mapMarkers, int count)` |
| `protected` | `CountObjectiveTaskAsset()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public int` | `getCount()` |
| `protected` | `boolean` | `matchesAsset0(ObjectiveTaskAsset task)` |
| `public` | `String` | `toString()` |

## Related Types

- [ObjectiveTaskAsset](ObjectiveTaskAsset.md)
