---
title: "BlockOperations"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.BlockOperations"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "world"
  - "chunk"
  - "block"
  - "operations"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.chunk`

```java
public class BlockOperations
```

Utility class for chunk-level block operations. Provides static methods for updating ticking state of block areas based on bounding boxes, updating height maps when blocks change, and spawning block particle effects (build, break, physics) via the world notification handler.