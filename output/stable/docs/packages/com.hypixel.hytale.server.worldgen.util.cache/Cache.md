---
title: "Cache"
kind: "interface"
package: "com.hypixel.hytale.server.worldgen.util.cache"
fqcn: "com.hypixel.hytale.server.worldgen.util.cache.Cache"
api_surface: false
extends: "null"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "util"
  - "cache"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.worldgen.util.cache`

```java
public interface Cache<K, V>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `void` | `shutdown()` |
| `` | `void` | `cleanup()` |
| `` | `V` | `get(K var1)` |
