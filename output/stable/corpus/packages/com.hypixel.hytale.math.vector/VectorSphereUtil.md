# VectorSphereUtil

Type: class | Package: com.hypixel.hytale.math.vector

public class VectorSphereUtil

Sphere geometry utilities: point-in-sphere tests, sphere-box intersection, random point generation on/in spheres.

Also in this package: Location, Transform, Vector2d, Vector2i, Vector2l, Vector3d, Vector3f, Vector3i, Vector3l, Vector4d, VectorBoxUtil

Complete API:
  public static void forEachVector(Iterable<Vector3d> vectors, double originX, double originY, double originZ, double radius, Consumer<Vector3d> consumer)
  public static void forEachVector(Iterable<Vector3d> vectors, double originX, double originY, double originZ, double radiusX, double radiusY, double radiusZ, Consumer<Vector3d> consumer)
  public static void forEachVector(Iterable<T> input, Function<T,Vector3d> func, double originX, double originY, double originZ, double radius, Consumer<T> consumer)
  public static void forEachVector(Iterable<T> input, Function<T,Vector3d> func, double originX, double originY, double originZ, double radiusX, double radiusY, double radiusZ, Consumer<T> consumer)
  public static void forEachVector(Iterable<T> input, Function<T,Vector3d> func, double originX, double originY, double originZ, double radius, BiConsumer<T,V> consumer, V objV)
  public static void forEachVector(Iterable<T> input, Function<T,Vector3d> func, double originX, double originY, double originZ, double radiusX, double radiusY, double radiusZ, BiConsumer<T,V> consumer, V objV)
  public static void forEachVector(Iterable<T> input, Function<T,Vector3d> func, double originX, double originY, double originZ, double radius, TriConsumer<T,V1,V2> consumer, V1 objV1, V2 objV2)
  public static void forEachVector(Iterable<T> input, Function<T,Vector3d> func, double originX, double originY, double originZ, double radiusX, double radiusY, double radiusZ, TriConsumer<T,V1,V2> consumer, V1 objV1, V2 objV2)
  public static void forEachVector(Int2ObjectMap<T> input, Function<T,Vector3d> func, double originX, double originY, double originZ, double radius, IntObjectConsumer<T> consumer)
  public static void forEachVector(Int2ObjectMap<T> input, Function<T,Vector3d> func, double originX, double originY, double originZ, double radiusX, double radiusY, double radiusZ, IntObjectConsumer<T> consumer)
  public static void forEachVector(Int2ObjectMap<T> input, Function<T,Vector3d> func, double originX, double originY, double originZ, double radius, IntBiObjectConsumer<T,V> consumer, V objV)
  public static void forEachVector(Int2ObjectMap<T> input, Function<T,Vector3d> func, double originX, double originY, double originZ, double radiusX, double radiusY, double radiusZ, IntBiObjectConsumer<T,V> consumer, V objV)
  public static void forEachVector(Int2ObjectMap<T> input, Function<T,Vector3d> func, double originX, double originY, double originZ, double radius, IntTriObjectConsumer<T,V1,V2> consumer, V1 objV1, V2 objV2)
  public static void forEachVector(Int2ObjectMap<T> input, Function<T,Vector3d> func, double originX, double originY, double originZ, double radiusX, double radiusY, double radiusZ, IntTriObjectConsumer<T,V1,V2> consumer, V1 objV1, V2 objV2)
  public static boolean isInside(double originX, double originY, double originZ, double radius, Vector3d vector)
  public static boolean isInside(double originX, double originY, double originZ, double radiusX, double radiusY, double radiusZ, Vector3d vector)
