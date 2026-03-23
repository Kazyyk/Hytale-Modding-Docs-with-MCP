---
title: "ListPool.Resource"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.util"
fqcn: "com.hypixel.hytale.server.worldgen.util.ListPool.Resource"
api_surface: true
extends: "it.unimi.dsi.fastutil.objects.ObjectArrayList"
implements:
  - "java.lang.AutoCloseable"
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
public static class Resource<T> extends ObjectArrayList<T> implements AutoCloseable
```

Inner class of `ListPool`. An `ObjectArrayList` that implements `AutoCloseable` for use in try-with-resources blocks. On close, returns itself to the parent pool. The `toArray()` method uses the pool's empty array prototype for type safety.
