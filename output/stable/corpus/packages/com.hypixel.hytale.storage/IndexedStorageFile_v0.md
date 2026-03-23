# IndexedStorageFile_v0

Type: class | Package: com.hypixel.hytale.storage | Implements: Closeable

@Deprecated
public class IndexedStorageFile_v0 implements Closeable

The original (v0) implementation of the indexed storage file format. Superseded by IndexedStorageFile (v1). Files in this format are automatically migrated when opened via `IndexedStorageFile.open()`.

Unlike v1, v0 uses a linked-list segment chain (each segment header contains a pointer to the next segment) and maintains a double-width blob index region (primary + temporary) for crash-safe writes. The `contiguousBlobs` flag controls whether segments for a single blob are allocated contiguously (the only implemented strategy).

## Constants

- VERSION | int | 0 | File format version for v0.
- DEFAULT_BLOB_COUNT | int | 1024 | Default blob slot count.
- DEFAULT_SEGMENT_SIZE | int | 4096 | Default segment size in bytes.
- DEFAULT_COMPRESSION_LEVEL | int | 3 | Default Zstd compression level.
- DEFAULT_CONTIGUOUS_BLOBS | boolean | true | Whether blobs are allocated contiguously.
- END_BLOB_INDEX | int | Integer.MIN_VALUE | Sentinel marking the end of a segment chain.

## Static Methods


@Nonnull
public static IndexedStorageFile_v0 open(@Nonnull Path path, OpenOption... options) throws IOException

Opens or creates a v0 storage file with default parameters.


@Nonnull
public static IndexedStorageFile_v0 open(@Nonnull Path path, int blobCount, int segmentSize, @Nonnull Set<? extends OpenOption> options, FileAttribute<?>... attrs) throws IOException

Opens or creates a v0 storage file with full control over parameters.

## Instance Methods


@Nonnull
public Path getPath()


public int getBlobCount()


public int getSegmentSize()


public int getCompressionLevel()


public void setCompressionLevel(int compressionLevel)


public boolean isContiguousBlobs()

Returns whether blobs are stored with contiguous segments.


public void setContiguousBlobs(boolean contiguousBlobs)


@Nullable
public ByteBuffer readBlob(int blobIndex) throws IOException

Reads and decompresses the blob at the given index, following the linked-list segment chain.


public void readBlob(int blobIndex, @Nonnull ByteBuffer dest) throws IOException


public void writeBlob(int blobIndex, @Nonnull ByteBuffer src) throws IOException

Compresses and writes data using the crash-safe double-index strategy.


public void removeBlob(int blobIndex) throws IOException


@Nonnull
public IntList keys()


public long size() throws IOException


public int segmentSize()


public int segmentCount()


public FileLock lock() throws IOException


public void force(boolean metaData) throws IOException


@Override
public void close() throws IOException

## Inner Classes

- `OffsetHelper` -- Utility for computing sequential byte offsets.
- `SegmentRangeLock` -- Holds read or write locks on a contiguous range of segments.

Also in this package: IndexedStorageFile, OffsetHelper, OffsetHelper, SegmentRangeLock, SegmentRangeWriteLock

