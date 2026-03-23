---
title: "SensorEntityPrioritiserAttitude.AttitudePrioritiser"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity.prioritisers"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.prioritisers.SensorEntityPrioritiserAttitude.AttitudePrioritiser"
api_surface: false
implements:
  - "IEntityByPriorityFilter"
generator_version: "2.0.0"
generated_at: "2026-03-22T00:00:00Z"
tags:
  - "npc"
  - "entity-prioritiser"
  - "attitude"
  - "inner-class"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.entity.prioritisers`

```java
public static class SensorEntityPrioritiserAttitude.AttitudePrioritiser implements IEntityByPriorityFilter
```

Inner class of `SensorEntityPrioritiserAttitude` that filters and prioritises entities by attitude during sensor entity collection. Tracks the highest-priority entity seen so far, allowing early termination when the top priority (index 0) is found.

## Constructor

```java
public AttitudePrioritiser(int[] attitudeToPriority)
```

## Fields

| Field | Type | Description |
|---|---|---|
| `attitudeToPriority` | `int[]` | Maps attitude ordinal to priority index (lower = higher priority). |
| `highestPriorityTarget` | `Ref<EntityStore>` | The best target found so far. |
| `highestPriorityIndex` | `int` | The best priority index seen (initialized to `Integer.MAX_VALUE`). |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `init(Role)` | `void` | Caches the `WorldSupport` from the role for attitude lookups. |
| `test(Ref<EntityStore>, Ref<EntityStore>, ComponentAccessor<EntityStore>)` | `boolean` | Evaluates a target's attitude priority; returns `true` (stop iterating) if top priority is reached. |
| `getHighestPriorityTarget()` | `Ref<EntityStore>` | Returns the highest-priority target found. |
| `cleanup()` | `void` | Resets all state for reuse. |
