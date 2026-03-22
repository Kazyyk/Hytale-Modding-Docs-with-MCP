---
title: "GatherObjectiveTask"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.task"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.task.GatherObjectiveTask"
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
public class GatherObjectiveTask extends CountObjectiveTask
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<GatherObjectiveTask>` | `CODEC` |
| `` | `Set<UUID>` | `participatingPlayers` |
| `` | `int` | `countItem` |
| `` | `LivingEntity` | `livingEntity` |
| `` | `Ref<EntityStore>` | `ref` |
| `` | `World` | `refWorld` |
| `` | `UUIDComponent` | `uuidComponent` |
| `` | `Set<UUID>` | `activePlayerUUIDs` |
| `` | `int` | `count` |
| `` | `BlockTagOrItemIdField` | `blockTypeOrSet` |
| `` | `PlayerRef` | `playerRefComponent` |
| `` | `Ref<EntityStore>` | `playerRef` |
| `` | `Player` | `playerComponent` |
| `` | `CombinedItemContainer` | `inventory` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `GatherObjectiveTask(@Nonnull GatherObjectiveTaskAsset asset, int taskSetIndex, int taskIndex)` |
| `protected` | `GatherObjectiveTask()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `GatherObjectiveTaskAsset` | `getAsset()` |
| `protected` | `TransactionRecord[]` | `setup0(@Nonnull Objective objective, @Nonnull World world, @Nonnull Store<EntityStore> store)` |
| `` | `private int` | `countObjectiveItemInInventories(@Nonnull Set<UUID> participatingPlayers, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `String` | `toString()` |

## Related Types

- [CountObjectiveTask](CountObjectiveTask.md)
- [ObjectiveTask](ObjectiveTask.md)
