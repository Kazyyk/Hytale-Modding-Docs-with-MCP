---
title: "ConcurrentSizedTimeoutCache"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.util.cache"
fqcn: "com.hypixel.hytale.server.worldgen.util.cache.ConcurrentSizedTimeoutCache"
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
public class ConcurrentSizedTimeoutCache<K, V> implements Cache<K, V>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `int` | `BUCKET_MIN_CAPACITY` |
| `private static final` | `float` | `BUCKET_LOAD_FACTOR` |
| `private final` | `int` | `bucketMask` |
| `private final` | `ConcurrentSizedTimeoutCache.Bucket<K, V>[]` | `buckets` |
| `private final` | `Function<K, K>` | `computeKey` |
| `private final` | `Function<K, V>` | `computeValue` |
| `private final` | `BiConsumer<K, V>` | `destroyer` |
| `private final` | `ScheduledFuture<?>` | `future` |
| `private final` | `Cleanable` | `cleanable` |
| `` | `long` | `timeout_ns` |
| `` | `int` | `bucketCount` |
| `` | `int` | `bucketCapacity` |
| `` | `int` | `hash` |
| `` | `private final int` | `capacity` |
| `` | `private final int` | `trimThreshold` |
| `` | `private final long` | `timeout_ns` |
| `` | `private final ArrayDeque<ConcurrentSizedTimeoutCache.CacheEntry<K, V>>` | `pool` |
| `` | `private final Object2ObjectOpenHashMap<K, ConcurrentSizedTimeoutCache.CacheEntry<K, V>>` | `map` |
| `` | `private final StampedLock` | `lock` |
| `` | `long` | `timestamp` |
| `` | `long` | `readStamp` |
| `` | `ConcurrentSizedTimeoutCache.CacheEntry<K, V>` | `entry` |
| `` | `Object` | `var23` |
| `` | `V` | `newValue` |
| `` | `Object` | `resultValue` |
| `` | `long` | `writeStamp` |
| `` | `ConcurrentSizedTimeoutCache.CacheEntry<K, V>` | `newEntry` |
| `` | `ConcurrentSizedTimeoutCache.CacheEntry<K, V>` | `currentEntry` |
| `` | `boolean` | `needsTrim` |
| `` | `long` | `expireTimestamp` |
| `` | `ObjectIterator<Entry<K, ConcurrentSizedTimeoutCache.CacheEntry<K, V>>>` | `it` |
| `` | `private static final VarHandle` | `TIMESTAMP` |
| `` | `public K` | `key` |
| `` | `public V` | `value` |
| `` | `public long` | `timestamp` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ConcurrentSizedTimeoutCache(int capacity,
        int concurrencyLevel,
        long timeout,
        @Nonnull TimeUnit timeoutUnit,
        @Nonnull Function<K, K> computeKey,
        @Nonnull Function<K, V> computeValue,
        @Nullable BiConsumer<K, V> destroyer)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `shutdown()` |
| `public` | `void` | `cleanup()` |
| `public` | `V` | `get(K key)` |
| `` | `throw new` | `IllegalStateException("Cache has been shutdown!")` |
| `` | `private static <K, V> void` | `noopDestroy(K key, V value)` |
| `` | `public` | `Bucket(int capacity, long timeout_ns)` |
| `` | `public V` | `compute(@Nonnull K key, @Nonnull Function<K, K> computeKey, @Nonnull Function<K, V> computeValue, @Nonnull BiConsumer<K, V> destroyer)` |
| `` | `public void` | `cleanup(@Nullable BiConsumer<K, V> destroyer)` |
| `` | `public void` | `clear(@Nonnull BiConsumer<K, V> destroyer)` |
| `` | `protected V` | `markAndGet(long timestamp)` |
| `` | `throw new` | `ExceptionInInitializerError(var1)` |

## Inner Types

- `ConcurrentSizedTimeoutCache.Bucket`
- `ConcurrentSizedTimeoutCache.CacheEntry`

## Related Types

- [Cache](Cache.md)
- [CleanupFutureAction](CleanupFutureAction.md)
- [CleanupRunnable](CleanupRunnable.md)
- [SizedTimeoutCache](SizedTimeoutCache.md)
- [TimeoutCache](TimeoutCache.md)
