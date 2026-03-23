# SpatialData

Type: class | Package: com.hypixel.hytale.component.spatial | Extends: java.lang.Object

public class SpatialData<T>

Growable parallel-array storage for spatial entity data. Maintains aligned arrays of positions (`Vector3d`), data references, sort indices, and Morton codes. Supports both standard axis-based sorting and Morton code-based sorting for cache-friendly spatial queries. Used as the input for `SpatialStructure.rebuild()`.
