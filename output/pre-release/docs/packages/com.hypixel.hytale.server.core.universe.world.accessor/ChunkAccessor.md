---
title: "ChunkAccessor"
kind: "interface"
package: "com.hypixel.hytale.server.core.universe.world.accessor"
fqcn: "com.hypixel.hytale.server.core.universe.world.accessor.ChunkAccessor"
api_surface: true
extends: "BlockAccessor> extends IChunkAccessorSync<WorldChunk>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "world"
  - "accessor"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.accessor`

```java
public interface ChunkAccessor<WorldChunk extends BlockAccessor> extends IChunkAccessorSync<WorldChunk>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `int` | `getFluidId(int x, int y, int z)` |
| `` | `boolean` | `performBlockUpdate(int x, int y, int z)` |
| `` | `boolean` | `performBlockUpdate(int x, int y, int z, boolean allowPartialLoad)` |
