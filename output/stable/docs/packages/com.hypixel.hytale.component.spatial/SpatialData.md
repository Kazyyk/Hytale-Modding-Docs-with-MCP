---
title: "SpatialData"
kind: "class"
package: "com.hypixel.hytale.component.spatial"
fqcn: "com.hypixel.hytale.component.spatial.SpatialData"
api_surface: true
extends: "java.lang.Object"
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
public class SpatialData<T>
```

Growable parallel-array storage for spatial entity data. Maintains aligned arrays of positions (`Vector3d`), data references, sort indices, and Morton codes. Supports both standard axis-based sorting and Morton code-based sorting for cache-friendly spatial queries. Used as the input for `SpatialStructure.rebuild()`.
