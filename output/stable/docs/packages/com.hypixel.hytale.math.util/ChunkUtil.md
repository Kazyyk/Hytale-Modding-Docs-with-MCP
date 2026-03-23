---
title: "ChunkUtil"
kind: "class"
package: "com.hypixel.hytale.math.util"
fqcn: "com.hypixel.hytale.math.util.ChunkUtil"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "math"
  - "util"
  - "class"
---

**Package:** `com.hypixel.hytale.math.util`

```java
public class ChunkUtil
```

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `int` | `BITS` | `5` |
| `public static final` | `int` | `SIZE` | `32` |
| `public static final` | `int` | `SIZE_2` | `1024` |
| `public static final` | `int` | `SIZE_MINUS_1` | `31` |
| `public static final` | `int` | `SIZE_MASK` | `31` |
| `public static final` | `int` | `SIZE_COLUMNS` | `1024` |
| `public static final` | `int` | `SIZE_COLUMNS_MASK` | `1023` |
| `public static final` | `int` | `SIZE_BLOCKS` | `32768` |
| `public static final` | `int` | `SIZE_BLOCKS_MASK` | `32767` |
| `public static final` | `int` | `BITS2` | `10` |
| `public static final` | `int` | `NON_CHUNK_MASK` | `-32` |
| `public static final` | `int` | `HEIGHT_SECTIONS` | `10` |
| `public static final` | `int` | `HEIGHT` | `320` |
| `public static final` | `int` | `HEIGHT_MINUS_1` | `319` |
| `public static final` | `int` | `HEIGHT_MASK` | `(Integer.highestOneBit(320) << 1) - 1` |
| `public static final` | `int` | `SIZE_BLOCKS_COLUMN` | `327680` |
| `public static final` | `long` | `NOT_FOUND` | `indexChunk(Integer.MIN_VALUE, Integer.MIN_VALUE)` |
| `public static final` | `int` | `MIN_Y` | `0` |
| `public static final` | `int` | `MIN_ENTITY_Y` | `-32` |
| `public static final` | `int` | `MIN_SECTION` | `0` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public static byte[]` | `shortToByteArray(@Nonnull short[] data)` |
| `` | `public static byte[]` | `intToByteArray(@Nonnull int[] data)` |
| `` | `public static int` | `indexColumn(int x, int z)` |
| `` | `public static int` | `xFromColumn(int index)` |
| `` | `public static int` | `zFromColumn(int index)` |
| `` | `public static int` | `indexSection(int y)` |
| `` | `public static int` | `indexBlockFromColumn(int column, int y)` |
| `` | `public static int` | `indexBlock(int x, int y, int z)` |
| `` | `public static int` | `xFromIndex(int index)` |
| `` | `public static int` | `yFromIndex(int index)` |
| `` | `public static int` | `zFromIndex(int index)` |
| `` | `public static int` | `indexBlockInColumn(int x, int y, int z)` |
| `` | `public static int` | `indexBlockInColumnFromColumn(int column, int y)` |
| `` | `public static int` | `xFromBlockInColumn(int index)` |
| `` | `public static int` | `yFromBlockInColumn(int index)` |
| `` | `public static int` | `zFromBlockInColumn(int index)` |
| `` | `public static int` | `localCoordinate(long v)` |
| `` | `public static int` | `chunkCoordinate(double block)` |
| `` | `public static int` | `chunkCoordinate(int block)` |
| `` | `public static int` | `chunkCoordinate(long block)` |
| `` | `public static int` | `minBlock(int index)` |
| `` | `public static int` | `maxBlock(int index)` |
| `` | `public static boolean` | `isWithinLocalChunk(int x, int z)` |
| `` | `public static boolean` | `isBorderBlock(int x, int z)` |
| `` | `public static boolean` | `isBorderBlockGlobal(int x, int z)` |
| `` | `public static boolean` | `isInsideChunk(int chunkX, int chunkZ, int x, int z)` |
| `` | `public static boolean` | `isSameChunk(int x0, int z0, int x1, int z1)` |
| `` | `public static boolean` | `isSameChunkSection(int x0, int y0, int z0, int x1, int y1, int z1)` |
| `` | `public static boolean` | `isInsideChunkRelative(int x, int z)` |
| `` | `public static int` | `xOfChunkIndex(long index)` |
| `` | `public static int` | `zOfChunkIndex(long index)` |
| `` | `public static long` | `indexChunk(int x, int z)` |
| `` | `public static long` | `indexChunkFromBlock(int blockX, int blockZ)` |
| `` | `public static long` | `indexChunkFromBlock(double blockX, double blockZ)` |
| `` | `public static int` | `worldCoordFromLocalCoord(int chunkCoord, int localCoord)` |
