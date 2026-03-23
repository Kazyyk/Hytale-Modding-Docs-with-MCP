---
title: "ChunkGeneratorCache"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.cache"
fqcn: "com.hypixel.hytale.server.worldgen.cache.ChunkGeneratorCache"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "worldgen"
  - "cache"
---

**Package:** `com.hypixel.hytale.server.worldgen.cache`

```java
public class ChunkGeneratorCache
```

Primary cache for chunk generation core data. Stores `ZoneBiomeResult`, interpolated biome counts, height values, and height noise. Provides lazy computation of biome counts and heights on cache hits.
