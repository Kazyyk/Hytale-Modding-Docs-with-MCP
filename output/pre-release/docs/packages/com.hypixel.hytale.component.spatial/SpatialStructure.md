---
title: "SpatialStructure"
kind: "interface"
package: "com.hypixel.hytale.component.spatial"
fqcn: "com.hypixel.hytale.component.spatial.SpatialStructure"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "ecs"
  - "spatial"
  - "query"
---

**Package:** `com.hypixel.hytale.component.spatial`

```java
public interface SpatialStructure<T>
```

Interface for spatial index structures that support spatial queries over ECS entity data. Defines operations for rebuild, nearest-neighbor, sphere, cylinder, box, and distance-ordered queries. The primary implementation is `KDTree`.
