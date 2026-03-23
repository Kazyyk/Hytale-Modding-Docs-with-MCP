# PerlinNoise

Type: class | Package: com.hypixel.hytale.procedurallib.logic | Implements: com.hypixel.hytale.procedurallib.NoiseFunction

public class PerlinNoise implements NoiseFunction

Classic Perlin gradient noise with a configurable interpolation function (linear, Hermite, or quintic). Computes gradient dot products at integer lattice corners and bilinearly (2D) or trilinearly (3D) interpolates the result.

## Fields

- protected final GeneralNoise.InterpolationFunction interpolationFunction

## Constructor


public PerlinNoise(GeneralNoise.InterpolationFunction interpolationFunction)

## Methods

- public GeneralNoise.InterpolationFunction getInterpolationFunction()
- public double get(int seed, int offsetSeed, double x, double y)
- public double get(int seed, int offsetSeed, double x, double y, double z)

Also in this package: Bounds2d, BranchNoise, CellFunction, CellMode, CellNoise, CellularNoise, ConstantNoise, Distance2Function, Distance2Mode, DistanceNoise, Double2, Double3, DoubleArray, GeneralNoise, GridNoise, HexMeshNoise, InterpolationFunction, InterpolationMode, MeshNoise, OldSimplexNoise (and 6 more)

Complete API:
  public GeneralNoise.InterpolationFunction getInterpolationFunction()
  public double get(int seed, int offsetSeed, double x, double y)
  public double get(int seed, int offsetSeed, double x, double y, double z)
  public String toString()

Fields:
protected final GeneralNoise.InterpolationFunction interpolationFunction
