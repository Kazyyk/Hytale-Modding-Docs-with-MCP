---
title: "UseEntityObjectiveTask"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.task"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.task.UseEntityObjectiveTask"
api_surface: false
extends: "CountObjectiveTask"
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
public class UseEntityObjectiveTask extends CountObjectiveTask
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<UseEntityObjectiveTask>` | `CODEC` |
| `private static final` | `Message` | `MESSAGE_SERVER_MODULES_OBJECTIVE_TASK_ALREADY_INTERACTED_WITH_NPC` |
| `protected` | `Set<UUID>` | `npcUUIDs` |
| `` | `UUID` | `objectiveUUID` |
| `` | `ObjectiveDataStore` | `objectiveDataStore` |
| `` | `String` | `taskId` |
| `` | `UseEntityObjectiveTaskAsset.DialogOptions` | `dialogOptions` |
| `` | `Player` | `playerComponent` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `UseEntityObjectiveTask(@Nonnull UseEntityObjectiveTaskAsset asset, int taskSetIndex, int taskIndex)` |
| `protected` | `UseEntityObjectiveTask()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `UseEntityObjectiveTaskAsset` | `getAsset()` |
| `protected` | `TransactionRecord[]` | `setup0(@Nonnull Objective objective, @Nonnull World world, @Nonnull Store<EntityStore> store)` |
| `` | `public boolean` | `increaseTaskCompletion(@Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, int qty, @Nonnull Objective objective, @Nonnull PlayerRef playerRef, UUID npcUUID)` |
| `public` | `String` | `toString()` |

## Related Types

- [CountObjectiveTask](CountObjectiveTask.md)
- [ObjectiveTask](ObjectiveTask.md)
