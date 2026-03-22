---
title: "BlockFilter"
kind: "class"
package: "com.hypixel.hytale.server.core.prefab.selection.mask"
fqcn: "com.hypixel.hytale.server.core.prefab.selection.mask.BlockFilter"
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
public class BlockFilter
```

Represents a single filter condition used in block selection masks. A filter tests whether a block at a given world position matches a set of block (or fluid) identifiers, optionally considering spatial relationships like adjacency, cardinal direction, or diagonal neighbors. Filters can be inverted to exclude matching blocks instead.

The filter type is determined by a prefix in the serialized string (e.g., `>` for above, `<` for below, `~` for adjacent). Multiple block names within a single filter are separated by `|`.

## Fields

```java
public static final BlockFilter[] EMPTY_ARRAY = new BlockFilter[0];
```

Shared empty array constant.

```java
public static final Codec<BlockFilter> CODEC = new FunctionCodec<>(Codec.STRING, BlockFilter::parse, BlockFilter::toString);
```

Codec for serializing/deserializing a BlockFilter to/from a string.

```java
public static final String BLOCK_SEPARATOR = "|";
```

Separator character between block names in a single filter.

```java
public static final Pattern BLOCK_SEPARATOR_PATTERN = Pattern.compile(Pattern.quote("|"));
```

Compiled regex pattern for splitting block names.

## Constructors

```java
public BlockFilter(@Nonnull BlockFilter.FilterType blockFilterType, @Nonnull String[] blocks, boolean inverted)
```

Creates a new filter with the given filter type, block name array, and inversion flag.

## Methods

```java
public void resolve()
```

Lazily resolves block and fluid string names into integer IDs. Called automatically before any matching operation.

```java
@Nonnull
public BlockFilter.FilterType getBlockFilterType()
```

Returns the spatial filter type (e.g., `TargetBlock`, `AboveBlock`, `AdjacentBlock`).

```java
@Nonnull
public String[] getBlocks()
```

Returns the raw block name strings this filter matches against.

```java
public boolean isInverted()
```

Returns `true` if this filter's match result is inverted.

```java
public boolean isExcluded(@Nonnull ChunkAccessor accessor, int x, int y, int z, Vector3i min, Vector3i max, int blockId)
```

Tests whether the block at the given position should be excluded by this filter. Delegates to the two-parameter overload with `fluidId = -1`.

```java
public boolean isExcluded(@Nonnull ChunkAccessor accessor, int x, int y, int z, Vector3i min, Vector3i max, int blockId, int fluidId)
```

Tests whether the block at the given position should be excluded by this filter, considering both block and fluid IDs.

```java
@Nonnull
@Override
public String toString()
```

Returns the cached serialized string representation.

```java
@Nonnull
public String informativeToString()
```

Returns a human-readable description of the filter with `OR` between alternatives and the full prefix.

```java
@Nonnull
public static BlockFilter parse(@Nonnull String str)
```

Parses a filter from its serialized string representation (e.g., `">dirt|grass"`, `"!~stone"`).

```java
@Nonnull
public static BlockFilter.ParsedFilterParts parseComponents(@Nonnull String str)
```

Extracts the filter type, inversion flag, and block substring from a serialized string without constructing a full BlockFilter.

```java
@Nonnull
public static IntSet parseBlocks(@Nonnull String[] blocksArgs)
```

Resolves an array of block name strings into a set of block integer IDs.

## Inner Types

### FilterType (enum)

```java
public static enum FilterType
```

Defines the spatial relationship a filter tests. Each variant has a string prefix used during parsing.

| Constant | Prefix | Description |
|---|---|---|
| `TargetBlock` | `""` | Matches the block at the tested position directly. |
| `AboveBlock` | `">"` | Matches the block one position below (y - 1). |
| `BelowBlock` | `"<"` | Matches the block one position above (y + 1). |
| `AdjacentBlock` | `"~"` | Matches any block in the four cardinal horizontal neighbors. |
| `NeighborBlock` | `"^"` | Matches any block in the 26-block 3D neighborhood. |
| `NorthBlock` | `"+n"` | Matches the block at z - 1. |
| `EastBlock` | `"+e"` | Matches the block at z + 1. |
| `SouthBlock` | `"+s"` | Matches the block at z + 1. |
| `WestBlock` | `"+w"` | Matches the block at z - 1. |
| `DiagonalXy` | `"%xy"` | Matches blocks at the four XY-plane diagonal positions. |
| `DiagonalXz` | `"%xz"` | Matches blocks at the four XZ-plane diagonal positions. |
| `DiagonalZy` | `"%zy"` | Matches blocks at the four ZY-plane diagonal positions. |
| `Selection` | `"#"` | Matches if the position falls within the selection bounds (min/max). |

### ParsedFilterParts (record)

```java
public record ParsedFilterParts(BlockFilter.FilterType type, boolean inverted, String blocks)
```

Intermediate parse result holding the extracted filter type, inversion state, and raw block string.

## Related Types

- [BlockMask](BlockMask.md) -- combines multiple BlockFilter instances into a compound mask
- [BlockPattern](BlockPattern.md) -- weighted random block selection pattern
- [MultiBlockMask](MultiBlockMask.md) -- mask combining multiple BlockMask instances
