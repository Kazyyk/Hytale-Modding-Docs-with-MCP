# IndexedStorageFile

Type: class | Package: com.hypixel.hytale.storage | Implements: Closeable

public class IndexedStorageFile implements Closeable

A file-backed indexed storage system using Zstd compression and memory-mapped I/O. Data is organized as a fixed number of "blobs" (keyed by integer index) stored across dynamically allocated segments on disk. The file format uses a magic header (`"HytaleIndexedStorage"`), a blob index region mapped into memory, and a segment region where compressed blob data is written. Thread safety is achieved via `StampedLock` on each blob index and a global used-segments lock.

This is the current version (v1) of the storage format. It replaces IndexedStorageFile_v0 and performs automatic migration when opening v0 files.

## Constants

- MAGIC_STRING | String | "HytaleIndexedStorage" | Magic header string identifying the file format.
- VERSION | int | 1 | Current file format version.
- DEFAULT_BLOB_COUNT | int | 1024 | Default number of blob slots.
- DEFAULT_SEGMENT_SIZE | int | 4096 | Default segment size in bytes.
- DEFAULT_COMPRESSION_LEVEL | int | 3 | Default Zstd compression level.
- UNASSIGNED_INDEX | int | 0 | Sentinel value indicating no segment is assigned.
- FIRST_SEGMENT_INDEX | int | 1 | First valid segment index (1-based).

## Static Fields

- METRICS_REGISTRY | MetricsRegistry<IndexedStorageFile> | Metrics registry tracking size, compression level, blob count, used blob count, segment size, and segment count.
- EMPTY_STAMPED_LOCKS | StampedLock[] | Empty lock array constant.

## Static Methods


@Nonnull
public static IndexedStorageFile open(@Nonnull Path path, OpenOption... options) throws IOException

Opens or creates a storage file at the given path with default blob count (1024) and segment size (4096).


@Nonnull
public static IndexedStorageFile open(@Nonnull Path path, @Nonnull Set<? extends OpenOption> options, FileAttribute<?>... attrs) throws IOException

Opens or creates a storage file with explicit file attributes.


@Nonnull
public static IndexedStorageFile open(@Nonnull Path path, int blobCount, int segmentSize, OpenOption... options) throws IOException

Opens or creates a storage file with custom blob count and segment size.


@Nonnull
public static IndexedStorageFile open(@Nonnull Path path, int blobCount, int segmentSize, @Nonnull Set<? extends OpenOption> options, FileAttribute<?>... attrs) throws IOException

Opens or creates a storage file with full control over parameters. If the file is v0 format, it is automatically migrated to v1.

## Instance Methods


@Nonnull
public Path getPath()

Returns the filesystem path of this storage file.


public int getBlobCount()

Returns the total number of blob slots in this file.


public int getSegmentSize()

Returns the segment size in bytes.


public int getCompressionLevel()

Returns the current Zstd compression level.


public void setCompressionLevel(int compressionLevel)

Sets the Zstd compression level for subsequent writes.


public void setFlushOnWrite(boolean flushOnWrite)

When enabled, forces the file channel and mapped index to flush after each write.


@Nullable
public ByteBuffer readBlob(int blobIndex) throws IOException

Reads and decompresses the blob at the given index. Returns `null` if no data is stored at that index. Throws `IndexOutOfBoundsException` if the index is out of range.


public void readBlob(int blobIndex, @Nonnull ByteBuffer dest) throws IOException

Reads and decompresses the blob directly into the provided destination buffer.


public int readBlobLength(int blobIndex) throws IOException

Returns the uncompressed length of the blob at the given index, or 0 if unassigned.


public int readBlobCompressedLength(int blobIndex) throws IOException

Returns the compressed length of the blob at the given index, or 0 if unassigned.


public void writeBlob(int blobIndex, @Nonnull ByteBuffer src) throws IOException

Compresses and writes data to the given blob index. Allocates new segments and releases old ones as needed.


public void removeBlob(int blobIndex) throws IOException

Removes the blob at the given index, freeing its segments.


@Nonnull
public IntList keys()

Returns a list of all blob indexes that currently have data stored.


public long size() throws IOException

Returns the total file size in bytes.


public int segmentSize()

Returns the total number of segments (used and unused) in the file.


public int segmentCount()

Returns the number of segments currently in use.


public FileLock lock() throws IOException

Acquires an exclusive file lock on the underlying channel.


public void force(boolean metaData) throws IOException

Forces any updates to the file channel and mapped blob indexes to be written to the storage device.


