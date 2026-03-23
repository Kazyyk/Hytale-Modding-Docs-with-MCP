---
title: "ParallelTask"
kind: "class"
package: "com.hypixel.hytale.component.task"
fqcn: "com.hypixel.hytale.component.task.ParallelTask"
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
public class ParallelTask<D> extends CountedCompleter
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Supplier<D>` | `supplier` |
| `private` | `ParallelRangeTask<D>[]` | `subTasks` |
| `private` | `int` | `size` |
| `private volatile` | `boolean` | `running` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `reinitialize()` |
| `public` | `void` | `init()` |
| `public` | `ParallelRangeTask<D>` | `appendTask()` |
| `public` | `int` | `size()` |
| `public` | `ParallelRangeTask<D>` | `get(int i)` |
| `@Override public` | `void` | `compute()` |
| `public` | `void` | `doInvoke()` |
