---
title: "KillSpawnBeaconObjectiveTask"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.npcobjectives.task"
fqcn: "com.hypixel.hytale.builtin.adventure.npcobjectives.task.KillSpawnBeaconObjectiveTask"
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
public class KillSpawnBeaconObjectiveTask extends KillObjectiveTask
```

Extends `KillObjectiveTask` to provide KillSpawnBeaconObjectiveTask functionality.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `KillSpawnBeaconObjectiveTask(@Nonnull KillSpawnBeaconObjectiveTaskAsset asset, int taskSetIndex, int taskIndex)` |
| `protected` | | `KillSpawnBeaconObjectiveTask()` |
| `@Nonnull public` | `KillSpawnBeaconObjectiveTaskAsset` | `getAsset()` |
| `@Nonnull @Override protected` | `TransactionRecord[]` | `setup0(@Nonnull Objective objective, @Nonnull World world, @Nonnull Store<EntityStore> store)` |
| `@Nonnull private` | `TransactionRecord[]` | `setupSpawnBeacons(@Nonnull Objective objective, @Nonnull World world, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `@Nonnull @Override public` | `String` | `toString()` |
