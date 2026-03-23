# CoordinateRotator

Type: class | Package: com.hypixel.hytale.procedurallib.random | Implements: ICoordinateRandomizer

public class CoordinateRotator implements ICoordinateRandomizer

Implements `ICoordinateRandomizer` to provide CoordinateRotator functionality.

## Constants

- public static final CoordinateRotator NONE
- public static final int X0
- public static final int Y0
- public static final int Z0
- public static final int X1
- public static final int Y1
- public static final int Z1
- public static final int X2
- public static final int Y2
- public static final int Z2

## Fields

- protected final double pitch
- protected final double yaw
- @Nonnull protected final double[] matrix

## Methods

- public CoordinateRotator(double pitch, double yaw)
- public double rotateX(double x, double y)
- public double rotateY(double x, double y)
- public double rotateX(double x, double y, double z)
- public double rotateY(double x, double y, double z)
- public double rotateZ(double x, double y, double z)
- @Override public double randomDoubleX(int seed, double x, double y)
- @Override public double randomDoubleY(int seed, double x, double y)
- @Override public double randomDoubleX(int seed, double x, double y, double z)
- @Override public double randomDoubleY(int seed, double x, double y, double z)
- @Override public double randomDoubleZ(int seed, double x, double y, double z)
- @Nonnull @Override public String toString()
- public static double[] createRotationMatrix(double pitch, double yaw)
- private static double dot(double x1, double y1, double z1, double x2, double y2, double z2)
