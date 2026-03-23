---
title: "MaskVoxelSpace"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.voxelspace"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.voxelspace.MaskVoxelSpace"
api_surface: false
extends: "java.lang.Object"
implements:
  - "VoxelSpace<Material>"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:59Z"
tags:
  - "worldgen"
  - "voxel"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.voxelspace`

```java
public class MaskVoxelSpace implements VoxelSpace<Material>
```

A VoxelSpace wrapper that applies a `BlockMask` to all write operations, filtering which blocks can be placed or replaced.
