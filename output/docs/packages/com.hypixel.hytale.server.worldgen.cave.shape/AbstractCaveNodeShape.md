---
title: "AbstractCaveNodeShape"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.cave.shape"
fqcn: "com.hypixel.hytale.server.worldgen.cave.shape.AbstractCaveNodeShape"
api_surface: false
extends: ~
implements:
  - "CaveNodeShape"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "worldgen"
  - "cave"
  - "shape"
---

**Package:** `com.hypixel.hytale.server.worldgen.cave.shape`

```java
public abstract class AbstractCaveNodeShape implements CaveNodeShape
```

Base implementation of [CaveNodeShape](CaveNodeShape.md) providing the standard `populateChunk` algorithm. Iterates over all blocks within the shape bounds intersected with the chunk, tests `shouldReplace` for each position, applies the cave type's block mask, sets filling blocks and fluids, places covers (floor/ceiling decorations), and invalidates orphaned cover blocks.
