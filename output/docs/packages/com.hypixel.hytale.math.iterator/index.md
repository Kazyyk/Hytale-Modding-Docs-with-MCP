---
title: "com.hypixel.hytale.math.iterator"
kind: "package"
package: "com.hypixel.hytale.math.iterator"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "math"
  - "iterator"
  - "spatial"
---

**Package:** `com.hypixel.hytale.math.iterator`

Spatial iteration utilities for traversing block positions in various geometric patterns. Provides raycast-based block walking (DDA algorithm), axis-aligned box iteration, circle/spiral patterns (Bresenham), and line rasterization. Used by world generation, builder tools, physics raycasting, and chunk loading systems.

## Types

| Type | Kind | Description |
|---|---|---|
| [BlockIterator](BlockIterator.md) | class | DDA raycast through voxel space with early termination. |
| [BoxBlockIterator](BoxBlockIterator.md) | class | Axis-aligned bounding box block iteration. |
| [CircleIterator](CircleIterator.md) | class | Bresenham circle perimeter iteration. |
| [CircleSpiralIterator](CircleSpiralIterator.md) | class | Concentric circle outward spiral iteration. |
| [LineIterator](LineIterator.md) | class | Bresenham 2D line rasterization. |
| [SpiralIterator](SpiralIterator.md) | class | Rectangular outward spiral iteration. |
