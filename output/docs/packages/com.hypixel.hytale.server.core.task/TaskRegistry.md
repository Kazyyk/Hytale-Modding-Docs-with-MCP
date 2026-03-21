---
title: "TaskRegistry"
kind: "class"
package: "com.hypixel.hytale.server.core.task"
fqcn: "com.hypixel.hytale.server.core.task.TaskRegistry"
api_surface: true
extends: "Registry"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "server"
  - "core"
  - "task"
---

**Package:** `com.hypixel.hytale.server.core.task`

```java
public class TaskRegistry extends Registry<TaskRegistration>
```

Registry for managing and tracking registered resources.

## Methods

| Method | Returns | Description |
|---|---|---|
| `registerTask(CompletableFuture<Void> task)` | `TaskRegistration` | Instance method. |
| `registerTask(ScheduledFuture<Void> task)` | `TaskRegistration` | Instance method. |
