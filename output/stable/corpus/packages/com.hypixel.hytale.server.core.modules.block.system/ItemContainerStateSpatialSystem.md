# ItemContainerStateSpatialSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.block.system | Extends: SpatialSystem

public class ItemContainerStateSpatialSystem extends SpatialSystem<ChunkStore>

Spatial system for efficient positional queries.

## Constants

- QUERY | Query<ChunkStore>

## Accessors

- getPosition(ArchetypeChunk<ChunkStore> archetypeChunk, int index) | Vector3d | Accessor method.
- getQuery() | Query<ChunkStore> | Accessor method.

## Methods

- tick(float dt, int systemIndex, Store<ChunkStore> store) | void | Instance method.

Complete API:
  public void tick(float dt, int systemIndex, Store<ChunkStore> store)
  public Vector3d getPosition(ArchetypeChunk<ChunkStore> archetypeChunk, int index)
  public Query<ChunkStore> getQuery()

Fields:
public static final Query<ChunkStore> QUERY
