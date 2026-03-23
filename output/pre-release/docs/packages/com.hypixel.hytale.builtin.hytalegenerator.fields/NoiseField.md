---
title: "NoiseField"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.fields.noise"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.fields.noise.NoiseField"
api_surface: false
extends: "java.lang.Object"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "worldgen"
  - "noise"
  - "procedural"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.fields.noise`

```java
public abstract class NoiseField
```

Abstract base class for noise evaluation fields used in world generation. Defines the `valueAt()` contract for sampling noise at 1D through 4D coordinates, and provides configurable per-axis scale factors. Subclasses divide input coordinates by the corresponding scale before evaluation, so larger scale values produce lower-frequency (smoother) noise.

## Fields

| Field | Type | Default | Description |
|---|---|---|---|
| `scaleX` | `double` | `1.0` | Scale divisor for the X axis. |
| `scaleY` | `double` | `1.0` | Scale divisor for the Y axis. |
| `scaleZ` | `double` | `1.0` | Scale divisor for the Z axis. |
| `scaleW` | `double` | `1.0` | Scale divisor for the W axis (4D noise). |

All fields have `protected` visibility.

## Abstract Methods

```java
public abstract double valueAt(double var1, double var3, double var5, double var7)
```

Evaluates the noise field at a 4D coordinate (x, y, z, w).

```java
public abstract double valueAt(double var1, double var3, double var5)
```

Evaluates the noise field at a 3D coordinate (x, y, z).

```java
public abstract double valueAt(double var1, double var3)
```

Evaluates the noise field at a 2D coordinate (x, y).

```java
public abstract double valueAt(double var1)
```

Evaluates the noise field at a 1D coordinate (x).

## Methods

```java
@Nonnull
public NoiseField setScale(double scaleX, double scaleY, double scaleZ, double scaleW)
```

Sets independent scale factors for each axis. Returns `this` for method chaining.

```java
@Nonnull
public NoiseField setScale(double scale)
```

Sets the same scale factor for all four axes. Returns `this` for method chaining.

## Known Subclasses

- [SimplexNoiseField](SimplexNoiseField.md) -- octave-based simplex noise with configurable fractal parameters
- [CellNoiseField](CellNoiseField.md) -- cellular/Voronoi noise backed by `FastNoiseLite`

## See Also

- [SimplexNoiseField](SimplexNoiseField.md)
- [CellNoiseField](CellNoiseField.md)
- `FastNoiseLite`
