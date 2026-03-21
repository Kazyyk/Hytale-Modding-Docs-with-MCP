---
title: "CleanupRunnable"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.util.cache"
fqcn: "com.hypixel.hytale.server.worldgen.util.cache.CleanupRunnable"
api_surface: false
extends: "null"
implements: ["Runnable"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "util"
  - "cache"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.util.cache`

```java
public class CleanupRunnable<K, V> implements Runnable
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `HytaleLogger` | `LOGGER` |
| `private final` | `WeakReference<Cache<K, V>>` | `reference` |
| `` | `Cache<K, V>` | `cache` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `CleanupRunnable(WeakReference<Cache<K, V>> reference)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `run()` |

## Related Types

- [Cache](Cache.md)
