---
title: "PixelBufferView"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.views"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.views.PixelBufferView"
api_surface: false
extends: null
implements: ["VoxelSpace<T>"]
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "engine"
  - "views"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.engine.views`

```java
public class PixelBufferView<T> implements VoxelSpace<T>
```

Provides a `VoxelSpace<T>` view over 2D pixel buffers within a `BufferBundle.Access.View`. Maps voxel-grid positions to buffer-grid coordinates and delegates to the underlying `PixelBuffer`. The Y dimension is constrained to a single layer (y=0). Used by stages to read/write biome, tint, and biome-distance data.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `int` | `Y_LEVEL_BUFFER_GRID` |
| `public static final` | `int` | `Y_LEVEL_VOXEL_GRID` |
| `@Nonnull private final` | `Class<T>` | `voxelType` |
| `@Nonnull private final` | `BufferBundle.Access.View` | `bufferAccess` |
| `@Nonnull private final` | `Bounds3i` | `bounds_voxelGrid` |
| `@Nonnull private final` | `Vector3i` | `size_voxelGrid` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `PixelBufferView(@Nonnull BufferBundle.Access.View bufferAccess, @Nonnull Class<T> pixelType)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `set(T content, int x, int y, int z)` |
| `@Override public` | `void` | `set(T value, @Nonnull Vector3i position_voxelGrid)` |
| `@Override public` | `void` | `setAll(T content)` |
| `@Nullable @Override public` | `T` | `get(int x, int y, int z)` |
| `@Nullable @Override public` | `T` | `get(@Nonnull Vector3i position_voxelGrid)` |
| `@Nonnull private` | `PixelBuffer<T>` | `getBuffer(@Nonnull Vector3i position_voxelGrid)` |
| `@Override public` | `Bounds3i` | `getBounds()` |
