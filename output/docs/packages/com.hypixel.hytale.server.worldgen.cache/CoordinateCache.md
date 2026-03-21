---
title: "CoordinateCache"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.cache"
fqcn: "com.hypixel.hytale.server.worldgen.cache.CoordinateCache"
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
public class CoordinateCache
```

Abstract base for seed+coordinate-keyed caches. Uses `SizedTimeoutCache` with object pooling for keys. Subclasses implement `compute()` for cache miss loading and `onRemoval()` for cleanup.
