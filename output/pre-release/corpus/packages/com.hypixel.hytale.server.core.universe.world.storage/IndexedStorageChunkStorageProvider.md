# IndexedStorageChunkStorageProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage | Implements: IChunkStorageProvider<IndexedStorageCache>

public class IndexedStorageChunkStorageProvider implements IChunkStorageProvider<IndexedStorageCache>

File-based chunk storage using `IndexedStorageFile` region files. Chunks are stored in 32x32 region bins at `<world>/chunks/<x>.<z>.region.bin`. Supports configurable flush-on-write. Registered as `"IndexedStorage"` in the codec.
