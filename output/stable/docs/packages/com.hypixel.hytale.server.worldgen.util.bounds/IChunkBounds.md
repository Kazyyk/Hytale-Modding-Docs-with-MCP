---
title: "IChunkBounds"
kind: "interface"
package: "com.hypixel.hytale.server.worldgen.util.bounds"
fqcn: "com.hypixel.hytale.server.worldgen.util.bounds.IChunkBounds"
api_surface: true
extends: null
implements: []
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
public interface IChunkBounds
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `int` | `getLowBoundX()` |
| `` | `int` | `getLowBoundZ()` |
| `` | `int` | `getHighBoundX()` |
| `` | `int` | `getHighBoundZ()` |
| `default` | `int` | `getLowBoundX(PrefabRotation rotation)` |
| `default` | `int` | `getLowBoundZ(PrefabRotation rotation)` |
| `default` | `int` | `getHighBoundX(PrefabRotation rotation)` |
| `default` | `int` | `getHighBoundZ(PrefabRotation rotation)` |
| `default` | `boolean` | `intersectsChunk(long chunkIndex)` |
| `default` | `boolean` | `intersectsChunk(int chunkX, int chunkZ)` |
| `default` | `int` | `randomX(Random random)` |
| `default` | `int` | `randomZ(Random random)` |
| `default` | `double` | `fractionX(double d)` |
| `default` | `double` | `fractionZ(double d)` |
| `default` | `int` | `getLowChunkX()` |
| `default` | `int` | `getLowChunkZ()` |
| `default` | `int` | `getHighChunkX()` |
| `default` | `int` | `getHighChunkZ()` |
