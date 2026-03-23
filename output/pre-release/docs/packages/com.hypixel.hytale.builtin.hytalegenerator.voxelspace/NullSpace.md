---
title: "NullSpace"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.voxelspace"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.voxelspace.NullSpace"
api_surface: false
extends: "java.lang.Object"
implements:
  - "VoxelSpace<V>"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:59Z"
tags:
  - "worldgen"
  - "voxel"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.voxelspace`

```java
public class NullSpace<V> implements VoxelSpace<V>
```

A no-op VoxelSpace that discards all writes and returns null for all reads. Singleton accessed via `instance()`.
