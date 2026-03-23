---
title: "BlockIterator"
kind: "class"
package: "com.hypixel.hytale.math.iterator"
fqcn: "com.hypixel.hytale.math.iterator.BlockIterator"
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
public final class BlockIterator
```

Utility class for raycast-style block iteration through 3D voxel space. Uses a DDA (Digital Differential Analyzer) algorithm to walk through all blocks intersected by a ray from an origin point in a given direction. Supports both point-to-point and direction-based iteration with a maximum distance. The callback receives each block's integer coordinates and can terminate early by returning `false`.

## Inner Types

Defines `BlockIteratorProcedure` (functional interface with `apply(int x, int y, int z)`) and `BlockIteratorProcedurePlus1<T>` (variant carrying an extra context parameter).
