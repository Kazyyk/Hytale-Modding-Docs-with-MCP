# RaycastAABB

Type: class | Package: com.hypixel.hytale.math.raycast

public class RaycastAABB

Static utility class for ray-AABB intersection tests. Provides overloaded `intersect` methods returning intersection distance and normal via functional consumer interfaces (`RaycastConsumer`, `RaycastConsumerPlus1`, `RaycastConsumerPlus2`, `RaycastConsumerPlus3`).

Also in this package: RaycastConsumer, RaycastConsumerPlus1, RaycastConsumerPlus2, RaycastConsumerPlus3

Complete API:
  public static double intersect(double minX, double minY, double minZ, double maxX, double maxY, double maxZ, double ox, double oy, double oz, double dx, double dy, double dz)
  public static void intersect(double minX, double minY, double minZ, double maxX, double maxY, double maxZ, double ox, double oy, double oz, double dx, double dy, double dz, RaycastAABB.RaycastConsumer consumer)
  public static void intersect(double minX, double minY, double minZ, double maxX, double maxY, double maxZ, double ox, double oy, double oz, double dx, double dy, double dz, RaycastAABB.RaycastConsumerPlus1<T> consumer, T obj1)
  public static void intersect(double minX, double minY, double minZ, double maxX, double maxY, double maxZ, double ox, double oy, double oz, double dx, double dy, double dz, RaycastAABB.RaycastConsumerPlus2<T,K> consumer, T obj1, K obj2)
  public static void intersect(double minX, double minY, double minZ, double maxX, double maxY, double maxZ, double ox, double oy, double oz, double dx, double dy, double dz, RaycastAABB.RaycastConsumerPlus3<T,K,L> consumer, T obj1, K obj2, L obj3)

Fields:
public static final double EPSILON
