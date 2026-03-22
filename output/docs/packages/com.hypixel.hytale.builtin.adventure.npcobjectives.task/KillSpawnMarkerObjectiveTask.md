---
title: "KillSpawnMarkerObjectiveTask"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.npcobjectives.task"
fqcn: "com.hypixel.hytale.builtin.adventure.npcobjectives.task.KillSpawnMarkerObjectiveTask"
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
public class KillSpawnMarkerObjectiveTask extends KillObjectiveTask
```

Extends `KillObjectiveTask` to provide KillSpawnMarkerObjectiveTask functionality.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `private static final` | `ComponentType<EntityStore, SpawnMarkerEntity>` | `SPAWN_MARKER_COMPONENT_TYPE` | `SpawnMarkerEntity.getComponentType()` |
| `@Nonnull private static final` | `ComponentType<EntityStore, TransformComponent>` | `TRANSFORM_COMPONENT_TYPE` | `TransformComponent.getComponentType()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `KillSpawnMarkerObjectiveTask(@Nonnull KillSpawnMarkerObjectiveTaskAsset asset, int taskSetIndex, int taskIndex)` |
| `protected` | | `KillSpawnMarkerObjectiveTask()` |
| `@Nonnull public` | `KillSpawnMarkerObjectiveTaskAsset` | `getAsset()` |
| `@Nonnull @Override protected` | `TransactionRecord[]` | `setup0(@Nonnull Objective objective, @Nonnull World world, @Nonnull Store<EntityStore> store)` |
| `@Nonnull @Override public` | `String` | `toString()` |
