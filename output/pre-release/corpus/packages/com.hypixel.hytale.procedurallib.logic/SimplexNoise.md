# SimplexNoise

Type: class | Package: com.hypixel.hytale.procedurallib.logic | Implements: com.hypixel.hytale.procedurallib.NoiseFunction

public class SimplexNoise implements NoiseFunction

Simplex gradient noise implementation (2D and 3D). Uses `GeneralNoise` hash and gradient functions. The singleton `INSTANCE` field provides the shared instance. Output is scaled by 50.0 (2D) or 32.0 (3D).

## Constants

- public static final SimplexNoise INSTANCE

## Methods

- public double get(int seed, int offsetSeed, double x, double y)
- public double get(int seed, int offsetSeed, double x, double y, double z)

Also in this package: Bounds2d, BranchNoise, CellFunction, CellMode, CellNoise, CellularNoise, ConstantNoise, Distance2Function, Distance2Mode, DistanceNoise, Double2, Double3, DoubleArray, GeneralNoise, GridNoise, HexMeshNoise, InterpolationFunction, InterpolationMode, MeshNoise, OldSimplexNoise (and 6 more)

Complete API:
  public double get(int seed, int offsetSeed, double x, double y)
  public double get(int seed, int offsetSeed, double x, double y, double z)
  public String toString()

Fields:
public static final SimplexNoise INSTANCE
private static final double F2
private static final double P1_F2
private static final double G2
private static final double F3
private static final double G3
private static final double G33
