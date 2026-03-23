---
title: "PointProvider"
kind: "interface"
package: "com.hypixel.hytale.builtin.hytalegenerator.fields.points"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.fields.points.PointProvider"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "fields"
  - "points"
  - "interface"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.fields.points`

```java
public interface PointProvider
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `List<Vector3i>` | `points3i(Vector3i var1, Vector3i var2)` |
| `` | `List<Vector2i>` | `points2i(Vector2i var1, Vector2i var2)` |
| `` | `List<Integer>` | `points1i(int var1, int var2)` |
| `` | `void` | `points3i(Vector3i var1, Vector3i var2, Consumer<Vector3i> var3)` |
| `` | `void` | `points2i(Vector2i var1, Vector2i var2, Consumer<Vector2i> var3)` |
| `` | `void` | `points1i(int var1, int var2, Consumer<Integer> var3)` |
| `` | `List<Vector3d>` | `points3d(Vector3d var1, Vector3d var2)` |
| `` | `List<Vector2d>` | `points2d(Vector2d var1, Vector2d var2)` |
| `` | `List<Double>` | `points1d(double var1, double var3)` |
| `` | `void` | `points3d(Vector3d var1, Vector3d var2, Consumer<Vector3d> var3)` |
| `` | `void` | `points2d(Vector2d var1, Vector2d var2, Consumer<Vector2d> var3)` |
| `` | `void` | `points1d(double var1, double var3, Consumer<Double> var5)` |
