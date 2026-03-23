---
title: "InventoryChangeAware"
kind: "interface"
package: "com.hypixel.hytale.builtin.adventure.objectives.task"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.task.InventoryChangeAware"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "objectives"
  - "task"
  - "interface"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.task`

```java
public interface InventoryChangeAware
```

Marker interface for objective tasks that need to react to player inventory changes. Implemented by task types that track item counts (e.g., `GatherObjectiveTask`). The `ObjectiveInventoryChangeSystem` invokes `onInventoryChange` on tasks that implement this interface whenever an `InventoryChangeEvent` fires for a player with active objectives.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `void` | `onInventoryChange(@Nonnull Objective var1, @Nonnull Ref<EntityStore> var2, @Nonnull Store<EntityStore> var3, @Nonnull InventoryChangeEvent var4)` |

## Known Implementations

- [GatherObjectiveTask](GatherObjectiveTask.md) -- recounts objective items across all participating player inventories on each change

## Related Types

- [ObjectiveInventoryChangeSystem](../com.hypixel.hytale.builtin.adventure.objectives.systems/ObjectiveInventoryChangeSystem.md) -- the system that dispatches to this interface
