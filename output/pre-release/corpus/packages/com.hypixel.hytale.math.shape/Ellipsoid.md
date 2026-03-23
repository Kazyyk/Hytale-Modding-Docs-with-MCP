# Ellipsoid

Type: class | Package: com.hypixel.hytale.math.shape | Implements: Shape

public class Ellipsoid implements Shape

A 3D shape implementation used for spatial calculations and collision detection.

## Fields

- public double radiusX
- public double radiusY
- public double radiusZ

## Methods

- this(radius, radius, radius)
- @Override public Box getBox(double x, double y, double z)
- @Override public boolean containsPosition(double x, double y, double z)
- @Override public void expand(double radius)
- @Override public boolean forEachBlock(double x, double y, double z, double epsilon, @Nonnull TriIntPredicate consumer)
- @Override public <T> boolean forEachBlock(double x, double y, double z, double epsilon, T t, @Nonnull TriIntObjPredicate<T> consumer)
- @Override public String toString()

Also in this package: Box, Box2D, Cylinder, OriginShape, Quad2d, Quad4d, Rectangle, Shape, Shape2D, Triangle2d, Triangle4d, ViewUtil

Complete API:
  public Ellipsoid assign(double radius)
  public Box getBox(double x, double y, double z)
  public boolean containsPosition(double x, double y, double z)
  public void expand(double radius)
  public boolean forEachBlock(double x, double y, double z, double epsilon, TriIntPredicate consumer)
  public boolean forEachBlock(double x, double y, double z, double epsilon, T t, TriIntObjPredicate<T> consumer)
  public String toString()

Fields:
public double radiusX
public double radiusY
public double radiusZ
