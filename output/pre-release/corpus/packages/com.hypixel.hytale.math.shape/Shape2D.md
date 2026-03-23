# Shape2D

Type: interface | Package: com.hypixel.hytale.math.shape

public interface Shape2D

## Methods

- default Box2D getBox(@Nonnull Vector2d position)
- Box2D getBox(double var1, double var3)
- boolean containsPosition(Vector2d var1, Vector2d var2)
- boolean containsPosition(Vector2d var1, double var2, double var4)

Known implementors: Box2D

Also in this package: Box, Box2D, Cylinder, Ellipsoid, OriginShape, Quad2d, Quad4d, Rectangle, Shape, Triangle2d, Triangle4d, ViewUtil

Complete API:
  default Box2D getBox(Vector2d position)
  Box2D getBox(double var1, double var3)
  boolean containsPosition(Vector2d var1, Vector2d var2)
  boolean containsPosition(Vector2d var1, double var2, double var4)
