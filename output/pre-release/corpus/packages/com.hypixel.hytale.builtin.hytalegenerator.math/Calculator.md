# Calculator

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.math

public class Calculator

Utility class providing mathematical operations used throughout the world generator: clamping, distance calculations (2D and 3D), smooth min/max blending, integer floor/ceil to grid boundaries, value wrapping, and varargs min/max. Also provides `smoothMin` and `smoothMax` for polynomial smooth blending of two values within a specified range, using linear interpolation weights.

## Methods

- public static int toIntFloored(double d)
- public static boolean perfectDiv(int x, int divisor)
- public static double max(@Nonnull double... n)
- public static double min(@Nonnull double... n)
- public static int max(@Nonnull int... n)
- public static int min(@Nonnull int... n)
- public static int limit(int value, int floor, int ceil)
- public static double limit(double value, double floor, double ceil)
- public static double distance(double x1, double y1, double z1, double x2, double y2, double z2)
- public static double distance(@Nonnull Vector3d a, @Nonnull Vector3d b)
- public static double distance(double x1, double y1, double x2, double y2)
- public static boolean isDivisibleBy(int number, int divisor)
- public static double clamp(double wallA, double value, double wallB)
- public static int clamp(int wallA, int value, int wallB)
- public static int toNearestInt(double input)
- public static double smoothMin(double range, double a, double b)
- public static double smoothMax(double range, double a, double b)
- public static int wrap(int value, int max)
- public static int floor(int value, int gridSize)
- public static int ceil(int value, int gridSize)

Also in this package: InterpolatedCurve, Interpolation, NodeFunction, Normalizer

Complete API:
  public static int toIntFloored(double d)
  public static boolean perfectDiv(int x, int divisor)
  public static double max(double n)
  public static double min(double n)
  public static int max(int n)
  public static int min(int n)
  public static int limit(int value, int floor, int ceil)
  public static double limit(double value, double floor, double ceil)
  public static double distance(double x1, double y1, double z1, double x2, double y2, double z2)
  public static double distance(Vector3d a, Vector3d b)
  public static double distance(double x1, double y1, double x2, double y2)
  public static boolean isDivisibleBy(int number, int divisor)
  public static double clamp(double wallA, double value, double wallB)
  public static int clamp(int wallA, int value, int wallB)
  public static int toNearestInt(double input)
  public static double smoothMin(double range, double a, double b)
  public static double smoothMax(double range, double a, double b)
  public static int wrap(int value, int max)
  public static int floor(int value, int gridSize)
  public static int ceil(int value, int gridSize)
