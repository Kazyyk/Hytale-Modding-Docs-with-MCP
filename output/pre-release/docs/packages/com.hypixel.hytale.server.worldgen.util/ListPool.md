---
title: "ListPool"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.util"
fqcn: "com.hypixel.hytale.server.worldgen.util.ListPool"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:30:09Z"
tags:
  - "server"
  - "worldgen"
  - "util"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.util`

```java
public class ListPool<T>
```

Thread-safe object pool for reusable `ObjectArrayList` instances. Pre-allocates a configurable number of `Resource` objects backed by a `ConcurrentLinkedQueue`. Acquire returns a pooled list or creates a new one; release returns it to the pool if below capacity.
