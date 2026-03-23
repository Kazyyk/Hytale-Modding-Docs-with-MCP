# IndexedStorageFile

Type: class | Package: com.hypixel.hytale.storage | Implements: java.io.Closeable

public class IndexedStorageFile implements Closeable

Segment-based indexed binary storage file with Zstd compression. Supports reading, writing, and removing blobs by index. Uses memory-mapped blob indexes, stamped locks for concurrent access, and a `BitSet` for tracking used segments. Handles V0-to-V1 migration automatically.

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
  protected int getBlobIndex(int blobIndex)
  protected void putBlobIndex(int blobIndex, int segmentIndex)
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
