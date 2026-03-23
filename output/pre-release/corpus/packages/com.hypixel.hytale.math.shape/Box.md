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

Also in this package: Box2D, Cylinder, Ellipsoid, OriginShape, Quad2d, Quad4d, Rectangle, Shape, Shape2D, Triangle2d, Triangle4d, ViewUtil

Complete API:
  public static Box horizontallyCentered(double width, double height, double depth)
  public static Box cube(Vector3d min, double side)
  public static Box centeredCube(Vector3d center, double inradius)
  public Box setMinMax(Vector3d min, Vector3d max)
  public Box setMinMax(double[] min, double[] max)
  public Box setMinMax(float[] min, float[] max)
  public Box setEmpty()
  public Box setMinMax(double min, double max)
  public Box union(Box bb)
  public Box assign(Box other)
  public Box assign(double minX, double minY, double minZ, double maxX, double maxY, double maxZ)
  public Box minkowskiSum(Box bb)
  public Box scale(float scale)
  public Box normalize()
  public Box rotateX(float angleInRadians)
  public Box rotateY(float angleInRadians)
  public Box rotateZ(float angleInRadians)
  public Box offset(double x, double y, double z)
  public Box offset(Vector3d pos)
  public Box sweep(Vector3d v)
  public Box extend(double extentX, double extentY, double extentZ)
  public double width()
  public double height()
  public double depth()
  public double dimension(Axis axis)
  public double getThickness()
  public double getMaximumThickness()
  public double getVolume()
  public boolean hasVolume()
  public boolean isIntersecting(Box other)
  public boolean isUnitBox()
  public double middleX()
  public double middleY()
  public double middleZ()
  public Box clone()
  public Vector3d getMin()
  public Vector3d getMax()
  public Box getBox(double x, double y, double z)
  public boolean containsPosition(double x, double y, double z)
  public void expand(double radius)
  public boolean containsBlock(int x, int y, int z)
  public boolean containsBlock(Vector3i origin, int x, int y, int z)
  public boolean forEachBlock(double x, double y, double z, double epsilon, TriIntPredicate consumer)
  public boolean forEachBlock(double x, double y, double z, double epsilon, T t, TriIntObjPredicate<T> consumer)
  public double getMaximumExtent()
  public boolean intersectsLine(Vector3d start, Vector3d end)
  public String toString()

Fields:
public static final Codec<Box> CODEC
public static final Box UNIT
public static final Box ZERO
public final Vector3d min
public final Vector3d max
