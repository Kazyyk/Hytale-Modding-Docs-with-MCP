---
title: "ReachLocationTask"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.task"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.task.ReachLocationTask"
api_surface: false
extends: "ObjectiveTask"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "objectives"
  - "task"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.task`

```java
public class ReachLocationTask extends ObjectiveTask
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<ReachLocationTask>` | `CODEC` |
| `public static` | `String` | `MARKER_ICON` |
| `private static final` | `ComponentType<EntityStore, TransformComponent>` | `TRANSFORM_COMPONENT_TYPE` |
| `private static final` | `ComponentType<EntityStore, ReachLocationMarker>` | `REACH_LOCATION_MARKER_COMPONENT_TYPE` |
| `private` | `boolean` | `completed` |
| `private` | `boolean` | `markerLoaded` |
| `` | `String` | `targetLocationId` |
| `` | `List<Ref<EntityStore>>` | `reachLocationMarkerEntities` |
| `` | `ReachLocationMarker` | `reachLocationMarkerComponent` |
| `` | `Vector3d` | `currentLocation` |
| `` | `Ref<EntityStore>` | `closestMarker` |
| `` | `TransformComponent` | `closestMarkerTransformComponent` |
| `` | `ReachLocationMarker` | `closestMarkerReachComponent` |
| `` | `Vector3d` | `closestPosition` |
| `` | `double` | `shortestDistance` |
| `` | `String` | `closestLocationName` |
| `` | `Ref<EntityStore>` | `markerEntityReference` |
| `` | `TransformComponent` | `markerTransformComponent` |
| `` | `ReachLocationMarker` | `markerReachLocationComponent` |
| `` | `Vector3d` | `pos` |
| `` | `double` | `distance` |
| `` | `String` | `locationName` |
| `` | `ObjectiveTaskMarker` | `marker` |
| `` | `String` | `markerId` |
| `` | `com.hypixel.hytale.protocol.ObjectiveTask` | `packet` |
| `` | `UUIDComponent` | `uuidComponent` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ReachLocationTask(@Nonnull ObjectiveTaskAsset asset, int taskSetIndex, int taskIndex)` |
| `protected` | `ReachLocationTask()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `checkCompletion()` |
| `public` | `ReachLocationTaskAsset` | `getAsset()` |
| `private` | `String` | `getMarkerId(@Nonnull Objective objective)` |
| `protected` | `TransactionRecord[]` | `setup0(@Nonnull Objective objective, @Nonnull World world, @Nonnull Store<EntityStore> store)` |
| `` | `public void` | `setupMarker(@Nonnull Objective objective,
        @Nonnull ReachLocationMarker locationMarkerEntity,
        @Nonnull Vector3d position,
        @Nonnull CommandBuffer<EntityStore> commandBuffer)` |
| `public` | `com.hypixel.hytale.protocol.ObjectiveTask` | `toPacket(@Nonnull Objective objective)` |
| `` | `public void` | `onPlayerReachLocationMarker(@Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull String locationMarkerId, @Nonnull Objective objective)` |
| `public` | `String` | `toString()` |

## Related Types

- [ObjectiveTask](ObjectiveTask.md)
