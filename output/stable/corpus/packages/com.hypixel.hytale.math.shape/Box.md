# Box

Type: class | Package: com.hypixel.hytale.math.shape | Implements: Shape

public class Box implements Shape

A 3D shape implementation used for spatial calculations and collision detection.

## Constants

- public static final Box UNIT
- public static final Box ZERO

## Methods

- this()
- public static Box cube(@Nonnull Vector3d min, double side)
- public static Box centeredCube(@Nonnull Vector3d center, double inradius)
- public double width()
- public double height()
- public double depth()
- public double dimension(@Nonnull Axis axis)
- public double getThickness()
- public double getMaximumThickness()
- public double getVolume()
- public boolean hasVolume()
- public boolean isIntersecting(@Nonnull Box other)
- public boolean isUnitBox()
- public double middleX()
- public double middleY()
- public double middleZ()
- @Nonnull public Vector3d getMin()
- @Nonnull public Vector3d getMax()
- @Override public boolean containsPosition(double x, double y, double z)
- @Override public void expand(double radius)
- public boolean containsBlock(int x, int y, int z)
- public boolean containsBlock(@Nonnull Vector3i origin, int x, int y, int z)
- @Override public boolean forEachBlock(double x, double y, double z, double epsilon, @Nonnull TriIntPredicate consumer)
- @Override public <T> boolean forEachBlock(double x, double y, double z, double epsilon, T t, @Nonnull TriIntObjPredicate<T> consumer)
- public double getMaximumExtent()
- public boolean intersectsLine(@Nonnull Vector3d start, @Nonnull Vector3d end)
- @Override public String toString()
