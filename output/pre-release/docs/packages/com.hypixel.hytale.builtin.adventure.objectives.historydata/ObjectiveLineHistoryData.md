---
title: "ObjectiveLineHistoryData"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.historydata"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.historydata.ObjectiveLineHistoryData"
api_surface: false
extends: "CommonObjectiveHistoryData"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "adventure"
  - "objectives"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.historydata`

```java
public final class ObjectiveLineHistoryData extends CommonObjectiveHistoryData
```

Concrete implementation extending `CommonObjectiveHistoryData`.

## Fields

| Field | Type | Description |
|---|---|---|
| `objectiveHistoryDataArray` | `ObjectiveHistoryData[]` | ObjectiveHistoryData[] field. |
| `nextObjectiveLineIds` | `String[]` | String[] field. |

## Constructors

| Constructor | Description |
|---|---|
| `ObjectiveLineHistoryData(String id, String category, String[] nextObjectiveLineIds)` | Creates a new ObjectiveLineHistoryData instance. |
| `ObjectiveLineHistoryData()` | Creates a new ObjectiveLineHistoryData instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getObjectiveHistoryDataArray()` | `ObjectiveHistoryData[]` | public method. |
| `getNextObjectiveLineIds()` | `String[]` | public method. |
| `addObjectiveHistoryData(@Nonnull ObjectiveHistoryData objectiveHistoryData)` | `void` | public method. |
| `cloneForPlayers(@Nonnull Set<UUID> playerUUIDs)` | `Map<UUID, ObjectiveLineHistoryData>` | public method. |
| `completed(UUID playerUUID, @Nonnull ObjectiveLineHistoryData objectiveLineHistoryData)` | `void` | public method. |
| `toString()` | `String` | public method. |
