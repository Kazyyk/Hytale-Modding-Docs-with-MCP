---
title: "VoxelBufferView"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.views"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.views.VoxelBufferView"
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
public class VoxelBufferView<T> implements VoxelSpace<T>
```

Provides a `VoxelSpace<T>` view over 3D voxel buffers within a `BufferBundle.Access.View`. Maps voxel-grid positions to buffer-grid coordinates and delegates to the underlying `VoxelBuffer`. Supports copy-on-write bulk copying from another VoxelBufferView via `reference`. Used by stages to read/write material and environment data.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `Class<T>` | `voxelType` |
| `@Nonnull private final` | `BufferBundle.Access.View` | `bufferAccess` |
| `@Nonnull private final` | `Bounds3i` | `bounds_voxelGrid` |
| `@Nonnull private final` | `Vector3i` | `size_voxelGrid` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `VoxelBufferView(@Nonnull BufferBundle.Access.View bufferAccess, @Nonnull Class<T> voxelType)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `copyFrom(@Nonnull VoxelBufferView<T> source)` |
| `@Override public` | `void` | `set(T content, int x, int y, int z)` |
| `@Override public` | `void` | `set(T content, @Nonnull Vector3i position_voxelGrid)` |
| `@Override public` | `void` | `setAll(T content)` |
| `@Nullable @Override public` | `T` | `get(int x, int y, int z)` |
| `@Nullable @Override public` | `T` | `get(@Nonnull Vector3i position_voxelGrid)` |
| `@Override public` | `Bounds3i` | `getBounds()` |
| `@Nonnull private` | `VoxelBuffer<T>` | `getBuffer_fromVoxelGrid(int x_voxelGrid, int y_voxelGrid, int z_voxelGrid)` |
| `@Nonnull private` | `VoxelBuffer<T>` | `getBuffer_fromVoxelGrid(@Nonnull Vector3i position_voxelGrid)` |
| `@Nonnull private` | `VoxelBuffer<T>` | `getBuffer_fromBufferGrid(int x_bufferGrid, int y_bufferGrid, int z_bufferGrid)` |
| `@Nonnull private` | `VoxelBuffer<T>` | `getBuffer_fromBufferGrid(@Nonnull Vector3i position_bufferGrid)` |
