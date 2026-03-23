---
title: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers"
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers`

## Classes

| Type | Description |
|---|---|
| [Buffer](Buffer.md) | Abstract base class for all buffer types |
| [CountedPixelBuffer](CountedPixelBuffer.md) | PixelBuffer with unique-value tracking |
| [CountedPixelBuffer.CountedArrayContents](CountedPixelBuffer.CountedArrayContents.md) | Backing array and unique-values list |
| [EntityBuffer](EntityBuffer.md) | Buffer storing entity placement data |
| [PixelBuffer](PixelBuffer.md) | Abstract 2D pixel buffer (8x1x8) |
| [SimplePixelBuffer](SimplePixelBuffer.md) | PixelBuffer without unique-value tracking |
| [SimplePixelBuffer.ArrayContents](SimplePixelBuffer.ArrayContents.md) | Backing array storage |
| [VoxelBuffer](VoxelBuffer.md) | 3D voxel buffer (8x8x8) with copy-on-write |
| [VoxelBuffer.ArrayContents](VoxelBuffer.ArrayContents.md) | Backing array for 8x8x8 data |

## Enums

| Type | Description |
|---|---|
| [CountedPixelBuffer.State](CountedPixelBuffer.State.md) | Storage state: EMPTY, SINGLE_VALUE, ARRAY |
| [SimplePixelBuffer.State](SimplePixelBuffer.State.md) | Storage state: EMPTY, SINGLE_VALUE, ARRAY |
| [VoxelBuffer.State](VoxelBuffer.State.md) | Storage state: EMPTY, SINGLE_VALUE, ARRAY, REFERENCE |
