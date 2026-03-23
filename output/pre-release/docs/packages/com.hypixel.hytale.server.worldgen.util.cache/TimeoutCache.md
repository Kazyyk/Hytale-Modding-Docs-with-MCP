---
title: "TimeoutCache"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.util.cache"
fqcn: "com.hypixel.hytale.server.worldgen.util.cache.TimeoutCache"
api_surface: false
extends: "null"
implements: ["Cache<K, V>"]
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
public class TimeoutCache<K, V> implements Cache<K, V>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Map<K, TimeoutCache.CacheEntry<V>>` | `map` |
| `private final` | `long` | `timeout` |
| `private final` | `Function<K, V>` | `func` |
| `private final` | `BiConsumer<K, V>` | `destroyer` |
| `private final` | `ScheduledFuture<?>` | `future` |
| `private final` | `Cleanable` | `cleanable` |
| `` | `long` | `expire` |
| `` | `TimeoutCache.CacheEntry<V>` | `cacheEntry` |
| `` | `K` | `key` |
| `` | `Iterator<Entry<K, TimeoutCache.CacheEntry<V>>>` | `iterator` |
| `` | `Entry<K, TimeoutCache.CacheEntry<V>>` | `entry` |
| `` | `private final V` | `value` |
| `` | `private long` | `timestamp` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `TimeoutCache(long expire, @Nonnull TimeUnit unit, @Nonnull Function<K, V> func, @Nullable BiConsumer<K, V> destroyer)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `cleanup()` |
| `public` | `void` | `shutdown()` |
| `public` | `V` | `get(K key)` |
| `` | `throw new` | `IllegalStateException("Cache has been shutdown!")` |
| `` | `public` | `CacheEntry(V value)` |

## Inner Types

- `TimeoutCache.CacheEntry`

## Related Types

- [Cache](Cache.md)
- [CleanupFutureAction](CleanupFutureAction.md)
- [CleanupRunnable](CleanupRunnable.md)
