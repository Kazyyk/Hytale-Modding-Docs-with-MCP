---
title: "VoxelSpaceUtil"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.datastructures.voxelspace"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.datastructures.voxelspace.VoxelSpaceUtil"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "datastructures"
  - "voxelspace"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.datastructures.voxelspace`

```java
public class VoxelSpaceUtil
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `VoxelSpace<T>` | `source` |
| `private final` | `VoxelSpace<T>` | `destination` |
| `private final` | `int` | `minX` |
| `private final` | `int` | `minY` |
| `private final` | `int` | `minZ` |
| `private final` | `int` | `maxX` |
| `private final` | `int` | `maxY` |
| `private final` | `int` | `maxZ` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static <V>` | `void` | `parallelCopy(@Nonnull VoxelSpace<V> source, @Nonnull VoxelSpace<V> destination, int concurrency)` |
| `@Override public` | `void` | `run()` |

## Inner Types

- `VoxelSpaceUtil.BatchTransfer`
