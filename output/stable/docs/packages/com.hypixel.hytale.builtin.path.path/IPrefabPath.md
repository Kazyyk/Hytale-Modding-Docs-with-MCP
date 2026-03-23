---
title: "IPrefabPath"
kind: "interface"
package: "com.hypixel.hytale.builtin.path.path"
fqcn: "com.hypixel.hytale.builtin.path.path.IPrefabPath"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "pathing"
---

**Package:** `com.hypixel.hytale.builtin.path.path`

```java
public interface IPrefabPath extends IPath<IPrefabPathWaypoint>
```

Interface defining: `registerNewWaypoint()`, `registerNewWaypointAt()`, `addLoadedWaypoint()`, `removeWaypoint()`....

## Methods

| Method | Return Type | Description |
|---|---|---|
| `registerNewWaypoint(@Nonnull IPrefabPathWaypoint var1, int var2)` | `short` | package-private method. |
| `registerNewWaypointAt(int var1, @Nonnull IPrefabPathWaypoint var2, int var3)` | `void` | package-private method. |
| `addLoadedWaypoint(@Nonnull IPrefabPathWaypoint var1, int var2, int var3, int var4)` | `void` | package-private method. |
| `removeWaypoint(int var1, int var2)` | `void` | package-private method. |
| `unloadWaypoint(int var1)` | `void` | package-private method. |
| `hasLoadedWaypoints()` | `boolean` | package-private method. |
| `isFullyLoaded()` | `boolean` | package-private method. |
| `loadedWaypointCount()` | `int` | package-private method. |
| `getWorldGenId()` | `int` | package-private method. |
| `getNearestWaypointPosition(@Nonnull Vector3d var1, @Nonnull ComponentAccessor<EntityStore> var2)` | `Vector3d` | package-private method. |
| `mergeInto(@Nonnull IPrefabPath var1, int var2, @Nonnull ComponentAccessor<EntityStore> var3)` | `void` | package-private method. |
| `compact(int var1)` | `void` | package-private method. |
