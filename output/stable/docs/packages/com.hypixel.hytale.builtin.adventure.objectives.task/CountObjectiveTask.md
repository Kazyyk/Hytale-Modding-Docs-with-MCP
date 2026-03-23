---
title: "CountObjectiveTask"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.task"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.task.CountObjectiveTask"
api_surface: false
extends: "ObjectiveTask"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "objectives"
  - "task"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.task`

```java
public abstract class CountObjectiveTask extends ObjectiveTask
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<CountObjectiveTask>` | `CODEC` |
| `protected` | `int` | `count` |
| `` | `com.hypixel.hytale.protocol.ObjectiveTask` | `packet` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `CountObjectiveTask(@Nonnull CountObjectiveTaskAsset asset, int taskSetIndex, int taskIndex)` |
| `protected` | `CountObjectiveTask()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `CountObjectiveTaskAsset` | `getAsset()` |
| `public` | `boolean` | `checkCompletion()` |
| `public` | `void` | `assetChanged(@Nonnull Objective objective)` |
| `` | `public void` | `increaseTaskCompletion(@Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, int qty, @Nonnull Objective objective)` |
| `` | `public void` | `setTaskCompletion(@Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, int qty, @Nonnull Objective objective)` |
| `` | `private void` | `updateTaskCompletion(@Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull Objective objective)` |
| `public` | `com.hypixel.hytale.protocol.ObjectiveTask` | `toPacket(@Nonnull Objective objective)` |

## Related Types

- [ObjectiveTask](ObjectiveTask.md)
