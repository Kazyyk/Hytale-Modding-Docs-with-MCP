# ListPool.Resource

Type: class | Package: com.hypixel.hytale.server.worldgen.util | Extends: it.unimi.dsi.fastutil.objects.ObjectArrayList | Implements: java.lang.AutoCloseable

public static class Resource<T> extends ObjectArrayList<T> implements AutoCloseable

Inner class of `ListPool`. An `ObjectArrayList` that implements `AutoCloseable` for use in try-with-resources blocks. On close, returns itself to the parent pool. The `toArray()` method uses the pool's empty array prototype for type safety.
