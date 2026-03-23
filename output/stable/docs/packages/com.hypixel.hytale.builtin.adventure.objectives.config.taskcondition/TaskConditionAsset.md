---
title: "TaskConditionAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.config.taskcondition"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.config.taskcondition.TaskConditionAsset"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "objectives"
  - "config"
  - "taskcondition"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.config.taskcondition`

```java
public abstract class TaskConditionAsset
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `CodecMapCodec<TaskConditionAsset>` | `CODEC` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `boolean` | `isConditionFulfilled(ComponentAccessor<EntityStore> var1, Ref<EntityStore> var2, Set<UUID> var3)` |
| `public abstract` | `void` | `consumeCondition(ComponentAccessor<EntityStore> var1, Ref<EntityStore> var2, Set<UUID> var3)` |
| `@Override public abstract` | `boolean` | `equals(Object var1)` |
| `@Override public abstract` | `int` | `hashCode()` |
