# NoiseField

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.fields.noise | Extends: java.lang.Object

public abstract class NoiseField

Abstract base class for noise evaluation fields used in world generation. Defines the `valueAt()` contract for sampling noise at 1D through 4D coordinates, and provides configurable per-axis scale factors. Subclasses divide input coordinates by the corresponding scale before evaluation, so larger scale values produce lower-frequency (smoother) noise.

## Fields

- scaleX | double | 1.0 | Scale divisor for the X axis.
- scaleY | double | 1.0 | Scale divisor for the Y axis.
- scaleZ | double | 1.0 | Scale divisor for the Z axis.
- scaleW | double | 1.0 | Scale divisor for the W axis (4D noise).

All fields have `protected` visibility.

## Abstract Methods


public abstract double valueAt(double var1, double var3, double var5, double var7)

Evaluates the noise field at a 4D coordinate (x, y, z, w).


public abstract double valueAt(double var1, double var3, double var5)

Evaluates the noise field at a 3D coordinate (x, y, z).


public abstract double valueAt(double var1, double var3)

Evaluates the noise field at a 2D coordinate (x, y).


public abstract double valueAt(double var1)

Evaluates the noise field at a 1D coordinate (x).

## Methods


@Nonnull
public NoiseField setScale(double scaleX, double scaleY, double scaleZ, double scaleW)

Sets independent scale factors for each axis. Returns `this` for method chaining.


@Nonnull
public NoiseField setScale(double scale)

Sets the same scale factor for all four axes. Returns `this` for method chaining.

## Known Subclasses

- SimplexNoiseField -- octave-based simplex noise with configurable fractal parameters
- CellNoiseField -- cellular/Voronoi noise backed by `FastNoiseLite`

## See Also

- SimplexNoiseField
- CellNoiseField
- FastNoiseLite

Known subclasses: CellNoiseField, SimplexNoiseField

Also in this package: Builder, CellNoiseField, Grad, Simplex, SimplexNoiseField

Complete API:
  public abstract double valueAt(double var1, double var3, double var5, double var7)
  public abstract double valueAt(double var1, double var3, double var5)
  public abstract double valueAt(double var1, double var3)
  public abstract double valueAt(double var1)
  public NoiseField setScale(double scaleX, double scaleY, double scaleZ, double scaleW)
  public NoiseField setScale(double scale)

Fields:
protected double scaleX
protected double scaleY
protected double scaleZ
protected double scaleW
