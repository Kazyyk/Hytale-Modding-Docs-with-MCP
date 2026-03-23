---
title: "IWorldBounds"
kind: "interface"
package: "com.hypixel.hytale.server.worldgen.util.bounds"
fqcn: "com.hypixel.hytale.server.worldgen.util.bounds.IWorldBounds"
api_surface: true
extends: null
implements:
  - "com.hypixel.hytale.server.worldgen.util.bounds.IChunkBounds"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:30:09Z"
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

Interface extending `IChunkBounds` with vertical bounds. Adds `getLowBoundY()` and `getHighBoundY()` methods. Provides default methods for random Y coordinate generation, fractional Y interpolation, chunk intersection, and validity checking.
