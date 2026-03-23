# IndexedStorageChunkStorageProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage.provider | Implements: com.hypixel.hytale.server.core.universe.world.storage.provider.IChunkStorageProvider

public class IndexedStorageChunkStorageProvider implements IChunkStorageProvider<IndexedStorageChunkStorageProvider.IndexedStorageCache>

Region-file-based chunk storage using `IndexedStorageFile`. Chunks are organized into 32x32 regions stored as individual `.region.bin` files. Supports optional flush-on-write to prevent corruption during unclean shutdowns. Contains inner `IndexedStorageCache`, `IndexedStorageChunkLoader`, and `IndexedStorageChunkSaver` classes.
