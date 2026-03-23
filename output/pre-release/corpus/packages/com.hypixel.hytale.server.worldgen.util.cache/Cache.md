# Cache

Type: interface | Package: com.hypixel.hytale.server.worldgen.util.cache | Extends: null

public interface Cache<K, V>

## Methods

- void shutdown()
- void cleanup()
- V get(K var1)

Known implementors: ConcurrentSizedTimeoutCache, SizedTimeoutCache, TimeoutCache

Also in this package: Bucket, CacheEntry, CacheEntry, CacheEntry, CleanupFutureAction, CleanupRunnable, ConcurrentSizedTimeoutCache, SizedTimeoutCache, TimeoutCache

Complete API:
  void shutdown()
  void cleanup()
  V get(K var1)
