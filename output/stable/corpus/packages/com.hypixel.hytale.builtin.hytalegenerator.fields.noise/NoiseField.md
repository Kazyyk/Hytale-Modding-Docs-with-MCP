# NoiseField

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.fields.noise

public abstract class NoiseField

Abstract base class in the `noise` package.

## Fields

- protected double scaleX
- protected double scaleY
- protected double scaleZ
- protected double scaleW

## Methods

- public abstract double valueAt(double var1, double var3, double var5, double var7)
- public abstract double valueAt(double var1, double var3, double var5)
- public abstract double valueAt(double var1, double var3)
- public abstract double valueAt(double var1)

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
