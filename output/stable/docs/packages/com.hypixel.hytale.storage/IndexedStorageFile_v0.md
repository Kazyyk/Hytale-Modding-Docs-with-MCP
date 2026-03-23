---
title: "IndexedStorageFile_v0"
kind: "class"
package: "com.hypixel.hytale.storage"
fqcn: "com.hypixel.hytale.storage.IndexedStorageFile_v0"
api_surface: true
extends: ~
implements:
  - "Closeable"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "storage"
  - "io"
  - "deprecated"
  - "persistence"
---

**Package:** `com.hypixel.hytale.storage`

```java
@Deprecated
public class IndexedStorageFile_v0 implements Closeable
```

The original (v0) implementation of the indexed storage file format. Superseded by [IndexedStorageFile](IndexedStorageFile.md) (v1). Files in this format are automatically migrated when opened via `IndexedStorageFile.open()`.

Unlike v1, v0 uses a linked-list segment chain (each segment header contains a pointer to the next segment) and maintains a double-width blob index region (primary + temporary) for crash-safe writes. The `contiguousBlobs` flag controls whether segments for a single blob are allocated contiguously (the only implemented strategy).

## Constants

| Constant | Type | Value | Description |
|---|---|---|---|
| `VERSION` | `int` | `0` | File format version for v0. |
| `DEFAULT_BLOB_COUNT` | `int` | `1024` | Default blob slot count. |
| `DEFAULT_SEGMENT_SIZE` | `int` | `4096` | Default segment size in bytes. |
| `DEFAULT_COMPRESSION_LEVEL` | `int` | `3` | Default Zstd compression level. |
| `DEFAULT_CONTIGUOUS_BLOBS` | `boolean` | `true` | Whether blobs are allocated contiguously. |
| `END_BLOB_INDEX` | `int` | `Integer.MIN_VALUE` | Sentinel marking the end of a segment chain. |

## Static Methods

```java
@Nonnull
public static IndexedStorageFile_v0 open(@Nonnull Path path, OpenOption... options) throws IOException
```

Opens or creates a v0 storage file with default parameters.

```java
@Nonnull
public static IndexedStorageFile_v0 open(@Nonnull Path path, int blobCount, int segmentSize, @Nonnull Set<? extends OpenOption> options, FileAttribute<?>... attrs) throws IOException
```

Opens or creates a v0 storage file with full control over parameters.

## Instance Methods

```java
@Nonnull
public Path getPath()
```

```java
public int getBlobCount()
```

```java
public int getSegmentSize()
```

```java
public int getCompressionLevel()
```

```java
public void setCompressionLevel(int compressionLevel)
```

```java
public boolean isContiguousBlobs()
```

Returns whether blobs are stored with contiguous segments.

```java
public void setContiguousBlobs(boolean contiguousBlobs)
```

```java
@Nullable
public ByteBuffer readBlob(int blobIndex) throws IOException
```

Reads and decompresses the blob at the given index, following the linked-list segment chain.

```java
public void readBlob(int blobIndex, @Nonnull ByteBuffer dest) throws IOException
```

```java
public void writeBlob(int blobIndex, @Nonnull ByteBuffer src) throws IOException
```

Compresses and writes data using the crash-safe double-index strategy.

```java
public void removeBlob(int blobIndex) throws IOException
```

```java
@Nonnull
public IntList keys()
```

```java
public long size() throws IOException
```

```java
public int segmentSize()
```

```java
public int segmentCount()
```

```java
public FileLock lock() throws IOException
```

```java
public void force(boolean metaData) throws IOException
```

```java
@Override
public void close() throws IOException
```

## Inner Classes

- `OffsetHelper` -- Utility for computing sequential byte offsets.
- `SegmentRangeLock` -- Holds read or write locks on a contiguous range of segments.
