---
title: "BoxBlockIterator"
kind: "class"
package: "com.hypixel.hytale.math.iterator"
fqcn: "com.hypixel.hytale.math.iterator.BoxBlockIterator"
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
public class BoxBlockIterator
```

Iterates over all block positions within an axis-aligned bounding box defined by integer min/max coordinates. Visits blocks in Y-Z-X order (inner loop is X). Implements `Iterator<Vector3i>` for standard Java iteration and provides a bulk `forEach` method with a callback.
