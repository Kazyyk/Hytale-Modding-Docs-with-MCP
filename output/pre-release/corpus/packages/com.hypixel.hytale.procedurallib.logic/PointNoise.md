# PointNoise

Type: class | Package: com.hypixel.hytale.procedurallib.logic | Implements: com.hypixel.hytale.procedurallib.NoiseFunction

public class PointNoise implements NoiseFunction

Radial distance noise from a fixed point. Returns -1 within the inner radius, +1 beyond the outer radius, and linearly interpolates between them. Supports both 2D and 3D evaluation.

## Fields

- private final double x
- private final double y
- private final double z
- private final double innerRadius2
- private final double outerRadius2

## Constructor


public PointNoise(double x, double y, double z, double innerRadius, double outerRadius)

## Methods

- public double get(int seed, int seedOffset, double x, double y)
- public double get(int seed, int seedOffset, double x, double y, double z)

Also in this package: Bounds2d, BranchNoise, CellFunction, CellMode, CellNoise, CellularNoise, ConstantNoise, Distance2Function, Distance2Mode, DistanceNoise, Double2, Double3, DoubleArray, GeneralNoise, GridNoise, HexMeshNoise, InterpolationFunction, InterpolationMode, MeshNoise, OldSimplexNoise (and 6 more)

Complete API:
  public double get(int seed, int seedOffset, double x, double y)
  public double get(int seed, int seedOffset, double x, double y, double z)

Fields:
private final double x
private final double y
private final double z
private final double innerRadius2
private final double outerRadius2
private final transient double invRange2
