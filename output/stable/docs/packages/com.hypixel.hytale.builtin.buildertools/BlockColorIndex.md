---
title: "BlockColorIndex"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools"
fqcn: "com.hypixel.hytale.builtin.buildertools.BlockColorIndex"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "buildertools"
  - "creative"
  - "color"
  - "image-import"
---

**Package:** `com.hypixel.hytale.builtin.buildertools`

```java
public final class BlockColorIndex
```

Maps block types to their particle colors in CIE Lab color space, enabling color-based block lookup. Used by the image import system to find the closest matching solid cube block for a given RGB color. The index is lazily initialized on first use, scanning all registered `BlockType` assets for solid cubes with particle colors.

## Initialization

The index builds on first access. It iterates all entries in `BlockType.getAssetMap()`, filtering to blocks where `getDrawType()` returns `DrawType.Cube` and `getOpacity()` returns `Opacity.Solid`. For each qualifying block, it extracts the particle color, converts it to CIE Lab color space, and stores a [BlockColorEntry](BlockColorIndex.BlockColorEntry.md) record. Entries are sorted by L* (lightness) after initialization.

## Public Methods

### findClosestBlock

```java
public int findClosestBlock(int r, int g, int b)
```

Returns the block ID of the solid cube block whose particle color is closest to the given RGB value, measured by squared Euclidean distance in CIE Lab space. Returns `-1` if the index is empty.

### findDarkerVariant

```java
public int findDarkerVariant(int blockId, float darkenAmount)
```

Finds a block whose color is a darker variant of the specified block's color. Darkening is applied by reducing the L* (lightness) channel by the given amount (0.0 to 1.0). Only considers blocks with L* values at or below the source block's lightness. Returns the original `blockId` if no entry exists for it.

### getBlockColor

```java
public int getBlockColor(int blockId)
```

Returns the packed RGB color (`r << 16 | g << 8 | b`) of the specified block. Returns `-1` if the block is not in the index.

### findBlockForLerpedColor

```java
public int findBlockForLerpedColor(int rA, int gA, int bA, int rB, int gB, int bB, float t)
```

Interpolates between two RGB colors in CIE Lab space by factor `t` (0.0 to 1.0), then finds the closest matching block for the interpolated color. Used for gradient effects in image import.

### isEmpty

```java
public boolean isEmpty()
```

Returns `true` if no solid cube blocks with particle colors were found during initialization.

## Color Space Conversion

Internally converts between RGB and CIE Lab color space using standard illuminant D65 reference white. The conversion goes through an intermediate XYZ color space. All distance calculations use squared Euclidean distance in Lab space, which provides better perceptual uniformity than RGB distance.

## Inner Types

- [BlockColorEntry](BlockColorIndex.BlockColorEntry.md) -- private record storing per-block color data

## Related Types

- [BuilderToolsPlugin](BuilderToolsPlugin.md) -- owns the singleton `BlockColorIndex` instance, accessible via `getBlockColorIndex()`
- `BlockType` -- source of block draw type, opacity, and particle color data
