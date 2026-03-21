---
title: "ObjectiveTaskAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.config.task"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.config.task.ObjectiveTaskAsset"
api_surface: false
extends: "null"
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
public abstract class ObjectiveTaskAsset
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `CodecMapCodec<ObjectiveTaskAsset>` | `CODEC` |
| `public static final` | `BuilderCodec<ObjectiveTaskAsset>` | `BASE_CODEC` |
| `public static final` | `String` | `TASK_DESCRIPTION_KEY` |
| `protected` | `String` | `descriptionId` |
| `protected` | `TaskConditionAsset[]` | `taskConditions` |
| `protected` | `Vector3i[]` | `mapMarkers` |
| `private` | `String` | `defaultDescriptionId` |
| `` | `PLAYER,
        MARKER,` | `PLAYER_AND_MARKER` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ObjectiveTaskAsset(String descriptionId, TaskConditionAsset[] taskConditions, Vector3i[] mapMarkers)` |
| `protected` | `ObjectiveTaskAsset()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public String` | `getDescriptionId()` |
| `public` | `String` | `getDescriptionKey(String objectiveId, int taskSetIndex, int taskIndex)` |
| `` | `public TaskConditionAsset[]` | `getTaskConditions()` |
| `public` | `Vector3i[]` | `getMapMarkers()` |
| `` | `public abstract ObjectiveTaskAsset.TaskScope` | `getTaskScope()` |
| `` | `public boolean` | `matchesAsset(@Nonnull ObjectiveTaskAsset task)` |
| `` | `protected abstract boolean` | `matchesAsset0(ObjectiveTaskAsset var1)` |
| `public` | `String` | `toString()` |
| `` | `public boolean` | `isTaskPossibleForMarker()` |
| `` | `public boolean` | `isTaskPossibleForPlayer()` |

## Inner Types

- `ObjectiveTaskAsset.TaskScope`
