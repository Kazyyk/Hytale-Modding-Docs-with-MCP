# KDTree

Type: class | Package: com.hypixel.hytale.component.spatial | Extends: java.lang.Object | Implements: SpatialStructure<T>

public class KDTree<T> implements SpatialStructure<T>

A k-d tree implementation for 3D spatial queries on ECS entity data. Supports nearest-neighbor, sphere, cylinder, box, and ordered distance queries. Uses object pooling for nodes and data lists to minimize GC pressure during per-tick rebuilds. The tree is rebuilt from scratch each tick using Morton code-based spatial sorting for cache-friendly construction.
