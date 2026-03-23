---
title: "ObjectiveHistoryData"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.historydata"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.historydata.ObjectiveHistoryData"
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
public final class ObjectiveHistoryData extends CommonObjectiveHistoryData
```

Concrete implementation extending `CommonObjectiveHistoryData`.

## Fields

| Field | Type | Description |
|---|---|---|
| `rewards` | `ObjectiveRewardHistoryData[]` | ObjectiveRewardHistoryData[] field. |

## Constructors

| Constructor | Description |
|---|---|
| `ObjectiveHistoryData(String id, String category)` | Creates a new ObjectiveHistoryData instance. |
| `ObjectiveHistoryData(String id, String category, ObjectiveRewardHistoryData[] rewards)` | Creates a new ObjectiveHistoryData instance. |
| `ObjectiveHistoryData()` | Creates a new ObjectiveHistoryData instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getRewards()` | `ObjectiveRewardHistoryData[]` | public method. |
| `addRewardForPlayerUUID(UUID playerUUID, ObjectiveRewardHistoryData objectiveRewardHistoryData)` | `void` | public method. |
| `cloneForPlayer(UUID playerUUID)` | `ObjectiveHistoryData` | public method. |
| `completed(UUID playerUUID, @Nonnull ObjectiveHistoryData objectiveHistoryData)` | `void` | public method. |
| `toString()` | `String` | public method. |
