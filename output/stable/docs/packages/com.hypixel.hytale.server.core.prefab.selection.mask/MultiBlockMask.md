---
title: "MultiBlockMask"
kind: "class"
package: "com.hypixel.hytale.server.core.prefab.selection.mask"
fqcn: "com.hypixel.hytale.server.core.prefab.selection.mask.MultiBlockMask"
api_surface: false
extends: "BlockMask"
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
public class MultiBlockMask extends BlockMask
```

Extends [BlockMask](BlockMask.md) to combine multiple independent mask instances. A block is excluded if any of the contained masks excludes it (logical OR, then XOR with the global inversion flag).

The individual masks are separated by `";"` in the serialized string.

## Constructors

```java
public MultiBlockMask(BlockMask[] masks)
```

Creates a multi-mask from the given array of `BlockMask` instances. Passes `BlockFilter.EMPTY_ARRAY` to the parent constructor since filtering is delegated to child masks.

## Methods

```java
@Override
public boolean isExcluded(@Nonnull ChunkAccessor accessor, int x, int y, int z, Vector3i min, Vector3i max, int blockId)
```

Delegates to the overload with `fluidId = -1`.

```java
@Override
public boolean isExcluded(@Nonnull ChunkAccessor accessor, int x, int y, int z, Vector3i min, Vector3i max, int blockId, int fluidId)
```

Returns `true` if any contained mask excludes the block, XORed with the global inversion flag.

```java
@Nonnull
@Override
public String toString()
```

Serializes all masks joined by `";"`. Returns `"-"` if empty.

```java
@Nonnull
@Override
public String informativeToString()
```

Returns a human-readable description with `AND` between the contained masks.

## Related Types

- [BlockMask](BlockMask.md) -- parent class; single-level mask
- [BlockFilter](BlockFilter.md) -- individual filter used within each child mask
