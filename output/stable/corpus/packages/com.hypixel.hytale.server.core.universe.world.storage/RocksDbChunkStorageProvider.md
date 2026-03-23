# RocksDbChunkStorageProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage | Implements: IChunkStorageProvider<RocksDbResource>

public class RocksDbChunkStorageProvider implements IChunkStorageProvider<RocksDbResource>

RocksDB-backed chunk storage using LZ4+ZSTD compression, bloom filters, and level-based compaction. Stores chunks in a `chunks` column family. Registered as `"RocksDb"` in the codec.
