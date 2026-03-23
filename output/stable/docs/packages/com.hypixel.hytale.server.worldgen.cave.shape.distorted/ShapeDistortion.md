---
title: "ShapeDistortion"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.cave.shape.distorted"
fqcn: "com.hypixel.hytale.server.worldgen.cave.shape.distorted.ShapeDistortion"
api_surface: false
extends: "null"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "cave"
  - "shape"
  - "distorted"
---

**Package:** `com.hypixel.hytale.server.worldgen.cave.shape.distorted`

```java
public class ShapeDistortion
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `NoiseProperty` | `DEFAULT_NOISE` |
| `public static final` | `ShapeDistortion` | `DEFAULT` |
| `private final` | `NoiseProperty` | `widthNoise` |
| `private final` | `NoiseProperty` | `floorNoise` |
| `private final` | `NoiseProperty` | `ceilingNoise` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ShapeDistortion(NoiseProperty widthNoise, NoiseProperty floorNoise, NoiseProperty ceilingNoise)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public double` | `getWidthFactor(int seed, double x, double z)` |
| `` | `public double` | `getFloorFactor(int seed, double x, double z)` |
| `` | `public double` | `getCeilingFactor(int seed, double x, double z)` |
| `` | `public static ShapeDistortion` | `of(@Nullable NoiseProperty widthNoise, @Nullable NoiseProperty floorNoise, @Nullable NoiseProperty ceilingNoise)` |
