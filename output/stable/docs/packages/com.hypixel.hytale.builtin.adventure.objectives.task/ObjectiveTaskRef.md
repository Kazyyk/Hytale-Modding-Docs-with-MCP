---
title: "ObjectiveTaskRef"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.task"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.task.ObjectiveTaskRef"
api_surface: false
extends: "ObjectiveTask>"
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
public class ObjectiveTaskRef<T extends ObjectiveTask>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `UUID` | `objectiveUUID` |
| `private final` | `T` | `objectiveTask` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ObjectiveTaskRef(UUID objectiveUUID, T objectiveTask)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public UUID` | `getObjectiveUUID()` |
| `` | `public T` | `getObjectiveTask()` |

## Related Types

- [ObjectiveTask](ObjectiveTask.md)
