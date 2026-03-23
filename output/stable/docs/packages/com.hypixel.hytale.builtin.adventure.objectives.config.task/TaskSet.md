---
title: "TaskSet"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.config.task"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.config.task.TaskSet"
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
public class TaskSet
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<TaskSet>` | `CODEC` |
| `public static final` | `String` | `TASKSET_DESCRIPTION_KEY` |
| `protected` | `String` | `descriptionId` |
| `protected` | `ObjectiveTaskAsset[]` | `tasks` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `TaskSet(String descriptionId, ObjectiveTaskAsset[] tasks)` |
| `protected` | `TaskSet()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public String` | `getDescriptionId()` |
| `public` | `String` | `getDescriptionKey(String objectiveId, int taskSetIndex)` |
| `` | `public ObjectiveTaskAsset[]` | `getTasks()` |
| `public` | `String` | `toString()` |

## Related Types

- [ObjectiveTaskAsset](ObjectiveTaskAsset.md)
