# SpatialStructure

Type: interface | Package: com.hypixel.hytale.component.spatial

public interface SpatialStructure<T>

Interface for spatial index structures that support spatial queries over ECS entity data. Defines operations for rebuild, nearest-neighbor, sphere, cylinder, box, and distance-ordered queries. The primary implementation is `KDTree`.

Known implementors: KDTree

Also in this package: ClosestState, KDTree, MortonCode, Node, OrderedEntry, SpatialData, SpatialResource, SpatialSystem

Complete API:
  int size()
  void rebuild(SpatialData<T> var1)
  T closest(Vector3d var1)
  void collect(Vector3d var1, double var2, List<T> var4)
  void collectCylinder(Vector3d var1, double var2, double var4, List<T> var6)
  void collectBox(Vector3d var1, Vector3d var2, List<T> var3)
  void ordered(Vector3d var1, double var2, List<T> var4)
  void ordered3DAxis(Vector3d var1, double var2, double var4, double var6, List<T> var8)
  String dump()
