---
title: "KillNPCObjectiveTask"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.npcobjectives.task"
fqcn: "com.hypixel.hytale.builtin.adventure.npcobjectives.task.KillNPCObjectiveTask"
api_surface: false
extends: "KillObjectiveTask"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "npcobjectives"
  - "task"
---

**Package:** `com.hypixel.hytale.builtin.adventure.npcobjectives.task`

```java
public class KillNPCObjectiveTask extends KillObjectiveTask
```

Extends `KillObjectiveTask` to provide KillNPCObjectiveTask functionality.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `KillNPCObjectiveTask(@Nonnull KillObjectiveTaskAsset asset, int taskSetIndex, int taskIndex)` |
| `protected` | | `KillNPCObjectiveTask()` |
| `@Nonnull @Override protected` | `TransactionRecord[]` | `setup0(@Nonnull Objective objective, @Nonnull World world, @Nonnull Store<EntityStore> store)` |
| `@Nonnull @Override public` | `String` | `toString()` |
