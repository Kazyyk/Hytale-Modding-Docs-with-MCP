---
title: "SimplePathWaypoint"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.path"
fqcn: "com.hypixel.hytale.server.core.universe.world.path.SimplePathWaypoint"
api_surface: true
extends: null
implements: ["IPathWaypoint"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "world"
  - "path"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.path`

```java
public class SimplePathWaypoint implements IPathWaypoint
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `int` | `order` |
| `private` | `Transform` | `transform` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `int` | `getOrder()` |
| `@Nonnull @Override public` | `Vector3d` | `getWaypointPosition(ComponentAccessor<EntityStore> componentAccessor)` |
| `@Nonnull @Override public` | `Vector3f` | `getWaypointRotation(ComponentAccessor<EntityStore> componentAccessor)` |
| `@Override public` | `double` | `getPauseTime()` |
| `@Override public` | `float` | `getObservationAngle()` |
