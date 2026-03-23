---
title: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle"
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle`

## Classes

| Type | Description |
|---|---|
| [BufferBundle](BufferBundle.md) | Container managing typed buffer grids for world generation |
| [BufferBundle.Access](BufferBundle.Access.md) | Bounded access into a grid's buffers |
| [BufferBundle.Access.View](BufferBundle.Access.View.md) | Read-only sub-view into an Access's buffer range |
| [BufferBundle.Grid](BufferBundle.Grid.md) | Spatial grid of tracked buffers with LRU eviction |
| [BufferBundle.Grid.TrackedBuffer](BufferBundle.Grid.TrackedBuffer.md) | Pairs a Buffer with its Tracker |
| [BufferBundle.MemoryReport](BufferBundle.MemoryReport.md) | Formatted memory usage report across all grids |
| [BufferBundle.MemoryReport.GridEntry](BufferBundle.MemoryReport.GridEntry.md) | Per-grid memory and count snapshot |
| [BufferBundle.Tracker](BufferBundle.Tracker.md) | Tracks generation stage index for cache validity |
