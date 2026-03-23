# Triangle4d

Type: class | Package: com.hypixel.hytale.math.shape

public class Triangle4d

## Fields

- private Vector4d a
- private Vector4d b
- private Vector4d c

## Methods

- this(points, 0, 1, 2)
- this(points[a], points[b], points[c])
- public Vector4d getA()
- public Vector4d getB()
- public Vector4d getC()
- public double getMin(int component)
- public double getMax(int component)
- @Nonnull public Vector4d getRandom(@Nonnull Random random)
- @Nonnull public Vector4d getRandom(@Nonnull Random random, @Nonnull Vector4d vec)
- @Nonnull public Triangle2d to2d(@Nonnull Triangle2d target)
- @Override public String toString()

Also in this package: Box, Box2D, Cylinder, Ellipsoid, OriginShape, Quad2d, Quad4d, Rectangle, Shape, Shape2D, Triangle2d, ViewUtil

Complete API:
  public Vector4d getA()
  public Vector4d getB()
  public Vector4d getC()
  public double getMin(int component)
  public double getMax(int component)
  public Triangle4d assign(Vector4d v1, Vector4d v2, Vector4d v3)
  public Vector4d getRandom(Random random)
  public Vector4d getRandom(Random random, Vector4d vec)
  public Triangle4d multiply(Matrix4d matrix)
  public Triangle4d multiply(Matrix4d matrix, Triangle4d target)
  public Triangle2d to2d(Triangle2d target)
  public Triangle4d perspectiveTransform()
  public String toString()

Fields:
private Vector4d a
private Vector4d b
private Vector4d c
