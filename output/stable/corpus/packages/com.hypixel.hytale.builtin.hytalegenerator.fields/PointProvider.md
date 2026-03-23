# PointProvider

Type: interface | Package: com.hypixel.hytale.builtin.hytalegenerator.fields.points

public interface PointProvider

Defines a contract for generating point sets in 1D, 2D, and 3D space, with both integer and double precision variants. Each dimensionality provides two overloads: one that returns a `List` and one that accepts a `Consumer` callback for streaming results without list allocation. Used by position providers in the world generation pipeline to produce candidate placement points.

## Methods

### 3D Integer Points


List<Vector3i> points3i(@Nonnull Vector3i var1, @Nonnull Vector3i var2)

Returns a list of 3D integer points within the axis-aligned bounding box defined by `var1` (min) and `var2` (max).


void points3i(@Nonnull Vector3i var1, @Nonnull Vector3i var2, @Nonnull Consumer<Vector3i> var3)

Streams 3D integer points within the bounding box to the given consumer.

### 2D Integer Points


List<Vector2i> points2i(@Nonnull Vector2i var1, @Nonnull Vector2i var2)

Returns a list of 2D integer points within the axis-aligned bounding rectangle defined by `var1` (min) and `var2` (max).


void points2i(@Nonnull Vector2i var1, @Nonnull Vector2i var2, @Nonnull Consumer<Vector2i> var3)

Streams 2D integer points within the bounding rectangle to the given consumer.

### 1D Integer Points


List<Integer> points1i(int var1, int var2)

Returns a list of integer points within the range `[var1, var2]`.


void points1i(int var1, int var2, @Nonnull Consumer<Integer> var3)

Streams integer points within the range to the given consumer.

### 3D Double Points


List<Vector3d> points3d(@Nonnull Vector3d var1, @Nonnull Vector3d var2)

Returns a list of 3D double-precision points within the axis-aligned bounding box defined by `var1` (min) and `var2` (max).


void points3d(@Nonnull Vector3d var1, @Nonnull Vector3d var2, @Nonnull Consumer<Vector3d> var3)

Streams 3D double-precision points within the bounding box to the given consumer.

### 2D Double Points


List<Vector2d> points2d(@Nonnull Vector2d var1, @Nonnull Vector2d var2)

Returns a list of 2D double-precision points within the axis-aligned bounding rectangle defined by `var1` (min) and `var2` (max).


void points2d(@Nonnull Vector2d var1, @Nonnull Vector2d var2, @Nonnull Consumer<Vector2d> var3)

Streams 2D double-precision points within the bounding rectangle to the given consumer.

### 1D Double Points


List<Double> points1d(double var1, double var3)

Returns a list of double-precision points within the range `[var1, var3]`.


void points1d(double var1, double var3, @Nonnull Consumer<Double> var5)

Streams double-precision points within the range to the given consumer.

## Known Implementations

- PointField -- abstract base class that implements the list-returning methods by delegating to consumer-accepting abstract methods
- JitterPointField -- concrete implementation using noise-based jitter

## See Also

- PointField
- JitterPointField

Known implementors: PointField

Also in this package: JitterPointField, PointField

Complete API:
  List<Vector3i> points3i(Vector3i var1, Vector3i var2)
  List<Vector2i> points2i(Vector2i var1, Vector2i var2)
  List<Integer> points1i(int var1, int var2)
  void points3i(Vector3i var1, Vector3i var2, Consumer<Vector3i> var3)
  void points2i(Vector2i var1, Vector2i var2, Consumer<Vector2i> var3)
  void points1i(int var1, int var2, Consumer<Integer> var3)
  List<Vector3d> points3d(Vector3d var1, Vector3d var2)
  List<Vector2d> points2d(Vector2d var1, Vector2d var2)
  List<Double> points1d(double var1, double var3)
  void points3d(Vector3d var1, Vector3d var2, Consumer<Vector3d> var3)
  void points2d(Vector2d var1, Vector2d var2, Consumer<Vector2d> var3)
  void points1d(double var1, double var3, Consumer<Double> var5)
