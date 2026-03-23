# ListPool

Type: class | Package: com.hypixel.hytale.server.worldgen.util

public class ListPool<T>

Thread-safe object pool for reusable `ObjectArrayList` instances. Pre-allocates a configurable number of `Resource` objects backed by a `ConcurrentLinkedQueue`. Acquire returns a pooled list or creates a new one; release returns it to the pool if below capacity.