Complete API:
  private static ByteBuffer getTempBuffer(int length)
  private static ByteBuffer allocateDirect(int length)
  public static IndexedStorageFile_v0 open(Path path, OpenOption options)
  public static IndexedStorageFile_v0 open(Path path, Set<? extends OpenOption> options, FileAttribute<?> attrs)
  public static IndexedStorageFile_v0 open(Path path, int blobCount, int segmentSize, OpenOption options)
  public static IndexedStorageFile_v0 open(Path path, int blobCount, int segmentSize, Set<? extends OpenOption> options, FileAttribute<?> attrs)
  public Path getPath()
  public int getBlobCount()
  public int getSegmentSize()
  public int getCompressionLevel()
  public void setCompressionLevel(int compressionLevel)
  public boolean isContiguousBlobs()
  public void setContiguousBlobs(boolean contiguousBlobs)
  protected IndexedStorageFile_v0 create(int blobCount, int segmentSize)
  protected void writeHeader(int blobCount, int segmentSize)
  protected IndexedStorageFile_v0 open()
  protected void readHeader()
  protected void memoryMapBlobIndexes()
  protected void readNextIndexes()
  protected void processTempIndexes()
  protected int clearSegments(int firstSegmentIndex, ByteBuffer tempIndexBuffer)
  public long size()
  public int segmentSize()
  public int segmentCount()
  public IntList keys()
  public int readBlobLength(int blobIndex)
  public int readBlobCompressedLength(int blobIndex)
  public ByteBuffer readBlob(int blobIndex)
  public void readBlob(int blobIndex, ByteBuffer dest)
  protected ByteBuffer readBlobHeader(int firstSegmentIndex)
  protected ByteBuffer readSegments(int firstSegmentIndex, int compressedLength, ByteBuffer tempHeaderBuffer)
  public void writeBlob(int blobIndex, ByteBuffer src)
  public void removeBlob(int blobIndex)
  protected int writeSegments(int blobIndex, ByteBuffer data)
  private IndexedStorageFile_v0.SegmentRangeLock findFreeSegment(int count)
  protected int getNextIndex(int segmentIndex)
  protected StampedLock getSegmentLock(int segmentIndex)
  protected IndexedStorageFile_v0.SegmentRangeLock tryWriteLockSegmentRange(int start, int count)
  protected int indexesLength()
  protected long segmentsBase()
  protected long segmentOffset(int segmentIndex)
  protected long segmentPosition(int segmentIndex)
  protected int positionToSegment(long position)
  protected long blobHeaderPosition(int segmentIndex)
  protected int requiredSegments(long dataLength)
  public FileLock lock()
  public void force(boolean metaData)
  public void close()
  public String toString()

Fields:
private static final HytaleLogger LOGGER
public static final StampedLock[] EMPTY_STAMPED_LOCKS
public static final MetricsRegistry<IndexedStorageFile_v0> METRICS_REGISTRY
public static final String MAGIC_STRING
public static final int VERSION
public static final int DEFAULT_BLOB_COUNT
public static final int DEFAULT_SEGMENT_SIZE
public static final int DEFAULT_COMPRESSION_LEVEL
public static final boolean DEFAULT_CONTIGUOUS_BLOBS
static final IndexedStorageFile_v0.OffsetHelper HOH
public static final int MAGIC_LENGTH
public static final int MAGIC_OFFSET
public static final int VERSION_OFFSET
public static final int BLOB_COUNT_OFFSET
public static final int SEGMENT_SIZE_OFFSET
public static final int HEADER_LENGTH
static final IndexedStorageFile_v0.OffsetHelper SOH
public static final int NEXT_SEGMENT_OFFSET
public static final int SEGMENT_HEADER_LENGTH
static final IndexedStorageFile_v0.OffsetHelper BOH
public static final int SRC_LENGTH_OFFSET
public static final int COMPRESSED_LENGTH_OFFSET
public static final int BLOB_HEADER_LENGTH
public static final int INDEX_SIZE
public static final int UNASSIGNED_INDEX
public static final int END_BLOB_INDEX
public static final int FIRST_SEGMENT_INDEX
public static final FileAttribute<?>[] NO_ATTRIBUTES
static final byte[] MAGIC_BYTES
private static final ByteBuffer MAGIC_BUFFER
private static final ThreadLocal<ByteBuffer> CACHED_TEMP_BUFFER
private final Path path
private final FileChannel fileChannel
private int compressionLevel
private boolean contiguousBlobs
private int blobCount
private int segmentSize
private StampedLock[] indexLocks
private MappedByteBuffer mappedBlobIndexes
private final StampedLock segmentLocksLock
private StampedLock[] segmentLocks
private final StampedLock nextSegmentIndexesLock
private int[] nextSegmentIndexes
