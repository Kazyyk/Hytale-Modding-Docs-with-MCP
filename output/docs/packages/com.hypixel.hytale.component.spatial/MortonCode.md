---
title: "MortonCode"
kind: "class"
package: "com.hypixel.hytale.component.spatial"
fqcn: "com.hypixel.hytale.component.spatial.MortonCode"
api_surface: false
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
public class MortonCode
```

Utility class for computing 3D Morton codes (Z-order curve values). Encodes three double-precision coordinates into a single 63-bit interleaved integer for spatial locality-preserving sorting. Used by `SpatialData.sortMorton()` to order entities before k-d tree construction, improving cache performance.
