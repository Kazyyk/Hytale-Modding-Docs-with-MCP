---
title: "PathSpatialSystem"
kind: "class"
package: "com.hypixel.hytale.builtin.path"
fqcn: "com.hypixel.hytale.builtin.path.PathSpatialSystem"
api_surface: false
extends: "SpatialSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "path"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.path`

```java
public class PathSpatialSystem extends SpatialSystem<EntityStore>
```

ECS spatial system that indexes `PatrolPathMarkerEntity` positions into a KDTree for efficient nearest-path queries. Queries entities with both the path marker and transform components.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `Query<EntityStore>` | `getQuery()` |
| `@Override public` | `void` | `tick(float dt, int systemIndex, @Nonnull Store<EntityStore> store)` |
| `@Nonnull @Override public` | `Vector3d` | `getPosition(@Nonnull ArchetypeChunk<EntityStore> archetypeChunk, int index)` |
