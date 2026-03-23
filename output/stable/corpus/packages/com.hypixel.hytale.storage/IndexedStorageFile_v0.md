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
