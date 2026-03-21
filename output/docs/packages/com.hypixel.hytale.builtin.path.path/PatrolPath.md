---
title: "PatrolPath"
kind: "class"
package: "com.hypixel.hytale.builtin.path.path"
fqcn: "com.hypixel.hytale.builtin.path.path.PatrolPath"
api_surface: false
extends: ~
implements: 
  - "IPrefabPath"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "pathing"
---

**Package:** `com.hypixel.hytale.builtin.path.path`

```java
public class PatrolPath implements IPrefabPath
```

Implementation of `IPrefabPath`.

## Fields

| Field | Type | Description |
|---|---|---|
| `id` | `UUID` | final UUID field. |
| `name` | `String` | final String field. |
| `worldgenId` | `int` | final int field. |
| `waypointList` | `List<IPrefabPathWaypoint>` | List<IPrefabPathWaypoint> field. |

## Constructors

| Constructor | Description |
|---|---|
| `PatrolPath(int worldgenId, UUID id, String name)` | Creates a new PatrolPath instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getId()` | `UUID` | public method. |
| `getName()` | `String` | public method. |
| `getPathWaypoints()` | `List<IPrefabPathWaypoint>` | public method. |
| `registerNewWaypoint(@Nonnull IPrefabPathWaypoint waypoint, int worldGenId)` | `short` | public method. |
| `registerNewWaypointAt(int index, @Nonnull IPrefabPathWaypoint waypoint, int worldGenId)` | `void` | public method. |
| `addLoadedWaypoint(@Nonnull IPrefabPathWaypoint waypoint, int pathLength, int index, int worldGenId)` | `void` | public method. |
| `removeWaypoint(int index, int worldGenId)` | `void` | public method. |
| `unloadWaypoint(int index)` | `void` | public method. |
| `hasLoadedWaypoints()` | `boolean` | public method. |
| `isFullyLoaded()` | `boolean` | public method. |
| `loadedWaypointCount()` | `int` | public method. |
| `getWorldGenId()` | `int` | public method. |
| `getNearestWaypointPosition(@Nonnull Vector3d origin, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` | `Vector3d` | public method. |
| `mergeInto(@Nonnull IPrefabPath target, int worldGenId, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` | `void` | public method. |
| `compact(int worldGenId)` | `void` | public method. |
| `length()` | `int` | public method. |
| `get(int index)` | `IPrefabPathWaypoint` | public method. |
