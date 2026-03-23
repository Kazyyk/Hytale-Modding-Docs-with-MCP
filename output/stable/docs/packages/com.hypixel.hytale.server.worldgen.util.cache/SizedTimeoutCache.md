---
title: "SizedTimeoutCache"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.util.cache"
fqcn: "com.hypixel.hytale.server.worldgen.util.cache.SizedTimeoutCache"
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
public class SizedTimeoutCache<K, V> implements Cache<K, V>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `ArrayDeque<SizedTimeoutCache.CacheEntry<K, V>>` | `pool` |
| `private final` | `Object2ObjectLinkedOpenHashMap<K, SizedTimeoutCache.CacheEntry<K, V>>` | `map` |
| `private final` | `long` | `timeout` |
| `private final` | `int` | `maxSize` |
| `private final` | `Function<K, V>` | `func` |
| `private final` | `BiConsumer<K, V>` | `destroyer` |
| `private final` | `ScheduledFuture<?>` | `future` |
| `private final` | `Cleanable` | `cleanable` |
| `` | `long` | `expire` |
| `` | `K` | `key` |
| `` | `V` | `value` |
| `` | `SizedTimeoutCache.CacheEntry<K, V>` | `entry` |
| `` | `break` | `label37` |
| `` | `long` | `timestamp` |
| `` | `SizedTimeoutCache.CacheEntry<K, V>` | `resultEntry` |
| `` | `V` | `resultValue` |
| `` | `SizedTimeoutCache.CacheEntry<K, V>` | `newEntry` |
| `` | `SizedTimeoutCache.CacheEntry<K, V>` | `oldEntry` |
| `` | `K` | `newKey` |
| `` | `private V` | `value` |
| `` | `private K` | `key` |
| `` | `private long` | `timestamp` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `SizedTimeoutCache(long expire, @Nonnull TimeUnit unit, int maxSize, @Nullable Function<K, V> func, @Nullable BiConsumer<K, V> destroyer)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `cleanup()` |
| `` | `private void` | `reduceLength(int targetSize)` |
| `public` | `void` | `shutdown()` |
| `public` | `V` | `get(K key)` |
| `` | `throw new` | `IllegalStateException("Cache has been shutdown!")` |
| `` | `public void` | `put(K key, V value)` |
| `public` | `V` | `getWithReusedKey(K reusedKey, @Nonnull Function<K, K> keyPool)` |

## Inner Types

- `SizedTimeoutCache.CacheEntry`

## Related Types

- [Cache](Cache.md)
- [CleanupFutureAction](CleanupFutureAction.md)
- [CleanupRunnable](CleanupRunnable.md)
- [TimeoutCache](TimeoutCache.md)
