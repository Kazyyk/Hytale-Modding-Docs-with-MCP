---
title: "SpiralIterator"
kind: "class"
package: "com.hypixel.hytale.math.iterator"
fqcn: "com.hypixel.hytale.math.iterator.SpiralIterator"
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
public class SpiralIterator
```

Iterates over 2D integer coordinate positions in an outward rectangular spiral pattern from the origin. Visits positions in the order: right, down, left, up, expanding the spiral at each revolution. Used for chunk loading priority ordering and breadth-first spatial exploration.
