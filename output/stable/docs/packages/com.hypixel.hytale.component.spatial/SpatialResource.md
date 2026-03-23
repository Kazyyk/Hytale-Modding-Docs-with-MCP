---
title: "SpatialResource"
kind: "class"
package: "com.hypixel.hytale.component.spatial"
fqcn: "com.hypixel.hytale.component.spatial.SpatialResource"
api_surface: true
extends: "java.lang.Object"
implements:
  - "Resource<ECS_TYPE>"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "ecs"
  - "spatial"
  - "query"
---

**Package:** `com.hypixel.hytale.component.spatial`

```java
public class SpatialResource<T, ECS_TYPE> implements Resource<ECS_TYPE>
```

ECS resource that holds the `SpatialData` and `SpatialStructure` for a given store type. Provides thread-local reference lists for efficient query result collection. Registered as a per-store singleton resource and rebuilt each tick by `SpatialSystem`.
