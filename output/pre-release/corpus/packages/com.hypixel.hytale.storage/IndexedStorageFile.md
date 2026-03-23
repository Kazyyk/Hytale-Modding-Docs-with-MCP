# IndexedStorageFile

Type: class | Package: com.hypixel.hytale.storage | Implements: java.io.Closeable

public class IndexedStorageFile implements Closeable

Segment-based indexed binary storage file with Zstd compression. Supports reading, writing, and removing blobs by index. Uses memory-mapped blob indexes, stamped locks for concurrent access, and a `BitSet` for tracking used segments. Handles V0-to-V1 migration automatically.
