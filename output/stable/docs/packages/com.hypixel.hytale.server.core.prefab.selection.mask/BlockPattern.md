---
title: "BlockPattern"
kind: "class"
package: "com.hypixel.hytale.server.core.prefab.selection.mask"
fqcn: "com.hypixel.hytale.server.core.prefab.selection.mask.BlockPattern"
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
public class BlockPattern
```

A weighted random block selection pattern used by the prefab and builder-tools systems. Each pattern maps one or more block names to percentage weights. When evaluated, it randomly selects a block ID according to those weights.

Patterns are serialized as comma-separated entries in the form `"weight%blockName"` (e.g., `"50%dirt,50%grass"`). A single block without a weight prefix defaults to 100%.

## Fields

```java
public static final Codec<BlockPattern> CODEC = new FunctionCodec<>(Codec.STRING, BlockPattern::parse, BlockPattern::toString);
```

```java
public static final BlockPattern EMPTY = new BlockPattern(parseBlockPattern("Empty"));
```

Singleton empty pattern that produces no blocks.

```java
public static final BlockPattern[] EMPTY_ARRAY = new BlockPattern[0];
```

## Constructors

```java
public BlockPattern(IWeightedMap<String> weightedMap)
```

Creates a pattern from a pre-built weighted map of block name strings.

## Methods

```java
public Integer[] getResolvedKeys()
```

Returns the resolved integer block IDs. Triggers lazy resolution if not yet resolved.

```java
public void resolve()
```

Lazily resolves block names to integer IDs, expanding `BlockTypeListAsset` references into their constituent block types.

```java
public boolean isEmpty()
```

Returns `true` if this pattern contains no entries.

```java
public int nextBlock(Random random)
```

Randomly selects and returns a block ID according to the pattern weights.

```java
@Nullable
public BlockPattern.BlockEntry nextBlockTypeKey(Random random)
```

Randomly selects and returns a `BlockEntry` (with rotation and filler metadata) according to the pattern weights. Returns `null` if no entries have block type key metadata.

```java
@Deprecated
public int firstBlock()
```

Returns the first resolved block ID, or `0` if empty. Deprecated.

```java
public static BlockPattern parse(@Nonnull String str)
```

Parses a pattern from its serialized string representation.

```java
public static int parseBlock(@Nonnull String blockText)
```

Resolves a single block name or numeric ID string to an integer block ID.

```java
@Nullable
public static BlockPattern.BlockEntry tryParseBlockTypeKey(String blockText)
```

Attempts to parse a block string including rotation and filler metadata. Returns `null` on failure.

## Inner Types

### BlockEntry (record)

```java
public record BlockEntry(String blockTypeKey, int rotation, int filler)
```

Holds a block type key with optional rotation and filler metadata. Used for prefab placement that preserves block orientation.

## Related Types

- [BlockFilter](BlockFilter.md) -- filter that uses `parseBlock` to resolve block names
- [BlockMask](BlockMask.md) -- compound mask used alongside patterns in brush operations
