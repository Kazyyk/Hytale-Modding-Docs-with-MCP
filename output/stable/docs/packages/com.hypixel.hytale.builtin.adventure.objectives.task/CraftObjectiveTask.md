---
title: "CraftObjectiveTask"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.task"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.task.CraftObjectiveTask"
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
public class CraftObjectiveTask extends CountObjectiveTask
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<CraftObjectiveTask>` | `CODEC` |
| `` | `String` | `desiredItemId` |
| `` | `CraftingRecipe` | `recipe` |
| `` | `boolean` | `isOutput` |
| `` | `Ref<EntityStore>` | `ref` |
| `` | `UUIDComponent` | `uuidComponent` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `CraftObjectiveTask(@Nonnull CraftObjectiveTaskAsset asset, int taskSetIndex, int taskIndex)` |
| `protected` | `CraftObjectiveTask()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `CraftObjectiveTaskAsset` | `getAsset()` |
| `protected` | `TransactionRecord[]` | `setup0(@Nonnull Objective objective, @Nonnull World world, @Nonnull Store<EntityStore> store)` |
| `public` | `String` | `toString()` |

## Related Types

- [CountObjectiveTask](CountObjectiveTask.md)
- [ObjectiveTask](ObjectiveTask.md)