@Override
public void close() throws IOException

Closes the file channel and releases the memory-mapped blob index buffer.

## Inner Classes

- `OffsetHelper` -- Utility for computing sequential byte offsets within headers.
- `SegmentRangeWriteLock` -- Holds write locks on a contiguous range of segments during write operations.

Also in this package: IndexedStorageFile_v0, OffsetHelper, OffsetHelper, SegmentRangeLock, SegmentRangeWriteLock

Complete API:
  private static ByteBuffer getTempBuffer(int length)
  private static ByteBuffer allocateDirect(int length)
  public static IndexedStorageFile open(Path path, OpenOption options)
  public static IndexedStorageFile open(Path path, Set<? extends OpenOption> options, FileAttribute<?> attrs)
  public static IndexedStorageFile open(Path path, int blobCount, int segmentSize, OpenOption options)
  public static IndexedStorageFile open(Path path, int blobCount, int segmentSize, Set<? extends OpenOption> options, FileAttribute<?> attrs)
  private static IndexedStorageFile migrateV0(Path path, int blobCount, int segmentSize, Set<? extends OpenOption> options, FileAttribute<?>[] attrs, IndexedStorageFile storageFile)
  public Path getPath()
  public int getBlobCount()
  public int getSegmentSize()
  public int getCompressionLevel()
  public void setFlushOnWrite(boolean flushOnWrite)
  public void setCompressionLevel(int compressionLevel)
  protected IndexedStorageFile create(int blobCount, int segmentSize)
  protected void writeHeader(int blobCount, int segmentSize)
  protected void readHeader()
  protected void memoryMapBlobIndexes()
  protected void readUsedSegments()
  public long size()
  public int segmentSize()
  public int segmentCount()
  public IntList keys()
  public int readBlobLength(int blobIndex)
  public int readBlobCompressedLength(int blobIndex)
  public ByteBuffer readBlob(int blobIndex)
  public void readBlob(int blobIndex, ByteBuffer dest)
  protected ByteBuffer readBlobHeader(int firstSegmentIndex)
  protected ByteBuffer readSegments(int firstSegmentIndex, int compressedLength)
  public void writeBlob(int blobIndex, ByteBuffer src)
  public void removeBlob(int blobIndex)
  protected int writeSegments(ByteBuffer data)
  private IndexedStorageFile.SegmentRangeWriteLock findFreeSegment(int count)
  protected StampedLock getSegmentLock(int segmentIndex)
  protected long segmentsBase()
  protected long segmentOffset(int segmentIndex)
  protected long segmentPosition(int segmentIndex)
  protected int positionToSegment(long position)
  protected int requiredSegments(long dataLength)
  public FileLock lock()
  public void force(boolean metaData)
  public void close()
  public String toString()

Fields:
public static final StampedLock[] EMPTY_STAMPED_LOCKS
public static final MetricsRegistry<IndexedStorageFile> METRICS_REGISTRY
public static final String MAGIC_STRING
public static final int VERSION
public static final int DEFAULT_BLOB_COUNT
public static final int DEFAULT_SEGMENT_SIZE
public static final int DEFAULT_COMPRESSION_LEVEL
static final IndexedStorageFile.OffsetHelper HOH
public static final int MAGIC_LENGTH
public static final int MAGIC_OFFSET
public static final int VERSION_OFFSET
public static final int BLOB_COUNT_OFFSET
public static final int SEGMENT_SIZE_OFFSET
public static final int HEADER_LENGTH
static final IndexedStorageFile.OffsetHelper BOH
public static final int SRC_LENGTH_OFFSET
public static final int COMPRESSED_LENGTH_OFFSET
public static final int BLOB_HEADER_LENGTH
public static final int INDEX_SIZE
public static final int UNASSIGNED_INDEX
public static final int FIRST_SEGMENT_INDEX
public static final FileAttribute<?>[] NO_ATTRIBUTES
static final byte[] MAGIC_BYTES
private static final ByteBuffer MAGIC_BUFFER
private static final ThreadLocal<ByteBuffer> CACHED_TEMP_BUFFER
private final Path path
private final FileChannel fileChannel
private boolean flushOnWrite
private int compressionLevel
private int version
private int blobCount
private int segmentSize
private StampedLock[] indexLocks
private MappedByteBuffer mappedBlobIndexes
private final StampedLock segmentLocksLock
private StampedLock[] segmentLocks
private final StampedLock usedSegmentsLock
private final BitSet usedSegments
