---
title: "EditOperation"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools"
fqcn: "com.hypixel.hytale.builtin.buildertools.EditOperation"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "buildertools"
  - "creative"
  - "editing"
---

**Package:** `com.hypixel.hytale.builtin.buildertools`

```java
public class EditOperation
```

Tracks the before and after state of a block editing operation, used by brush tool operations to record changes for undo/redo. Maintains two `BlockSelection` objects (before and after) and provides methods to read and write blocks through a cached chunk accessor with optional mask filtering.

## Constructor

```java
public EditOperation(@Nonnull World world, int x, int y, int z, int editRange, Vector3i min, Vector3i max, BlockMask blockMask)
```

Creates an edit operation centered at `(x, y, z)` with the given edit range (in chunks). The `min` and `max` vectors define the operation bounds for mask checks. If `min` and `max` are non-null, the before selection's area is set to those bounds. The `blockMask` parameter is optional and controls which blocks can be modified.

## Block Access

### getBlock

```java
public int getBlock(int x, int y, int z)
```

Returns the block ID at the specified world coordinates, reading through the `OverridableChunkAccessor`.

### setBlock

```java
public boolean setBlock(int x, int y, int z, int blockId)
```

Sets a block at the specified coordinates with rotation 0. Returns `false` if the block mask excludes the position or the chunk is not in memory.

```java
public boolean setBlock(int x, int y, int z, int blockId, int rotation)
```

Sets a block with the specified rotation index. Before the first modification at a position, records the current block state (ID, rotation, filler, support value, and block component holder) in the before selection. The after selection always records the new state. Setting a block to ID 0 (air) also clears fluid at that position.

### getFluid

```java
public int getFluid(int x, int y, int z)
```

Returns the fluid ID at the specified world coordinates. Returns 0 if the chunk is not in memory.

### setMaterial

```java
public boolean setMaterial(int x, int y, int z, @Nonnull Material material)
```

Sets either a block or fluid at the specified position depending on the material type. Delegates to `setBlock()` for block materials and an internal `setFluid()` for fluid materials.

## Accessors

### getBlockMask

```java
public BlockMask getBlockMask()
```

Returns the block mask used to filter which positions can be modified. May be `null`.

### getBefore

```java
@Nonnull
public BlockSelection getBefore()
```

Returns the `BlockSelection` recording the original state of all modified positions.

### getAfter

```java
@Nonnull
public BlockSelection getAfter()
```

Returns the `BlockSelection` recording the new state of all modified positions.

### getAccessor

```java
@Nonnull
public OverridableChunkAccessor getAccessor()
```

Returns the chunk accessor used for world block reads.

## Mask Filtering

When a `BlockMask` is set, both `setBlock()` and the internal `setFluid()` check `blockMask.isExcluded()` before applying changes. Excluded positions are skipped, and the method returns `false`.

## Related Types

- [BuilderToolsPlugin.BuilderState](BuilderToolsPlugin.BuilderState.md) -- creates `EditOperation` instances for brush tool use
- [CopyCutSettings](CopyCutSettings.md) -- flags controlling clipboard operations that produce edit history
