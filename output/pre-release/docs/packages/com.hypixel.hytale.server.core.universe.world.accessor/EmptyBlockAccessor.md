---
title: "EmptyBlockAccessor"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.accessor"
fqcn: "com.hypixel.hytale.server.core.universe.world.accessor.EmptyBlockAccessor"
api_surface: false
extends: ~
implements:
  - "BlockAccessor"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "world"
  - "block"
  - "accessor"
  - "empty"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.accessor`

```java
public class EmptyBlockAccessor implements BlockAccessor
```

Singleton `BlockAccessor` implementation that always returns empty/zero values and rejects all write operations. Used as a null-object pattern when no chunk data is available. `getX()`/`getZ()`/`getChunkAccessor()` throw `UnsupportedOperationException`.