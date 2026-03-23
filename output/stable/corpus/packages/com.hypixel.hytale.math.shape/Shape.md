# Shape

Type: interface | Package: com.hypixel.hytale.math.shape

public interface Shape

## Methods

- default Box getBox(@Nonnull Vector3d position)
- Box getBox(double var1, double var3, double var5)
- default boolean containsPosition(@Nonnull Vector3d origin, @Nonnull Vector3d position)
- default boolean containsPosition(@Nonnull Vector3d position)
- boolean containsPosition(double var1, double var3, double var5)
- void expand(double var1)
- default boolean forEachBlock(@Nonnull Vector3d origin, TriIntPredicate consumer)
- default boolean forEachBlock(@Nonnull Vector3d origin, double epsilon, TriIntPredicate consumer)
- default boolean forEachBlock(double x, double y, double z, TriIntPredicate consumer)
- boolean forEachBlock(double var1, double var3, double var5, double var7, TriIntPredicate var9)
- default <T> boolean forEachBlock(@Nonnull Vector3d origin, T t, TriIntObjPredicate<T> consumer)
- default <T> boolean forEachBlock(@Nonnull Vector3d origin, double epsilon, T t, TriIntObjPredicate<T> consumer)
- default <T> boolean forEachBlock(double x, double y, double z, T t, TriIntObjPredicate<T> consumer)
- <T> boolean forEachBlock(double var1, double var3, double var5, double var7, T var9, TriIntObjPredicate<T> var10)

Known implementors: Box, Cylinder, Ellipsoid, OriginShape

Also in this package: Box, Box2D, Cylinder, Ellipsoid, OriginShape, Quad2d, Quad4d, Rectangle, Shape2D, Triangle2d, Triangle4d, ViewUtil

Complete API:
  default Box getBox(Vector3d position)
  Box getBox(double var1, double var3, double var5)
  default boolean containsPosition(Vector3d origin, Vector3d position)
  default boolean containsPosition(Vector3d position)
  boolean containsPosition(double var1, double var3, double var5)
  void expand(double var1)
  default boolean forEachBlock(Vector3d origin, TriIntPredicate consumer)
  default boolean forEachBlock(Vector3d origin, double epsilon, TriIntPredicate consumer)
  default boolean forEachBlock(double x, double y, double z, TriIntPredicate consumer)
  boolean forEachBlock(double var1, double var3, double var5, double var7, TriIntPredicate var9)
  default boolean forEachBlock(Vector3d origin, T t, TriIntObjPredicate<T> consumer)
  default boolean forEachBlock(Vector3d origin, double epsilon, T t, TriIntObjPredicate<T> consumer)
  default boolean forEachBlock(double x, double y, double z, T t, TriIntObjPredicate<T> consumer)
  boolean forEachBlock(double var1, double var3, double var5, double var7, T var9, TriIntObjPredicate<T> var10)
