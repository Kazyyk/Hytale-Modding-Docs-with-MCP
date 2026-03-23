---
title: "com.hypixel.hytale.math.codec"
package: "com.hypixel.hytale.math.codec"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "math"
  - "codec"
  - "package-index"
---

**Package:** `com.hypixel.hytale.math.codec`

Contains 3 API surface type(s) and 2 internal type(s).

## Types

| Type | Kind | API Surface | Description |
|---|---|---|---|
| [FloatRangeArrayCodec](FloatRangeArrayCodec.md) | class | Yes | Codec that serializes a `FloatRange` as a two-element JSON/BSON array `[min, max]`. |
| [IntRangeArrayCodec](IntRangeArrayCodec.md) | class | No | Implementation of `Codec<IntRange>, ValidatableCodec<IntRange>`. |
| [Vector2dArrayCodec](Vector2dArrayCodec.md) | class | Yes | Deprecated codec that serializes a `Vector2d` as a two-element JSON/BSON array `[x, y]`. |
| [Vector3dArrayCodec](Vector3dArrayCodec.md) | class | Yes | Deprecated codec that serializes a `Vector3d` as a three-element JSON/BSON array `[x, y, z]`. |
| [Vector3iArrayCodec](Vector3iArrayCodec.md) | class | No | Implementation of `Codec<Vector3i>`. |
