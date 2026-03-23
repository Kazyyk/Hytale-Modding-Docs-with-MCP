# VectorBoxUtil

Type: class | Package: com.hypixel.hytale.math.vector

public class VectorBoxUtil

Axis-aligned bounding box utilities: intersection tests, point containment, box expansion, ray-box intersection, overlap detection.

Also in this package: Location, Transform, Vector2d, Vector2i, Vector2l, Vector3d, Vector3f, Vector3i, Vector3l, Vector4d, VectorSphereUtil

Complete API:
  public static void forEachVector(Iterable<Vector3d> vectors, double originX, double originY, double originZ, double apothem, Consumer<Vector3d> consumer)
  public static void forEachVector(Iterable<Vector3d> vectors, double originX, double originY, double originZ, double apothemX, double apothemY, double apothemZ, Consumer<Vector3d> consumer)
  public static void forEachVector(Iterable<Vector3d> vectors, double originX, double originY, double originZ, double apothemXMin, double apothemYMin, double apothemZMin, double apothemXMax, double apothemYMax, double apothemZMax, Consumer<Vector3d> consumer)
  public static void forEachVector(Iterable<T> input, Function<T,Vector3d> func, double originX, double originY, double originZ, double apothem, Consumer<T> consumer)
  public static void forEachVector(Iterable<T> input, Function<T,Vector3d> func, double originX, double originY, double originZ, double apothemX, double apothemY, double apothemZ, Consumer<T> consumer)
  public static void forEachVector(Iterable<T> input, Function<T,Vector3d> func, double originX, double originY, double originZ, double apothemXMin, double apothemYMin, double apothemZMin, double apothemXMax, double apothemYMax, double apothemZMax, Consumer<T> consumer)
  public static void forEachVector(Iterable<T> input, Function<T,Vector3d> func, double originX, double originY, double originZ, double apothem, BiConsumer<T,V> consumer, V objV)
  public static void forEachVector(Iterable<T> input, Function<T,Vector3d> func, double originX, double originY, double originZ, double apothemX, double apothemY, double apothemZ, BiConsumer<T,V> consumer, V objV)
  public static void forEachVector(Iterable<T> input, Function<T,Vector3d> func, double originX, double originY, double originZ, double apothemXMin, double apothemYMin, double apothemZMin, double apothemXMax, double apothemYMax, double apothemZMax, BiConsumer<T,V> consumer, V objV)
  public static void forEachVector(Iterable<T> input, Function<T,Vector3d> func, double originX, double originY, double originZ, double apothem, TriConsumer<T,V1,V2> consumer, V1 objV1, V2 objV2)
  public static void forEachVector(Iterable<T> input, Function<T,Vector3d> func, double originX, double originY, double originZ, double apothemX, double apothemY, double apothemZ, TriConsumer<T,V1,V2> consumer, V1 objV1, V2 objV2)
  public static void forEachVector(Iterable<T> input, Function<T,Vector3d> func, double originX, double originY, double originZ, double apothemXMin, double apothemYMin, double apothemZMin, double apothemXMax, double apothemYMax, double apothemZMax, TriConsumer<T,V1,V2> consumer, V1 objV1, V2 objV2)
  public static void forEachVector(Int2ObjectMap<T> input, Function<T,Vector3d> func, double originX, double originY, double originZ, double apothem, IntObjectConsumer<T> consumer)
  public static void forEachVector(Int2ObjectMap<T> input, Function<T,Vector3d> func, double originX, double originY, double originZ, double apothemX, double apothemY, double apothemZ, IntObjectConsumer<T> consumer)
  public static void forEachVector(Int2ObjectMap<T> input, Function<T,Vector3d> func, double originX, double originY, double originZ, double apothemXMin, double apothemYMin, double apothemZMin, double apothemXMax, double apothemYMax, double apothemZMax, IntObjectConsumer<T> consumer)
  public static void forEachVector(Int2ObjectMap<T> input, Function<T,Vector3d> func, double originX, double originY, double originZ, double apothem, IntBiObjectConsumer<T,V> consumer, V objV)
  public static void forEachVector(Int2ObjectMap<T> input, Function<T,Vector3d> func, double originX, double originY, double originZ, double apothemX, double apothemY, double apothemZ, IntBiObjectConsumer<T,V> consumer, V objV)
  public static void forEachVector(Int2ObjectMap<T> input, Function<T,Vector3d> func, double originX, double originY, double originZ, double apothemXMin, double apothemYMin, double apothemZMin, double apothemXMax, double apothemYMax, double apothemZMax, IntBiObjectConsumer<T,V> consumer, V objV)
  public static void forEachVector(Int2ObjectMap<T> input, Function<T,Vector3d> func, double originX, double originY, double originZ, double apothem, IntTriObjectConsumer<T,V1,V2> consumer, V1 objV1, V2 objV2)
  public static void forEachVector(Int2ObjectMap<T> input, Function<T,Vector3d> func, double originX, double originY, double originZ, double apothemX, double apothemY, double apothemZ, IntTriObjectConsumer<T,V1,V2> consumer, V1 objV1, V2 objV2)
  public static void forEachVector(Int2ObjectMap<T> input, Function<T,Vector3d> func, double originX, double originY, double originZ, double apothemXMin, double apothemYMin, double apothemZMin, double apothemXMax, double apothemYMax, double apothemZMax, IntTriObjectConsumer<T,V1,V2> consumer, V1 objV1, V2 objV2)
  public static boolean isInside(double originX, double originY, double originZ, double apothem, Vector3d vector)
  public static boolean isInside(double originX, double originY, double originZ, double apothemX, double apothemY, double apothemZ, Vector3d vector)
  public static boolean isInside(double originX, double originY, double originZ, double xMin, double yMin, double zMin, double xMax, double yMax, double zMax, Vector3d vector)
