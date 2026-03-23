# CoordinateCache

Type: class | Package: com.hypixel.hytale.server.worldgen.cache

public class CoordinateCache

Abstract base for seed+coordinate-keyed caches. Uses `SizedTimeoutCache` with object pooling for keys. Subclasses implement `compute()` for cache miss loading and `onRemoval()` for cleanup.
