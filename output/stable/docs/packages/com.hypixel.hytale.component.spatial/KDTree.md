---
title: "KDTree"
kind: "class"
package: "com.hypixel.hytale.component.spatial"
fqcn: "com.hypixel.hytale.component.spatial.KDTree"
api_surface: false
extends: "java.lang.Object"
implements:
  - "SpatialStructure<T>"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "ecs"
  - "spatial"
  - "query"
---

**Package:** `com.hypixel.hytale.component.spatial`

```java
public class KDTree<T> implements SpatialStructure<T>
```

A k-d tree implementation for 3D spatial queries on ECS entity data. Supports nearest-neighbor, sphere, cylinder, box, and ordered distance queries. Uses object pooling for nodes and data lists to minimize GC pressure during per-tick rebuilds. The tree is rebuilt from scratch each tick using Morton code-based spatial sorting for cache-friendly construction.
