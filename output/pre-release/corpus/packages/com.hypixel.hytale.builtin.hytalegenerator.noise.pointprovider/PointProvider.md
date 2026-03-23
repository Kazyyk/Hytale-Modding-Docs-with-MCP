# PointProvider

Type: interface | Package: com.hypixel.hytale.builtin.hytalegenerator.noise.pointprovider

public interface PointProvider

Defines the contract for generating discrete or continuous point sets within bounded regions. Provides list-returning and consumer-accepting overloads for 1D, 2D, and 3D integer and double point queries.

## Methods

- List<Vector3i> points3i(@Nonnull Vector3i var1, @Nonnull Vector3i var2)
- List<Vector2i> points2i(@Nonnull Vector2i var1, @Nonnull Vector2i var2)
- List<Integer> points1i(int var1, int var2)
- void points3i(@Nonnull Vector3i var1, @Nonnull Vector3i var2, @Nonnull Consumer<Vector3i> var3)
- void points2i(@Nonnull Vector2i var1, @Nonnull Vector2i var2, @Nonnull Consumer<Vector2i> var3)
- void points1i(int var1, int var2, @Nonnull Consumer<Integer> var3)
- List<Vector3d> points3d(@Nonnull Vector3d var1, @Nonnull Vector3d var2)
- List<Vector2d> points2d(@Nonnull Vector2d var1, @Nonnull Vector2d var2)
- List<Double> points1d(double var1, double var3)
- void points3d(@Nonnull Vector3d var1, @Nonnull Vector3d var2, @Nonnull Consumer<Vector3d> var3)
- void points2d(@Nonnull Vector2d var1, @Nonnull Vector2d var2, @Nonnull Consumer<Vector2d> var3)
- void points1d(double var1, double var3, @Nonnull Consumer<Double> var5)

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
