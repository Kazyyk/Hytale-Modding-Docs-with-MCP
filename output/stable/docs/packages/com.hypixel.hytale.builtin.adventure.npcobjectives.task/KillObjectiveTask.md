---
title: "KillObjectiveTask"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.npcobjectives.task"
fqcn: "com.hypixel.hytale.builtin.adventure.npcobjectives.task.KillObjectiveTask"
api_surface: false
extends: "CountObjectiveTask"
implements: ["KillTask"]
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
public abstract class KillObjectiveTask extends CountObjectiveTask implements KillTask
```

Abstract base class extending `CountObjectiveTask` that provides shared logic for KillObjectiveTask subclasses.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `@Nonnull public static final` | `BuilderCodec<KillObjectiveTask>` | `CODEC` | `BuilderCodec.abstractBuilder(KillObjectiveTask.class, CountObjectiveTask.CODEC).build()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `KillObjectiveTask(@Nonnull KillObjectiveTaskAsset asset, int taskSetIndex, int taskIndex)` |
| `protected` | | `KillObjectiveTask()` |
| `@Nonnull public` | `KillObjectiveTaskAsset` | `getAsset()` |
| `@Override public` | `void` | `checkKilledEntity(@Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> npcRef, @Nonnull Objective objective, @Nonnull NPCEntity npc, @Nonnull Damage info)` |
