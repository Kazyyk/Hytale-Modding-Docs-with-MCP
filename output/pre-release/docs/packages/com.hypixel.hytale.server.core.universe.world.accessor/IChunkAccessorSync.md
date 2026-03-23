---
title: "IChunkAccessorSync"
kind: "interface"
package: "com.hypixel.hytale.server.core.universe.world.accessor"
fqcn: "com.hypixel.hytale.server.core.universe.world.accessor.IChunkAccessorSync"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "world"
  - "chunk"
  - "accessor"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.accessor`

```java
@Deprecated
public interface IChunkAccessorSync<WorldChunk extends BlockAccessor>
```

Deprecated interface for synchronous chunk access across multiple chunks. Provides methods to get chunks by index in various states (in-memory, loaded, non-ticking), and delegates block operations to the appropriate chunk's `BlockAccessor`. Includes `getBaseBlock()` for resolving filler block origins and `TestBlockFunction` for placement testing.

## Inner Types

- `IChunkAccessorSync.TestBlockFunction` -- functional interface for block placement testing