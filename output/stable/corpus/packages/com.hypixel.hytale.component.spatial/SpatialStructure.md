# SpatialStructure

Type: interface | Package: com.hypixel.hytale.component.spatial

public interface SpatialStructure<T>

Interface for spatial index structures that support spatial queries over ECS entity data. Defines operations for rebuild, nearest-neighbor, sphere, cylinder, box, and distance-ordered queries. The primary implementation is `KDTree`.
