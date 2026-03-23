---
title: "BlockFilter"
kind: "class"
package: "com.hypixel.hytale.server.core.prefab.selection.mask"
fqcn: "com.hypixel.hytale.server.core.prefab.selection.mask.BlockFilter"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "prefab"
  - "mask"
  - "filter"
---

**Package:** `com.hypixel.hytale.server.core.prefab.selection.mask`

```java
public class BlockFilter
```

Defines a filter condition for block operations. Supports filter types: `TargetBlock`, `AboveBlock`, `BelowBlock`, `AdjacentBlock`, `NeighborBlock`, cardinal directions, diagonals, and `Selection`. Can be inverted. Resolves block names to IDs lazily and supports fluid matching.