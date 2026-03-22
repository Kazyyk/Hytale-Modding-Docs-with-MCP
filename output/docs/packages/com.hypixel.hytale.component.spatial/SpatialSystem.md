---
title: "SpatialSystem"
kind: "class"
package: "com.hypixel.hytale.component.spatial"
fqcn: "com.hypixel.hytale.component.spatial.SpatialSystem"
api_surface: false
extends: "TickingSystem<ECS_TYPE>"
implements:
  - "QuerySystem<ECS_TYPE>"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "ecs"
  - "spatial"
  - "query"
---

**Package:** `com.hypixel.hytale.component.spatial`

```java
public abstract class SpatialSystem<ECS_TYPE> extends TickingSystem<ECS_TYPE> implements QuerySystem<ECS_TYPE>
```

Abstract ECS system that rebuilds a spatial index each tick. Iterates all entities in the store, extracts positions via the abstract `getPosition()` method, populates the `SpatialData`, and triggers `SpatialStructure.rebuild()`. Subclasses define which component provides the entity position.
