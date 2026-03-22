---
title: "IWorldBounds"
kind: "interface"
package: "com.hypixel.hytale.server.worldgen.util.bounds"
fqcn: "com.hypixel.hytale.server.worldgen.util.bounds.IWorldBounds"
api_surface: true
extends: null
implements: ["IChunkBounds"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "util"
  - "bounds"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.worldgen.util.bounds`

```java
public interface IWorldBounds extends IChunkBounds
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `int` | `getLowBoundY()` |
| `` | `int` | `getHighBoundY()` |
| `@Override default` | `boolean` | `intersectsChunk(long chunkIndex)` |
| `default` | `int` | `randomY(Random random)` |
| `default` | `double` | `fractionY(double d)` |
