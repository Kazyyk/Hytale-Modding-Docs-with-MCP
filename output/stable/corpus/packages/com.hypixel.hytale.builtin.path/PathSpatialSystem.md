# PathSpatialSystem

Type: class | Package: com.hypixel.hytale.builtin.path | Extends: SpatialSystem<EntityStore>

public class PathSpatialSystem extends SpatialSystem<EntityStore>

ECS spatial system that indexes `PatrolPathMarkerEntity` positions into a KDTree for efficient nearest-path queries. Queries entities with both the path marker and transform components.

## Methods

- @Override public Query<EntityStore> getQuery()
- @Override public void tick(float dt, int systemIndex, @Nonnull Store<EntityStore> store)
- @Nonnull @Override public Vector3d getPosition(@Nonnull ArchetypeChunk<EntityStore> archetypeChunk, int index)

Also in this package: AddOrRemove, AddedFromWorldGen, NameplateHolderSystem, NameplateRefChangeSystem, PathPlugin, PathSet, PrefabPasteEventSystem, PrefabPathCollection, PrefabPathSystems, PrefabPlaceEntityEventSystem, WorldGenChangeSystem, WorldPathBuilder, WorldPathData

Complete API:
  public Query<EntityStore> getQuery()
  public void tick(float dt, int systemIndex, Store<EntityStore> store)
  public Vector3d getPosition(ArchetypeChunk<EntityStore> archetypeChunk, int index)

Fields:
private static final Archetype<EntityStore> QUERY
