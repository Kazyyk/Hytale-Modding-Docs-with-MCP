# Simplex

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.noise

class Simplex

Package-private simplex noise implementation providing static 2D, 3D, and 4D noise functions. Uses a fixed permutation table and gradient vectors. Called by SimplexNoiseField for octave-layered sampling.

## Inner Types

- Simplex.Grad | class

## Fields

- private static final double F2
- private static final double G2
- private static final double F3
- private static final double G3
- private static final double F4
- private static final double G4
- @Nonnull private static final Simplex.Grad[] grad3
- @Nonnull private static final Simplex.Grad[] grad4
- @Nonnull private static final short[] p
- @Nonnull private static final short[] perm
- @Nonnull private static final short[] permMod12

## Methods

- public static double noise(double xin, double yin)
- public static double noise(double xin, double yin, double zin)
- public static double noise(double x, double y, double z, double w)

Also in this package: Builder, CellNoiseField, CellularDistanceFunction, CellularReturnType, DomainWarpType, FastNoiseLite, FractalType, Grad, NoiseField, NoiseType, RotationType3D, SimplexNoiseField, TransformType3D, Vector2, Vector3

Complete API:
  private static int fastfloor(double x)
  private static double dot(Simplex.Grad g, double x, double y)
  private static double dot(Simplex.Grad g, double x, double y, double z)
  private static double dot(Simplex.Grad g, double x, double y, double z, double w)
  public static double noise(double xin, double yin)
  public static double noise(double xin, double yin, double zin)
  public static double noise(double x, double y, double z, double w)

Fields:
private static final double F2
private static final double G2
private static final double F3
private static final double G3
private static final double F4
private static final double G4
private static final Simplex.Grad[] grad3
private static final Simplex.Grad[] grad4
private static final short[] p
private static final short[] perm
private static final short[] permMod12
