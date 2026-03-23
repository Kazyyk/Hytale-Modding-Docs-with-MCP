# SpatialResource

Type: class | Package: com.hypixel.hytale.component.spatial | Extends: java.lang.Object | Implements: Resource<ECS_TYPE>

public class SpatialResource<T, ECS_TYPE> implements Resource<ECS_TYPE>

ECS resource that holds the `SpatialData` and `SpatialStructure` for a given store type. Provides thread-local reference lists for efficient query result collection. Registered as a per-store singleton resource and rebuilt each tick by `SpatialSystem`.
