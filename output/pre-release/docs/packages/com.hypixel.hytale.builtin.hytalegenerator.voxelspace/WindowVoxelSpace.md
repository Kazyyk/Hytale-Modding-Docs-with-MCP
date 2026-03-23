---
title: "WindowVoxelSpace"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.voxelspace"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.voxelspace.WindowVoxelSpace"
api_surface: false
extends: "java.lang.Object"
implements:
  - "VoxelSpace<T>"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:59Z"
tags:
  - "worldgen"
  - "voxel"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.voxelspace`

```java
public class WindowVoxelSpace<T> implements VoxelSpace<T>
```

A VoxelSpace wrapper that restricts reads and writes to a configurable sub-region (window) of a source space.
