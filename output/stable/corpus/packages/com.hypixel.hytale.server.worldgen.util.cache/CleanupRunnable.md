# CleanupRunnable

Type: class | Package: com.hypixel.hytale.server.worldgen.util.cache | Extends: null | Implements: Runnable

public class CleanupRunnable<K, V> implements Runnable

## Fields

- private static final HytaleLogger LOGGER
- private final WeakReference<Cache<K, V>> reference
- Cache<K, V> cache

## Constructors

- public CleanupRunnable(WeakReference<Cache<K, V>> reference)

## Methods

- public void run()

## Related Types

- Cache

Also in this package: Bucket, Cache, CacheEntry, CacheEntry, CacheEntry, CleanupFutureAction, ConcurrentSizedTimeoutCache, SizedTimeoutCache, TimeoutCache

Complete API:
  public void run()

Fields:
private static final HytaleLogger LOGGER
private final WeakReference<Cache<K,V>> reference
