# OriginShape

Type: class | Package: com.hypixel.hytale.math.shape | Extends: Shape> | Implements: Shape

public class OriginShape<S extends Shape> implements Shape

A 3D shape implementation used for spatial calculations and collision detection.

## Fields

- public S shape

## Methods

- public Vector3d getOrigin()
- public S getShape()
- @Override public Box getBox(double x, double y, double z)
- @Override public boolean containsPosition(double x, double y, double z)
- @Override public void expand(double radius)
- @Override public boolean forEachBlock(double x, double y, double z, double epsilon, TriIntPredicate consumer)
- @Override public <T> boolean forEachBlock(double x, double y, double z, double epsilon, T t, TriIntObjPredicate<T> consumer)
- @Override public String toString()

Also in this package: Box, Box2D, Cylinder, Ellipsoid, Quad2d, Quad4d, Rectangle, Shape, Shape2D, Triangle2d, Triangle4d, ViewUtil

Complete API:
  public Vector3d getOrigin()
  public S getShape()
  public Box getBox(double x, double y, double z)
  public boolean containsPosition(double x, double y, double z)
  public void expand(double radius)
  public boolean forEachBlock(double x, double y, double z, double epsilon, TriIntPredicate consumer)
  public boolean forEachBlock(double x, double y, double z, double epsilon, T t, TriIntObjPredicate<T> consumer)
  public String toString()

Fields:
public final Vector3d origin
public S shape
