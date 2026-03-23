# TimeoutCache

Type: class | Package: com.hypixel.hytale.server.worldgen.util.cache | Extends: null | Implements: Cache<K, V>

public class TimeoutCache<K, V> implements Cache<K, V>

## Fields

- private final Map<K, TimeoutCache.CacheEntry<V>> map
- private final long timeout
- private final Function<K, V> func
- private final BiConsumer<K, V> destroyer
- private final ScheduledFuture<?> future
- private final Cleanable cleanable
- long expire
- TimeoutCache.CacheEntry<V> cacheEntry
- K key
- Iterator<Entry<K, TimeoutCache.CacheEntry<V>>> iterator
- Entry<K, TimeoutCache.CacheEntry<V>> entry
- private final V value
- private long timestamp

## Constructors

- public TimeoutCache(long expire, @Nonnull TimeUnit unit, @Nonnull Function<K, V> func, @Nullable BiConsumer<K, V> destroyer)

## Methods

- public void cleanup()
- public void shutdown()
- public V get(K key)
- throw new IllegalStateException("Cache has been shutdown!")
- public CacheEntry(V value)

## Inner Types

- `TimeoutCache.CacheEntry`

## Related Types

- Cache
- CleanupFutureAction
- CleanupRunnable

Also in this package: Bucket, Cache, CacheEntry, CacheEntry, CacheEntry, CleanupFutureAction, CleanupRunnable, ConcurrentSizedTimeoutCache, SizedTimeoutCache

Complete API:
  public void cleanup()
  public void shutdown()
  public V get(K key)

Fields:
private final Map<K,TimeoutCache.CacheEntry<V>> map
private final long timeout
private final Function<K,V> func
private final BiConsumer<K,V> destroyer
private final ScheduledFuture<?> future
private final Cleanable cleanable
