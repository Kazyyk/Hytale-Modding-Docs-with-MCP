# RocksDbChunkStorageProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage.provider | Implements: com.hypixel.hytale.server.core.universe.world.storage.provider.IChunkStorageProvider

public class RocksDbChunkStorageProvider implements IChunkStorageProvider<RocksDbChunkStorageProvider.RocksDbResource>

RocksDB-backed chunk storage with LZ4 compression, ZSTD bottommost compression, bloom filters, and level-style compaction. Stores chunks as blobs in a dedicated column family. Contains inner `Loader`, `Saver`, and `RocksDbResource` classes.
