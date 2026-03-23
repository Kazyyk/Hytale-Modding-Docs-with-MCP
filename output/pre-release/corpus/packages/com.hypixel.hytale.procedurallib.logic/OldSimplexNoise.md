# OldSimplexNoise

Type: class | Package: com.hypixel.hytale.procedurallib.logic | Implements: com.hypixel.hytale.procedurallib.NoiseFunction

public class OldSimplexNoise implements NoiseFunction

OpenSimplex-style noise implementation supporting 2D and 3D evaluation. Uses custom gradient tables (8 gradients for 2D, 24 for 3D) and stretch/squish constants. The singleton `INSTANCE` field provides the shared instance. Output is normalized by dividing by 47.0 (2D) or 103.0 (3D).

## Constants

- public static final OldSimplexNoise INSTANCE

## Methods

- public double get(int seed, int offsetSeed, double x, double y)
- public double get(int seed, int offsetSeed, double x, double y, double z)

Also in this package: Bounds2d, BranchNoise, CellFunction, CellMode, CellNoise, CellularNoise, ConstantNoise, Distance2Function, Distance2Mode, DistanceNoise, Double2, Double3, DoubleArray, GeneralNoise, GridNoise, HexMeshNoise, InterpolationFunction, InterpolationMode, MeshNoise, PerlinNoise (and 6 more)

Complete API:
  public double get(int seed, int offsetSeed, double x, double y)
  public double get(int seed, int offsetSeed, double x, double y, double z)
  public String toString()
  private static double extrapolate(int seed, int x, int y, double xd, double yd)
  private static double extrapolate(int seed, int x, int y, int z, double xd, double yd, double zd)
  private static int fastFloor(double x)

Fields:
public static final OldSimplexNoise INSTANCE
private static final double STRETCH_CONSTANT_2D
private static final double SQUISH_CONSTANT_2D
private static final double STRETCH_CONSTANT_3D
private static final double SQUISH_CONSTANT_3D
private static final double NORM_CONSTANT_2D
private static final double NORM_CONSTANT_3D
private static DoubleArray.Double2[] gradients2D
private static DoubleArray.Double3[] gradients3D
