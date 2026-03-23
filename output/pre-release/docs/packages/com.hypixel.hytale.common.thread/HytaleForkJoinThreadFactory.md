---
title: "HytaleForkJoinThreadFactory"
kind: "class"
package: "com.hypixel.hytale.common.thread"
fqcn: "com.hypixel.hytale.common.thread.HytaleForkJoinThreadFactory"
api_surface: false
extends: "ForkJoinWorkerThread"
implements: ['ForkJoinWorkerThreadFactory']
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "common"
  - "thread"
---

**Package:** `com.hypixel.hytale.common.thread`

```java
public class HytaleForkJoinThreadFactory implements ForkJoinWorkerThreadFactory
```

Utility type in the `thread` subsystem.

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getInitStack()` | `StackTraceElement[]` | Accessor method. |

## Methods

| Method | Returns | Description |
|---|---|---|
| `newThread(ForkJoinPool pool)` | `ForkJoinWorkerThread` | Instance method. |
