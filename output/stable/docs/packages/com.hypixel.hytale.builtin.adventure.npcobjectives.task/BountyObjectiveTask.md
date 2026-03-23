---
title: "BountyObjectiveTask"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.npcobjectives.task"
fqcn: "com.hypixel.hytale.builtin.adventure.npcobjectives.task.BountyObjectiveTask"
api_surface: false
extends: "ObjectiveTask"
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
public class BountyObjectiveTask extends ObjectiveTask implements KillTask
```

Extends `ObjectiveTask` to provide BountyObjectiveTask functionality.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `@Nonnull private static final` | `HytaleLogger` | `LOGGER` | `HytaleLogger.forEnclosingClass()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `BountyObjectiveTask(@Nonnull ObjectiveTaskAsset asset, int taskSetIndex, int taskIndex)` |
| `protected` | | `BountyObjectiveTask()` |
| `@Nonnull public` | `BountyObjectiveTaskAsset` | `getAsset()` |
| `@Nullable @Override protected` | `TransactionRecord[]` | `setup0(@Nonnull Objective objective, @Nonnull World world, @Nonnull Store<EntityStore> store)` |
| `@Override public` | `boolean` | `checkCompletion()` |
| `@Nonnull public static` | `String` | `getBountyMarkerIDFromUUID(@Nonnull UUID uuid)` |
| `@Override public` | `void` | `checkKilledEntity(@Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> npcRef, @Nonnull Objective objective, @Nonnull NPCEntity npc, @Nonnull Damage damageInfo)` |
| `@Nonnull public` | `com.hypixel.hytale.protocol.ObjectiveTask` | `toPacket(@Nonnull Objective objective)` |
| `@Nonnull @Override public` | `String` | `toString()` |
