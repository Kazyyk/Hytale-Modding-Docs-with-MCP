---
title: "BlockMask"
kind: "class"
package: "com.hypixel.hytale.server.core.prefab.selection.mask"
fqcn: "com.hypixel.hytale.server.core.prefab.selection.mask.BlockMask"
api_surface: true
extends: "java.lang.Object"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "prefab"
  - "selection"
  - "mask"
---

**Package:** `com.hypixel.hytale.server.core.prefab.selection.mask`

```java
public class BlockMask
```

A compound block mask that combines one or more [BlockFilter](BlockFilter.md) instances. A block is excluded by the mask if any individual filter excludes it (logical AND of all filters). The entire mask can be inverted to flip the result.

Masks are parsed from comma-separated (or semicolon-separated) strings where each element is a filter string. The special value `"-"` represents an empty mask.

## Fields

```java
public static final BlockMask EMPTY = new BlockMask(BlockFilter.EMPTY_ARRAY);
```

Singleton empty mask that never excludes any block.

```java
public static final Codec<BlockMask> CODEC = new FunctionCodec<>(Codec.STRING, BlockMask::parse, BlockMask::toString);
```

Codec for serializing/deserializing a BlockMask to/from a string.

```java
public static final String MASK_SEPARATOR = ",";
```

```java
public static final String ALT_MASK_SEPARATOR = ";";
```

```java
public static final String EMPTY_MASK_CHARACTER = "-";
```

## Constructors

```java
public BlockMask(BlockFilter[] filters)
```

Creates a mask from the given array of filters.

## Methods

```java
@Nonnull
public BlockMask withOptions(@Nonnull BlockFilter.FilterType filterType, boolean inverted)
```

Returns a new mask with all filters overridden to the given filter type and inversion state. Returns `this` if already matching.

```java
public BlockFilter[] getFilters()
```

Returns the array of filters in this mask.

```java
public void setInverted(boolean inverted)
```

Sets the global inversion flag for this mask.

```java
public boolean isInverted()
```

Returns the global inversion flag.

```java
public boolean isExcluded(@Nonnull ChunkAccessor accessor, int x, int y, int z, Vector3i min, Vector3i max, int blockId)
```

Tests exclusion with `fluidId = -1`.

```java
public boolean isExcluded(@Nonnull ChunkAccessor accessor, int x, int y, int z, Vector3i min, Vector3i max, int blockId, int fluidId)
```

Returns `true` if the block at the given position is excluded by this mask, considering all contained filters and the global inversion flag.

```java
@Nonnull
@Override
public String toString()
```

Serializes the mask to its string representation.

```java
@Nonnull
public String informativeToString()
```

Returns a human-readable version with `AND` between filters.

```java
public static BlockMask parse(@Nonnull String masks)
```

Parses a mask from a comma/semicolon-separated string. Returns `EMPTY` for empty or `"-"` input.

```java
public static BlockMask parse(@Nonnull String[] masks)
```

Parses a mask from an array of filter strings, grouping filters with the same type and inversion.

```java
public static BlockMask combine(@Nullable BlockMask... masks)
```

Combines multiple masks into one by merging all filters, grouping compatible filters together.

## Related Types

- [BlockFilter](BlockFilter.md) -- individual filter condition within a mask
- [MultiBlockMask](MultiBlockMask.md) -- extends BlockMask to combine multiple mask instances
- [BlockPattern](BlockPattern.md) -- weighted block selection pattern
