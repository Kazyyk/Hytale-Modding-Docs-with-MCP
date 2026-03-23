# SpatialSystem

Type: class | Package: com.hypixel.hytale.component.spatial | Extends: TickingSystem<ECS_TYPE> | Implements: QuerySystem<ECS_TYPE>

public abstract class SpatialSystem<ECS_TYPE> extends TickingSystem<ECS_TYPE> implements QuerySystem<ECS_TYPE>

Abstract ECS system that rebuilds a spatial index each tick. Iterates all entities in the store, extracts positions via the abstract `getPosition()` method, populates the `SpatialData`, and triggers `SpatialStructure.rebuild()`. Subclasses define which component provides the entity position.

Known subclasses: BeaconSpatialSystem, EntitySpatialSystem, ItemContainerBlockSpatialSystem, ItemSpatialSystem, LegacyBeaconSpatialSystem, NPCSpatialSystem, NetworkSendableSpatialSystem, PathSpatialSystem, PlayerSpatialSystem, SpawnMarkerSpatialSystem, TangiableEntitySpatialSystem

Also in this package: ClosestState, KDTree, MortonCode, Node, OrderedEntry, SpatialData, SpatialResource, SpatialStructure

Complete API:
  public void tick(float dt, int systemIndex, Store<ECS_TYPE> store)
  public abstract Vector3d getPosition(ArchetypeChunk<ECS_TYPE> var1, int var2)

Fields:
private final ResourceType<ECS_TYPE,SpatialResource<Ref<ECS_TYPE>,ECS_TYPE>> resourceType
