---
title: "UseBlockObjectiveTask"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.task"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.task.UseBlockObjectiveTask"
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
public class UseBlockObjectiveTask extends CountObjectiveTask
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<UseBlockObjectiveTask>` | `CODEC` |
| `` | `BlockType` | `blockType` |
| `` | `String` | `baseItem` |
| `` | `Ref<EntityStore>` | `entityRef` |
| `` | `Store<EntityStore>` | `entityStore` |
| `` | `Player` | `playerComponent` |
| `` | `UUIDComponent` | `uuidComponent` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `UseBlockObjectiveTask(@Nonnull UseBlockObjectiveTaskAsset asset, int taskSetIndex, int taskIndex)` |
| `protected` | `UseBlockObjectiveTask()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `UseBlockObjectiveTaskAsset` | `getAsset()` |
| `protected` | `TransactionRecord[]` | `setup0(@Nonnull Objective objective, @Nonnull World world, @Nonnull Store<EntityStore> store)` |
| `public` | `String` | `toString()` |

## Related Types

- [CountObjectiveTask](CountObjectiveTask.md)
- [ObjectiveTask](ObjectiveTask.md)
