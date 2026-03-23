---
title: "ParallelRangeTask"
kind: "class"
package: "com.hypixel.hytale.component.task"
fqcn: "com.hypixel.hytale.component.task.ParallelRangeTask"
api_surface: true
extends: "CountedCompleter"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "component"
  - "task"
  - "class"
---

**Package:** `com.hypixel.hytale.component.task`

```java
public class ParallelRangeTask<D> extends CountedCompleter
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `int` | `PARALLELISM` |
| `public static final` | `int` | `TASK_COUNT` |
| `private final` | `ParallelRangeTask.SubTask<D>[]` | `subTasks` |
| `private` | `int` | `size` |
| `public volatile` | `boolean` | `running` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `reinitialize()` |
| `@Nonnull public` | `ParallelRangeTask<D>` | `init(int from, int to)` |
| `public` | `int` | `size()` |
| `public` | `D` | `get(int i)` |
| `public` | `void` | `set(int i, D data)` |
| `@Override public` | `void` | `compute()` |

## Inner Types

- `ParallelRangeTask.SubTask`
