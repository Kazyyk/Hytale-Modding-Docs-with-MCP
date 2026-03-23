# Cylinder

Type: class | Package: com.hypixel.hytale.math.shape | Implements: Shape

public class Cylinder implements Shape

A 3D shape implementation used for spatial calculations and collision detection.

## Fields

- public double height
- public double radiusX
- public double radiusZ

## Methods

- public double getRadiusX()
- public double getRadiusZ()
- public double getHeight()
- @Override public boolean containsPosition(double x, double y, double z)
- @Override public boolean forEachBlock(double x, double y, double z, double epsilon, @Nonnull TriIntPredicate consumer)
- @Override public <T> boolean forEachBlock(double x, double y, double z, double epsilon, T t, @Nonnull TriIntObjPredicate<T> consumer)
- @Override public void expand(double radius)
- @Override public Box getBox(double x, double y, double z)
- @Override public String toString()

Also in this package: Box, Box2D, Ellipsoid, OriginShape, Quad2d, Quad4d, Rectangle, Shape, Shape2D, Triangle2d, Triangle4d, ViewUtil

Complete API:
  public double getRadiusX()
  public double getRadiusZ()
  public double getHeight()
  public Cylinder assign(double radius)
  public boolean containsPosition(double x, double y, double z)
  public boolean forEachBlock(double x, double y, double z, double epsilon, TriIntPredicate consumer)
  public boolean forEachBlock(double x, double y, double z, double epsilon, T t, TriIntObjPredicate<T> consumer)
  public void expand(double radius)
  public Box getBox(double x, double y, double z)
  protected Cylinder clone()
  public String toString()

Fields:
public double height
public double radiusX
public double radiusZ
