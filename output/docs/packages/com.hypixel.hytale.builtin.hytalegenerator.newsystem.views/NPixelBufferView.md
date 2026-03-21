---
title: "NPixelBufferView"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.views"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.views.NPixelBufferView"
api_surface: false
extends: ~
implements: ["VoxelSpace<T>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "newsystem"
  - "views"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.newsystem.views`

```java
public class NPixelBufferView<T> implements VoxelSpace<T>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `int` | `Y_LEVEL_BUFFER_GRID` |
| `public static final` | `int` | `Y_LEVEL_VOXEL_GRID` |
| `@Nonnull private final` | `Class<T>` | `voxelType` |
| `@Nonnull private final` | `NBufferBundle.Access.View` | `bufferAccess` |
| `@Nonnull private final` | `Bounds3i` | `bounds_voxelGrid` |
| `@Nonnull private final` | `Vector3i` | `size_voxelGrid` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `NPixelBufferView(@Nonnull NBufferBundle.Access.View bufferAccess, @Nonnull Class<T> pixelType)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `set(T content, int x, int y, int z)` |
| `@Override public` | `boolean` | `set(T value, @Nonnull Vector3i position_voxelGrid)` |
| `@Override public` | `void` | `set(T content)` |
| `@Override public` | `void` | `setOrigin(int x, int y, int z)` |
| `@Nullable @Override public` | `T` | `getContent(int x, int y, int z)` |
| `@Nullable @Override public` | `T` | `getContent(@Nonnull Vector3i position_voxelGrid)` |
| `@Nonnull private` | `NPixelBuffer<T>` | `getBuffer(@Nonnull Vector3i position_voxelGrid)` |
| `@Override public` | `boolean` | `replace(T replacement, int x, int y, int z, @Nonnull Predicate<T> mask)` |
| `@Override public` | `void` | `pasteFrom(@Nonnull VoxelSpace<T> source)` |
| `@Override public` | `int` | `getOriginX()` |
| `@Override public` | `int` | `getOriginY()` |
| `@Override public` | `int` | `getOriginZ()` |
| `@Override public` | `String` | `getName()` |
| `@Override public` | `boolean` | `isInsideSpace(int x, int y, int z)` |
| `@Override public` | `boolean` | `isInsideSpace(@Nonnull Vector3i position)` |
| `@Override public` | `void` | `forEach(VoxelConsumer<? super T> action)` |
| `@Override public` | `int` | `minX()` |
| `@Override public` | `int` | `maxX()` |
| `@Override public` | `int` | `minY()` |
| `@Override public` | `int` | `maxY()` |
| `@Override public` | `int` | `minZ()` |
| `@Override public` | `int` | `maxZ()` |
| `@Override public` | `int` | `sizeX()` |
| `@Override public` | `int` | `sizeY()` |
| `@Override public` | `int` | `sizeZ()` |
