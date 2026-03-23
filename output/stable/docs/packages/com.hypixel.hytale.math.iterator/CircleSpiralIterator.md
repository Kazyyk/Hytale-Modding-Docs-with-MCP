---
title: "CircleSpiralIterator"
kind: "class"
package: "com.hypixel.hytale.math.iterator"
fqcn: "com.hypixel.hytale.math.iterator.CircleSpiralIterator"
api_surface: false
extends: "java.lang.Object"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "math"
  - "iterator"
  - "spatial"
---

**Package:** `com.hypixel.hytale.math.iterator`

```java
public class CircleSpiralIterator
```

Iterates outward in concentric circles from a center point, visiting all integer coordinate positions from radius 0 to a maximum radius. Combines `CircleIterator` with increasing radii to produce a spiral-like visitation pattern. Used for proximity-ordered chunk loading and entity search.
