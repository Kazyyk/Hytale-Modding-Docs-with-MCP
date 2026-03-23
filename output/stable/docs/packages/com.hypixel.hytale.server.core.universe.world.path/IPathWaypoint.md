---
title: "IPathWaypoint"
kind: "interface"
package: "com.hypixel.hytale.server.core.universe.world.path"
fqcn: "com.hypixel.hytale.server.core.universe.world.path.IPathWaypoint"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "world"
  - "path"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.path`

```java
public interface IPathWaypoint
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `int` | `getOrder()` |
| `` | `Vector3d` | `getWaypointPosition(ComponentAccessor<EntityStore> var1)` |
| `` | `Vector3f` | `getWaypointRotation(ComponentAccessor<EntityStore> var1)` |
| `` | `double` | `getPauseTime()` |
| `` | `float` | `getObservationAngle()` |
