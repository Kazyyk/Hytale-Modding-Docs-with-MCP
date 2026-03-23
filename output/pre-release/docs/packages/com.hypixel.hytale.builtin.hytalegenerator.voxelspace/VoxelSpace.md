---
title: "VoxelSpace"
kind: "interface"
package: "com.hypixel.hytale.builtin.hytalegenerator.voxelspace"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.voxelspace.VoxelSpace"
api_surface: false
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:59Z"
tags:
  - "worldgen"
  - "voxel"
  - "interface"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.voxelspace`

```java
public interface VoxelSpace<T>
```

Generic interface for 3D voxel grids. Provides get/set operations by coordinate or vector, bulk fill, and bounds access.

## Methods

```java
void set(@Nullable T var1, int var2, int var3, int var4)
```

```java
void set(@Nullable T var1, @Nonnull Vector3i var2)
```

```java
void setAll(@Nullable T var1)
```

```java
@Nullable
    T get(int var1, int var2, int var3)
```

```java
@Nullable
    T get(@Nonnull Vector3i var1)
```

```java
@Nonnull
    Bounds3i getBounds()
```
