# GeneralNoise

Type: class | Package: com.hypixel.hytale.procedurallib.logic

public final class GeneralNoise

Shared utility class for noise functions. Provides hash primes, gradient tables, fast floor/ceil, linear interpolation, 2D/3D hashing, gradient coordinate evaluation, value clamping, and the `InterpolationFunction` interface with `InterpolationMode` enum (LINEAR, HERMITE, QUINTIC). This class cannot be instantiated.

## Constants

- public static final int X_PRIME
- public static final int Y_PRIME
- public static final int Z_PRIME

## Static Methods

- public static int fastFloor(double f)
- public static int fastCeil(double f)
- public static double lerp(double a, double b, double t)
- public static int hash2D(int seed, int x, int y)
- public static int hash3D(int seed, int x, int y, int z)
- public static double gradCoord2D(int seed, int x, int y, double xd, double yd)
- public static double gradCoord3D(int seed, int x, int y, int z, double xd, double yd, double zd)
- public static double limit(double val)

## Inner Types

### InterpolationFunction (interface)


@FunctionalInterface
public interface InterpolationFunction

- double interpolate(double var1)

### InterpolationMode (enum)


public static enum InterpolationMode

- LINEAR | Identity function: `t`.
- HERMITE | Hermite smoothstep: `t*t*(3 - 2*t)`.
- QUINTIC | Quintic smoothstep: `t*t*t*(t*(t*6 - 15) + 10)`.

- public final GeneralNoise.InterpolationFunction function

- GeneralNoise.InterpolationFunction getFunction()

Also in this package: Bounds2d, BranchNoise, CellFunction, CellMode, CellNoise, CellularNoise, ConstantNoise, Distance2Function, Distance2Mode, DistanceNoise, Double2, Double3, DoubleArray, GridNoise, HexMeshNoise, InterpolationFunction, InterpolationMode, MeshNoise, OldSimplexNoise, PerlinNoise (and 6 more)

Complete API:
  public static int fastFloor(double f)
  public static int fastCeil(double f)
  public static double lerp(double a, double b, double t)
  public static int hash2D(int seed, int x, int y)
  public static int hash3D(int seed, int x, int y, int z)
  public static double gradCoord2D(int seed, int x, int y, double xd, double yd)
  public static double gradCoord3D(int seed, int x, int y, int z, double xd, double yd, double zd)
  public static double limit(double val)

Fields:
public static final int X_PRIME
public static final int Y_PRIME
public static final int Z_PRIME
private static final DoubleArray.Double2[] GRAD_2D
private static final DoubleArray.Double3[] GRAD_3D
