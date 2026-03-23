---
title: "CoreDataCacheEntry"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.cache"
fqcn: "com.hypixel.hytale.server.worldgen.cache.CoreDataCacheEntry"
api_surface: false
extends: null
implements: ["Function<CoreDataCacheEntry, CoreDataCacheEntry>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "worldgen"
  - "cache"
---

**Package:** `com.hypixel.hytale.server.worldgen.cache`

```java
public class CoreDataCacheEntry implements Function<CoreDataCacheEntry, CoreDataCacheEntry>
```

Mutable cache entry holding zone biome result, interpolated biome count list, height, and height noise values. Uses sentinel values (-1, NEGATIVE_INFINITY) to indicate uncomputed fields.
