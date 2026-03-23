---
title: "GatherObjectiveTask"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.task"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.task.GatherObjectiveTask"
api_surface: false
extends: "CountObjectiveTask"
implements: ["InventoryChangeAware"]
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "objectives"
  - "task"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.task`

```java
public class GatherObjectiveTask extends CountObjectiveTask implements InventoryChangeAware
```

Objective task that tracks item-gathering progress. Counts matching items across all participating players' inventories and marks the task as complete when the required count is reached. Implements `InventoryChangeAware` so `ObjectiveInventoryChangeSystem` can notify it of inventory changes in real time.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public static final` | `BuilderCodec<GatherObjectiveTask>` | `CODEC` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `GatherObjectiveTask(@Nonnull GatherObjectiveTaskAsset asset, int taskSetIndex, int taskIndex)` |
| `protected` | `GatherObjectiveTask()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `GatherObjectiveTaskAsset` | `getAsset()` |
| `@Nullable @Override protected` | `TransactionRecord[]` | `setup0(@Nonnull Objective objective, @Nonnull World world, @Nonnull Store<EntityStore> store)` |
| `@Override public` | `void` | `onInventoryChange(@Nonnull Objective objective, @Nonnull Ref<EntityStore> playerRef, @Nonnull Store<EntityStore> store, @Nonnull InventoryChangeEvent event)` |
| `private` | `int` | `countObjectiveItemInInventories(@Nonnull Set<UUID> participatingPlayers, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `@Nonnull @Override public` | `String` | `toString()` |

## Behavior

- `setup0` counts matching items in all participating players' inventories at task creation time. If the required count is already met, the task completes immediately.
- `onInventoryChange` recounts items across active players' inventories and updates the task completion state via `setTaskCompletion`.
- `countObjectiveItemInInventories` iterates each player's combined hotbar-first inventory and counts stacks matching the asset's `BlockTagOrItemIdField`.

## Related Types

- [CountObjectiveTask](CountObjectiveTask.md) -- base class providing count tracking
- [InventoryChangeAware](InventoryChangeAware.md) -- the interface this task implements
- [ObjectiveTask](ObjectiveTask.md) -- root task type
