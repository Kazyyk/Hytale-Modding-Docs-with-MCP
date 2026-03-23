# PathSpatialSystem

Type: class | Package: com.hypixel.hytale.builtin.path | Extends: SpatialSystem<EntityStore>

public class PathSpatialSystem extends SpatialSystem<EntityStore>

ECS spatial system that indexes `PatrolPathMarkerEntity` positions into a KDTree for efficient nearest-path queries. Queries entities with both the path marker and transform components.

## Methods

- @Override public Query<EntityStore> getQuery()
- @Override public void tick(float dt, int systemIndex, @Nonnull Store<EntityStore> store)
- @Nonnull @Override public Vector3d getPosition(@Nonnull ArchetypeChunk<EntityStore> archetypeChunk, int index)
