# CellNoiseField

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.fields.noise | Extends: NoiseField

public class CellNoiseField extends NoiseField

Extends `NoiseField`.

## Fields

- private FastNoiseLite cellNoise
- private int seed
- private boolean doDomainWarp
- private double scaleX
- private double scaleY
- private double scaleZ

## Methods

- throw new IllegalArgumentException()
- @Override public double valueAt(double x, double y, double z, double w)
- @Override public double valueAt(double x, double y, double z)
- @Override public double valueAt(double x, double z)
- @Override public double valueAt(double x)

Also in this package: Builder, Grad, NoiseField, Simplex, SimplexNoiseField

Complete API:
  public double valueAt(double x, double y, double z, double w)
  public double valueAt(double x, double y, double z)
  public double valueAt(double x, double z)
  public double valueAt(double x)

Fields:
private FastNoiseLite cellNoise
private int seed
private boolean doDomainWarp
private double scaleX
private double scaleY
private double scaleZ
