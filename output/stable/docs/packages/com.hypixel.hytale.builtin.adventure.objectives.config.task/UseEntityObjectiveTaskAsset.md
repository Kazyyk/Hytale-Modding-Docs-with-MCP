---
title: "UseEntityObjectiveTaskAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.config.task"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.config.task.UseEntityObjectiveTaskAsset"
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
public class UseEntityObjectiveTaskAsset extends CountObjectiveTaskAsset
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<UseEntityObjectiveTaskAsset>` | `CODEC` |
| `protected` | `String` | `taskId` |
| `protected` | `String` | `animationIdToPlay` |
| `protected` | `UseEntityObjectiveTaskAsset.DialogOptions` | `dialogOptions` |
| `` | `public static BuilderCodec<UseEntityObjectiveTaskAsset.DialogOptions>` | `CODEC` |
| `` | `protected String` | `entityNameKey` |
| `` | `protected String` | `dialogKey` |
| `` | `UseEntityObjectiveTaskAsset.DialogOptions` | `that` |
| `` | `int` | `result` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `UseEntityObjectiveTaskAsset(String descriptionId,
        TaskConditionAsset[] taskConditions,
        Vector3i[] mapMarkers,
        int count,
        String taskId,
        String animationIdToPlay,
        UseEntityObjectiveTaskAsset.DialogOptions dialogOptions)` |
| `protected` | `UseEntityObjectiveTaskAsset()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `ObjectiveTaskAsset.TaskScope` | `getTaskScope()` |
| `` | `public String` | `getTaskId()` |
| `` | `public String` | `getAnimationIdToPlay()` |
| `` | `public UseEntityObjectiveTaskAsset.DialogOptions` | `getDialogOptions()` |
| `protected` | `boolean` | `matchesAsset0(ObjectiveTaskAsset task)` |
| `public` | `String` | `toString()` |
| `` | `public` | `DialogOptions(String entityNameKey, String dialogKey)` |
| `` | `protected` | `DialogOptions()` |
| `` | `public String` | `getEntityNameKey()` |
| `` | `public String` | `getDialogKey()` |
| `` | `public boolean` | `equals(@Nullable Object o)` |
| `` | `public int` | `hashCode()` |
| `` | `public String` | `toString()` |

## Inner Types

- `UseEntityObjectiveTaskAsset.DialogOptions`

## Related Types

- [CountObjectiveTaskAsset](CountObjectiveTaskAsset.md)
- [ObjectiveTaskAsset](ObjectiveTaskAsset.md)
