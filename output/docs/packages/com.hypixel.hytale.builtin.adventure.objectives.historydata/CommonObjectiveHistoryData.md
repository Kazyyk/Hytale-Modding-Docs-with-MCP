---
title: "CommonObjectiveHistoryData"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.historydata"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.historydata.CommonObjectiveHistoryData"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "adventure"
  - "objectives"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.historydata`

```java
public abstract class CommonObjectiveHistoryData
```

Class in the historydata subsystem.

## Fields

| Field | Type | Description |
|---|---|---|
| `id` | `String` | String field. |
| `timesCompleted` | `int` | int field. |
| `lastCompletionTimestamp` | `Instant` | Instant field. |
| `category` | `String` | String field. |

## Constructors

| Constructor | Description |
|---|---|
| `CommonObjectiveHistoryData(String id, String category)` | Creates a new CommonObjectiveHistoryData instance. |
| `CommonObjectiveHistoryData()` | Creates a new CommonObjectiveHistoryData instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getId()` | `String` | public method. |
| `getTimesCompleted()` | `int` | public method. |
| `getLastCompletionTimestamp()` | `Instant` | public method. |
| `getCategory()` | `String` | public method. |
| `completed()` | `void` | protected method. |
| `toString()` | `String` | public method. |
