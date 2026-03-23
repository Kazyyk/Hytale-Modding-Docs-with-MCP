---
title: "PointProvider"
kind: "interface"
package: "com.hypixel.hytale.builtin.hytalegenerator.noise.pointprovider"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.noise.pointprovider.PointProvider"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "noise"
  - "pointprovider"
  - "interface"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.noise.pointprovider`

```java
public interface PointProvider
```

Defines the contract for generating discrete or continuous point sets within bounded regions. Provides list-returning and consumer-accepting overloads for 1D, 2D, and 3D integer and double point queries.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| | `List<Vector3i>` | `points3i(@Nonnull Vector3i var1, @Nonnull Vector3i var2)` |
| | `List<Vector2i>` | `points2i(@Nonnull Vector2i var1, @Nonnull Vector2i var2)` |
| | `List<Integer>` | `points1i(int var1, int var2)` |
| | `void` | `points3i(@Nonnull Vector3i var1, @Nonnull Vector3i var2, @Nonnull Consumer<Vector3i> var3)` |
| | `void` | `points2i(@Nonnull Vector2i var1, @Nonnull Vector2i var2, @Nonnull Consumer<Vector2i> var3)` |
| | `void` | `points1i(int var1, int var2, @Nonnull Consumer<Integer> var3)` |
| | `List<Vector3d>` | `points3d(@Nonnull Vector3d var1, @Nonnull Vector3d var2)` |
| | `List<Vector2d>` | `points2d(@Nonnull Vector2d var1, @Nonnull Vector2d var2)` |
| | `List<Double>` | `points1d(double var1, double var3)` |
| | `void` | `points3d(@Nonnull Vector3d var1, @Nonnull Vector3d var2, @Nonnull Consumer<Vector3d> var3)` |
| | `void` | `points2d(@Nonnull Vector2d var1, @Nonnull Vector2d var2, @Nonnull Consumer<Vector2d> var3)` |
| | `void` | `points1d(double var1, double var3, @Nonnull Consumer<Double> var5)` |
