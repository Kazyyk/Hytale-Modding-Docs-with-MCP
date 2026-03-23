# Box2D

Type: class | Package: com.hypixel.hytale.math.shape | Implements: Shape2D

public class Box2D implements Shape2D

A 3D shape implementation used for spatial calculations and collision detection.

## Methods

- this()
- public double width()
- public double height()
- public boolean isIntersecting(@Nonnull Box2D other)
- @Override public boolean containsPosition(@Nonnull Vector2d origin, @Nonnull Vector2d position)
- @Override public boolean containsPosition(@Nonnull Vector2d origin, double xx, double yy)
- @Override public String toString()

Also in this package: Box, Cylinder, Ellipsoid, OriginShape, Quad2d, Quad4d, Rectangle, Shape, Shape2D, Triangle2d, Triangle4d, ViewUtil

Complete API:
  public Box2D setMinMax(Vector2d min, Vector2d max)
  public Box2D setMinMax(double[] min, double[] max)
  public Box2D setMinMax(float[] min, float[] max)
  public Box2D setEmpty()
  public Box2D setMinMax(double min, double max)
  public Box2D union(Box2D bb)
  public Box2D assign(Box2D other)
  public Box2D minkowskiSum(Box2D bb)
  public Box2D normalize()
  public Box2D offset(Vector2d pos)
  public Box2D sweep(Vector2d v)
  public Box2D extendToInt()
  public Box2D extend(double extentX, double extentY)
  public double width()
  public double height()
  public boolean isIntersecting(Box2D other)
  public Box2D getBox(double x, double y)
  public boolean containsPosition(Vector2d origin, Vector2d position)
  public boolean containsPosition(Vector2d origin, double xx, double yy)
  public String toString()

Fields:
public static final BuilderCodec<Box2D> CODEC
public final Vector2d min
public final Vector2d max
