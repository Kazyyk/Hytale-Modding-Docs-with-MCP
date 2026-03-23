# Simplex

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.fields.noise

class Simplex

## Methods

- private static int fastfloor(double x)
- private static double dot(@Nonnull Simplex.Grad g, double x, double y)
- private static double dot(@Nonnull Simplex.Grad g, double x, double y, double z)
- private static double dot(@Nonnull Simplex.Grad g, double x, double y, double z, double w)
- public static double noise(double xin, double yin)
- public static double noise(double xin, double yin, double zin)
- public static double noise(double x, double y, double z, double w)
- Grad(double x, double y, double z)
- Grad(double x, double y, double z, double w)

Also in this package: Builder, CellNoiseField, Grad, NoiseField, SimplexNoiseField

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
