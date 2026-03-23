---
title: "BlockAccessor"
kind: "interface"
package: "com.hypixel.hytale.server.core.universe.world.accessor"
fqcn: "com.hypixel.hytale.server.core.universe.world.accessor.BlockAccessor"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "world"
  - "block"
  - "accessor"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.accessor`

```java
public interface BlockAccessor
```

Interface for reading and writing block data within a single chunk. Provides methods for getting/setting blocks by ID or `BlockType`, breaking blocks, testing placement validity, querying block types, managing ticking state, accessing fluid/support/filler/rotation data, and setting block interaction states. Default methods provide convenient overloads for common operations.