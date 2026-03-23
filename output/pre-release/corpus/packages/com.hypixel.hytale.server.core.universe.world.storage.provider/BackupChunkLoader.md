# BackupChunkLoader

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage.provider | Implements: IChunkLoader

public class BackupChunkLoader implements IChunkLoader

Loads chunks from one or more backup archives for disaster recovery. Accepts a list of backup paths (ZIP files) and iterates through them in order to find chunk data. Supports both filesystem-based and ZIP-based backup formats.

For each backup, either opens the filesystem directly (if the expected world path exists) or extracts chunk files to a temp directory. Delegates to the base storage provider's recovery loader for actual deserialization.

## Constructor


public BackupChunkLoader(ChunkStore store, List<Path> backups) throws IOException

## Key Methods

- loadHolder(int x, int z) | CompletableFuture<Holder<ChunkStore>> | Attempts to load a chunk from each backup in order, falling through on failure.
- getIndexes() | LongSet | Returns an empty set (backup loader does not enumerate available chunks).
- close() | void | Closes all loaders, filesystems, and deletes temporary directories.

Also in this package: CacheEntryMetricData, DefaultChunkStorageProvider, EmptyChunkLoader, EmptyChunkSaver, EmptyChunkStorageProvider, IChunkStorageProvider, IndexedStorageCache, IndexedStorageChunkLoader, IndexedStorageChunkSaver, IndexedStorageChunkStorageProvider, Loader, MigrationChunkLoader, MigrationChunkStorageProvider, MigrationData, RocksDbChunkStorageProvider, RocksDbResource, Saver

Complete API:
  public CompletableFuture<Holder<ChunkStore>> loadHolder(int x, int z)
  private CompletableFuture<Holder<ChunkStore>> loadChunkNext(Iterator<IChunkLoader> iterator, int x, int z)
  public LongSet getIndexes()
  public void close()

Fields:
private final List<IChunkLoader> loaders
private final List<FileSystem> fileSystems
private final List<Path> tempDirs
