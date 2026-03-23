# SpatialResource

Type: class | Package: com.hypixel.hytale.component.spatial | Extends: java.lang.Object | Implements: Resource<ECS_TYPE>

public class SpatialResource<T, ECS_TYPE> implements Resource<ECS_TYPE>

ECS resource that holds the `SpatialData` and `SpatialStructure` for a given store type. Provides thread-local reference lists for efficient query result collection. Registered as a per-store singleton resource and rebuilt each tick by `SpatialSystem`.

Also in this package: ClosestState, KDTree, MortonCode, Node, OrderedEntry, SpatialData, SpatialStructure, SpatialSystem

Complete API:
  public static ObjectList<Ref<ECS_TYPE>> getThreadLocalReferenceList()
  public SpatialData<Ref<ECS_TYPE>> getSpatialData()
  public SpatialStructure<T> getSpatialStructure()
  public Resource<ECS_TYPE> clone()

Fields:
private static final ThreadLocal<ObjectList<Ref<?>>> THREAD_LOCAL_REFERENCE_LIST
private final SpatialData<Ref<ECS_TYPE>> spatialData
private final SpatialStructure<T> spatialStructure
